package Exception_and_Exception_Handling;

public class Throw_Example_2 {
	/*static void checkVoteAge(int age) {
	try {
		if(age>17) {
			System.out.println("Welcome to vote");
		}
	else {
		throw new Exception("error");
	}
	}
	catch(Exception e) {
		System.out.println("Sorry");
	}
	}*/
	static void devide(int a,int b) {
	try {
		System.out.println(a/b);
	}
	catch(Exception e) {
		System.out.println("Sorry");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//checkVoteAge(18);
		devide(10,0);
	}
}
