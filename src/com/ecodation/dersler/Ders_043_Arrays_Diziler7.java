package com.ecodation.dersler;

public class Ders_043_Arrays_Diziler7 {

	public static void main(String[] args) {
		// serseri dizi
		Object[] dizi = { 4, true, '\u4525', 4.4, "asdasd" };

		// forEach
		for (Object temp : dizi) {
			System.out.print(temp + " ");
		}
		// System.out.println();
		System.out.println("\n" + dizi[2]);

	}
}
