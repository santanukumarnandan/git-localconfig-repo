package com.retailDashboard.RetailDashboardServerService;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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
	public FixedTillStatusDisplay fixedTillStatusDisplay;
	
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
	
	
	@GetMapping("/retail-dashboard/hhtstatus")
	public List<HHTAttributeBean> findHhtStatus() throws UnknownHostException, IOException {
		
		hhtStatusDisplay = new HhtStatusDisplay();
	    //	System.out.println("Till Address" + displayTillStatus.getAll().get(0));
	        List<HHTAttributeBean> hHTAttributeBean = hhtStatusDisplay.getHHTStatus();
	     //   System.out.println("Till Address" + displayTillStatus.getAll().toString());
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
		List<HalStoreMaster> storeMasterList1= new ArrayList<HalStoreMaster>();
		storeMasterList1 = getStoreMasterDetails();
		
		//Extract store number from List 1
		List<Long> storeNumbers = new ArrayList<Long>();
		for (HalStoreMaster halStoreMaster : storeMasterList1) {
			storeNumbers.add(halStoreMaster.getStoreNumber());
		}
		
		List<HalFixedTillMaster> fixedTillMasterList2 = new ArrayList<HalFixedTillMaster>();
		fixedTillMasterList2 = halFixedTillMasterRepository.findAllById(storeNumbers);
		
		
		//Find list of Fixed till status details which are down for that particular date
		List<HalFixedTillMaster> fixedTillMasterList3 = new ArrayList<HalFixedTillMaster>();
	//	fixedTillMasterList3 = halFixedTillMasterRepository.retrieveFixedTillDetailsforaParticularDate(new Date());
		//Pass this list to main class and compare the list before preparing the final list and sending across
		
		fixedTillStatusDisplay = new FixedTillStatusDisplay();
	    //	System.out.println("Till Address" + displayTillStatus.getAll().get(0));
		
		//Use the class fixedTillStatusDisplay as generic and create multiple methods for different parts and call them from other functions below 
	        List<FixedTillBean> fixedTillBean = fixedTillStatusDisplay.getFixedTillStatus(fixedTillMasterList2, storeNumbers);
	     //   System.out.println("Till Address" + displayTillStatus.getAll().toString());
	      
	        //Next update HAL_RD_FIXED_TILL_POLLING_DATA table with teh status of polling. Need to write this JPA
	        
	        return fixedTillBean;
	}
	
	@GetMapping("/retail-dashboard/printerstatus")
	public List<PrinterBean> findPrinterStatus() throws UnknownHostException, IOException {
		
		printerStatusDisplay = new PrinterStatusDisplay();
	    //	System.out.println("Till Address" + displayTillStatus.getAll().get(0));
	        List<PrinterBean> printerBean = printerStatusDisplay.getPrinterStatus();
	     //   System.out.println("Till Address" + displayTillStatus.getAll().toString());
	        return printerBean;
	}
	
	@GetMapping("/retail-dashboard/pedstatus")
	public List<PedBean> findPedStatus() throws UnknownHostException, IOException {
		
		pedStatusDisplay = new PedStatusDisplay();
	    //	System.out.println("Till Address" + displayTillStatus.getAll().get(0));
	        List<PedBean> pedBean = pedStatusDisplay.getPedStatus();
	     //   System.out.println("Till Address" + displayTillStatus.getAll().toString());
	        return pedBean;
	}
	
	@GetMapping("/retail-dashboard/tabletstatus")
	public List<TabletBean> findTabletStatus() throws UnknownHostException, IOException {
		
		tabletStatusDisplay = new TabletStatusDisplay();
	    //	System.out.println("Till Address" + displayTillStatus.getAll().get(0));
	        List<TabletBean> tabletBean = tabletStatusDisplay.getTabletStatus();
	     //   System.out.println("Till Address" + displayTillStatus.getAll().toString());
	        return tabletBean;
	}
	
	
	
	@GetMapping("/retail-dashboard/phonestatus")
	public List<PhoneBean> findPhoneStatus() throws UnknownHostException, IOException {
		
		phoneStatusDisplay = new PhoneStatusDisplay();
	    //	System.out.println("Till Address" + displayTillStatus.getAll().get(0));
	        List<PhoneBean> phoneBean = phoneStatusDisplay.getPhoneStatus();
	     //   System.out.println("Till Address" + displayTillStatus.getAll().toString());
	        return phoneBean;
	}
	
	@GetMapping("/retail-dashboard/wifitatus")
	public List<WifiAccessPointBean> findWifiStatus() throws UnknownHostException, IOException {
		
		wifiAccessPointStatus = new WifiAccessPointStatus();
	    //	System.out.println("Till Address" + displayTillStatus.getAll().get(0));
	        List<WifiAccessPointBean> wifiBean = wifiAccessPointStatus.getWifiAccessStatus();
	     //   System.out.println("Till Address" + displayTillStatus.getAll().toString());
	        return wifiBean;
	}
	
	
	//Fetch master details from HAL_RD_STORE_MASTER master table
	@GetMapping("/retail-dashboard/halstorestatus")
	public List<HalStoreMaster> getStoreMasterDetails() {
		List<HalStoreMaster> storeMaster= new ArrayList<HalStoreMaster>();
		storeMaster =halStoreRepository.findAll();
		System.out.println("Value" + storeMaster.size());
		 return storeMaster;
	}
	

	
	@GetMapping("/retail-dashboard/halspecificstorestatus")
	public Optional<HalStoreMaster> getSpecificStoreMasterDetails() {
		int a=863;
		halStoreRepository.findById(Long.parseLong(Integer.toString(a)));
		System.out.println("Value of Master" + halStoreRepository.findById(Long.parseLong(Integer.toString(a))));
		 return halStoreRepository.findById(Long.valueOf(863));
	}
	
	@GetMapping("/retail-dashboard/tillPollData")
	public List<HalFixedTillPollData> getFixedTillPollData() {
		List<HalFixedTillPollData> fixedTillPollData = new ArrayList<HalFixedTillPollData>();
		fixedTillPollData = halfordsTillPollDataRepository.findAll();
		return fixedTillPollData;
	}
	
}
