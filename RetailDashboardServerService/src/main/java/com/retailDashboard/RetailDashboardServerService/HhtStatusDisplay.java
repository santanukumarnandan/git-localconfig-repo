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
public class HhtStatusDisplay {
	
	Map<String,HHTAttributeBean> hhtAttributesparentMap = null;
	Map<String,HHTAttributeBean> hhtAttributesSecondtMap = null;
	Map<String,HHTAttributeBean> hhtAttributesThirdtMap = null;
	
	  public List<HHTAttributeBean> getHHTStatus() throws UnknownHostException, IOException {
		
		  	hhtAttributesparentMap = new HashMap<String, HHTAttributeBean>();
		  	hhtAttributesparentMap.clear();
		  	hhtAttributesSecondtMap = new HashMap<String, HHTAttributeBean>();
		  	hhtAttributesSecondtMap.clear();
			hhtAttributesThirdtMap = new HashMap<String, HHTAttributeBean>();
			hhtAttributesThirdtMap.clear();
			hhtAttributesparentMap.put("", new HHTAttributeBean("", "", "", "", "", "", "", "", "", ""));
			
			for (Entry<String, HHTAttributeBean> mapElement : hhtAttributesparentMap.entrySet()) { 
	            String ipAddress = (String)mapElement.getKey(); 
	            HHTAttributeBean hhtDetails = ((HHTAttributeBean)mapElement.getValue()); 
	  
	            
	            InetAddress geek1 = InetAddress.getByName(ipAddress);
			    geek1.getHostAddress();
			    geek1.getHostName();
		//	    System.out.println("Sending Ping Request to " + ipAddress); 
			    if(geek1.isReachable(140)) {
			    	geek1.getHostName();
			    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
			    }
			    else {
			    	hhtAttributesparentMap.put(ipAddress, new HHTAttributeBean(hhtDetails.getHhtIpAddress(), hhtDetails.getHhtStoreNumber(), hhtDetails.getHhtPollingDate(), hhtDetails.getHhtstoreAddressLink(), hhtDetails.getHhtstoreName(), hhtDetails.getHhtPollingTime(), hhtDetails.getHhtPollingNumber(), hhtDetails.getHhtDateUp(), hhtDetails.getHhtTimeUp(), hhtDetails.getHhtDownSince()));

			    }
			}
			
			
			for (Entry<String, HHTAttributeBean> mapElement : hhtAttributesparentMap.entrySet()) { 
	            String ipAddress = (String)mapElement.getKey(); 
	            HHTAttributeBean hhtDetails = ((HHTAttributeBean)mapElement.getValue()); 
	  
	            
	            InetAddress geek1 = InetAddress.getByName(ipAddress);
			    geek1.getHostAddress();
			    geek1.getHostName();
		//	    System.out.println("Sending Ping Request to " + ipAddress); 
			    if(geek1.isReachable(140)) {
			    	geek1.getHostName();
			    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
			    }
			    else {
			    	hhtAttributesSecondtMap.put(ipAddress, new HHTAttributeBean(hhtDetails.getHhtIpAddress(), hhtDetails.getHhtStoreNumber(), hhtDetails.getHhtPollingDate(), hhtDetails.getHhtstoreAddressLink(), hhtDetails.getHhtstoreName(), hhtDetails.getHhtPollingTime(), hhtDetails.getHhtPollingNumber(), hhtDetails.getHhtDateUp(), hhtDetails.getHhtTimeUp(), hhtDetails.getHhtDownSince()));

			    }
			}
			
		  
			for(Entry<String, HHTAttributeBean> mapElement : hhtAttributesSecondtMap.entrySet()) {
				for(Entry<String, HHTAttributeBean> mapElement1 : hhtAttributesparentMap.entrySet()) {
				if(mapElement.getValue().equals(mapElement1.getValue())) {
				
					String ipAddress = (String)mapElement.getKey(); 
					HHTAttributeBean hhtDetails = ((HHTAttributeBean)mapElement.getValue()); 
			//		tillAttributes2.put(ipAddress,  new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is  unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesparentMap.put(ipAddress, new HHTAttributeBean(hhtDetails.getHhtIpAddress(), hhtDetails.getHhtStoreNumber(), hhtDetails.getHhtPollingDate(), hhtDetails.getHhtstoreAddressLink(), hhtDetails.getHhtstoreName(), hhtDetails.getHhtPollingTime(), hhtDetails.getHhtPollingNumber(), hhtDetails.getHhtDateUp(), hhtDetails.getHhtTimeUp(), hhtDetails.getHhtDownSince()));
				}
			}
				
		      
			
	  }

			  Collection<HHTAttributeBean> hhtCollections = hhtAttributesparentMap.values();
		        System.out.println("Size of HHT" + hhtAttributesparentMap.size());
		        List<HHTAttributeBean> list = new ArrayList<HHTAttributeBean>();
		        list.addAll(hhtCollections);
		        return list;
		}
}
