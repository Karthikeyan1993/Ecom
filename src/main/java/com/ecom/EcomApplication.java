package com.ecom;

import org.h2.server.web.WebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcomApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean h2Registration() {
		ServletRegistrationBean srb = new ServletRegistrationBean(new WebServlet());
		srb.addUrlMappings("/console/*");
		return srb;
	}

}
