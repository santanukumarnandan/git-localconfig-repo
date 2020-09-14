package com.retailDashboard.RetailDashboardServerService;

public class PedBean {

	private String pedTillIpAddress;
	private Long pedTillStoreNumber;
	private String pedTillPollingDate;
	private String pedTillstoreAddressLink;
	private String pedTillstoreName;
	private String pedTillPollingTime;
	//This is record number in Ped MASTER TABLE WHICH IS GENERATED IN SEQUENCE
	private Long pedTillPollingNumber;
	private String pedTillDateUp;
	private String pedTillTimeUp;
	private String pedTillDownSince;
	
	
	
	
	public PedBean() {
		super();
	}




	public PedBean(String pedTillIpAddress, Long pedTillStoreNumber, String pedTillPollingDate,
			String pedTillstoreAddressLink, String pedTillstoreName, String pedTillPollingTime,
			Long pedTillPollingNumber, String pedTillDateUp, String pedTillTimeUp, String pedTillDownSince) {
		super();
		this.pedTillIpAddress = pedTillIpAddress;
		this.pedTillStoreNumber = pedTillStoreNumber;
		this.pedTillPollingDate = pedTillPollingDate;
		this.pedTillstoreAddressLink = pedTillstoreAddressLink;
		this.pedTillstoreName = pedTillstoreName;
		this.pedTillPollingTime = pedTillPollingTime;
		this.pedTillPollingNumber = pedTillPollingNumber;
		this.pedTillDateUp = pedTillDateUp;
		this.pedTillTimeUp = pedTillTimeUp;
		this.pedTillDownSince = pedTillDownSince;
	}




	public String getPedTillIpAddress() {
		return pedTillIpAddress;
	}




	public void setPedTillIpAddress(String pedTillIpAddress) {
		this.pedTillIpAddress = pedTillIpAddress;
	}




	public Long getPedTillStoreNumber() {
		return pedTillStoreNumber;
	}




	public void setPedTillStoreNumber(Long pedTillStoreNumber) {
		this.pedTillStoreNumber = pedTillStoreNumber;
	}




	public String getPedTillPollingDate() {
		return pedTillPollingDate;
	}




	public void setPedTillPollingDate(String pedTillPollingDate) {
		this.pedTillPollingDate = pedTillPollingDate;
	}




	public String getPedTillstoreAddressLink() {
		return pedTillstoreAddressLink;
	}




	public void setPedTillstoreAddressLink(String pedTillstoreAddressLink) {
		this.pedTillstoreAddressLink = pedTillstoreAddressLink;
	}




	public String getPedTillstoreName() {
		return pedTillstoreName;
	}




	public void setPedTillstoreName(String pedTillstoreName) {
		this.pedTillstoreName = pedTillstoreName;
	}




	public String getPedTillPollingTime() {
		return pedTillPollingTime;
	}




	public void setPedTillPollingTime(String pedTillPollingTime) {
		this.pedTillPollingTime = pedTillPollingTime;
	}




	public Long getPedTillPollingNumber() {
		return pedTillPollingNumber;
	}




	public void setPedTillPollingNumber(Long pedTillPollingNumber) {
		this.pedTillPollingNumber = pedTillPollingNumber;
	}




	public String getPedTillDateUp() {
		return pedTillDateUp;
	}




	public void setPedTillDateUp(String pedTillDateUp) {
		this.pedTillDateUp = pedTillDateUp;
	}




	public String getPedTillTimeUp() {
		return pedTillTimeUp;
	}




	public void setPedTillTimeUp(String pedTillTimeUp) {
		this.pedTillTimeUp = pedTillTimeUp;
	}




	public String getPedTillDownSince() {
		return pedTillDownSince;
	}




	public void setPedTillDownSince(String pedTillDownSince) {
		this.pedTillDownSince = pedTillDownSince;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pedTillDateUp == null) ? 0 : pedTillDateUp.hashCode());
		result = prime * result + ((pedTillDownSince == null) ? 0 : pedTillDownSince.hashCode());
		result = prime * result + ((pedTillIpAddress == null) ? 0 : pedTillIpAddress.hashCode());
		result = prime * result + ((pedTillPollingDate == null) ? 0 : pedTillPollingDate.hashCode());
		result = prime * result + ((pedTillPollingNumber == null) ? 0 : pedTillPollingNumber.hashCode());
		result = prime * result + ((pedTillPollingTime == null) ? 0 : pedTillPollingTime.hashCode());
		result = prime * result + ((pedTillStoreNumber == null) ? 0 : pedTillStoreNumber.hashCode());
		result = prime * result + ((pedTillTimeUp == null) ? 0 : pedTillTimeUp.hashCode());
		result = prime * result + ((pedTillstoreAddressLink == null) ? 0 : pedTillstoreAddressLink.hashCode());
		result = prime * result + ((pedTillstoreName == null) ? 0 : pedTillstoreName.hashCode());
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
		PedBean other = (PedBean) obj;
		if (pedTillDateUp == null) {
			if (other.pedTillDateUp != null)
				return false;
		} else if (!pedTillDateUp.equals(other.pedTillDateUp))
			return false;
		if (pedTillDownSince == null) {
			if (other.pedTillDownSince != null)
				return false;
		} else if (!pedTillDownSince.equals(other.pedTillDownSince))
			return false;
		if (pedTillIpAddress == null) {
			if (other.pedTillIpAddress != null)
				return false;
		} else if (!pedTillIpAddress.equals(other.pedTillIpAddress))
			return false;
		if (pedTillPollingDate == null) {
			if (other.pedTillPollingDate != null)
				return false;
		} else if (!pedTillPollingDate.equals(other.pedTillPollingDate))
			return false;
		if (pedTillPollingNumber == null) {
			if (other.pedTillPollingNumber != null)
				return false;
		} else if (!pedTillPollingNumber.equals(other.pedTillPollingNumber))
			return false;
		if (pedTillPollingTime == null) {
			if (other.pedTillPollingTime != null)
				return false;
		} else if (!pedTillPollingTime.equals(other.pedTillPollingTime))
			return false;
		if (pedTillStoreNumber == null) {
			if (other.pedTillStoreNumber != null)
				return false;
		} else if (!pedTillStoreNumber.equals(other.pedTillStoreNumber))
			return false;
		if (pedTillTimeUp == null) {
			if (other.pedTillTimeUp != null)
				return false;
		} else if (!pedTillTimeUp.equals(other.pedTillTimeUp))
			return false;
		if (pedTillstoreAddressLink == null) {
			if (other.pedTillstoreAddressLink != null)
				return false;
		} else if (!pedTillstoreAddressLink.equals(other.pedTillstoreAddressLink))
			return false;
		if (pedTillstoreName == null) {
			if (other.pedTillstoreName != null)
				return false;
		} else if (!pedTillstoreName.equals(other.pedTillstoreName))
			return false;
		return true;
	}
	
	
	
	
}
