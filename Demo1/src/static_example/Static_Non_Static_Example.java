package static_example;
class A1{
	int x=10,y=20;
	static int z=0;
	void method1() {
		x=x+y;
	
	}
	static void method2() {
	 A1 a1=new A1();
	 a1.y=a1.x+a1.y;
	 z++;
	 System.out.println("**"+a1.y);
	 disp();
	}
	static void disp() {
		System.out.println("Iam static");
	}
	void display() {
		method2();//non-static can called directly in the same class
		method1(); // called directly
		System.out.println(x+y+z);
	}
	
	}

public class Static_Non_Static_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a=new A1();
		a.display();
		a.method1(); //accessed through object
		System.out.println(a.x+a.y);
        A1.method2(); // accessed through cls name and object through possible but gives warning
        System.out.println(a.y);
	}
		
	}
