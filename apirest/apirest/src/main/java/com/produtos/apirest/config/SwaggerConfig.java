package com.produtos.apirest.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;



@Configuration
public class SwaggerConfig { 
	
	private String licenseUrl;

	@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.produtos.apirest"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
	}
 
	private ApiInfo apiInfo() {
		return new ApiInfo("User API", 
				"Api que controla usuários", 
				"API v1", 
				"Termos de Serviço", 
				new Contact("Thiago", "www.teste.com", "thiagoantoniocs47@gmail.com"),
				"license","url", Collections.emptyList());
		
		
	}
		
		
	}

