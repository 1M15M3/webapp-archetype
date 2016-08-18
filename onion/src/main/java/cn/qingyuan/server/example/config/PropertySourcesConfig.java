/**
* <p>
* @className:PropertySourcesConfig.java
* @classDescription:
* <p>
* @createTime：2016年8月17日
* @author：Qingyuan
*/

package cn.qingyuan.server.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
* <p>
* @className:PropertySourcesConfig.java
* @classDescription:
* <p>
* @createTime:2016年8月17日
* @author:Qingyuan
*/

@Configuration
public class PropertySourcesConfig {

    private static final Resource[] DEV_PROPERTIES = new ClassPathResource[]{
            new ClassPathResource("example-dev.properties"),
    };
    private static final Resource[] TEST_PROPERTIES = new ClassPathResource[]{
            new ClassPathResource("example-test.properties"),
    };
    private static final Resource[] PROD_PROPERTIES = new ClassPathResource[]{
            new ClassPathResource("example-prod.properties"),
    };

    @Profile("dev")
    public static class DevConfig {
        @Bean
        public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
            PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
            pspc.setLocations(DEV_PROPERTIES);
            return pspc;
        }
    }

    @Profile("test")
    public static class TestConfig {
        @Bean
        public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
            PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
            pspc.setLocations(TEST_PROPERTIES);
            return pspc;
        }
    }

    @Profile("prod")
    public static class ProdConfig {
        @Bean
        public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
            PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
            pspc.setLocations(PROD_PROPERTIES);
            return pspc;
        }
    }
}
