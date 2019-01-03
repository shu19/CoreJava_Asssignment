/**
 * 11) Accept the marks of three students for the subject say A, B, C. Find the
 * total scored and the average in all the subjects. Also Find the Total and
 * Average scored by students
 * 
 * @author shuraut
 *
 */
public class StudentsMarks {

	public static void main(String[] args) {

		Student student1 = new Student(60, 50, 90);
		System.out.println("Total marks of student 1 "
				+ student1.getTotalMarks() + "\n Average marks of student 1 "
				+ student1.getAverageMarks());
		Student student2 = new Student(60, 50, 90);
		System.out.println("Total marks of student 2 "
				+ student2.getTotalMarks() + "\n Average marks of student 2 "
				+ student2.getAverageMarks());
		Student student3 = new Student(60, 50, 90);
		System.out.println(" Total marks of student 3 "
				+ student3.getTotalMarks() + "\n Average marks of student 3  "
				+ student3.getAverageMarks());

		int totalMarksInSubjectA;
		totalMarksInSubjectA = student1.getSubjectA() + student2.getSubjectA()
				+ student3.getSubjectA();

		System.out
				.println("Total Marks in Subject A : " + totalMarksInSubjectA);
		System.out.println("Average Marks in Subject A : "
				+ totalMarksInSubjectA / 3);

		int totalMarksInSubjectB;
		totalMarksInSubjectB = student1.getSubjectB() + student2.getSubjectB()
				+ student3.getSubjectB();
		System.out
				.println("Total Marks in Subject B : " + totalMarksInSubjectB);
		System.out.println("Average Marks in Subject B : "
				+ totalMarksInSubjectB / 3);

		int totalMarksInSubjectC;
		totalMarksInSubjectC = student1.getSubjectC() + student2.getSubjectC()
				+ student3.getSubjectC();
		System.out
				.println("Total Marks in Subject C : " + totalMarksInSubjectC);
		System.out.println("Average Marks in Subject C : "
				+ totalMarksInSubjectC / 3);

	}

}

/**
 * @author shuraut
 *
 *	This class stores the information about student
 */
class Student {
	private int subjectA;
	private int subjectB;
	private int subjectC;

	public Student(int subjectA, int subjectB, int subjectC) {

		this.subjectA = subjectA;
		this.subjectB = subjectB;
		this.subjectC = subjectC;
	}

	public int getSubjectA() {
		return subjectA;
	}

	public void setSubjectA(int subjectA) {
		this.subjectA = subjectA;
	}

	public int getSubjectB() {
		return subjectB;
	}

	public void setSubjectB(int subjectB) {
		this.subjectB = subjectB;
	}

	public int getSubjectC() {
		return subjectC;
	}

	public void setSubjectC(int subjectC) {
		this.subjectC = subjectC;
	}

	public int getTotalMarks() {
		return subjectA + subjectB + subjectC;
	}

	public double getAverageMarks() {
		return (subjectA + subjectB + subjectC) / 3;
	}

}
