package com.ecodation.composition;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//1
public class Yazar implements Serializable {
	private static final long serialVersionUID = -7788587443003871095L;

	// field
	private int yazarId;
	private String yazarAdi;
	private String yazarSoyadi;
	private Date yazarTarih;

	// composition
	private List<Kitap> kitapList;

	// parametresiz constructor
	public Yazar() {
		this.yazarTarih = new Date(System.currentTimeMillis());
	}

	// parametreli constructor
	public Yazar(int yazarId, String yazarAdi, String yazarSoyadi) {
		this.yazarId = yazarId;
		this.yazarAdi = yazarAdi;
		this.yazarSoyadi = yazarSoyadi;
	}

	// toString
	@Override
	public String toString() {
		return "Yazar [yazarId=" + yazarId + ", yazarAdi=" + yazarAdi + ", yazarSoyadi=" + yazarSoyadi + ", yazarTarih="
				+ yazarTarih + "]";
	}

	// getter and setter
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

	public Date getYazarTarih() {
		if (this.yazarTarih == null) {
			this.yazarTarih = new Date(System.currentTimeMillis());
		}
		return yazarTarih;
	}

	public void setYazarTarih(Date yazarTarih) {
		this.yazarTarih = yazarTarih;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// composition getter and setter
	public List<Kitap> getKitapList() {
		if (this.kitapList == null) {
			this.kitapList = new ArrayList<Kitap>();
		}
		return kitapList;
	}

	public void setKitapList(List<Kitap> kitapList) {
		this.kitapList = kitapList;
	}

}
