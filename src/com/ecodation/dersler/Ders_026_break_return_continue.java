package com.ecodation.dersler;

public class Ders_026_break_return_continue {
	public static void main(String[] args) {
		// break: Döngüyü kırmak için kullanıyoruz
		// return: metotu kırmak için kullanıyoruz.
		// continue: sadece belirtilen alanda çalışmaz sonra devam eder

		// 1 2 3 4 5 =15
		int toplam = 0;
		for (int i = 0; i <= 10; i++) {

			if (i == 1)
				continue;

			if (i == 5)
				break;

			toplam += i;
		}

		System.out.println(toplam);

	}
}
