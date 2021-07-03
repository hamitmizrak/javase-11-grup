package com.ecodation.ornekler;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ornekler_019_LombokBuilder {

	private int id;
	private String adi;
	private String soyadi;

	public static void main(String[] args) {
		Ornekler_019_LombokBuilder build = Ornekler_019_LombokBuilder.builder().adi("Hamit").soyadi("Mizrak").build();
		System.out.println(build);
	}

}
