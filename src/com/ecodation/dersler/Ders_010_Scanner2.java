package com.ecodation.dersler;

import java.util.Scanner;

public class Ders_010_Scanner2 {

	public static void main(String[] args) {
		// Scanner(tarayıcı): Kullanıcıyla etkileşimli olması sağlıyor.
		// yani kullanıcıdan bilgi almak için kullanıyoruz.
		// Consoledan kullanıcıdan veri almak için kullanıyoruz.
		// import java.util.Scanner; ==> bu kütüphaneyi import etmemiz gerekiyor
		// Eclipse kısayolu: Ctrl+Shift+o

		// Scanner klavye=new Scanner(System.in);
		// System.out.println("sayı giriniz");
		// int a=klavye.nextInt();
		// String s2=klavye.nextLine();
		// klavye.close();
		// NOT: nextByte nextShort nextInt nextLong nextDouble nextBoolean nextLine

		Scanner klavye = new Scanner(System.in);

		System.out.println("Lütfen adınızı giriniz");
		String adi = klavye.nextLine();
		System.out.println("Girdiğiniz kelime: " + adi);

		System.out.println("Lütfen soyadınız giriniz");
		String soyadi = klavye.nextLine();

		System.out.println("\nadınız ve soyadınız: " + adi + "  " + soyadi);

		// eğer kullanıcıdan tam sayı almak istersem
		System.out.println("Lütfen bir sayı giriniz");
		int sayi = klavye.nextInt();
		System.out.println(sayi * sayi);

		// eğer kullanıcıdan virgüllü sayı almak istersem
		// dikkat:javada virgül için nokta(.) kullanılır ancak Klavyede virgül için virgül(,) kullanılır.
		System.out.println("Lütfen bir virgüllü sayı giriniz");
		float virgullu = klavye.nextFloat();
		System.out.println(virgullu);

		klavye.close();

	}
}
