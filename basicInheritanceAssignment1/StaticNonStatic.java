package basicInheritanceAssignment1;

/**
 * 2) Create a class with static and non-static member variables. Define static
 * and non-static member functions. Create instance of this class and call both
 * static and non-static member functions.
 * 
 * @author shuraut
 *
 */
public class StaticNonStatic {

	public static int staticInt;
	public int nonStaticInt;
	
	public static void main(String[] args) {
		StaticNonStatic s=new StaticNonStatic();
		s.staticFunction();
		s.nonStaticFunction();

	}

	public static void staticFunction(){
		
	}
	
	public void nonStaticFunction(){
		
	}
	
	
}
