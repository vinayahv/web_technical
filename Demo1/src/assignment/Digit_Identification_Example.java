package assignment;

import java.util.Scanner;

public class Digit_Identification_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a digit");
		int num=sc.nextInt();
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("It is a "+count+" digit number");
		sc.close();

	}

}
