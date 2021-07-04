package com.ecodation.abstractx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
abstract public class Kalem {

	protected int kalemId;
	protected String kalemAdi;
	protected String kalemFiyati;

	// gövdeli methd
	public void govdeliMethod() {
		System.out.println("Gövdeli metotum: " + this.kalemAdi);
	}

	// gövdesiz method
	abstract public void govdesizMethod();

}
