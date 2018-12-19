package basicInheritanceAssignment1;

/**
 * 9) Define a class “Shape” with “draw()” function . Now derive classes like
 * “Circle”, “Polygon”,”Rectangle” etc. from “Shape” and override “draw()”
 * function. Define a class “ShapeDemo” in which write main() function. In the
 * main function create a reference to Shape class referring to any of the sub
 * class. Using this reference, call “draw()” and check the result.
 * 
 * @author shuraut
 *
 */
class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

class Polygon extends Shape {
	@Override
	public void draw() {
		System.out.println("Polygon");
	}
}

class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Rectangle");
	}
}

public class ShapeDemo {

	public static void main(String[] args) {

		Shape circle=new Circle();
		circle.draw();
		
		Shape polygon= new Polygon();
		polygon.draw();
		
		Shape rectangle=new Rectangle();
		rectangle.draw();
		
		
	}

}
