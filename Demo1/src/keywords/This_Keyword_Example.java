package keywords;
class Student{
	String stName;
	String stSchool;
	int stGrade;

Student(String stName){
	this.stName=stName;  //this.stName- refers to member data of current object // stName- refers to argument
}

Student(String stName, String stSchool){
	this(stName);             //Here "this" is referring constructor
	this.stSchool=stSchool;   // calling the constructor
}
Student(String stName,String stSchool,int stGrade){
	this(stName,stSchool);
	this.stGrade=stGrade;
}
void display() {
	System.out.println(this.stName+"is studying in"+this.stSchool);
}
	void message() {
		this.display();
	}

public String toString() {  //overriding toString method of object class
	return stName+stSchool+stGrade;	
}
}
public class This_Keyword_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Simha ");
		System.out.println(s1);          //data taken from toString() method
		Student s2=new Student("Karthik ","Myschool ");
		System.out.println(s2);
		Student s3=new Student("Vishnu ","Ourschool ",12);
		System.out.println(s3);
	}

}
