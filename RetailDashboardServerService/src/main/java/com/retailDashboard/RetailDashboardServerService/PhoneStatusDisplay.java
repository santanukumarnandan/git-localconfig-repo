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

	Map<String, PhoneBean> phoneAttributesparentMap = null;
	Map<String, PhoneBean> phoneTillAttributesSecondtMap = null;
	Map<String, PhoneBean> phoneAttributesThirdtMap = null;

	public List<PhoneBean> getPhoneStatus(List<HalPhoneMaster> phoneMaster, List<Long> storeNumbers)
			throws UnknownHostException, IOException {

		phoneAttributesparentMap = new HashMap<String, PhoneBean>();
		phoneAttributesparentMap.clear();
		phoneTillAttributesSecondtMap = new HashMap<String, PhoneBean>();
		phoneTillAttributesSecondtMap.clear();
		phoneAttributesThirdtMap = new HashMap<String, PhoneBean>();
		phoneAttributesThirdtMap.clear();

		HashMap<String, PhoneBean> phoneAttributesFourthtMap = new HashMap<String, PhoneBean>();
		phoneAttributesFourthtMap.clear();
		HashMap<String, PhoneBean> phoneAttributesFifthtMap = new HashMap<String, PhoneBean>();
		phoneAttributesFifthtMap.clear();
		HashMap<String, PhoneBean> phoneAttributesSixthtMap = new HashMap<String, PhoneBean>();
		phoneAttributesSixthtMap.clear();
		HashMap<String, PhoneBean> phoneAttributesSeventhMap = new HashMap<String, PhoneBean>();
		phoneAttributesSeventhMap.clear();

		HashMap<String, PhoneBean> phoneAttributesEightMap = new HashMap<String, PhoneBean>();
		phoneAttributesEightMap.clear();
		HashMap<String, PhoneBean> phoneAttributesNnthMap = new HashMap<String, PhoneBean>();
		phoneAttributesNnthMap.clear();
		HashMap<String, PhoneBean> phoneAttributesTenthMap = new HashMap<String, PhoneBean>();
		phoneAttributesTenthMap.clear();
		HashMap<String, PhoneBean> phoneAttributesEleventhMap = new HashMap<String, PhoneBean>();
		phoneAttributesEleventhMap.clear();

		HashMap<String, PhoneBean> phoneAttributesTwelvethMap = new HashMap<String, PhoneBean>();
		phoneAttributesTwelvethMap.clear();
		HashMap<String, PhoneBean> phoneAttributesThirteenthMap = new HashMap<String, PhoneBean>();
		phoneAttributesThirteenthMap.clear();
		HashMap<String, PhoneBean> phoneAttributesFourteenthMap = new HashMap<String, PhoneBean>();
		phoneAttributesFourteenthMap.clear();
		HashMap<String, PhoneBean> phoneAttributesFifteenthMap = new HashMap<String, PhoneBean>();
		phoneAttributesFifteenthMap.clear();

		// Ped
		for (HalPhoneMaster phoneMasterDetails : phoneMaster) {
			phoneAttributesparentMap.put(phoneMasterDetails.getStoreNumber().toString(),
					new PhoneBean(phoneMasterDetails.getStoreIpAddress(), phoneMasterDetails.getStoreNumber(),
							phoneMasterDetails.getDiscoveryDate(), "", phoneMasterDetails.getStoreHostName(),
							phoneMasterDetails.getDiscoveryTime(), phoneMasterDetails.getRecordNumber(), "", "", ""));

		}

		for (Entry<String, PhoneBean> mapElement : phoneAttributesparentMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PhoneBean phoneDetails = ((PhoneBean) mapElement.getValue());

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
				phoneAttributesparentMap.put(ipAddress,
						new PhoneBean(phoneDetails.getPhoneIpAddress(), phoneDetails.getPhoneStoreNumber(),
								phoneDetails.getPhonePollingDate(), phoneDetails.getPhonestoreAddressLink(),
								phoneDetails.getPhonestoreName(), phoneDetails.getPhonePollingTime(),
								phoneDetails.getPhonePollingNumber(), phoneDetails.getPhonelDateUp(),
								phoneDetails.getPhoneTimeUp(), phoneDetails.getPhoneDownSince()));

			}
		}

		for (Entry<String, PhoneBean> mapElement : phoneAttributesparentMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PhoneBean phoneDetails = ((PhoneBean) mapElement.getValue());

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
				phoneTillAttributesSecondtMap.put(ipAddress,
						new PhoneBean(phoneDetails.getPhoneIpAddress(), phoneDetails.getPhoneStoreNumber(),
								phoneDetails.getPhonePollingDate(), phoneDetails.getPhonestoreAddressLink(),
								phoneDetails.getPhonestoreName(), phoneDetails.getPhonePollingTime(),
								phoneDetails.getPhonePollingNumber(), phoneDetails.getPhonelDateUp(),
								phoneDetails.getPhoneTimeUp(), phoneDetails.getPhoneDownSince()));

			}
		}

		for (Entry<String, PhoneBean> mapElement : phoneTillAttributesSecondtMap.entrySet()) {
			for (Entry<String, PhoneBean> mapElement1 : phoneAttributesparentMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PhoneBean phoneDetails = ((PhoneBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					phoneAttributesThirdtMap.put(ipAddress,
							new PhoneBean(phoneDetails.getPhoneIpAddress(), phoneDetails.getPhoneStoreNumber(),
									phoneDetails.getPhonePollingDate(), phoneDetails.getPhonestoreAddressLink(),
									phoneDetails.getPhonestoreName(), phoneDetails.getPhonePollingTime(),
									phoneDetails.getPhonePollingNumber(), phoneDetails.getPhonelDateUp(),
									phoneDetails.getPhoneTimeUp(), phoneDetails.getPhoneDownSince()));

				}
			}

		}
		
		// Check for third time the list of down tills and prepare fourth map

		
		for (Entry<String, PhoneBean> mapElement : phoneAttributesThirdtMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PhoneBean phoneDetails = ((PhoneBean) mapElement.getValue());

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
				phoneAttributesFourthtMap.put(ipAddress,
						new PhoneBean(phoneDetails.getPhoneIpAddress(), phoneDetails.getPhoneStoreNumber(),
								phoneDetails.getPhonePollingDate(), phoneDetails.getPhonestoreAddressLink(),
								phoneDetails.getPhonestoreName(), phoneDetails.getPhonePollingTime(),
								phoneDetails.getPhonePollingNumber(), phoneDetails.getPhonelDateUp(),
								phoneDetails.getPhoneTimeUp(), phoneDetails.getPhoneDownSince()));

			}
		}
		
		// Compare between third and Fourth Map and prepare a fifth map with common

		for (Entry<String, PhoneBean> mapElement : phoneAttributesThirdtMap.entrySet()) {
			for (Entry<String, PhoneBean> mapElement1 : phoneAttributesFourthtMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PhoneBean phoneDetails = ((PhoneBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					phoneAttributesFifthtMap.put(ipAddress,
							new PhoneBean(phoneDetails.getPhoneIpAddress(), phoneDetails.getPhoneStoreNumber(),
									phoneDetails.getPhonePollingDate(), phoneDetails.getPhonestoreAddressLink(),
									phoneDetails.getPhonestoreName(), phoneDetails.getPhonePollingTime(),
									phoneDetails.getPhonePollingNumber(), phoneDetails.getPhonelDateUp(),
									phoneDetails.getPhoneTimeUp(), phoneDetails.getPhoneDownSince()));

				}
			}

		}
		
		// Check for fourth time the list of down tills and prepare sixth map
		
		for (Entry<String, PhoneBean> mapElement : phoneAttributesFifthtMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PhoneBean phoneDetails = ((PhoneBean) mapElement.getValue());

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
				phoneAttributesSixthtMap.put(ipAddress,
						new PhoneBean(phoneDetails.getPhoneIpAddress(), phoneDetails.getPhoneStoreNumber(),
								phoneDetails.getPhonePollingDate(), phoneDetails.getPhonestoreAddressLink(),
								phoneDetails.getPhonestoreName(), phoneDetails.getPhonePollingTime(),
								phoneDetails.getPhonePollingNumber(), phoneDetails.getPhonelDateUp(),
								phoneDetails.getPhoneTimeUp(), phoneDetails.getPhoneDownSince()));

			}
		}
		// Compare between fifth and sixth Map and prepare a seventh map with common

		for (Entry<String, PhoneBean> mapElement : phoneAttributesFifthtMap.entrySet()) {
			for (Entry<String, PhoneBean> mapElement1 : phoneAttributesSixthtMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PhoneBean phoneDetails = ((PhoneBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					phoneAttributesSeventhMap.put(ipAddress,
							new PhoneBean(phoneDetails.getPhoneIpAddress(), phoneDetails.getPhoneStoreNumber(),
									phoneDetails.getPhonePollingDate(), phoneDetails.getPhonestoreAddressLink(),
									phoneDetails.getPhonestoreName(), phoneDetails.getPhonePollingTime(),
									phoneDetails.getPhonePollingNumber(), phoneDetails.getPhonelDateUp(),
									phoneDetails.getPhoneTimeUp(), phoneDetails.getPhoneDownSince()));

				}
			}

		}
		
		// Check for fifth time the list of down tills and prepare eight map

		
		for (Entry<String, PhoneBean> mapElement : phoneAttributesSeventhMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PhoneBean phoneDetails = ((PhoneBean) mapElement.getValue());

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
				phoneAttributesEightMap.put(ipAddress,
						new PhoneBean(phoneDetails.getPhoneIpAddress(), phoneDetails.getPhoneStoreNumber(),
								phoneDetails.getPhonePollingDate(), phoneDetails.getPhonestoreAddressLink(),
								phoneDetails.getPhonestoreName(), phoneDetails.getPhonePollingTime(),
								phoneDetails.getPhonePollingNumber(), phoneDetails.getPhonelDateUp(),
								phoneDetails.getPhoneTimeUp(), phoneDetails.getPhoneDownSince()));

			}
		}

		// Compare between seventh and eight Map and prepare a ninth map with common

		for (Entry<String, PhoneBean> mapElement : phoneAttributesSeventhMap.entrySet()) {
			for (Entry<String, PhoneBean> mapElement1 : phoneAttributesEightMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PhoneBean phoneDetails = ((PhoneBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					phoneAttributesNnthMap.put(ipAddress,
							new PhoneBean(phoneDetails.getPhoneIpAddress(), phoneDetails.getPhoneStoreNumber(),
									phoneDetails.getPhonePollingDate(), phoneDetails.getPhonestoreAddressLink(),
									phoneDetails.getPhonestoreName(), phoneDetails.getPhonePollingTime(),
									phoneDetails.getPhonePollingNumber(), phoneDetails.getPhonelDateUp(),
									phoneDetails.getPhoneTimeUp(), phoneDetails.getPhoneDownSince()));

				}
			}

		}
		// Check for sixth time the list of down tills and prepare tenth map

		for (Entry<String, PhoneBean> mapElement : phoneAttributesNnthMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PhoneBean phoneDetails = ((PhoneBean) mapElement.getValue());

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
				phoneAttributesTenthMap.put(ipAddress,
						new PhoneBean(phoneDetails.getPhoneIpAddress(), phoneDetails.getPhoneStoreNumber(),
								phoneDetails.getPhonePollingDate(), phoneDetails.getPhonestoreAddressLink(),
								phoneDetails.getPhonestoreName(), phoneDetails.getPhonePollingTime(),
								phoneDetails.getPhonePollingNumber(), phoneDetails.getPhonelDateUp(),
								phoneDetails.getPhoneTimeUp(), phoneDetails.getPhoneDownSince()));

			}
		}
		
		// Compare between ninth and tenth Map and prepare a Eleventh map with common

		for (Entry<String, PhoneBean> mapElement : phoneAttributesNnthMap.entrySet()) {
			for (Entry<String, PhoneBean> mapElement1 : phoneAttributesTenthMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PhoneBean phoneDetails = ((PhoneBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					phoneAttributesEleventhMap.put(ipAddress,
							new PhoneBean(phoneDetails.getPhoneIpAddress(), phoneDetails.getPhoneStoreNumber(),
									phoneDetails.getPhonePollingDate(), phoneDetails.getPhonestoreAddressLink(),
									phoneDetails.getPhonestoreName(), phoneDetails.getPhonePollingTime(),
									phoneDetails.getPhonePollingNumber(), phoneDetails.getPhonelDateUp(),
									phoneDetails.getPhoneTimeUp(), phoneDetails.getPhoneDownSince()));

				}
			}

		}
		
		// Check for seventh time the list of down tills and prepare twelveth map

		for (Entry<String, PhoneBean> mapElement : phoneAttributesEleventhMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PhoneBean phoneDetails = ((PhoneBean) mapElement.getValue());

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
				phoneAttributesTwelvethMap.put(ipAddress,
						new PhoneBean(phoneDetails.getPhoneIpAddress(), phoneDetails.getPhoneStoreNumber(),
								phoneDetails.getPhonePollingDate(), phoneDetails.getPhonestoreAddressLink(),
								phoneDetails.getPhonestoreName(), phoneDetails.getPhonePollingTime(),
								phoneDetails.getPhonePollingNumber(), phoneDetails.getPhonelDateUp(),
								phoneDetails.getPhoneTimeUp(), phoneDetails.getPhoneDownSince()));

			}
		}
		
		// Compare between eleventh and twelveth Map and prepare a thirteen map with

		for (Entry<String, PhoneBean> mapElement : phoneAttributesEleventhMap.entrySet()) {
			for (Entry<String, PhoneBean> mapElement1 : phoneAttributesTwelvethMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PhoneBean phoneDetails = ((PhoneBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					phoneAttributesThirteenthMap.put(ipAddress,
							new PhoneBean(phoneDetails.getPhoneIpAddress(), phoneDetails.getPhoneStoreNumber(),
									phoneDetails.getPhonePollingDate(), phoneDetails.getPhonestoreAddressLink(),
									phoneDetails.getPhonestoreName(), phoneDetails.getPhonePollingTime(),
									phoneDetails.getPhonePollingNumber(), phoneDetails.getPhonelDateUp(),
									phoneDetails.getPhoneTimeUp(), phoneDetails.getPhoneDownSince()));

				}
			}

		}
		
		// Check for eighth time the list of down tills and prepare fourteen map

		for (Entry<String, PhoneBean> mapElement : phoneAttributesThirteenthMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PhoneBean phoneDetails = ((PhoneBean) mapElement.getValue());

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
				phoneAttributesFourteenthMap.put(ipAddress,
						new PhoneBean(phoneDetails.getPhoneIpAddress(), phoneDetails.getPhoneStoreNumber(),
								phoneDetails.getPhonePollingDate(), phoneDetails.getPhonestoreAddressLink(),
								phoneDetails.getPhonestoreName(), phoneDetails.getPhonePollingTime(),
								phoneDetails.getPhonePollingNumber(), phoneDetails.getPhonelDateUp(),
								phoneDetails.getPhoneTimeUp(), phoneDetails.getPhoneDownSince()));

			}
		}

		// Compare between thirteen and fourteen Map and prepare a fifteen map with

		for (Entry<String, PhoneBean> mapElement : phoneAttributesThirteenthMap.entrySet()) {
			for (Entry<String, PhoneBean> mapElement1 : phoneAttributesFourteenthMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PhoneBean phoneDetails = ((PhoneBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					phoneAttributesFifteenthMap.put(ipAddress,
							new PhoneBean(phoneDetails.getPhoneIpAddress(), phoneDetails.getPhoneStoreNumber(),
									phoneDetails.getPhonePollingDate(), phoneDetails.getPhonestoreAddressLink(),
									phoneDetails.getPhonestoreName(), phoneDetails.getPhonePollingTime(),
									phoneDetails.getPhonePollingNumber(), phoneDetails.getPhonelDateUp(),
									phoneDetails.getPhoneTimeUp(), phoneDetails.getPhoneDownSince()));

				}
			}

		}
		
		
		
		

		Collection<PhoneBean> phoneCollections = phoneAttributesFifteenthMap.values();
		System.out.println("Size of Phone" + phoneAttributesFifteenthMap.size());
		List<PhoneBean> list = new ArrayList<PhoneBean>();
		list.addAll(phoneCollections);
		return list;
	}

}
