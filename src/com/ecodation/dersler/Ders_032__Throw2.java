package com.ecodation.dersler;

public class Ders_032__Throw2 {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// Hata ile İstisnayı karıştırmamak gerekir
		// 3 tür hata vardır
		// 1-) Syntax error(Gramer hatası) yazım hatası
		// 2-) Logical error (Mantıksal hata) istediğimiz sonuctan farklı sonuç verir.
		// 3-) Run time Error(En korkutucu olanıdır) Yazılımcı bu durumda ne yapacağını bilemez.

		// try-catch: İstisna durumlarını handling ederek kodlarımızı daha düzgün ve stabil çalışmasını sağlar
		// try-catch: Bizim sorunumu çözemezzzzzz
		// Hata ile İstisnayı karıştırmamak gerekir

		// A-)final: sabit demektir. 3 yerde kullanılır.
		// 1-)değişkende:sabit
		// 2-)sınıfta:extends edemeyiz
		// 3-)metotta override edemeyiz

		// B-) finally:Sonunda
		// C-) finalize:gc();

		// int[] dizi = { 5, 2, 6 };
		// System.out.println(dizi[4]);

		// throw: bilerek hata alma durumunu
		// throw new ArithmeticException("Burada sıfıra bölme hatası var");

		try {
			System.out.println("ilk kod");
			int sayi = 5 / 0; // tanımsızdır Sonsuzdur

		} catch (ArithmeticException ar) {
			ar.getStackTrace();
			System.out.println("Hata meydana geldi: " + ar.getMessage());
			throw (ar);
		}

		System.out.println("en son kod");

	}
}
