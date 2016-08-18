/**
* <p>
* @className:App.java
* @classDescription:
* <p>
* @createTime：2016年8月18日
* @author：Qingyuan
*/

package cn.qingyuan.server.onion;

import java.io.IOException;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * <p>
 * 
 * @className:App.java
 * @classDescription:
 *                    <p>
 * @createTime:2016年8月18日
 * @author:Qingyuan
 */

public class App {

	private static Logger logger = LoggerFactory.getLogger(App.class);

	// 默认端口
	private static final int DEFAULT_PORT = 8080;
	// Context路径
	private static final String CONTEXT_PATH = "/";
	// Mapping路径
	private static final String MAPPING_URL = "/*";
	// 应用配置路径
	private static final String CONFIG_PATH = "classpath:webapp/WEB-INF/application-context.xml";
	// 执行环境
	private static final String DEFAULT_PROFILE = "dev";

	/**
	 * <p>
	 * 功能描述：
	 * </p>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			new App().start(getPortFromArgs(args));
		} catch (Exception e) {
			logger.error("系统退出", e);
			System.exit(-1);
		}
	}

	private static int getPortFromArgs(String[] args) {
		if (args.length > 0) {
			try {
				return Integer.valueOf(args[0]);
			} catch (NumberFormatException ignore) {
			}
		}
		logger.debug("No server port configured, falling back to {}", DEFAULT_PORT);
		return DEFAULT_PORT;
	}

	private void start(int port) throws Exception {
		logger.debug("Starting server at port {}", port);
		Server server = new Server(port);
		server.setHandler(getServletContextHandler(getContext()));
		server.start();
		logger.info("Server started at port {}", port);
		server.join();
	}

	private static ServletContextHandler getServletContextHandler(WebApplicationContext context) throws IOException {
		ServletContextHandler contextHandler = new ServletContextHandler();
		contextHandler.setErrorHandler(null);
		contextHandler.setContextPath(CONTEXT_PATH);
		contextHandler.addServlet(new ServletHolder(new DispatcherServlet(context)), MAPPING_URL);
		contextHandler.addEventListener(new ContextLoaderListener(context));
		contextHandler.setResourceBase(new ClassPathResource("webapp").getURI().toString());
		return contextHandler;
	}

	private static WebApplicationContext getContext() {
		XmlWebApplicationContext context = new XmlWebApplicationContext();
		context.setConfigLocations(CONFIG_PATH);
		context.getEnvironment().setDefaultProfiles(DEFAULT_PROFILE);
		return context;
	}
}
