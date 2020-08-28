package com.retailDashboard.RetailDashboardServerService;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Repository;

@Repository
public class PrinterStatusDisplay {


	Map<String,PrinterBean> printerAttributesparentMap = null;
	Map<String,PrinterBean> printerTillAttributesSecondtMap = null;
	Map<String,PrinterBean> printerAttributesThirdtMap = null;
	
	  public List<PrinterBean> getPrinterStatus() throws UnknownHostException, IOException {
		
		  printerAttributesparentMap = new HashMap<String, PrinterBean>();
		  printerAttributesparentMap.clear();
		  printerTillAttributesSecondtMap = new HashMap<String, PrinterBean>();
		  printerTillAttributesSecondtMap.clear();
		  printerAttributesThirdtMap = new HashMap<String, PrinterBean>();
		  printerAttributesThirdtMap.clear();
			printerAttributesparentMap.put("", new PrinterBean("", "", "", "", "", "", "", "", "", ""));
			
			for (Entry<String, PrinterBean> mapElement : printerAttributesparentMap.entrySet()) { 
	            String ipAddress = (String)mapElement.getKey(); 
	            PrinterBean printerDetails = ((PrinterBean)mapElement.getValue()); 
	  
	            
	            InetAddress geek1 = InetAddress.getByName(ipAddress);
			    geek1.getHostAddress();
			    geek1.getHostName();
		//	    System.out.println("Sending Ping Request to " + ipAddress); 
			    if(geek1.isReachable(140)) {
			    	geek1.getHostName();
			    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
			    }
			    else {
			    	printerAttributesparentMap.put(ipAddress, new PrinterBean(printerDetails.getPrinterIpAddress(), printerDetails.getPrinterStoreNumber(), printerDetails.getPrinterPollingDate(), printerDetails.getPrinterstoreAddressLink(), printerDetails.getPrinterstoreName(), printerDetails.getPrinterPollingTime(), printerDetails.getPrinterPollingNumber(), printerDetails.getPrinterlDateUp(), printerDetails.getPrinterTimeUp(), printerDetails.getPrinterDownSince()));

			    }
			}
			
			
			for (Entry<String, PrinterBean> mapElement : printerAttributesparentMap.entrySet()) { 
	            String ipAddress = (String)mapElement.getKey(); 
	            PrinterBean printerDetails = ((PrinterBean)mapElement.getValue()); 
	  
	            
	            InetAddress geek1 = InetAddress.getByName(ipAddress);
			    geek1.getHostAddress();
			    geek1.getHostName();
		//	    System.out.println("Sending Ping Request to " + ipAddress); 
			    if(geek1.isReachable(140)) {
			    	geek1.getHostName();
			    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
			    }
			    else {
			    	printerTillAttributesSecondtMap.put(ipAddress, new PrinterBean(printerDetails.getPrinterIpAddress(), printerDetails.getPrinterStoreNumber(), printerDetails.getPrinterPollingDate(), printerDetails.getPrinterstoreAddressLink(), printerDetails.getPrinterstoreName(), printerDetails.getPrinterPollingTime(), printerDetails.getPrinterPollingNumber(), printerDetails.getPrinterlDateUp(), printerDetails.getPrinterTimeUp(), printerDetails.getPrinterDownSince()));

			    }
			}
			
		  
			for(Entry<String, PrinterBean> mapElement : printerTillAttributesSecondtMap.entrySet()) {
				for(Entry<String, PrinterBean> mapElement1 : printerAttributesparentMap.entrySet()) {
				if(mapElement.getValue().equals(mapElement1.getValue())) {
				
					String ipAddress = (String)mapElement.getKey(); 
					PrinterBean printerDetails = ((PrinterBean)mapElement.getValue()); 
			//		tillAttributes2.put(ipAddress,  new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is  unreacheable", storeDetails.getStoreAddress()));
					printerAttributesThirdtMap.put(ipAddress, new PrinterBean(printerDetails.getPrinterIpAddress(), printerDetails.getPrinterStoreNumber(), printerDetails.getPrinterPollingDate(), printerDetails.getPrinterstoreAddressLink(), printerDetails.getPrinterstoreName(), printerDetails.getPrinterPollingTime(), printerDetails.getPrinterPollingNumber(), printerDetails.getPrinterlDateUp(), printerDetails.getPrinterTimeUp(), printerDetails.getPrinterDownSince()));

				}
			}
				
		      
			
	  }

			  Collection<PrinterBean> hhtCollections = printerAttributesThirdtMap.values();
		        System.out.println("Size of HHT" + printerAttributesThirdtMap.size());
		        List<PrinterBean> list = new ArrayList<PrinterBean>();
		        list.addAll(hhtCollections);
		        return list;
		}

	
	
}
