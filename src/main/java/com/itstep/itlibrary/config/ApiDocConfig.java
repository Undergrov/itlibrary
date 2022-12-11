package com.itstep.itlibrary.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiDocConfig {
    private Info apiInfo() {
        return new Info ( ).title ( "IT Library API" )
                .description ( "API for tutorial project" )
                .version ( "0.1.0" )
                .contact ( new Contact ( ).name ( "Andrii Byhar" ).email ( "example@gmail.com" ) );
    }
    @Bean
    public OpenAPI openApiConfig(){
        return  new OpenAPI (  ).info ( apiInfo () );
    }

}
