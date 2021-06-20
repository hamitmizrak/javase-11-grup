package com.ecodation.ornekler;

import java.util.Scanner;

public class Ornekler_012_AsalSayilar {

	public static void main(String[] args) {

		// Dikkat: Consolda virgül kullanmalısın.
		// Asal sayılar: 1ve kendisine bölünebilen sayılardır
		// En küçük ve tek çift asal sayı: 2'sir

		try {
			boolean result = false;
			while (true) {
				Scanner klavye = new Scanner(System.in);
				System.out.println("Lütfen bir sayı giriniz");
				int sayi = klavye.nextInt();

				if (sayi < 0) {
					System.out.println("\nNegatif sayı veremezsiniz");
				} else if (sayi == 2) {
					System.out.println("\nAsal ve 1 tane çift sayıdır");
				} else {
					// 2 3 4 5 6 7 8 9 10
					for (int i = 2; i < sayi; i++) {
						if (sayi % i == 0) {
							result = true;
						}
					}

					if (result) {
						System.out.println("\nasal sayı değildir");
					} else {
						System.out.println("\nasal sayıdır");// 1 ve kendisine bölünebilen sayılardır
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
