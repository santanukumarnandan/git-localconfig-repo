package com.example.TillDashboardinMySql;

import java.io.IOException;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class TillDashboardMySqlController {

	@Autowired
	private HalfordsStoreMasterRepository halfordsStoreMasterRepository;
	
	@Autowired
	private HalfordsFixedTillMasterRepository halfordsFixedTillMasterRepository;
	
	
	public HalFixedTillStatusCheck fixedTillStatusDisplay;
	
	@Autowired
	public HalfordsFixedTillPollDataRepository halfordsFixedTillPollDataRepository;
	
	@GetMapping("/till-dashboard/fixedtillstatus")
	public List<HalfordsFixedTillBean> findFixedTillStatus() throws UnknownHostException, IOException {

		// Fetch details from hal_store_master table
		List<HalfordsStoreMasterTable> storeMasterList1 = new ArrayList<HalfordsStoreMasterTable>();
		storeMasterList1 = getStoreMasterData();

		// Extract store number from List 1
		List<Long> storeNumbers = new ArrayList<Long>();
		List<String> ipRanges = new ArrayList<String>();
		
		// For first time there will be no data in hal fixed till master table. So we need to take the ip for till from hal store master table and extarct the till ip and add to repository 
		List<HalfordsFixedTillMaster> firstTimeList = new ArrayList<HalfordsFixedTillMaster>();

		for (HalfordsStoreMasterTable halStoreMaster : storeMasterList1) {
			HalfordsFixedTillMaster halFixedTillMaster = new HalfordsFixedTillMaster();
			storeNumbers.add(halStoreMaster.getStoreNumber());
			ipRanges.add(halStoreMaster.getIpRangeTill());
			halFixedTillMaster.setStoreIpAddress(halStoreMaster.getIpRangeTill());
			halFixedTillMaster.setStoreNumber(halStoreMaster.getStoreNumber());
			firstTimeList.add(halFixedTillMaster);
		}
		

		 System.out.println("Till IP Ranges" + ipRanges.size());
		 
		List<HalfordsFixedTillMaster> fixedTillMasterList2 = new ArrayList<HalfordsFixedTillMaster>();
		fixedTillMasterList2 = halfordsFixedTillMasterRepository.findAllById(storeNumbers);
		
		
//		if(fixedTillMasterList2.isEmpty()) {
//				for (String storeIp : ipRanges) {
//					halFixedTillMaster.setStoreIpAddress(storeIp);
//					
//					firstTimeList.add(halFixedTillMaster);
//				}
//				
//				 System.out.println("First time till ip list" + firstTimeList.size());
//		
//		}
		
		// Find list of Fixed till status details which are down for that particular
		// date
		List<HalfordsFixedTillMaster> fixedTillMasterList3 = new ArrayList<HalfordsFixedTillMaster>();
		// fixedTillMasterList3 =
		// halFixedTillMasterRepository.retrieveFixedTillDetailsforaParticularDate(new
		// Date());
		// Pass this list to main class and compare the list before preparing the final
		// list and sending across

		fixedTillStatusDisplay = new HalFixedTillStatusCheck();
		// System.out.println("Till Address" + displayTillStatus.getAll().get(0));

		// Use the class fixedTillStatusDisplay as generic and create multiple methods
		// for different parts and call them from other functions below. for first time fixed till masterlist2 will be blank. SO check it 
		List<HalfordsFixedTillBean> fixedTillBean = new ArrayList<HalfordsFixedTillBean>();
		if(fixedTillMasterList2.isEmpty()) {
			 fixedTillBean = fixedTillStatusDisplay.getFixedTillStatus(firstTimeList,
					storeNumbers);
		}
		else {
			fixedTillBean = fixedTillStatusDisplay.getFixedTillStatus(fixedTillMasterList2,
					storeNumbers);
		}
		
		// System.out.println("Till Address" + displayTillStatus.getAll().toString());

		// Next update HAL_RD_FIXED_TILL_POLLING_DATA table with teh status of polling.
		// Need to write this JPA. Loop all the data in FixedTillBean and insert it into
		// HalFixedTillPollData

		List<HalfordsFixedTillPollData> fixedTillPollDataTobeupdated = new ArrayList<HalfordsFixedTillPollData>();
		for (HalfordsFixedTillBean fixedTillBean2 : fixedTillBean) {
			HalfordsFixedTillPollData halFixedTillPollData = new HalfordsFixedTillPollData();
			halFixedTillPollData.setDateUp(fixedTillBean2.getFixedTillDateUp());
			halFixedTillPollData.setDownSince(fixedTillBean2.getFixedTillDownSince());
			halFixedTillPollData.setPollingDate(new Date().toString());
			halFixedTillPollData.setPollingNumber(fixedTillBean2.getFixedTillPollingNumber());
			halFixedTillPollData.setPollingTime(LocalDateTime.now().toString());
			halFixedTillPollData.setStoreIpAddress(fixedTillBean2.getFixedTillIpAddress());
			halFixedTillPollData.setTimeUp(fixedTillBean2.getFixedTillTimeUp());
			halFixedTillPollData.setStroreNumber(fixedTillBean2.getFixedTillStoreNumber());
			fixedTillPollDataTobeupdated.add(halFixedTillPollData);
		}

		halfordsFixedTillPollDataRepository.saveAll(fixedTillPollDataTobeupdated);

		return fixedTillBean;
	}
	
	
	
	// Fetch Store Master  Data
		@GetMapping("/till-dashboard/storemasterData")
		public List<HalfordsStoreMasterTable> getStoreMasterData() {
			List<HalfordsStoreMasterTable> fixedTillPollData = new ArrayList<HalfordsStoreMasterTable>();
			fixedTillPollData = halfordsStoreMasterRepository.findAll();
			return fixedTillPollData;
		}
	
}
