package com.ecodation.dersler;

public class Ders_001_psvm {
	public static void main(String[] args) {
		// Commend: kendimize ait notlar için kullanıyoruz.
		// Javada tek satırlı Yorumlama 2tane Slash kullanıyoruz
		/*
		 * Çok satırlı yorumlama için kullanıyoruz diğer satırlar Dikkat: Commentta yazılan yazılar compilerda görülmez.
		 */

		// psvm nedir? ==> public static void main(String[] args) { }
		/*
		 * psvm: Ana dizindir eğer psvm olmazsa projemizi çalıştıramayız. Mutlaka yazmak zorundayız.
		 * 
		 * public=access identifier(erişim belirleyicidir) Java 4 tanedir. public=bonkör(herkese yardım eder)
		 * private=cimri(sadece kendisi için yaşar) protected=iki dünya arasında arafta kalmış(Hem public'e benzer hemde
		 * private benzer) yazılmazsa defaultolarak gelir.
		 * 
		 * static=durağan demektir. new keywordunu kullanmadan çağırmaya yaramaktadır. Çok zor durumda kalmadığımız
		 * sürece yapmamız gerekir. çünkü güvenlik açığıdır.
		 * 
		 * void: dönüşlü - dönüşsüz
		 * 
		 * main:method adıdır.
		 * 
		 * (): parametre alınacak yapıdır. String[] args= String türünde dizilerdir.
		 * 
		 */

		// sout veya sysout yazılır bunda dış dünyaya birşeyler göstermek istersek System.out.println() ==> kullanırız.
		System.out.println("Hamit Mızrak");

	}

}
