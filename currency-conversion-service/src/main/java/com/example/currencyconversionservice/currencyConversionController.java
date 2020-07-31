package com.example.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class currencyConversionController {

	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
		
		Map<String, String> uriVariables= new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		
		
		
		ResponseEntity<CurrencyConversionBean> responseentity = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/(to)", CurrencyConversionBean.class, uriVariables);
		CurrencyConversionBean  response = responseentity.getBody();
		return new CurrencyConversionBean(response.getId(),from,to,response.getConversionMultiple(),quantity,quantity.multiply(response.getConversionMultiple()),response.getPort());
		
	//	return new CurrencyConversionBean(1L,from,to,BigDecimal.ONE,quantity,quantity,0);
	}
	
	@GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrencyFeign(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
		
		/*
		 * Map<String, String> uriVariables= new HashMap<>(); uriVariables.put("from",
		 * from); uriVariables.put("to", to);
		 * 
		 * 
		 * 
		 * ResponseEntity<CurrencyConversionBean> responseentity = new
		 * RestTemplate().getForEntity(
		 * "http://localhost:8000/currency-exchange/from/{from}/to/(to)",
		 * CurrencyConversionBean.class, uriVariables);
		 */
		//Impementing Feign and calling Feign proxy
		CurrencyConversionBean  response = proxy.retrieveExchangeValue(from, to);
		return new CurrencyConversionBean(response.getId(),from,to,response.getConversionMultiple(),quantity,quantity.multiply(response.getConversionMultiple()),response.getPort());
		
	//	return new CurrencyConversionBean(1L,from,to,BigDecimal.ONE,quantity,quantity,0);
	}
}
