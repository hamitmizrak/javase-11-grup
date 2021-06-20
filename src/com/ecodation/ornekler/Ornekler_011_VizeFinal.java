package com.ecodation.ornekler;

import java.util.Scanner;

public class Ornekler_011_VizeFinal {
	public static void main(String[] args) {

		// Dikkat: Consolda virgül kullanmalısın.
		// Sınav geçme AA BA CC DC FF
		// Result>=90 AA
		// Result>=80 BA
		// Result>=70 CC
		// Result>=60 DC
		// Result= FF
		// Vize:40% Final:60%

		double finalNotu = 0.0, vizeNotu = 0.0, ortalama = 0.0;

		try {
			Scanner klavye = new Scanner(System.in);
			System.out.println("Lütfen Vize notunuzu giriniz");
			vizeNotu = klavye.nextDouble();

			System.out.println("Lütfen Final notunuzu giriniz");
			finalNotu = klavye.nextDouble();
			ortalama = (vizeNotu * 40) / 100 + (finalNotu * 60) / 100;
			if (ortalama < 60) {
				System.out.println("ortalamanız: " + ortalama + " Kaldınız: FF");
			} else if (60 <= ortalama && ortalama <= 69) {
				System.out.println("ortalamanız: " + ortalama + " Sorunlu geçtiniz: DC");
			} else if (70 <= ortalama && ortalama <= 79) {
				System.out.println("ortalamanız: " + ortalama + " Başarılar: CC");
			} else if (80 <= ortalama && ortalama <= 89) {
				System.out.println("ortalamanız: " + ortalama + " Başarılar: BA");
			} else if (90 <= ortalama && ortalama <= 100) {
				System.out.println("ortalamanız: " + ortalama + " Başarılar: AA");
			} else {
				System.out.println("Vize veya final yanlış girildi");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
