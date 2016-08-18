/**
* <p>
* @className:WebMVCConfig.java
* @classDescription:
* <p>
* @createTime：2016年8月17日
* @author：Qingyuan
*/

package cn.qingyuan.server.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
* <p>
* @className:WebMVCConfig.java
* @classDescription:
* <p>
* @createTime:2016年8月17日
* @author:Qingyuan
*/

@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("images/**").addResourceLocations("images/");
    }
}
