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
}
