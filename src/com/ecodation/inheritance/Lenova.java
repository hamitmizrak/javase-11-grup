package com.ecodation.inheritance;

public class Lenova extends Computer {

	private static final long serialVersionUID = -9040697495636024830L;

	public Lenova() {
		// TODO Auto-generated constructor stub
	}

	public Lenova(int computerId, String computerName, String computerSerialVersion, String computerTrade) {
		super(computerId, computerName, computerSerialVersion, computerTrade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Lenovo [computerId=" + super.getComputerId() + ", computerName=" + super.getComputerName()
				+ ", computerSerialVersion=" + super.getComputerSerialVersion() + ", computerTrade="
				+ super.getComputerTrade() + "]";
	}

}
