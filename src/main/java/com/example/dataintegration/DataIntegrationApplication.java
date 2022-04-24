package com.example.dataintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication

public class DataIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(DataIntegrationApplication.class);
        springApplication.run(args);
        //SpringApplication.run(DataIntegrationApplication.class, args);
    }

}
