package com.ecodation.ornekler;

public class Ornekler_017_LineerSearch {

	// Linear Search
	// Dizideki aranan sayıyı teker teker bulmaya yarar.
	public static int linearSearch(int[] dizi, int aranacakSayi) {
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] == aranacakSayi)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] dizi = { 5, 6, 8, 9, 10, 15 };
		int sayi = 5;

		int bulunanDeger = linearSearch(dizi, sayi);
		if (bulunanDeger != -1) {
			System.out.println(sayi + " sayısı bulunuyor: sıra sayısı: " + (bulunanDeger + 1));
		} else {
			System.out.println("Aradığınız sayı bulunmuyor!!!!");
		}
	}

}
