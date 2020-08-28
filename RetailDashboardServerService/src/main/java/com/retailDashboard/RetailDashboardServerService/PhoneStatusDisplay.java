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
public class PhoneStatusDisplay {
	



	Map<String,PhoneBean> phoneAttributesparentMap = null;
	Map<String,PhoneBean> phoneTillAttributesSecondtMap = null;
	Map<String,PhoneBean> phoneAttributesThirdtMap = null;
	
	  public List<PhoneBean> getPhoneStatus() throws UnknownHostException, IOException {
		
		  phoneAttributesparentMap = new HashMap<String, PhoneBean>();
		  phoneAttributesparentMap.clear();
		  phoneTillAttributesSecondtMap = new HashMap<String, PhoneBean>();
		  phoneTillAttributesSecondtMap.clear();
		  phoneAttributesThirdtMap = new HashMap<String, PhoneBean>();
		  phoneAttributesThirdtMap.clear();
		  phoneAttributesparentMap.put("", new PhoneBean("", "", "", "", "", "", "", "", "", ""));
			
			for (Entry<String, PhoneBean> mapElement : phoneAttributesparentMap.entrySet()) { 
	            String ipAddress = (String)mapElement.getKey(); 
	            PhoneBean phoneDetails = ((PhoneBean)mapElement.getValue()); 
	  
	            
	            InetAddress geek1 = InetAddress.getByName(ipAddress);
			    geek1.getHostAddress();
			    geek1.getHostName();
		//	    System.out.println("Sending Ping Request to " + ipAddress); 
			    if(geek1.isReachable(140)) {
			    	geek1.getHostName();
			    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
			    }
			    else {
			    	phoneAttributesparentMap.put(ipAddress, new PhoneBean(phoneDetails.getPhoneIpAddress(), phoneDetails.getPhoneStoreNumber(), phoneDetails.getPhonePollingDate(), phoneDetails.getPhonestoreAddressLink(), phoneDetails.getPhonestoreName(), phoneDetails.getPhonePollingTime(), phoneDetails.getPhonePollingNumber(), phoneDetails.getPhonelDateUp(), phoneDetails.getPhoneTimeUp(), phoneDetails.getPhoneDownSince()));

			    }
			}
			
			
			for (Entry<String, PhoneBean> mapElement : phoneAttributesparentMap.entrySet()) { 
	            String ipAddress = (String)mapElement.getKey(); 
	            PhoneBean phoneDetails = ((PhoneBean)mapElement.getValue()); 
	  
	            
	            InetAddress geek1 = InetAddress.getByName(ipAddress);
			    geek1.getHostAddress();
			    geek1.getHostName();
		//	    System.out.println("Sending Ping Request to " + ipAddress); 
			    if(geek1.isReachable(140)) {
			    	geek1.getHostName();
			    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
			    }
			    else {
			    	phoneTillAttributesSecondtMap.put(ipAddress, new PhoneBean(phoneDetails.getPhoneIpAddress(), phoneDetails.getPhoneStoreNumber(), phoneDetails.getPhonePollingDate(), phoneDetails.getPhonestoreAddressLink(), phoneDetails.getPhonestoreName(), phoneDetails.getPhonePollingTime(), phoneDetails.getPhonePollingNumber(), phoneDetails.getPhonelDateUp(), phoneDetails.getPhoneTimeUp(), phoneDetails.getPhoneDownSince()));

			    }
			}
			
		  
			for(Entry<String, PhoneBean> mapElement : phoneTillAttributesSecondtMap.entrySet()) {
				for(Entry<String, PhoneBean> mapElement1 : phoneAttributesparentMap.entrySet()) {
				if(mapElement.getValue().equals(mapElement1.getValue())) {
				
					String ipAddress = (String)mapElement.getKey(); 
					PhoneBean phoneDetails = ((PhoneBean)mapElement.getValue()); 
			//		tillAttributes2.put(ipAddress,  new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is  unreacheable", storeDetails.getStoreAddress()));
					phoneAttributesThirdtMap.put(ipAddress, new PhoneBean(phoneDetails.getPhoneIpAddress(), phoneDetails.getPhoneStoreNumber(), phoneDetails.getPhonePollingDate(), phoneDetails.getPhonestoreAddressLink(), phoneDetails.getPhonestoreName(), phoneDetails.getPhonePollingTime(), phoneDetails.getPhonePollingNumber(), phoneDetails.getPhonelDateUp(), phoneDetails.getPhoneTimeUp(), phoneDetails.getPhoneDownSince()));

				}
			}
				
		      
			
	  }

			  Collection<PhoneBean> phoneCollections = phoneAttributesThirdtMap.values();
		        System.out.println("Size of HHT" + phoneAttributesThirdtMap.size());
		        List<PhoneBean> list = new ArrayList<PhoneBean>();
		        list.addAll(phoneCollections);
		        return list;
		}

	
	


}
