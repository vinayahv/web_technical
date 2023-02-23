package Associatevity;

public class Precedence_And_Associativity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=10;
		int c=15;
		int d=20;
		int x,y,z;
		System.out.println(a++*b);// a++, a becomes a+1 but returns the previous value
		 a=5;
		System.out.println(b*a++);
		a=5;
		int p=a+b*c;    // *precedence is higher
		System.out.println(p);
		System.out.println(11/2*10);  // equal precedence - left to right 
		System.out.println(11*10/2); // equal precedence - left to right
		System.out.println(100000>>2*2);// * Higher precedence
		System.out.println(100000*2>>2);// * Higher precedence
		System.out.println(b*c&d);
		a=5;
		System.out.println(b|c&a);// & higher precedence
		System.out.println(b&c|a);
		System.out.println(7+b*c>>2);
		System.out.println(7+b*c>>2&++a);
		x=9;
		y=12;
		a=2;
		b=4;
		c=6;
		int exp=(3+4*x)/5-10*(y-5)*(a+b+c)/x+9*(4/x+(9+x)/y);
		System.out.println(exp);
		a=5;
		b=6;
		c=8;
		exp=a+b|c+ ++a*c+x;
		System.out.println(exp);
	}

}
