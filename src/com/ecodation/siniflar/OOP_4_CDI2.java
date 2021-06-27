package com.ecodation.siniflar;

import java.io.Serializable;
import java.util.Objects;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

//CDI: Application server olmak zorundadır: wildFly,TomEE,GlassFish,
//Web server çalışmaz: Apache tomcat,WampServer,Jetty
@Named(value = "cdiBean2")
@SessionScoped
public class OOP_4_CDI2 implements Serializable {
	private static final long serialVersionUID = 50555927138056034L;

	// field
	private int klavyeSayisi; // camel Case yazım sekli
	private String klavyeRengi;
	private int klavyeUretimYili;

	// parametresiz constructor
	public OOP_4_CDI2() {
		this.klavyeSayisi = 0;
		this.klavyeRengi = "Siyah";
		this.klavyeUretimYili = 2021;
	}

	// parametreli constructor
	public OOP_4_CDI2(int klavyeSayisi, String klavyeRengi, int klavyeUretimYili) {
		this.klavyeSayisi = klavyeSayisi;
		this.klavyeRengi = klavyeRengi;
		this.klavyeUretimYili = klavyeUretimYili;
	}

	// toString: Kimliktir.
	@Override
	public String toString() {
		return "OOP_4_CDI2 [klavyeSayisi=" + klavyeSayisi + ", klavyeRengi=" + klavyeRengi + ", klavyeUretimYili="
				+ klavyeUretimYili + "]";
	}

	// HashCode=Classların tam adresini belirtmek için
	@Override
	public int hashCode() {
		return Objects.hash(klavyeRengi, klavyeSayisi, klavyeUretimYili);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OOP_4_CDI2 other = (OOP_4_CDI2) obj;
		return Objects.equals(klavyeRengi, other.klavyeRengi) && klavyeSayisi == other.klavyeSayisi
				&& klavyeUretimYili == other.klavyeUretimYili;
	}

	// getter and setter
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
