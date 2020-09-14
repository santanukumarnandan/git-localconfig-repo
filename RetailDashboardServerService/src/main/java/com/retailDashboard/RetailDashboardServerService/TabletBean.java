package com.retailDashboard.RetailDashboardServerService;

public class TabletBean {

	private String tabletTillIpAddress;
	private Long tabletTillStoreNumber;
	private String tabletTillPollingDate;
	private String tabletTillstoreAddressLink;
	private String tabletTillstoreName;
	private String tabletTillPollingTime;
	// This is sequence generated
	private Long tabletTillPollingNumber;
	private String tabletTillDateUp;
	private String tabletTillTimeUp;
	private String tabletTillDownSince;
	
	
	
	
	
	public TabletBean() {
		super();
	}





	public TabletBean(String tabletTillIpAddress, Long tabletTillStoreNumber, String tabletTillPollingDate,
			String tabletTillstoreAddressLink, String tabletTillstoreName, String tabletTillPollingTime,
			Long tabletTillPollingNumber, String tabletTillDateUp, String tabletTillTimeUp,
			String tabletTillDownSince) {
		super();
		this.tabletTillIpAddress = tabletTillIpAddress;
		this.tabletTillStoreNumber = tabletTillStoreNumber;
		this.tabletTillPollingDate = tabletTillPollingDate;
		this.tabletTillstoreAddressLink = tabletTillstoreAddressLink;
		this.tabletTillstoreName = tabletTillstoreName;
		this.tabletTillPollingTime = tabletTillPollingTime;
		this.tabletTillPollingNumber = tabletTillPollingNumber;
		this.tabletTillDateUp = tabletTillDateUp;
		this.tabletTillTimeUp = tabletTillTimeUp;
		this.tabletTillDownSince = tabletTillDownSince;
	}





	public String getTabletTillIpAddress() {
		return tabletTillIpAddress;
	}





	public void setTabletTillIpAddress(String tabletTillIpAddress) {
		this.tabletTillIpAddress = tabletTillIpAddress;
	}





	public Long getTabletTillStoreNumber() {
		return tabletTillStoreNumber;
	}





	public void setTabletTillStoreNumber(Long tabletTillStoreNumber) {
		this.tabletTillStoreNumber = tabletTillStoreNumber;
	}





	public String getTabletTillPollingDate() {
		return tabletTillPollingDate;
	}





	public void setTabletTillPollingDate(String tabletTillPollingDate) {
		this.tabletTillPollingDate = tabletTillPollingDate;
	}





	public String getTabletTillstoreAddressLink() {
		return tabletTillstoreAddressLink;
	}





	public void setTabletTillstoreAddressLink(String tabletTillstoreAddressLink) {
		this.tabletTillstoreAddressLink = tabletTillstoreAddressLink;
	}





	public String getTabletTillstoreName() {
		return tabletTillstoreName;
	}





	public void setTabletTillstoreName(String tabletTillstoreName) {
		this.tabletTillstoreName = tabletTillstoreName;
	}





	public String getTabletTillPollingTime() {
		return tabletTillPollingTime;
	}





	public void setTabletTillPollingTime(String tabletTillPollingTime) {
		this.tabletTillPollingTime = tabletTillPollingTime;
	}





	public Long getTabletTillPollingNumber() {
		return tabletTillPollingNumber;
	}





	public void setTabletTillPollingNumber(Long tabletTillPollingNumber) {
		this.tabletTillPollingNumber = tabletTillPollingNumber;
	}





	public String getTabletTillDateUp() {
		return tabletTillDateUp;
	}





	public void setTabletTillDateUp(String tabletTillDateUp) {
		this.tabletTillDateUp = tabletTillDateUp;
	}





	public String getTabletTillTimeUp() {
		return tabletTillTimeUp;
	}





	public void setTabletTillTimeUp(String tabletTillTimeUp) {
		this.tabletTillTimeUp = tabletTillTimeUp;
	}





	public String getTabletTillDownSince() {
		return tabletTillDownSince;
	}





	public void setTabletTillDownSince(String tabletTillDownSince) {
		this.tabletTillDownSince = tabletTillDownSince;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tabletTillDateUp == null) ? 0 : tabletTillDateUp.hashCode());
		result = prime * result + ((tabletTillDownSince == null) ? 0 : tabletTillDownSince.hashCode());
		result = prime * result + ((tabletTillIpAddress == null) ? 0 : tabletTillIpAddress.hashCode());
		result = prime * result + ((tabletTillPollingDate == null) ? 0 : tabletTillPollingDate.hashCode());
		result = prime * result + ((tabletTillPollingNumber == null) ? 0 : tabletTillPollingNumber.hashCode());
		result = prime * result + ((tabletTillPollingTime == null) ? 0 : tabletTillPollingTime.hashCode());
		result = prime * result + ((tabletTillStoreNumber == null) ? 0 : tabletTillStoreNumber.hashCode());
		result = prime * result + ((tabletTillTimeUp == null) ? 0 : tabletTillTimeUp.hashCode());
		result = prime * result + ((tabletTillstoreAddressLink == null) ? 0 : tabletTillstoreAddressLink.hashCode());
		result = prime * result + ((tabletTillstoreName == null) ? 0 : tabletTillstoreName.hashCode());
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
		TabletBean other = (TabletBean) obj;
		if (tabletTillDateUp == null) {
			if (other.tabletTillDateUp != null)
				return false;
		} else if (!tabletTillDateUp.equals(other.tabletTillDateUp))
			return false;
		if (tabletTillDownSince == null) {
			if (other.tabletTillDownSince != null)
				return false;
		} else if (!tabletTillDownSince.equals(other.tabletTillDownSince))
			return false;
		if (tabletTillIpAddress == null) {
			if (other.tabletTillIpAddress != null)
				return false;
		} else if (!tabletTillIpAddress.equals(other.tabletTillIpAddress))
			return false;
		if (tabletTillPollingDate == null) {
			if (other.tabletTillPollingDate != null)
				return false;
		} else if (!tabletTillPollingDate.equals(other.tabletTillPollingDate))
			return false;
		if (tabletTillPollingNumber == null) {
			if (other.tabletTillPollingNumber != null)
				return false;
		} else if (!tabletTillPollingNumber.equals(other.tabletTillPollingNumber))
			return false;
		if (tabletTillPollingTime == null) {
			if (other.tabletTillPollingTime != null)
				return false;
		} else if (!tabletTillPollingTime.equals(other.tabletTillPollingTime))
			return false;
		if (tabletTillStoreNumber == null) {
			if (other.tabletTillStoreNumber != null)
				return false;
		} else if (!tabletTillStoreNumber.equals(other.tabletTillStoreNumber))
			return false;
		if (tabletTillTimeUp == null) {
			if (other.tabletTillTimeUp != null)
				return false;
		} else if (!tabletTillTimeUp.equals(other.tabletTillTimeUp))
			return false;
		if (tabletTillstoreAddressLink == null) {
			if (other.tabletTillstoreAddressLink != null)
				return false;
		} else if (!tabletTillstoreAddressLink.equals(other.tabletTillstoreAddressLink))
			return false;
		if (tabletTillstoreName == null) {
			if (other.tabletTillstoreName != null)
				return false;
		} else if (!tabletTillstoreName.equals(other.tabletTillstoreName))
			return false;
		return true;
	}
	
	
	
}
