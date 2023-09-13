package com.dayeight.interfacesdemo;

public class NestedDemo implements OuterInterface.InnerInterface {

	@Override
	public void print() {
		System.out.println("Inner interface");
		
	}

}
