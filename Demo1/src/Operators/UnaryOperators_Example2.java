package Operators;

public class UnaryOperators_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=7;
		int c=a++ + ++b;// 
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		a=5;
		b=7;
		int c1=a++ + b++;
		System.out.println(c1);
		System.out.println(a);
		System.out.println(b);
		a=5;
		b=7;
		c=++a + ++b;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		a=5;
		b=7;
		c=++a + b++;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		//Different
		a=5;
		c=a++ + --a;
		System.out.println(c);
		System.out.println(a);
		a=5;
		c=a++ + a++;
		System.out.println(c);
		System.out.println(a);
		a=5;
		c=++a + ++a;
		System.out.println(c);
		System.out.println(a);
		a=5;
		c=a++ + ++a;
		System.out.println(c);
		System.out.println(a);
		a=5;
		c=++a + a++;
		System.out.println(c);
		System.out.println(a);

	}

}
