package collections;

import java.util.HashSet;
import java.util.Set;

public class Set_Interface_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set1=new HashSet<String>();
		set1.add("Rama");
		set1.add("Sita");
		set1.add("Lakshman");
		set1.add("Sita");
		System.out.println(set1);
		
		set1.add("Lakshman");
		
		HashSet set2=(HashSet) set1.clone();
		
		for(Object x:set2) {
			System.out.println(x);
			}
		}

}
