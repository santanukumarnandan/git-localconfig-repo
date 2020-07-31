package com.example.salesvolume;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
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
@ComponentScan("com.example.salesvolume")
public class SalesVolumeDisplayDemoApplication extends SpringBootServletInitializer implements CommandLineRunner  {


	 public static File folder = new File("C:\\Users\\HAL02301\\Order Value Emails\\Pit Stop Pack Email Status.txt");
	  static String temp = "";
	
//	@Autowired
//	private ReadHourlyOrderValue readHourlyOrderValue;
	
	@Autowired
	  private DetermineStatusOfPitStopPackEmail dterminePitStopPackStatus;
	
//	@Autowired
//	private DetermineStatusOfPitStopPackEmail determineStatusOfPitStopPackEmail;
//	
	
	public static void main(String[] args) {
		SpringApplication.run(SalesVolumeDisplayDemoApplication.class, args);
		System.out.println("Reading Email Contents");
	
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SalesVolumeDisplayDemoApplication.class);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("Reading Email Contents from folder");
//	//	readHourlyOrderValue.getEmailContents(folder);
//		dterminePitStopPackStatus.getStaus(folder);
		
	}

}
