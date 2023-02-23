package Exception_and_Exception_Handling;

public class Exception_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15,b=0;
		System.out.println("It is fine today");
		try {
		System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Sorry, denominator cannot be zero");
		}
		System.out.println("Job is done");

	}

}
