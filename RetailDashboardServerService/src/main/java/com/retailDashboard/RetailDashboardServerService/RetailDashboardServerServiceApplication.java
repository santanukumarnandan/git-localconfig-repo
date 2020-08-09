package com.retailDashboard.RetailDashboardServerService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.retailDashboard")
@EnableFeignClients("com.retailDashboard.RetailDashboardServerService")
@EnableDiscoveryClient
public class RetailDashboardServerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailDashboardServerServiceApplication.class, args);
	}

}
