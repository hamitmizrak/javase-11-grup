package com.ecodation.dersler;

public class Ders_041_TekBoyutluDiziler {
	// Tek Boyutlu diziler: aynı türdeki verileri saklamak için kullanıyoruz.
	// Diziler: sıfırıncı indiste başlar
	// Dizilerde vermediğiniz değer yerine tam sayılarda sıfır(0) ataması yapar
	// Dizilerde vermediğiniz değer yerine virgüllü sayılarda sıfır(0.0) ataması yapar
	// Dizilerde vermediğiniz değer yerine String'te sayılarda null() ataması yapar
	// dizilerde eleman sayısı için dizi.length() ==> kullanalım.

	public static void main(String[] args) {
		int[] dizi = new int[10];
		dizi[0] = 0;
		dizi[2] = 2;
		dizi[9] = 9;

		System.out.println(dizi[2] + dizi[9]);
	}
}
