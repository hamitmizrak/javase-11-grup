package com.ecodation.dersler;

public class Ders_013_Cast {

	public static void main(String[] args) {
		// Cast: çevirmek için kullanılıyoruz.
		// String'i ==> Tam sayıya
		// Tam sayıyı ==> String'e

		// cast:1
		float f1 = 14.55f;
		float f2 = (float) 14.55;
		long l1 = 5525596696256356L;

		// cast:2
		// boxing: primitive türü referans türüne benzetmek
		int primitive1 = 44;
		Integer referansType1 = primitive1;

		// cast:3
		// unboxing: referans türü primitive türüne benzetmek
		Integer referansType2 = new Integer(66);
		int primitive2 = referansType2;

		// cast:3
		// String'i tam sayıya çevirmek
		String kelime = "66";
		int sayi = 34;
		System.out.println(66 + 34);
		System.out.println(kelime + sayi);

		// 1.yol: obje türündendir
		int kelime2 = Integer.valueOf(kelime);
		System.out.println(kelime2 + sayi);
		// 2.yol: obje türünden olmayan türünden = daha hızlıdır
		int kelime3 = Integer.parseInt(kelime);

		// cast:4
		// tam sayıyı String'i çevirmek
		int sayi2 = 44;
		// 1.yol: obje türündendir
		String str = String.valueOf(sayi2);
		// 2.yol: obje türünden olmayan türünden daha hızlıdır
		String str2 = Integer.toString(sayi2);

	}
}
