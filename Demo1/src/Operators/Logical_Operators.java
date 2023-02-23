package Operators;

public class Logical_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Logical AND - '&&', LogicalOR- '||'
		int a=18;
		int b=16;
		int c=5;
		if(a>b && a>c) {
			System.out.println("a is the biggest number");
		}
		if(b>a && b>c) {
			System.out.println("b is the biggest among a, b and c");
		}
		if(c>a && c>b) {
			System.out.println("c is the biggest");
		}
		if(a<b && b<c) {
			System.out.println("a is smallest");
		}
		int p=15;
		int q=10;
		int r=-5;
		if(p>q || p>r) {
			System.out.println("p is greater than at the least on of q,r");
		}
		if(q>p || q>r) {
			System.out.println("q is greater than at the one of p,r");
		
		}

	}

}
