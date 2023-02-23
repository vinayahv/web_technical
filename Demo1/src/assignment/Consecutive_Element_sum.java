package assignment;

public class Consecutive_Element_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=0;
		int arr[]=new int[] {23,56,90,12,2,6,2,3,4};
		int c=arr.length;
		int  ar[]= {};
		if(c%2==0)
		{
			size=c/2;
			ar=new int[size];
			for(int i=0,j=0;i<=c;i+=2,j++) {
				ar[j]=arr[j]+arr[i+1];
			}
			for(int i=0;i<size;i++)
				System.out.println(arr[i]);
			}
		else {
			if(c%2==1) {
				size=c/2;
			}
			for(int i=0, j=0;i<c-1;i+=2,j++) {
				ar[j]=arr[i]+arr[i+1];
			}
			for(int i=0;i<size;i++) {
				System.out.println(ar[i]);
			}
			System.out.println(arr[arr.length-1]);
			}
		}
		}

	


