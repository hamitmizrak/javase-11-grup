package com.ecodation.siniflar;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "managementBean")
@SessionScoped
public class OOP_3_ManagementBean implements Serializable {

	private int klavyeSayisi; // camel Case yazım sekli
	private String klavyeRengi;
	private int klavyeUretimYili;

	public OOP_3_ManagementBean() {
		this.klavyeSayisi = 0;
		this.klavyeRengi = "Siyah";
		this.klavyeUretimYili = 2021;
	}

	public OOP_3_ManagementBean(int klavyeSayisi, String klavyeRengi, int klavyeUretimYili) {
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
