package com.retailDashboard.RetailDashboardServerService;

public class HHTAttributeBean {
	
	private String hhtIpAddress;
	private Long hhtStoreNumber;
	private String hhtPollingDate;
	private String hhtstoreAddressLink;
	private String hhtstoreName;
	private String hhtPollingTime;
	//sequence generated
	private Long hhtPollingNumber;
	private String hhtDateUp;
	private String hhtTimeUp;
	private String hhtDownSince;
	
	
	public HHTAttributeBean() {
		
	}
	
	
	
	public HHTAttributeBean(String hhtIpAddress, Long hhtStoreNumber, String hhtPollingDate,
			String hhtstoreAddressLink, String hhtstoreName, String hhtPollingTime, Long hhtPollingNumber,
			String hhtDateUp, String hhtTimeUp, String hhtDownSince) {
		super();
		this.hhtIpAddress = hhtIpAddress;
		this.hhtStoreNumber = hhtStoreNumber;
		this.hhtPollingDate = hhtPollingDate;
		this.hhtstoreAddressLink = hhtstoreAddressLink;
		this.hhtstoreName = hhtstoreName;
		this.hhtPollingTime = hhtPollingTime;
		this.hhtPollingNumber = hhtPollingNumber;
		this.hhtDateUp = hhtDateUp;
		this.hhtTimeUp = hhtTimeUp;
		this.hhtDownSince = hhtDownSince;
	}
	public String getHhtIpAddress() {
		return hhtIpAddress;
	}
	public void setHhtIpAddress(String hhtIpAddress) {
		this.hhtIpAddress = hhtIpAddress;
	}
	public Long getHhtStoreNumber() {
		return hhtStoreNumber;
	}
	public void setHhtStoreNumber(Long hhtStoreNumber) {
		this.hhtStoreNumber = hhtStoreNumber;
	}
	public String getHhtPollingDate() {
		return hhtPollingDate;
	}
	public void setHhtPollingDate(String hhtPollingDate) {
		this.hhtPollingDate = hhtPollingDate;
	}
	public String getHhtstoreAddressLink() {
		return hhtstoreAddressLink;
	}
	public void setHhtstoreAddressLink(String hhtstoreAddressLink) {
		this.hhtstoreAddressLink = hhtstoreAddressLink;
	}
	public String getHhtstoreName() {
		return hhtstoreName;
	}
	public void setHhtstoreName(String hhtstoreName) {
		this.hhtstoreName = hhtstoreName;
	}
	public String getHhtPollingTime() {
		return hhtPollingTime;
	}
	public void setHhtPollingTime(String hhtPollingTime) {
		this.hhtPollingTime = hhtPollingTime;
	}
	public Long getHhtPollingNumber() {
		return hhtPollingNumber;
	}
	public void setHhtPollingNumber(Long hhtPollingNumber) {
		this.hhtPollingNumber = hhtPollingNumber;
	}
	public String getHhtDateUp() {
		return hhtDateUp;
	}
	public void setHhtDateUp(String hhtDateUp) {
		this.hhtDateUp = hhtDateUp;
	}
	public String getHhtTimeUp() {
		return hhtTimeUp;
	}
	public void setHhtTimeUp(String hhtTimeUp) {
		this.hhtTimeUp = hhtTimeUp;
	}
	public String getHhtDownSince() {
		return hhtDownSince;
	}
	public void setHhtDownSince(String hhtDownSince) {
		this.hhtDownSince = hhtDownSince;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hhtDateUp == null) ? 0 : hhtDateUp.hashCode());
		result = prime * result + ((hhtDownSince == null) ? 0 : hhtDownSince.hashCode());
		result = prime * result + ((hhtIpAddress == null) ? 0 : hhtIpAddress.hashCode());
		result = prime * result + ((hhtPollingDate == null) ? 0 : hhtPollingDate.hashCode());
		result = prime * result + ((hhtPollingNumber == null) ? 0 : hhtPollingNumber.hashCode());
		result = prime * result + ((hhtPollingTime == null) ? 0 : hhtPollingTime.hashCode());
		result = prime * result + ((hhtStoreNumber == null) ? 0 : hhtStoreNumber.hashCode());
		result = prime * result + ((hhtTimeUp == null) ? 0 : hhtTimeUp.hashCode());
		result = prime * result + ((hhtstoreAddressLink == null) ? 0 : hhtstoreAddressLink.hashCode());
		result = prime * result + ((hhtstoreName == null) ? 0 : hhtstoreName.hashCode());
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
		HHTAttributeBean other = (HHTAttributeBean) obj;
		if (hhtDateUp == null) {
			if (other.hhtDateUp != null)
				return false;
		} else if (!hhtDateUp.equals(other.hhtDateUp))
			return false;
		if (hhtDownSince == null) {
			if (other.hhtDownSince != null)
				return false;
		} else if (!hhtDownSince.equals(other.hhtDownSince))
			return false;
		if (hhtIpAddress == null) {
			if (other.hhtIpAddress != null)
				return false;
		} else if (!hhtIpAddress.equals(other.hhtIpAddress))
			return false;
		if (hhtPollingDate == null) {
			if (other.hhtPollingDate != null)
				return false;
		} else if (!hhtPollingDate.equals(other.hhtPollingDate))
			return false;
		if (hhtPollingNumber == null) {
			if (other.hhtPollingNumber != null)
				return false;
		} else if (!hhtPollingNumber.equals(other.hhtPollingNumber))
			return false;
		if (hhtPollingTime == null) {
			if (other.hhtPollingTime != null)
				return false;
		} else if (!hhtPollingTime.equals(other.hhtPollingTime))
			return false;
		if (hhtStoreNumber == null) {
			if (other.hhtStoreNumber != null)
				return false;
		} else if (!hhtStoreNumber.equals(other.hhtStoreNumber))
			return false;
		if (hhtTimeUp == null) {
			if (other.hhtTimeUp != null)
				return false;
		} else if (!hhtTimeUp.equals(other.hhtTimeUp))
			return false;
		if (hhtstoreAddressLink == null) {
			if (other.hhtstoreAddressLink != null)
				return false;
		} else if (!hhtstoreAddressLink.equals(other.hhtstoreAddressLink))
			return false;
		if (hhtstoreName == null) {
			if (other.hhtstoreName != null)
				return false;
		} else if (!hhtstoreName.equals(other.hhtstoreName))
			return false;
		return true;
	}
	
	
	

}
