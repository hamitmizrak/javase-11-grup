package com.ecodation.ornekler;

import java.util.Scanner;

public class Ornekler_015_IteratifFaktoriyel {

	// Dikkat: Consolda virgül kullanmalısın.

	// iteratife faktöriyel: Metofa verilen sayının faktöriyelei hesaplayan bir uygulama yazınız?

	// Klavye method
	public static int sayi() {
		System.out.println("Bir sayı giriniz");
		Scanner klavye = new Scanner(System.in);
		return klavye.nextInt();
	}

	// Faktöriyel: Sıfır veya Sıfırdan dan büyük sayılara ve kendisini çarpıp sonucu gösterir.
	// 4!=4.3.2.1
	// çarpmadan 1 etkisiz elemandır.

	// iteratif faktöriyel method
	public static void iteratifFaktoriyel(int sayi) {
		int change = sayi;
		int carpim = 1;
		for (int i = sayi; sayi > 0; sayi--) {
			carpim *= sayi;
		}
		System.out.println(change + "!= " + carpim);
	}

	// Recursive faktöriyel method
	public static int recursiveFaktoriyel(int sayi) {
		int change = sayi;

		if (sayi < 0) {
			System.out.println("Sıfırdan küçük sayının faktöriyele olamaz");
		} else if (sayi == 0 || sayi == 1) {
			return 1;
		} else {
			return sayi * recursiveFaktoriyel(sayi - 1);
		}
		return 0;
	}

	// PSVM
	public static void main(String[] args) {
		try {
			// iteratifFaktoriyel(sayi());
			int recursive = recursiveFaktoriyel(sayi());
			System.out.println(recursive);
		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}
}
