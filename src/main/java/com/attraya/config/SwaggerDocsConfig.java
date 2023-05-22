package com.attraya.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerDocsConfig {

	@Bean
	public Docket createDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.attraya.restcontroller"))
				.paths(PathSelectors.regex("/api/tourist.*"))
				.build().useDefaultResponseMessages(true)
				.apiInfo(getApiInfo());
	}

	private ApiInfo getApiInfo() {
		Contact contact = new Contact("Attraya", "https://www.linkedin.com/in/attrayadas/", "attrayaghoshdas@gmail.com");
		return new ApiInfo("TouristInfo", "Gives information about tourist bookings", "3.4.RELEASE", "http:", contact,
				"GNU PUBLIC", "http://apache.org/license/guru", Collections.emptyList());
	}

}
