package com.ecodation.dersler;

public class Ders_024_Loop_For {
	public static void main(String[] args) {

		// System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 );

		// Toplamada etkisiz elaman=0
		// Çarpmada etkisiz eleman=1
		long toplam = 0L;

		for (long i = 0; i <= 100000000L; i++) {
			toplam = toplam + i;
		}
		System.out.println(toplam);

	}
}
