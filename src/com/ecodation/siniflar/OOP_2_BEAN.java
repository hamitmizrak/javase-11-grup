package com.ecodation.siniflar;

import java.io.Serializable;

//global degiskenler: Herkes tarafından erişilir.

//local degiskenler: Sadece o scope çalışır ==> {}

//ornek class
//Bean =  Pojo +parametreli-parametresiz-constructor
public class OOP_2_BEAN implements Serializable {
	// serileştirme verileri taşırken sağlıklı olmasını sağlar
	private static final long serialVersionUID = -7184503133199205234L;

	// Nesne degiskeni(Global Degiskenler)
	private int klavyeSayisi; // camel Case yazım sekli
	private String klavyeRengi;
	private int klavyeUretimYili;

	// Sinif olusturulduğunda ilk uğrama alanıdır
	// parametresiz constructor
	// this: Bu anlamına gelmektedir. 2 yerde kullanabiliriz.
	// 1-)global degiskenlere erişmek
	// 2-)bir başka constructorı çağırmak için kullanırız.
	// defaulttaki degerler
	// Ctrl+Space
	public OOP_2_BEAN() {
		this.klavyeSayisi = 0;
		this.klavyeRengi = "Siyah";
		this.klavyeUretimYili = 2021;
	}

	// parametreli constructor
	// Shift+Alt+S ==> Generate costructor using Field
	public OOP_2_BEAN(int klavyeSayisi, String klavyeRengi, int klavyeUretimYili) {
		this.klavyeSayisi = klavyeSayisi;
		this.klavyeRengi = klavyeRengi;
		this.klavyeUretimYili = klavyeUretimYili;
	}

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
