package com.ecodation.decoderencoder;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Scanner;

public class Encoder_Decoder {

	// Scanner method
	public static String getScannerMethod() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String kelime = klavye.nextLine();
		return kelime;
	}

	// Encoder Method =Base64
	public static String getEncoder(String kelime) {
		Encoder encoder44 = Base64.getEncoder();
		String sifrele = encoder44.encodeToString(kelime.getBytes());
		return sifrele;
	}

	// Decoder Method =Base64
	public static String getDecoder(String sifrelenmis) {
		Decoder decoder44 = Base64.getMimeDecoder();
		String sifreyiCoz = new String(decoder44.decode(sifrelenmis));
		return sifreyiCoz;
	}

	public static void main(String[] args) {
		String sifrelenmis = getEncoder(getScannerMethod());
		System.out.println(sifrelenmis);

		// istanbul ==> aXN0YW5idWw=
		// String coz = getDecoder("aXN0YW5idWw=");
		String coz = getDecoder(sifrelenmis);
		System.out.println(coz);
	}

}
