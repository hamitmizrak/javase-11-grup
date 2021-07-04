package com.ecodation.multithreadx;

public class MainThread1 {

	public static void main(String[] args) {
		// instance=örnekleme
		CokluIslem cokluIslem = new CokluIslem("A");
		CokluIslem cokluIslem2 = new CokluIslem("B");

		System.out.println("ID: " + cokluIslem.getId());
		System.out.println("Name: " + cokluIslem.getName());
		cokluIslem.setName("Process-1");
		System.out.println("Name: " + cokluIslem.getName());
		System.out.println("Class Name:" + cokluIslem.getClass());
		System.out.println(cokluIslem.getPriority());
		// if (cokluIslem.isAlive()) {
		// System.out.println("Yaşıyor");
		// }
		// cokluIslem.destroy();
		// cokluIslem.
		// cokluIslem.
		// cokluIslem.

		cokluIslem.start();
		cokluIslem2.start();

	}
}
