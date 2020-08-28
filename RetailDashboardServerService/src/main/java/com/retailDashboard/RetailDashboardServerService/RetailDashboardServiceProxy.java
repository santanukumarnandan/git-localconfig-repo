package com.retailDashboard.RetailDashboardServerService;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//ZUUL is set up to call TillStatusDisplay service instead of calling it directly. Invocation will be like- http://localhost:8765/netflix-zuul-api-gateway-server/
@FeignClient("netflix-zuul-api-gateway-server")
@RibbonClient(name="currency-exchange-service")
public interface RetailDashboardServiceProxy {
	
	@GetMapping("/till-status-serice/hallfordsTillStatusAttributes")
	public List<TillStatusAttributes> retrieveTillStatus();

	
	
}
