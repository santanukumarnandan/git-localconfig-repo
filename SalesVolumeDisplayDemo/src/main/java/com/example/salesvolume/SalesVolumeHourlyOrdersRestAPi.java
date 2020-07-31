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
public class SalesVolumeHourlyOrdersRestAPi {
	
	
	public static ReadHourlyOrderValue readHourlyOrderValue;
	
//	public static ReadHourlyOrderValue readHourlyOrderValue;
//	
//	 public static File folder = new File("C:\\Users\\HAL02301\\Order Value Emails\\Hourly Orders running total statistics - 150010.txt");
	 
	 public static File folder = new File("C:\\Users\\HAL02301\\Order Value Emails\\Pit Stop Pack Email Status.txt");
//	
	   @RequestMapping(value = "/readHourlyOrderValue", //
	            method = RequestMethod.GET, //
	            produces = { MediaType.APPLICATION_JSON_VALUE, //
	                    MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
	    public List<SalesVolumeAttributes> getHorlyOrderDetails() throws UnknownHostException, IOException {
		   readHourlyOrderValue = new ReadHourlyOrderValue();
		   readHourlyOrderValue.getEmailContents(folder);
		   
	      
	        System.out.println("Till Address" + readHourlyOrderValue.toString());
	        System.out.println("Till Address" + readHourlyOrderValue.getEmailContents(folder).size());
	        return readHourlyOrderValue.getEmailContents(folder);
	    }
//	   
//		@PostConstruct
//		public void initIt() throws Exception {
//			
		}
//	
	


