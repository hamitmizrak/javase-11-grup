package com.ecodation.dersler;

import java.util.Arrays;

public class Ders_041_TekBoyutluDiziler2 {
	// Tek Boyutlu diziler: aynı türdeki verileri saklamak için kullanıyoruz.
	// Diziler: sıfırıncı indiste başlar
	// Dizilerde vermediğiniz değer yerine tam sayılarda sıfır(0) ataması yapar
	// Dizilerde vermediğiniz değer yerine virgüllü sayılarda sıfır(0.0) ataması yapar
	// Dizilerde vermediğiniz değer yerine String'te sayılarda null() ataması yapar
	// dizilerde eleman sayısı için dizi.length() ==> kullanalım.

	public static void main(String[] args) {
		int[] dizi = new int[10];
		dizi[0] = 0;
		dizi[1] = 1;
		dizi[2] = 2;
		dizi[3] = 30;
		dizi[4] = 40;
		dizi[5] = 5;
		dizi[6] = 60;
		dizi[7] = 7;
		dizi[8] = 80;
		dizi[9] = 9;

		// küçükten büyüğe doğru
		Arrays.sort(dizi);
		// System.out.println(dizi[2] + dizi[9]);
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
	}
}
