package com.retailDashboard.RetailDashboardServerService;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetailDashboardServiceController {

//	@Autowired
//	private RetailDashboardServiceProxy retailDashboardServiceProxy;
//	
	@Autowired
	public HhtStatusDisplay hhtStatusDisplay;

	@Autowired
	public HalfordsFixedTillStatus fixedTillStatusDisplay;

	@Autowired
	public PrinterStatusDisplay printerStatusDisplay;

	@Autowired
	private PedStatusDisplay pedStatusDisplay;

	@Autowired
	private TabletStatusDisplay tabletStatusDisplay;

	@Autowired
	private PhoneStatusDisplay phoneStatusDisplay;

	@Autowired
	private WifiAccessPointStatus wifiAccessPointStatus;

	@Autowired
	private HalStoreRepository halStoreRepository;

	@Autowired
	private HalFixedTillMasterRepository halFixedTillMasterRepository;

	@Autowired
	private HalfordsTillPollDataRepository halfordsTillPollDataRepository;

	@Autowired
	private HalfordsPrinterRepository halfordsPrinterRepository;

	@Autowired
	private HalPrinterPollDataRepository halPrinterPollDataRepository;

	@Autowired
	private HalPedPollDataRepository halPedPollDataRepository;

	@Autowired
	private HalTabletPollDataRepository halTabletPollDataRepository;

	@Autowired
	private HalPhonePollDataRepository halPhonePollDataRepository;

	@Autowired
	private HalHhtPollDataRepository halHhtPollDataRepository;

	@Autowired
	private HalWifiAccessPointPolDataRepository halWifiAccessPointPolDataRepository;
	@Autowired
	private HalfordsPedMasterRepository halfordsPedMasterRepository;
	
	@Autowired
	private HalfordsTabletMasterRepository halfordsTabletMasterRepository;
	
	@Autowired
	private HalPhoneMasterRepository halPhoneMasterRepository;
	
	@Autowired
	private HalfordsWifiAccessPointRepository halfordsWifiAccessPointRepository;
	
	@Autowired
	private HalfordsHhtMasterRepository halfordsHhtMasterRepository;

	@GetMapping("/retail-dashboard/hhtstatus")
	public List<HHTAttributeBean> findHhtStatus() throws UnknownHostException, IOException {

		// Fetch details from hal_store_master table
				List<HalStoreMaster> storeMasterList1 = new ArrayList<HalStoreMaster>();
				storeMasterList1 = getStoreMasterDetails();

				// Extract store number from List 1
				List<Long> storeNumbers = new ArrayList<Long>();
				for (HalStoreMaster halStoreMaster : storeMasterList1) {
					storeNumbers.add(halStoreMaster.getStoreNumber());
				}
				
				List<HalHHTMaster> hhtMasterList2 = new ArrayList<HalHHTMaster>();
				hhtMasterList2 = halfordsHhtMasterRepository.findAllById(storeNumbers);
				// Find list of ped status details which are down for that particular date
				List<HalPhoneMaster> tabletMasterList3 = new ArrayList<HalPhoneMaster>();
				// fixedTillMasterList3 =
				// halFixedTillMasterRepository.retrieveFixedTillDetailsforaParticularDate(new
				// Date());
				// Pass this list to main class and compare the list before preparing the final
				// list and sending across
		
		hhtStatusDisplay = new HhtStatusDisplay();
		// System.out.println("Till Address" + displayTillStatus.getAll().get(0));
		List<HHTAttributeBean> hHTAttributeBean = hhtStatusDisplay.getHHTStatus(hhtMasterList2,storeNumbers);
		// System.out.println("Till Address" + displayTillStatus.getAll().toString());
		return hHTAttributeBean;
	}

//	@GetMapping("/tillstatus-feign")
//	public List<TillStatusAttributes> retreiveTillStatus() {
//		List<TillStatusAttributes> tillStatus = retailDashboardServiceProxy.retrieveTillStatus();
//		return tillStatus;
//	}

	@GetMapping("/retail-dashboard/fixedtillstatus")
	public List<FixedTillBean> findFixedTillStatus() throws UnknownHostException, IOException {

		// Fetch details from hal_store_master table
		List<HalStoreMaster> storeMasterList1 = new ArrayList<HalStoreMaster>();
		storeMasterList1 = getStoreMasterDetails();

		// Extract store number from List 1
		List<Long> storeNumbers = new ArrayList<Long>();
		for (HalStoreMaster halStoreMaster : storeMasterList1) {
			storeNumbers.add(halStoreMaster.getStoreNumber());
		}

		List<HalFixedTillMaster> fixedTillMasterList2 = new ArrayList<HalFixedTillMaster>();
		fixedTillMasterList2 = halFixedTillMasterRepository.findAllById(storeNumbers);

		// Find list of Fixed till status details which are down for that particular
		// date
		List<HalFixedTillMaster> fixedTillMasterList3 = new ArrayList<HalFixedTillMaster>();
		// fixedTillMasterList3 =
		// halFixedTillMasterRepository.retrieveFixedTillDetailsforaParticularDate(new
		// Date());
		// Pass this list to main class and compare the list before preparing the final
		// list and sending across

		fixedTillStatusDisplay = new HalfordsFixedTillStatus();
		// System.out.println("Till Address" + displayTillStatus.getAll().get(0));

		// Use the class fixedTillStatusDisplay as generic and create multiple methods
		// for different parts and call them from other functions below
		List<FixedTillBean> fixedTillBean = fixedTillStatusDisplay.getFixedTillStatus(fixedTillMasterList2,
				storeNumbers);
		// System.out.println("Till Address" + displayTillStatus.getAll().toString());

		// Next update HAL_RD_FIXED_TILL_POLLING_DATA table with teh status of polling.
		// Need to write this JPA. Loop all the data in FixedTillBean and insert it into
		// HalFixedTillPollData

		List<HalFixedTillPollData> fixedTillPollDataTobeupdated = new ArrayList<HalFixedTillPollData>();
		HalFixedTillPollData halFixedTillPollData = new HalFixedTillPollData();
		for (FixedTillBean fixedTillBean2 : fixedTillBean) {
			halFixedTillPollData.setDateUp(fixedTillBean2.getFixedTillDateUp());
			halFixedTillPollData.setDownSince(fixedTillBean2.getFixedTillDownSince());
			halFixedTillPollData.setPollingDate(new Date().toString());
			halFixedTillPollData.setPollingNumber(fixedTillBean2.getFixedTillPollingNumber());
			halFixedTillPollData.setPollingTime(LocalDateTime.now().toString());
			halFixedTillPollData.setStoreIpAddress(fixedTillBean2.getFixedTillIpAddress());
			halFixedTillPollData.setTimeUp(fixedTillBean2.getFixedTillTimeUp());
			fixedTillPollDataTobeupdated.add(halFixedTillPollData);
		}

		halfordsTillPollDataRepository.saveAll(fixedTillPollDataTobeupdated);

		return fixedTillBean;
	}

	// Poll data for Halfords Printer
	@GetMapping("/retail-dashboard/printerstatus")
	public List<PrinterBean> findPrinterStatus() throws UnknownHostException, IOException {

		// Fetch details from hal_store_master table
		List<HalStoreMaster> storeMasterList1 = new ArrayList<HalStoreMaster>();
		storeMasterList1 = getStoreMasterDetails();

		// Extract store number from List 1
		List<Long> storeNumbers = new ArrayList<Long>();
		for (HalStoreMaster halStoreMaster : storeMasterList1) {
			storeNumbers.add(halStoreMaster.getStoreNumber());
		}

		List<HalPrinterMaster> printerMasterList2 = new ArrayList<HalPrinterMaster>();
		printerMasterList2 = halfordsPrinterRepository.findAllById(storeNumbers);

		// Find list of printer status details which are down for that particular date
		List<HalPrinterMaster> fixedTillMasterList3 = new ArrayList<HalPrinterMaster>();
		// fixedTillMasterList3 =
		// halFixedTillMasterRepository.retrieveFixedTillDetailsforaParticularDate(new
		// Date());
		// Pass this list to main class and compare the list before preparing the final
		// list and sending across

		printerStatusDisplay = new PrinterStatusDisplay();
		// System.out.println("Till Address" + displayTillStatus.getAll().get(0));
		List<PrinterBean> printerBean = printerStatusDisplay.getPrinterStatus(printerMasterList2, storeNumbers);
		// System.out.println("Till Address" + displayTillStatus.getAll().toString());

		// Next update HAL_RD_PRINTER_POLLING_DATA table with teh status of polling.
		// Need to write this JPA
		return printerBean;
	}

	@GetMapping("/retail-dashboard/pedstatus")
	public List<PedBean> findPedStatus() throws UnknownHostException, IOException {

		// Fetch details from hal_store_master table
				List<HalStoreMaster> storeMasterList1 = new ArrayList<HalStoreMaster>();
				storeMasterList1 = getStoreMasterDetails();

				// Extract store number from List 1
				List<Long> storeNumbers = new ArrayList<Long>();
				for (HalStoreMaster halStoreMaster : storeMasterList1) {
					storeNumbers.add(halStoreMaster.getStoreNumber());
				}

				List<HalPedMaster> pedMasterList2 = new ArrayList<HalPedMaster>();
				pedMasterList2 = halfordsPedMasterRepository.findAllById(storeNumbers);
				
				// Find list of ped status details which are down for that particular date
				List<HalPedMaster> pedMasterList3 = new ArrayList<HalPedMaster>();
				// fixedTillMasterList3 =
				// halFixedTillMasterRepository.retrieveFixedTillDetailsforaParticularDate(new
				// Date());
				// Pass this list to main class and compare the list before preparing the final
				// list and sending across

				
		pedStatusDisplay = new PedStatusDisplay();
		// System.out.println("Till Address" + displayTillStatus.getAll().get(0));
		List<PedBean> pedBean = pedStatusDisplay.getPedStatus(pedMasterList2,storeNumbers);
		// System.out.println("Till Address" + displayTillStatus.getAll().toString());
		return pedBean;
	}

	@GetMapping("/retail-dashboard/tabletstatus")
	public List<TabletBean> findTabletStatus() throws UnknownHostException, IOException {

		
		// Fetch details from hal_store_master table
		List<HalStoreMaster> storeMasterList1 = new ArrayList<HalStoreMaster>();
		storeMasterList1 = getStoreMasterDetails();

		// Extract store number from List 1
		List<Long> storeNumbers = new ArrayList<Long>();
		for (HalStoreMaster halStoreMaster : storeMasterList1) {
			storeNumbers.add(halStoreMaster.getStoreNumber());
		}

		List<HalTabletMaster> tabletMasterList2 = new ArrayList<HalTabletMaster>();
		tabletMasterList2 = halfordsTabletMasterRepository.findAllById(storeNumbers);
		// Find list of ped status details which are down for that particular date
		List<HalTabletMaster> tabletMasterList3 = new ArrayList<HalTabletMaster>();
		// fixedTillMasterList3 =
		// halFixedTillMasterRepository.retrieveFixedTillDetailsforaParticularDate(new
		// Date());
		// Pass this list to main class and compare the list before preparing the final
		// list and sending across
		
		tabletStatusDisplay = new TabletStatusDisplay();
		// System.out.println("Till Address" + displayTillStatus.getAll().get(0));
		List<TabletBean> tabletBean = tabletStatusDisplay.getTabletStatus(tabletMasterList2,storeNumbers);
		// System.out.println("Till Address" + displayTillStatus.getAll().toString());
		return tabletBean;
	}

	@GetMapping("/retail-dashboard/phonestatus")
	public List<PhoneBean> findPhoneStatus() throws UnknownHostException, IOException {

		
		// Fetch details from hal_store_master table
				List<HalStoreMaster> storeMasterList1 = new ArrayList<HalStoreMaster>();
				storeMasterList1 = getStoreMasterDetails();

				// Extract store number from List 1
				List<Long> storeNumbers = new ArrayList<Long>();
				for (HalStoreMaster halStoreMaster : storeMasterList1) {
					storeNumbers.add(halStoreMaster.getStoreNumber());
				}
				
				List<HalPhoneMaster> phoneMasterList2 = new ArrayList<HalPhoneMaster>();
				phoneMasterList2 = halPhoneMasterRepository.findAllById(storeNumbers);
				// Find list of ped status details which are down for that particular date
				List<HalPhoneMaster> tabletMasterList3 = new ArrayList<HalPhoneMaster>();
				// fixedTillMasterList3 =
				// halFixedTillMasterRepository.retrieveFixedTillDetailsforaParticularDate(new
				// Date());
				// Pass this list to main class and compare the list before preparing the final
				// list and sending across

		phoneStatusDisplay = new PhoneStatusDisplay();
		// System.out.println("Till Address" + displayTillStatus.getAll().get(0));
		List<PhoneBean> phoneBean = phoneStatusDisplay.getPhoneStatus(phoneMasterList2,storeNumbers);
		// System.out.println("Till Address" + displayTillStatus.getAll().toString());
		return phoneBean;
	}

	@GetMapping("/retail-dashboard/wifitatus")
	public List<WifiAccessPointBean> findWifiStatus() throws UnknownHostException, IOException {

		// Fetch details from hal_store_master table
		List<HalStoreMaster> storeMasterList1 = new ArrayList<HalStoreMaster>();
		storeMasterList1 = getStoreMasterDetails();

		// Extract store number from List 1
		List<Long> storeNumbers = new ArrayList<Long>();
		for (HalStoreMaster halStoreMaster : storeMasterList1) {
			storeNumbers.add(halStoreMaster.getStoreNumber());
		}
		
		List<HalWifiPointMaster> wifiMasterList2 = new ArrayList<HalWifiPointMaster>();
		wifiMasterList2 = halfordsWifiAccessPointRepository.findAllById(storeNumbers);
		// Find list of ped status details which are down for that particular date
		List<HalPhoneMaster> tabletMasterList3 = new ArrayList<HalPhoneMaster>();
		// fixedTillMasterList3 =
		// halFixedTillMasterRepository.retrieveFixedTillDetailsforaParticularDate(new
		// Date());
		// Pass this list to main class and compare the list before preparing the final
		// list and sending across
		
		wifiAccessPointStatus = new WifiAccessPointStatus();
		// System.out.println("Till Address" + displayTillStatus.getAll().get(0));
		List<WifiAccessPointBean> wifiBean = wifiAccessPointStatus.getWifiAccessStatus(wifiMasterList2,storeNumbers);
		// System.out.println("Till Address" + displayTillStatus.getAll().toString());
		return wifiBean;
	}

	// Fetch master details from HAL_RD_STORE_MASTER master table
	@GetMapping("/retail-dashboard/halstorestatus")
	public List<HalStoreMaster> getStoreMasterDetails() {
		List<HalStoreMaster> storeMaster = new ArrayList<HalStoreMaster>();
		storeMaster = halStoreRepository.findAll();
		System.out.println("Value" + storeMaster.size());
		return storeMaster;
	}

	@GetMapping("/retail-dashboard/halspecificstorestatus")
	public Optional<HalStoreMaster> getSpecificStoreMasterDetails() {
		int a = 863;
		halStoreRepository.findById(Long.parseLong(Integer.toString(a)));
		System.out.println("Value of Master" + halStoreRepository.findById(Long.parseLong(Integer.toString(a))));
		return halStoreRepository.findById(Long.valueOf(863));
	}

	// Fetch Fixed Till Poll Data
	@GetMapping("/retail-dashboard/tillPollData")
	public List<HalFixedTillPollData> getFixedTillPollData() {
		List<HalFixedTillPollData> fixedTillPollData = new ArrayList<HalFixedTillPollData>();
		fixedTillPollData = halfordsTillPollDataRepository.findAll();
		return fixedTillPollData;
	}

	@GetMapping("/retail-dashboard/helloworld")
	public String getHelloWorld() {
		return ("Hello World");
	}

	// Fetch Printer Poll Data
	@GetMapping("/retail-dashboard/printerPollData")
	public List<HalPrinterPollData> getPrinterPollData() {
		List<HalPrinterPollData> halPrinterPollData = new ArrayList<HalPrinterPollData>();
		halPrinterPollData = halPrinterPollDataRepository.findAll();
		return halPrinterPollData;
	}

	// Fetch Ped Poll Data
	@GetMapping("/retail-dashboard/pedPollData")
	public List<HalPedPollData> getPedPollData() {
		List<HalPedPollData> halPedPollData = new ArrayList<HalPedPollData>();
		halPedPollData = halPedPollDataRepository.findAll();
		return halPedPollData;
	}

	// Fetch Tablet Poll Data
	@GetMapping("/retail-dashboard/tabletPollData")
	public List<HalTabletPollData> getTabletPollData() {
		List<HalTabletPollData> halTabletPollData = new ArrayList<HalTabletPollData>();
		halTabletPollData = halTabletPollDataRepository.findAll();
		return halTabletPollData;
	}

	// Fetch Phone Poll Data
	@GetMapping("/retail-dashboard/phonePollData")
	public List<HalPhonePollData> getPhonePollData() {
		List<HalPhonePollData> halPhonePollData = new ArrayList<HalPhonePollData>();
		halPhonePollData = halPhonePollDataRepository.findAll();
		return halPhonePollData;
	}

	// Fetch Hht Poll Data
	@GetMapping("/retail-dashboard/hhtPollData")
	public List<HalHhtPollData> getHhtPollData() {
		List<HalHhtPollData> halHhtPollData = new ArrayList<HalHhtPollData>();
		halHhtPollData = halHhtPollDataRepository.findAll();
		return halHhtPollData;
	}

	// Fetch Wifi access point Poll Data
	@GetMapping("/retail-dashboard/wifiPollData")
	public List<HalWifiAccessPointPolData> getWifiPollData() {
		List<HalWifiAccessPointPolData> halWifiAccessPointPolData = new ArrayList<HalWifiAccessPointPolData>();
		halWifiAccessPointPolData = halWifiAccessPointPolDataRepository.findAll();
		return halWifiAccessPointPolData;
	}
}
