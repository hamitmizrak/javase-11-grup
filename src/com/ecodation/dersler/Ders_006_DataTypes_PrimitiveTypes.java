package com.ecodation.dersler;

public class Ders_006_DataTypes_PrimitiveTypes {

	public static void main(String[] args) {

		// Primitif türleri serileştirme yapılamaz.
		// Stack hafıza saklanır.
		// Daha hızldır.
		// Uzay ( hafızada boyutu bellidir. )
		// Null değeri verilemez.
		// new oluşturmadan yazıyoruz.
		// ilk değer vermek zorunda değiliz.(Referans türlerde ilk değere verimek zorunda)

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
		// Stack hafızada saklanır(Datalar Ram'de tutulur.Hızlıdır.)
		// Hafıza uzayda kapladığı alan belli ise kullanılır.
		// başlangıç değerini vermezsek olur
		// primitive türler küçük harflerle yazılır.
		// null değer kullanmayız.
		// wrapper(Referans) türlerden beslenirler.
		// Tam sayılar b<s<i<l
		// defaultta 0(sıfır sayısı gelir) -128<=x<=127
		// Kullanımı Referans Türe göre daha kolaydır.

		// defaullta:0 1byte=8bit
		byte b1 = 127;

		// defaullta:0 2byte
		short s1 = 129;

		// defaullta:0 4byte
		int i1 = 140;

		// defaullta:0L 8byte
		long l1 = 45265965565256526L;

		// Virgüllü sayılar
		// defaultta 0.0 olarak gelir.

		// defaullta:0.0f 4byte
		float f2 = 14.56f;

		// defaullta:0.0d 8byte
		double d2 = 555.666;

		// boolean
		// default : false
		// ya doğrudur yada yanlıştır.
		boolean b3 = true;

		// char
		// defaultta: \u0000
		// Tek tırnak ile tek simge kullanılır.
		// 2byte
		char c5 = '@';

		// Dünyadaki bütün Alfabeler Char dizi ile oluşturulur.
		// ascii character (Unicode Character)
		char c4 = '\u4852';
		System.out.println(c4);
	}
}
