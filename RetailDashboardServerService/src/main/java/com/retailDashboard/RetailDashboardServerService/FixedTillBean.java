package com.retailDashboard.RetailDashboardServerService;

public class FixedTillBean {

	
	private String fixedTillIpAddress;
	private String fixedTillStoreNumber;
	private String fixedTillPollingDate;
	private String fixedTillstoreAddressLink;
	private String fixedTillstoreName;
	private String fixedTillPollingTime;
	private String fixedTillPollingNumber;
	private String fixedTillDateUp;
	private String fixedTillTimeUp;
	private String fixedTillDownSince;
	
	
	
	
	public FixedTillBean() {
		super();
	}
	public FixedTillBean(String fixedTillIpAddress, String fixedTillStoreNumber, String fixedTillPollingDate,
			String fixedTillstoreAddressLink, String fixedTillstoreName, String fixedTillPollingTime,
			String fixedTillPollingNumber, String fixedTillDateUp, String fixedTillTimeUp, String fixedTillDownSince) {
		super();
		this.fixedTillIpAddress = fixedTillIpAddress;
		this.fixedTillStoreNumber = fixedTillStoreNumber;
		this.fixedTillPollingDate = fixedTillPollingDate;
		this.fixedTillstoreAddressLink = fixedTillstoreAddressLink;
		this.fixedTillstoreName = fixedTillstoreName;
		this.fixedTillPollingTime = fixedTillPollingTime;
		this.fixedTillPollingNumber = fixedTillPollingNumber;
		this.fixedTillDateUp = fixedTillDateUp;
		this.fixedTillTimeUp = fixedTillTimeUp;
		this.fixedTillDownSince = fixedTillDownSince;
	}
	public String getFixedTillIpAddress() {
		return fixedTillIpAddress;
	}
	public void setFixedTillIpAddress(String fixedTillIpAddress) {
		this.fixedTillIpAddress = fixedTillIpAddress;
	}
	public String getFixedTillStoreNumber() {
		return fixedTillStoreNumber;
	}
	public void setFixedTillStoreNumber(String fixedTillStoreNumber) {
		this.fixedTillStoreNumber = fixedTillStoreNumber;
	}
	public String getFixedTillPollingDate() {
		return fixedTillPollingDate;
	}
	public void setFixedTillPollingDate(String fixedTillPollingDate) {
		this.fixedTillPollingDate = fixedTillPollingDate;
	}
	public String getFixedTillstoreAddressLink() {
		return fixedTillstoreAddressLink;
	}
	public void setFixedTillstoreAddressLink(String fixedTillstoreAddressLink) {
		this.fixedTillstoreAddressLink = fixedTillstoreAddressLink;
	}
	public String getFixedTillstoreName() {
		return fixedTillstoreName;
	}
	public void setFixedTillstoreName(String fixedTillstoreName) {
		this.fixedTillstoreName = fixedTillstoreName;
	}
	public String getFixedTillPollingTime() {
		return fixedTillPollingTime;
	}
	public void setFixedTillPollingTime(String fixedTillPollingTime) {
		this.fixedTillPollingTime = fixedTillPollingTime;
	}
	public String getFixedTillPollingNumber() {
		return fixedTillPollingNumber;
	}
	public void setFixedTillPollingNumber(String fixedTillPollingNumber) {
		this.fixedTillPollingNumber = fixedTillPollingNumber;
	}
	public String getFixedTillDateUp() {
		return fixedTillDateUp;
	}
	public void setFixedTillDateUp(String fixedTillDateUp) {
		this.fixedTillDateUp = fixedTillDateUp;
	}
	public String getFixedTillTimeUp() {
		return fixedTillTimeUp;
	}
	public void setFixedTillTimeUp(String fixedTillTimeUp) {
		this.fixedTillTimeUp = fixedTillTimeUp;
	}
	public String getFixedTillDownSince() {
		return fixedTillDownSince;
	}
	public void setFixedTillDownSince(String fixedTillDownSince) {
		this.fixedTillDownSince = fixedTillDownSince;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fixedTillDateUp == null) ? 0 : fixedTillDateUp.hashCode());
		result = prime * result + ((fixedTillDownSince == null) ? 0 : fixedTillDownSince.hashCode());
		result = prime * result + ((fixedTillIpAddress == null) ? 0 : fixedTillIpAddress.hashCode());
		result = prime * result + ((fixedTillPollingDate == null) ? 0 : fixedTillPollingDate.hashCode());
		result = prime * result + ((fixedTillPollingNumber == null) ? 0 : fixedTillPollingNumber.hashCode());
		result = prime * result + ((fixedTillPollingTime == null) ? 0 : fixedTillPollingTime.hashCode());
		result = prime * result + ((fixedTillStoreNumber == null) ? 0 : fixedTillStoreNumber.hashCode());
		result = prime * result + ((fixedTillTimeUp == null) ? 0 : fixedTillTimeUp.hashCode());
		result = prime * result + ((fixedTillstoreAddressLink == null) ? 0 : fixedTillstoreAddressLink.hashCode());
		result = prime * result + ((fixedTillstoreName == null) ? 0 : fixedTillstoreName.hashCode());
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
		FixedTillBean other = (FixedTillBean) obj;
		if (fixedTillDateUp == null) {
			if (other.fixedTillDateUp != null)
				return false;
		} else if (!fixedTillDateUp.equals(other.fixedTillDateUp))
			return false;
		if (fixedTillDownSince == null) {
			if (other.fixedTillDownSince != null)
				return false;
		} else if (!fixedTillDownSince.equals(other.fixedTillDownSince))
			return false;
		if (fixedTillIpAddress == null) {
			if (other.fixedTillIpAddress != null)
				return false;
		} else if (!fixedTillIpAddress.equals(other.fixedTillIpAddress))
			return false;
		if (fixedTillPollingDate == null) {
			if (other.fixedTillPollingDate != null)
				return false;
		} else if (!fixedTillPollingDate.equals(other.fixedTillPollingDate))
			return false;
		if (fixedTillPollingNumber == null) {
			if (other.fixedTillPollingNumber != null)
				return false;
		} else if (!fixedTillPollingNumber.equals(other.fixedTillPollingNumber))
			return false;
		if (fixedTillPollingTime == null) {
			if (other.fixedTillPollingTime != null)
				return false;
		} else if (!fixedTillPollingTime.equals(other.fixedTillPollingTime))
			return false;
		if (fixedTillStoreNumber == null) {
			if (other.fixedTillStoreNumber != null)
				return false;
		} else if (!fixedTillStoreNumber.equals(other.fixedTillStoreNumber))
			return false;
		if (fixedTillTimeUp == null) {
			if (other.fixedTillTimeUp != null)
				return false;
		} else if (!fixedTillTimeUp.equals(other.fixedTillTimeUp))
			return false;
		if (fixedTillstoreAddressLink == null) {
			if (other.fixedTillstoreAddressLink != null)
				return false;
		} else if (!fixedTillstoreAddressLink.equals(other.fixedTillstoreAddressLink))
			return false;
		if (fixedTillstoreName == null) {
			if (other.fixedTillstoreName != null)
				return false;
		} else if (!fixedTillstoreName.equals(other.fixedTillstoreName))
			return false;
		return true;
	}
	
	
	
}
