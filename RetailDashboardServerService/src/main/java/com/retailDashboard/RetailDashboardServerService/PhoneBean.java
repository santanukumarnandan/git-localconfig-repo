package com.retailDashboard.RetailDashboardServerService;

public class PhoneBean {

	private String phoneIpAddress;
	private Long phoneStoreNumber;
	private String phonePollingDate;
	private String phonestoreAddressLink;
	private String phonestoreName;
	private String phonePollingTime;
	//Sequence generated
	private Long phonePollingNumber;
	private String phonelDateUp;
	private String phoneTimeUp;
	private String phoneDownSince;
	
	
	
	
	public PhoneBean() {
		super();
	}




	public PhoneBean(String phoneIpAddress, Long phoneStoreNumber, String phonePollingDate,
			String phonestoreAddressLink, String phonestoreName, String phonePollingTime, Long phonePollingNumber,
			String phonelDateUp, String phoneTimeUp, String phoneDownSince) {
		super();
		this.phoneIpAddress = phoneIpAddress;
		this.phoneStoreNumber = phoneStoreNumber;
		this.phonePollingDate = phonePollingDate;
		this.phonestoreAddressLink = phonestoreAddressLink;
		this.phonestoreName = phonestoreName;
		this.phonePollingTime = phonePollingTime;
		this.phonePollingNumber = phonePollingNumber;
		this.phonelDateUp = phonelDateUp;
		this.phoneTimeUp = phoneTimeUp;
		this.phoneDownSince = phoneDownSince;
	}




	public String getPhoneIpAddress() {
		return phoneIpAddress;
	}




	public void setPhoneIpAddress(String phoneIpAddress) {
		this.phoneIpAddress = phoneIpAddress;
	}




	public Long getPhoneStoreNumber() {
		return phoneStoreNumber;
	}




	public void setPhoneStoreNumber(Long phoneStoreNumber) {
		this.phoneStoreNumber = phoneStoreNumber;
	}




	public String getPhonePollingDate() {
		return phonePollingDate;
	}




	public void setPhonePollingDate(String phonePollingDate) {
		this.phonePollingDate = phonePollingDate;
	}




	public String getPhonestoreAddressLink() {
		return phonestoreAddressLink;
	}




	public void setPhonestoreAddressLink(String phonestoreAddressLink) {
		this.phonestoreAddressLink = phonestoreAddressLink;
	}




	public String getPhonestoreName() {
		return phonestoreName;
	}




	public void setPhonestoreName(String phonestoreName) {
		this.phonestoreName = phonestoreName;
	}




	public String getPhonePollingTime() {
		return phonePollingTime;
	}




	public void setPhonePollingTime(String phonePollingTime) {
		this.phonePollingTime = phonePollingTime;
	}




	public Long getPhonePollingNumber() {
		return phonePollingNumber;
	}




	public void setPhonePollingNumber(Long phonePollingNumber) {
		this.phonePollingNumber = phonePollingNumber;
	}




	public String getPhonelDateUp() {
		return phonelDateUp;
	}




	public void setPhonelDateUp(String phonelDateUp) {
		this.phonelDateUp = phonelDateUp;
	}




	public String getPhoneTimeUp() {
		return phoneTimeUp;
	}




	public void setPhoneTimeUp(String phoneTimeUp) {
		this.phoneTimeUp = phoneTimeUp;
	}




	public String getPhoneDownSince() {
		return phoneDownSince;
	}




	public void setPhoneDownSince(String phoneDownSince) {
		this.phoneDownSince = phoneDownSince;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((phoneDownSince == null) ? 0 : phoneDownSince.hashCode());
		result = prime * result + ((phoneIpAddress == null) ? 0 : phoneIpAddress.hashCode());
		result = prime * result + ((phonePollingDate == null) ? 0 : phonePollingDate.hashCode());
		result = prime * result + ((phonePollingNumber == null) ? 0 : phonePollingNumber.hashCode());
		result = prime * result + ((phonePollingTime == null) ? 0 : phonePollingTime.hashCode());
		result = prime * result + ((phoneStoreNumber == null) ? 0 : phoneStoreNumber.hashCode());
		result = prime * result + ((phoneTimeUp == null) ? 0 : phoneTimeUp.hashCode());
		result = prime * result + ((phonelDateUp == null) ? 0 : phonelDateUp.hashCode());
		result = prime * result + ((phonestoreAddressLink == null) ? 0 : phonestoreAddressLink.hashCode());
		result = prime * result + ((phonestoreName == null) ? 0 : phonestoreName.hashCode());
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
		PhoneBean other = (PhoneBean) obj;
		if (phoneDownSince == null) {
			if (other.phoneDownSince != null)
				return false;
		} else if (!phoneDownSince.equals(other.phoneDownSince))
			return false;
		if (phoneIpAddress == null) {
			if (other.phoneIpAddress != null)
				return false;
		} else if (!phoneIpAddress.equals(other.phoneIpAddress))
			return false;
		if (phonePollingDate == null) {
			if (other.phonePollingDate != null)
				return false;
		} else if (!phonePollingDate.equals(other.phonePollingDate))
			return false;
		if (phonePollingNumber == null) {
			if (other.phonePollingNumber != null)
				return false;
		} else if (!phonePollingNumber.equals(other.phonePollingNumber))
			return false;
		if (phonePollingTime == null) {
			if (other.phonePollingTime != null)
				return false;
		} else if (!phonePollingTime.equals(other.phonePollingTime))
			return false;
		if (phoneStoreNumber == null) {
			if (other.phoneStoreNumber != null)
				return false;
		} else if (!phoneStoreNumber.equals(other.phoneStoreNumber))
			return false;
		if (phoneTimeUp == null) {
			if (other.phoneTimeUp != null)
				return false;
		} else if (!phoneTimeUp.equals(other.phoneTimeUp))
			return false;
		if (phonelDateUp == null) {
			if (other.phonelDateUp != null)
				return false;
		} else if (!phonelDateUp.equals(other.phonelDateUp))
			return false;
		if (phonestoreAddressLink == null) {
			if (other.phonestoreAddressLink != null)
				return false;
		} else if (!phonestoreAddressLink.equals(other.phonestoreAddressLink))
			return false;
		if (phonestoreName == null) {
			if (other.phonestoreName != null)
				return false;
		} else if (!phonestoreName.equals(other.phonestoreName))
			return false;
		return true;
	}
	
	
	
	
	
}
