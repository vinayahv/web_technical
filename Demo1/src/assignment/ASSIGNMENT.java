package assignment;

public class ASSIGNMENT {
	String name,grade,classes,section;
	int marks;
	void studentWriteHomeWork() {
		System.out.println(name+" "+"done home work");
	}
	void StudentWritesExam() {
		System.out.println("Student will write the exam and he got "+marks+" marks and he belongs to " +section+" section");
	}

	public static void main(String[] args) {
		ASSIGNMENT stud=new ASSIGNMENT();
		stud.name="Preetham";
		stud.grade="A";
		stud.classes="Fourth";
		stud.section="A";
		stud.marks=90;
		stud.studentWriteHomeWork();
		stud.StudentWritesExam();
		

	}

}
