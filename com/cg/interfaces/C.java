package com.cg.interfaces;

/**
 * Define interface "A" with "disp1()" method. Derive from "A", interface "B"
 * with "disp2" method. Derive class "C" , from "B". Instantiate class "C" and
 * call its members as well as derived from parent interfaces.
 * 
 * 
 * @author shuraut
 *
 */
interface A{
	public abstract void disp1();
}

interface B extends A{
	public void disp2();
}

public class C implements B{

	@Override
	public void disp1() {
		System.out.println("overriding method from Interface A");
	}

	@Override
	public void disp2() {
		System.out.println("overriding method from Interface B");
	}
	
	public void disp3(){
		System.out.println("Class C");
	}

	public static void main(String[] args) {
		C c=new C();
		c.disp1();
		c.disp2();
		c.disp3();
	}
}
