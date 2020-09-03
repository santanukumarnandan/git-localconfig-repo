package com.retailDashboard.RetailDashboardServerService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "HAL_RD_PED_POLLING_DATA")
public class HalPedPollData {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Record_Number")
	private Long recordNumber;

	@Column(name = "Store_Number")
	private String stroreNumber;

	@Column(name = "Store_IP_Address")
	private String storeIpAddress;

	@Column(name = "Polling_Date")
	private String pollingDate;

	@Column(name = "Polling_Time")
	private String pollingTime;

	@Column(name = "Polliing_Number")
	private String pollingNumber;

	@Column(name = "Date_Up")
	private String dateUp;

	@Column(name = "Time_Up")
	private String timeUp;

	@Column(name = "Down_Since")
	private String downSince;

	
	
	public HalPedPollData() {
		super();
	}



	public HalPedPollData(Long recordNumber, String stroreNumber, String storeIpAddress, String pollingDate,
			String pollingTime, String pollingNumber, String dateUp, String timeUp, String downSince) {
		super();
		this.recordNumber = recordNumber;
		this.stroreNumber = stroreNumber;
		this.storeIpAddress = storeIpAddress;
		this.pollingDate = pollingDate;
		this.pollingTime = pollingTime;
		this.pollingNumber = pollingNumber;
		this.dateUp = dateUp;
		this.timeUp = timeUp;
		this.downSince = downSince;
	}



	public Long getRecordNumber() {
		return recordNumber;
	}



	public void setRecordNumber(Long recordNumber) {
		this.recordNumber = recordNumber;
	}



	public String getStroreNumber() {
		return stroreNumber;
	}



	public void setStroreNumber(String stroreNumber) {
		this.stroreNumber = stroreNumber;
	}



	public String getStoreIpAddress() {
		return storeIpAddress;
	}



	public void setStoreIpAddress(String storeIpAddress) {
		this.storeIpAddress = storeIpAddress;
	}



	public String getPollingDate() {
		return pollingDate;
	}



	public void setPollingDate(String pollingDate) {
		this.pollingDate = pollingDate;
	}



	public String getPollingTime() {
		return pollingTime;
	}



	public void setPollingTime(String pollingTime) {
		this.pollingTime = pollingTime;
	}



	public String getPollingNumber() {
		return pollingNumber;
	}



	public void setPollingNumber(String pollingNumber) {
		this.pollingNumber = pollingNumber;
	}



	public String getDateUp() {
		return dateUp;
	}



	public void setDateUp(String dateUp) {
		this.dateUp = dateUp;
	}



	public String getTimeUp() {
		return timeUp;
	}



	public void setTimeUp(String timeUp) {
		this.timeUp = timeUp;
	}



	public String getDownSince() {
		return downSince;
	}



	public void setDownSince(String downSince) {
		this.downSince = downSince;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateUp == null) ? 0 : dateUp.hashCode());
		result = prime * result + ((downSince == null) ? 0 : downSince.hashCode());
		result = prime * result + ((pollingDate == null) ? 0 : pollingDate.hashCode());
		result = prime * result + ((pollingNumber == null) ? 0 : pollingNumber.hashCode());
		result = prime * result + ((pollingTime == null) ? 0 : pollingTime.hashCode());
		result = prime * result + ((recordNumber == null) ? 0 : recordNumber.hashCode());
		result = prime * result + ((storeIpAddress == null) ? 0 : storeIpAddress.hashCode());
		result = prime * result + ((stroreNumber == null) ? 0 : stroreNumber.hashCode());
		result = prime * result + ((timeUp == null) ? 0 : timeUp.hashCode());
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
		HalPedPollData other = (HalPedPollData) obj;
		if (dateUp == null) {
			if (other.dateUp != null)
				return false;
		} else if (!dateUp.equals(other.dateUp))
			return false;
		if (downSince == null) {
			if (other.downSince != null)
				return false;
		} else if (!downSince.equals(other.downSince))
			return false;
		if (pollingDate == null) {
			if (other.pollingDate != null)
				return false;
		} else if (!pollingDate.equals(other.pollingDate))
			return false;
		if (pollingNumber == null) {
			if (other.pollingNumber != null)
				return false;
		} else if (!pollingNumber.equals(other.pollingNumber))
			return false;
		if (pollingTime == null) {
			if (other.pollingTime != null)
				return false;
		} else if (!pollingTime.equals(other.pollingTime))
			return false;
		if (recordNumber == null) {
			if (other.recordNumber != null)
				return false;
		} else if (!recordNumber.equals(other.recordNumber))
			return false;
		if (storeIpAddress == null) {
			if (other.storeIpAddress != null)
				return false;
		} else if (!storeIpAddress.equals(other.storeIpAddress))
			return false;
		if (stroreNumber == null) {
			if (other.stroreNumber != null)
				return false;
		} else if (!stroreNumber.equals(other.stroreNumber))
			return false;
		if (timeUp == null) {
			if (other.timeUp != null)
				return false;
		} else if (!timeUp.equals(other.timeUp))
			return false;
		return true;
	}
	
	
}
