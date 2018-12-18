package basicInheritanceAssignment1;

/**
 * 5)	Show the example of multi-level inheritance with constructor invocation.
 * 
 * @author shuraut
 *
 */

class P{
	public P() {
		System.out.println("Constructor - class P");
	}
}

class Q extends P{
	public Q() {
		System.out.println("Constructor - class Q");
	}
}

class R extends Q{
	public R() {
		System.out.println("Constructor - class R");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
	
		
		R r=new R();
		
		

	}

}
