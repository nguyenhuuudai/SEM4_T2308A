package org.fai.study.demo_jwt;

import org.fai.study.demo_jwt.configurations.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class DemoJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoJwtApplication.class, args);
    }

}
