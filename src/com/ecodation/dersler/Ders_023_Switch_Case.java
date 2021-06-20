package com.ecodation.dersler;

import java.util.Scanner;

public class Ders_023_Switch_Case {
	public static void main(String[] args) {
		String user, validationUser;
		Scanner klavye = new Scanner(System.in);

		while (true) {
			System.out.println("Lütfen haftanın gününü giriniz");
			user = klavye.nextLine();
			validationUser = user.toLowerCase();
			switch (validationUser) {
				case "salı":
					System.out.println("Günlerde: " + user.toLowerCase());
					break;
				case "pazartesi":
					System.out.println("Günlerde: " + user.toLowerCase());
					break;
				case "çarşamba":
					System.out.println("Günlerde: " + user.toLowerCase());
					break;
				case "cumartesi":
					System.out.println("Günlerde: " + user.toLowerCase());
					break;
				case "perşembe":
					System.out.println("Günlerde: " + user.toLowerCase());
					break;
				case "cuma":
					System.out.println("Günlerde: " + validationUser);
					break;
				case "pazar":
					System.out.println("Günlerde: " + validationUser);
					break;

				default:
					System.out.println("Lütfen Haftanın günlerini doğru giriniz...");
					break;
			}
		}

	}
}
