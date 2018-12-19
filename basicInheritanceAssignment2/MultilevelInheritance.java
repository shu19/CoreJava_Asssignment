package basicInheritanceAssignment2;

/**
 * 
 * Create a multi-level inheritance , instantiate the child class and observe
 * constructor invocation.Also show, if needed how will u invoke parent class
 * constructor from child class ?
 * 
 * @author shuraut
 *
 */

class A extends Object{
	public A() {
		System.out.println("Class A constructor");
	}
}

class B extends A {
	public B() {
		System.out.println("Class B constructor");
	}
}

class C extends B {
	public C() {
		System.out.println("Class C constructor");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
			
		A a=new C();
		
		
	}
}
