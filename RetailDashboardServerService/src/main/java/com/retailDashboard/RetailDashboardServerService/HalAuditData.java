package com.retailDashboard.RetailDashboardServerService;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HAL_RD_AUDIT")
public class HalAuditData {
	
	@Id
	@Column(name = "Record_Number")
	private Long recordNumber;
	
	@Column(name = "Job/API Name")
	private String jobApiName;
	
	@Column(name = "Start_Date")
	private Date startDate;
	
	@Column(name = "Start_Time")
	private Date startTime;
	
	@Column(name = "End_Date")
	private Date endDate;
	
	@Column(name = "End_Time")
	private Date endTime;

	
	
	public HalAuditData() {
		super();
	}



	public HalAuditData(Long recordNumber, String jobApiName, Date startDate, Date startTime, Date endDate,
			Date endTime) {
		super();
		this.recordNumber = recordNumber;
		this.jobApiName = jobApiName;
		this.startDate = startDate;
		this.startTime = startTime;
		this.endDate = endDate;
		this.endTime = endTime;
	}



	public Long getRecordNumber() {
		return recordNumber;
	}



	public void setRecordNumber(Long recordNumber) {
		this.recordNumber = recordNumber;
	}



	public String getJobApiName() {
		return jobApiName;
	}



	public void setJobApiName(String jobApiName) {
		this.jobApiName = jobApiName;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public Date getStartTime() {
		return startTime;
	}



	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}



	public Date getEndDate() {
		return endDate;
	}



	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}



	public Date getEndTime() {
		return endTime;
	}



	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + ((jobApiName == null) ? 0 : jobApiName.hashCode());
		result = prime * result + ((recordNumber == null) ? 0 : recordNumber.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
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
		HalAuditData other = (HalAuditData) obj;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (jobApiName == null) {
			if (other.jobApiName != null)
				return false;
		} else if (!jobApiName.equals(other.jobApiName))
			return false;
		if (recordNumber == null) {
			if (other.recordNumber != null)
				return false;
		} else if (!recordNumber.equals(other.recordNumber))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		return true;
	}
	

	
	
}
