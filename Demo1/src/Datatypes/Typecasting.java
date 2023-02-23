package Datatypes;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=25;
		short sh=30;
		int i=35;
		long l=45l;
		float f1=12.326f;
		double d1=386.3296;
		//byte b1=sh; // short cannot fit in byte
		byte b1=(byte)sh;
		System.out.println(b1);
		short sh1=b;// automatic type casting
		System.out.println(sh1);
		int c=sh1+15;
		c=c+22;
		int num1=b;
		int num2=sh;
		//int=int+short;
		int num3=i+sh;
		//short num4=i+sh;
	}
}
