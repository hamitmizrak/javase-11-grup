package com.ecodation.ornekler;

import java.util.Scanner;

public class Ornekler_005_ScannerHesapMakinasi {
	public static void main(String[] args) {
		int sayi1, sayi2;
		Scanner klavye = new Scanner(System.in);

		System.out.println("Lütfen 1.sayıyı giriniz");
		sayi1 = klavye.nextInt();

		System.out.println("Lütfen 2.sayıyı giriniz");
		sayi2 = klavye.nextInt();

		System.out.println("Toplama işlemi: " + (sayi1 + sayi2));
		System.out.println("Cıkarma işlemi: " + (sayi1 - sayi2));
		System.out.println("Çarpmas işlemi: " + (sayi1 * sayi2));
		System.out.println("Bölme   işlemi: " + (sayi1 / sayi2));
		System.out.println("Kalan   işlemi: " + (sayi1 % sayi2));

	}
}
