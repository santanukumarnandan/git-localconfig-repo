package com.retailDashboard.RetailDashboardServerService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hal_rd_store_master")
public class HalStoreMaster {
	
	
	@Id
	 @Column(name="store_number")
	 private Long storeNumber;
	
	 @Column(name="area_number")
	  private String areaNumber;
	 
	 @Column(name="store_name")
	  private String storeName;
	  
	 @Column(name="store_address")
	 private String atoreAssress;
	  
	 @Column(name="post_code") 
	 private String postCode;
	  
	 @Column(name="country") 
	 private String country;
	  
	 @Column(name="store_status") 
	 private String storeStatus;
	  
	  
	 @Column(name="premimum_store")
	 private String premiumStore;
	  
	  
	 @Column(name="ip_range_till")
	 private String ipRangeTill;
	  
	 @Column(name="ip_range_tablet")
	 private String ipRangeTablet;
	  
	 @Column(name="ip_range_ped") 
	 private String ipRangePed;
	  
	 @Column(name="ip_range_wifi") 
	 private String ipRangeWifi;
	  
	 @Column(name="ip_range_hht") 
	 private String ipRangeHht;
	  
	 @Column(name="ip_range_printer")
	 private String ipRangePrinter;
	  
	 @Column(name="ip_range_phone") 
	 private String ipRangePhone;
	  
