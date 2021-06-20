package com.ecodation.ornekler;

import java.util.Random;
import java.util.Scanner;

public class Ornekler_007_SayıTahminOyunu {
	public static void main(String[] args) {

		int rastgele, kullaniciSayi;
		Scanner klavye = new Scanner(System.in);

		Random random = new Random();
		rastgele = random.nextInt(15) + 1;
		System.out.println(rastgele);

		while (true) {
			System.out.println("1 ile 15 arasında bir sayı giriniz.");
			kullaniciSayi = klavye.nextInt();

			if (rastgele == kullaniciSayi) {
				System.out.println("Tebrik ederim sayıyı buldunuz");
			} else if (kullaniciSayi > rastgele) {
				System.out.println(
						"Büyük sayı girdiniz: " + " tahmin edilen sayı arasındaki fark: " + (kullaniciSayi - rastgele));
			} else if (kullaniciSayi < rastgele) {
				System.out.println(
						"Küçük sayı girdiniz" + " tahmin edilen sayı arasındaki fark: " + (rastgele - kullaniciSayi));
			} else {
				System.out.println("Lütfen belirtilen aralıkta sayı giriniz");
			}
		}

	}
}
