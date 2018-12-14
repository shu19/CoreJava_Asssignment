package javaClassesAndObjects;
/**
 * Write the definition for a class called Time that has hours and minutes as integer. The class has the following behaviours/services/methods:
	void setTime(int, int) to set the specified value in object
	void showTime() to display time object
	time sum(time) to sum two time object & return time
	1. Write the definitions for each of the above member functions.
	2. Write main function to create three time objects. Set the value in two objects and 
	call sum() to calculate sum and assign it in third object. Display all time objects.

 * @author shuraut
 *
 */
public class TimeAndHour {

	private int hours;
	private int minutes;
	
	public void setTime(int hours,int minutes){
		this.setHours(hours);
		this.setMinutes(minutes);
		
	}
	
	public TimeAndHour sum(TimeAndHour t1,TimeAndHour t2){
		
		TimeAndHour t=new TimeAndHour();
		t.setHours(t1.getHours()+t2.getHours());
		t.setMinutes(t1.getMinutes()+t2.getMinutes());
		return t;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

}
