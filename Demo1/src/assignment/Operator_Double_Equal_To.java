package assignment;
class A{
	String name;
	A(String name){this.name=name;}
}

public class Operator_Double_Equal_To {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="I am the King";
		String str2="I am the King";
		
		System.out.println(str1==str2);  //== check the reference is name
		System.out.println(str1.equals(str2));  // .equals To check if content is samee
		
		String str3=new String("I am the King");
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		System.out.println(str3.compareTo(str1));  // compareto gives 0 if equals
		System.out.println("*****");
		//System.out.println(str3==str4);
		//A obj1=new A();
	}

}
