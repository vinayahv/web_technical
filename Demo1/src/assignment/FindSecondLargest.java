package assignment;

public class FindSecondLargest {
	 /* static int smallest(int[] a) {
		 int small=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(small>a[i]) {
				small=a[i];
			}
			}
		return small;
		}
	  
	  static int biggest(int[] a) {
			 int big=a[0];
			for(int i=0;i<a.length;i++)
			{
				if(big<a[i]) {
					big=a[i];
				}
				}
			return big;
			}
	static int[] replacebiggest(int[] a, int small, int biggest) {
		  for(int i=0; i<a.length; i++) {
			  if(a[i]==biggest) {
				  a[i]=small;
			  } 
			  }
			  return a;
		  }*/
	  
	public static void main(String[] args) {
		/*int a[]= {35,15,25,46,78,64};
		System.out.println(smallest(a));
		System.out.println(biggest(a));
		
		int b[]=replacebiggest(a,smallest(a),biggest(a)); { //Second biggest
			for(int i:b) {
			System.out.println(i+" ");
			}
			System.out.println("The second biggest is");
			System.out.println(biggest(b));
			
			int c[]=replacebiggest(b,smallest(b),biggest(b)); {  // Third biggest
				for(int i:c) {
					System.out.println(i+" ");
				}
			
			System.out.println("The third biggest is");
			System.out.println(biggest(b));
		
		}
		
		}*/
		
		
	        int sum = 0, count = 0;
	        for (int i = 500; i < 1000; i++) {
	            if (i % 17 == 0) {
	                count++;
	                sum += i;
	            }    
	        }
	        System.out.println("Sum = " + sum);
	        System.out.println("Count = " + count);
	    
	}
}


