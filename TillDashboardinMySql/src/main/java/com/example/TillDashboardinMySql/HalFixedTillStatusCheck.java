package com.example.TillDashboardinMySql;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class HalFixedTillStatusCheck {

	


	Map<String, HalfordsFixedTillBean> fixedTillAttributesparentMap = null;
	Map<String, HalfordsFixedTillBean> fixedTillAttributesSecondtMap = null;
	Map<String, HalfordsFixedTillBean> hhtAttributesThirdtMap = null;

	public List<HalfordsFixedTillBean> getFixedTillStatus(List<HalfordsFixedTillMaster> fixedTillMaster, List<Long> storeNumbers)
			throws UnknownHostException, IOException {

		fixedTillAttributesparentMap = new HashMap<String, HalfordsFixedTillBean>();
		fixedTillAttributesparentMap.clear();
		HashMap<String, HalfordsFixedTillBean> fixedTillAttributesFirstMap = new HashMap<String, HalfordsFixedTillBean>();
		fixedTillAttributesFirstMap.clear();
		fixedTillAttributesSecondtMap = new HashMap<String, HalfordsFixedTillBean>();
		fixedTillAttributesSecondtMap.clear();
		hhtAttributesThirdtMap = new HashMap<String, HalfordsFixedTillBean>();
		hhtAttributesThirdtMap.clear();
		HashMap<String, HalfordsFixedTillBean> hhtAttributesFourthtMap = new HashMap<String, HalfordsFixedTillBean>();
		hhtAttributesFourthtMap.clear();
		HashMap<String, HalfordsFixedTillBean> hhtAttributesFifthtMap = new HashMap<String, HalfordsFixedTillBean>();
		hhtAttributesFifthtMap.clear();
		HashMap<String, HalfordsFixedTillBean> hhtAttributesSixthtMap = new HashMap<String, HalfordsFixedTillBean>();
		hhtAttributesSixthtMap.clear();
		HashMap<String, HalfordsFixedTillBean> hhtAttributesSeventhMap = new HashMap<String, HalfordsFixedTillBean>();
		hhtAttributesSeventhMap.clear();

		HashMap<String, HalfordsFixedTillBean> hhtAttributesEightMap = new HashMap<String, HalfordsFixedTillBean>();
		hhtAttributesEightMap.clear();
		HashMap<String, HalfordsFixedTillBean> hhtAttributesNnthMap = new HashMap<String, HalfordsFixedTillBean>();
		hhtAttributesNnthMap.clear();
		HashMap<String, HalfordsFixedTillBean> hhtAttributesTenthMap = new HashMap<String, HalfordsFixedTillBean>();
		hhtAttributesTenthMap.clear();
		HashMap<String, HalfordsFixedTillBean> hhtAttributesEleventhMap = new HashMap<String, HalfordsFixedTillBean>();
		hhtAttributesSeventhMap.clear();

		HashMap<String, HalfordsFixedTillBean> hhtAttributesTwelvethMap = new HashMap<String, HalfordsFixedTillBean>();
		hhtAttributesTwelvethMap.clear();
		HashMap<String, HalfordsFixedTillBean> hhtAttributesThirteenthMap = new HashMap<String, HalfordsFixedTillBean>();
		hhtAttributesThirteenthMap.clear();
		HashMap<String, HalfordsFixedTillBean> hhtAttributesFourteenthMap = new HashMap<String, HalfordsFixedTillBean>();
		hhtAttributesFourteenthMap.clear();
		HashMap<String, HalfordsFixedTillBean> hhtAttributesFifteenthMap = new HashMap<String, HalfordsFixedTillBean>();
		hhtAttributesFifteenthMap.clear();

		// List 4 is being prepared. Next iterate this 8 times to find the exact down
		// tills

		for (HalfordsFixedTillMaster HalfordsFixedTillMaster : fixedTillMaster) {
			fixedTillAttributesparentMap.put(HalfordsFixedTillMaster.getStoreNumber().toString(),
					new HalfordsFixedTillBean(HalfordsFixedTillMaster.getStoreIpAddress(),
							HalfordsFixedTillMaster.getStoreNumber().toString(), HalfordsFixedTillMaster.getDiscoveryDate(),
							HalfordsFixedTillMaster.getDiscoveryTime(), HalfordsFixedTillMaster.getRecordNumber(),
							HalfordsFixedTillMaster.getIsActive(), HalfordsFixedTillMaster.getStoreHostName()));

		}

		// Check for first time the list of down tills and prepare first map
		System.out.println("Size" + fixedTillAttributesparentMap.size());
		for (Entry<String, HalfordsFixedTillBean> mapElement : fixedTillAttributesparentMap.entrySet()) {
			String storeNumber = (String) mapElement.getKey();
			HalfordsFixedTillBean fixedTillDetails = ((HalfordsFixedTillBean) mapElement.getValue());
			String ipaddress = fixedTillDetails.getFixedTillIpAddress();
			InetAddress geek1 = InetAddress.getByName(ipaddress);
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
				fixedTillAttributesFirstMap.put(storeNumber, new HalfordsFixedTillBean(fixedTillDetails.getFixedTillIpAddress(),
						fixedTillDetails.getFixedTillStoreNumber().toString(),
						fixedTillDetails.getFixedTillDiscoveryDate(), fixedTillDetails.getFixedTillDiscoveryTime(),
						fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(),
						fixedTillDetails.getFixedTillHostName()));

			}
		}

		// Check for second time the list of down tills and prepare second map
		for (Entry<String, HalfordsFixedTillBean> mapElement : fixedTillAttributesFirstMap.entrySet()) {
			String storeNumber = (String) mapElement.getKey();
			HalfordsFixedTillBean fixedTillDetails = ((HalfordsFixedTillBean) mapElement.getValue());

			String ipaddress = fixedTillDetails.getFixedTillIpAddress();
			InetAddress geek1 = InetAddress.getByName(ipaddress);
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
				fixedTillAttributesSecondtMap.put(storeNumber, new HalfordsFixedTillBean(
						fixedTillDetails.getFixedTillIpAddress(), fixedTillDetails.getFixedTillStoreNumber().toString(),
						fixedTillDetails.getFixedTillDiscoveryDate(), fixedTillDetails.getFixedTillDiscoveryTime(),
						fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(),
						fixedTillDetails.getFixedTillHostName()));

			}
		}

		// Compare between second and First Map and prepare a third map with common
		// values of down tills
		for (Entry<String, HalfordsFixedTillBean> mapElement : fixedTillAttributesSecondtMap.entrySet()) {
			for (Entry<String, HalfordsFixedTillBean> mapElement1 : fixedTillAttributesFirstMap.entrySet()) {
				if (mapElement.getValue().getFixedTillStoreNumber().equals(mapElement1.getValue().getFixedTillStoreNumber())) {

					String storeNumber = (String) mapElement.getKey();
					HalfordsFixedTillBean fixedTillDetails = ((HalfordsFixedTillBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));.
					hhtAttributesThirdtMap.put(storeNumber, new HalfordsFixedTillBean(fixedTillDetails.getFixedTillIpAddress(),
							fixedTillDetails.getFixedTillStoreNumber().toString(),
							fixedTillDetails.getFixedTillDiscoveryDate(), fixedTillDetails.getFixedTillDiscoveryTime(),
							fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(),
							fixedTillDetails.getFixedTillHostName()));

				}
			}

		}

		// Check for third time the list of down tills and prepare fourth map
		for (Entry<String, HalfordsFixedTillBean> mapElement : hhtAttributesThirdtMap.entrySet()) {
			String storeNumber = (String) mapElement.getKey();
			HalfordsFixedTillBean fixedTillDetails = ((HalfordsFixedTillBean) mapElement.getValue());

			String ipaddress = fixedTillDetails.getFixedTillIpAddress();
			InetAddress geek1 = InetAddress.getByName(ipaddress);
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
				hhtAttributesFourthtMap.put(storeNumber, new HalfordsFixedTillBean(fixedTillDetails.getFixedTillIpAddress(),
						fixedTillDetails.getFixedTillStoreNumber().toString(),
						fixedTillDetails.getFixedTillDiscoveryDate(), fixedTillDetails.getFixedTillDiscoveryTime(),
						fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(),
						fixedTillDetails.getFixedTillHostName()));

			}
		}

		// Compare between third and Fourth Map and prepare a fifth map with common
		// values of down tills
		for (Entry<String, HalfordsFixedTillBean> mapElement : hhtAttributesThirdtMap.entrySet()) {
			for (Entry<String, HalfordsFixedTillBean> mapElement1 : hhtAttributesFourthtMap.entrySet()) {
				if (mapElement.getValue().getFixedTillStoreNumber().equals(mapElement1.getValue().getFixedTillStoreNumber())) {

					String storeNumber = (String) mapElement.getKey();
					HalfordsFixedTillBean fixedTillDetails = ((HalfordsFixedTillBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesFifthtMap.put(storeNumber, new HalfordsFixedTillBean(fixedTillDetails.getFixedTillIpAddress(),
							fixedTillDetails.getFixedTillStoreNumber().toString(),
							fixedTillDetails.getFixedTillDiscoveryDate(), fixedTillDetails.getFixedTillDiscoveryTime(),
							fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(),
							fixedTillDetails.getFixedTillHostName()));

				}
			}

		}

		// Check for fourth time the list of down tills and prepare sixth map
		for (Entry<String, HalfordsFixedTillBean> mapElement : hhtAttributesFifthtMap.entrySet()) {
			String storeNumber = (String) mapElement.getKey();
			HalfordsFixedTillBean fixedTillDetails = ((HalfordsFixedTillBean) mapElement.getValue());

			String ipaddress = fixedTillDetails.getFixedTillIpAddress();
			InetAddress geek1 = InetAddress.getByName(ipaddress);
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
				hhtAttributesSixthtMap.put(storeNumber, new HalfordsFixedTillBean(fixedTillDetails.getFixedTillIpAddress(),
						fixedTillDetails.getFixedTillStoreNumber().toString(),
						fixedTillDetails.getFixedTillDiscoveryDate(), fixedTillDetails.getFixedTillDiscoveryTime(),
						fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(),
						fixedTillDetails.getFixedTillHostName()));

			}
		}

		// Compare between fifth and sixth Map and prepare a seventh map with common
		// values of down tills
		for (Entry<String, HalfordsFixedTillBean> mapElement : hhtAttributesFifthtMap.entrySet()) {
			for (Entry<String, HalfordsFixedTillBean> mapElement1 : hhtAttributesSixthtMap.entrySet()) {
				if (mapElement.getValue().getFixedTillStoreNumber().equals(mapElement1.getValue().getFixedTillStoreNumber())) {

					String storeNumber = (String) mapElement.getKey();
					HalfordsFixedTillBean fixedTillDetails = ((HalfordsFixedTillBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesSeventhMap.put(storeNumber, new HalfordsFixedTillBean(fixedTillDetails.getFixedTillIpAddress(),
							fixedTillDetails.getFixedTillStoreNumber().toString(),
							fixedTillDetails.getFixedTillDiscoveryDate(), fixedTillDetails.getFixedTillDiscoveryTime(),
							fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(),
							fixedTillDetails.getFixedTillHostName()));

				}
			}

		}

		// Check for fifth time the list of down tills and prepare eight map
		for (Entry<String, HalfordsFixedTillBean> mapElement : hhtAttributesSeventhMap.entrySet()) {
			String storeNumber = (String) mapElement.getKey();
			HalfordsFixedTillBean fixedTillDetails = ((HalfordsFixedTillBean) mapElement.getValue());

			String ipaddress = fixedTillDetails.getFixedTillIpAddress();
			InetAddress geek1 = InetAddress.getByName(ipaddress);
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
				hhtAttributesEightMap.put(storeNumber, new HalfordsFixedTillBean(fixedTillDetails.getFixedTillIpAddress(),
						fixedTillDetails.getFixedTillStoreNumber().toString(),
						fixedTillDetails.getFixedTillDiscoveryDate(), fixedTillDetails.getFixedTillDiscoveryTime(),
						fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(),
						fixedTillDetails.getFixedTillHostName()));

			}
		}

		// Compare between seventh and eight Map and prepare a ninth map with common
		// values of down tills
		for (Entry<String, HalfordsFixedTillBean> mapElement : hhtAttributesSeventhMap.entrySet()) {
			for (Entry<String, HalfordsFixedTillBean> mapElement1 : hhtAttributesEightMap.entrySet()) {
				if (mapElement.getValue().getFixedTillStoreNumber().equals(mapElement1.getValue().getFixedTillStoreNumber())) {

					String storeNumber = (String) mapElement.getKey();
					HalfordsFixedTillBean fixedTillDetails = ((HalfordsFixedTillBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesNnthMap.put(storeNumber, new HalfordsFixedTillBean(fixedTillDetails.getFixedTillIpAddress(),
							fixedTillDetails.getFixedTillStoreNumber().toString(),
							fixedTillDetails.getFixedTillDiscoveryDate(), fixedTillDetails.getFixedTillDiscoveryTime(),
							fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(),
							fixedTillDetails.getFixedTillHostName()));

				}
			}

		}

		// Check for sixth time the list of down tills and prepare tenth map
		for (Entry<String, HalfordsFixedTillBean> mapElement : hhtAttributesNnthMap.entrySet()) {
			String storeNumber = (String) mapElement.getKey();
			HalfordsFixedTillBean fixedTillDetails = ((HalfordsFixedTillBean) mapElement.getValue());

			String ipaddress = fixedTillDetails.getFixedTillIpAddress();
			InetAddress geek1 = InetAddress.getByName(ipaddress);
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
				hhtAttributesTenthMap.put(storeNumber, new HalfordsFixedTillBean(fixedTillDetails.getFixedTillIpAddress(),
						fixedTillDetails.getFixedTillStoreNumber().toString(),
						fixedTillDetails.getFixedTillDiscoveryDate(), fixedTillDetails.getFixedTillDiscoveryTime(),
						fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(),
						fixedTillDetails.getFixedTillHostName()));

			}
		}

		// Compare between ninth and tenth Map and prepare a eleventh map with common
		// values of down tills
		for (Entry<String, HalfordsFixedTillBean> mapElement : hhtAttributesNnthMap.entrySet()) {
			for (Entry<String, HalfordsFixedTillBean> mapElement1 : hhtAttributesTenthMap.entrySet()) {
				if (mapElement.getValue().getFixedTillStoreNumber().equals(mapElement1.getValue().getFixedTillStoreNumber())) {

					String storeNumber = (String) mapElement.getKey();
					HalfordsFixedTillBean fixedTillDetails = ((HalfordsFixedTillBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesEleventhMap.put(storeNumber,
							new HalfordsFixedTillBean(fixedTillDetails.getFixedTillIpAddress(),
									fixedTillDetails.getFixedTillStoreNumber().toString(),
									fixedTillDetails.getFixedTillDiscoveryDate(),
									fixedTillDetails.getFixedTillDiscoveryTime(),
									fixedTillDetails.getFixedTillRecordNumber(),
									fixedTillDetails.getFixedTillIsActive(), fixedTillDetails.getFixedTillHostName()));

				}
			}

		}

		// Check for seventh time the list of down tills and prepare thirteen map
		for (Entry<String, HalfordsFixedTillBean> mapElement : hhtAttributesEleventhMap.entrySet()) {
			String storeNumber = (String) mapElement.getKey();
			HalfordsFixedTillBean fixedTillDetails = ((HalfordsFixedTillBean) mapElement.getValue());

			String ipaddress = fixedTillDetails.getFixedTillIpAddress();
			InetAddress geek1 = InetAddress.getByName(ipaddress);
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
				hhtAttributesTwelvethMap.put(storeNumber, new HalfordsFixedTillBean(fixedTillDetails.getFixedTillIpAddress(),
						fixedTillDetails.getFixedTillStoreNumber().toString(),
						fixedTillDetails.getFixedTillDiscoveryDate(), fixedTillDetails.getFixedTillDiscoveryTime(),
						fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(),
						fixedTillDetails.getFixedTillHostName()));

			}
		}

		// Compare between eleventh and twelveth Map and prepare a seventh map with
		// common values of down tills
		for (Entry<String, HalfordsFixedTillBean> mapElement : hhtAttributesEleventhMap.entrySet()) {
			for (Entry<String, HalfordsFixedTillBean> mapElement1 : hhtAttributesTwelvethMap.entrySet()) {
				if (mapElement.getValue().getFixedTillStoreNumber().equals(mapElement1.getValue().getFixedTillStoreNumber())) {

					String storeNumber = (String) mapElement.getKey();
					HalfordsFixedTillBean fixedTillDetails = ((HalfordsFixedTillBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesThirteenthMap.put(storeNumber,
							new HalfordsFixedTillBean(fixedTillDetails.getFixedTillIpAddress(),
									fixedTillDetails.getFixedTillStoreNumber().toString(),
									fixedTillDetails.getFixedTillDiscoveryDate(),
									fixedTillDetails.getFixedTillDiscoveryTime(),
									fixedTillDetails.getFixedTillRecordNumber(),
									fixedTillDetails.getFixedTillIsActive(), fixedTillDetails.getFixedTillHostName()));

				}
			}

		}

		// Check for eighth time the list of down tills and prepare fifteenth map
		for (Entry<String, HalfordsFixedTillBean> mapElement : hhtAttributesThirteenthMap.entrySet()) {
			String storeNumber = (String) mapElement.getKey();
			HalfordsFixedTillBean fixedTillDetails = ((HalfordsFixedTillBean) mapElement.getValue());

			String ipaddress = fixedTillDetails.getFixedTillIpAddress();
			InetAddress geek1 = InetAddress.getByName(ipaddress);
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
				hhtAttributesFourteenthMap.put(storeNumber, new HalfordsFixedTillBean(fixedTillDetails.getFixedTillIpAddress(),
						fixedTillDetails.getFixedTillStoreNumber().toString(),
						fixedTillDetails.getFixedTillDiscoveryDate(), fixedTillDetails.getFixedTillDiscoveryTime(),
						fixedTillDetails.getFixedTillRecordNumber(), fixedTillDetails.getFixedTillIsActive(),
						fixedTillDetails.getFixedTillHostName()));

			}
		}

		// Compare between thirteen and fourteen Map and prepare a fifteen map with
		// common values of down tills
		for (Entry<String, HalfordsFixedTillBean> mapElement : hhtAttributesThirteenthMap.entrySet()) {
			for (Entry<String, HalfordsFixedTillBean> mapElement1 : hhtAttributesFourteenthMap.entrySet()) {
				if (mapElement.getValue().getFixedTillStoreNumber().equals(mapElement1.getValue().getFixedTillStoreNumber())) {

					String storeNumber = (String) mapElement.getKey();
					HalfordsFixedTillBean fixedTillDetails = ((HalfordsFixedTillBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesFifteenthMap.put(storeNumber,
							new HalfordsFixedTillBean(fixedTillDetails.getFixedTillIpAddress(),
									fixedTillDetails.getFixedTillStoreNumber().toString(),
									fixedTillDetails.getFixedTillDiscoveryDate(),
									fixedTillDetails.getFixedTillDiscoveryTime(),
									fixedTillDetails.getFixedTillRecordNumber(),
									fixedTillDetails.getFixedTillIsActive(), fixedTillDetails.getFixedTillHostName()));

				}
			}

		}

		Collection<HalfordsFixedTillBean> hhtCollections = hhtAttributesFifteenthMap.values();
		System.out.println("Size of HHT" + hhtAttributesFifteenthMap.size());
		List<HalfordsFixedTillBean> list = new ArrayList<HalfordsFixedTillBean>();
		list.addAll(hhtCollections);
		return list;
	}

//		 

}
