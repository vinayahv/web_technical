package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList1 = new ArrayList<Integer>();
		
		numList1.add(23);
		numList1.add(-13);
		numList1.add(45);
		numList1.add(-9);
		numList1.add(32);
		numList1.add(67);
		numList1.add(55);
		numList1.add(-35);
		
		System.out.println(numList1);
		
		List<Integer> numList2 = new ArrayList<Integer>();
		
		for(int x=0; x<numList1.size(); x++) {
			if(numList1.get(x)> 0) {
				numList2.add(numList1.get(x));
			}
		}
		System.out.println(numList2);
		numList2.clear();
		for(Integer x: numList1) {
			if(x>0) {
				numList2.add(x);
			}
		
			}
		System.out.println(numList2);
		numList2.clear();
		
		Stream<Integer> datastream = numList1.stream();
		numList2 = datastream.filter(x->(x>0)).toList();
		System.out.println(numList2);
		
		datastream = numList1.stream();
		numList2 = datastream.filter(x->(x<0)).toList();
		System.out.println(numList2);
		
		List<String> names = Arrays.asList("Arvind","Sheem","Anmika","Santhosh","Balaji","Adithya","Prasad");
		
		Stream namestream = names.stream();
		List<String> selectednames = namestream.filter(x->x.toString().startsWith("A")).toList();
		System.out.println(selectednames);
		
		namestream = names.stream();
		selectednames = namestream.filter(x->!x.toString().startsWith("A")).toList();
		System.out.println(selectednames);
		
	}

}
