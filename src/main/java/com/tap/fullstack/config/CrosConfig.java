package com.tap.fullstack.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class CrosConfig {
	public  WebMvcConfigurer corsConfigurer() {
		
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/*")
				        .allowedOrigins("http://localhost:5173")
				        .allowedMethods("GET", "POST", "PUT", "DELETE")
				        .allowedHeaders("*");
			}
		};
		
	}

}
