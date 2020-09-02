package com.retailDashboard.RetailDashboardServerService;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class RetailDashbaordExecuterClass {
	
	
	@Autowired
	private static RetailDashboardServiceProxy retailDashboardServiceProxy;

	@Autowired
	public static HalfordsFixedTillStatus fixedTillStatusDisplay;
	
	@Autowired
	public static PrinterStatusDisplay printerStatusDisplay;
	
	@Autowired
	private static PedStatusDisplay pedStatusDisplay;
	
	@Autowired
	private static TabletStatusDisplay tabletStatusDisplay;
	
	@Autowired
	public static HhtStatusDisplay hhtStatusDisplay;
	
	@Autowired
	private static PhoneStatusDisplay phoneStatusDisplay;
	
	@Autowired
	private static WifiAccessPointStatus wifiAccessPointStatus;
	
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		hhtStatusDisplay = new HhtStatusDisplay();
	    hhtStatusDisplay.getHHTStatus();
	    System.out.println("Status" + hhtStatusDisplay.getHHTStatus().size());
	}
	
	
}
