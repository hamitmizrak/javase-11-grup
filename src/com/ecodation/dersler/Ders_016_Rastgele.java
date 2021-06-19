package com.ecodation.dersler;

import java.util.Random;

public class Ders_016_Rastgele {

	public static void main(String[] args) {

		// Rastgele sayılar için 2 tane yöntem vardır.

		// 1.YÖNTEM ==> math
		double rastgele1 = Math.round(Math.random() * 4 + 1);
		System.out.println(rastgele1);

		// 2.YÖNTEM: Obje türündendir
		// java.util paketini import ederiz ==> import java.util.Random;
		Random rnd = new Random();
		int rastgele2 = rnd.nextInt(5) + 1;
		System.out.println(rastgele2);

	}
}
