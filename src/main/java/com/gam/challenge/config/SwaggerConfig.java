package com.gam.challenge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
@ComponentScan("com.gam.challenge.controller")
public class SwaggerConfig {

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Sorting App API",
                "This is a simple App for sorting a string list.",
                "API 1.0",
                null,
                new Contact("Mostafa Jamshid", "https://www.linkedin.com/in/mostafa-jamshid", "mostafa.jamshid@gmail.com"),
                null,
                null,
                Collections.emptyList());
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

}
