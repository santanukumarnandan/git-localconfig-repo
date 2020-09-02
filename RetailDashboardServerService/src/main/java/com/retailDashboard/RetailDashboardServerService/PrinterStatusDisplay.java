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
public class PrinterStatusDisplay {

	Map<String, PrinterBean> printerAttributesparentMap = null;
	Map<String, PrinterBean> printerTillAttributesSecondtMap = null;
	Map<String, PrinterBean> printerAttributesThirdtMap = null;

	public List<PrinterBean> getPrinterStatus(List<HalPrinterMaster> printerMaster, List<Long> storeNumbers)
			throws UnknownHostException, IOException {

		printerAttributesparentMap = new HashMap<String, PrinterBean>();
		printerAttributesparentMap.clear();
		HashMap<String, PrinterBean> printerAttributesFirstMap = new HashMap<String, PrinterBean>();
		printerAttributesFirstMap.clear();
		printerTillAttributesSecondtMap = new HashMap<String, PrinterBean>();
		printerTillAttributesSecondtMap.clear();
		printerAttributesThirdtMap = new HashMap<String, PrinterBean>();
		printerAttributesThirdtMap.clear();

		HashMap<String, PrinterBean> hhtAttributesFourthtMap = new HashMap<String, PrinterBean>();
		hhtAttributesFourthtMap.clear();
		HashMap<String, PrinterBean> hhtAttributesFifthtMap = new HashMap<String, PrinterBean>();
		hhtAttributesFifthtMap.clear();
		HashMap<String, PrinterBean> hhtAttributesSixthtMap = new HashMap<String, PrinterBean>();
		hhtAttributesSixthtMap.clear();
		HashMap<String, PrinterBean> hhtAttributesSeventhMap = new HashMap<String, PrinterBean>();
		hhtAttributesSeventhMap.clear();

		HashMap<String, PrinterBean> hhtAttributesEightMap = new HashMap<String, PrinterBean>();
		hhtAttributesEightMap.clear();
		HashMap<String, PrinterBean> hhtAttributesNnthMap = new HashMap<String, PrinterBean>();
		hhtAttributesNnthMap.clear();
		HashMap<String, PrinterBean> hhtAttributesTenthMap = new HashMap<String, PrinterBean>();
		hhtAttributesTenthMap.clear();
		HashMap<String, PrinterBean> hhtAttributesEleventhMap = new HashMap<String, PrinterBean>();
		hhtAttributesSeventhMap.clear();

		HashMap<String, PrinterBean> hhtAttributesTwelvethMap = new HashMap<String, PrinterBean>();
		hhtAttributesTwelvethMap.clear();
		HashMap<String, PrinterBean> hhtAttributesThirteenthMap = new HashMap<String, PrinterBean>();
		hhtAttributesThirteenthMap.clear();
		HashMap<String, PrinterBean> hhtAttributesFourteenthMap = new HashMap<String, PrinterBean>();
		hhtAttributesFourteenthMap.clear();
		HashMap<String, PrinterBean> hhtAttributesFifteenthMap = new HashMap<String, PrinterBean>();
		hhtAttributesFifteenthMap.clear();

		// List 4 is being prepared. Next iterate this 8 times to find the exact down
		// tills

		for (HalPrinterMaster printerMasterDetails : printerMaster) {
			printerAttributesparentMap.put(printerMasterDetails.getStoreNumber().toString(),
					new PrinterBean(printerMasterDetails.getStoreIpAddress(),
							printerMasterDetails.getStoreNumber().toString(), printerMasterDetails.getDiscoveryDate(),
							"", printerMasterDetails.getStoreHostName(), printerMasterDetails.getDiscoveryTime(),
							printerMasterDetails.getRecordNumber(), "", "", ""));

		}

		// Check for first time the list of down tills and prepare first map
		for (Entry<String, PrinterBean> mapElement : printerAttributesparentMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PrinterBean printerDetails = ((PrinterBean) mapElement.getValue());

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
				printerAttributesFirstMap.put(ipAddress,
						new PrinterBean(printerDetails.getPrinterIpAddress(), printerDetails.getPrinterStoreNumber(),
								printerDetails.getPrinterPollingDate(), printerDetails.getPrinterstoreAddressLink(),
								printerDetails.getPrinterstoreName(), printerDetails.getPrinterPollingTime(),
								printerDetails.getPrinterPollingNumber(), printerDetails.getPrinterlDateUp(),
								printerDetails.getPrinterTimeUp(), printerDetails.getPrinterDownSince()));

			}
		}

