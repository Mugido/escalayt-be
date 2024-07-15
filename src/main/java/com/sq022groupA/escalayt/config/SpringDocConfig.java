package com.sq022groupA.escalayt.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI createOpenAPIConfig(){
       return new OpenAPI()
               .info(new Info().title("Escalayt Facility Management API")
                       .version("1.0")
                       .description("API documentation for Escalayt Facility Management Platform"))
               .components(new Components()
                       .addSecuritySchemes("bearer-jwt", new SecurityScheme()
                               .type(SecurityScheme.Type.HTTP)
                               .scheme("bearer")
                               .bearerFormat("JWT")
                               .in(SecurityScheme.In.HEADER)
                               .name("Authorization")
                       )
               )
               .addSecurityItem(new SecurityRequirement().addList("bearer-jwt"));
    }
}
