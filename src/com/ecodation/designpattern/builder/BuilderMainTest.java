package com.ecodation.designpattern.builder;

public class BuilderMainTest {

	public static void main(String[] args) {
		CreationBuilderDegilseeeeeeee build1 = new CreationBuilderDegilseeeeeeee(1, "Java", "sun");
		System.out.println(build1);

		System.out.println("***************************************************************************");

		LombokBuilder build2 = new LombokBuilder.LombokBuilderBuilder().yazarAdi("Deneme").build();
		System.out.println(build2);

		System.out.println("***************************************************************************");

		CreationBuilder build3 = new CreationBuilder.Builder().yazarAdi("Deneme").build();
		System.out.println(build3);

	}
}
