package com.ecodation.inner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//inner class: iç class yani bütünlük sağlamak için iç içe classlara diyoruz.
// normalde 1 tane public class vardır ancak innerclassta istediğin kadar public class kullanabilirsin.
// normalde static class kullanamazsın ancak innerclassta kullanabiliriz
// Birden fazla class oluşturmak istemezsek innerClass kullanıyoruz.

@Data
@NoArgsConstructor
@AllArgsConstructor
// dış class
public class DisClass {
	private String disClassAdi;
	private String disClassCode;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	// ic class
	class IcClass {
		private String icClassAdi;
		private String icClassCode;
	}

}
