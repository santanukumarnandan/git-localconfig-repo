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
public class PedStatusDisplay {
	
	



	Map<String,PedBean> pedAttributesparentMap = null;
	Map<String,PedBean> pedAttributesSecondtMap = null;
	Map<String,PedBean> pedAttributesThirdtMap = null;
	
	  public List<PedBean> getPedStatus() throws UnknownHostException, IOException {
		
		  pedAttributesparentMap = new HashMap<String, PedBean>();
		  pedAttributesparentMap.clear();
		  pedAttributesSecondtMap = new HashMap<String, PedBean>();
		  pedAttributesSecondtMap.clear();
		  pedAttributesThirdtMap = new HashMap<String, PedBean>();
		  pedAttributesThirdtMap.clear();
		  pedAttributesparentMap.put("", new PedBean("", "", "", "", "", "", "", "", "", ""));
			
			for (Entry<String, PedBean> mapElement : pedAttributesparentMap.entrySet()) { 
	            String ipAddress = (String)mapElement.getKey(); 
	            PedBean pedDetails = ((PedBean)mapElement.getValue()); 
	  
	            
	            InetAddress geek1 = InetAddress.getByName(ipAddress);
			    geek1.getHostAddress();
			    geek1.getHostName();
		//	    System.out.println("Sending Ping Request to " + ipAddress); 
			    if(geek1.isReachable(140)) {
			    	geek1.getHostName();
			    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
			    }
			    else {
			    	pedAttributesparentMap.put(ipAddress, new PedBean(pedDetails.getPedTillIpAddress(), pedDetails.getPedTillStoreNumber(), pedDetails.getPedTillPollingDate(), pedDetails.getPedTillstoreAddressLink(), pedDetails.getPedTillstoreName(), pedDetails.getPedTillPollingTime(), pedDetails.getPedTillPollingNumber(), pedDetails.getPedTillDateUp(), pedDetails.getPedTillTimeUp(), pedDetails.getPedTillDownSince()));

			    }
			}
			
			
			for (Entry<String, PedBean> mapElement : pedAttributesparentMap.entrySet()) { 
	            String ipAddress = (String)mapElement.getKey(); 
	            PedBean pedDetails = ((PedBean)mapElement.getValue()); 
	  
	            
	            InetAddress geek1 = InetAddress.getByName(ipAddress);
			    geek1.getHostAddress();
			    geek1.getHostName();
		//	    System.out.println("Sending Ping Request to " + ipAddress); 
			    if(geek1.isReachable(140)) {
			    	geek1.getHostName();
			    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
			    }
			    else {
			    	pedAttributesSecondtMap.put(ipAddress, new PedBean(pedDetails.getPedTillIpAddress(), pedDetails.getPedTillStoreNumber(), pedDetails.getPedTillPollingDate(), pedDetails.getPedTillstoreAddressLink(), pedDetails.getPedTillstoreName(), pedDetails.getPedTillPollingTime(), pedDetails.getPedTillPollingNumber(), pedDetails.getPedTillDateUp(), pedDetails.getPedTillTimeUp(), pedDetails.getPedTillDownSince()));

			    }
			}
			
		  
			for(Entry<String, PedBean> mapElement : pedAttributesSecondtMap.entrySet()) {
				for(Entry<String, PedBean> mapElement1 : pedAttributesparentMap.entrySet()) {
				if(mapElement.getValue().equals(mapElement1.getValue())) {
				
					String ipAddress = (String)mapElement.getKey(); 
					PedBean pedDetails = ((PedBean)mapElement.getValue()); 
			//		tillAttributes2.put(ipAddress,  new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is  unreacheable", storeDetails.getStoreAddress()));
					pedAttributesThirdtMap.put(ipAddress, new PedBean(pedDetails.getPedTillIpAddress(), pedDetails.getPedTillStoreNumber(), pedDetails.getPedTillPollingDate(), pedDetails.getPedTillstoreAddressLink(), pedDetails.getPedTillstoreName(), pedDetails.getPedTillPollingTime(), pedDetails.getPedTillPollingNumber(), pedDetails.getPedTillDateUp(), pedDetails.getPedTillTimeUp(), pedDetails.getPedTillDownSince()));

				}
			}
				
		      
			
	  }

			  Collection<PedBean> hhtCollections = pedAttributesThirdtMap.values();
		        System.out.println("Size of HHT" + pedAttributesThirdtMap.size());
		        List<PedBean> list = new ArrayList<PedBean>();
		        list.addAll(hhtCollections);
		        return list;
		}

	
	

	
	

}
