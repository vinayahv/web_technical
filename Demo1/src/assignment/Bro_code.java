package assignment;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Bro_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	double x;
		double y;
		double z;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		z=Math.sqrt((x*x)+(y*y));
		System.out.println("The Hypotenuse is :"+z);
		scanner.close();
*/
		String name=JOptionPane.showInputDialog("enter your name");
		JOptionPane.showMessageDialog(null,"Hello "+name);
		
		int age=Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
		JOptionPane.showMessageDialog(null,"your "+age+" years old");
		
		double height=Double.parseDouble(JOptionPane.showInputDialog("enter your height"));
		JOptionPane.showMessageDialog(null,"your "+height+" cm tall");
		
		
		



	}

}
