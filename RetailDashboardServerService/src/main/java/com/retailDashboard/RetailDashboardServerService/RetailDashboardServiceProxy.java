package com.retailDashboard.RetailDashboardServerService;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("netflix-zuul-api-gateway-server")
@RibbonClient(name="currency-exchange-service")
public interface RetailDashboardServiceProxy {
	
	@GetMapping("/hallfordsTillStatusAttributes")
	public List<TillStatusAttributes> retrieveTillStatus();

	
	
}
