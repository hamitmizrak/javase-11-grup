package com.ecodation.dersler;

public class Ders_003_Common_Rules {
	public static void main(String[] args) {
		// Common Rules =Genel Kurallar Eğer genel kuralları ihla edersek bir şey olmaz ancak ortak bir paydada
		// buluşamıyoruz.
		/*
		 * comment // /* * /
		 * 
		 * 1-) Classların ilk harfi büyük yazılır. PascalCase Examples: public class MalatyaTurkiye {}
		 * 
		 * 2-)paket isimlerinin bütün harfleri küçük yazılır. com.ecodation.computer com=genelllik com ile başlanır
		 * ecodation=şirket adı computer=paket adıdıdr Dikkat: nokta(.) alt dizini oluşturur. dosya içinde dosya
		 * oluşturmak içindir.
		 * 
		 * 3-)Classlar isim olmalı,sıfat olmalı ancak ama ancak fiil (eylem) olmaması gerekiyor.
		 * 
		 * 4-)interface I ile başlanır.
		 * 
		 * 5-) Türkçe karakterleri yazmamaya çalışalım examples: üğşçöı , ÜĞŞÇÖİ bu karakterleri yazmalayım. public
		 * static void main(String[] args) { String canakkale = "Çanakkale"; System.out.println(canakkale); }
		 * 
		 * 6-) değişken isimlerini kullanırken camelCase(deve hörgüç) olarak yazmalıyız. String
		 * adiSoyadiMemleketiKimlik;
		 * 
		 * 7-) Metotlar eylem belirtmelidir. public static void gitmek(){} 8-) Metotlar küçük harfle başlanıyor. public
		 * static void gitmek(){}
		 * 
		 * 9-)interface,abstract,class : değişken adı isim olmalı eylem(fiil) olmasın
		 * 
		 * 10-) Constract yapıda değişken hepsi büyük olur private final static String DEGISKEN_ADI="değişmez yapı";
		 * 
		 * 11-)int sayi4; yazılabilinir. ==> Sayı ile başlanmaz. int 4sayi; YAZILAMAZ.
		 * 
		 */
		/*
		 * sayı ile başlanmaz. ama sonuna sayı yazabiliriz. underScore yani alt çizgi ile başlayabilriz. => _ Dolar
		 * işaretiyle başlayabiliriz. => $
		 * 
		 */
		// DeğişkenlerdeyYazılabilinir özellikler
		String adi44 = "Hamit"; // sonuna sayı yazabiliriz.
		String _soyadi = "Mizrak"; // underscore ile başlanamabilinir.
		String $teknolojiler = "Servlet Jsp Jsf Spring Boot Hibernate Rest Html5 Css3 JS Jquery Bootstrap Angular Vue Nuxt  ...";
		// Dolar işaretiyle başlayabilirsiniz.

	}
}
