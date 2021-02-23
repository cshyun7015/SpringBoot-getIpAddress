package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootGetIpAddressApplication {

	//public static void main(String[] args) {
	//	SpringApplication.run(SpringBootGetIpAddressApplication.class, args);
	//}
	public static void main(String[] args) {
		SpringApplication application =
				new SpringApplication(SpringBootGetIpAddressApplication.class);
		application.setWebApplicationType(WebApplicationType.SERVLET);
		application.run(args);
	}

}
