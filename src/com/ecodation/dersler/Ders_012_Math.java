package com.ecodation.dersler;

public class Ders_012_Math {

	public static void main(String[] args) {
		// Mathematics
		// Bu sınıf java.lang paketinden barındırılmaktadır.
		// Math sınıfı Java Lang kütüphanesi ile otomatik olarak gelmektedir.
		// Math Sınıfının methodları static methottur. 
		// Math sınıfında 2 adet sabit tanımlanmıştır:
		// Math.PI : 3.14 public static final double PI olarak tanımlanır.
		// Math.E : 2.71 public static final double E olarak tanımlanır.
		// Floor :Tek parametre alır(double) ve bir küçük tam sayıya yuvarlar. Math.floor(2.6) => 2.0
		// Ceil :Tek parametre alır(double) ve bir büyük tam sayıya yuvarlama yapar. Math.ceil(2.6) => 3.0
		// Math.round(2.5) //hem ceil hemde Floor
		// Math.max(x,y): İki parametre alır ve parametrelerden büyük olan sayıyı geri döner.
		// Math.min(x,y): İki parametre alır ve parametrelerden küçük olan sayıyı geri döner.
		// Örnek: Math.min(5, 10); 5
		// Math.max(x,y): İki parametre alır ve parametrelerden büyükolan sayıyı geri döner.
		// Örnek: Math.min(5, 10);  10
		// Math.sqrt(x) Örnek: Math.sqrt(64);
		// Math.abs(x) Örnek: Math.abs(-4.7)
		// Math.random()
		// Math.pow(3,5)
		// Pow İki parametre alır ve ikinci parametreyi birincinin üstü olarak kullanır. Math.pow(3,5) => 3^5 anlamına
		// gelir => 243.0
		// Sin(x) : x trigonometrik sinusü (x in radyan cinsinde)
		// Math.PI
		// Math.E
		// pi sayısısı
		System.out.println(Math.PI);

		// e sayısı
		System.out.println(Math.E);

		// abs:mutlak
		System.out.println(Math.abs(-14));

		// iki sayı arasındaki en büyük sayıyı bulur döndürür.
		System.out.println(Math.max(2, 100));

		// iki sayı arasındaki en küçük sayıyı bulur döndürür.
		System.out.println(Math.min(2, 100));

		// pow() ==> üslü sayılarda kullanılırız: 2:alt taban 5:üst taban
		// sonucu double değişkeni
		System.out.println(Math.pow(2, 5));

		// sqrt() ==> karekök için kulllanırız: 16 karekökü:4
		// sonucu double değişkeni
		System.out.println(Math.sqrt(16));

		// floor:zemin yani alt sayıya yuvarlamak
		System.out.println(Math.floor(5.9));

		// ceil:zemin yani alt sayıya yuvarlamak (Cebrail)
		System.out.println(Math.ceil(5.1));

		// round:ceil ve floor yaptığını yapar.
		// Dikkat: .5 ve üstünde yukarı yuvarlar
		// Dikkat: .4 ve altında aşağı yuvarlar
		System.out.println(Math.round(5.4));

		// random: Rastgele sayılar için kullanıyoruz.
		System.out.println(Math.random() * 2 + 1); // 1 ile 3 arasındaki 1<=x<3
	}
}
