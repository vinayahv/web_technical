package generics;

public class Generics_Example {
	//Showing generics
		static <E> void display(E[] ee) { //ee represent generic type element
			for(E e:ee) {                //T means data type
				System.out.println(e);
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"Preetham","Pavan","Pramod","Prabas"};
		display(str);
		
		Integer[] intarr=new Integer[3];
		intarr[0] =20;
		intarr[1] =30;
		intarr[2] =40;
		display(intarr);
		
		Generics_Example obj0=new Generics_Example();
		Generics_Example obj1=new Generics_Example();
		
		Generics_Example[] objgrp= {obj0,obj1};
		display(objgrp);
	}

}
