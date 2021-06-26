package com.ecodation.ornekler;

import java.util.Arrays;

public class Ornekler_014_DiziOrnegi {

	// Dikkat: Consolda virgül kullanmalısın.

	// S1-) 0,5,3,2,1,4 bu sayıları bir diziye atayın bu diziniden clonelanmış dizi elde edilecektir.
	// s2-) clonelanmış dizi bu sayıları küçükten büyüğe doğru sıralayın
	// s3-) clonelanmış dizi Bunların içinde çift sayı toplamları ,tek sayı toplamı

	public static void main(String[] args) {

		try {

			int[] dizi = { 0, 5, 3, 2, 1, 4 };
			int[] cloneDizi = new int[dizi.length];

			for (int i = 0; i < dizi.length; i++) {
				cloneDizi[i] = dizi[i];
			}

			// forEach
			for (int temp : cloneDizi) {
				System.out.print(temp + " ");
			}

			System.out.println("\n***************************************");
			// Sıralama
			Arrays.sort(cloneDizi);
			for (int temp : cloneDizi) {
				System.out.print(temp + " ");
			}
			System.out.println("\n***************************************");
			// Sıralama
			int tekToplam = 0, ciftToplam = 0;
			for (int temp : cloneDizi) {
				if (cloneDizi[temp] % 2 == 0) {
					ciftToplam += temp;
				} else {
					tekToplam += temp;
				}
			}

			System.out.println("Çift sayı toplamı: " + ciftToplam);
			System.out.println("Tek sayı toplamı: " + tekToplam);

		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}
}
