package Operators;

public class Ternary_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=117;
		int b=24;
		int c=(a>b)? a:b;
		System.out.println(c);
		int x=50;
		int y=40;
		int z=30;
		int big=(x>y)? (x>z)?x:z : (y>z)?y:z;  
		System.out.println(big);

	}

}
