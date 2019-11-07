package com.anthem.member.ngmemberboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket( DocumentationType.SWAGGER_2 )
                .select()
                .apis( RequestHandlerSelectors.basePackage( "com.anthem.member.ngmemberboot.controller" ) )
                .paths( PathSelectors.any() )
                .build()
                .apiInfo( apiInfo() );
    }

    private ApiInfo apiInfo() {
        return new ApiInfo( "EET API",
                "API to retrieve data from EET database",
                "1.0",
                "Terms of service",
                new Contact("Anthem", "Enter the Anthem URL", "basil.kiwanuka@anthem.com"),
                "Anthem Version 1.0",
                "https://anthem.com/license",
                Collections.emptyList());
    }
}
