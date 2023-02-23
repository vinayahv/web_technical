package oops;
class A1{
//	A1(){
// 	System.out.println("object A is created");
//	}
}
class B1 extends A1 {
	B1(String name){
		System.out.println("Printing input "+name);
	}
	B1(){
		System.out.println("b object");
	}
}

class C1 extends A1{
	C1(){}
	
}
public class Constructor_Inheritance_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b1=new B1();
		B1 b2=new B1("My name");
		}
    }
