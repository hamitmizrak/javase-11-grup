package com.ecodation.inheritance;

public class Samsung extends Computer {
	private static final long serialVersionUID = 8552522597074043337L;

	public Samsung() {
		// TODO Auto-generated constructor stub
	}

	public Samsung(int computerId, String computerName, String computerSerialVersion, String computerTrade) {
		super(computerId, computerName, computerSerialVersion, computerTrade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samsung [computerId=" + super.getComputerId() + ", computerName=" + super.getComputerName()
				+ ", computerSerialVersion=" + super.getComputerSerialVersion() + ", computerTrade="
				+ super.getComputerTrade() + "]";
	}

}
