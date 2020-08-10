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
public class FixedTillStatusDisplay {
	
	
	Map<String,FixedTillBean> fixedTillAttributesparentMap = null;
	Map<String,FixedTillBean> fixedTillAttributesSecondtMap = null;
	Map<String,FixedTillBean> hhtAttributesThirdtMap = null;
	
	  public List<FixedTillBean> getFixedTillStatus() throws UnknownHostException, IOException {
		
		  fixedTillAttributesparentMap = new HashMap<String, FixedTillBean>();
		  fixedTillAttributesparentMap.clear();
		  fixedTillAttributesSecondtMap = new HashMap<String, FixedTillBean>();
		  fixedTillAttributesSecondtMap.clear();
			hhtAttributesThirdtMap = new HashMap<String, FixedTillBean>();
			hhtAttributesThirdtMap.clear();
			fixedTillAttributesparentMap.put("", new FixedTillBean("", "", "", "", "", "", "", "", "", ""));
			
			for (Entry<String, FixedTillBean> mapElement : fixedTillAttributesparentMap.entrySet()) { 
	            String ipAddress = (String)mapElement.getKey(); 
	            FixedTillBean fixedTillDetails = ((FixedTillBean)mapElement.getValue()); 
	  
	            
	            InetAddress geek1 = InetAddress.getByName(ipAddress);
			    geek1.getHostAddress();
			    geek1.getHostName();
		//	    System.out.println("Sending Ping Request to " + ipAddress); 
			    if(geek1.isReachable(140)) {
			    	geek1.getHostName();
			    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
			    }
			    else {
			    	fixedTillAttributesparentMap.put(ipAddress, new FixedTillBean(fixedTillDetails.getFixedTillIpAddress(), fixedTillDetails.getFixedTillStoreNumber(), fixedTillDetails.getFixedTillPollingDate(), fixedTillDetails.getFixedTillstoreAddressLink(), fixedTillDetails.getFixedTillstoreName(), fixedTillDetails.getFixedTillPollingTime(), fixedTillDetails.getFixedTillPollingNumber(), fixedTillDetails.getFixedTillDateUp(), fixedTillDetails.getFixedTillTimeUp(), fixedTillDetails.getFixedTillDownSince()));

			    }
			}
			
			
			for (Entry<String, FixedTillBean> mapElement : fixedTillAttributesparentMap.entrySet()) { 
	            String ipAddress = (String)mapElement.getKey(); 
	            FixedTillBean fixedTillDetails = ((FixedTillBean)mapElement.getValue()); 
	  
	            
	            InetAddress geek1 = InetAddress.getByName(ipAddress);
			    geek1.getHostAddress();
			    geek1.getHostName();
		//	    System.out.println("Sending Ping Request to " + ipAddress); 
			    if(geek1.isReachable(140)) {
			    	geek1.getHostName();
			    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
			    }
			    else {
			    	fixedTillAttributesSecondtMap.put(ipAddress, new FixedTillBean(fixedTillDetails.getFixedTillIpAddress(), fixedTillDetails.getFixedTillStoreNumber(), fixedTillDetails.getFixedTillPollingDate(), fixedTillDetails.getFixedTillstoreAddressLink(), fixedTillDetails.getFixedTillstoreName(), fixedTillDetails.getFixedTillPollingTime(), fixedTillDetails.getFixedTillPollingNumber(), fixedTillDetails.getFixedTillDateUp(), fixedTillDetails.getFixedTillTimeUp(), fixedTillDetails.getFixedTillDownSince()));

			    }
			}
			
		  
			for(Entry<String, FixedTillBean> mapElement : fixedTillAttributesSecondtMap.entrySet()) {
				for(Entry<String, FixedTillBean> mapElement1 : fixedTillAttributesparentMap.entrySet()) {
				if(mapElement.getValue().equals(mapElement1.getValue())) {
				
					String ipAddress = (String)mapElement.getKey(); 
					FixedTillBean fixedTillDetails = ((FixedTillBean)mapElement.getValue()); 
			//		tillAttributes2.put(ipAddress,  new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is  unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesThirdtMap.put(ipAddress, new FixedTillBean(fixedTillDetails.getFixedTillIpAddress(), fixedTillDetails.getFixedTillStoreNumber(), fixedTillDetails.getFixedTillPollingDate(), fixedTillDetails.getFixedTillstoreAddressLink(), fixedTillDetails.getFixedTillstoreName(), fixedTillDetails.getFixedTillPollingTime(), fixedTillDetails.getFixedTillPollingNumber(), fixedTillDetails.getFixedTillDateUp(), fixedTillDetails.getFixedTillTimeUp(), fixedTillDetails.getFixedTillDownSince()));

				}
			}
				
		      
			
	  }

			  Collection<FixedTillBean> hhtCollections = hhtAttributesThirdtMap.values();
		        System.out.println("Size of HHT" + hhtAttributesThirdtMap.size());
		        List<FixedTillBean> list = new ArrayList<FixedTillBean>();
		        list.addAll(hhtCollections);
		        return list;
		}

}
