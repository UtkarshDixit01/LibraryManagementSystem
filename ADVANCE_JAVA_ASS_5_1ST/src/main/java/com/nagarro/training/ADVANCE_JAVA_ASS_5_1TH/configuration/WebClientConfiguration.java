package com.nagarro.training.ADVANCE_JAVA_ASS_5_1TH.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@PropertySource("classpath:webClient.properties")
@ComponentScan(basePackages= {"com.nagarro.training.ADVANCE_JAVA_ASS_5_1TH.services"})
public class WebClientConfiguration {

	@Autowired
	private Environment environment;
	
	@Bean
	public WebClient webClient() {
		WebClient webClient = WebClient.builder().baseUrl(environment.getRequiredProperty("webClient.baseUrl")).defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE).build();
		return webClient;
	}
}
