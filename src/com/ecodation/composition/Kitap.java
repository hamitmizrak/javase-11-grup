package com.ecodation.composition;

import java.io.Serializable;
import java.util.Date;

//N
public class Kitap implements Serializable {
	private static final long serialVersionUID = -8902845884299521304L;

	// field
	private int kitapId;
	private String kitapAdi;
	private String kitapFiyati;
	private Date kitapTarih;

	// composition
	private Yazar yazar;

	// parametresiz constructor
	public Kitap() {
		this.kitapTarih = new Date(System.currentTimeMillis());
	}

	// parametreli constructor
	public Kitap(int kitapId, String kitapAdi, String kitapFiyati) {
		this.kitapId = kitapId;
		this.kitapAdi = kitapAdi;
		this.kitapFiyati = kitapFiyati;
	}

	// toString
	@Override
	public String toString() {
		return "Kitap [kitapId=" + kitapId + ", kitapAdi=" + kitapAdi + ", kitapFiyati=" + kitapFiyati + ", kitapTarih="
				+ kitapTarih + ", yazar=" + yazar + "]";
	}

	// getter and setter
	public int getKitapId() {
		return kitapId;
	}

	public void setKitapId(int kitapId) {
		this.kitapId = kitapId;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public String getKitapFiyati() {
		return kitapFiyati;
	}

	public void setKitapFiyati(String kitapFiyati) {
		this.kitapFiyati = kitapFiyati;
	}

	public Date getKitapTarih() {
		return kitapTarih;
	}

	public void setKitapTarih(Date kitapTarih) {
		this.kitapTarih = kitapTarih;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// composition getter and setter
	public Yazar getYazar() {
		return yazar;
	}

	public void setYazar(Yazar yazar) {
		this.yazar = yazar;
	}

}
