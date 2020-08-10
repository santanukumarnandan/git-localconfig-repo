package com.retailDashboard.RetailDashboardServerService;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.UnknownHostException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RetailDashboardServiceController {
	
	@Autowired
	private RetailDashboardServiceProxy retailDashboardServiceProxy;
	
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
	
	
	@GetMapping("/retail-dashboard/hhtstatus")
	public List<HHTAttributeBean> findHhtStatus() throws UnknownHostException, IOException {
		
		hhtStatusDisplay = new HhtStatusDisplay();
	    //	System.out.println("Till Address" + displayTillStatus.getAll().get(0));
	        List<HHTAttributeBean> hHTAttributeBean = hhtStatusDisplay.getHHTStatus();
	     //   System.out.println("Till Address" + displayTillStatus.getAll().toString());
	        return hHTAttributeBean;
	}

	
	@GetMapping("/tillstatus-feign")
	public List<TillStatusAttributes> retreiveTillStatus() {
		List<TillStatusAttributes> tillStatus = retailDashboardServiceProxy.retrieveTillStatus();
		return tillStatus;
	}
	
	@GetMapping("/retail-dashboard/fixedtillstatus")
	public List<FixedTillBean> findFixedTillStatus() throws UnknownHostException, IOException {
		
		fixedTillStatusDisplay = new FixedTillStatusDisplay();
	    //	System.out.println("Till Address" + displayTillStatus.getAll().get(0));
	        List<FixedTillBean> fixedTillBean = fixedTillStatusDisplay.getFixedTillStatus();
	     //   System.out.println("Till Address" + displayTillStatus.getAll().toString());
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
	
	
}
