package assignment;

import java.util.Scanner;

public class Number_To_Word_Example {
	static int numofDigits(long a) {
		int digit=0;
		while(a>0) {
			digit++;
			a/=10;
		}
		return digit;
	}
	static int[] numarry(long a) {
	int numarry[]=new int[numofDigits(a)];
	for(int i=numarry.length-1;i>=0;i--) {
		numarry[i]=(int)(a%10);
		a/=10;
	}
	return numarry;

	}
	static String string0_9(long a) {
		String str=" ";
		if(a==1) {
			str="one";
			}
		if(a==2) {
			str="Two";
		}
		if(a==3) {
			str="Three";
		}
		if(a==4) {
			str="Four";
			}
		if(a==5) {
			str="Five";
		}
		if(a==6) {
			str="Six";
		}
		if(a==7) {
			str="Seven";
		}
		if(a==8) {
			str="Eight";
		}
		if(a==9) {
			str="nine";
		}
		return str;
	}
	static String string11_19(long a) {
	String str=" ";
	if(a==11) {
		str="Eleven";
	}
	if(a==12)
		str="Twelve";
	if(a==13)
		str="Thirteen";
	if(a==14)
		str="Fourteen";
	if(a==15)
		str="Fifteen";
	if(a==16)
		str="Sixteen";
	if(a==17)
		str="Seventeen";
	if(a==18)
		str="Eighteen";
	if(a==19)
		str="Ninteen";
	return str;
	}
	static String string10s(long a) {
		String str="";
		if(a==10)
			str="Ten";
		if(a==20)
			str="Twenty";
		if(a==30)
			str="Thirty";
		if(a==40)
			str="Fourty";
		if(a==50)
			str="Fifty";
		if(a==60)
			str="Sixty";
		if(a==70)
			str="Seventy";
		if(a==80)
			str="Eighty";
		if(a==90)
			str="Ninty";
		
		return str;
	}
	static String singledigit(long a) {
		return string0_9(a);
	}
	static String twodigit(long a) {
		String str="";
		if(a==0) {
			str=string10s(a);
		}
			if(a>10 && a<20) {
				str=string11_19(a);
				
			}
		if(a>=20) {
			String str1=string10s(a-a%10);
			String str2=singledigit(a%10);
			str=str1+str2;
		}
		return str;
		
	}
	static String hundred(long a) {
		String str="hundred";
		String hundred=singledigit(a/100);
	long x=a-a/100*100;
	String str1="";
		if(x>=10) {
			 str1=twodigit(x);
		}
		else
		{
			str1=singledigit(x);
		}
		return hundred+str+str1;
		
	}
	static String thousands(long a) {
		String str="Thousand";
		long x=(a/1000);
		String thousand=""; 
		String str1;
		if(x>=10) {
			thousand=twodigit(x);
		}
			else {
				thousand=singledigit(x);
			}
		x=a%1000;
		if(x>=100) {
			str1=hundred(x);
		}
		else if(x>=10){
			str1=twodigit(x);
		}
		else {
			str1=singledigit(x);
			
			}
		return thousand+str+str1;
		}
	
	static String lakhs(long a) {
		String str="lakhs";
		long x=(a/100000);
		String lakhs=""; 
		String str1;
		if(x>=10) {
			lakhs=twodigit(x);
		}
			else {
				lakhs=singledigit(x);
			}
		x=a%100000;
		if(x>=1000) {
			str1=thousands(x);
		}
		else if(x>=100) {
			str1=hundred(x);
		}
		else if(x>=10)
			str1=twodigit(x);
		
		else {
			str1=singledigit(x);
			
			}
		return lakhs+str+str1;
		}
	
	static String crores(long a) {
		String str="crores";
		String crores="";
		String str1="";
		long x=a/10000000;
		if(x>=1000) {
			crores=thousands(x);
		}
		else if(x>=100) {
			crores=hundred(x);
		}
		else if(x>=10) {
			crores=twodigit(x);
		}
		else {
			str1=singledigit(x);
		}
			x=a%10000000;
			if(x>=100000) {
				str1=lakhs(x);
			}
			else if(x>=1000) {
				str1=thousands(x);
			}
			else if(x>=100) {
				str1=hundred(x);
			}
			else if(x>=10) {
				str1=twodigit(x);
			}
			else {
				str1=singledigit(x);
				
			}
		return crores+str+str1;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number");
	    long num=sc.nextLong();
	    int[] number=new int[numofDigits(num)];
	    number=numarry(num);
	    for(int digit:number) {
	    	System.out.println(digit);
	    	digit=numofDigits(num);
	    
	    	if(digit==1) {
	    		System.out.println(singledigit(num));
	    	}
	    	if(digit==2)
	    		System.out.println(twodigit(num));
	    
	    if(digit==3)
	    	System.out.println(hundred(num));
	    
	    if(digit==4||digit==5)
	    	System.out.println(thousands(num));
	    
	    if(digit==6||digit==7) {
	    	System.out.println(lakhs(num));
	    	
	    }
	    if(digit>7) {
	    	System.out.println(crores(num));
    }
	    }
	    sc.close();
	}

	}


