package com.retailDashboard.RetailDashboardServerService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HAL_RD_ZONE_MASTER")
public class HalZoneMaster {

	
	@Id
	 @Column(name="Zone_Number")
	 private Long zoneNumber;
	
	 @Column(name="Zone_Name")
	private String zoneName;
	
	 @Column(name="Identifier")
	private String identifier;

	
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="Record_Number")
	private Long recordNumber;


	 
	public HalZoneMaster() {
		super();
	}


	public HalZoneMaster(Long zoneNumber, String zoneName, String identifier, Long recordNumber) {
		super();
		this.zoneNumber = zoneNumber;
		this.zoneName = zoneName;
		this.identifier = identifier;
		this.recordNumber = recordNumber;
	}


	public Long getZoneNumber() {
		return zoneNumber;
	}


	public void setZoneNumber(Long zoneNumber) {
		this.zoneNumber = zoneNumber;
	}


	public String getZoneName() {
		return zoneName;
	}


	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
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
		result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
		result = prime * result + ((recordNumber == null) ? 0 : recordNumber.hashCode());
		result = prime * result + ((zoneName == null) ? 0 : zoneName.hashCode());
		result = prime * result + ((zoneNumber == null) ? 0 : zoneNumber.hashCode());
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
		HalZoneMaster other = (HalZoneMaster) obj;
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
		if (zoneName == null) {
			if (other.zoneName != null)
				return false;
		} else if (!zoneName.equals(other.zoneName))
			return false;
		if (zoneNumber == null) {
			if (other.zoneNumber != null)
				return false;
		} else if (!zoneNumber.equals(other.zoneNumber))
			return false;
		return true;
	}
	 
	 
}
