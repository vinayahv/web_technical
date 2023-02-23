package oops;
 class A{
	 int methodOne(int a,int b) {
		 return a+b;
	 }
 }
	 class B extends A{
		 @Override
		 int methodOne(int a,int b) {
			 return a-b;
		 }
		 int methodOne(int a,int b,int c) {
			 return a+b+c;
	 }
	 }
 public class OverRiding_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
		int C=b1.methodOne(17,18);
	System.out.println(C);// Over rides method of class A
	//B b2=new A();           // Type mismatch
	//c=b2.methodOne(17,18);  //Parent object
	//System.out.println(c);  //Cannot be a child
	A a1=new A();
	C=a1.methodOne(17,18);   //parent method
	System.out.println(C);
	A a2=new B();
	C=a2.methodOne(17,18);   //child can be parent 
	System.out.println(C);     //child method got executed
	 a1=new B();
		C=a1.methodOne(17,18);    
		System.out.println(C);
		
		B b2=new B();
		C=b2.methodOne(17,18,19);
		System.out.println(C);


	}

}
