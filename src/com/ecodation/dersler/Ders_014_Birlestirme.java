package com.ecodation.dersler;

public class Ders_014_Birlestirme {

	public static void main(String[] args) {
		// Nesneleri birleştirmek için birden fazla yöntem vardır.

		// 1.yöntem: (+) artı operant ile birleştirmek
		// Dikkat: + ile 2 yada 3 tane objeyi birleştirelim daha büyük yapılarda da birleştirebiliriz ancak performansı
		// etkiler
		String str = "Java" + " Jsp" + " JSF";
		System.out.println(str);

		// 2.yöntem: concat ile birleştirmek
		String str2 = "Java".concat(" Jsp").concat(" JSF");
		System.out.println(str2);

		// 3.yöntem hem concat hem +(artı) operant
		String str3 = "Java".concat(" Jsp") + " JSF";
		System.out.println(str3);

		// 4.yöntem (StringBuilder)
		// StringBuilder: Gelenveri ne olduğunu bilmiyorsak yani String mi,sayı mı v.s
		// StringBuilder: daha hızlıdır
		// java.lang.StringBuilder kütüphanesini çağırmamız lazım
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Java").append(" Jsp").append(" JSF");
		String cevir = stringBuilder.toString();
		System.out.println(cevir);

		// 5.yöntem (StringBuffer)
		// StringBuffer: Gelenveri ne olduğunu bilmiyorsak yani String mi,sayı mı v.s
		// StringBuffer: daha güvenli ancak StringBuilder'e göre daha yavaştır.
		// Buradaki yavaşlık milisaniye cinsinden dir
		// StringBuffer kütüphanesini çağırmamız lazım
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Java").append(" Jsp").append(" JSF");
		String cevir2 = stringBuffer.toString();
		System.out.println(cevir2);

	}
}
