package com.ecodation.dersler;

public class Ders_036__overloading {
	// Aynı isimli farklı metotlara diyoruz ancak aynı isimli farklı parametreler denir.
	// Not: Constructor içinde kullanabiliriz.

	// overloading: aşırı yükleme
	public static void method2() {
		System.out.println("method2");
	}

	public static void method2(int a) {
		System.out.println("method2");
	}

	public static void method2(int a, String s2) {
		System.out.println("method2");
	}

	public static void main(String[] args) {

	}
}
