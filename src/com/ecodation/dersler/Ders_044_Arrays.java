package com.ecodation.dersler;

import java.util.Arrays;

public class Ders_044_Arrays {

	public static void main(String[] args) {
		// java.util paketinden import ederiz.

		// // void dönder
		// Arrays.sort(); //dizileri sıralamak için kullanırız.

		// //dizide arama yapmak için kullanırız. //int dönder
		// Arrays.binarySearch();

		// //diziler eşitmi //boolean döner
		// Arrays.equals();

		int[] dizi1 = { 6, 5, 1, 3, 2, 4 };
		int[] dizi2 = { 6, 5, 1, 3, 2, 4 };

		if (Arrays.equals(dizi1, dizi2)) {
			System.out.println("diziler birbirine eşittir");
		} else {
			System.out.println("diziler birbirine eşittir değildirrrrr");
		}

		// forEach
		for (int temp : dizi1) {
			System.out.print(temp + " ");
		}

		System.out.println();
		// Sıralama
		java.util.Arrays.sort(dizi1);
		for (int temp : dizi1) {
			System.out.print(temp + " ");
		}

		System.out.println();
		int result = Arrays.binarySearch(dizi1, 44);
		System.out.println(result);
		if (result > 0) {
			System.out.println("aradığınız sayı bulunuyor");
		} else {
			System.out.println("aradığınız sayı bulunmuyorrrrr");
		}

		System.out.println("");

	}
}
