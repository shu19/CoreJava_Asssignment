package javaClassesAndObjects;

/**
 * 
	This problem has several parts:
	
	1. Write a simple Vehicle class that has fields for (at least) current speed, current direction in degrees, and owner name.
	2. Add a static field to your Vehicle class for the highest Vehicle Identification Number issued, and a non-static field that holds each vehicle's ID number.
	3. Write a main method for your Vehicle class that creates a few vehicles and prints out their field values. Note that you can also write a separate tester program as well.
	4. Add two constructors to Vehicle. A no-arg constructor and one that takes an initial owner's name. Modify the tester program from the previous step and test your design.
	5. Make the fields in your Vehicle class private, and add accessor methods for the fields. Which fields should have methods to change them and which should not?
	6. Add a changeSpeed method that changes the current speed of the vehicle to a passed-in value, and a stop method that sets the speed to zero.
	7. Add two turn methods to Vehicle. One that takes a number of degrees to turn, and one that takes simply either a Vehicle.TURN_LEFT or a Vehicle.TURN_RIGHT constant. Define the two constants accordingly.
	8. Add a static method to Vehicle that returns the highest identification number used so far.
	9. Add a toString method to Vehicle.
	10. Now Test all of the above in a main method that will be in saperate class.

 * 
 * @author shuraut
 *
 */


public class Vehicle {

	private int currentSpeed;
	private float currentDirection;
	private String ownerName;

	private int vehicleIdentificationNumber;
	private int vehicleId;

	public static final String NORTH_DIRECTION="North";
	public static final String EAST_DIRECTION="East";
	public static final String WEST_DIRECTION="West";
	public static final String SOUTH_DIRECTION="South";
	
	private String direction=NORTH_DIRECTION;
	private static int highestIdentificationNumber;

	public static final int TURN_LEFT=-1;
	public static final int TURN_RIGHT=1;
	
	public Vehicle() {
		vehicleIdentificationNumber=highestIdentificationNumber++;
	}

	public Vehicle(String ownerName) {
		this.setOwnerName(ownerName);
		vehicleIdentificationNumber=highestIdentificationNumber++;
	}

	public void changeSpeed(int newSpeed){
		if(newSpeed>=0){
			this.currentSpeed=newSpeed;
		}else{
			this.currentSpeed=0;
		}		
	}
	
	public void stop(){
		this.currentSpeed=0;
	}

	public void turn(float degreesToTurn ,int direction){
		if(TURN_LEFT==direction){
			this.currentDirection=degreesToTurn;
			this.setDirection(WEST_DIRECTION);
		}else if(TURN_RIGHT==direction)
		{
			this.currentDirection=degreesToTurn;
			this.setDirection(EAST_DIRECTION);
		}
		
	}
	
	
	
	public static int getHighestIdentificationNumber(){
		return highestIdentificationNumber;
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public float getCurrentDirection() {
		return currentDirection;
	}
	public void setCurrentDirection(float currentDirection) {
		this.currentDirection = currentDirection;
	}

	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getVehicleIdentificationNumber() {
		return vehicleIdentificationNumber;
	}
	public void setVehicleIdentificationNumber(int vehicleIdentificationNumber) {
		this.vehicleIdentificationNumber = vehicleIdentificationNumber;
	}

	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	@Override
	public String toString() {
		return "Vehicle [currentSpeed=" + currentSpeed + ", currentDirection="
				+ currentDirection + ", ownerName=" + ownerName
				+ ", vehicleIdentificationNumber="
				+ vehicleIdentificationNumber + ", vehicleId=" + vehicleId
				+ "]";
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * Add two turn methods to Vehicle. One that takes a number of degrees to turn, 
	 * and one that takes simply either a Vehicle.TURN_LEFT or a Vehicle.TURN_RIGHT constant. 
	 * Define the two constants accordingly.
	 */
	
}
