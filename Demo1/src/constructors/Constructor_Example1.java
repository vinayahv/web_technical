package constructors;

public class Constructor_Example1 {
	
	String stud_name;
	int stud_id;
	int stud_grade;
	String stud_school;
	Constructor_Example1(){
		System.out.println("A student object is created");
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_Example1 c1=new Constructor_Example1();
		//System.out.println(" job is done");
		System.out.println(c1);
		c1.stud_name="Vikram";
		c1.stud_id=155;
		c1.stud_grade=8;
		c1.stud_school="My school";
		System.out.println(c1.stud_name);
		System.out.println(c1.stud_id);
		System.out.println(c1.stud_grade);
		System.out.println(c1.stud_school);
			}
	}