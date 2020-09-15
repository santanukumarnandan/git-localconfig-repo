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

	Map<String, HHTAttributeBean> hhtAttributesparentMap = null;
	Map<String, HHTAttributeBean> hhtAttributesSecondtMap = null;
	Map<String, HHTAttributeBean> hhtAttributesThirdtMap = null;

	public List<HHTAttributeBean> getHHTStatus(List<HalHHTMaster> hhtMaster, List<Long> storeNumbers)
			throws UnknownHostException, IOException {

		hhtAttributesparentMap = new HashMap<String, HHTAttributeBean>();
		hhtAttributesparentMap.clear();
		hhtAttributesSecondtMap = new HashMap<String, HHTAttributeBean>();
		hhtAttributesSecondtMap.clear();
		hhtAttributesThirdtMap = new HashMap<String, HHTAttributeBean>();
		hhtAttributesThirdtMap.clear();

		HashMap<String, HHTAttributeBean> hhtAttributesFourthtMap = new HashMap<String, HHTAttributeBean>();
		hhtAttributesFourthtMap.clear();
		HashMap<String, HHTAttributeBean> hhtAttributesFifthtMap = new HashMap<String, HHTAttributeBean>();
		hhtAttributesFifthtMap.clear();
		HashMap<String, HHTAttributeBean> hhtAttributesSixthtMap = new HashMap<String, HHTAttributeBean>();
		hhtAttributesSixthtMap.clear();
		HashMap<String, HHTAttributeBean> hhtAttributesSeventhMap = new HashMap<String, HHTAttributeBean>();
		hhtAttributesSeventhMap.clear();

		HashMap<String, HHTAttributeBean> hhtAttributesEightMap = new HashMap<String, HHTAttributeBean>();
		hhtAttributesEightMap.clear();
		HashMap<String, HHTAttributeBean> hhtAttributesNnthMap = new HashMap<String, HHTAttributeBean>();
		hhtAttributesNnthMap.clear();
		HashMap<String, HHTAttributeBean> hhtAttributesTenthMap = new HashMap<String, HHTAttributeBean>();
		hhtAttributesTenthMap.clear();
		HashMap<String, HHTAttributeBean> hhtAttributesEleventhMap = new HashMap<String, HHTAttributeBean>();
		hhtAttributesEleventhMap.clear();

		HashMap<String, HHTAttributeBean> hhtAttributesTwelvethMap = new HashMap<String, HHTAttributeBean>();
		hhtAttributesTwelvethMap.clear();
		HashMap<String, HHTAttributeBean> hhtAttributesThirteenthMap = new HashMap<String, HHTAttributeBean>();
		hhtAttributesThirteenthMap.clear();
		HashMap<String, HHTAttributeBean> hhtAttributesFourteenthMap = new HashMap<String, HHTAttributeBean>();
		hhtAttributesFourteenthMap.clear();
		HashMap<String, HHTAttributeBean> hhtAttributesFifteenthMap = new HashMap<String, HHTAttributeBean>();
		hhtAttributesFifteenthMap.clear();

		// List 4 is being prepared. Next iterate this 8 times to find the exact down

		for (HalHHTMaster hhtMasterDetails : hhtMaster) {
			hhtAttributesparentMap.put(hhtMasterDetails.getStoreNumber().toString(),
					new HHTAttributeBean(hhtMasterDetails.getStoreIpAddress(), hhtMasterDetails.getStoreNumber(),
							hhtMasterDetails.getDiscoveryDate(), "", hhtMasterDetails.getStoreHostName(),
							hhtMasterDetails.getDiscoveryTime(), hhtMasterDetails.getRecordNumber(), "", "", ""));

		}

		for (Entry<String, HHTAttributeBean> mapElement : hhtAttributesparentMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			HHTAttributeBean hhtDetails = ((HHTAttributeBean) mapElement.getValue());

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
				hhtAttributesparentMap.put(ipAddress,
						new HHTAttributeBean(hhtDetails.getHhtIpAddress(), hhtDetails.getHhtStoreNumber(),
								hhtDetails.getHhtPollingDate(), hhtDetails.getHhtstoreAddressLink(),
								hhtDetails.getHhtstoreName(), hhtDetails.getHhtPollingTime(),
								hhtDetails.getHhtPollingNumber(), hhtDetails.getHhtDateUp(), hhtDetails.getHhtTimeUp(),
								hhtDetails.getHhtDownSince()));

			}
		}

		for (Entry<String, HHTAttributeBean> mapElement : hhtAttributesparentMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			HHTAttributeBean hhtDetails = ((HHTAttributeBean) mapElement.getValue());

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
				hhtAttributesSecondtMap.put(ipAddress,
						new HHTAttributeBean(hhtDetails.getHhtIpAddress(), hhtDetails.getHhtStoreNumber(),
								hhtDetails.getHhtPollingDate(), hhtDetails.getHhtstoreAddressLink(),
								hhtDetails.getHhtstoreName(), hhtDetails.getHhtPollingTime(),
								hhtDetails.getHhtPollingNumber(), hhtDetails.getHhtDateUp(), hhtDetails.getHhtTimeUp(),
								hhtDetails.getHhtDownSince()));

			}
		}

		for (Entry<String, HHTAttributeBean> mapElement : hhtAttributesSecondtMap.entrySet()) {
			for (Entry<String, HHTAttributeBean> mapElement1 : hhtAttributesparentMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					HHTAttributeBean hhtDetails = ((HHTAttributeBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesThirdtMap.put(ipAddress,
							new HHTAttributeBean(hhtDetails.getHhtIpAddress(), hhtDetails.getHhtStoreNumber(),
									hhtDetails.getHhtPollingDate(), hhtDetails.getHhtstoreAddressLink(),
									hhtDetails.getHhtstoreName(), hhtDetails.getHhtPollingTime(),
									hhtDetails.getHhtPollingNumber(), hhtDetails.getHhtDateUp(),
									hhtDetails.getHhtTimeUp(), hhtDetails.getHhtDownSince()));
				}
			}

		}

		// Check for third time the list of down tills and prepare fourth map
		
		for (Entry<String, HHTAttributeBean> mapElement : hhtAttributesThirdtMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			HHTAttributeBean hhtDetails = ((HHTAttributeBean) mapElement.getValue());

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
				hhtAttributesFourthtMap.put(ipAddress,
						new HHTAttributeBean(hhtDetails.getHhtIpAddress(), hhtDetails.getHhtStoreNumber(),
								hhtDetails.getHhtPollingDate(), hhtDetails.getHhtstoreAddressLink(),
								hhtDetails.getHhtstoreName(), hhtDetails.getHhtPollingTime(),
								hhtDetails.getHhtPollingNumber(), hhtDetails.getHhtDateUp(), hhtDetails.getHhtTimeUp(),
								hhtDetails.getHhtDownSince()));

			}
		}
		
		// Compare between third and Fourth Map and prepare a fifth map with common


		for (Entry<String, HHTAttributeBean> mapElement : hhtAttributesThirdtMap.entrySet()) {
			for (Entry<String, HHTAttributeBean> mapElement1 : hhtAttributesFourthtMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					HHTAttributeBean hhtDetails = ((HHTAttributeBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesFifthtMap.put(ipAddress,
							new HHTAttributeBean(hhtDetails.getHhtIpAddress(), hhtDetails.getHhtStoreNumber(),
									hhtDetails.getHhtPollingDate(), hhtDetails.getHhtstoreAddressLink(),
									hhtDetails.getHhtstoreName(), hhtDetails.getHhtPollingTime(),
									hhtDetails.getHhtPollingNumber(), hhtDetails.getHhtDateUp(),
									hhtDetails.getHhtTimeUp(), hhtDetails.getHhtDownSince()));
				}
			}

		}
		// Check for fourth time the list of down tills and prepare sixth map

		
		for (Entry<String, HHTAttributeBean> mapElement : hhtAttributesFifthtMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			HHTAttributeBean hhtDetails = ((HHTAttributeBean) mapElement.getValue());

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
				hhtAttributesSixthtMap.put(ipAddress,
						new HHTAttributeBean(hhtDetails.getHhtIpAddress(), hhtDetails.getHhtStoreNumber(),
								hhtDetails.getHhtPollingDate(), hhtDetails.getHhtstoreAddressLink(),
								hhtDetails.getHhtstoreName(), hhtDetails.getHhtPollingTime(),
								hhtDetails.getHhtPollingNumber(), hhtDetails.getHhtDateUp(), hhtDetails.getHhtTimeUp(),
								hhtDetails.getHhtDownSince()));

			}
		}
		
		// Compare between fifth and sixth Map and prepare a seventh map with common


		for (Entry<String, HHTAttributeBean> mapElement : hhtAttributesFifthtMap.entrySet()) {
			for (Entry<String, HHTAttributeBean> mapElement1 : hhtAttributesSixthtMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					HHTAttributeBean hhtDetails = ((HHTAttributeBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesSeventhMap.put(ipAddress,
							new HHTAttributeBean(hhtDetails.getHhtIpAddress(), hhtDetails.getHhtStoreNumber(),
									hhtDetails.getHhtPollingDate(), hhtDetails.getHhtstoreAddressLink(),
									hhtDetails.getHhtstoreName(), hhtDetails.getHhtPollingTime(),
									hhtDetails.getHhtPollingNumber(), hhtDetails.getHhtDateUp(),
									hhtDetails.getHhtTimeUp(), hhtDetails.getHhtDownSince()));
				}
			}

		}
		// Check for fifth time the list of down tills and prepare eight map

		
		for (Entry<String, HHTAttributeBean> mapElement : hhtAttributesSeventhMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			HHTAttributeBean hhtDetails = ((HHTAttributeBean) mapElement.getValue());

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
				hhtAttributesEightMap.put(ipAddress,
						new HHTAttributeBean(hhtDetails.getHhtIpAddress(), hhtDetails.getHhtStoreNumber(),
								hhtDetails.getHhtPollingDate(), hhtDetails.getHhtstoreAddressLink(),
								hhtDetails.getHhtstoreName(), hhtDetails.getHhtPollingTime(),
								hhtDetails.getHhtPollingNumber(), hhtDetails.getHhtDateUp(), hhtDetails.getHhtTimeUp(),
								hhtDetails.getHhtDownSince()));

			}
		}
		// Compare between seventh and eight Map and prepare a ninth map with common

		for (Entry<String, HHTAttributeBean> mapElement : hhtAttributesSeventhMap.entrySet()) {
			for (Entry<String, HHTAttributeBean> mapElement1 : hhtAttributesEightMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					HHTAttributeBean hhtDetails = ((HHTAttributeBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesNnthMap.put(ipAddress,
							new HHTAttributeBean(hhtDetails.getHhtIpAddress(), hhtDetails.getHhtStoreNumber(),
									hhtDetails.getHhtPollingDate(), hhtDetails.getHhtstoreAddressLink(),
									hhtDetails.getHhtstoreName(), hhtDetails.getHhtPollingTime(),
									hhtDetails.getHhtPollingNumber(), hhtDetails.getHhtDateUp(),
									hhtDetails.getHhtTimeUp(), hhtDetails.getHhtDownSince()));
				}
			}

		}
		// Check for sixth time the list of down tills and prepare tenth map

		
		for (Entry<String, HHTAttributeBean> mapElement : hhtAttributesNnthMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			HHTAttributeBean hhtDetails = ((HHTAttributeBean) mapElement.getValue());

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
				hhtAttributesTenthMap.put(ipAddress,
						new HHTAttributeBean(hhtDetails.getHhtIpAddress(), hhtDetails.getHhtStoreNumber(),
								hhtDetails.getHhtPollingDate(), hhtDetails.getHhtstoreAddressLink(),
								hhtDetails.getHhtstoreName(), hhtDetails.getHhtPollingTime(),
								hhtDetails.getHhtPollingNumber(), hhtDetails.getHhtDateUp(), hhtDetails.getHhtTimeUp(),
								hhtDetails.getHhtDownSince()));

			}
		}
		
		// Compare between ninth and tenth Map and prepare a Eleventh map with common


		for (Entry<String, HHTAttributeBean> mapElement : hhtAttributesNnthMap.entrySet()) {
			for (Entry<String, HHTAttributeBean> mapElement1 : hhtAttributesTenthMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					HHTAttributeBean hhtDetails = ((HHTAttributeBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesEleventhMap.put(ipAddress,
							new HHTAttributeBean(hhtDetails.getHhtIpAddress(), hhtDetails.getHhtStoreNumber(),
									hhtDetails.getHhtPollingDate(), hhtDetails.getHhtstoreAddressLink(),
									hhtDetails.getHhtstoreName(), hhtDetails.getHhtPollingTime(),
									hhtDetails.getHhtPollingNumber(), hhtDetails.getHhtDateUp(),
									hhtDetails.getHhtTimeUp(), hhtDetails.getHhtDownSince()));
				}
			}

		}

		// Check for seventh time the list of down tills and prepare twelveth map

		
		for (Entry<String, HHTAttributeBean> mapElement : hhtAttributesEleventhMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			HHTAttributeBean hhtDetails = ((HHTAttributeBean) mapElement.getValue());

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
				hhtAttributesTwelvethMap.put(ipAddress,
						new HHTAttributeBean(hhtDetails.getHhtIpAddress(), hhtDetails.getHhtStoreNumber(),
								hhtDetails.getHhtPollingDate(), hhtDetails.getHhtstoreAddressLink(),
								hhtDetails.getHhtstoreName(), hhtDetails.getHhtPollingTime(),
								hhtDetails.getHhtPollingNumber(), hhtDetails.getHhtDateUp(), hhtDetails.getHhtTimeUp(),
								hhtDetails.getHhtDownSince()));

			}
		}
		
		// Compare between eleventh and twelveth Map and prepare a thirteen map with


		for (Entry<String, HHTAttributeBean> mapElement : hhtAttributesEleventhMap.entrySet()) {
			for (Entry<String, HHTAttributeBean> mapElement1 : hhtAttributesTwelvethMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					HHTAttributeBean hhtDetails = ((HHTAttributeBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesThirteenthMap.put(ipAddress,
							new HHTAttributeBean(hhtDetails.getHhtIpAddress(), hhtDetails.getHhtStoreNumber(),
									hhtDetails.getHhtPollingDate(), hhtDetails.getHhtstoreAddressLink(),
									hhtDetails.getHhtstoreName(), hhtDetails.getHhtPollingTime(),
									hhtDetails.getHhtPollingNumber(), hhtDetails.getHhtDateUp(),
									hhtDetails.getHhtTimeUp(), hhtDetails.getHhtDownSince()));
				}
			}

		}
		// Check for eighth time the list of down tills and prepare fourteen map

		
		for (Entry<String, HHTAttributeBean> mapElement : hhtAttributesThirteenthMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			HHTAttributeBean hhtDetails = ((HHTAttributeBean) mapElement.getValue());

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
				hhtAttributesFourteenthMap.put(ipAddress,
						new HHTAttributeBean(hhtDetails.getHhtIpAddress(), hhtDetails.getHhtStoreNumber(),
								hhtDetails.getHhtPollingDate(), hhtDetails.getHhtstoreAddressLink(),
								hhtDetails.getHhtstoreName(), hhtDetails.getHhtPollingTime(),
								hhtDetails.getHhtPollingNumber(), hhtDetails.getHhtDateUp(), hhtDetails.getHhtTimeUp(),
								hhtDetails.getHhtDownSince()));

			}
		}
		
		// Compare between thirteen and fourteen Map and prepare a fifteen map with


		for (Entry<String, HHTAttributeBean> mapElement : hhtAttributesThirteenthMap.entrySet()) {
			for (Entry<String, HHTAttributeBean> mapElement1 : hhtAttributesFourteenthMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					HHTAttributeBean hhtDetails = ((HHTAttributeBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesFifteenthMap.put(ipAddress,
							new HHTAttributeBean(hhtDetails.getHhtIpAddress(), hhtDetails.getHhtStoreNumber(),
									hhtDetails.getHhtPollingDate(), hhtDetails.getHhtstoreAddressLink(),
									hhtDetails.getHhtstoreName(), hhtDetails.getHhtPollingTime(),
									hhtDetails.getHhtPollingNumber(), hhtDetails.getHhtDateUp(),
									hhtDetails.getHhtTimeUp(), hhtDetails.getHhtDownSince()));
				}
			}

		}


		Collection<HHTAttributeBean> hhtCollections = hhtAttributesFifteenthMap.values();
		System.out.println("Size of HHT" + hhtAttributesFifteenthMap.size());
		List<HHTAttributeBean> list = new ArrayList<HHTAttributeBean>();
		list.addAll(hhtCollections);
		return list;
	}
}
