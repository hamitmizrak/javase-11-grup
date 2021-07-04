package com.ecodation.inner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//inner class: iç class yani bütünlük sağlamak için iç içe classlara diyoruz.
// normalde 1 tane public class vardır ancak innerclassta istediğin kadar public class kullanabilirsin.
// normalde static class kullanamazsın ancak innerclassta kullanabiliriz
// Birden fazla class oluşturmak istemezsek innerClass kullanıyoruz.
//İç içe classlara inner class diyoruz.
//inner class yardımıyla multi kalıtım yapma imkanını sağlamış oluyoruz.
// Alt class üst classtan erişim sağlayabiliriz.

//4 tane inner class vardır
//static olan inner class
//static olmayan inner class
//Lokal inner class
//Anonymous(anonim) inner class

//Sınıf içerisinde sınıf oluşturulmaya denir. Yani iç içe sınıflara denir.
//Bir classı implements , extends etmek için kullanıyoruz. Amaç fazladan dosya ve sınıf oluşturmadan tek yapı üzerinde işlem yapmak ama karmaşıklığıda beraberinde getirir

@Data
@NoArgsConstructor
@AllArgsConstructor
// dış class
public class DisStaticClass {
	private String disClassAdi;
	private String disClassCode;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	// ic class
	static class IcStaticClass {
		private String icClassAdi;
		private String icClassCode;

		@Data
		@NoArgsConstructor
		@AllArgsConstructor
		// ic class
		static class IcStatic2Class {
			private String icClass2Adi;
			private String icClass2Code;

		}

	}

}
