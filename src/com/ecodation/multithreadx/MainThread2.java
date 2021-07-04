package com.ecodation.multithreadx;

public class MainThread2 {

	public static void main(String[] args) throws InterruptedException {
		// instance=örnekleme
		CokluIslem cokluIslem = new CokluIslem("A");
		CokluIslem cokluIslem2 = new CokluIslem("B");
		CokluIslem cokluIslem3 = new CokluIslem("C");

		cokluIslem.start();
		// Not: Diğer startlardan önce yazılması gerekir.
		cokluIslem.join();

		cokluIslem2.start();
		cokluIslem3.start();

		// 2.emre kadar dur
		// cokluIslem2.wait();
		// 2.emir geldi artık kalk
		// cokluIslem2.notify();

	}
}
