package com.ecodation.dersler;

public class Ders_019_Optional2 {

	private String adi;

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		if (adi == null) {
			this.adi = adi;
			System.out.println("adi alanı yazılmadı");
		} else {
			System.out.println("adi alanı yazıldı");
		}
	}

	public static void main(String[] args) {
		Ders_019_Optional2 temp = new Ders_019_Optional2();
		System.out.println(temp.getAdi());
	}
}
