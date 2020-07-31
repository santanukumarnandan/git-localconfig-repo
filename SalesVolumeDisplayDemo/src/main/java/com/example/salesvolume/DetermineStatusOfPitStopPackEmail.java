package com.example.salesvolume;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
@Service
@Repository
public class DetermineStatusOfPitStopPackEmail {

	 public static File folder = new File("C:\\Users\\HAL02301\\Order Value Emails\\Pit Stop Pack Email Status.txt");
	 
	 
	
	  public static PitStopPackSLAStatus pitStopPackSLAStatus;
	
	
	  public PitStopPackSLAStatus getStaus(final File folder) throws IOException {
		  
		  BufferedReader br = new BufferedReader(new FileReader(folder));
		  pitStopPackSLAStatus= new PitStopPackSLAStatus(null, null, null);
		  String st; 
		  while ((st = br.readLine()) != null) {
		    System.out.println((st.toString())); 
		    if (st.equalsIgnoreCase("04:00")) {
		    	pitStopPackSLAStatus.setNotBreached("True");
		    }
		    else if(st.equalsIgnoreCase("04:25")) {
		    	pitStopPackSLAStatus.setWithinToleranceLimit("True");
		    }
		    else if (st.equalsIgnoreCase("04:30")) {
		    	pitStopPackSLAStatus.setBreached("True");
		    }
	
		  }
		  
		  
		  
		  
		return pitStopPackSLAStatus;
		  
	  }
	  
}
