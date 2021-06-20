package com.ecodation.dersler;

public class Ders_025_Loop_Do_while {
	public static void main(String[] args) {

		// System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 );

		// Toplamada etkisiz elaman=0
		// Çarpmada etkisiz eleman=1

		long i = 0;
		do {
			System.out.println("kesinlikle 1 kere çalışacak " + (i + 1) + " kez çalıştı");
			i++;
		} while (i < 5);

	}
}
