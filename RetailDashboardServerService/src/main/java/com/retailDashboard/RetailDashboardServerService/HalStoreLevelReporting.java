package com.retailDashboard.RetailDashboardServerService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HAL_RD_STORE_LEVEL_REPORTING")
public class HalStoreLevelReporting {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Record_Number")
	private Long recordNumber;

	@Column(name = "Store_Number")
	private Long storeNumber;

	@Column(name = "Number_Fixed_Till_Down")
	private Long numberOfFixedTillDown;

	@Column(name = "Number_Tablet_Down")
	private Long numberOfTabletDown;

	@Column(name = "Number_WIFI_Down")
	private Long numberOfWifiDown;

	@Column(name = "Number_PED_Down")
	private Long numberOfPedDown;

	@Column(name = "Number_Phone_Down")
	private Long numberOfPhoneDown;

	@Column(name = "Number_Printer_Down")
	private Long numberOfPrinterDown;

	@Column(name = "Number_HHT_Down")
	private Long numberOfHhtDown;

	@Column(name = "Is_All_Fixed_Till_Down")
	private String isAllFixedTillDown;

	@Column(name = "Is_All_Tablet_Down")
	private String isAllTabletDown;

	@Column(name = "Is_All_WIFI_Down")
	private String isAllWifiDown;

	@Column(name = "Is_All_PED_Down")
	private String isAllPedDown;

	@Column(name = "Is_All_Phone_Down")
	private String isAllPhoneDown;

	@Column(name = "Is_All_Printer_Down")
	private String isAllPrinterDown;

	@Column(name = "Is_All_HHT_Down")
	private String isAllHhtDown;

	public HalStoreLevelReporting() {
		super();
	}

