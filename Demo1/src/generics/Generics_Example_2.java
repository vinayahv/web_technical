package generics;

import java.util.ArrayList;
import java.util.List;

class One{
}

class Two extends One{
}
class Three extends Two{
	
}

public class Generics_Example_2 {
	
	static void display(int i) {
		System.out.println("The input to method was:"+i);
	}
	static <T> void disp( T t) {
		System.out.println("The input method was:"+t);
	}
	static void disp1(List<? super Two> t) {  // super is lower bound
		System.out.println("XXXXXXXXXXXXX");
	}
	static void disp2(List<? extends Two> t) {  // extends is upper bound
		System.out.println("*************");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(23);
		//display("Ajith");    //this gives error because display meethod can take int arguements only
		
		disp(234);
		disp(234.24);
		disp("MyWorld");
		
		List<One> LO=new ArrayList<One>();
		LO.add(new One());
		disp1(LO);
		
		List<Two> LT=new ArrayList<Two>();
		LO.add(new Two());
		disp1(LT);
		
		List<Three> LTR=new ArrayList<Three>();
		LO.add(new Three());
		//disp1(LTR);  gives error due to lower bound
		
		disp2(LT);
		disp2(LTR);
		

	}

}
