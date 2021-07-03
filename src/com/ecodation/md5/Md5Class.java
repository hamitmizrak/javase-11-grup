package com.ecodation.md5;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Md5Class {

	// Kriptografik özet fonksiyonudur.
	// 1991 Ron Rivest tarafında tasarlanmıştır(md4)
	// 128 bit değere sahiptir. (010111000111 *128)
	// Brute force(Kaba kuvvet saldırılarına dayanaksızdır).

	// Scanner method
	public static String getScannerMethod() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String kelime = klavye.nextLine();
		return kelime;
	}

	public static void md5Method(String kelime) {
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.reset();
			messageDigest.update(kelime.getBytes());

			byte[] digestDizi = messageDigest.digest();
			BigInteger bigInteger = new BigInteger(1, digestDizi);

			String text = bigInteger.toString(16);
			while (text.length() < 32) {
				text = "0" + text;
			}
			System.out.println(text);

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		String kelime = "Lorem ipsum L Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrudrem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud";
		md5Method(kelime);
	}

}
