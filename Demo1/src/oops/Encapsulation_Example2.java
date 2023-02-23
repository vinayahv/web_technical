package oops;
class A6{
private String[] names;
		void setName(String[] n) {
	names = n;
}
		String[] getName() {
			return names;
		}
}
public class Encapsulation_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A6 ob1=new A6();
		String name[]= {"Naanu","Nandu","Namdu"};
		ob1.setName(name);
		//System.out.println(ob1.getName());
		String names2[]=ob1.getName();
		for(String str:names2) {
			System.out.println(str);
		}
		
	}

}
