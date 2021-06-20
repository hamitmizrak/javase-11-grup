package com.ecodation.dersler;

public class Ders_027_Try_Catch_Finally {
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
			System.out.println("ilk kod");
			int sayi = 5 / 0; // tanımsızdır Sonsuzdur

		} catch (ArithmeticException ar) {
			ar.getStackTrace();
			System.out.println("Hata meydana geldi: " + ar.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("en son kod");

	}
}
