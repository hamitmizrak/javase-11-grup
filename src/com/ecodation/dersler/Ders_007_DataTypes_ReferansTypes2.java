package com.ecodation.dersler;

public class Ders_007_DataTypes_ReferansTypes2 {

	public static void main(String[] args) {

		// Data type=primitif ve referans (wrapper class) olmak üzere iki tanedir.
		// Primitif değişken tanımlamada
		// Referans ise object tanımlamada kullanmaktayız.
		// Primitif değişkenler: belleğin Stack hafızasında tutulur.
		// Referans değişkenler ise :belleğin heap alanında tutulur

		// data type= 1-)Primitive Type 2-)Wrapper Type (Referans Type)
		// Hatırlatma: Matematiktteki virgül(,) ==> Javadaki karşılığı nokta(.)
		// f-L ==> float'ta sonuna (f) yazıyoruz Long'ta sonuna (L)
		// Dikkat: String primitive type değildir.

		// 1-)Primitive Type
		// primitive türlerde new oluşturmadan yazıyoruz.
		// primitive türler küçük harflerle yazılır.
		// wrapper(Referans) türlerden beslenirler.
		// Tam sayılar b<s<i<l
		// defaultta 0(sıfır sayısı gelir) -128<=x<=127

		// 2-)Referans Types
		// Büyük harfle başlanır.
		// Heap hafıza(Veriler Ram'de turulur) Stack'e göre daha yavaştır
		// Hafızası belli olmayan Türler içindir.
		// null değer kullabiliriz
		// başlangıç değerini vermek zorundayız.
		// new ile hafızada yer açar.
		// String Wrapper (Referans) türe aittir.
		// Object birimlerde kullanılırız.
		// Kullanımı Primitive göre daha zordur.
		Byte b1 = new Byte((byte) 127);
		Short s1 = new Short((short) 129);
		Integer i1 = new Integer(140);
		Long l1 = new Long(8555252);

		// Virgüllü sayılar
		// defaultta null olarak gelir.
		Float f2 = new Float(14.56);
		Double d2 = new Double(555.666);

		// boolean
		// ya doğrudur yada yanlıştır.
		Boolean b3 = new Boolean(true);

		// char
		// Tek tırnak ile tek simge kullanılır.
		Character c5 = new Character('@');

		// String
		String kelime1 = new String();
		String kelime2 = new String("Deneme");
		String kelime3 = "Hamit Mızrak";

	}
}
