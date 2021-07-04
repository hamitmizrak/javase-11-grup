package com.ecodation.abstractx;

public class KalemMainTest {

	public static void main(String[] args) {
		Kalem kalem = new TukenmezKalem(); // polymorphism
		kalem.setKalemId(10);
		kalem.setKalemAdi("kalem  asd");
		kalem.setKalemFiyati("4500");
		kalem.govdeliMethod();// polymorphism
		kalem.govdesizMethod(); // gövdesiz method
		System.out.println(kalem);

		System.out.println("*****************************************************************************");
		TukenmezKalem tukenmezKalem = new TukenmezKalem();
		tukenmezKalem.setKalemId(10);
		tukenmezKalem.setKalemAdi("Tukenmez  854");
		tukenmezKalem.setKalemFiyati("4500");
		System.out.println(tukenmezKalem);
		tukenmezKalem.govdeliMethod();// polymorphism
		tukenmezKalem.govdesizMethod(); // gövdesiz method

		System.out.println("*****************************************************************************");
		DolmaKalem dolmaKalem = new DolmaKalem();
		dolmaKalem.setKalemId(10);
		dolmaKalem.setKalemAdi("DolmaKalem  785");
		dolmaKalem.setKalemFiyati("1200");
		System.out.println(dolmaKalem);
		dolmaKalem.govdeliMethod();// polymorphism
		dolmaKalem.govdesizMethod(); // gövdesiz method

		System.out.println("*****************************************************************************");

		UcluKalem ucluKalem = new UcluKalem();
		ucluKalem.setKalemId(10);
		ucluKalem.setKalemAdi("UcluKalem  asd85");
		ucluKalem.setKalemFiyati("500");
		System.out.println(ucluKalem);
		ucluKalem.govdeliMethod();// polymorphism
		ucluKalem.govdesizMethod(); // gövdesiz method
		System.out.println("*****************************************************************************");

		if (ucluKalem instanceof Kalem) {
			System.out.println("Evet kalemden Türetildi");
		} else {
			System.out.println("Hayırrrrr kalemden Türetilmediiiii");
		}

	}

}
