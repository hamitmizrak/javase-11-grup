package com.ecodation.designpattern.builder;

import java.util.Date;

public class CreationBuilder {
	// field
	private int yazarId;
	private String yazarAdi;
	private String yazarSoyadi;
	private String yazarDogumYeri;
	private java.util.Date tarih;

	// parametreli constructor
	public CreationBuilder(Builder builder) {
		this.yazarId = builder.yazarId;
		this.yazarAdi = builder.yazarAdi;
		this.yazarSoyadi = builder.yazarSoyadi;
		this.yazarDogumYeri = builder.yazarDogumYeri;
		this.tarih = builder.tarih;
	}

	// nested class
	// Normalde Javada static class yazamazsınız ancak inner classlar haric
	public static class Builder {
		private int yazarId;
		private String yazarAdi;
		private String yazarSoyadi;
		private String yazarDogumYeri;
		private java.util.Date tarih;

		// parametresiz constructor
		public Builder() {
		}

		public Builder yazarId(int yazarId) {
			this.yazarId = yazarId;
			return this;
		}

		public Builder yazarAdi(String yazarAdi) {
			this.yazarAdi = yazarAdi;
			return this;
		}

		public Builder yazarSoyadi(String yazarSoyadi) {
			this.yazarSoyadi = yazarSoyadi;
			return this;
		}

		public Builder yazarDogumYeri(String yazarDogumYeri) {
			this.yazarDogumYeri = yazarDogumYeri;
			return this;
		}

		public Builder tarih(Date tarih) {
			this.tarih = tarih;
			return this;
		}

		public CreationBuilder build() {
			return new CreationBuilder(this);
		}

	}

	@Override
	public String toString() {
		return "CreationBuilder [yazarId=" + yazarId + ", yazarAdi=" + yazarAdi + ", yazarSoyadi=" + yazarSoyadi
				+ ", yazarDogumYeri=" + yazarDogumYeri + ", tarih=" + tarih + "]";
	}

}
