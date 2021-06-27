package com.ecodation.siniflar;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

//CDI: Application server olmak zorundadır: wildFly,TomEE,GlassFish,
//Web server çalışmaz: Apache tomcat,WampServer,Jetty
@Named(value = "cdiBean")
@SessionScoped
public class OOP_4_CDI implements Serializable {
	private static final long serialVersionUID = 50555927138056034L;

	private int klavyeSayisi; // camel Case yazım sekli
	private String klavyeRengi;
	private int klavyeUretimYili;

	public OOP_4_CDI() {
		this.klavyeSayisi = 0;
		this.klavyeRengi = "Siyah";
		this.klavyeUretimYili = 2021;
	}

	public OOP_4_CDI(int klavyeSayisi, String klavyeRengi, int klavyeUretimYili) {
		this.klavyeSayisi = klavyeSayisi;
		this.klavyeRengi = klavyeRengi;
		this.klavyeUretimYili = klavyeUretimYili;
	}

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
