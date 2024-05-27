package com.eazybytes.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(info = @Info(title = "Account Microservice REST API Documentation", description = "EasyBank Accout Microservice REST API Documentation", version = "v1", contact = @Contact(name = "Mahesh Bhairewar", email = "maheshbhairewar@gmail.com", url = "mahesh@portfolio;.com"), license = @License(name = "Apache 2.0", url = "mahesh@portfolio.com")), externalDocs = @ExternalDocumentation(description = "EasyBank Accounts Microservice REST API Documentation", url = "mahesh@portfolio.com"))

public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
