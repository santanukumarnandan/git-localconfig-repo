package com.retailDashboard.RetailDashboardServerService;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RetailDashboardServiceController {
	
	
	@GetMapping("/retail-dashboard/hhtstatus")
	public HHTAttributeBean convertCurrency() {
		
	}

}
