package com.example.theatercoursework.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {
    @Bean
    public OpenAPI customerOpenAPI(){
        return new OpenAPI().info(
                new Info()
                        .title("Theater")
                        .version("1.0")
                        .contact(new Contact()
                                         .email("artem.lyohin@gmail.com")
                                         .name("Lyohin Artem")
                                ));
    }
}
