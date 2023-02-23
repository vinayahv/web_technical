package assignment;

public class ItemRepeatCount {
	
	static int counter(int[] a,int element,int elementIndex) {
		int count=0;
		for(int i=elementIndex;i<a.length;i++)
		{
			if(a[i]==element) {
				count++;
			}
		}
		return count;
	}
		
	public static void main(String[] args) {
		//int a[]= {15,11,12,15,18,12,19,12,22,18};
		
		//System.out.println(a[2] +" is repeated for "+ counter(a,a[2],2)+" times");	
	
		int count=0;
		int[] a= {35,56,23,14,89,7,89,56,7,35,56,56,35};
		for(int i=0; i<a.length; i++) { // for -1
			int flag=0;
		
			if(i==0) 
			{         // if - 1
				count=counter(a,a[i],i);
				System.out.println("count of "+a[i]+" is "+ count);
			}
			if(i!=0) {             // if - 2
				for(int j=0; j<i; j++)
					{   // for 2
						if(a[i]==a[j])
							{    // if - 3
								flag=1;
							}  // if - 3 close
					}   // if - 2 close
				
				if(flag==1) {  // if - 4
					continue;
					}  // if 4 close
					else {  // else - 4
						count=counter(a,a[i],i);
						System.out.println("count of "+a[i]+" is "+ count);
						}// for loop closes  else 4 close
				} // if 2 close
		}//for 1 close
	} // main close
} //  class  close