	 @Column(name="identifier") 
	 private String identifier;
	  
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="record_number") 
	 private Long recordNumber;
	 
	 
	 
	 
	 
	 
	 
	 
	 

	public HalStoreMaster() {
		super();
	}

	public HalStoreMaster(Long storeNumber, String areaNumber, String storeName, String atoreAssress,
			String postCode, String country, String storeStatus, String premiumStore, String ipRangeTill,
			String ipRangeTablet, String ipRangePed, String ipRangeWifi, String ipRangeHht, String ipRangePrinter,
			String ipRangePhone, String identifier, Long recordNumber) {
		super();
		this.storeNumber = storeNumber;
		this.areaNumber = areaNumber;
		this.storeName = storeName;
		this.atoreAssress = atoreAssress;
		this.postCode = postCode;
		this.country = country;
		this.storeStatus = storeStatus;
		this.premiumStore = premiumStore;
		this.ipRangeTill = ipRangeTill;
		this.ipRangeTablet = ipRangeTablet;
		this.ipRangePed = ipRangePed;
		this.ipRangeWifi = ipRangeWifi;
		this.ipRangeHht = ipRangeHht;
		this.ipRangePrinter = ipRangePrinter;
		this.ipRangePhone = ipRangePhone;
		this.identifier = identifier;
		this.recordNumber = recordNumber;
	}

	public Long getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(Long storeNumber) {
		this.storeNumber = storeNumber;
	}

	public String getAreaNumber() {
		return areaNumber;
	}

	public void setAreaNumber(String areaNumber) {
		this.areaNumber = areaNumber;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getAtoreAssress() {
		return atoreAssress;
	}

	public void setAtoreAssress(String atoreAssress) {
		this.atoreAssress = atoreAssress;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStoreStatus() {
		return storeStatus;
	}

	public void setStoreStatus(String storeStatus) {
		this.storeStatus = storeStatus;
	}

	public String getPremiumStore() {
		return premiumStore;
	}

	public void setPremiumStore(String premiumStore) {
		this.premiumStore = premiumStore;
	}

	public String getIpRangeTill() {
		return ipRangeTill;
	}

	public void setIpRangeTill(String ipRangeTill) {
		this.ipRangeTill = ipRangeTill;
	}

	public String getIpRangeTablet() {
		return ipRangeTablet;
	}

	public void setIpRangeTablet(String ipRangeTablet) {
		this.ipRangeTablet = ipRangeTablet;
	}

	public String getIpRangePed() {
		return ipRangePed;
	}

	public void setIpRangePed(String ipRangePed) {
		this.ipRangePed = ipRangePed;
	}

	public String getIpRangeWifi() {
		return ipRangeWifi;
	}

	public void setIpRangeWifi(String ipRangeWifi) {
		this.ipRangeWifi = ipRangeWifi;
	}

	public String getIpRangeHht() {
		return ipRangeHht;
	}

	public void setIpRangeHht(String ipRangeHht) {
		this.ipRangeHht = ipRangeHht;
	}

	public String getIpRangePrinter() {
		return ipRangePrinter;
	}

	public void setIpRangePrinter(String ipRangePrinter) {
		this.ipRangePrinter = ipRangePrinter;
	}

	public String getIpRangePhone() {
		return ipRangePhone;
	}

	public void setIpRangePhone(String ipRangePhone) {
		this.ipRangePhone = ipRangePhone;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public Long getRecordNumber() {
		return recordNumber;
	}

	public void setRecordNumber(Long recordNumber) {
		this.recordNumber = recordNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areaNumber == null) ? 0 : areaNumber.hashCode());
		result = prime * result + ((atoreAssress == null) ? 0 : atoreAssress.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
		result = prime * result + ((ipRangeHht == null) ? 0 : ipRangeHht.hashCode());
		result = prime * result + ((ipRangePed == null) ? 0 : ipRangePed.hashCode());
		result = prime * result + ((ipRangePhone == null) ? 0 : ipRangePhone.hashCode());
		result = prime * result + ((ipRangePrinter == null) ? 0 : ipRangePrinter.hashCode());
		result = prime * result + ((ipRangeTablet == null) ? 0 : ipRangeTablet.hashCode());
		result = prime * result + ((ipRangeTill == null) ? 0 : ipRangeTill.hashCode());
		result = prime * result + ((ipRangeWifi == null) ? 0 : ipRangeWifi.hashCode());
		result = prime * result + ((postCode == null) ? 0 : postCode.hashCode());
		result = prime * result + ((premiumStore == null) ? 0 : premiumStore.hashCode());
		result = prime * result + ((recordNumber == null) ? 0 : recordNumber.hashCode());
		result = prime * result + ((storeName == null) ? 0 : storeName.hashCode());
		result = prime * result + ((storeNumber == null) ? 0 : storeNumber.hashCode());
		result = prime * result + ((storeStatus == null) ? 0 : storeStatus.hashCode());
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
		HalStoreMaster other = (HalStoreMaster) obj;
		if (areaNumber == null) {
			if (other.areaNumber != null)
				return false;
		} else if (!areaNumber.equals(other.areaNumber))
			return false;
		if (atoreAssress == null) {
			if (other.atoreAssress != null)
				return false;
		} else if (!atoreAssress.equals(other.atoreAssress))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (identifier == null) {
			if (other.identifier != null)
				return false;
		} else if (!identifier.equals(other.identifier))
			return false;
		if (ipRangeHht == null) {
			if (other.ipRangeHht != null)
				return false;
		} else if (!ipRangeHht.equals(other.ipRangeHht))
			return false;
		if (ipRangePed == null) {
			if (other.ipRangePed != null)
				return false;
		} else if (!ipRangePed.equals(other.ipRangePed))
			return false;
		if (ipRangePhone == null) {
			if (other.ipRangePhone != null)
				return false;
		} else if (!ipRangePhone.equals(other.ipRangePhone))
			return false;
		if (ipRangePrinter == null) {
			if (other.ipRangePrinter != null)
				return false;
		} else if (!ipRangePrinter.equals(other.ipRangePrinter))
			return false;
		if (ipRangeTablet == null) {
			if (other.ipRangeTablet != null)
				return false;
		} else if (!ipRangeTablet.equals(other.ipRangeTablet))
			return false;
		if (ipRangeTill == null) {
			if (other.ipRangeTill != null)
				return false;
		} else if (!ipRangeTill.equals(other.ipRangeTill))
			return false;
		if (ipRangeWifi == null) {
			if (other.ipRangeWifi != null)
				return false;
		} else if (!ipRangeWifi.equals(other.ipRangeWifi))
			return false;
		if (postCode == null) {
			if (other.postCode != null)
				return false;
		} else if (!postCode.equals(other.postCode))
			return false;
		if (premiumStore == null) {
			if (other.premiumStore != null)
				return false;
		} else if (!premiumStore.equals(other.premiumStore))
			return false;
		if (recordNumber == null) {
			if (other.recordNumber != null)
				return false;
		} else if (!recordNumber.equals(other.recordNumber))
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
		if (storeStatus == null) {
			if (other.storeStatus != null)
				return false;
		} else if (!storeStatus.equals(other.storeStatus))
			return false;
		return true;
	}

	

	 
	 
	 
}
