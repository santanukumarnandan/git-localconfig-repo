package com.example.salesvolume;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.lang.Boolean;


public class PitStopPackSLAStatus {
	

	private String isNotBreached;
	private String isBreached;
	private String isWithinToleranceLimit;
	
	public PitStopPackSLAStatus(String isNotBreached, String isBreached, String isWithinToleranceLimit) {
		super();
		this.isNotBreached = isNotBreached;
		this.isBreached = isBreached;
		this.isWithinToleranceLimit = isWithinToleranceLimit;
	}
	
	public PitStopPackSLAStatus() {
		super();
	}
	

	
	public String isNotBreached() {
		return isNotBreached;
	}
	public void setNotBreached(String isNotBreached) {
		this.isNotBreached = isNotBreached;
	}
	public String isBreached() {
		return isBreached;
	}
	public void setBreached(String isBreached) {
		this.isBreached = isBreached;
	}
	public String isWithinToleranceLimit() {
		return isWithinToleranceLimit;
	}
	public void setWithinToleranceLimit(String isWithinToleranceLimit) {
		this.isWithinToleranceLimit = isWithinToleranceLimit;
	}
	
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isBreached == null) ? 0 : isBreached.hashCode());
		result = prime * result + ((isNotBreached == null) ? 0 : isNotBreached.hashCode());
		result = prime * result + ((isWithinToleranceLimit == null) ? 0 : isWithinToleranceLimit.hashCode());
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
		PitStopPackSLAStatus other = (PitStopPackSLAStatus) obj;
		if (isBreached == null) {
			if (other.isBreached != null)
				return false;
		} else if (!isBreached.equals(other.isBreached))
			return false;
		if (isNotBreached == null) {
			if (other.isNotBreached != null)
				return false;
		} else if (!isNotBreached.equals(other.isNotBreached))
			return false;
		if (isWithinToleranceLimit == null) {
			if (other.isWithinToleranceLimit != null)
				return false;
		} else if (!isWithinToleranceLimit.equals(other.isWithinToleranceLimit))
			return false;
		return true;
	}
	//	public PitStopPackSLAStatus(Boolean isNotBreached, Boolean isBreached, Boolean isWithinToleranceLimit) {
//		super();
//		this.isNotBreached = isNotBreached;
//		this.isBreached = isBreached;
//		this.isWithinToleranceLimit = isWithinToleranceLimit;
//	}
//	
//	
	
}
