package com.ecodation.dersler;

public class Ders_042_IkiBoyutluDiziler5 {
	// Çift Boyutlu diziler: aynı türdeki verileri saklamak için kullanıyoruz.
	// Diziler: sıfırıncı indiste başlar
	// Dizilerde vermediğiniz değer yerine tam sayılarda sıfır(0) ataması yapar
	// Dizilerde vermediğiniz değer yerine virgüllü sayılarda sıfır(0.0) ataması yapar
	// Dizilerde vermediğiniz değer yerine String'te sayılarda null() ataması yapar
	// dizilerde eleman sayısı için dizi.length() ==> kullanalım.

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];

		matrix[0][0] = 0;
		matrix[0][1] = 1;
		matrix[0][2] = 2;
		matrix[0][3] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		matrix[1][3] = 7;
		matrix[2][0] = 8;
		matrix[2][1] = 9;
		matrix[2][2] = 9;
		matrix[2][3] = 9;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i > j) {
					System.out.print("*");
				}
				if (i < j) {
					System.out.print("+");
				}
				if (i == j) { // diagonal
					System.out.print("0");
				}
			}
			System.out.println();
		}

	}
}
