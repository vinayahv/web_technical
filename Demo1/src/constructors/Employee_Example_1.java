package constructors;

public class Employee_Example_1 {
	String emp_name;
	int emp_id;
	String emp_dept;
	double emp_salary;
	Employee_Example_1(String name,int id, String dept,double salary){
		emp_name=name;
		emp_id=id;
		emp_dept=dept;
		emp_salary=salary;
	
	}
	void displayEmpDetails() {
		System.out.println("Employee details are");
		System.out.println("Name= "+emp_name+" ID= "+emp_id+ " dept= "+emp_dept+" salary= "+emp_salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_Example_1 emp1=new Employee_Example_1("Amar",225,"purchase",7800.00);
		emp1.displayEmpDetails();
		Employee_Example_1 emp2=new Employee_Example_1("shruti",315,"Assembly",8500.00);
		emp2.displayEmpDetails();

	}

}
