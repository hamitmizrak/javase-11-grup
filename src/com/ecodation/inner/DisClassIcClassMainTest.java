package com.ecodation.inner;

import com.ecodation.inner.DisStaticClass.IcStaticClass;
import com.ecodation.inner.DisStaticClass.IcStaticClass.IcStatic2Class;

public class DisClassIcClassMainTest {

	public static void main(String[] args) {

		// static olmayan Dış iç class
		DisClass disClass = new DisClass("dış class-A", "dış class code");
		System.out.println(disClass);
		// static omayan iç claslarda mutlaka dış class new yapmamız gerekiyor
		DisClass.IcClass icClass = disClass.new IcClass("iç class-A", "iç class code-A");
		System.out.println(icClass);

		System.out.println("*****************************************************************");
		// static olan
		DisStaticClass disStatic = new DisStaticClass("dış  class-B", "dış class code-B");
		System.out.println(disStatic);
		// static olan iç claslarda dış classa new yapmamıza gerek yokturrrrrr.
		IcStaticClass icStaticClass = new IcStaticClass("icStaticClassAdi", "icStaticClassCode");
		System.out.println(icStaticClass);

		IcStatic2Class icStatic2Class = new IcStatic2Class("icStaticClassAdi2", "icStaticClassCode2");
		System.out.println(icStatic2Class);

	}

}
