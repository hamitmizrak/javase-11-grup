package com.ecodation.ornekler;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ornekler_014_DiziOrnegi2 {

	// Dikkat: Consolda virgül kullanmalısın.

	// konsoldan kaç elemanlı elemanlı bir dizi olacak ve bu elemanlara rastgele bilgisayar tarafında sayılar girecek
	// -a) konsoldan rastgele sayı için başlangıç ve bitişi consolden kullanıcı yazacak
	// -b) bu sayıları bir diziye atayalım
	// -c-) rastgele gelen sayıları küçükten büyüğe sıralıyalım ?
	// -d) ilk sayı ile son sayının toplamını alalım.
	// -e) bütün sayıların toplamı ?
	// -f) ortalaması ?
	// -g) bütün sayı toplamını metota verecem metot şunu yapacak girilen sayının 10 küçük olup olmadığını kontol
	// edecek.

	public static void buyukKucuk(int toplam) {
		if (toplam > 10) {
			System.out.println(toplam + " Sayısı 10'dan büyüktür");
		} else {
			System.out.println(toplam + " Sayısı 10'dan küçüktür");
		}
	}

	public static void main(String[] args) {

		try {
			Scanner klavye = new Scanner(System.in);
			int baslangic, bitis, diziElemanSayisi, diziToplam = 0; // toplamada 0(sıfır) etkisiz elemandır
			System.out.println("rastgele başlangıç sayısı giriniz");
			baslangic = klavye.nextInt();
			System.out.println("rastgele bitiş sayısı giriniz");
			bitis = klavye.nextInt();
			System.out.println("dizi eleman sayısını giriniz");
			diziElemanSayisi = klavye.nextInt();

			Random random = new Random();

			int[] dizi = new int[diziElemanSayisi];

			for (int i = 0; i < dizi.length; i++) {
				int rasgele = random.nextInt(bitis) + baslangic;
				dizi[i] = rasgele;
			}

			// sıralama
			Arrays.sort(dizi);
			// Dizi elemanları
			for (int temp : dizi) {
				System.out.print(temp + " ");
				// diziToplam=diziToplam+temp;
				diziToplam += temp;

			}

			// son sayı ile ilk sayı toplamı
			int toplam = dizi[0] + dizi[dizi.length - 1];
			System.out.println("\nbaşlangıç ve bitiş eleman toplamı: " + toplam);

			// bütün sayı toplamı
			System.out.println("Toplam: " + diziToplam);

			// ortalama
			double ortalama = diziToplam / diziElemanSayisi;
			System.out.println("ortalama: " + Math.round(ortalama));

			// Method büyük küçük
			buyukKucuk(diziToplam);
		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}
}
