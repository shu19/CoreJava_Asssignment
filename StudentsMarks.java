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

class Student {
	private int SubjectA;
	private int SubjectB;
	private int SubjectC;

	public Student(int subjectA, int subjectB, int subjectC) {

		SubjectA = subjectA;
		SubjectB = subjectB;
		SubjectC = subjectC;
	}

	public int getSubjectA() {
		return SubjectA;
	}

	public void setSubjectA(int subjectA) {
		SubjectA = subjectA;
	}

	public int getSubjectB() {
		return SubjectB;
	}

	public void setSubjectB(int subjectB) {
		SubjectB = subjectB;
	}

	public int getSubjectC() {
		return SubjectC;
	}

	public void setSubjectC(int subjectC) {
		SubjectC = subjectC;
	}

	public int getTotalMarks() {
		return SubjectA + SubjectB + SubjectC;
	}

	public double getAverageMarks() {
		return (SubjectA + SubjectB + SubjectC) / 3;
	}

}
