package com.retailDashboard.RetailDashboardServerService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.retailDashboard")
public class RetailDashboardServerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailDashboardServerServiceApplication.class, args);
	}

}
