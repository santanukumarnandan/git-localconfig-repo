package com.retailDashboard.RetailDashboardServerService;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;



@Repository
public class HhtStatusDisplay {
	
	Map<String,HHTAttributeBean> hhtAttributesparentMap = null;
	Map<String,HHTAttributeBean> hhtAttributesSecondtMap = null;
	Map<String,HHTAttributeBean> hhtAttributesThirdtMap = null;
	
	  public List<HHTAttributeBean> getHHTStatus() throws UnknownHostException, IOException {
		
		  	hhtAttributesparentMap = new HashMap<String, HHTAttributeBean>();
		  	hhtAttributesparentMap.clear();
		  	hhtAttributesSecondtMap = new HashMap<String, HHTAttributeBean>();
		  	hhtAttributesSecondtMap.clear();
			hhtAttributesThirdtMap = new HashMap<String, HHTAttributeBean>();
			hhtAttributesThirdtMap.clear();
			
		  
	  }

}
