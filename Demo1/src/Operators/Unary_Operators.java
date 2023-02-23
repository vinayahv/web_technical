package Operators;

public class Unary_Operators {

	public static void main(String[] args) {
		// Unary operators are
		//+, -, ++, --, !
		
		boolean flag=true;
		System.out.println(!flag);
		int a=-5;
		int b=+7;
		System.out.println(a);
		System.out.println(b);
		System.out.println(-a);
		System.out.println(-b);
		a=10;
		a++; // a=a+1
		System.out.println(a);
		a=10;
		++a;  //a=a+1 
		System.out.println(a);
		a=10;
		int c=a++; //c=a, a=a+1 c=10 a=11
		System.out.println(c);
		System.out.println(a);
		a=10;
		c=++a;  //a=a+1; c=a c=11 a=11
		System.out.println(c);
		System.out.println(a);
		b=10;
		b--;
		System.out.println(b);
		b=10;
		--b;
		System.out.println(b);
		b=10;
		c=b--;
		System.out.println(c);
		System.out.println(b);
		b=10;
		c=--b;
		System.out.println(c);
		System.out.println(b);
		
	}

}
