package com.ecodation.ornekler;

import java.util.Scanner;

public class Ornekler_016_Register_Login {

	// Dikkat: Consolda virgül kullanmalısın.

	// Kullanıcıdan alınan bilgilere göre doğru kullanıcı adı ve şifre girerse sisteme giriş sağlanacak yoksa deneme
	// hakkı 4"ten başlayarak aşağıya doğru azalacak deneme hakkı eğer 0 olursa sistemden atacak ve kartına bloke
	// konulacak.
	//
	// kullanıcı ad: admin
	// şifre:123456

	// Klavye method
	public static String[] LoginDizi() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Kullanıcı emaili giriniz");
		String email = klavye.nextLine();
		System.out.println("Kullanıcı şifre giriniz");
		String sifre = klavye.nextLine();
		String[] dizi = { email, sifre };
		return dizi;
	}

	public static void adminMethod() {
		System.out.println("******************************************************************************");
		System.out.println("ADMİN SAYFASI");
		System.exit(0);
	}

	// PSVM
	public static void main(String[] args) {
		try {
			String defaultEmail = "email", defaultSifre = "123";
			int kalanhak = 4;

			while (true) {
				if (kalanhak >= 0) {
					String[] dizi = LoginDizi();
					if (dizi[0].equals(defaultEmail) && dizi[1].equals(defaultSifre)) {
						System.out.println("Şifreniz ve emailiniz doğrudur Admin sayfasına yönlendiriliyorsunuz...");
						adminMethod();
					} else {
						kalanhak--;
						System.out.println("Kalan Hakkınız: " + kalanhak);
						if (kalanhak == 0) {
							System.out.println(
									"Kartınız Bloke oldu Lütfen Müşteri Hizmetrelini arayınız 0850 00000 55522 ");
							System.exit(0);
						}
					}
				}
			}
		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}
}
