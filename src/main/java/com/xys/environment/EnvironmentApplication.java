package com.xys.environment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author xys
 */
@SpringBootApplication
@RefreshScope
public class EnvironmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnvironmentApplication.class, args);
    }

}
