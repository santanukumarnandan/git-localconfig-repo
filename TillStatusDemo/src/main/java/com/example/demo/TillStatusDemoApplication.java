package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("com.example.demo")
public class TillStatusDemoApplication extends SpringBootServletInitializer {
//public class TillStatusDemoApplication {

//public static HalfordsTillStatusDisplay displayTillStatus = new HalfordsTillStatusDisplay();
	
	
	public static void main(String[] args) {
		SpringApplication.run(TillStatusDemoApplication.class, args);
		System.out.println("Halfords Automation");
//		try {
//			List<String> tillIpRanges = new ArrayList<String>();
//			tillIpRanges.add("10.68.72.31");
//			tillIpRanges.add("10.68.72.214");
//			tillIpRanges.add("10.68.72.213");
//			displayTillStatus.getTillRequest(tillIpRanges);
//		//	displayTillStatus.getRequest("10.68.72.31");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(TillStatusDemoApplication.class);
	}
	
}
