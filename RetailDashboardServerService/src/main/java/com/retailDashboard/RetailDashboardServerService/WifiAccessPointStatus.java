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
public class WifiAccessPointStatus {

	

	



	Map<String,WifiAccessPointBean> wifiAttributesparentMap = null;
	Map<String,WifiAccessPointBean> wifiTillAttributesSecondtMap = null;
	Map<String,WifiAccessPointBean> wifiAttributesThirdtMap = null;
	
	  public List<WifiAccessPointBean> getWifiAccessStatus() throws UnknownHostException, IOException {
		
		  wifiAttributesparentMap = new HashMap<String, WifiAccessPointBean>();
		  wifiAttributesparentMap.clear();
		  wifiTillAttributesSecondtMap = new HashMap<String, WifiAccessPointBean>();
		  wifiTillAttributesSecondtMap.clear();
		  wifiAttributesThirdtMap = new HashMap<String, WifiAccessPointBean>();
		  wifiAttributesThirdtMap.clear();
		  wifiAttributesparentMap.put("", new WifiAccessPointBean("", "", "", "", "", "", "", "", "", ""));
			
			for (Entry<String, WifiAccessPointBean> mapElement : wifiAttributesparentMap.entrySet()) { 
	            String ipAddress = (String)mapElement.getKey(); 
	            WifiAccessPointBean wifiDetails = ((WifiAccessPointBean)mapElement.getValue()); 
	  
	            
	            InetAddress geek1 = InetAddress.getByName(ipAddress);
			    geek1.getHostAddress();
			    geek1.getHostName();
		//	    System.out.println("Sending Ping Request to " + ipAddress); 
			    if(geek1.isReachable(140)) {
			    	geek1.getHostName();
			    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
			    }
			    else {
			    	wifiAttributesparentMap.put(ipAddress, new WifiAccessPointBean(wifiDetails.getWifiAccessPointIpAddress(), wifiDetails.getWifiAccessPointStoreNumber(), wifiDetails.getWifiAccessPointPollingDate(), wifiDetails.getWifiAccessPointstoreAddressLink(), wifiDetails.getWifiAccessPointstoreName(), wifiDetails.getWifiAccessPointPollingTime(), wifiDetails.getWifiAccessPointPollingNumber(), wifiDetails.getWifiAccessPointlDateUp(), wifiDetails.getWifiAccessPointTimeUp(), wifiDetails.getWifiAccessPointDownSince()));

			    }
			}
			
			
			for (Entry<String, WifiAccessPointBean> mapElement : wifiAttributesparentMap.entrySet()) { 
	            String ipAddress = (String)mapElement.getKey(); 
	            WifiAccessPointBean wifiDetails = ((WifiAccessPointBean)mapElement.getValue()); 
	  
	            
	            InetAddress geek1 = InetAddress.getByName(ipAddress);
			    geek1.getHostAddress();
			    geek1.getHostName();
		//	    System.out.println("Sending Ping Request to " + ipAddress); 
			    if(geek1.isReachable(140)) {
			    	geek1.getHostName();
			    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
			    }
			    else {
			    	wifiTillAttributesSecondtMap.put(ipAddress, new WifiAccessPointBean(wifiDetails.getWifiAccessPointIpAddress(), wifiDetails.getWifiAccessPointStoreNumber(), wifiDetails.getWifiAccessPointPollingDate(), wifiDetails.getWifiAccessPointstoreAddressLink(), wifiDetails.getWifiAccessPointstoreName(), wifiDetails.getWifiAccessPointPollingTime(), wifiDetails.getWifiAccessPointPollingNumber(), wifiDetails.getWifiAccessPointlDateUp(), wifiDetails.getWifiAccessPointTimeUp(), wifiDetails.getWifiAccessPointDownSince()));

			    }
			}
			
		  
			for(Entry<String, WifiAccessPointBean> mapElement : wifiTillAttributesSecondtMap.entrySet()) {
				for(Entry<String, WifiAccessPointBean> mapElement1 : wifiAttributesparentMap.entrySet()) {
				if(mapElement.getValue().equals(mapElement1.getValue())) {
				
					String ipAddress = (String)mapElement.getKey(); 
					WifiAccessPointBean wifiDetails = ((WifiAccessPointBean)mapElement.getValue()); 
			//		tillAttributes2.put(ipAddress,  new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is  unreacheable", storeDetails.getStoreAddress()));
					wifiAttributesThirdtMap.put(ipAddress, new WifiAccessPointBean(wifiDetails.getWifiAccessPointIpAddress(), wifiDetails.getWifiAccessPointStoreNumber(), wifiDetails.getWifiAccessPointPollingDate(), wifiDetails.getWifiAccessPointstoreAddressLink(), wifiDetails.getWifiAccessPointstoreName(), wifiDetails.getWifiAccessPointPollingTime(), wifiDetails.getWifiAccessPointPollingNumber(), wifiDetails.getWifiAccessPointlDateUp(), wifiDetails.getWifiAccessPointTimeUp(), wifiDetails.getWifiAccessPointDownSince()));

				}
			}
				
		      
			
	  }

			  Collection<WifiAccessPointBean> wifiCollections = wifiAttributesThirdtMap.values();
		        System.out.println("Size of HHT" + wifiAttributesThirdtMap.size());
		        List<WifiAccessPointBean> list = new ArrayList<WifiAccessPointBean>();
		        list.addAll(wifiCollections);
		        return list;
		}

	
	



}
