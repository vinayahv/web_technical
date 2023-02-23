package printcommand;

public class MorePrintExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Avanu";
		String str2="Ivanu";
		System.out.println(str1+str2);//'+' joins Strings
		System.out.println("Rakesh"+str1);
		System.out.println(str2+"Suresh");
		System.out.println(str1+" "+str2);
		System.out.println("Rakesh"+"Mahesh");
		System.out.println("Ukesh"+" "+"Ramesh");
		// part 2
		int length=20;
		int breadth=40;
		int area=length*breadth;
		System.out.println("Are of rectangle= "+area);
		System.out.println("Area of rectangle= "+length*breadth);
		int num1=50;
		int num2=70;
		System.out.println("Sum of num1 and num2 is:"+num1+num2);//'+' will consider as string 
		System.out.println(num1+num2);
		System.out.println(num1+num2+"is the sum of num1&num2");
		System.out.println("Sum of num1 and num2 is:"+(num1+num2));// '()' it will takes as adding
	}

}