	public HalStoreLevelReporting(Long recordNumber, Long storeNumber, Long numberOfFixedTillDown,
			Long numberOfTabletDown, Long numberOfWifiDown, Long numberOfPedDown, Long numberOfPhoneDown,
			Long numberOfPrinterDown, Long numberOfHhtDown, String isAllFixedTillDown, String isAllTabletDown,
			String isAllWifiDown, String isAllPedDown, String isAllPhoneDown, String isAllPrinterDown,
			String isAllHhtDown) {
		super();
		this.recordNumber = recordNumber;
		this.storeNumber = storeNumber;
		this.numberOfFixedTillDown = numberOfFixedTillDown;
		this.numberOfTabletDown = numberOfTabletDown;
		this.numberOfWifiDown = numberOfWifiDown;
		this.numberOfPedDown = numberOfPedDown;
		this.numberOfPhoneDown = numberOfPhoneDown;
		this.numberOfPrinterDown = numberOfPrinterDown;
		this.numberOfHhtDown = numberOfHhtDown;
		this.isAllFixedTillDown = isAllFixedTillDown;
		this.isAllTabletDown = isAllTabletDown;
		this.isAllWifiDown = isAllWifiDown;
		this.isAllPedDown = isAllPedDown;
		this.isAllPhoneDown = isAllPhoneDown;
		this.isAllPrinterDown = isAllPrinterDown;
		this.isAllHhtDown = isAllHhtDown;
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

	public Long getNumberOfFixedTillDown() {
		return numberOfFixedTillDown;
	}

	public void setNumberOfFixedTillDown(Long numberOfFixedTillDown) {
		this.numberOfFixedTillDown = numberOfFixedTillDown;
	}

	public Long getNumberOfTabletDown() {
		return numberOfTabletDown;
	}

	public void setNumberOfTabletDown(Long numberOfTabletDown) {
		this.numberOfTabletDown = numberOfTabletDown;
	}

	public Long getNumberOfWifiDown() {
		return numberOfWifiDown;
	}

	public void setNumberOfWifiDown(Long numberOfWifiDown) {
		this.numberOfWifiDown = numberOfWifiDown;
	}

	public Long getNumberOfPedDown() {
		return numberOfPedDown;
	}

	public void setNumberOfPedDown(Long numberOfPedDown) {
		this.numberOfPedDown = numberOfPedDown;
	}

	public Long getNumberOfPhoneDown() {
		return numberOfPhoneDown;
	}

	public void setNumberOfPhoneDown(Long numberOfPhoneDown) {
		this.numberOfPhoneDown = numberOfPhoneDown;
	}

	public Long getNumberOfPrinterDown() {
		return numberOfPrinterDown;
	}

	public void setNumberOfPrinterDown(Long numberOfPrinterDown) {
		this.numberOfPrinterDown = numberOfPrinterDown;
	}

	public Long getNumberOfHhtDown() {
		return numberOfHhtDown;
	}

	public void setNumberOfHhtDown(Long numberOfHhtDown) {
		this.numberOfHhtDown = numberOfHhtDown;
	}

	public String getIsAllFixedTillDown() {
		return isAllFixedTillDown;
	}

	public void setIsAllFixedTillDown(String isAllFixedTillDown) {
		this.isAllFixedTillDown = isAllFixedTillDown;
	}

	public String getIsAllTabletDown() {
		return isAllTabletDown;
	}

	public void setIsAllTabletDown(String isAllTabletDown) {
		this.isAllTabletDown = isAllTabletDown;
	}

	public String getIsAllWifiDown() {
		return isAllWifiDown;
	}

	public void setIsAllWifiDown(String isAllWifiDown) {
		this.isAllWifiDown = isAllWifiDown;
	}

	public String getIsAllPedDown() {
		return isAllPedDown;
	}

	public void setIsAllPedDown(String isAllPedDown) {
		this.isAllPedDown = isAllPedDown;
	}

	public String getIsAllPhoneDown() {
		return isAllPhoneDown;
	}

	public void setIsAllPhoneDown(String isAllPhoneDown) {
		this.isAllPhoneDown = isAllPhoneDown;
	}

	public String getIsAllPrinterDown() {
		return isAllPrinterDown;
	}

	public void setIsAllPrinterDown(String isAllPrinterDown) {
		this.isAllPrinterDown = isAllPrinterDown;
	}

	public String getIsAllHhtDown() {
		return isAllHhtDown;
	}

	public void setIsAllHhtDown(String isAllHhtDown) {
		this.isAllHhtDown = isAllHhtDown;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isAllFixedTillDown == null) ? 0 : isAllFixedTillDown.hashCode());
		result = prime * result + ((isAllHhtDown == null) ? 0 : isAllHhtDown.hashCode());
		result = prime * result + ((isAllPedDown == null) ? 0 : isAllPedDown.hashCode());
		result = prime * result + ((isAllPhoneDown == null) ? 0 : isAllPhoneDown.hashCode());
		result = prime * result + ((isAllPrinterDown == null) ? 0 : isAllPrinterDown.hashCode());
		result = prime * result + ((isAllTabletDown == null) ? 0 : isAllTabletDown.hashCode());
		result = prime * result + ((isAllWifiDown == null) ? 0 : isAllWifiDown.hashCode());
		result = prime * result + ((numberOfFixedTillDown == null) ? 0 : numberOfFixedTillDown.hashCode());
		result = prime * result + ((numberOfHhtDown == null) ? 0 : numberOfHhtDown.hashCode());
		result = prime * result + ((numberOfPedDown == null) ? 0 : numberOfPedDown.hashCode());
		result = prime * result + ((numberOfPhoneDown == null) ? 0 : numberOfPhoneDown.hashCode());
		result = prime * result + ((numberOfPrinterDown == null) ? 0 : numberOfPrinterDown.hashCode());
		result = prime * result + ((numberOfTabletDown == null) ? 0 : numberOfTabletDown.hashCode());
		result = prime * result + ((numberOfWifiDown == null) ? 0 : numberOfWifiDown.hashCode());
		result = prime * result + ((recordNumber == null) ? 0 : recordNumber.hashCode());
		result = prime * result + ((storeNumber == null) ? 0 : storeNumber.hashCode());
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
		HalStoreLevelReporting other = (HalStoreLevelReporting) obj;
		if (isAllFixedTillDown == null) {
			if (other.isAllFixedTillDown != null)
				return false;
		} else if (!isAllFixedTillDown.equals(other.isAllFixedTillDown))
			return false;
		if (isAllHhtDown == null) {
			if (other.isAllHhtDown != null)
				return false;
		} else if (!isAllHhtDown.equals(other.isAllHhtDown))
			return false;
		if (isAllPedDown == null) {
			if (other.isAllPedDown != null)
				return false;
		} else if (!isAllPedDown.equals(other.isAllPedDown))
			return false;
		if (isAllPhoneDown == null) {
			if (other.isAllPhoneDown != null)
				return false;
		} else if (!isAllPhoneDown.equals(other.isAllPhoneDown))
			return false;
		if (isAllPrinterDown == null) {
			if (other.isAllPrinterDown != null)
				return false;
		} else if (!isAllPrinterDown.equals(other.isAllPrinterDown))
			return false;
		if (isAllTabletDown == null) {
			if (other.isAllTabletDown != null)
				return false;
		} else if (!isAllTabletDown.equals(other.isAllTabletDown))
			return false;
		if (isAllWifiDown == null) {
			if (other.isAllWifiDown != null)
				return false;
		} else if (!isAllWifiDown.equals(other.isAllWifiDown))
			return false;
		if (numberOfFixedTillDown == null) {
			if (other.numberOfFixedTillDown != null)
				return false;
		} else if (!numberOfFixedTillDown.equals(other.numberOfFixedTillDown))
			return false;
		if (numberOfHhtDown == null) {
			if (other.numberOfHhtDown != null)
				return false;
		} else if (!numberOfHhtDown.equals(other.numberOfHhtDown))
			return false;
		if (numberOfPedDown == null) {
			if (other.numberOfPedDown != null)
				return false;
		} else if (!numberOfPedDown.equals(other.numberOfPedDown))
			return false;
		if (numberOfPhoneDown == null) {
			if (other.numberOfPhoneDown != null)
				return false;
		} else if (!numberOfPhoneDown.equals(other.numberOfPhoneDown))
			return false;
		if (numberOfPrinterDown == null) {
			if (other.numberOfPrinterDown != null)
				return false;
		} else if (!numberOfPrinterDown.equals(other.numberOfPrinterDown))
			return false;
		if (numberOfTabletDown == null) {
			if (other.numberOfTabletDown != null)
				return false;
		} else if (!numberOfTabletDown.equals(other.numberOfTabletDown))
			return false;
		if (numberOfWifiDown == null) {
			if (other.numberOfWifiDown != null)
				return false;
		} else if (!numberOfWifiDown.equals(other.numberOfWifiDown))
			return false;
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
		return true;
	}

}
