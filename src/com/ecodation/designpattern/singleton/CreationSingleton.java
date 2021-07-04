package com.ecodation.designpattern.singleton;

public class CreationSingleton {

	// 1 tane new ile Class oluşturmaktır.
	// Keyword: constructor private , instance static olması,static metot
	// db connection için singletonDesignPattern
	// NOT: Aynı classın içinde new yazabilirsiniz

	// 1-) constructor private olması gerekiyor
	private CreationSingleton() {
	}

	// 2-)Class Değişkeni oluşturmak
	private static CreationSingleton instance;

	// 3-) static bir metot yazmak
	public static CreationSingleton getInstance() {

		if (instance == null) {
			instance = new CreationSingleton();
		}
		return instance;
	}
}
