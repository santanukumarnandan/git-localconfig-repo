package com.example.demo;

public class HallfordsTillStatusAttributes {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((storeAddressLink == null) ? 0 : storeAddressLink.hashCode());
		result = prime * result + ((storeName == null) ? 0 : storeName.hashCode());
		result = prime * result + ((tillIpAddress == null) ? 0 : tillIpAddress.hashCode());
		result = prime * result + ((tillNumber == null) ? 0 : tillNumber.hashCode());
		result = prime * result + ((tillStatus == null) ? 0 : tillStatus.hashCode());
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
		HallfordsTillStatusAttributes other = (HallfordsTillStatusAttributes) obj;
		if (storeAddressLink == null) {
			if (other.storeAddressLink != null)
				return false;
		} else if (!storeAddressLink.equals(other.storeAddressLink))
			return false;
		if (storeName == null) {
			if (other.storeName != null)
				return false;
		} else if (!storeName.equals(other.storeName))
			return false;
		if (tillIpAddress == null) {
			if (other.tillIpAddress != null)
				return false;
		} else if (!tillIpAddress.equals(other.tillIpAddress))
			return false;
		if (tillNumber == null) {
			if (other.tillNumber != null)
				return false;
		} else if (!tillNumber.equals(other.tillNumber))
			return false;
		if (tillStatus == null) {
			if (other.tillStatus != null)
				return false;
		} else if (!tillStatus.equals(other.tillStatus))
			return false;
		return true;
	}
	private String tillIpAddress;
	private String tillStatus;
	private String storeAddressLink;
	private String storeName;
	private String tillNumber;
	
	
	
	
	public HallfordsTillStatusAttributes(String storeName, String tillNumber,String tillIpAddress, String tillStatus, String storeAddressLink) {
		super();
		this.storeName = storeName;
		this.tillNumber = tillNumber;
		this.tillIpAddress = tillIpAddress;
		this.tillStatus = tillStatus;
		this.storeAddressLink = storeAddressLink;

	}
	public String getTillIpAddress() {
		return tillIpAddress;
	}
	public void setTillIpAddress(String tillIpAddress) {
		this.tillIpAddress = tillIpAddress;
	}
	public String getTillStatus() {
		return tillStatus;
	}
	public void setTillStatus(String tillStatus) {
		this.tillStatus = tillStatus;
	}
	public String getStoreAddressLink() {
		return storeAddressLink;
	}
	public void setStoreAddressLink(String storeAddressLink) {
		this.storeAddressLink = storeAddressLink;
	}
	
	
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getTillNumber() {
		return tillNumber;
	}
	public void setTillNumber(String tillNumber) {
		this.tillNumber = tillNumber;
	}
	
	
	
}

