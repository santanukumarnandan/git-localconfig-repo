package com.retailDashboard.RetailDashboardServerService;

public class PrinterBean {


	private String printerIpAddress;
	private String printerStoreNumber;
	private String printerPollingDate;
	private String printerstoreAddressLink;
	private String printerstoreName;
	private String printerPollingTime;
	private String printerPollingNumber;
	private String printerlDateUp;
	private String printerTimeUp;
	private String printerDownSince;
	
	
	
	
	public PrinterBean() {
		super();
	}




	public PrinterBean(String printerIpAddress, String printerStoreNumber, String printerPollingDate,
			String printerstoreAddressLink, String printerstoreName, String printerPollingTime,
			String printerPollingNumber, String printerlDateUp, String printerTimeUp, String printerDownSince) {
		super();
		this.printerIpAddress = printerIpAddress;
		this.printerStoreNumber = printerStoreNumber;
		this.printerPollingDate = printerPollingDate;
		this.printerstoreAddressLink = printerstoreAddressLink;
		this.printerstoreName = printerstoreName;
		this.printerPollingTime = printerPollingTime;
		this.printerPollingNumber = printerPollingNumber;
		this.printerlDateUp = printerlDateUp;
		this.printerTimeUp = printerTimeUp;
		this.printerDownSince = printerDownSince;
	}




	public String getPrinterIpAddress() {
		return printerIpAddress;
	}




	public void setPrinterIpAddress(String printerIpAddress) {
		this.printerIpAddress = printerIpAddress;
	}




	public String getPrinterStoreNumber() {
		return printerStoreNumber;
	}




	public void setPrinterStoreNumber(String printerStoreNumber) {
		this.printerStoreNumber = printerStoreNumber;
	}




	public String getPrinterPollingDate() {
		return printerPollingDate;
	}




	public void setPrinterPollingDate(String printerPollingDate) {
		this.printerPollingDate = printerPollingDate;
	}




	public String getPrinterstoreAddressLink() {
		return printerstoreAddressLink;
	}




	public void setPrinterstoreAddressLink(String printerstoreAddressLink) {
		this.printerstoreAddressLink = printerstoreAddressLink;
	}




	public String getPrinterstoreName() {
		return printerstoreName;
	}




	public void setPrinterstoreName(String printerstoreName) {
		this.printerstoreName = printerstoreName;
	}




	public String getPrinterPollingTime() {
		return printerPollingTime;
	}




	public void setPrinterPollingTime(String printerPollingTime) {
		this.printerPollingTime = printerPollingTime;
	}




	public String getPrinterPollingNumber() {
		return printerPollingNumber;
	}




	public void setPrinterPollingNumber(String printerPollingNumber) {
		this.printerPollingNumber = printerPollingNumber;
	}




	public String getPrinterlDateUp() {
		return printerlDateUp;
	}




	public void setPrinterlDateUp(String printerlDateUp) {
		this.printerlDateUp = printerlDateUp;
	}




	public String getPrinterTimeUp() {
		return printerTimeUp;
	}




	public void setPrinterTimeUp(String printerTimeUp) {
		this.printerTimeUp = printerTimeUp;
	}




	public String getPrinterDownSince() {
		return printerDownSince;
	}




	public void setPrinterDownSince(String printerDownSince) {
		this.printerDownSince = printerDownSince;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((printerDownSince == null) ? 0 : printerDownSince.hashCode());
		result = prime * result + ((printerIpAddress == null) ? 0 : printerIpAddress.hashCode());
		result = prime * result + ((printerPollingDate == null) ? 0 : printerPollingDate.hashCode());
		result = prime * result + ((printerPollingNumber == null) ? 0 : printerPollingNumber.hashCode());
		result = prime * result + ((printerPollingTime == null) ? 0 : printerPollingTime.hashCode());
		result = prime * result + ((printerStoreNumber == null) ? 0 : printerStoreNumber.hashCode());
		result = prime * result + ((printerTimeUp == null) ? 0 : printerTimeUp.hashCode());
		result = prime * result + ((printerlDateUp == null) ? 0 : printerlDateUp.hashCode());
		result = prime * result + ((printerstoreAddressLink == null) ? 0 : printerstoreAddressLink.hashCode());
		result = prime * result + ((printerstoreName == null) ? 0 : printerstoreName.hashCode());
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
		PrinterBean other = (PrinterBean) obj;
		if (printerDownSince == null) {
			if (other.printerDownSince != null)
				return false;
		} else if (!printerDownSince.equals(other.printerDownSince))
			return false;
		if (printerIpAddress == null) {
			if (other.printerIpAddress != null)
				return false;
		} else if (!printerIpAddress.equals(other.printerIpAddress))
			return false;
		if (printerPollingDate == null) {
			if (other.printerPollingDate != null)
				return false;
		} else if (!printerPollingDate.equals(other.printerPollingDate))
			return false;
		if (printerPollingNumber == null) {
			if (other.printerPollingNumber != null)
				return false;
		} else if (!printerPollingNumber.equals(other.printerPollingNumber))
			return false;
		if (printerPollingTime == null) {
			if (other.printerPollingTime != null)
				return false;
		} else if (!printerPollingTime.equals(other.printerPollingTime))
			return false;
		if (printerStoreNumber == null) {
			if (other.printerStoreNumber != null)
				return false;
		} else if (!printerStoreNumber.equals(other.printerStoreNumber))
			return false;
		if (printerTimeUp == null) {
			if (other.printerTimeUp != null)
				return false;
		} else if (!printerTimeUp.equals(other.printerTimeUp))
			return false;
		if (printerlDateUp == null) {
			if (other.printerlDateUp != null)
				return false;
		} else if (!printerlDateUp.equals(other.printerlDateUp))
			return false;
		if (printerstoreAddressLink == null) {
			if (other.printerstoreAddressLink != null)
				return false;
		} else if (!printerstoreAddressLink.equals(other.printerstoreAddressLink))
			return false;
		if (printerstoreName == null) {
			if (other.printerstoreName != null)
				return false;
		} else if (!printerstoreName.equals(other.printerstoreName))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
}
