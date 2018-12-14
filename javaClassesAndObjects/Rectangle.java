package javaClassesAndObjects;

/**
 * Consider a Rectangle Shape.
 * Identify its properties and behaviours and implement the same.
 * Write a Test Cases to check if the behaviours(methods) are implemented properly.
 * If their are 2 Rectangle objects of different sizes than we should be able to 
 * check if they are having same area or not.
 * Test the Program with different combinations test cases possible.
 * 
 * @author shuraut
 */
public class Rectangle {
	private int length;
	private int breadth;

	public Rectangle() {
	}

	public Rectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}


	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public double areaOfRectangle(){
		if(getLength()>=0 && getBreadth() >=0)
			return getLength()*getBreadth();
		else
			return 0;
	}

	public boolean isAreaOfTwoRectangleSame(Rectangle rectangle1,Rectangle rectangle2){
		return rectangle1.areaOfRectangle()==rectangle2.areaOfRectangle();
	}

}
