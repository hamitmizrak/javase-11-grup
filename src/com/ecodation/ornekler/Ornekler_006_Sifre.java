package com.ecodation.ornekler;

import java.util.Scanner;

public class Ornekler_006_Sifre {
	public static void main(String[] args) {
		String password1, password2;
		Scanner klavye = new Scanner(System.in);

		System.out.println("Lütfen giriniz giriniz");
		password1 = klavye.nextLine();

		System.out.println("Lütfen girinizi tekrar giriniz");
		password2 = klavye.nextLine();

		if (password1.equals(password2)) {
			System.out.println("Şifreler eşleşti");
		} else {
			System.out.println("Hata!!! Şifreler eşleşemedi");
		}

	}
}
