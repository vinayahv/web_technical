package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Simple_Database_Example {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");  //driver is program that basically helps to connect different application
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_company_preetham","root","admin123");
			Statement stmt=con.createStatement();
			System.out.println("let us the read data from the database");
			
			System.out.println("Let us read the data from the data base my_company_preetham\n");
			
			String str = "select * from department";
						
			ResultSet rs = stmt.executeQuery(str);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) +" "+ rs.getString(2)+ " "+rs.getString(3));
			}
			//str = "update department set  dept_name='bhanu' , local_id=903 where dept_number=50 ";
			
			//stmt.executeUpdate(str);
			
			String str1 = "select * from employee";
						
			ResultSet rs1 = stmt.executeQuery(str1);
			
			while(rs1.next()) {
				System.out.println(rs1.getInt(1) +" "+ rs1.getString(2)+ " "+rs1.getString(3));
			}	
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		}
}
