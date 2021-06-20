package com.ecodation.ornekler;

import java.util.Scanner;

public class Ornekler_013_Faktoriyel {

	// Dikkat: Consolda virgül kullanmalısın.
	// Faktöriyel hesaplama: Verilen sayının 1 'ekadar çarpım halidir
	// 0!=1 1!=1 2!=2*1=2 3!=3*2*1=6
	// çarpmada etkisiz eleman : 1
	// toplamada etkisiz eleman : 0

	public static void main(String[] args) {

		// Dikkat: Consolda virgül kullanmalısın.
		// Faktöriyel hesaplama: Verilen sayının 1 'ekadar çarpım halidir
		// 0!=1 1!=1 2!=2*1=2 3!=3*2*1=6
		// çarpmada etkisiz eleman : 1
		// toplamada etkisiz eleman : 0

		try {
			Scanner klavye = new Scanner(System.in);
			System.out.println("Lütfen bir sayı giriniz");
			int sayi = klavye.nextInt();
			int carpim = 1;

			if (sayi < 0) {
				System.out.println("Faktöriyel negatif sayılar giremezsin");
			} else if (sayi == 0) {
				System.out.println("0! cevabı: 1");
			} else {
				// 4*3*2*1
				int revizeSayi = Math.abs(sayi);
				for (int i = revizeSayi; revizeSayi > 0; revizeSayi--) {
					carpim *= revizeSayi;
					// carpim = carpim * i;
				}
				System.out.println(sayi + " sayısının Faktöriyel hesabı: " + carpim);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
