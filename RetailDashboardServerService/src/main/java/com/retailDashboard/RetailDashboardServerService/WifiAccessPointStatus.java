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

	Map<String, WifiAccessPointBean> wifiAttributesparentMap = null;
	Map<String, WifiAccessPointBean> wifiTillAttributesSecondtMap = null;
	Map<String, WifiAccessPointBean> wifiAttributesThirdtMap = null;

	public List<WifiAccessPointBean> getWifiAccessStatus(List<HalWifiPointMaster> halWifiPointMaster,
			List<Long> storeNumbers) throws UnknownHostException, IOException {

		wifiAttributesparentMap = new HashMap<String, WifiAccessPointBean>();
		wifiAttributesparentMap.clear();
		wifiTillAttributesSecondtMap = new HashMap<String, WifiAccessPointBean>();
		wifiTillAttributesSecondtMap.clear();
		wifiAttributesThirdtMap = new HashMap<String, WifiAccessPointBean>();
		wifiAttributesThirdtMap.clear();

		HashMap<String, WifiAccessPointBean> wifiAttributesFourthtMap = new HashMap<String, WifiAccessPointBean>();
		wifiAttributesFourthtMap.clear();
		HashMap<String, WifiAccessPointBean> wifiAttributesFifthtMap = new HashMap<String, WifiAccessPointBean>();
		wifiAttributesFifthtMap.clear();
		HashMap<String, WifiAccessPointBean> wifiAttributesSixthtMap = new HashMap<String, WifiAccessPointBean>();
		wifiAttributesSixthtMap.clear();
		HashMap<String, WifiAccessPointBean> wifiAttributesSeventhMap = new HashMap<String, WifiAccessPointBean>();
		wifiAttributesSeventhMap.clear();

		HashMap<String, WifiAccessPointBean> wifiAttributesEightMap = new HashMap<String, WifiAccessPointBean>();
		wifiAttributesEightMap.clear();
		HashMap<String, WifiAccessPointBean> wifiAttributesNnthMap = new HashMap<String, WifiAccessPointBean>();
		wifiAttributesNnthMap.clear();
		HashMap<String, WifiAccessPointBean> wifiAttributesTenthMap = new HashMap<String, WifiAccessPointBean>();
		wifiAttributesTenthMap.clear();
		HashMap<String, WifiAccessPointBean> wifiAttributesEleventhMap = new HashMap<String, WifiAccessPointBean>();
		wifiAttributesEleventhMap.clear();

		HashMap<String, WifiAccessPointBean> wifiAttributesTwelvethMap = new HashMap<String, WifiAccessPointBean>();
		wifiAttributesTwelvethMap.clear();
		HashMap<String, WifiAccessPointBean> wifiAttributesThirteenthMap = new HashMap<String, WifiAccessPointBean>();
		wifiAttributesThirteenthMap.clear();
		HashMap<String, WifiAccessPointBean> wifiAttributesFourteenthMap = new HashMap<String, WifiAccessPointBean>();
		wifiAttributesFourteenthMap.clear();
		HashMap<String, WifiAccessPointBean> wifiAttributesFifteenthMap = new HashMap<String, WifiAccessPointBean>();
		wifiAttributesFifteenthMap.clear();

		for (HalWifiPointMaster wifiMasterDetails : halWifiPointMaster) {
			wifiAttributesparentMap.put(wifiMasterDetails.getStoreNumber().toString(),
					new WifiAccessPointBean(wifiMasterDetails.getStoreIpAddress(), wifiMasterDetails.getStoreNumber(),
							wifiMasterDetails.getDiscoveryDate(), "", wifiMasterDetails.getStoreHostName(),
							wifiMasterDetails.getDiscoveryTime(), wifiMasterDetails.getRecordNumber(), "", "", ""));

		}

		for (Entry<String, WifiAccessPointBean> mapElement : wifiAttributesparentMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			WifiAccessPointBean wifiDetails = ((WifiAccessPointBean) mapElement.getValue());

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
				wifiAttributesparentMap.put(ipAddress, new WifiAccessPointBean(
						wifiDetails.getWifiAccessPointIpAddress(), wifiDetails.getWifiAccessPointStoreNumber(),
						wifiDetails.getWifiAccessPointPollingDate(), wifiDetails.getWifiAccessPointstoreAddressLink(),
						wifiDetails.getWifiAccessPointstoreName(), wifiDetails.getWifiAccessPointPollingTime(),
						wifiDetails.getWifiAccessPointPollingNumber(), wifiDetails.getWifiAccessPointlDateUp(),
						wifiDetails.getWifiAccessPointTimeUp(), wifiDetails.getWifiAccessPointDownSince()));

			}
		}

		for (Entry<String, WifiAccessPointBean> mapElement : wifiAttributesparentMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			WifiAccessPointBean wifiDetails = ((WifiAccessPointBean) mapElement.getValue());

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
				wifiTillAttributesSecondtMap.put(ipAddress, new WifiAccessPointBean(
						wifiDetails.getWifiAccessPointIpAddress(), wifiDetails.getWifiAccessPointStoreNumber(),
						wifiDetails.getWifiAccessPointPollingDate(), wifiDetails.getWifiAccessPointstoreAddressLink(),
						wifiDetails.getWifiAccessPointstoreName(), wifiDetails.getWifiAccessPointPollingTime(),
						wifiDetails.getWifiAccessPointPollingNumber(), wifiDetails.getWifiAccessPointlDateUp(),
						wifiDetails.getWifiAccessPointTimeUp(), wifiDetails.getWifiAccessPointDownSince()));

			}
		}

		for (Entry<String, WifiAccessPointBean> mapElement : wifiTillAttributesSecondtMap.entrySet()) {
			for (Entry<String, WifiAccessPointBean> mapElement1 : wifiAttributesparentMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					WifiAccessPointBean wifiDetails = ((WifiAccessPointBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					wifiAttributesThirdtMap.put(ipAddress, new WifiAccessPointBean(
							wifiDetails.getWifiAccessPointIpAddress(), wifiDetails.getWifiAccessPointStoreNumber(),
							wifiDetails.getWifiAccessPointPollingDate(),
							wifiDetails.getWifiAccessPointstoreAddressLink(), wifiDetails.getWifiAccessPointstoreName(),
							wifiDetails.getWifiAccessPointPollingTime(), wifiDetails.getWifiAccessPointPollingNumber(),
							wifiDetails.getWifiAccessPointlDateUp(), wifiDetails.getWifiAccessPointTimeUp(),
							wifiDetails.getWifiAccessPointDownSince()));

				}
			}

		}

		// Check for third time the list of down tills and prepare fourth map
		
		for (Entry<String, WifiAccessPointBean> mapElement : wifiAttributesThirdtMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			WifiAccessPointBean wifiDetails = ((WifiAccessPointBean) mapElement.getValue());

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
				wifiAttributesFourthtMap.put(ipAddress, new WifiAccessPointBean(
						wifiDetails.getWifiAccessPointIpAddress(), wifiDetails.getWifiAccessPointStoreNumber(),
						wifiDetails.getWifiAccessPointPollingDate(), wifiDetails.getWifiAccessPointstoreAddressLink(),
						wifiDetails.getWifiAccessPointstoreName(), wifiDetails.getWifiAccessPointPollingTime(),
						wifiDetails.getWifiAccessPointPollingNumber(), wifiDetails.getWifiAccessPointlDateUp(),
						wifiDetails.getWifiAccessPointTimeUp(), wifiDetails.getWifiAccessPointDownSince()));

			}
		}
		
		// Compare between third and Fourth Map and prepare a fifth map with common


		for (Entry<String, WifiAccessPointBean> mapElement : wifiAttributesThirdtMap.entrySet()) {
			for (Entry<String, WifiAccessPointBean> mapElement1 : wifiAttributesFourthtMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					WifiAccessPointBean wifiDetails = ((WifiAccessPointBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					wifiAttributesFifthtMap.put(ipAddress, new WifiAccessPointBean(
							wifiDetails.getWifiAccessPointIpAddress(), wifiDetails.getWifiAccessPointStoreNumber(),
							wifiDetails.getWifiAccessPointPollingDate(),
							wifiDetails.getWifiAccessPointstoreAddressLink(), wifiDetails.getWifiAccessPointstoreName(),
							wifiDetails.getWifiAccessPointPollingTime(), wifiDetails.getWifiAccessPointPollingNumber(),
							wifiDetails.getWifiAccessPointlDateUp(), wifiDetails.getWifiAccessPointTimeUp(),
							wifiDetails.getWifiAccessPointDownSince()));

				}
			}

		}
		
		// Check for fourth time the list of down tills and prepare sixth map

		for (Entry<String, WifiAccessPointBean> mapElement : wifiAttributesFifthtMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			WifiAccessPointBean wifiDetails = ((WifiAccessPointBean) mapElement.getValue());

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
				wifiAttributesSixthtMap.put(ipAddress, new WifiAccessPointBean(
						wifiDetails.getWifiAccessPointIpAddress(), wifiDetails.getWifiAccessPointStoreNumber(),
						wifiDetails.getWifiAccessPointPollingDate(), wifiDetails.getWifiAccessPointstoreAddressLink(),
						wifiDetails.getWifiAccessPointstoreName(), wifiDetails.getWifiAccessPointPollingTime(),
						wifiDetails.getWifiAccessPointPollingNumber(), wifiDetails.getWifiAccessPointlDateUp(),
						wifiDetails.getWifiAccessPointTimeUp(), wifiDetails.getWifiAccessPointDownSince()));

			}
		}

		// Compare between fifth and sixth Map and prepare a seventh map with common

		for (Entry<String, WifiAccessPointBean> mapElement : wifiAttributesFifthtMap.entrySet()) {
			for (Entry<String, WifiAccessPointBean> mapElement1 : wifiAttributesSixthtMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					WifiAccessPointBean wifiDetails = ((WifiAccessPointBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					wifiAttributesSeventhMap.put(ipAddress, new WifiAccessPointBean(
							wifiDetails.getWifiAccessPointIpAddress(), wifiDetails.getWifiAccessPointStoreNumber(),
							wifiDetails.getWifiAccessPointPollingDate(),
							wifiDetails.getWifiAccessPointstoreAddressLink(), wifiDetails.getWifiAccessPointstoreName(),
							wifiDetails.getWifiAccessPointPollingTime(), wifiDetails.getWifiAccessPointPollingNumber(),
							wifiDetails.getWifiAccessPointlDateUp(), wifiDetails.getWifiAccessPointTimeUp(),
							wifiDetails.getWifiAccessPointDownSince()));

				}
			}

		}
		
		// Check for fifth time the list of down tills and prepare eight map

		
		for (Entry<String, WifiAccessPointBean> mapElement : wifiAttributesSeventhMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			WifiAccessPointBean wifiDetails = ((WifiAccessPointBean) mapElement.getValue());

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
				wifiAttributesEightMap.put(ipAddress, new WifiAccessPointBean(
						wifiDetails.getWifiAccessPointIpAddress(), wifiDetails.getWifiAccessPointStoreNumber(),
						wifiDetails.getWifiAccessPointPollingDate(), wifiDetails.getWifiAccessPointstoreAddressLink(),
						wifiDetails.getWifiAccessPointstoreName(), wifiDetails.getWifiAccessPointPollingTime(),
						wifiDetails.getWifiAccessPointPollingNumber(), wifiDetails.getWifiAccessPointlDateUp(),
						wifiDetails.getWifiAccessPointTimeUp(), wifiDetails.getWifiAccessPointDownSince()));

			}
		}
		
		// Compare between seventh and eight Map and prepare a ninth map with common


		for (Entry<String, WifiAccessPointBean> mapElement : wifiAttributesSeventhMap.entrySet()) {
			for (Entry<String, WifiAccessPointBean> mapElement1 : wifiAttributesEightMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					WifiAccessPointBean wifiDetails = ((WifiAccessPointBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					wifiAttributesNnthMap.put(ipAddress, new WifiAccessPointBean(
							wifiDetails.getWifiAccessPointIpAddress(), wifiDetails.getWifiAccessPointStoreNumber(),
							wifiDetails.getWifiAccessPointPollingDate(),
							wifiDetails.getWifiAccessPointstoreAddressLink(), wifiDetails.getWifiAccessPointstoreName(),
							wifiDetails.getWifiAccessPointPollingTime(), wifiDetails.getWifiAccessPointPollingNumber(),
							wifiDetails.getWifiAccessPointlDateUp(), wifiDetails.getWifiAccessPointTimeUp(),
							wifiDetails.getWifiAccessPointDownSince()));

				}
			}

		}
		
		// Check for sixth time the list of down tills and prepare tenth map

		
		for (Entry<String, WifiAccessPointBean> mapElement : wifiAttributesNnthMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			WifiAccessPointBean wifiDetails = ((WifiAccessPointBean) mapElement.getValue());

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
				wifiAttributesTenthMap.put(ipAddress, new WifiAccessPointBean(
						wifiDetails.getWifiAccessPointIpAddress(), wifiDetails.getWifiAccessPointStoreNumber(),
						wifiDetails.getWifiAccessPointPollingDate(), wifiDetails.getWifiAccessPointstoreAddressLink(),
						wifiDetails.getWifiAccessPointstoreName(), wifiDetails.getWifiAccessPointPollingTime(),
						wifiDetails.getWifiAccessPointPollingNumber(), wifiDetails.getWifiAccessPointlDateUp(),
						wifiDetails.getWifiAccessPointTimeUp(), wifiDetails.getWifiAccessPointDownSince()));

			}
		}
		
		// Compare between ninth and tenth Map and prepare a Eleventh map with common


		for (Entry<String, WifiAccessPointBean> mapElement : wifiAttributesNnthMap.entrySet()) {
			for (Entry<String, WifiAccessPointBean> mapElement1 : wifiAttributesTenthMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					WifiAccessPointBean wifiDetails = ((WifiAccessPointBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					wifiAttributesEleventhMap.put(ipAddress, new WifiAccessPointBean(
							wifiDetails.getWifiAccessPointIpAddress(), wifiDetails.getWifiAccessPointStoreNumber(),
							wifiDetails.getWifiAccessPointPollingDate(),
							wifiDetails.getWifiAccessPointstoreAddressLink(), wifiDetails.getWifiAccessPointstoreName(),
							wifiDetails.getWifiAccessPointPollingTime(), wifiDetails.getWifiAccessPointPollingNumber(),
							wifiDetails.getWifiAccessPointlDateUp(), wifiDetails.getWifiAccessPointTimeUp(),
							wifiDetails.getWifiAccessPointDownSince()));

				}
			}

		}
		
		// Check for seventh time the list of down tills and prepare twelveth map

		
		for (Entry<String, WifiAccessPointBean> mapElement : wifiAttributesEleventhMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			WifiAccessPointBean wifiDetails = ((WifiAccessPointBean) mapElement.getValue());

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
				wifiAttributesTwelvethMap.put(ipAddress, new WifiAccessPointBean(
						wifiDetails.getWifiAccessPointIpAddress(), wifiDetails.getWifiAccessPointStoreNumber(),
						wifiDetails.getWifiAccessPointPollingDate(), wifiDetails.getWifiAccessPointstoreAddressLink(),
						wifiDetails.getWifiAccessPointstoreName(), wifiDetails.getWifiAccessPointPollingTime(),
						wifiDetails.getWifiAccessPointPollingNumber(), wifiDetails.getWifiAccessPointlDateUp(),
						wifiDetails.getWifiAccessPointTimeUp(), wifiDetails.getWifiAccessPointDownSince()));

			}
		}
		
		// Compare between eleventh and twelveth Map and prepare a thirteen map with


		for (Entry<String, WifiAccessPointBean> mapElement : wifiAttributesEleventhMap.entrySet()) {
			for (Entry<String, WifiAccessPointBean> mapElement1 : wifiAttributesTwelvethMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					WifiAccessPointBean wifiDetails = ((WifiAccessPointBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					wifiAttributesThirteenthMap.put(ipAddress, new WifiAccessPointBean(
							wifiDetails.getWifiAccessPointIpAddress(), wifiDetails.getWifiAccessPointStoreNumber(),
							wifiDetails.getWifiAccessPointPollingDate(),
							wifiDetails.getWifiAccessPointstoreAddressLink(), wifiDetails.getWifiAccessPointstoreName(),
							wifiDetails.getWifiAccessPointPollingTime(), wifiDetails.getWifiAccessPointPollingNumber(),
							wifiDetails.getWifiAccessPointlDateUp(), wifiDetails.getWifiAccessPointTimeUp(),
							wifiDetails.getWifiAccessPointDownSince()));

				}
			}

		}
		
		// Check for eighth time the list of down tills and prepare fourteen map

		
		for (Entry<String, WifiAccessPointBean> mapElement : wifiAttributesThirteenthMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			WifiAccessPointBean wifiDetails = ((WifiAccessPointBean) mapElement.getValue());

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
				wifiAttributesFourteenthMap.put(ipAddress, new WifiAccessPointBean(
						wifiDetails.getWifiAccessPointIpAddress(), wifiDetails.getWifiAccessPointStoreNumber(),
						wifiDetails.getWifiAccessPointPollingDate(), wifiDetails.getWifiAccessPointstoreAddressLink(),
						wifiDetails.getWifiAccessPointstoreName(), wifiDetails.getWifiAccessPointPollingTime(),
						wifiDetails.getWifiAccessPointPollingNumber(), wifiDetails.getWifiAccessPointlDateUp(),
						wifiDetails.getWifiAccessPointTimeUp(), wifiDetails.getWifiAccessPointDownSince()));

			}
		}
		
		// Compare between thirteen and fourteen Map and prepare a fifteen map with


		for (Entry<String, WifiAccessPointBean> mapElement : wifiAttributesThirteenthMap.entrySet()) {
			for (Entry<String, WifiAccessPointBean> mapElement1 : wifiAttributesFourteenthMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					WifiAccessPointBean wifiDetails = ((WifiAccessPointBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					wifiAttributesFifteenthMap.put(ipAddress, new WifiAccessPointBean(
							wifiDetails.getWifiAccessPointIpAddress(), wifiDetails.getWifiAccessPointStoreNumber(),
							wifiDetails.getWifiAccessPointPollingDate(),
							wifiDetails.getWifiAccessPointstoreAddressLink(), wifiDetails.getWifiAccessPointstoreName(),
							wifiDetails.getWifiAccessPointPollingTime(), wifiDetails.getWifiAccessPointPollingNumber(),
							wifiDetails.getWifiAccessPointlDateUp(), wifiDetails.getWifiAccessPointTimeUp(),
							wifiDetails.getWifiAccessPointDownSince()));

				}
			}

		}
		

		Collection<WifiAccessPointBean> wifiCollections = wifiAttributesFifteenthMap.values();
		System.out.println("Size of wifi" + wifiAttributesFifteenthMap.size());
		List<WifiAccessPointBean> list = new ArrayList<WifiAccessPointBean>();
		list.addAll(wifiCollections);
		return list;
	}

}
