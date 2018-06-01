package cn.hbfyt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class App implements EmbeddedServletContainerCustomizer {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8080);
    }
}
