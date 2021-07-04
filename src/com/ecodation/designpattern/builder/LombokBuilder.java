package com.ecodation.designpattern.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Lombok kütüphanesini kulanırsak
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LombokBuilder {
	// field
	private int yazarId;
	private String yazarAdi;
	private String yazarSoyadi;
	private String yazarDogumYeri;
	private java.util.Date tarih;

}
