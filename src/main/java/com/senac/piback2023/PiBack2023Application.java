package com.senac.piback2023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

@EnableSwagger2
@EnableSwagger2WebFlux
@SpringBootApplication
public class PiBack2023Application {

    public static void main(String[] args) {
        SpringApplication.run(PiBack2023Application.class, args);
    }

}
