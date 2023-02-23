package Control_structure;

import java.util.Scanner;

public class For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* for(int i=0; i<10; i=i+2) {
			System.out.println(i);
		}

		for(byte num1=0;num1>=0;num1++) {
			System.out.println(num1);
		}		
	
	int k=0;
	for( ; k<10; k++)
	{
		System.out.println(k);
	}
	for(int num1=0; num1<10; num1++) {
		System.out.println(num1);
	}
	// System.out.println(num1); Gives compiler error
	int l=20;
	{
		int m=10;
		System.out.println(l);
		System.out.println(m);
	}
	System.out.println(l);
	// System.out.println(m); Gives compiler error
	
	k=0;
	for(;k<=10;) {
		System.out.println(k++);
	}
	
	
	for(int x=0,y=10;(x<=10)&&(y>=0);x++,y--)
	{
		System.out.println(x+" "+y);
	}
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter three numbers");
	int a=2, b=3, c=6;
	int d=(a<b)?(a<c)?a:c:(b>c)?b:c;
	int lcm;
	for(int i=0; ;i++) {
		lcm=d*(i+1);
		if(lcm%b==0 && lcm%a==0 && lcm%c==0)
		{
			System.out.println("lcm of "+a+","+b+" and "+c+" is "+lcm);
			break; */
		Scanner sc=new Scanner(System.in);	
		int a=15;
		int b=25;
		int hcf=1;
		for(int i=1; i<=a && i<=b; i++) 
		{
			if(a% i==0 && b% i==0) {
				hcf=i;
			}
			//System.out.println("hcf of %d and %d is %d"+(num1,num2),hcf);
			
			
		}
		System.out.println("hcf of "+a+","+b+" and "+a+" is "+hcf);
		
	}
	
	
	    }
	
	



	



