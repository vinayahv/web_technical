package Exception_and_Exception_Handling;

public class Throw_Example {
	static void checkVoteAge(int age) throws Exception {
		if(age<18){
			throw new Exception("Sorry you are under 18");
		}
		else {
			System.out.println("welcome to vote");
		}
	}
	public static void main(String[] args) {                 //throws Exception also we can add 
		// TODO Auto-generated method stub
		try {
		checkVoteAge(20);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
