package com.ecodation.dersler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Ders_019_Optional3 {

	public static void main(String[] args) {
		// of() ==> Optional olmayan bir yapıyı Optional'e çevirmek için kullanıyoruz.
		Optional<String> result0 = Optional.of("");

		// ofNullable() ==> Optional olmayan bir yapıyı Optional'e çevirmek için kullanıyoruz.Dikkat: değer içi boş
		// olabilirde olmayabilirde.
		String temp = null;
		// String temp = "";
		Optional<String> result001 = Optional.ofNullable(temp);

		// get()
		Optional<String> result = Optional.of("Java Kelimesi");
		System.out.println(result.get());

		// empty ==> Optional türde bir nesne üretmek istersek kullanıyoruz ancak içi boş
		Optional<String> result2 = Optional.empty();
		System.out.println(result2);

		// ifPresent ==>Eğer önceden Optional türde bir nesne ise çalışmasına izin verilir.
		List<String> liste = new ArrayList<String>();
		liste.add("Java");
		liste.add("Malatya");
		Optional<List<String>> result3 = Optional.of(liste);
		// result3.ifPresent();

		// isPresent() ==> Eğer Optional nesne null ise false , yoksa true döner.
		Optional<String> result4 = Optional.of("");
		System.out.println(result4.get());
		System.out.println(result4.isPresent());

		// map ==> Optional objemizde çalışmamızı sağlayan metottur.
		Optional<String> result5 = Optional.of("Java jsp JSf SpRIng Boot");
		System.out.println(result5.get());
		System.out.println(result5.map(String::toUpperCase));

	}
}
