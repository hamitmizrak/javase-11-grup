package com.ecodation.dersler;

public class Ders_042_IkiBoyutluDiziler4 {
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
		matrix[1][2] = 7;
		matrix[2][0] = 8;
		matrix[2][1] = 9;
		matrix[2][2] = 9;
		matrix[2][3] = 9;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}
}
