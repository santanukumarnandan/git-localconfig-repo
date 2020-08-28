package com.retailDashboard.RetailDashboardServerService;

public class StoreAttributeDetails {

	private String tillIpAddress;
	private String storeName;
	private String storeAddress;
	private String storeNumber;
	
	
	public StoreAttributeDetails() {
		
	}
	
	
	
	public StoreAttributeDetails(String tillIpAddress, String storeName, String storeAddress, String storeNumber) {
		super();
		this.tillIpAddress = tillIpAddress;
		this.storeName = storeName;
		this.storeAddress = storeAddress;
		this.storeNumber = storeNumber;
	}
	public String getTillIpAddress() {
		return tillIpAddress;
	}
	public void setTillIpAddress(String tillIpAddress) {
		this.tillIpAddress = tillIpAddress;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreAddress() {
		return storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	public String getStoreNumber() {
		return storeNumber;
	}
	public void setStoreNumber(String storeNumber) {
		this.storeNumber = storeNumber;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((storeAddress == null) ? 0 : storeAddress.hashCode());
		result = prime * result + ((storeName == null) ? 0 : storeName.hashCode());
		result = prime * result + ((storeNumber == null) ? 0 : storeNumber.hashCode());
		result = prime * result + ((tillIpAddress == null) ? 0 : tillIpAddress.hashCode());
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
		StoreAttributeDetails other = (StoreAttributeDetails) obj;
		if (storeAddress == null) {
			if (other.storeAddress != null)
				return false;
		} else if (!storeAddress.equals(other.storeAddress))
			return false;
		if (storeName == null) {
			if (other.storeName != null)
				return false;
		} else if (!storeName.equals(other.storeName))
			return false;
		if (storeNumber == null) {
			if (other.storeNumber != null)
				return false;
		} else if (!storeNumber.equals(other.storeNumber))
			return false;
		if (tillIpAddress == null) {
			if (other.tillIpAddress != null)
				return false;
		} else if (!tillIpAddress.equals(other.tillIpAddress))
			return false;
		return true;
	}
	
	
	
	
	
	
}
