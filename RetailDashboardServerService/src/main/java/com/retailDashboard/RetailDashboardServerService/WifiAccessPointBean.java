package com.retailDashboard.RetailDashboardServerService;

public class WifiAccessPointBean {

	private String wifiAccessPointIpAddress;
	private String wifiAccessPointStoreNumber;
	private String wifiAccessPointPollingDate;
	private String wifiAccessPointstoreAddressLink;
	private String wifiAccessPointstoreName;
	private String wifiAccessPointPollingTime;
	private String wifiAccessPointPollingNumber;
	private String wifiAccessPointlDateUp;
	private String wifiAccessPointTimeUp;
	private String wifiAccessPointDownSince;
	
	
	
	public WifiAccessPointBean() {
		super();
	}



	public WifiAccessPointBean(String wifiAccessPointIpAddress, String wifiAccessPointStoreNumber,
			String wifiAccessPointPollingDate, String wifiAccessPointstoreAddressLink, String wifiAccessPointstoreName,
			String wifiAccessPointPollingTime, String wifiAccessPointPollingNumber, String wifiAccessPointlDateUp,
			String wifiAccessPointTimeUp, String wifiAccessPointDownSince) {
		super();
		this.wifiAccessPointIpAddress = wifiAccessPointIpAddress;
		this.wifiAccessPointStoreNumber = wifiAccessPointStoreNumber;
		this.wifiAccessPointPollingDate = wifiAccessPointPollingDate;
		this.wifiAccessPointstoreAddressLink = wifiAccessPointstoreAddressLink;
		this.wifiAccessPointstoreName = wifiAccessPointstoreName;
		this.wifiAccessPointPollingTime = wifiAccessPointPollingTime;
		this.wifiAccessPointPollingNumber = wifiAccessPointPollingNumber;
		this.wifiAccessPointlDateUp = wifiAccessPointlDateUp;
		this.wifiAccessPointTimeUp = wifiAccessPointTimeUp;
		this.wifiAccessPointDownSince = wifiAccessPointDownSince;
	}



	public String getWifiAccessPointIpAddress() {
		return wifiAccessPointIpAddress;
	}



	public void setWifiAccessPointIpAddress(String wifiAccessPointIpAddress) {
		this.wifiAccessPointIpAddress = wifiAccessPointIpAddress;
	}



	public String getWifiAccessPointStoreNumber() {
		return wifiAccessPointStoreNumber;
	}



	public void setWifiAccessPointStoreNumber(String wifiAccessPointStoreNumber) {
		this.wifiAccessPointStoreNumber = wifiAccessPointStoreNumber;
	}



	public String getWifiAccessPointPollingDate() {
		return wifiAccessPointPollingDate;
	}



	public void setWifiAccessPointPollingDate(String wifiAccessPointPollingDate) {
		this.wifiAccessPointPollingDate = wifiAccessPointPollingDate;
	}



	public String getWifiAccessPointstoreAddressLink() {
		return wifiAccessPointstoreAddressLink;
	}



	public void setWifiAccessPointstoreAddressLink(String wifiAccessPointstoreAddressLink) {
		this.wifiAccessPointstoreAddressLink = wifiAccessPointstoreAddressLink;
	}



	public String getWifiAccessPointstoreName() {
		return wifiAccessPointstoreName;
	}



	public void setWifiAccessPointstoreName(String wifiAccessPointstoreName) {
		this.wifiAccessPointstoreName = wifiAccessPointstoreName;
	}



	public String getWifiAccessPointPollingTime() {
		return wifiAccessPointPollingTime;
	}



	public void setWifiAccessPointPollingTime(String wifiAccessPointPollingTime) {
		this.wifiAccessPointPollingTime = wifiAccessPointPollingTime;
	}



	public String getWifiAccessPointPollingNumber() {
		return wifiAccessPointPollingNumber;
	}



	public void setWifiAccessPointPollingNumber(String wifiAccessPointPollingNumber) {
		this.wifiAccessPointPollingNumber = wifiAccessPointPollingNumber;
	}



	public String getWifiAccessPointlDateUp() {
		return wifiAccessPointlDateUp;
	}



	public void setWifiAccessPointlDateUp(String wifiAccessPointlDateUp) {
		this.wifiAccessPointlDateUp = wifiAccessPointlDateUp;
	}



