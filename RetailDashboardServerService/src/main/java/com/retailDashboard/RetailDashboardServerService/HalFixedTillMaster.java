package com.retailDashboard.RetailDashboardServerService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HAL_RD_FIXED_TILL_MASTER")
public class HalFixedTillMaster {
	
	
	@Id
	 @Column(name="Store_Number")
	 private Long storeNumber;
	
	 @Column(name="Store_IP_Address")
	private String storeIpAddress;
	
	 @Column(name="Discovery_Date")
	private String discoveryDate;
	
	 @Column(name="Discovery_Time")
	private String discoveryTime;
	
	 @Column(name="Record_Number")
	private String recordNumber;
	
	 @Column(name="Is_Active")
	private String isActive;
	
	 @Column(name="Store_Host_Name")
	private String storeHostName;
	 
	 
	 

	public HalFixedTillMaster() {
		super();
	}




	public HalFixedTillMaster(Long storeNumber, String storeIpAddress, String discoveryDate, String discoveryTime,
			String recordNumber, String isActive, String storeHostName) {
		super();
		this.storeNumber = storeNumber;
		this.storeIpAddress = storeIpAddress;
		this.discoveryDate = discoveryDate;
		this.discoveryTime = discoveryTime;
		this.recordNumber = recordNumber;
		this.isActive = isActive;
		this.storeHostName = storeHostName;
	}




	public Long getStoreNumber() {
		return storeNumber;
	}




	public void setStoreNumber(Long storeNumber) {
		this.storeNumber = storeNumber;
	}




	public String getStoreIpAddress() {
		return storeIpAddress;
	}




	public void setStoreIpAddress(String storeIpAddress) {
		this.storeIpAddress = storeIpAddress;
	}




	public String getDiscoveryDate() {
		return discoveryDate;
	}




	public void setDiscoveryDate(String discoveryDate) {
		this.discoveryDate = discoveryDate;
	}




	public String getDiscoveryTime() {
		return discoveryTime;
	}




	public void setDiscoveryTime(String discoveryTime) {
		this.discoveryTime = discoveryTime;
	}




	public String getRecordNumber() {
		return recordNumber;
	}




	public void setRecordNumber(String recordNumber) {
		this.recordNumber = recordNumber;
	}




	public String getIsActive() {
		return isActive;
	}




	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}




	public String getStoreHostName() {
		return storeHostName;
	}




	public void setStoreHostName(String storeHostName) {
		this.storeHostName = storeHostName;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((discoveryDate == null) ? 0 : discoveryDate.hashCode());
		result = prime * result + ((discoveryTime == null) ? 0 : discoveryTime.hashCode());
		result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
		result = prime * result + ((recordNumber == null) ? 0 : recordNumber.hashCode());
		result = prime * result + ((storeHostName == null) ? 0 : storeHostName.hashCode());
		result = prime * result + ((storeIpAddress == null) ? 0 : storeIpAddress.hashCode());
		result = prime * result + ((storeNumber == null) ? 0 : storeNumber.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HalFixedTillMaster other = (HalFixedTillMaster) obj;
		if (discoveryDate == null) {
			if (other.discoveryDate != null)
				return false;
		} else if (!discoveryDate.equals(other.discoveryDate))
			return false;
		if (discoveryTime == null) {
			if (other.discoveryTime != null)
				return false;
		} else if (!discoveryTime.equals(other.discoveryTime))
			return false;
		if (isActive == null) {
			if (other.isActive != null)
				return false;
		} else if (!isActive.equals(other.isActive))
			return false;
		if (recordNumber == null) {
			if (other.recordNumber != null)
				return false;
		} else if (!recordNumber.equals(other.recordNumber))
			return false;
		if (storeHostName == null) {
			if (other.storeHostName != null)
				return false;
		} else if (!storeHostName.equals(other.storeHostName))
			return false;
		if (storeIpAddress == null) {
			if (other.storeIpAddress != null)
				return false;
		} else if (!storeIpAddress.equals(other.storeIpAddress))
			return false;
		if (storeNumber == null) {
			if (other.storeNumber != null)
				return false;
		} else if (!storeNumber.equals(other.storeNumber))
			return false;
		return true;
	}
	

	 
	 
}
