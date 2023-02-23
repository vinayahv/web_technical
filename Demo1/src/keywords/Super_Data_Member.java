package keywords;
class A15{
	String name="Naveen";
	int id=244;
	A15(){
		}
	A15(String name,int id){
		this.name=name;
		this.id=id;
	}
		void change(String name,int id) {
			this.name=name;
			this.id=id;
		}
			void display() {
				System.out.println(this.name+" "+this.id);
		}
}
class B15 extends A15{
	String name;
	int id;
	B15(String name,int id){
		//super(name,id);
		this.name=name;
		this.id=id;
		}
	void display() {
		System.out.println(this.name+" "+this.id);
	}
	void display1() {
		System.out.println(super.name+" "+super.id);
	}
}


public class Super_Data_Member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A15 a1=new A15("Harish",231);
	//	A15 a2=change("Sathish",534);  Gives Error
		//a1.A15("Manish",555); shows error
		a1.change("Manish",555);
		a1.change("Manish",535);
		a1.display();
		B15 b1=new B15("mahesh",232);
		b1.display();
		b1.display1();
	}

}
