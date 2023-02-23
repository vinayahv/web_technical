package Datatypes;

public class DataTypeExample1 {

	public static void main(String[] args) {
		// Boolean data type example below
		boolean status=false;
				System.out.println(status);
			// System.out.println((int) status); //This will give error Boolean to int not possible
				status=true;
				System.out.println(status);
				
			// char data type example below
				char ch='+';
				System.out.println(ch);
				System.out.println((int)ch); // Type casting example // changing from ch data to int data
				ch=86;
				System.out.println(ch);
			// ch=12345678;//will show error
				ch=0xcf29;
				System.out.println(ch);
				ch=0x0c85;
				System.out.println(ch);
				//Byte data Type Example
				byte b1=84;
				System.out.println(b1);
			//	byte b1=128; Gives error
				 b1=-128;
				System.out.println(b1);
			//	b1=-129; Gives error
				//Short datatype example
				short sh=24000;
				System.out.println(sh);
				sh=-24000;
				System.out.println(sh);
			// sh=33000;// gives error
			// sh=-33000; // gives error
				//int data type example
				int num1=5123;
				int num2=-6789;
				System.out.println(num1);
				System.out.println(num2);
				// long data type example
				long l1=123456789012l;
				System.out.println(l1);
			    // Float data type example
				float avg=123.68f;
				System.out.println(avg);
			    // Double datatype example
				double expenser=1785.57;
				System.out.println(expenser);
				// Type casting
				int a=10;
				int b=25;
				Short c=(short)(a+b);// Type casting by force
				System.out.println(c);
				int g=10;
				float f=3.2f;
				f=g;
				System.out.println(g);
				int w=45;
				//short h=w;// gives error
				int q=23;
				short v=(short) q;//forcing 
				System.out.println(q);
				//11-08-2022
				byte bb=25;
				short shh=30;
				//bb1=shh;
				// System.out.println(bb1);
	}

}
