package basicInheritanceAssignment1;

/**
 * 
 * 8) Define a parent class with one function. Define child class with the
 * function having same name as of parent class function, but having different
 * argument. Create an instance of child class and call the functions. Make sure
 * u have followed the concept of “function overloading “ in inheritance
 * 
 * 
 * @author shuraut
 *
 */

class Base{
	
	public void add(){
		System.out.println("Base Class");
	}
}

class Derived extends Base{
	@Override
	public void add(){
		System.out.println("Derived Class");
	}
	
}
public class FunctionOverloading {

	public static void main(String[] args) {
	
		Base b=new Derived();
		b.add();

	}

}
