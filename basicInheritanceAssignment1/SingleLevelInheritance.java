package basicInheritanceAssignment1;

/**
 * 4)	Show the example of single level inheritance with constructor invocation.
 * 
 * @author shuraut
 *
 */

class A{
	public A() {
		System.out.println("Constructor - class A");
	}
}

class B extends A{
	public B() {
		System.out.println("Constructor - class B");
	}
}

public class SingleLevelInheritance {

	public static void main(String args[]){
		B b=new B();
	}
	
}
