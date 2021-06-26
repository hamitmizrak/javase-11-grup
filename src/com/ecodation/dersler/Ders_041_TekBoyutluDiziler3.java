package com.ecodation.dersler;

import java.util.Arrays;

public class Ders_041_TekBoyutluDiziler3 {
	// Tek Boyutlu diziler: aynı türdeki verileri saklamak için kullanıyoruz.
	// Diziler: sıfırıncı indiste başlar
	// Dizilerde vermediğiniz değer yerine tam sayılarda sıfır(0) ataması yapar
	// Dizilerde vermediğiniz değer yerine virgüllü sayılarda sıfır(0.0) ataması yapar
	// Dizilerde vermediğiniz değer yerine String'te sayılarda null() ataması yapar
	// dizilerde eleman sayısı için dizi.length() ==> kullanalım.

	public static void main(String[] args) {
		int[] dizi = { 0, 1, 2, 30, 40, 5, 60, 7, 80, 9 };

		// küçükten büyüğe doğru
		Arrays.sort(dizi);
		// System.out.println(dizi[2] + dizi[9]);
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
	}
}
