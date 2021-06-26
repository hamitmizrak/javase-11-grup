package com.ecodation.dersler;

public class Ders_034__Metotlar_Voidli_Parametresiz {
	// Method: Aynı kodları yazmadan tek yapı üzerinden işlem yapabilmektir.
	// Methods: Tekrarlı kod yazmamızı engeller. Daha sistematik kod yazmamızı ve daha cleancode yazmamızı sağlar.
	// Parameters: Method oluştururken kullandığımız değerlerdir
	// Argümans: Metodu çağırırken kullandığımız değerlerdir
	// Parametre : metot oluştururken kullanıyoruz.
	// Argüman : metota veri gönderirken kullanıyoruz.
	// Java By Pass Value (100%)

	// Overloading: Metotun büütn yapıları aynı ancak parametre sayıları farklıdır
	// Override: Ezmek yani önceki bilgiler yerine yeni bilgiler eklenir.
	// final: 1-) değişken türünde: sabitlemek 2-)Metotta: Override edemezsin 3-)Class: extend edemezsin
	// static: duragan
	// annotations: Java 1.5 gelen özelliktir. Örneğin: Hibernate,Spring Boot,Lombok çokca görürüz
	// New nedir? Hafızada yeni bir yer açmak için kullanıyoruz.
	// null nedir? OLan hafızadaki yeri boşaltmak için kullanıyoruz.
	// sıfır nedir?: null ile karıştırılmamalıdır. Sıfır hafızada yer kaplar ancak değeri sıfırdır
	// Constructor nedir?: Yapıcı metotlardır. İlgili Classının instance(örneğini) çağırdığımızda uğrayacak ilk yerdir
	// Over-loading = parametre sayısı farklı Aynı isim methodları oluşturmak için kullanıyoruz.
	// Over-loading = Şart olarak farklı parametelerden olunması gerekiyor.

	// Over-riding = Gövdesi farklı @Override
	// this (constructor , global değişkenler )
	// super.method süper.alan
	// return ;metotu kırar
	// continue;sadece o değerde çalışmaz sonrasında çalışmaya devam eder
	// break; döngü kırmak için

	// Access identifier(erişim belirleyicilerdir)
	// public = her yerden erişim sağlanıyor.
	// protected =alt classların üst classlara erişimini sağlıyor
	// private = sadece aynı classtaki yapılar birbirine ulaşıyor (Encapsulation)
	// default =aynı dosyanın aynı classlarına erişim

	// 1-) voidli Parametresiz
	// 2-) voidli Parametreli
	// 3-) voidsiz Parametresiz
	// 4-) voidsiz Parametreli

	// 1-) voidli Parametresiz
	private static void voidliParametresiz() {
		System.out.println("Method : 1 Voidli Parametresiz");
	}

	// 2-) voidli Parametreli
	private void voidliParametreli(String adi, String soyadi) {
		System.out.println("Method : 2 Voidli Parametreli " + adi + " " + soyadi);
	}

	// 3-) voidsiz Parametresiz
	public static String voidsizParametresiz() {
		return "Method : 3 voidsizParametresiz";
	}

	// 4-) voidsiz Parametreli
	public static String voidsizParametreli(int sayi) {
		return "Method : 4 voidsizParametreli  sayi:" + sayi;
	}

	// PSVM
	public static void main(String[] args) {
		// 1.ders
		voidliParametresiz();

		// 2.ders
		Ders_034__Metotlar_Voidli_Parametresiz result = new Ders_034__Metotlar_Voidli_Parametresiz();
		result.voidliParametreli("Hamit", "Mızrak");

		// 3.ders
		String result3 = voidsizParametresiz();
		System.out.println(result3);

		// 4.ders // 66=argüman
		String result4 = voidsizParametreli(66);
		System.out.println(result4);
	}
}