		// Check for second time the list of down tills and prepare second map

		for (Entry<String, PrinterBean> mapElement : printerAttributesFirstMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PrinterBean printerDetails = ((PrinterBean) mapElement.getValue());

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
				printerTillAttributesSecondtMap.put(ipAddress,
						new PrinterBean(printerDetails.getPrinterIpAddress(), printerDetails.getPrinterStoreNumber(),
								printerDetails.getPrinterPollingDate(), printerDetails.getPrinterstoreAddressLink(),
								printerDetails.getPrinterstoreName(), printerDetails.getPrinterPollingTime(),
								printerDetails.getPrinterPollingNumber(), printerDetails.getPrinterlDateUp(),
								printerDetails.getPrinterTimeUp(), printerDetails.getPrinterDownSince()));

			}
		}

		// Compare between second and First Map and prepare a third map with common
		// values of down tills
		for (Entry<String, PrinterBean> mapElement : printerTillAttributesSecondtMap.entrySet()) {
			for (Entry<String, PrinterBean> mapElement1 : printerAttributesFirstMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PrinterBean printerDetails = ((PrinterBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					printerAttributesThirdtMap.put(ipAddress,
							new PrinterBean(printerDetails.getPrinterIpAddress(),
									printerDetails.getPrinterStoreNumber(), printerDetails.getPrinterPollingDate(),
									printerDetails.getPrinterstoreAddressLink(), printerDetails.getPrinterstoreName(),
									printerDetails.getPrinterPollingTime(), printerDetails.getPrinterPollingNumber(),
									printerDetails.getPrinterlDateUp(), printerDetails.getPrinterTimeUp(),
									printerDetails.getPrinterDownSince()));

				}
			}

		}

		// Check for third time the list of down tills and prepare fourth map
		for (Entry<String, PrinterBean> mapElement : printerAttributesThirdtMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PrinterBean printerDetails = ((PrinterBean) mapElement.getValue());

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
						new PrinterBean(printerDetails.getPrinterIpAddress(), printerDetails.getPrinterStoreNumber(),
								printerDetails.getPrinterPollingDate(), printerDetails.getPrinterstoreAddressLink(),
								printerDetails.getPrinterstoreName(), printerDetails.getPrinterPollingTime(),
								printerDetails.getPrinterPollingNumber(), printerDetails.getPrinterlDateUp(),
								printerDetails.getPrinterTimeUp(), printerDetails.getPrinterDownSince()));

			}
		}

		// Compare between third and Fourth Map and prepare a fifth map with common
		// values of down tills
		for (Entry<String, PrinterBean> mapElement : printerAttributesThirdtMap.entrySet()) {
			for (Entry<String, PrinterBean> mapElement1 : hhtAttributesFourthtMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PrinterBean printerDetails = ((PrinterBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesFifthtMap.put(ipAddress,
							new PrinterBean(printerDetails.getPrinterIpAddress(),
									printerDetails.getPrinterStoreNumber(), printerDetails.getPrinterPollingDate(),
									printerDetails.getPrinterstoreAddressLink(), printerDetails.getPrinterstoreName(),
									printerDetails.getPrinterPollingTime(), printerDetails.getPrinterPollingNumber(),
									printerDetails.getPrinterlDateUp(), printerDetails.getPrinterTimeUp(),
									printerDetails.getPrinterDownSince()));

				}
			}

		}

		// Check for fourth time the list of down tills and prepare sixth map
		for (Entry<String, PrinterBean> mapElement : hhtAttributesFifthtMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PrinterBean printerDetails = ((PrinterBean) mapElement.getValue());

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
						new PrinterBean(printerDetails.getPrinterIpAddress(), printerDetails.getPrinterStoreNumber(),
								printerDetails.getPrinterPollingDate(), printerDetails.getPrinterstoreAddressLink(),
								printerDetails.getPrinterstoreName(), printerDetails.getPrinterPollingTime(),
								printerDetails.getPrinterPollingNumber(), printerDetails.getPrinterlDateUp(),
								printerDetails.getPrinterTimeUp(), printerDetails.getPrinterDownSince()));

			}
		}

		// Compare between fifth and sixth Map and prepare a seventh map with common
		// values of down tills
		for (Entry<String, PrinterBean> mapElement : hhtAttributesFifthtMap.entrySet()) {
			for (Entry<String, PrinterBean> mapElement1 : hhtAttributesSixthtMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PrinterBean printerDetails = ((PrinterBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesSeventhMap.put(ipAddress,
							new PrinterBean(printerDetails.getPrinterIpAddress(),
									printerDetails.getPrinterStoreNumber(), printerDetails.getPrinterPollingDate(),
									printerDetails.getPrinterstoreAddressLink(), printerDetails.getPrinterstoreName(),
									printerDetails.getPrinterPollingTime(), printerDetails.getPrinterPollingNumber(),
									printerDetails.getPrinterlDateUp(), printerDetails.getPrinterTimeUp(),
									printerDetails.getPrinterDownSince()));

				}
			}

		}

		// Check for fifth time the list of down tills and prepare eight map
		for (Entry<String, PrinterBean> mapElement : hhtAttributesSeventhMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PrinterBean printerDetails = ((PrinterBean) mapElement.getValue());

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
						new PrinterBean(printerDetails.getPrinterIpAddress(), printerDetails.getPrinterStoreNumber(),
								printerDetails.getPrinterPollingDate(), printerDetails.getPrinterstoreAddressLink(),
								printerDetails.getPrinterstoreName(), printerDetails.getPrinterPollingTime(),
								printerDetails.getPrinterPollingNumber(), printerDetails.getPrinterlDateUp(),
								printerDetails.getPrinterTimeUp(), printerDetails.getPrinterDownSince()));

			}
		}

		// Compare between seventh and eight Map and prepare a ninth map with common
		// values of down tills
		for (Entry<String, PrinterBean> mapElement : hhtAttributesSeventhMap.entrySet()) {
			for (Entry<String, PrinterBean> mapElement1 : hhtAttributesEightMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PrinterBean printerDetails = ((PrinterBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesNnthMap.put(ipAddress,
							new PrinterBean(printerDetails.getPrinterIpAddress(),
									printerDetails.getPrinterStoreNumber(), printerDetails.getPrinterPollingDate(),
									printerDetails.getPrinterstoreAddressLink(), printerDetails.getPrinterstoreName(),
									printerDetails.getPrinterPollingTime(), printerDetails.getPrinterPollingNumber(),
									printerDetails.getPrinterlDateUp(), printerDetails.getPrinterTimeUp(),
									printerDetails.getPrinterDownSince()));

				}
			}

		}

		// Check for sixth time the list of down tills and prepare tenth map
		for (Entry<String, PrinterBean> mapElement : hhtAttributesNnthMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PrinterBean printerDetails = ((PrinterBean) mapElement.getValue());

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
						new PrinterBean(printerDetails.getPrinterIpAddress(), printerDetails.getPrinterStoreNumber(),
								printerDetails.getPrinterPollingDate(), printerDetails.getPrinterstoreAddressLink(),
								printerDetails.getPrinterstoreName(), printerDetails.getPrinterPollingTime(),
								printerDetails.getPrinterPollingNumber(), printerDetails.getPrinterlDateUp(),
								printerDetails.getPrinterTimeUp(), printerDetails.getPrinterDownSince()));

			}
		}

		// Compare between ninth and tenth Map and prepare a seventh map with common
		// values of down tills
		for (Entry<String, PrinterBean> mapElement : hhtAttributesNnthMap.entrySet()) {
			for (Entry<String, PrinterBean> mapElement1 : hhtAttributesTenthMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PrinterBean printerDetails = ((PrinterBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesEleventhMap.put(ipAddress,
							new PrinterBean(printerDetails.getPrinterIpAddress(),
									printerDetails.getPrinterStoreNumber(), printerDetails.getPrinterPollingDate(),
									printerDetails.getPrinterstoreAddressLink(), printerDetails.getPrinterstoreName(),
									printerDetails.getPrinterPollingTime(), printerDetails.getPrinterPollingNumber(),
									printerDetails.getPrinterlDateUp(), printerDetails.getPrinterTimeUp(),
									printerDetails.getPrinterDownSince()));

				}
			}

		}

		// Check for seventh time the list of down tills and prepare twelveth map
		for (Entry<String, PrinterBean> mapElement : hhtAttributesEleventhMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PrinterBean printerDetails = ((PrinterBean) mapElement.getValue());

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
						new PrinterBean(printerDetails.getPrinterIpAddress(), printerDetails.getPrinterStoreNumber(),
								printerDetails.getPrinterPollingDate(), printerDetails.getPrinterstoreAddressLink(),
								printerDetails.getPrinterstoreName(), printerDetails.getPrinterPollingTime(),
								printerDetails.getPrinterPollingNumber(), printerDetails.getPrinterlDateUp(),
								printerDetails.getPrinterTimeUp(), printerDetails.getPrinterDownSince()));

			}
		}

		// Compare between eleventh and twelveth Map and prepare a thirteen map with
		// common values of down tills
		for (Entry<String, PrinterBean> mapElement : hhtAttributesEleventhMap.entrySet()) {
			for (Entry<String, PrinterBean> mapElement1 : hhtAttributesTwelvethMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PrinterBean printerDetails = ((PrinterBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesThirteenthMap.put(ipAddress,
							new PrinterBean(printerDetails.getPrinterIpAddress(),
									printerDetails.getPrinterStoreNumber(), printerDetails.getPrinterPollingDate(),
									printerDetails.getPrinterstoreAddressLink(), printerDetails.getPrinterstoreName(),
									printerDetails.getPrinterPollingTime(), printerDetails.getPrinterPollingNumber(),
									printerDetails.getPrinterlDateUp(), printerDetails.getPrinterTimeUp(),
									printerDetails.getPrinterDownSince()));

				}
			}

		}

		// Check for eighth time the list of down tills and prepare fourteen map
		for (Entry<String, PrinterBean> mapElement : hhtAttributesThirteenthMap.entrySet()) {
			String ipAddress = (String) mapElement.getKey();
			PrinterBean printerDetails = ((PrinterBean) mapElement.getValue());

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
						new PrinterBean(printerDetails.getPrinterIpAddress(), printerDetails.getPrinterStoreNumber(),
								printerDetails.getPrinterPollingDate(), printerDetails.getPrinterstoreAddressLink(),
								printerDetails.getPrinterstoreName(), printerDetails.getPrinterPollingTime(),
								printerDetails.getPrinterPollingNumber(), printerDetails.getPrinterlDateUp(),
								printerDetails.getPrinterTimeUp(), printerDetails.getPrinterDownSince()));

			}
		}

		// Compare between thirteen and fourteen Map and prepare a fifteen map with
		// common values of down tills
		for (Entry<String, PrinterBean> mapElement : hhtAttributesThirteenthMap.entrySet()) {
			for (Entry<String, PrinterBean> mapElement1 : hhtAttributesFourteenthMap.entrySet()) {
				if (mapElement.getValue().equals(mapElement1.getValue())) {

					String ipAddress = (String) mapElement.getKey();
					PrinterBean printerDetails = ((PrinterBean) mapElement.getValue());
					// tillAttributes2.put(ipAddress, new
					// HallfordsTillStatusAttributes(storeDetails.getStoreName(),
					// storeDetails.getStoreNumber(),storeDetails.getTillIpAddress(), "Host is
					// unreacheable", storeDetails.getStoreAddress()));
					hhtAttributesFifteenthMap.put(ipAddress,
							new PrinterBean(printerDetails.getPrinterIpAddress(),
									printerDetails.getPrinterStoreNumber(), printerDetails.getPrinterPollingDate(),
									printerDetails.getPrinterstoreAddressLink(), printerDetails.getPrinterstoreName(),
									printerDetails.getPrinterPollingTime(), printerDetails.getPrinterPollingNumber(),
									printerDetails.getPrinterlDateUp(), printerDetails.getPrinterTimeUp(),
									printerDetails.getPrinterDownSince()));

				}
			}

		}

		Collection<PrinterBean> hhtCollections = hhtAttributesFifteenthMap.values();
		System.out.println("Size of HHT" + hhtAttributesFifteenthMap.size());
		List<PrinterBean> list = new ArrayList<PrinterBean>();
		list.addAll(hhtCollections);
		return list;
	}

}
