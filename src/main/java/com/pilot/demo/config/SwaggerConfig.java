package com.pilot.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalTime;
import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private final static String TITLE = "Time Slots & Capacity REST API";
    private final static String DESCRIPTION = "Time Slots and Capacity services";
    private final static String VERSION = "1.0";
    private final static String TERMS_OF_SERVICE = "Terms of service";
    private final static String CONTACT_PERSON_NAME = "Elsayed Abdel Gelil.";
    private final static String CONTACT_PERSON_URL = "";
    private final static String CONTACT_PERSON_EMAIL = "sayed.b@fetchr.us";
    private final static String LICENSE = "All rights for fetchr.us";
    private final static String LICENSE_URL = "";

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("DateTime")
				.directModelSubstitute(LocalTime.class, String.class)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.pilot.demo.controller"))
				.paths(PathSelectors.any()).build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfo(TITLE, DESCRIPTION, VERSION, TERMS_OF_SERVICE,
				new Contact(CONTACT_PERSON_NAME, CONTACT_PERSON_URL, CONTACT_PERSON_EMAIL),
                LICENSE, LICENSE_URL);
		return apiInfo;
	}
}
