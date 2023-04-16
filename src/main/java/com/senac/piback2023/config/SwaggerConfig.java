package com.senac.piback2023.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket cuidaiApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.senac.piback2023"))
                .paths(regex("/api.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Cuidai REST API",
                "REST API for Cuidai Web Application developed on SENAC",
                "1.0.0",
                "Terms of Service",
                new Contact("Squad 01 - Cuidai", "https://github.com/Liferay-Porto-Digital", ""),
                "Apache License Version 2.0",
                "https://github.com/Liferay-Porto-Digital/liferay-pd-backend/blob/main/LICENSE",
                new ArrayList<VendorExtension>()
        );

        return apiInfo;
    }
}
