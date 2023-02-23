package keywords;
class A10
{
	String name;
	A10(){
		System.out.println("obj A is created");
	}
	A10(String name){
		this();
		this.name=name;
		}
	void display() {
		System.out.println(this.name);
	}
}
	class B10 extends A10{
		int age;
		B10(){
			System.out.println("obj B is created");
		}
			B10(String name){
				//this.name=name;
				super(name);  // Super makes matching parent constructor to create
			}
	
			B10(String name, int age){
				//super();
				super(name); // All to parent constructor // super means parent
				this.age=age;
			}
				void display() {
					super.display();
					System.out.println(this.age);
				}
			}
public class Super_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B10 b=new B10();
		b.name="santhu";
		b.display();
		B10 b1=new B10("Sithara");
		b1.display();
		B10 b2=new B10("Nanu",56);
		b2.display();

	}

}
