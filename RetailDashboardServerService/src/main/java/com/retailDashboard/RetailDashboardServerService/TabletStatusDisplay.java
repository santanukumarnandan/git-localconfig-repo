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
public class TabletStatusDisplay {




	Map<String,TabletBean> tabletAttributesparentMap = null;
	Map<String,TabletBean> tabletAttributesSecondtMap = null;
	Map<String,TabletBean> tabletAttributesThirdtMap = null;
	
	  public List<TabletBean> getTabletStatus() throws UnknownHostException, IOException {
		
		  tabletAttributesparentMap = new HashMap<String, TabletBean>();
		  tabletAttributesparentMap.clear();
		  tabletAttributesSecondtMap = new HashMap<String, TabletBean>();
		  tabletAttributesSecondtMap.clear();
		  tabletAttributesThirdtMap = new HashMap<String, TabletBean>();
		  tabletAttributesThirdtMap.clear();
		  tabletAttributesparentMap.put("", new TabletBean("", "", "", "", "", "", "", "", "", ""));
			
			for (Entry<String, TabletBean> mapElement : tabletAttributesparentMap.entrySet()) { 
	            String ipAddress = (String)mapElement.getKey(); 
	            TabletBean tabletDetails = ((TabletBean)mapElement.getValue()); 
	  
	            
	            InetAddress geek1 = InetAddress.getByName(ipAddress);
			    geek1.getHostAddress();
			    geek1.getHostName();
		//	    System.out.println("Sending Ping Request to " + ipAddress); 
			    if(geek1.isReachable(140)) {
			    	geek1.getHostName();
			    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
			    }
			    else {
			    	tabletAttributesparentMap.put(ipAddress, new TabletBean(tabletDetails.getTabletTillIpAddress(), tabletDetails.getTabletTillStoreNumber(), tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillstoreAddressLink(), tabletDetails.getTabletTillstoreName(), tabletDetails.getTabletTillPollingTime(), tabletDetails.getTabletTillPollingNumber(), tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillDateUp(), tabletDetails.getTabletTillDownSince()));

			    }
			}
			
			
			for (Entry<String, TabletBean> mapElement : tabletAttributesparentMap.entrySet()) { 
	            String ipAddress = (String)mapElement.getKey(); 
	            TabletBean tabletDetails = ((TabletBean)mapElement.getValue()); 
	  
	            
	            InetAddress geek1 = InetAddress.getByName(ipAddress);
			    geek1.getHostAddress();
			    geek1.getHostName();
		//	    System.out.println("Sending Ping Request to " + ipAddress); 
			    if(geek1.isReachable(140)) {
			    	geek1.getHostName();
			    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
			    }
			    else {
			    	tabletAttributesSecondtMap.put(ipAddress, new TabletBean(tabletDetails.getTabletTillIpAddress(), tabletDetails.getTabletTillStoreNumber(), tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillstoreAddressLink(), tabletDetails.getTabletTillstoreName(), tabletDetails.getTabletTillPollingTime(), tabletDetails.getTabletTillPollingNumber(), tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillDateUp(), tabletDetails.getTabletTillDownSince()));

			    }
			}
			
		  
			for(Entry<String, TabletBean> mapElement : tabletAttributesSecondtMap.entrySet()) {
				for(Entry<String, TabletBean> mapElement1 : tabletAttributesparentMap.entrySet()) {
				if(mapElement.getValue().equals(mapElement1.getValue())) {
				
					String ipAddress = (String)mapElement.getKey(); 
					TabletBean tabletDetails = ((TabletBean)mapElement.getValue()); 
			//		tillAttributes2.put(ipAddress,  new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is  unreacheable", storeDetails.getStoreAddress()));
					tabletAttributesThirdtMap.put(ipAddress, new TabletBean(tabletDetails.getTabletTillIpAddress(), tabletDetails.getTabletTillStoreNumber(), tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillstoreAddressLink(), tabletDetails.getTabletTillstoreName(), tabletDetails.getTabletTillPollingTime(), tabletDetails.getTabletTillPollingNumber(), tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillDateUp(), tabletDetails.getTabletTillDownSince()));

				}
			}
				
		      
			
	  }

			  Collection<TabletBean> hhtCollections = tabletAttributesThirdtMap.values();
		        System.out.println("Size of HHT" + tabletAttributesThirdtMap.size());
		        List<TabletBean> list = new ArrayList<TabletBean>();
		        list.addAll(hhtCollections);
		        return list;
		}

	
	

	
	


}
