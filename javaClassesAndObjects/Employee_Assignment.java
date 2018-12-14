package javaClassesAndObjects;

/**
 * Attributes:
		Id
		name
		monthlyBasic
	
	Behaviours/Interfaces/Services: 
		getAnnualBasic() //(return 12 * monthlyBasic;)
		getMonthlyGrossSalary()//(monthlyBasic + hra + medical + conveyance)
		getAnnualGrossSalary() //(12 * MonthlyGrossSalary)
		getMonthlyDeductions() //(pf + esic + profTax)
		getMonthlyTakeHome() //(MonthlyGrossSalary- MonthlyDeductions)
		getAnnualTakeHome() //(12 * MonthlyTakeHome)
		setPFRate(float f)  and getPFRate()
	
	
	HRA = 50% of basic, medical allowance = Rs 1250, conveyance allowance = Rs 800
	PF = 10% of  monthly basic or 6500 whichever is lower.
	ESIC = 4.75% of monthly basic if monthly basic <= 5000
	professional tax: if monthly gross <= 10000 then Rs 50, else Rs 100
 * 
 * 
 * @author shuraut
 *
 */

public class Employee_Assignment {

	private int id;
	private String name;
	private double monthlyBasic;
	private static double pfRate=10;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMonthlyBasic() {
		return monthlyBasic;
	}

	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}
	public void setPFRate(double pfRate){
		Employee_Assignment.pfRate=pfRate;
	}
	public double getPFRate(){
		return pfRate;
	}
	
	public double  getAnnualBasic(){
		return 12*getMonthlyBasic();
	}
	
	public double getMonthlyGrossSalary(){
		double HRA=getMonthlyBasic()*50/100;
		double medicalAllowance=1250;
		double conveyanceAllowance=800;
		
		return getMonthlyBasic()+HRA+medicalAllowance+conveyanceAllowance;
	}
	
	public double getAnnualGrossSalary(){
		return 12*getMonthlyGrossSalary();
	}

	public double getMonthlyDeductions(){
		double PF=(getMonthlyBasic()*getPFRate()/100)<=6500 ? getMonthlyBasic()*getPFRate()/100:6500;
		double ESIC= getMonthlyBasic()<=5000 ? (getMonthlyBasic()*4.75/100):0;
		double professionalTax= getMonthlyGrossSalary()<=10000 ?50:100;
		return PF+ESIC+professionalTax;
	}

	public double getMonthlyTakeHome(){
		return getMonthlyGrossSalary()-getMonthlyDeductions();
	}

	public 	double getAnnualTakeHome()
	{
		return 12*getMonthlyTakeHome();
	}
	
	public static void main(String[] args) {

	}

}
