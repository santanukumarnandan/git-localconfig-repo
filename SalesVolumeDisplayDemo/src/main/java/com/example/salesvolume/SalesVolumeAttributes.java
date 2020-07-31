package com.example.salesvolume;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class SalesVolumeAttributes {
	
	public List<String> emailContents;
	
	public SalesVolumeAttributes(List<String> emailContents) {
		super();
		this.emailContents = emailContents;
	}


	public List<String> getEmailContents() {
		return emailContents;
	}

	public void setEmailContents(List<String> emailContents) {
		this.emailContents = emailContents;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailContents == null) ? 0 : emailContents.hashCode());
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
		SalesVolumeAttributes other = (SalesVolumeAttributes) obj;
		if (emailContents == null) {
			if (other.emailContents != null)
				return false;
		} else if (!emailContents.equals(other.emailContents))
			return false;
		return true;
	}


	
	}
	
	


