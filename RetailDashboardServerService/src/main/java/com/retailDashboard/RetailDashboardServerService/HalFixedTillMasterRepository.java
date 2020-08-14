package com.retailDashboard.RetailDashboardServerService;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HalFixedTillMasterRepository extends JpaRepository<HalFixedTillMaster, Long>{

	List<HalFixedTillMaster> retrieveFixedTillDetailsforaParticularDate(Date systemDate);
	
}
