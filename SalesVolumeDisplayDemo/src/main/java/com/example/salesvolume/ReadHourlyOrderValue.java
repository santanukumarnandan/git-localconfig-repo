package com.example.salesvolume;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;



@Component
@Service
@Repository
public class ReadHourlyOrderValue  {
	
//	 public static File folder = new File("C:\\Users\\HAL02301\\Order Value Emails\\Hourly Orders running total statistics - 150010.txt");
	  static String temp = "";

	  public static File folder = new File("C:\\Users\\HAL02301\\Order Value Emails\\Pit Stop Pack Email Status.txt");
	  
//	  public static void main(String[] args) {
//	    // TODO Auto-generated method stub
//	    System.out.println("Reading files under the folder "+ folder.getAbsolutePath());
//	    listFilesForFolder(folder);
	  
//	  }
	  
	  Map<Integer,String> emailAttributes = null;

	  @Autowired
	  public static SalesVolumeAttributes salesVolumeAttributes;
	  
	  
	  public  List<SalesVolumeAttributes> getEmailContents(final File folder) throws IOException {

		  BufferedReader br = new BufferedReader(new FileReader(folder));
		  List<SalesVolumeAttributes> contents = new ArrayList<SalesVolumeAttributes>();
		  emailAttributes = new HashMap<Integer, String>();
		  
	//	  FileReader fr = new FileReader(folder);
		  
	//	  Scanner sc = new Scanner(folder); 
		  
//		  int i; 
//		    while ((i=fr.read()) != -1) {
//		      System.out.print((char) i);
//		    }
		  List<String> emailContents = new ArrayList<String>();
				  
		  String st; 
		  // Commented out old code for email contents on 03-06-2020--------------------------------------------------
//		  while ((st = br.readLine()) != null) {
//		    System.out.println((st.toString())); 
//		    emailContents.add(st);
//		    
//		    emailAttributes.put(st.length(), st);
//	
//		  }
		  
	// Added the new piece of code for checking time of pit stop pack email- Date :03-06-2020	----------------------------  
		  while ((st = br.readLine()) != null) {
			    System.out.println((st.toString())); 
			    if (st.equalsIgnoreCase("04:00")) {
			    	emailContents.add("True");
			    }
			    else if(st.equalsIgnoreCase("04:25")) {
			    	emailContents.add("True");
			    }
			    else if (st.equalsIgnoreCase("04:30")) {
			    	emailContents.add("True");
			    }
		
			  }
		  
		//  salesVolumeAttributes.setEmailContents(emailContents);

	
		  contents.add(new SalesVolumeAttributes(emailContents));
		  emailAttributes.toString();
		  
		  
		  
		//  BufferedReader br = new BufferedReader(new FileReader(folder));
	//	  pitStopPackSLAStatus= new PitStopPackSLAStatus(null, null, null);
	//	  String st; 
		
		  
		  
		return contents;
		  
//		  while (sc.hasNextLine()) 
//		      System.out.println(sc.nextLine()); 
//		  
//	    for (final File fileEntry : folder.listFiles()) {
//	      if (fileEntry.isDirectory()) {
//	        // System.out.println("Reading files under the folder "+folder.getAbsolutePath());
//	        listFilesForFolder(fileEntry);
//	      } else {
//	        if (fileEntry.isFile()) {
//	          temp = fileEntry.getName();
//	          if ((temp.substring(temp.lastIndexOf('.') + 1, temp.length()).toLowerCase()).equals("txt"))
//	            System.out.println("File= " + folder.getAbsolutePath()+ "\\" + fileEntry.getName());
//	        }
//
//	      }
//	    }
	  }

	

}
