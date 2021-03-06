package com.example.salesvolume;

import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PitStopPackStatusRestAPI {

	
	public static DetermineStatusOfPitStopPackEmail determineStatusOfPitStopPackEmail;
	
	public static PitStopPackSLAStatus pitStopPackSLAStatus;
	
//	public static ReadHourlyOrderValue readHourlyOrderValue;
//	
	 public static File folder = new File("C:\\Users\\HAL02301\\Order Value Emails\\Pit Stop Pack Email Status.txt");
//	
	
	// URL:
	    // http://localhost:8080/SomeContextPath/pitStopPackSLAStatus
	    // http://localhost:8080/SomeContextPath/pitStopPackSLAStatus.xml
	    // http://localhost:8080/SomeContextPath/pitStopPackSLAStatus.json
	 @RequestMapping(value = "/pitStopPackSLAStatus", //
	            method = RequestMethod.GET, //
	            produces = { MediaType.APPLICATION_JSON_VALUE, //
	                    MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
	    public PitStopPackSLAStatus gePitStopPackSLAStatus() throws UnknownHostException, IOException {
		   determineStatusOfPitStopPackEmail = new DetermineStatusOfPitStopPackEmail();
		   pitStopPackSLAStatus = determineStatusOfPitStopPackEmail.getStaus(folder);
		   
	      
	        System.out.println("EMail Status" + pitStopPackSLAStatus);
	        return  pitStopPackSLAStatus;
	    }
	
}
