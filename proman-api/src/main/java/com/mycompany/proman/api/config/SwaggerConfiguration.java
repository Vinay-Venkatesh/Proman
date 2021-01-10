package com.mycompany.proman.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*
    Used to generate UI from reading the path from swagger document.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean // This annotation will be present under @Configuration..
    public Docket swagger(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mycompany.proman.api.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}
