package com.ecodation.multithreadx;

public class MainThread3 {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// kodlarımızı buraya yazıyoruz.
				for (int i = 1; i <= 10; i++) {
					try {
						Thread.sleep(1000);
						System.out.print(i + " ");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}
		});

		thread.start();

	}
}
