package com.retailDashboard.RetailDashboardServerService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="HAL_RD_AREA_MASTER")
public class HalAreaMaster {

	
	@Id
	 @Column(name="Zone_Number")
	 private Long zoneNumber;
	
	@Column(name="Area_Number")
	private Long areaNumber;
	
	 @Column(name="Area_Name")
	private String areaName;
	
	 @Column(name="Identifier")
	private String identifier;
	 
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="Record_Number")
	private Long recordNumber;
	 
	 

	public HalAreaMaster() {
		super();
	}



	public HalAreaMaster(Long zoneNumber, Long areaNumber, String areaName, String identifier, Long recordNumber) {
		super();
		this.zoneNumber = zoneNumber;
		this.areaNumber = areaNumber;
		this.areaName = areaName;
		this.identifier = identifier;
		this.recordNumber = recordNumber;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areaName == null) ? 0 : areaName.hashCode());
		result = prime * result + ((areaNumber == null) ? 0 : areaNumber.hashCode());
		result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
		result = prime * result + ((recordNumber == null) ? 0 : recordNumber.hashCode());
		result = prime * result + ((zoneNumber == null) ? 0 : zoneNumber.hashCode());
		return result;
	}



	public Long getZoneNumber() {
		return zoneNumber;
	}



	public void setZoneNumber(Long zoneNumber) {
		this.zoneNumber = zoneNumber;
	}



	public Long getAreaNumber() {
		return areaNumber;
	}



	public void setAreaNumber(Long areaNumber) {
		this.areaNumber = areaNumber;
	}



	public String getAreaName() {
		return areaName;
	}



	public void setAreaName(String areaName) {
		this.areaName = areaName;
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HalAreaMaster other = (HalAreaMaster) obj;
		if (areaName == null) {
			if (other.areaName != null)
				return false;
		} else if (!areaName.equals(other.areaName))
			return false;
		if (areaNumber == null) {
			if (other.areaNumber != null)
				return false;
		} else if (!areaNumber.equals(other.areaNumber))
			return false;
		if (identifier == null) {
			if (other.identifier != null)
				return false;
		} else if (!identifier.equals(other.identifier))
			return false;
		if (recordNumber == null) {
			if (other.recordNumber != null)
				return false;
		} else if (!recordNumber.equals(other.recordNumber))
			return false;
		if (zoneNumber == null) {
			if (other.zoneNumber != null)
				return false;
		} else if (!zoneNumber.equals(other.zoneNumber))
			return false;
		return true;
	}
	 
	 
	 
}
