package AssignmentPrograms;

class Emp{
	double basic=20000;
	double HRA=120;
	int MR=321;
	int CONU=26;
	Emp(double basic,int HRA,int MR,int CONU){
		
	}
	double salary() {
		HRA=0.4*basic;
		double d=basic+HRA+MR+CONU;
		return d;
	}
}

public class Employee_Salary_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Amount is :"+d );

	}

}
