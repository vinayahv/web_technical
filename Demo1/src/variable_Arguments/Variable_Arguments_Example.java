package variable_Arguments;

public class Variable_Arguments_Example {
	static void display(int...number) { // thi takes from 0 to any number of arguments
		//System.out.println("Hi the job is done");
		int sum=0;
		for(int i :number) {
	//	System.out.println(i+" ");}
		sum+=i;}
		System.out.println("\n sum of purchases= "+sum);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		display(12);
		display(23,11);
		display(11,22,33,44);
		display(12,23,34,45,56,67,78,89,90);
	}

}
