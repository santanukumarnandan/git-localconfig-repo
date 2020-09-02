package com.retailDashboard.RetailDashboardServerService;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HalfordsTillPollDataRepository extends JpaRepository<HalFixedTillPollData, String>{

//	public void saveAll(List<FixedTillBean> fixedTillBean);
	

}
