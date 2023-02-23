package oops;

class MathsFunctions{

	int add(int a,int b) {  //add(int,int) is method signature
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
		
	double add(int a,double b) {
		return a+b;
	}
	double add(int a,double b,int c) {
		return this.add(a,c)+b;
	}

	//double add(int x,int y) {   signature duplicate
		//return a+b;
         //}
	}

public class Polymorphism_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathsFunctions mf1=new MathsFunctions();
		System.out.println(mf1.add(23,14));
		System.out.println(mf1.add(11,22,33));
		System.out.println(mf1.add(100,205.55));
		System.out.println(mf1.add(256,83.9));
		System.out.println(mf1.add(12,20)+2);
	}

}
