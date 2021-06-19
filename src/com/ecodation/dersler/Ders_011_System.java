package com.ecodation.dersler;

import java.util.Date;

public class Ders_011_System {

	public static void main(String[] args) {
		// System: Javada Geel işlemler için kullanacağımız bir kelimedir.
		// System.err=hata mesajı
		// System.in=dış dünyadan Javaya veri girişi için kullanılır
		// System.out=Dış dünya iin çıktı için kullanıyoruz.

		// Ekran çıktısı için kullanıyoruz
		System.out.println();

		// Formatlama için System kullanıyoruz.
		// System.out.printf();

		// error: Hataları göster
		System.err.println("Hataları göster");

		// Tarihsel olarak şimdiki zamanı almak için kullanıyoruz.
		System.out.println(System.currentTimeMillis());
		Date date = new Date(System.currentTimeMillis());
		System.out.println(date);

		// Garbarage Collection: Kullanılmayan nesleri manuel olarak Gc'yi çağırmak için kullanıyoruz.
		System.gc();

	}
}
