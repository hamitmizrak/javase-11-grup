package com.ecodation.dersler;

import java.util.StringTokenizer;

public class Ders_015_Parcalama {

	public static void main(String[] args) {
		// Nesneleri parçalama için birden fazla yöntem vardır.
		String kelime = "Malatya Jsp JSF, Servlet JavaEE. Hibernate Html-css-js-jquery-bootstrap-responsive Angular12";

		// 1.Yöntem (Split)
		String[] dizi = kelime.split(" ");
		for (Object temp : dizi) {
			System.out.println(temp);
		}

		System.out.println("**************************************");

		// 2.yöntem StringTokenizer
		StringTokenizer stringTokenizer = new StringTokenizer(kelime, " ");
		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}

	}
}
