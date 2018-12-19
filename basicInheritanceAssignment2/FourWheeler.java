package basicInheritanceAssignment2;

/**
 * 
 * create a class "Vehicle", define a method "public void start()" in it. From
 * this class derive a class FourWheeler. Override "start()" method of parent
 * class and test it.
 * 
 * @author shuraut
 *
 */

class Vehicle {
	public void start() {
		System.out.println("Vehicle");
	}
}

public class FourWheeler extends Vehicle {

	@Override
	public void start() {
		super.start();		
	}

	public static void main(String[] args) {

		System.out.println();
	}

}
