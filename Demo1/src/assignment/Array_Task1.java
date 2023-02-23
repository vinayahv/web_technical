package assignment;

public class Array_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {12,77,23,21,31,52,19,21,33};
		
		if(a.length%2==0) {
			int arr[] = new int[a.length/2];
			
			for(int i = 0,j=0;i<a.length-1;i+=2) {
				arr[j++] = a[i] +a[i+1];
				
			}
			
			for(int i: arr) {
				System.out.print(i+"\t");
			}
			
		}else {
			int arr[] = new int[a.length/2+1];
			
			for(int i = 0,j=0;i<a.length-1;i+=2) {
				arr[j++] = a[i] +a[i+1];
				
			}
			
			arr[arr.length-1]=a[a.length-1];
			
			for(int i: arr) {
				System.out.print(i+"\t");
			}
		}
	}


	}

