package com.ecodation.siniflar;

public class Deneme {

	public static void main(String[] args) {
		OOP_1_POJO pojo = new OOP_1_POJO(); // instance=ornekleme

		// pojo OOP_1_POJO bu nesneden mi türetildi ?
		if (pojo instanceof OOP_1_POJO) {
			System.out.println("Evet");
		} else {
			System.out.println("hayır");
		}
	}

}
