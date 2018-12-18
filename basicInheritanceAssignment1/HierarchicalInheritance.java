package basicInheritanceAssignment1;

/**
 * 6) Show the example of hierarchical inheritance with constructor invocation.
 * 
 * @author shuraut
 *
 */
class Parent {
	public Parent() {
		System.out.println("Constructor - class Parent");
	}
}

class ChildOne extends Parent {
	public ChildOne() {
		System.out.println("Constructor - class ChildOne");
	}
}

class ChildTwo extends Parent {
	public ChildTwo() {
		System.out.println("Constructor - class ChildTwo");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {

			ChildOne c1=new ChildOne();
			
			ChildTwo c2=new ChildTwo();
	}

}
