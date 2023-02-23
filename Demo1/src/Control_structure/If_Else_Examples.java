package Control_structure;

public class If_Else_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=15;
		if(a>b) {
			System.out.println("A is Bigger");
		}
		else {
			System.out.println("B is bigger");
		}
			a=155;
			b=20;
			if(a>b) {
			System.out.println("A is bigger");
			}
			else
				System.out.println("B is bigger");
			
	// Finding biggest of three using if else
			
			double n1 = 4, n2 = 3, n3 = 5;
			{
	        if( n1 >= n2 && n1 >= n3)
	            System.out.println(n1 + " is the largest number.");

	        else if (n2 >= n1 && n2 >= n3)
	            System.out.println(n2 + " is the largest number.");

	        else
	            System.out.println(n3 + " is the largest number.");
	        
	        // class examples
	        a=10;
	        b=15;
	        int c=12;
	        if(a>b) {
	        	if(a>c) {
	        		System.out.println(a);
	        	}
	        	else {
	        		System.out.println(c);
	        	}
	        }
	        else {
	        	if(b>c) {
	        		System.out.println(b);
	        	}
	        	else {
	        		System.out.println(c);
	        	}
	        	}
	        }
			}	
	}
		


	


