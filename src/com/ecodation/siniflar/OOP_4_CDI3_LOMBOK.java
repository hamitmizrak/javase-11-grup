package com.ecodation.siniflar;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Named(value = "cdiBean3")
@SessionScoped

@Data // GetterAndSetter ,ToString , HashCode, Equals
@NoArgsConstructor
@AllArgsConstructor

public class OOP_4_CDI3_LOMBOK implements Serializable {
	private static final long serialVersionUID = 50555927138056034L;

	private int klavyeSayisi;
	private String klavyeRengi;
	private int klavyeUretimYili;

}
