package Operators;

public class Assingment_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Assignment operators
		// '=', "+=", "-=", "*=", "/=", "%="
		// Example a+=b means a=a+b;
		// a=a+b means new values of a=previous value of a+b;
		// a=15; b=a; means values of RHS will comes to LHS
		// Example a=10 ; b=25
		// a+=b => a=10+25 => a=35
		int a=10;
		int b=25;
		System.out.println("a="+a+" "+"b="+b);
		a+=b;
		System.out.println("a="+a+" "+"b="+b);
		
		//float
		float aa=10;
		float bb=25;
		System.out.println("aa="+aa+" "+"bb="+bb);
		aa+=bb;
		System.out.println("aa="+aa+" "+"bb="+bb);
		
		int a1=10;
		int b1=25;
		System.out.println("a1="+a1+" "+"b1="+b1);
		a1-=b1;
		System.out.println("a1="+a1+" "+"b1="+b1);
		
		int a2=10;
		int b2=25;
		System.out.println("a2="+a2+" "+"b2="+b2);
		a2*=b2;
		System.out.println("a2="+a2+" "+"b2="+b2);
		
		int a3=10;
		int b3=25;
		System.out.println("a3="+a3+" "+"b3="+b3);
		a3/=b3;
		System.out.println("a3="+a3+" "+"b3="+b3);
		
		int a4=10;
		int b4=25;
		System.out.println("a4="+a4+" "+"b4="+b4);
		a4%=b4;
		System.out.println("a4="+a4+" "+"b4="+b4);
		
	}

}
