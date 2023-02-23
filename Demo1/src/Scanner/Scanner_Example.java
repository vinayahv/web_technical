package Scanner;

import java.util.Scanner;

public class Scanner_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num1=sc.nextInt();
		System.out.println(" The number entered is "+num1);
		
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println(" The string you enterde is "+name);
		sc.close();
		

	}

}
