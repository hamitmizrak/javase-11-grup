package com.ecodation.dersler;

public class Ders_008_String {

	public static void main(String[] args) {
		// String'ler Çift tırnak içinde yazılması gerekiyor.
		// String'ten==> tam sayıya çevirebiliyoruz bazende tam sayıdan==> String'e çevirmek zorunda kalabiliyoruz.
		// String :Kelimeler üzerinden işlem yapmamıza yardımcı olur (Database, Servisler)

		String kelime = "Java SpringBoot,Jsp ,JSF, Servet , Hibernate ";
		System.out.println(kelime);

		// length(): Kelimedeki harf sayısını verir
		System.out.println("Harf sayısı:" + kelime.length());

		// trim(): Kesme işlemi yapar. yani Kelimenin başında ve sonundaki boşukları keser.
		System.out.println("Trim: " + kelime.trim().length());

		// concat(): Kelimenin sonuna yeni bir yazı yazmak istiyorsak bunu kullanırız.
		System.out.println("Sonuna yeni harfler eklendi" + kelime.concat("Jsp").concat(" Jsf"));

		// upperCase():Bütün harfleri BÜYÜK harflere çevirir.
		System.out.println(kelime.toUpperCase());

		// lowerCase():Bütün harfleri küçük harflere çevirir.
		System.out.println(kelime.toLowerCase());

		// startsWith: bu harfle başlıyor munun cevabını verir. Başlıyorsa true değilse false
		boolean result = kelime.startsWith("J");
		if (result) {
			System.out.println("Evet J ile başlıyor");
		} else {
			System.out.println("Hayır J ile başlamıyor");
		}

		// endsWith: bu harfle bitimiyor munun cevabını verir.Bitiyorsa true değilse false
		System.out.println(kelime.endsWith((" ")));

		// replace(): kelime içindeki cümleleri değiştirmek için kullanıyoruz.
		System.out.println(kelime.replace(kelime, "Java SpringBoot JSF JSP "));

		// subString()==> Kelimeleri parçalamak istediğimizde kullanıyoruz.
		// subString'ler 0(sıfır) indisinden başlar
		System.out.println(kelime.substring(1)); // başlangıç ve devamı
		// subString(1,4)==>1=başlangıç (4-1)=3 bitiş
		System.out.println(kelime.substring(0, 4)); // başlangıç ve bitişi gösteriyor

		// equals() ==> Bir kelime ile başka bir kelime eşit mi cevabını verir.
		boolean esitMi = kelime.equals("Java SpringBoot ");
		System.out.println(esitMi);
		// Sayılarda: == kullanalım. Kelimelerde: equals() kullanalım.
		String sayi = (3 == 3) ? "eşittir" : "değildir"; // Ternary
		System.out.println(sayi);

		// contains(): Kelimenin içerisindeki istenen kelime aranmak için kullanılır.
		String varMi = kelime.contains("Hamit") ? "var" : "yok";
		System.out.println(varMi);

		// isEmpty():Boş mu, dolumu mu ?cevabını verir.
		// Eğer birşey yoksa true, varsa false
		System.out.println("boş mu ?" + kelime.isEmpty());

		// char() ==> Kelimenini içindeki harflere ulaşmak için kullanıyoruz.
		// kelime.char(0) ==> Buradaki Sıfır(0) demek ilk harfi bana dönder.
		// Dikkat: char()==> indisi sıfırdan başlar
		System.out.println(kelime.charAt(0));

		// indexOf() ==> Harf veriyoruz Başından itibaran bunun kelimede kaçıncı sayıda olduğunu verir.
		// arama işlemlerinden kullanıyoruz.
		System.out.println(kelime.indexOf("J"));

		// lastIndexOf() ==> Harf veriyoruz Sonundan itibaran bunun kelimede kaçıncı sayıda olduğunu verir.
		// arama işlemlerinden kullanıyoruz.
		System.out.println(kelime.lastIndexOf("a"));

		System.out.println("///////////////////////////////////////////////////////////////");
		// String'te parçalama işlemleri için kullanıyoruz.
		// Dikkat: String dizisi içinde olması gerekiyor.
		// Java SpringBoot,Jsp ,JSF, Servet , Hibernate
		String[] parcala = kelime.split(",");
		for (String temp : parcala) {
			System.out.println(temp);
		}

	}
}
