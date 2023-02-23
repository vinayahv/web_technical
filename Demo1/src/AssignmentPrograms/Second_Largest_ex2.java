package AssignmentPrograms;

public class Second_Largest_ex2 {

	public static void main(String[] args) {
	int a[]= {89,97,73,68,70,95,99};
	int firstBig=a[0];
	int secondBig=a[0];
	for(int i=0;i<a.length;i++) {
		if(firstBig<a[i]) {
			firstBig=a[i];
		}
	}
	for(int i=0;i<a.length;i++) {
		if(secondBig>a[i]) {
			secondBig=a[i];
		}
	}
	for(int i=0;i<a.length;i++) {
		if(secondBig<a[i]&&a[i]<firstBig) {
			secondBig=a[i];
		}
	}
	System.out.println("First Big is: "+firstBig+" and Second Big is: "+secondBig);
			}

}
