package basicInheritanceAssignment1;

/**
 * 10) Modify “ShapeDemo” class created in above assignment #9 to create an
 * array of Shape class. In this array store instances of the sub classes.
 * Traverse through the array and call “draw()” and check the result.
 * 
 * @author shuraut
 *
 */

public class ShapeDemoArray {

	public static void main(String[] args) {
		
		Shape shapes[]={
				new Circle(),
				new Polygon(),
				new Rectangle()
		};
		
		for (int index=0;index<shapes.length;index++){
			shapes[index].draw();
		}
	}

}
