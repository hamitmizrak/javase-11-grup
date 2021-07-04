package com.ecodation.optionalx;

import java.util.Optional;

import javax.validation.constraints.NotNull;

import lombok.NonNull;

@NonNull
@NotNull
public class OptionalClassX {

	// Java 8 gelen özelliklerdir.
	// Optional amaç: nullPointer istisna durumunu yaşamamak.
	// Hatırlatma: primitive type ==> null yazamazsın.
	// Referans Type,String,Özel classlar'da null yazabiliriz.

	public static void main(String[] args) {
		Integer value1 = null;
		Integer value2 = new Integer(25);

		// optional
		Optional<Integer> optional1 = Optional.ofNullable(value1); // içeriği null olabilir veya olmayabilir.
		Optional<Integer> optional2 = Optional.of(value2); // içi null olmasın

	}
}
