package javaClassesAndObjects;

/**
 * 
		Write a class called Triangle that can be used to represent a triangle. 
		It should include the following methods that return boolean values indicating if the particular property holds:
		
		isRight (a right triangle)
		isScalene (no two sides are the same length)
		isIsosceles (exactly two sides are the same length)
		isEquilateral (all three sides are the same length)
		Write a simple tester program that creates a few triangles and asks them about their type.
		
		NOTE: Write appropriate TestCases.
		-------------------------------------------------------------------------------------------------------------------------------------------------------

 * 
 * @author shuraut
 *
 */
public class Triangle {

	private int side1,side2,side3;
	
	public Triangle(int side1, int side2, int side3) {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}

	public boolean isRight(){
		int hypotenuse=0;
		int additionOfSquareOfOtherSides=0;
		
		if(hypotenuse<side1){
			additionOfSquareOfOtherSides=side2*side2+side3*side3;
			hypotenuse=side1;
		}
		if(hypotenuse<side2){
			additionOfSquareOfOtherSides=side1*side1+side3*side3;
			hypotenuse=side2;
		}
		if(hypotenuse<side3){
			additionOfSquareOfOtherSides=side1*side1+side2*side2;
			hypotenuse=side3;
		}
		System.out.println(hypotenuse+" "+additionOfSquareOfOtherSides);
		return hypotenuse*hypotenuse==additionOfSquareOfOtherSides;
	}
	
	public boolean isScalene(){
		if(areAllSidesEqual(side1,side2,side3))		
			return false; //not a scalene triangle
		else  
			return true; // It is scalene triangle
	}
	boolean areAllSidesEqual(int... values) {
	    if (values.length < 2) {
	        return true;
	    }

	    for (int i = 1; i < values.length; i++) {
	        if (values[i]!=values[0]) {
	            return false;
	        }
	    }

	    return true;
	}

	
	public boolean isIsosceles(){
		
		if(areTwoSidesEqual(side1,side2,side3))
			return true;
		else
			return false;
	}

	boolean areTwoSidesEqual(int... values) {

		int count=1;
		
		if (values.length < 2) {
	        return true;
	    }

	    for (int i = 0; i < values.length; i++) {
	    	for(int j=i+1;j<values.length;j++){
	        if (values[i]==values[j]) {
	            count++;
	        }
	    	}
	    }
	    System.out.println("count values[0]"+count+"\t"+values[0]);
	    return count==2;
	}

	
	public boolean isEquilateral(){
		
		if(areAllSidesEqual(side1,side2,side3))		
			return true; //It is Equilateral Triangle
		else
			return false; // It is not Equilateral Triangle
		
	}
	
}
