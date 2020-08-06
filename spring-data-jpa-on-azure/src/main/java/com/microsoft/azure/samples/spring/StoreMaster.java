/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.microsoft.azure.samples.spring;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="store_master")
public class StoreMaster {
 //   @Id
  //  @GeneratedValue(strategy = GenerationType.AUTO)
	 @Id
	 @Column(name="Store_Number")
    private Integer storeNumber;
	 
	 @Column(name="Store_Name")
	 private String storeName;
	 
	 @Column(name="Store_Address")
	 private String storeAddress;
	 
	 @Column(name="Post_Code")
	 private String postCode;
	 
	 @Column(name="Country")
	 private String country;
	 
	 @Column(name="Status")
	 private String status;
	 
	 @Column(name="Premium_Store")
	 private String premiumStore;
	 
	 @Column(name="IP_Range_Till")
	 private String ipRangeTill;
	 
	 @Column(name="IP_Range_Tablet")
	 private String ipRangeTablet;
	 
	 
	 public StoreMaster() {
		 
	 }
	 
	 
	 
	 
	@Override
	public String toString() {
		return "StoreMaster [storeNumber=" + storeNumber + ", storeName=" + storeName + ", storeAddress=" + storeAddress
				+ ", postCode=" + postCode + ", country=" + country + ", status=" + status + ", premiumStore="
				+ premiumStore + ", ipRangeTill=" + ipRangeTill + ", ipRangeTablet=" + ipRangeTablet + "]";
	}




	public StoreMaster(Integer storeNumber, String storeName, String storeAddress, String postCode, String country,
			String status, String premiumStore, String ipRangeTill, String ipRangeTablet) {
		super();
		this.storeNumber = storeNumber;
		this.storeName = storeName;
		this.storeAddress = storeAddress;
		this.postCode = postCode;
		this.country = country;
		this.status = status;
		this.premiumStore = premiumStore;
		this.ipRangeTill = ipRangeTill;
		this.ipRangeTablet = ipRangeTablet;
	}
	public Integer getStoreNumber() {
		return storeNumber;
	}
	public void setStoreNumber(Integer storeNumber) {
		this.storeNumber = storeNumber;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	 
	 

    
}
