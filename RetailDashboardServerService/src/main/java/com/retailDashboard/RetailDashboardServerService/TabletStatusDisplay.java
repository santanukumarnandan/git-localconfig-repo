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

	Map<String, TabletBean> tabletAttributesparentMap = null;
	Map<String, TabletBean> tabletAttributesSecondtMap = null;
	Map<String, TabletBean> tabletAttributesThirdtMap = null;

	public List<TabletBean> getTabletStatus(List<HalTabletMaster> tabletMaster, List<Long> storeNumbers)
			throws UnknownHostException, IOException {

		tabletAttributesparentMap = new HashMap<String, TabletBean>();
		tabletAttributesparentMap.clear();
		tabletAttributesSecondtMap = new HashMap<String, TabletBean>();
		tabletAttributesSecondtMap.clear();
		tabletAttributesThirdtMap = new HashMap<String, TabletBean>();
		tabletAttributesThirdtMap.clear();

		HashMap<String, TabletBean> pedAttributesFourthtMap = new HashMap<String, TabletBean>();
		pedAttributesFourthtMap.clear();
		HashMap<String, TabletBean> pedAttributesFifthtMap = new HashMap<String, TabletBean>();
		pedAttributesFifthtMap.clear();
		HashMap<String, TabletBean> pedAttributesSixthtMap = new HashMap<String, TabletBean>();
		pedAttributesSixthtMap.clear();
		HashMap<String, TabletBean> pedAttributesSeventhMap = new HashMap<String, TabletBean>();
		pedAttributesSeventhMap.clear();

		HashMap<String, TabletBean> pedAttributesEightMap = new HashMap<String, TabletBean>();
		pedAttributesEightMap.clear();
		HashMap<String, TabletBean> pedAttributesNnthMap = new HashMap<String, TabletBean>();
		pedAttributesNnthMap.clear();
		HashMap<String, TabletBean> pedAttributesTenthMap = new HashMap<String, TabletBean>();
		pedAttributesTenthMap.clear();
		HashMap<String, TabletBean> pedAttributesEleventhMap = new HashMap<String, TabletBean>();
		pedAttributesSeventhMap.clear();

		HashMap<String, TabletBean> pedAttributesTwelvethMap = new HashMap<String, TabletBean>();
		pedAttributesTwelvethMap.clear();
		HashMap<String, TabletBean> pedAttributesThirteenthMap = new HashMap<String, TabletBean>();
		pedAttributesThirteenthMap.clear();
		HashMap<String, TabletBean> pedAttributesFourteenthMap = new HashMap<String, TabletBean>();
		pedAttributesFourteenthMap.clear();
		HashMap<String, TabletBean> pedAttributesFifteenthMap = new HashMap<String, TabletBean>();
		pedAttributesFifteenthMap.clear();

		// List 4 is being prepared. Next iterate this 8 times to find the exact down
		// Tablet

		for (HalTabletMaster tabletMasterDetails : tabletMaster) {
			tabletAttributesparentMap.put(tabletMasterDetails.getStoreNumber().toString(),
					new TabletBean(tabletMasterDetails.getStoreIpAddress(), tabletMasterDetails.getStoreNumber(),
							tabletMasterDetails.getDiscoveryDate(), "", tabletMasterDetails.getStoreHostName(),
							tabletMasterDetails.getDiscoveryTime(), tabletMasterDetails.getRecordNumber(), "", "", ""));

		}

		for (Entry<String, TabletBean> mapElement : tabletAttributesparentMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			TabletBean tabletDetails = ((TabletBean) mapElement.getValue());

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
				tabletAttributesparentMap.put(ipAddress,
						new TabletBean(tabletDetails.getTabletTillIpAddress(), tabletDetails.getTabletTillStoreNumber(),
								tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillstoreAddressLink(),
								tabletDetails.getTabletTillstoreName(), tabletDetails.getTabletTillPollingTime(),
								tabletDetails.getTabletTillPollingNumber(), tabletDetails.getTabletTillPollingDate(),
								tabletDetails.getTabletTillDateUp(), tabletDetails.getTabletTillDownSince()));

			}
		}

		for (Entry<String, TabletBean> mapElement : tabletAttributesparentMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			TabletBean tabletDetails = ((TabletBean) mapElement.getValue());

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
				tabletAttributesSecondtMap.put(ipAddress,
						new TabletBean(tabletDetails.getTabletTillIpAddress(), tabletDetails.getTabletTillStoreNumber(),
								tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillstoreAddressLink(),
								tabletDetails.getTabletTillstoreName(), tabletDetails.getTabletTillPollingTime(),
								tabletDetails.getTabletTillPollingNumber(), tabletDetails.getTabletTillPollingDate(),
								tabletDetails.getTabletTillDateUp(), tabletDetails.getTabletTillDownSince()));

			}
		}

		for (Entry<String, TabletBean> mapElement : tabletAttributesSecondtMap.entrySet()) {
			for (Entry<String, TabletBean> mapElement1 : tabletAttributesparentMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					TabletBean tabletDetails = ((TabletBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					tabletAttributesThirdtMap.put(ipAddress, new TabletBean(tabletDetails.getTabletTillIpAddress(),
							tabletDetails.getTabletTillStoreNumber(), tabletDetails.getTabletTillPollingDate(),
							tabletDetails.getTabletTillstoreAddressLink(), tabletDetails.getTabletTillstoreName(),
							tabletDetails.getTabletTillPollingTime(), tabletDetails.getTabletTillPollingNumber(),
							tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillDateUp(),
							tabletDetails.getTabletTillDownSince()));

				}
			}

		}
		
		// Check for third time the list of down tills and prepare fourth map

		
		for (Entry<String, TabletBean> mapElement : tabletAttributesThirdtMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			TabletBean tabletDetails = ((TabletBean) mapElement.getValue());

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
						new TabletBean(tabletDetails.getTabletTillIpAddress(), tabletDetails.getTabletTillStoreNumber(),
								tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillstoreAddressLink(),
								tabletDetails.getTabletTillstoreName(), tabletDetails.getTabletTillPollingTime(),
								tabletDetails.getTabletTillPollingNumber(), tabletDetails.getTabletTillPollingDate(),
								tabletDetails.getTabletTillDateUp(), tabletDetails.getTabletTillDownSince()));

			}
		}

		// Compare between third and Fourth Map and prepare a fifth map with common

		
		for (Entry<String, TabletBean> mapElement : tabletAttributesThirdtMap.entrySet()) {
			for (Entry<String, TabletBean> mapElement1 : pedAttributesFourthtMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					TabletBean tabletDetails = ((TabletBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					pedAttributesFifthtMap.put(ipAddress, new TabletBean(tabletDetails.getTabletTillIpAddress(),
							tabletDetails.getTabletTillStoreNumber(), tabletDetails.getTabletTillPollingDate(),
							tabletDetails.getTabletTillstoreAddressLink(), tabletDetails.getTabletTillstoreName(),
							tabletDetails.getTabletTillPollingTime(), tabletDetails.getTabletTillPollingNumber(),
							tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillDateUp(),
							tabletDetails.getTabletTillDownSince()));

				}
			}

		}
		
		// Check for fourth time the list of down tills and prepare sixth map

		for (Entry<String, TabletBean> mapElement : pedAttributesFifthtMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			TabletBean tabletDetails = ((TabletBean) mapElement.getValue());

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
						new TabletBean(tabletDetails.getTabletTillIpAddress(), tabletDetails.getTabletTillStoreNumber(),
								tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillstoreAddressLink(),
								tabletDetails.getTabletTillstoreName(), tabletDetails.getTabletTillPollingTime(),
								tabletDetails.getTabletTillPollingNumber(), tabletDetails.getTabletTillPollingDate(),
								tabletDetails.getTabletTillDateUp(), tabletDetails.getTabletTillDownSince()));

			}
		}

		// Compare between fifth and sixth Map and prepare a seventh map with common

		for (Entry<String, TabletBean> mapElement : pedAttributesFifthtMap.entrySet()) {
			for (Entry<String, TabletBean> mapElement1 : pedAttributesSixthtMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					TabletBean tabletDetails = ((TabletBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					pedAttributesSeventhMap.put(ipAddress, new TabletBean(tabletDetails.getTabletTillIpAddress(),
							tabletDetails.getTabletTillStoreNumber(), tabletDetails.getTabletTillPollingDate(),
							tabletDetails.getTabletTillstoreAddressLink(), tabletDetails.getTabletTillstoreName(),
							tabletDetails.getTabletTillPollingTime(), tabletDetails.getTabletTillPollingNumber(),
							tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillDateUp(),
							tabletDetails.getTabletTillDownSince()));

				}
			}

		}
		
		
		// Check for fifth time the list of down tills and prepare eight map

		for (Entry<String, TabletBean> mapElement : pedAttributesSeventhMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			TabletBean tabletDetails = ((TabletBean) mapElement.getValue());

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
						new TabletBean(tabletDetails.getTabletTillIpAddress(), tabletDetails.getTabletTillStoreNumber(),
								tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillstoreAddressLink(),
								tabletDetails.getTabletTillstoreName(), tabletDetails.getTabletTillPollingTime(),
								tabletDetails.getTabletTillPollingNumber(), tabletDetails.getTabletTillPollingDate(),
								tabletDetails.getTabletTillDateUp(), tabletDetails.getTabletTillDownSince()));

			}
		}

		// Compare between seventh and eight Map and prepare a ninth map with common
		for (Entry<String, TabletBean> mapElement : pedAttributesSeventhMap.entrySet()) {
			for (Entry<String, TabletBean> mapElement1 : pedAttributesEightMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					TabletBean tabletDetails = ((TabletBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					pedAttributesNnthMap.put(ipAddress, new TabletBean(tabletDetails.getTabletTillIpAddress(),
							tabletDetails.getTabletTillStoreNumber(), tabletDetails.getTabletTillPollingDate(),
							tabletDetails.getTabletTillstoreAddressLink(), tabletDetails.getTabletTillstoreName(),
							tabletDetails.getTabletTillPollingTime(), tabletDetails.getTabletTillPollingNumber(),
							tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillDateUp(),
							tabletDetails.getTabletTillDownSince()));

				}
			}

		}
		
		// Check for sixth time the list of down tills and prepare tenth map

		
		for (Entry<String, TabletBean> mapElement : pedAttributesNnthMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			TabletBean tabletDetails = ((TabletBean) mapElement.getValue());

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
						new TabletBean(tabletDetails.getTabletTillIpAddress(), tabletDetails.getTabletTillStoreNumber(),
								tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillstoreAddressLink(),
								tabletDetails.getTabletTillstoreName(), tabletDetails.getTabletTillPollingTime(),
								tabletDetails.getTabletTillPollingNumber(), tabletDetails.getTabletTillPollingDate(),
								tabletDetails.getTabletTillDateUp(), tabletDetails.getTabletTillDownSince()));

			}
		}

		// Compare between ninth and tenth Map and prepare a Eleventh map with common

		
		for (Entry<String, TabletBean> mapElement : pedAttributesNnthMap.entrySet()) {
			for (Entry<String, TabletBean> mapElement1 : pedAttributesTenthMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					TabletBean tabletDetails = ((TabletBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					pedAttributesEleventhMap.put(ipAddress, new TabletBean(tabletDetails.getTabletTillIpAddress(),
							tabletDetails.getTabletTillStoreNumber(), tabletDetails.getTabletTillPollingDate(),
							tabletDetails.getTabletTillstoreAddressLink(), tabletDetails.getTabletTillstoreName(),
							tabletDetails.getTabletTillPollingTime(), tabletDetails.getTabletTillPollingNumber(),
							tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillDateUp(),
							tabletDetails.getTabletTillDownSince()));

				}
			}

		}
		
		// Check for seventh time the list of down tills and prepare twelveth map

		
		for (Entry<String, TabletBean> mapElement : pedAttributesEleventhMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			TabletBean tabletDetails = ((TabletBean) mapElement.getValue());

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
						new TabletBean(tabletDetails.getTabletTillIpAddress(), tabletDetails.getTabletTillStoreNumber(),
								tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillstoreAddressLink(),
								tabletDetails.getTabletTillstoreName(), tabletDetails.getTabletTillPollingTime(),
								tabletDetails.getTabletTillPollingNumber(), tabletDetails.getTabletTillPollingDate(),
								tabletDetails.getTabletTillDateUp(), tabletDetails.getTabletTillDownSince()));

			}
		}
		
		// Compare between eleventh and twelveth Map and prepare a thirteen map with


		for (Entry<String, TabletBean> mapElement : pedAttributesEleventhMap.entrySet()) {
			for (Entry<String, TabletBean> mapElement1 : pedAttributesTwelvethMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					TabletBean tabletDetails = ((TabletBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					pedAttributesThirteenthMap.put(ipAddress, new TabletBean(tabletDetails.getTabletTillIpAddress(),
							tabletDetails.getTabletTillStoreNumber(), tabletDetails.getTabletTillPollingDate(),
							tabletDetails.getTabletTillstoreAddressLink(), tabletDetails.getTabletTillstoreName(),
							tabletDetails.getTabletTillPollingTime(), tabletDetails.getTabletTillPollingNumber(),
							tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillDateUp(),
							tabletDetails.getTabletTillDownSince()));

				}
			}

		}
		
		// Check for eighth time the list of down tills and prepare fourteen map

		
		for (Entry<String, TabletBean> mapElement : pedAttributesThirteenthMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			TabletBean tabletDetails = ((TabletBean) mapElement.getValue());

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
						new TabletBean(tabletDetails.getTabletTillIpAddress(), tabletDetails.getTabletTillStoreNumber(),
								tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillstoreAddressLink(),
								tabletDetails.getTabletTillstoreName(), tabletDetails.getTabletTillPollingTime(),
								tabletDetails.getTabletTillPollingNumber(), tabletDetails.getTabletTillPollingDate(),
								tabletDetails.getTabletTillDateUp(), tabletDetails.getTabletTillDownSince()));

			}
		}
		
		// Compare between thirteen and fourteen Map and prepare a fifteen map with


		for (Entry<String, TabletBean> mapElement : pedAttributesThirteenthMap.entrySet()) {
			for (Entry<String, TabletBean> mapElement1 : pedAttributesFourteenthMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					TabletBean tabletDetails = ((TabletBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					pedAttributesFifteenthMap.put(ipAddress, new TabletBean(tabletDetails.getTabletTillIpAddress(),
							tabletDetails.getTabletTillStoreNumber(), tabletDetails.getTabletTillPollingDate(),
							tabletDetails.getTabletTillstoreAddressLink(), tabletDetails.getTabletTillstoreName(),
							tabletDetails.getTabletTillPollingTime(), tabletDetails.getTabletTillPollingNumber(),
							tabletDetails.getTabletTillPollingDate(), tabletDetails.getTabletTillDateUp(),
							tabletDetails.getTabletTillDownSince()));

				}
			}

		}
		
		
		

		Collection<TabletBean> hhtCollections = pedAttributesFifteenthMap.values();
		System.out.println("Size of HHT" + pedAttributesFifteenthMap.size());
		List<TabletBean> list = new ArrayList<TabletBean>();
		list.addAll(hhtCollections);
		return list;
	}

}
