package keywords;
class A16{
	 static int count=0; //each member(object) will have separate copy if non static // static tell referring the same copy
	A16(){
		count++;
	}
	static void resetCount() {
		count=0;
	}
}
public class Static_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A16 a1=new A16();
		System.out.println(a1.count);
		A16 a2=new A16();
		System.out.println(a2.count);
		A16 a3=new A16();
		System.out.println(a3.count);
		A16 a4=new A16();
		System.out.println(a4.count);
		A16 a5=new A16();
		System.out.println(A16.count);
		A16.count++;
		System.out.println(A16.count);
		a1.resetCount();
		//A16.resetCount();
		System.out.println(a1.count);
		System.out.println(a2.count);
		System.out.println(a3.count);
		System.out.println();

		
	}

}
