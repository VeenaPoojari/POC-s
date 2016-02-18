package com;

public class Test {
	public static void main(String[] args) {
		System.out.println("Creating class objects...");
		A a = new A();
		a.add();a.m1();
		System.out.println("-------------------");
		B b =new B();
		b.add();b.m1();b.m2();
		System.out.println("Creating objects by reference...");
		A ab = new B();
		ab.add();
		ab.m1();
		
		/*B ba = (B)new A();
		ba.add();*/
		
		a = b;
		a.add();
		
		b = (B) a;
		b.add();
	}
}
