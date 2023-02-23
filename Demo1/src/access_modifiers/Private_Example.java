package access_modifiers;
class A25{
	private String name;
	private int age;
	A25(){}
	private A25(String name) {
		this.name=name;
	}
	A25(String name,int age){
		this(name);
		this.age=age;
	}
	private void display() {
		System.out.println(this.name+" "+this.age);  
	}
	void showDetails() {
		this.display();
		}
	public String toString() {
		return this.name+" "+this.age;
	}
	}
public class Private_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  A25 obj=new A25("Arnar"); Gives error
	//	A25 obj=new A25();
		//obj.name="Bhim"; gives error
	A25	obj2=new A25("Shiva",25);
	//System.out.println(obj2.name);  gives eroor
	//obj2.display(); Gives error
	obj2.showDetails();
		}
    }