package com.ecodation.ornekler;

public class Ornekler_008_NegatifMiPozitifMi {
	public static void main(String[] args) {

		// sayının negatif mi pozitif mi olduğunu bulan algoritma yazınız ?
		int sayi = -5;

		try {
			if (sayi > 0) {
				System.out.println("Sayı pozitif");
			} else {
				System.out.println("Sayı negatif");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
