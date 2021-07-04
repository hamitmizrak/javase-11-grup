package com.ecodation.multithreadx;

public class CokluIslem extends Thread {

	private String className;

	@Override
	public void run() {
		// kodlarımızı buraya yazıyoruz.
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.print(this.className + i + " ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	// parametresiz constructor
	public CokluIslem() {
		// TODO Auto-generated constructor stub
	}

	// parametreli constructor
	public CokluIslem(String className) {
		this.className = className;
	}

	// getter and setter
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}
