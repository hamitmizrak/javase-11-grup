package com.ecodation.designpattern.builder;

import java.util.Date;

public class CreationBuilderDegilseeeeeeee {

	// field
	private int yazarId;
	private String yazarAdi;
	private String yazarSoyadi;
	private String yazarDogumYeri;
	private java.util.Date tarih;

	// parametresiz constructor
	public CreationBuilderDegilseeeeeeee() {
		// TODO Auto-generated constructor stub
	}

	// parametreli constructor
	public CreationBuilderDegilseeeeeeee(int yazarId) {
		this.yazarId = yazarId;
	}

	public CreationBuilderDegilseeeeeeee(String yazarAdi, String yazarSoyadi) {
		this.yazarAdi = yazarAdi;
		this.yazarSoyadi = yazarSoyadi;
	}

	public CreationBuilderDegilseeeeeeee(String yazarDogumYeri) {
		this.yazarDogumYeri = yazarDogumYeri;
	}

	public CreationBuilderDegilseeeeeeee(int yazarId, String yazarAdi, String yazarSoyadi) {
		this.yazarId = yazarId;
		this.yazarAdi = yazarAdi;
		this.yazarSoyadi = yazarSoyadi;
	}

	public CreationBuilderDegilseeeeeeee(String yazarAdi, String yazarDogumYeri, int yazarId) {
		this.yazarId = yazarId;
		this.yazarAdi = yazarAdi;
		this.yazarDogumYeri = yazarDogumYeri;
	}

	// toString
	@Override
	public String toString() {
		return "CreationBuilderDegilseeeeeeee [yazarId=" + yazarId + ", yazarAdi=" + yazarAdi + ", yazarSoyadi="
				+ yazarSoyadi + ", yazarDogumYeri=" + yazarDogumYeri + ", tarih=" + tarih + "]";
	}

	// getter setter

	public int getYazarId() {
		return yazarId;
	}

	public void setYazarId(int yazarId) {
		this.yazarId = yazarId;
	}

	public String getYazarAdi() {
		return yazarAdi;
	}

	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}

	public String getYazarSoyadi() {
		return yazarSoyadi;
	}

	public void setYazarSoyadi(String yazarSoyadi) {
		this.yazarSoyadi = yazarSoyadi;
	}

	public String getYazarDogumYeri() {
		return yazarDogumYeri;
	}

	public void setYazarDogumYeri(String yazarDogumYeri) {
		this.yazarDogumYeri = yazarDogumYeri;
	}

	public java.util.Date getTarih() {
		if (this.tarih == null)
			return new Date(System.currentTimeMillis());
		return tarih;
	}

	public void setTarih(java.util.Date tarih) {
		this.tarih = tarih;
	}

}
