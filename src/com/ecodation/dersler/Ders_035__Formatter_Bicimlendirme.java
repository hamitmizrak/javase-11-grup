package com.ecodation.dersler;

public class Ders_035__Formatter_Bicimlendirme {
	// Formatter(Biçimlendirme): consolda çıktıları çok daha iyi olmasını sağlayacak yani daha düzenli olmasını sağlar
	// SeDeF: S:String D:Decimal(10:tam sayı) F:Float(virgüllü sayı)

	public static void main(String[] args) {

		String adSoyad = "Hamit Mızrak";
		int tamSayi = 44;
		float virgullu = 34.34f;

		System.out.printf("%s %10d %10.6f", adSoyad, tamSayi, virgullu);
	}
}
