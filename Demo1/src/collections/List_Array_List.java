package collections;

import java.util.ArrayList;
import java.util.List;

public class List_Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a=new ArrayList<Integer>();
		ArrayList<Integer> b=new ArrayList<Integer>();
		
		a.add(10);
		a.add(20);
		System.out.println(a);
		System.out.println(a.get(0)+a.get(1));
		System.out.println(a.size());
		a.add(11);
		System.out.println(a);
		a.add(2, 1111);
		System.out.println(a);
		a.sort(null);
		System.out.println(a);
		b.add(99);
		b.add(88);
		b.add(77);
		b.add(66);
		b.add(55);
		System.out.println(b);
		a.addAll(b);
		System.out.println(a);
		a.sort(null);
		System.out.println(a);

	}

}
