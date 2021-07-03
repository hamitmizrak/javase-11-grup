package com.ecodation.inheritance;

public class InheritanceMainTest {

	public static void main(String[] args) {
		// instance:new ile örnekleme
		Msi msi = new Msi();
		msi.setComputerId(1);
		msi.setComputerName("Msi-gl75");
		msi.setComputerSerialVersion("Xldjod585");
		msi.setComputerTrade("Msi");
		msi.setColorMsi("Dark Blue");
		System.out.println(msi);

		Samsung samsung = new Samsung(1, "Samsung-kit155", "Xldjod585", "Samsung");
		System.out.println(samsung);

		Lenova lenova = new Lenova(1, "Lenova-kit355", "Xldjod585", "Lenova");
		System.out.println(lenova);

	}

}
