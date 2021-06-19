package com.ecodation.dersler;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Ders_018_Calendar {

	public static void main(String[] args) {

		// Calendar: Tarih işlemlerinde kullanıyoruz güncel olanıdır
		// import java.util.Calendar; ==> paketini import ediyoruz.

		Calendar tarih = Calendar.getInstance();
		// tarih.setHours(21);
		System.out.println(tarih.getTime());

		// Locale
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss zzzz", locale);
		String cevir = dateFormat.format(tarih.getTime());
		System.out.println(cevir);

	}
}
