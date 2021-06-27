package com.ecodation.siniflar;

//global degiskenler: Herkes tarafından erişilir.

//local degiskenler: Sadece o scope çalışır ==> {}

//ornek class
//Pojo = değişkenler +getter and setter
public class OOP_1_POJO {

	// Nesne degiskeni(Global Degiskenler)
	private int klavyeSayisi; // camel Case yazım sekli
	private String klavyeRengi;
	private int klavyeUretimYili;

	// getter setter
	// encapculation'de yani Access identifier yani erişim belirleyici: private
	// Shift+Alt+S ==> Generate Getter and Setters
	public int getKlavyeSayisi() {
		return klavyeSayisi;
	}

	public void setKlavyeSayisi(int klavyeSayisi) {
		this.klavyeSayisi = klavyeSayisi;
	}

	public String getKlavyeRengi() {
		return klavyeRengi;
	}

	public void setKlavyeRengi(String klavyeRengi) {
		this.klavyeRengi = klavyeRengi;
	}

	public int getKlavyeUretimYili() {
		return klavyeUretimYili;
	}

	public void setKlavyeUretimYili(int klavyeUretimYili) {
		this.klavyeUretimYili = klavyeUretimYili;
	}

}
