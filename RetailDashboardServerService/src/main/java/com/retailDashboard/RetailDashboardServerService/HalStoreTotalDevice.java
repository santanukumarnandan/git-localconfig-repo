package com.retailDashboard.RetailDashboardServerService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HAL_RD_STORE_TOTAL_DEVICE")
public class HalStoreTotalDevice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Record_Number")
	private Long recordNumber;

	@Column(name = "Store_Number")
	private Long storeNumber;

	@Column(name = "Total_Fixed_Till")
	private Long totalFixedTill;

	@Column(name = "Total_Table")
	private Long totalTablet;

	@Column(name = "Total_WIFI")
	private Long totalWifi;

	@Column(name = "Total_Printer")
	private Long totalPrinter;

	@Column(name = "Total_Phone")
	private Long totalPhone;

	@Column(name = "Total_PED")
	private Long totalPed;

	@Column(name = "Total_HHT")
	private Long totalHht;

	public HalStoreTotalDevice() {
		super();
	}

	public HalStoreTotalDevice(Long recordNumber, Long storeNumber, Long totalFixedTill, Long totalTablet,
			Long totalWifi, Long totalPrinter, Long totalPhone, Long totalPed, Long totalHht) {
		super();
		this.recordNumber = recordNumber;
		this.storeNumber = storeNumber;
		this.totalFixedTill = totalFixedTill;
		this.totalTablet = totalTablet;
		this.totalWifi = totalWifi;
		this.totalPrinter = totalPrinter;
		this.totalPhone = totalPhone;
		this.totalPed = totalPed;
		this.totalHht = totalHht;
	}

	public Long getRecordNumber() {
		return recordNumber;
	}

	public void setRecordNumber(Long recordNumber) {
		this.recordNumber = recordNumber;
	}

	public Long getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(Long storeNumber) {
		this.storeNumber = storeNumber;
	}

	public Long getTotalFixedTill() {
		return totalFixedTill;
	}

	public void setTotalFixedTill(Long totalFixedTill) {
		this.totalFixedTill = totalFixedTill;
	}

	public Long getTotalTablet() {
		return totalTablet;
	}

	public void setTotalTablet(Long totalTablet) {
		this.totalTablet = totalTablet;
	}

	public Long getTotalWifi() {
		return totalWifi;
	}

	public void setTotalWifi(Long totalWifi) {
		this.totalWifi = totalWifi;
	}

	public Long getTotalPrinter() {
		return totalPrinter;
	}

	public void setTotalPrinter(Long totalPrinter) {
		this.totalPrinter = totalPrinter;
	}

	public Long getTotalPhone() {
		return totalPhone;
	}

	public void setTotalPhone(Long totalPhone) {
		this.totalPhone = totalPhone;
	}

	public Long getTotalPed() {
		return totalPed;
	}

	public void setTotalPed(Long totalPed) {
		this.totalPed = totalPed;
	}

	public Long getTotalHht() {
		return totalHht;
	}

	public void setTotalHht(Long totalHht) {
		this.totalHht = totalHht;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((recordNumber == null) ? 0 : recordNumber.hashCode());
		result = prime * result + ((storeNumber == null) ? 0 : storeNumber.hashCode());
		result = prime * result + ((totalFixedTill == null) ? 0 : totalFixedTill.hashCode());
		result = prime * result + ((totalHht == null) ? 0 : totalHht.hashCode());
		result = prime * result + ((totalPed == null) ? 0 : totalPed.hashCode());
		result = prime * result + ((totalPhone == null) ? 0 : totalPhone.hashCode());
		result = prime * result + ((totalPrinter == null) ? 0 : totalPrinter.hashCode());
		result = prime * result + ((totalTablet == null) ? 0 : totalTablet.hashCode());
		result = prime * result + ((totalWifi == null) ? 0 : totalWifi.hashCode());
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
		HalStoreTotalDevice other = (HalStoreTotalDevice) obj;
		if (recordNumber == null) {
			if (other.recordNumber != null)
				return false;
		} else if (!recordNumber.equals(other.recordNumber))
			return false;
		if (storeNumber == null) {
			if (other.storeNumber != null)
				return false;
		} else if (!storeNumber.equals(other.storeNumber))
			return false;
		if (totalFixedTill == null) {
			if (other.totalFixedTill != null)
				return false;
		} else if (!totalFixedTill.equals(other.totalFixedTill))
			return false;
		if (totalHht == null) {
			if (other.totalHht != null)
				return false;
		} else if (!totalHht.equals(other.totalHht))
			return false;
		if (totalPed == null) {
			if (other.totalPed != null)
				return false;
		} else if (!totalPed.equals(other.totalPed))
			return false;
		if (totalPhone == null) {
			if (other.totalPhone != null)
				return false;
		} else if (!totalPhone.equals(other.totalPhone))
			return false;
		if (totalPrinter == null) {
			if (other.totalPrinter != null)
				return false;
		} else if (!totalPrinter.equals(other.totalPrinter))
			return false;
		if (totalTablet == null) {
			if (other.totalTablet != null)
				return false;
		} else if (!totalTablet.equals(other.totalTablet))
			return false;
		if (totalWifi == null) {
			if (other.totalWifi != null)
				return false;
		} else if (!totalWifi.equals(other.totalWifi))
			return false;
		return true;
	}

}
