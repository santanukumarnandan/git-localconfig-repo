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
	
	  public List<FixedTillBean> getFixedTillStatus(List<HalFixedTillMaster> fixedTillMaster, List<Long> storeNumbers) throws UnknownHostException, IOException {
		
		  fixedTillAttributesparentMap = new HashMap<String, FixedTillBean>();
		  fixedTillAttributesparentMap.clear();
		  HashMap<String, FixedTillBean> fixedTillAttributesFirstMap = new HashMap<String, FixedTillBean>();
		  fixedTillAttributesFirstMap.clear();
		  fixedTillAttributesSecondtMap = new HashMap<String, FixedTillBean>();
		  fixedTillAttributesSecondtMap.clear();
			hhtAttributesThirdtMap = new HashMap<String, FixedTillBean>();
			hhtAttributesThirdtMap.clear();
			HashMap<String, FixedTillBean> hhtAttributesFourthtMap = new HashMap<String, FixedTillBean>();
			hhtAttributesFourthtMap.clear();
			HashMap<String, FixedTillBean> hhtAttributesFifthtMap = new HashMap<String, FixedTillBean>();
			hhtAttributesFifthtMap.clear();
			HashMap<String, FixedTillBean> hhtAttributesSixthtMap = new HashMap<String, FixedTillBean>();
			hhtAttributesSixthtMap.clear();
			HashMap<String, FixedTillBean> hhtAttributesSeventhMap = new HashMap<String, FixedTillBean>();
			hhtAttributesSeventhMap.clear();
			
			HashMap<String, FixedTillBean> hhtAttributesEightMap = new HashMap<String, FixedTillBean>();
			hhtAttributesEightMap.clear();
			HashMap<String, FixedTillBean> hhtAttributesNnthMap = new HashMap<String, FixedTillBean>();
			hhtAttributesNnthMap.clear();
			HashMap<String, FixedTillBean> hhtAttributesTenthMap = new HashMap<String, FixedTillBean>();
			hhtAttributesTenthMap.clear();
			HashMap<String, FixedTillBean> hhtAttributesEleventhMap = new HashMap<String, FixedTillBean>();
			hhtAttributesSeventhMap.clear();
			
			
			HashMap<String, FixedTillBean> hhtAttributesTwelvethMap = new HashMap<String, FixedTillBean>();
			hhtAttributesTwelvethMap.clear();
			HashMap<String, FixedTillBean> hhtAttributesThirteenthMap = new HashMap<String, FixedTillBean>();
			hhtAttributesThirteenthMap.clear();
			HashMap<String, FixedTillBean> hhtAttributesFourteenthMap = new HashMap<String, FixedTillBean>();
			hhtAttributesFourteenthMap.clear();
			HashMap<String, FixedTillBean> hhtAttributesFifteenthMap = new HashMap<String, FixedTillBean>();
			hhtAttributesFifteenthMap.clear();
			HashMap<String, FixedTillBean> hhtAttributesSixteenthMap = new HashMap<String, FixedTillBean>();
			hhtAttributesSixteenthMap.clear();
			
			
			
			
			
			// List 4 is being prepared. Next iterate this 8 times to find the exact down tills
			
			for (HalFixedTillMaster halFixedTillMaster : fixedTillMaster) {
				fixedTillAttributesparentMap.put(halFixedTillMaster.getStoreNumber().toString(), new FixedTillBean(halFixedTillMaster.getStoreIpAddress(),halFixedTillMaster.getStoreNumber().toString(),halFixedTillMaster.getDiscoveryDate(),halFixedTillMaster.getDiscoveryTime(), halFixedTillMaster.getRecordNumber(), halFixedTillMaster.getIsActive(), halFixedTillMaster.getStoreHostName()));

			}
			
			
			// Check for first time the list of down tills and prepare first map
			for (Entry<String, FixedTillBean> mapElement : fixedTillAttributesparentMap.entrySet()) { 
	            String storeNumber = (String)mapElement.getKey(); 
	            FixedTillBean fixedTillDetails = ((FixedTillBean)mapElement.getValue()); 
	  
	            
	            InetAddress geek1 = InetAddress.getByName(storeNumber);
			    geek1.getHostAddress();
			    geek1.getHostName();
		//	    System.out.println("Sending Ping Request to " + ipAddress); 
			    if(geek1.isReachable(140)) {
			    	geek1.getHostName();
			    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
			    }
			    else {
			    	fixedTillAttributesFirstMap.put(storeNumber, new FixedTillBean(fixedTillDetails.getFixedTillIpAddress(),fixedTillDetails.getFixedTillStoreNumber().toString(),fixedTillDetails.getFixedTillDiscoveryDate(),fixedTillDetails.getFixedTillDiscoveryTime(), fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(), fixedTillDetails.getFixedTillHostName()));

			    }
			}
			
			// Check for second time the list of down tills and prepare second map
				for (Entry<String, FixedTillBean> mapElement : fixedTillAttributesFirstMap.entrySet()) { 
	            String storeNumber = (String)mapElement.getKey(); 
	            FixedTillBean fixedTillDetails = ((FixedTillBean)mapElement.getValue()); 
	  
	            
	            InetAddress geek1 = InetAddress.getByName(storeNumber);
			    geek1.getHostAddress();
			    geek1.getHostName();
		//	    System.out.println("Sending Ping Request to " + ipAddress); 
			    if(geek1.isReachable(140)) {
			    	geek1.getHostName();
			    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
			    }
			    else {
			    	fixedTillAttributesSecondtMap.put(storeNumber, new FixedTillBean(fixedTillDetails.getFixedTillIpAddress(),fixedTillDetails.getFixedTillStoreNumber().toString(),fixedTillDetails.getFixedTillDiscoveryDate(),fixedTillDetails.getFixedTillDiscoveryTime(), fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(), fixedTillDetails.getFixedTillHostName()));

			    }
			}
			
		  //Compare between second and First Map and prepare a third map with common values of down tills
			for(Entry<String, FixedTillBean> mapElement : fixedTillAttributesSecondtMap.entrySet()) {
				for(Entry<String, FixedTillBean> mapElement1 : fixedTillAttributesFirstMap.entrySet()) {
				if(mapElement.getValue().equals(mapElement1.getValue())) {
				
					String storeNumber = (String)mapElement.getKey(); 
					FixedTillBean fixedTillDetails = ((FixedTillBean)mapElement.getValue()); 
			//		tillAttributes2.put(ipAddress,  new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is  unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesThirdtMap.put(storeNumber, new FixedTillBean(fixedTillDetails.getFixedTillIpAddress(),fixedTillDetails.getFixedTillStoreNumber().toString(),fixedTillDetails.getFixedTillDiscoveryDate(),fixedTillDetails.getFixedTillDiscoveryTime(), fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(), fixedTillDetails.getFixedTillHostName()));

				}
			}
				
		     
	  }
			
			// Check for third time the list of down tills and prepare fourth map
			for (Entry<String, FixedTillBean> mapElement : hhtAttributesThirdtMap.entrySet()) { 
            String storeNumber = (String)mapElement.getKey(); 
            FixedTillBean fixedTillDetails = ((FixedTillBean)mapElement.getValue()); 
  
            
            InetAddress geek1 = InetAddress.getByName(storeNumber);
		    geek1.getHostAddress();
		    geek1.getHostName();
	//	    System.out.println("Sending Ping Request to " + ipAddress); 
		    if(geek1.isReachable(140)) {
		    	geek1.getHostName();
		    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
		    }
		    else {
		    	hhtAttributesFourthtMap.put(storeNumber, new FixedTillBean(fixedTillDetails.getFixedTillIpAddress(),fixedTillDetails.getFixedTillStoreNumber().toString(),fixedTillDetails.getFixedTillDiscoveryDate(),fixedTillDetails.getFixedTillDiscoveryTime(), fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(), fixedTillDetails.getFixedTillHostName()));

		    }
		}
			
			
			 //Compare between third and Fourth Map and prepare a fifth map with common values of down tills
			for(Entry<String, FixedTillBean> mapElement : hhtAttributesThirdtMap.entrySet()) {
				for(Entry<String, FixedTillBean> mapElement1 : hhtAttributesFourthtMap.entrySet()) {
				if(mapElement.getValue().equals(mapElement1.getValue())) {
				
					String storeNumber = (String)mapElement.getKey(); 
					FixedTillBean fixedTillDetails = ((FixedTillBean)mapElement.getValue()); 
			//		tillAttributes2.put(ipAddress,  new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is  unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesFifthtMap.put(storeNumber, new FixedTillBean(fixedTillDetails.getFixedTillIpAddress(),fixedTillDetails.getFixedTillStoreNumber().toString(),fixedTillDetails.getFixedTillDiscoveryDate(),fixedTillDetails.getFixedTillDiscoveryTime(), fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(), fixedTillDetails.getFixedTillHostName()));

				}
			}
				
		     
	  }
			
			// Check for fourth time the list of down tills and prepare sixth map
						for (Entry<String, FixedTillBean> mapElement : hhtAttributesFifthtMap.entrySet()) { 
			            String storeNumber = (String)mapElement.getKey(); 
			            FixedTillBean fixedTillDetails = ((FixedTillBean)mapElement.getValue()); 
			  
			            
			            InetAddress geek1 = InetAddress.getByName(storeNumber);
					    geek1.getHostAddress();
					    geek1.getHostName();
				//	    System.out.println("Sending Ping Request to " + ipAddress); 
					    if(geek1.isReachable(140)) {
					    	geek1.getHostName();
					    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
					    }
					    else {
					    	hhtAttributesSixthtMap.put(storeNumber, new FixedTillBean(fixedTillDetails.getFixedTillIpAddress(),fixedTillDetails.getFixedTillStoreNumber().toString(),fixedTillDetails.getFixedTillDiscoveryDate(),fixedTillDetails.getFixedTillDiscoveryTime(), fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(), fixedTillDetails.getFixedTillHostName()));

					    }
					}
			
						 //Compare between fifth and sixth Map and prepare a seventh map with common values of down tills
						for(Entry<String, FixedTillBean> mapElement : hhtAttributesFifthtMap.entrySet()) {
							for(Entry<String, FixedTillBean> mapElement1 : hhtAttributesSixthtMap.entrySet()) {
							if(mapElement.getValue().equals(mapElement1.getValue())) {
							
								String storeNumber = (String)mapElement.getKey(); 
								FixedTillBean fixedTillDetails = ((FixedTillBean)mapElement.getValue()); 
						//		tillAttributes2.put(ipAddress,  new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is  unreacheable", storeDetails.getStoreAddress()));
								hhtAttributesSeventhMap.put(storeNumber, new FixedTillBean(fixedTillDetails.getFixedTillIpAddress(),fixedTillDetails.getFixedTillStoreNumber().toString(),fixedTillDetails.getFixedTillDiscoveryDate(),fixedTillDetails.getFixedTillDiscoveryTime(), fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(), fixedTillDetails.getFixedTillHostName()));

							}
						}
							
					     
				  }		
						
						
						
						// Check for fifth time the list of down tills and prepare eight map
						for (Entry<String, FixedTillBean> mapElement : hhtAttributesSeventhMap.entrySet()) { 
			            String storeNumber = (String)mapElement.getKey(); 
			            FixedTillBean fixedTillDetails = ((FixedTillBean)mapElement.getValue()); 
			  
			            
			            InetAddress geek1 = InetAddress.getByName(storeNumber);
					    geek1.getHostAddress();
					    geek1.getHostName();
				//	    System.out.println("Sending Ping Request to " + ipAddress); 
					    if(geek1.isReachable(140)) {
					    	geek1.getHostName();
					    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
					    }
					    else {
					    	hhtAttributesEightMap.put(storeNumber, new FixedTillBean(fixedTillDetails.getFixedTillIpAddress(),fixedTillDetails.getFixedTillStoreNumber().toString(),fixedTillDetails.getFixedTillDiscoveryDate(),fixedTillDetails.getFixedTillDiscoveryTime(), fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(), fixedTillDetails.getFixedTillHostName()));

					    }
					}
			
						 //Compare between seventh and eight Map and prepare a seventh map with common values of down tills
						for(Entry<String, FixedTillBean> mapElement : hhtAttributesSeventhMap.entrySet()) {
							for(Entry<String, FixedTillBean> mapElement1 : hhtAttributesEightMap.entrySet()) {
							if(mapElement.getValue().equals(mapElement1.getValue())) {
							
								String storeNumber = (String)mapElement.getKey(); 
								FixedTillBean fixedTillDetails = ((FixedTillBean)mapElement.getValue()); 
						//		tillAttributes2.put(ipAddress,  new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is  unreacheable", storeDetails.getStoreAddress()));
								hhtAttributesNnthMap.put(storeNumber, new FixedTillBean(fixedTillDetails.getFixedTillIpAddress(),fixedTillDetails.getFixedTillStoreNumber().toString(),fixedTillDetails.getFixedTillDiscoveryDate(),fixedTillDetails.getFixedTillDiscoveryTime(), fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(), fixedTillDetails.getFixedTillHostName()));

							}
						}
							
					     
				  }		
						
						// Check for sixth time the list of down tills and prepare tenth map
						for (Entry<String, FixedTillBean> mapElement : hhtAttributesNnthMap.entrySet()) { 
			            String storeNumber = (String)mapElement.getKey(); 
			            FixedTillBean fixedTillDetails = ((FixedTillBean)mapElement.getValue()); 
			  
			            
			            InetAddress geek1 = InetAddress.getByName(storeNumber);
					    geek1.getHostAddress();
					    geek1.getHostName();
				//	    System.out.println("Sending Ping Request to " + ipAddress); 
					    if(geek1.isReachable(140)) {
					    	geek1.getHostName();
					    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
					    }
					    else {
					    	hhtAttributesTenthMap.put(storeNumber, new FixedTillBean(fixedTillDetails.getFixedTillIpAddress(),fixedTillDetails.getFixedTillStoreNumber().toString(),fixedTillDetails.getFixedTillDiscoveryDate(),fixedTillDetails.getFixedTillDiscoveryTime(), fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(), fixedTillDetails.getFixedTillHostName()));

					    }
					}
			
						 //Compare between ninth and tenth Map and prepare a seventh map with common values of down tills
						for(Entry<String, FixedTillBean> mapElement : hhtAttributesNnthMap.entrySet()) {
							for(Entry<String, FixedTillBean> mapElement1 : hhtAttributesTenthMap.entrySet()) {
							if(mapElement.getValue().equals(mapElement1.getValue())) {
							
								String storeNumber = (String)mapElement.getKey(); 
								FixedTillBean fixedTillDetails = ((FixedTillBean)mapElement.getValue()); 
						//		tillAttributes2.put(ipAddress,  new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is  unreacheable", storeDetails.getStoreAddress()));
								hhtAttributesEleventhMap.put(storeNumber, new FixedTillBean(fixedTillDetails.getFixedTillIpAddress(),fixedTillDetails.getFixedTillStoreNumber().toString(),fixedTillDetails.getFixedTillDiscoveryDate(),fixedTillDetails.getFixedTillDiscoveryTime(), fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(), fixedTillDetails.getFixedTillHostName()));

							}
						}
							
					     
				  }		
						
						
						
						
						// Check for seventh time the list of down tills and prepare twelveth map
						for (Entry<String, FixedTillBean> mapElement : hhtAttributesEleventhMap.entrySet()) { 
			            String storeNumber = (String)mapElement.getKey(); 
			            FixedTillBean fixedTillDetails = ((FixedTillBean)mapElement.getValue()); 
			  
			            
			            InetAddress geek1 = InetAddress.getByName(storeNumber);
					    geek1.getHostAddress();
					    geek1.getHostName();
				//	    System.out.println("Sending Ping Request to " + ipAddress); 
					    if(geek1.isReachable(140)) {
					    	geek1.getHostName();
					    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
					    }
					    else {
					    	hhtAttributesTwelvethMap.put(storeNumber, new FixedTillBean(fixedTillDetails.getFixedTillIpAddress(),fixedTillDetails.getFixedTillStoreNumber().toString(),fixedTillDetails.getFixedTillDiscoveryDate(),fixedTillDetails.getFixedTillDiscoveryTime(), fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(), fixedTillDetails.getFixedTillHostName()));

					    }
					}
						
						 //Compare between eleventh and twelveth Map and prepare a seventh map with common values of down tills
						for(Entry<String, FixedTillBean> mapElement : hhtAttributesEleventhMap.entrySet()) {
							for(Entry<String, FixedTillBean> mapElement1 : hhtAttributesTwelvethMap.entrySet()) {
							if(mapElement.getValue().equals(mapElement1.getValue())) {
							
								String storeNumber = (String)mapElement.getKey(); 
								FixedTillBean fixedTillDetails = ((FixedTillBean)mapElement.getValue()); 
						//		tillAttributes2.put(ipAddress,  new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is  unreacheable", storeDetails.getStoreAddress()));
								hhtAttributesThirteenthMap.put(storeNumber, new FixedTillBean(fixedTillDetails.getFixedTillIpAddress(),fixedTillDetails.getFixedTillStoreNumber().toString(),fixedTillDetails.getFixedTillDiscoveryDate(),fixedTillDetails.getFixedTillDiscoveryTime(), fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(), fixedTillDetails.getFixedTillHostName()));

							}
						}
							
					     
				  }		
						
						

						// Check for eighth time the list of down tills and prepare fifteenth  map
						for (Entry<String, FixedTillBean> mapElement : hhtAttributesThirteenthMap.entrySet()) { 
			            String storeNumber = (String)mapElement.getKey(); 
			            FixedTillBean fixedTillDetails = ((FixedTillBean)mapElement.getValue()); 
			  
			            
			            InetAddress geek1 = InetAddress.getByName(storeNumber);
					    geek1.getHostAddress();
					    geek1.getHostName();
				//	    System.out.println("Sending Ping Request to " + ipAddress); 
					    if(geek1.isReachable(140)) {
					    	geek1.getHostName();
					    //	tillAttributes.put(ipAddress, new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up and running", storeDetails.getStoreAddress()));
					    }
					    else {
					    	hhtAttributesFourteenthMap.put(storeNumber, new FixedTillBean(fixedTillDetails.getFixedTillIpAddress(),fixedTillDetails.getFixedTillStoreNumber().toString(),fixedTillDetails.getFixedTillDiscoveryDate(),fixedTillDetails.getFixedTillDiscoveryTime(), fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(), fixedTillDetails.getFixedTillHostName()));

					    }
					}
						
						
						
						 //Compare between thirteen and fourteen Map and prepare a fifteen map with common values of down tills
						for(Entry<String, FixedTillBean> mapElement : hhtAttributesThirteenthMap.entrySet()) {
							for(Entry<String, FixedTillBean> mapElement1 : hhtAttributesFourteenthMap.entrySet()) {
							if(mapElement.getValue().equals(mapElement1.getValue())) {
							
								String storeNumber = (String)mapElement.getKey(); 
								FixedTillBean fixedTillDetails = ((FixedTillBean)mapElement.getValue()); 
						//		tillAttributes2.put(ipAddress,  new HallfordsTillStatusAttributes(storeDetails.getStoreName(), storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is  unreacheable", storeDetails.getStoreAddress()));
								hhtAttributesFifteenthMap.put(storeNumber, new FixedTillBean(fixedTillDetails.getFixedTillIpAddress(),fixedTillDetails.getFixedTillStoreNumber().toString(),fixedTillDetails.getFixedTillDiscoveryDate(),fixedTillDetails.getFixedTillDiscoveryTime(), fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(), fixedTillDetails.getFixedTillHostName()));

							}
						}
							
					     
				  }		
						
			

			  Collection<FixedTillBean> hhtCollections = hhtAttributesFifteenthMap.values();
		        System.out.println("Size of HHT" + hhtAttributesFifteenthMap.size());
		        List<FixedTillBean> list = new ArrayList<FixedTillBean>();
		        list.addAll(hhtCollections);
		        return list;
		}

}
