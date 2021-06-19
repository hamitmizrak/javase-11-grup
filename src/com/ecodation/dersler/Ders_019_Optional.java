package com.ecodation.dersler;

public class Ders_019_Optional {

	public static void main(String[] args) {

		// optional: NullPointerException: Olmayan bir şeye ulaşmaya çalışıyorsunuz
		// Java 8 ile birlikte gelen bir özellikler.
		// java.util.Optional ==> import ediyoruz.
		// Eğer optional kullanırsak Null kontrolü yapmamıza gerek kalmıyor

		Boolean kelime = null;
		System.out.println(kelime);
		if (kelime) {
			System.out.println("kelime");
		}

	}
}
