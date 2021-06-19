package com.ecodation.dersler;

public class Ders_000_GenelBilgiler {
	public static void main(String[] args) {
		// Javada psvm olmazsa çalışmazzzzz ==> public static void main(String[] args) {}

		// java case sensitive: bir dildir yani küçük büyük harfe duyarlıdır

		// Her zaman Noktalı virgül yazmak zorundayız.

		// localScope: Kişisel terim için kullanılır.
		// GlobalScope: Genel terimler için kullanılır.

		// int a=85;
		// int b=null; //stack hafızada null veremeyiz
		// Integer b=new Integer(9); //heap memory Methodlar kullanabiliyoruz.
		// New =Hafızada yer açılmış veridir
		// Null =Hafızada yer açılmamıştır
		// Sıfır= değeri var ancak iç yapısı yok
		// Null eşit değildir. 0(sıfır)

		// Java Bilimsel işlemlerde kullanmak üzere E vardır.
		// 42.52 =4252E-2 ==> 4252*1/10*1/10
		// 4200 =42E+2==> 42*10*10

		// Error
		// 1-) Syntax error: Gramer hatası examples: Strin kelime;
		// 2-) Logic error : Gramer hatası göstermez istediğimiz sonucun dışında bir sonuç gelmesidir. examples:0*90
		// 3-) RunTimeError: Hafızada yer kalmadı.
		// int sayi = 44 / 0;
		// System.out.println(sayi);

		// SAYI SİSTEMİMİZ

		// 1-)binary 0-1 olan sayılardır.
		// sayının başına 0b gelmek zorundadır.
		int binary = 0b110;
		System.out.println(binary);

		// 2-)Hexadecimal (16 tabanda)
		// 16 tabanda : 0-1-2-3-4-5-6-7-8-9-a-b-c-d-e-f
		int hexadecimal = 0x111;
		System.out.println(hexadecimal);

		// 3-)decimal (10 tabanda)
		// 10 tabanda: 0-1-2-3-4-5-6-7-8-9
		int decimal = 44;
		System.out.println(decimal);

	}

}
