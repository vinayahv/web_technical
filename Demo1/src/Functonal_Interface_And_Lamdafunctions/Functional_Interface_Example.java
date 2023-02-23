package Functonal_Interface_And_Lamdafunctions;

@FunctionalInterface// this annotation keeps a watch on the interface and tells about the mistakes we do
interface workable{   // this annotations help to check the mistakes like adding one more abstract
	void work(); 	// method in the functional interface
	//	void push();}
}
	class Employee implements workable{
		
		@Override     // this annotations check whether we are overriding or not
	public	void work() {
			System.out.println("I work for 7 hours a day");
		}
		@Deprecated
		void dispaly1() {
			System.out.println("I am an old methos, so don't use");
		}
		void display2() {
			System.out.println("I am an  old methos, so you can use");
		}
	}
	@FunctionalInterface
	interface playable{
		void play();
	}
public class Functional_Interface_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 = new Employee(), e3 = new Employee(), e4 = new Employee();
		e1.work();
		
		workable w1 = new Employee() {
			public void work() {
				System.out.println("Method defined inside main method,  so working for 16 hours");
			}
			
		};
		w1.work();
		e1.work();
		e1.dispaly1();
		e1.display2();
		
		// lambda functions
		workable w2 = ()->{
			System.out.println("I am through the lambda function: so t will work 20 hours a day");
		};
		w2.work();
		
		workable w3 = ()->{
			System.out.println("I am through the lambda function: I am not like w2, i work for only 8hrs");
		};
		w3.work();
		playable p1 = ()->{
			System.out.println("I like to  play only snooker");
		};
		p1.play();
		}
	
		}

	


