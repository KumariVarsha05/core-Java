package com.dayfour.secondpackage;

import com.dayfour.firstpackage.Base;

public class Executor {

	public static void main(String[] args) {
		//accessing Another package class

		Base b = new Base();
		b.varPublic=90;
		b.methodPublic();
		b.access();

	}

}
