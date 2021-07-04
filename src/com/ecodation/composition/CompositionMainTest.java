package com.ecodation.composition;

public class CompositionMainTest {

	public static void main(String[] args) {
		// kim olmazsa olmazdı ?
		// Yazar =spesifik

		// 1
		Yazar yazar = new Yazar(100, "Anthony", "Robbins");

		// N = JSP KİTABI
		Kitap jspKitabı = new Kitap(200, "Jsp Kitabı", "25");
		jspKitabı.setYazar(yazar);
		jspKitabı.getYazar().getKitapList().add(jspKitabı);

		// N = SPRING KİTABI
		Kitap springKitabı = new Kitap(400, "spring Kitabı", "75");
		springKitabı.setYazar(yazar);
		springKitabı.getYazar().getKitapList().add(jspKitabı);

		System.out.println("********************************************");
		System.out.println(yazar);
		System.out.println("********************************************");
		System.out.println(jspKitabı);
		System.out.println("********************************************");
		System.out.println(springKitabı);

	}

}
