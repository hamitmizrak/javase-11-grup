package com.ecodation.dersler;

public class Ders_024_Loop_while {
	public static void main(String[] args) {

		// System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 );

		// Toplamada etkisiz elaman=0
		// Çarpmada etkisiz eleman=1
		long toplam = 0L;
		long i = 0;
		while (i <= 100000000L) {
			toplam = toplam + i;
			i++;
		}
		System.out.println(toplam);

	}
}
