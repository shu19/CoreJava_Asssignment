package basicInheritanceAssignment1;

/**
 * 
 * 1) Define 2 classes “First” and “Second” with member variables , member
 * functions and constructors of your choice. Now define a class “Two” in which
 * define main function . In main function create various instances of First and
 * Second and call their individual member functions.
 * 
 * @author shuraut
 *
 */

class First{
	int id;
	String name;
	
	public First(int id,String name) {
		this.id=id;
		this.name=name;		
	}
	
	public void changeName(String name){
		this.name=name;
	}
	
}

class Second{
	int a;
	String b;
	
	public Second(int a,String b) {
		this.a=a;
		this.b=b;
	}
	
	public String disp(){
		return a+"\t"+b;
	}
}
public class Two {

	public static void main(String[] args) {

		First f1=new First(101, "Shubham");
		System.out.println(f1.id+"\t"+f1.name);
		
		First f2=new First(102, "Rohan");
		System.out.println(f2.id+"\t"+f2.name);
		
		First f3=new First(103, "Tejas");
		System.out.println(f3.id+"\t"+f3.name);
		f3.changeName("Tushar");
		System.out.println(f3.id+"\t"+f3.name);
		
		Second s1=new Second(1, "abc");
		System.out.println(s1.disp());
		Second s2=new Second(2, "pqr");
		System.out.println(s2.disp());;
		Second s3=new Second(3, "xyz");
		System.out.println(s3.disp());
		
		
	}

}
