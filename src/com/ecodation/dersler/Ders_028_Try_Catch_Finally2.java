package com.ecodation.dersler;

public class Ders_028_Try_Catch_Finally2 {
	public static void main(String[] args) {
		// Hata ile İstisnayı karıştırmamak gerekir
		// 3 tür hata vardır
		// 1-) Syntax error(Gramer hatası) yazım hatası
		// 2-) Logical error (Mantıksal hata) istediğimiz sonuctan farklı sonuç verir.
		// 3-) Run time Error(En korkutucu olanıdır) Yazılımcı bu durumda ne yapacağını bilemez.

		// try-catch: İstisna durumlarını handling ederek kodlarımızı daha düzgün ve stabil çalışmasını sağlar
		// try-catch: Bizim sorunumu çözemezzzzzz
		// Hata ile İstisnayı karıştırmamak gerekir

		try {
			int[] dizi = { 5, 2, 6 };
			System.out.println(dizi[4]);
		} catch (ArrayIndexOutOfBoundsException arr) {
			// arr.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("Son kod");

	}
}
