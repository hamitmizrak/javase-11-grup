package com.ecodation.dersler;

public class Ders_040__static {
	// Field =durağan sabitlenmeyi sağlıyor. Ancak yeni bir alanda yenisi sabit oluyor. Ve classın bir parçasıdır artık.
	// Method =new oluşturmadan kullanabileceğimiz bir yapıdır. Ve böylelikle hafızada yer açmamış oluıyoruz.

	// Unutma: bir değişken static ise sadece o methodta static olan yapılar kullanarak erişilir.
	// Static örnek --- > Math.PI();
	// NOT:static class yoktur. (inner class hariç)

	public static void deneme() {
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		double pi = Math.PI; // statittir
		deneme();// static method
	}
}
