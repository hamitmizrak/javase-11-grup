package com.ecodation.dersler;

public class Ders_028_W__catch {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		try {
			int sayi = 3 / 0;
			System.out.println(sayi);
		} catch (Exception e) {
			// System.out.println("Mesaj Türü: " + e.getMessage());
			// System.out.println("Mesaj Adı ve türü: " + e.toString());
			// e.printStackTrace();
			StackTraceElement[] dizi = e.getStackTrace();
			for (Object temp : dizi) {
				System.out.println(temp);
			}
		}
	}
}
