package com.ecodation.dersler;

public class Ders_005_Operatorler {

	public static void main(String[] args) {

		// Javada Öncelik sırası
		// 1-)Parantez içindekiler önceliklidir olur
		// 2-)Çarpma veya bölme
		// 3-)Toplamaya veya çıkarma

		System.out.println(4 + 5 * (5 / 5 + 1 * 9 * (-1 * 6 + 1 + 9)));

		// Aritmetik operatörler ( + - * / ++ -- %)
		// Aritmetik operatörler (4 işlem yapacağımız)
		System.out.println(4 + 5 * (5 / 5 + 1 * 9 * (-1 * 8 + 1 + 6 / 6)));

		// İlişkisel operatör (< > <= >= ==) return true false
		System.out.println(3 >= 1);

		// Mantıksal operatörler ( &=ve |= veya !=değil ^=xor)
		// if(4==4) {}

		// Atama operatörü ( += -= *= )
		int counter = 0;
		counter++; // işlem sonrasında artırmak
		++counter; // önce artır sonra işlem yap prefix incredement
		counter = counter + 1;
		counter += 1;

		// Kaydırma operatörü
		// 0 << 3 0 sayısını 3 defa sola kaydır)
		// 1 >> 3 1 sayısını 3 defa sağa kaydır.

	}
}
