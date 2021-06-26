package com.ecodation.dersler;

import java.util.Arrays;

public class Ders_043_SerseriDiziler6 {

	public static void main(String[] args) {
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
