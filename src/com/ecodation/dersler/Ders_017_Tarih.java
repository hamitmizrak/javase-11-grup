package com.ecodation.dersler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ders_017_Tarih {

	public static void main(String[] args) {

		// Date: Tarih işlemlerinde kullanıyoruz.
		// import java.util.Date; ==> paketini import ediyoruz.

		Date tarih = new Date();
		// tarih.setHours(21);
		System.out.println(tarih);

		// Locale
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss zzzz", locale);
		String cevir = dateFormat.format(tarih);
		System.out.println(cevir);

		// Şimdki zamanı göstersin
		Date date2 = new Date(System.currentTimeMillis());
		// int hour = date2.getHours();
		int minute = date2.getMinutes();
		System.out.println(minute);

	}
}
