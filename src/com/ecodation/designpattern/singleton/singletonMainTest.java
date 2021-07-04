package com.ecodation.designpattern.singleton;

public class singletonMainTest {
	public static void main(String[] args) {
		CreationSingleton designSingleton = CreationSingleton.getInstance();
		System.out.println(designSingleton);
	}
}
