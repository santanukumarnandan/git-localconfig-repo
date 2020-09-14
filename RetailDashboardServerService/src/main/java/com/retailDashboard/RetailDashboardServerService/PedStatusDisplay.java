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

	Map<String, PedBean> pedAttributesparentMap = null;
	Map<String, PedBean> pedAttributesSecondtMap = null;
	Map<String, PedBean> pedAttributesThirdtMap = null;

	public List<PedBean> getPedStatus(List<HalPedMaster> pedMaster, List<Long> storeNumbers)
			throws UnknownHostException, IOException {

		pedAttributesparentMap = new HashMap<String, PedBean>();
		pedAttributesparentMap.clear();
		HashMap<String, PedBean> pedAttributesFirstMap = new HashMap<String, PedBean>();
		pedAttributesFirstMap.clear();
		pedAttributesSecondtMap = new HashMap<String, PedBean>();
		pedAttributesSecondtMap.clear();
		pedAttributesThirdtMap = new HashMap<String, PedBean>();
		pedAttributesThirdtMap.clear();

		HashMap<String, PedBean> pedAttributesFourthtMap = new HashMap<String, PedBean>();
		pedAttributesFourthtMap.clear();
		HashMap<String, PedBean> pedAttributesFifthtMap = new HashMap<String, PedBean>();
		pedAttributesFifthtMap.clear();
		HashMap<String, PedBean> pedAttributesSixthtMap = new HashMap<String, PedBean>();
		pedAttributesSixthtMap.clear();
		HashMap<String, PedBean> pedAttributesSeventhMap = new HashMap<String, PedBean>();
		pedAttributesSeventhMap.clear();

		HashMap<String, PedBean> pedAttributesEightMap = new HashMap<String, PedBean>();
		pedAttributesEightMap.clear();
		HashMap<String, PedBean> pedAttributesNnthMap = new HashMap<String, PedBean>();
		pedAttributesNnthMap.clear();
		HashMap<String, PedBean> pedAttributesTenthMap = new HashMap<String, PedBean>();
		pedAttributesTenthMap.clear();
		HashMap<String, PedBean> pedAttributesEleventhMap = new HashMap<String, PedBean>();
		pedAttributesSeventhMap.clear();

		HashMap<String, PedBean> pedAttributesTwelvethMap = new HashMap<String, PedBean>();
		pedAttributesTwelvethMap.clear();
		HashMap<String, PedBean> pedAttributesThirteenthMap = new HashMap<String, PedBean>();
		pedAttributesThirteenthMap.clear();
		HashMap<String, PedBean> pedAttributesFourteenthMap = new HashMap<String, PedBean>();
		pedAttributesFourteenthMap.clear();
		HashMap<String, PedBean> pedAttributesFifteenthMap = new HashMap<String, PedBean>();
		pedAttributesFifteenthMap.clear();

		// List 4 is being prepared. Next iterate this 8 times to find the exact down
		// Ped

		for (HalPedMaster pedMasterDetails : pedMaster) {
			pedAttributesparentMap.put(pedMasterDetails.getStoreNumber().toString(),
					new PedBean(pedMasterDetails.getStoreIpAddress(), pedMasterDetails.getStoreNumber(),
							pedMasterDetails.getDiscoveryDate(), "", pedMasterDetails.getStoreHostName(),
							pedMasterDetails.getDiscoveryTime(), pedMasterDetails.getRecordNumber(), "", "", ""));

		}

		// Check for first time the list of down ped and prepare first map
		for (Entry<String, PedBean> mapElement : pedAttributesparentMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PedBean pedDetails = ((PedBean) mapElement.getValue());

			InetAddress geek1 = InetAddress.getByName(ipAddress);
			geek1.getHostAddress();
			geek1.getHostName();
			// System.out.println("Sending Ping Request to " + ipAddress);
			if (geek1.isReachable(140)) {
				geek1.getHostName();
				// tillAttributes.put(ipAddress, new
				// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
				// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up
				// and running", storeDetails.getStoreAddress()));
			} else {
				pedAttributesFirstMap.put(ipAddress,
						new PedBean(pedDetails.getPedTillIpAddress(), pedDetails.getPedTillStoreNumber(),
								pedDetails.getPedTillPollingDate(), pedDetails.getPedTillstoreAddressLink(),
								pedDetails.getPedTillstoreName(), pedDetails.getPedTillPollingTime(),
								pedDetails.getPedTillPollingNumber(), pedDetails.getPedTillDateUp(),
								pedDetails.getPedTillTimeUp(), pedDetails.getPedTillDownSince()));

			}
		}
		
		// Check for second time the list of down ped and prepare second map

		for (Entry<String, PedBean> mapElement : pedAttributesFirstMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PedBean pedDetails = ((PedBean) mapElement.getValue());

			InetAddress geek1 = InetAddress.getByName(ipAddress);
			geek1.getHostAddress();
			geek1.getHostName();
			// System.out.println("Sending Ping Request to " + ipAddress);
			if (geek1.isReachable(140)) {
				geek1.getHostName();
				// tillAttributes.put(ipAddress, new
				// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
				// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up
				// and running", storeDetails.getStoreAddress()));
			} else {
				pedAttributesSecondtMap.put(ipAddress,
						new PedBean(pedDetails.getPedTillIpAddress(), pedDetails.getPedTillStoreNumber(),
								pedDetails.getPedTillPollingDate(), pedDetails.getPedTillstoreAddressLink(),
								pedDetails.getPedTillstoreName(), pedDetails.getPedTillPollingTime(),
								pedDetails.getPedTillPollingNumber(), pedDetails.getPedTillDateUp(),
								pedDetails.getPedTillTimeUp(), pedDetails.getPedTillDownSince()));

			}
		}
		
		// Compare between second and First Map and prepare a third map with common
		// values of down tills

		for (Entry<String, PedBean> mapElement : pedAttributesSecondtMap.entrySet()) {
			for (Entry<String, PedBean> mapElement1 : pedAttributesparentMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PedBean pedDetails = ((PedBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					pedAttributesThirdtMap.put(ipAddress,
							new PedBean(pedDetails.getPedTillIpAddress(), pedDetails.getPedTillStoreNumber(),
									pedDetails.getPedTillPollingDate(), pedDetails.getPedTillstoreAddressLink(),
									pedDetails.getPedTillstoreName(), pedDetails.getPedTillPollingTime(),
									pedDetails.getPedTillPollingNumber(), pedDetails.getPedTillDateUp(),
									pedDetails.getPedTillTimeUp(), pedDetails.getPedTillDownSince()));

				}
			}

		}
		
		
		
		// Check for third time the list of down tills and prepare fourth map
		
		
		for (Entry<String, PedBean> mapElement : pedAttributesThirdtMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PedBean pedDetails = ((PedBean) mapElement.getValue());

			InetAddress geek1 = InetAddress.getByName(ipAddress);
			geek1.getHostAddress();
			geek1.getHostName();
			// System.out.println("Sending Ping Request to " + ipAddress);
			if (geek1.isReachable(140)) {
				geek1.getHostName();
				// tillAttributes.put(ipAddress, new
				// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
				// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up
				// and running", storeDetails.getStoreAddress()));
			} else {
				pedAttributesFourthtMap.put(ipAddress,
						new PedBean(pedDetails.getPedTillIpAddress(), pedDetails.getPedTillStoreNumber(),
								pedDetails.getPedTillPollingDate(), pedDetails.getPedTillstoreAddressLink(),
								pedDetails.getPedTillstoreName(), pedDetails.getPedTillPollingTime(),
								pedDetails.getPedTillPollingNumber(), pedDetails.getPedTillDateUp(),
								pedDetails.getPedTillTimeUp(), pedDetails.getPedTillDownSince()));

			}
		}
		
		// Compare between third and Fourth Map and prepare a fifth map with common
		for (Entry<String, PedBean> mapElement : pedAttributesThirdtMap.entrySet()) {
			for (Entry<String, PedBean> mapElement1 : pedAttributesFourthtMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PedBean pedDetails = ((PedBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					pedAttributesFifthtMap.put(ipAddress,
							new PedBean(pedDetails.getPedTillIpAddress(), pedDetails.getPedTillStoreNumber(),
									pedDetails.getPedTillPollingDate(), pedDetails.getPedTillstoreAddressLink(),
									pedDetails.getPedTillstoreName(), pedDetails.getPedTillPollingTime(),
									pedDetails.getPedTillPollingNumber(), pedDetails.getPedTillDateUp(),
									pedDetails.getPedTillTimeUp(), pedDetails.getPedTillDownSince()));

				}
			}

		}
		
		// Check for fourth time the list of down tills and prepare sixth map
		for (Entry<String, PedBean> mapElement : pedAttributesFifthtMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PedBean pedDetails = ((PedBean) mapElement.getValue());

			InetAddress geek1 = InetAddress.getByName(ipAddress);
			geek1.getHostAddress();
			geek1.getHostName();
			// System.out.println("Sending Ping Request to " + ipAddress);
			if (geek1.isReachable(140)) {
				geek1.getHostName();
				// tillAttributes.put(ipAddress, new
				// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
				// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up
				// and running", storeDetails.getStoreAddress()));
			} else {
				pedAttributesSixthtMap.put(ipAddress,
						new PedBean(pedDetails.getPedTillIpAddress(), pedDetails.getPedTillStoreNumber(),
								pedDetails.getPedTillPollingDate(), pedDetails.getPedTillstoreAddressLink(),
								pedDetails.getPedTillstoreName(), pedDetails.getPedTillPollingTime(),
								pedDetails.getPedTillPollingNumber(), pedDetails.getPedTillDateUp(),
								pedDetails.getPedTillTimeUp(), pedDetails.getPedTillDownSince()));

			}
		}
		
		// Compare between fifth and sixth Map and prepare a seventh map with common
		for (Entry<String, PedBean> mapElement : pedAttributesFifthtMap.entrySet()) {
			for (Entry<String, PedBean> mapElement1 : pedAttributesSixthtMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PedBean pedDetails = ((PedBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					pedAttributesSeventhMap.put(ipAddress,
							new PedBean(pedDetails.getPedTillIpAddress(), pedDetails.getPedTillStoreNumber(),
									pedDetails.getPedTillPollingDate(), pedDetails.getPedTillstoreAddressLink(),
									pedDetails.getPedTillstoreName(), pedDetails.getPedTillPollingTime(),
									pedDetails.getPedTillPollingNumber(), pedDetails.getPedTillDateUp(),
									pedDetails.getPedTillTimeUp(), pedDetails.getPedTillDownSince()));

				}
			}

		}
		
		// Check for fifth time the list of down tills and prepare eight map
		for (Entry<String, PedBean> mapElement : pedAttributesSeventhMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PedBean pedDetails = ((PedBean) mapElement.getValue());

			InetAddress geek1 = InetAddress.getByName(ipAddress);
			geek1.getHostAddress();
			geek1.getHostName();
			// System.out.println("Sending Ping Request to " + ipAddress);
			if (geek1.isReachable(140)) {
				geek1.getHostName();
				// tillAttributes.put(ipAddress, new
				// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
				// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up
				// and running", storeDetails.getStoreAddress()));
			} else {
				pedAttributesEightMap.put(ipAddress,
						new PedBean(pedDetails.getPedTillIpAddress(), pedDetails.getPedTillStoreNumber(),
								pedDetails.getPedTillPollingDate(), pedDetails.getPedTillstoreAddressLink(),
								pedDetails.getPedTillstoreName(), pedDetails.getPedTillPollingTime(),
								pedDetails.getPedTillPollingNumber(), pedDetails.getPedTillDateUp(),
								pedDetails.getPedTillTimeUp(), pedDetails.getPedTillDownSince()));

			}
		}
		
		// Compare between seventh and eight Map and prepare a ninth map with common
		for (Entry<String, PedBean> mapElement : pedAttributesSeventhMap.entrySet()) {
			for (Entry<String, PedBean> mapElement1 : pedAttributesEightMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PedBean pedDetails = ((PedBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					pedAttributesNnthMap.put(ipAddress,
							new PedBean(pedDetails.getPedTillIpAddress(), pedDetails.getPedTillStoreNumber(),
									pedDetails.getPedTillPollingDate(), pedDetails.getPedTillstoreAddressLink(),
									pedDetails.getPedTillstoreName(), pedDetails.getPedTillPollingTime(),
									pedDetails.getPedTillPollingNumber(), pedDetails.getPedTillDateUp(),
									pedDetails.getPedTillTimeUp(), pedDetails.getPedTillDownSince()));

				}
			}

		}
		
		// Check for sixth time the list of down tills and prepare tenth map
		for (Entry<String, PedBean> mapElement : pedAttributesNnthMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PedBean pedDetails = ((PedBean) mapElement.getValue());

			InetAddress geek1 = InetAddress.getByName(ipAddress);
			geek1.getHostAddress();
			geek1.getHostName();
			// System.out.println("Sending Ping Request to " + ipAddress);
			if (geek1.isReachable(140)) {
				geek1.getHostName();
				// tillAttributes.put(ipAddress, new
				// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
				// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up
				// and running", storeDetails.getStoreAddress()));
			} else {
				pedAttributesTenthMap.put(ipAddress,
						new PedBean(pedDetails.getPedTillIpAddress(), pedDetails.getPedTillStoreNumber(),
								pedDetails.getPedTillPollingDate(), pedDetails.getPedTillstoreAddressLink(),
								pedDetails.getPedTillstoreName(), pedDetails.getPedTillPollingTime(),
								pedDetails.getPedTillPollingNumber(), pedDetails.getPedTillDateUp(),
								pedDetails.getPedTillTimeUp(), pedDetails.getPedTillDownSince()));

			}
		}
		
		// Compare between ninth and tenth Map and prepare a Eleventh map with common
		for (Entry<String, PedBean> mapElement : pedAttributesNnthMap.entrySet()) {
			for (Entry<String, PedBean> mapElement1 : pedAttributesTenthMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PedBean pedDetails = ((PedBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					pedAttributesEleventhMap.put(ipAddress,
							new PedBean(pedDetails.getPedTillIpAddress(), pedDetails.getPedTillStoreNumber(),
									pedDetails.getPedTillPollingDate(), pedDetails.getPedTillstoreAddressLink(),
									pedDetails.getPedTillstoreName(), pedDetails.getPedTillPollingTime(),
									pedDetails.getPedTillPollingNumber(), pedDetails.getPedTillDateUp(),
									pedDetails.getPedTillTimeUp(), pedDetails.getPedTillDownSince()));

				}
			}

		}
		
		// Check for seventh time the list of down tills and prepare twelveth map
		for (Entry<String, PedBean> mapElement : pedAttributesEleventhMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PedBean pedDetails = ((PedBean) mapElement.getValue());

			InetAddress geek1 = InetAddress.getByName(ipAddress);
			geek1.getHostAddress();
			geek1.getHostName();
			// System.out.println("Sending Ping Request to " + ipAddress);
			if (geek1.isReachable(140)) {
				geek1.getHostName();
				// tillAttributes.put(ipAddress, new
				// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
				// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up
				// and running", storeDetails.getStoreAddress()));
			} else {
				pedAttributesTwelvethMap.put(ipAddress,
						new PedBean(pedDetails.getPedTillIpAddress(), pedDetails.getPedTillStoreNumber(),
								pedDetails.getPedTillPollingDate(), pedDetails.getPedTillstoreAddressLink(),
								pedDetails.getPedTillstoreName(), pedDetails.getPedTillPollingTime(),
								pedDetails.getPedTillPollingNumber(), pedDetails.getPedTillDateUp(),
								pedDetails.getPedTillTimeUp(), pedDetails.getPedTillDownSince()));

			}
		}
		
		// Compare between eleventh and twelveth Map and prepare a thirteen map with
		for (Entry<String, PedBean> mapElement : pedAttributesEleventhMap.entrySet()) {
			for (Entry<String, PedBean> mapElement1 : pedAttributesTwelvethMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PedBean pedDetails = ((PedBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					pedAttributesThirteenthMap.put(ipAddress,
							new PedBean(pedDetails.getPedTillIpAddress(), pedDetails.getPedTillStoreNumber(),
									pedDetails.getPedTillPollingDate(), pedDetails.getPedTillstoreAddressLink(),
									pedDetails.getPedTillstoreName(), pedDetails.getPedTillPollingTime(),
									pedDetails.getPedTillPollingNumber(), pedDetails.getPedTillDateUp(),
									pedDetails.getPedTillTimeUp(), pedDetails.getPedTillDownSince()));

				}
			}

		}
		
		// Check for eighth time the list of down tills and prepare fourteen map
		for (Entry<String, PedBean> mapElement : pedAttributesThirteenthMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PedBean pedDetails = ((PedBean) mapElement.getValue());

			InetAddress geek1 = InetAddress.getByName(ipAddress);
			geek1.getHostAddress();
			geek1.getHostName();
			// System.out.println("Sending Ping Request to " + ipAddress);
			if (geek1.isReachable(140)) {
				geek1.getHostName();
				// tillAttributes.put(ipAddress, new
				// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
				// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Till is up
				// and running", storeDetails.getStoreAddress()));
			} else {
				pedAttributesFourteenthMap.put(ipAddress,
						new PedBean(pedDetails.getPedTillIpAddress(), pedDetails.getPedTillStoreNumber(),
								pedDetails.getPedTillPollingDate(), pedDetails.getPedTillstoreAddressLink(),
								pedDetails.getPedTillstoreName(), pedDetails.getPedTillPollingTime(),
								pedDetails.getPedTillPollingNumber(), pedDetails.getPedTillDateUp(),
								pedDetails.getPedTillTimeUp(), pedDetails.getPedTillDownSince()));

			}
		}
		
		// Compare between thirteen and fourteen Map and prepare a fifteen map with
		for (Entry<String, PedBean> mapElement : pedAttributesThirteenthMap.entrySet()) {
			for (Entry<String, PedBean> mapElement1 : pedAttributesFourteenthMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PedBean pedDetails = ((PedBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					pedAttributesFifteenthMap.put(ipAddress,
							new PedBean(pedDetails.getPedTillIpAddress(), pedDetails.getPedTillStoreNumber(),
									pedDetails.getPedTillPollingDate(), pedDetails.getPedTillstoreAddressLink(),
									pedDetails.getPedTillstoreName(), pedDetails.getPedTillPollingTime(),
									pedDetails.getPedTillPollingNumber(), pedDetails.getPedTillDateUp(),
									pedDetails.getPedTillTimeUp(), pedDetails.getPedTillDownSince()));

				}
			}

		}
		
		

		Collection<PedBean> hhtCollections = pedAttributesFifteenthMap.values();
		System.out.println("Size of HHT" + pedAttributesThirdtMap.size());
		List<PedBean> list = new ArrayList<PedBean>();
		list.addAll(hhtCollections);
		return list;
	}

}
