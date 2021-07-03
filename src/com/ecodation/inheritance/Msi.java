package com.ecodation.inheritance;

public class Msi extends Computer {
	private static final long serialVersionUID = 3724865688266862849L;

	// nesne değişkenleri
	private String colorMsi;

	/// parametreli constructor
	public Msi() {
		// TODO Auto-generated constructor stub
	}

	/// parametresiz constructor
	public Msi(String colorMsi, int computerId, String computerName, String computerSerialVersion,
			String computerTrade) {
		super(computerId, computerName, computerSerialVersion, computerTrade);
		this.colorMsi = colorMsi;
	}

	// toString :
	@Override
	public String toString() {
		return "Msi [computerId=" + super.getComputerId() + ", computerName=" + super.getComputerName()
				+ ", computerSerialVersion=" + super.getComputerSerialVersion() + ", computerTrade="
				+ super.getComputerTrade() + "]";
	}

	// getters and setters
	public String getColorMsi() {
		return colorMsi;
	}

	public void setColorMsi(String colorMsi) {
		this.colorMsi = colorMsi;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