	public String getWifiAccessPointTimeUp() {
		return wifiAccessPointTimeUp;
	}



	public void setWifiAccessPointTimeUp(String wifiAccessPointTimeUp) {
		this.wifiAccessPointTimeUp = wifiAccessPointTimeUp;
	}



	public String getWifiAccessPointDownSince() {
		return wifiAccessPointDownSince;
	}



	public void setWifiAccessPointDownSince(String wifiAccessPointDownSince) {
		this.wifiAccessPointDownSince = wifiAccessPointDownSince;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((wifiAccessPointDownSince == null) ? 0 : wifiAccessPointDownSince.hashCode());
		result = prime * result + ((wifiAccessPointIpAddress == null) ? 0 : wifiAccessPointIpAddress.hashCode());
		result = prime * result + ((wifiAccessPointPollingDate == null) ? 0 : wifiAccessPointPollingDate.hashCode());
		result = prime * result
				+ ((wifiAccessPointPollingNumber == null) ? 0 : wifiAccessPointPollingNumber.hashCode());
		result = prime * result + ((wifiAccessPointPollingTime == null) ? 0 : wifiAccessPointPollingTime.hashCode());
		result = prime * result + ((wifiAccessPointStoreNumber == null) ? 0 : wifiAccessPointStoreNumber.hashCode());
		result = prime * result + ((wifiAccessPointTimeUp == null) ? 0 : wifiAccessPointTimeUp.hashCode());
		result = prime * result + ((wifiAccessPointlDateUp == null) ? 0 : wifiAccessPointlDateUp.hashCode());
		result = prime * result
				+ ((wifiAccessPointstoreAddressLink == null) ? 0 : wifiAccessPointstoreAddressLink.hashCode());
		result = prime * result + ((wifiAccessPointstoreName == null) ? 0 : wifiAccessPointstoreName.hashCode());
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
		WifiAccessPointBean other = (WifiAccessPointBean) obj;
		if (wifiAccessPointDownSince == null) {
			if (other.wifiAccessPointDownSince != null)
				return false;
		} else if (!wifiAccessPointDownSince.equals(other.wifiAccessPointDownSince))
			return false;
		if (wifiAccessPointIpAddress == null) {
			if (other.wifiAccessPointIpAddress != null)
				return false;
		} else if (!wifiAccessPointIpAddress.equals(other.wifiAccessPointIpAddress))
			return false;
		if (wifiAccessPointPollingDate == null) {
			if (other.wifiAccessPointPollingDate != null)
				return false;
		} else if (!wifiAccessPointPollingDate.equals(other.wifiAccessPointPollingDate))
			return false;
		if (wifiAccessPointPollingNumber == null) {
			if (other.wifiAccessPointPollingNumber != null)
				return false;
		} else if (!wifiAccessPointPollingNumber.equals(other.wifiAccessPointPollingNumber))
			return false;
		if (wifiAccessPointPollingTime == null) {
			if (other.wifiAccessPointPollingTime != null)
				return false;
		} else if (!wifiAccessPointPollingTime.equals(other.wifiAccessPointPollingTime))
			return false;
		if (wifiAccessPointStoreNumber == null) {
			if (other.wifiAccessPointStoreNumber != null)
				return false;
		} else if (!wifiAccessPointStoreNumber.equals(other.wifiAccessPointStoreNumber))
			return false;
		if (wifiAccessPointTimeUp == null) {
			if (other.wifiAccessPointTimeUp != null)
				return false;
		} else if (!wifiAccessPointTimeUp.equals(other.wifiAccessPointTimeUp))
			return false;
		if (wifiAccessPointlDateUp == null) {
			if (other.wifiAccessPointlDateUp != null)
				return false;
		} else if (!wifiAccessPointlDateUp.equals(other.wifiAccessPointlDateUp))
			return false;
		if (wifiAccessPointstoreAddressLink == null) {
			if (other.wifiAccessPointstoreAddressLink != null)
				return false;
		} else if (!wifiAccessPointstoreAddressLink.equals(other.wifiAccessPointstoreAddressLink))
			return false;
		if (wifiAccessPointstoreName == null) {
			if (other.wifiAccessPointstoreName != null)
				return false;
		} else if (!wifiAccessPointstoreName.equals(other.wifiAccessPointstoreName))
			return false;
		return true;
	}
	
	
	
	
	
	
}
