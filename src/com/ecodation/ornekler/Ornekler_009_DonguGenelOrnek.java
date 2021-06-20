package com.ecodation.ornekler;

public class Ornekler_009_DonguGenelOrnek {
	public static void main(String[] args) {

		// döngü algoritma yazınız ?
		// kullanıcı tarafından başlangıç,bitiş verilsin
		// s1-) başlangıç,bitiş sayıların toplamı
		// s2-) başlangıç,bitiş çift sayıların toplamı
		// s2-) başlangıç,bitiş kadar teksayılar sayıların toplamı
		// s3-) başlangıç,bitiş sayıların toplamı ancak 5'e bölünebilen sayılar hariç

		int ciftSayiToplami = 0, tekSayiToplami = 0, genelToplam = 0;

		try {
			// 0 1 2 3 4 5 6 7 8 9 10
			for (int i = 0; i <= 10; i++) {
				if (i % 2 == 0) {
					ciftSayiToplami += i;
				}

				if (i % 2 == 1) {
					tekSayiToplami += i;
				}
				genelToplam += i;
			}

			System.out.println("Tek sayılar toplamı: " + tekSayiToplami);
			System.out.println("Çift sayılar toplamı: " + ciftSayiToplami);
			System.out.println("Genel sayılar toplamı: " + genelToplam);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
