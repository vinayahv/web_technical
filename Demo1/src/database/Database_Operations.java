package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database_Operations {
	static Connection con;
	 static void dbconnect() throws SQLException {
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_company_preetham","root","admin123");
		 }
			catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
		/* static void insertRecord(String str) {
			 try{
				 dbconnect();
		Statement stmt=con.createStatement();
		stmt.executeUpdate(str);
		con.close();
		}
			 catch(Exception e) {
			 }
		 }*/
		/* static void readTable(String str) {
			 try{
				 dbconnect();
		Statement stmt=con.createStatement();
		ResultSet rs = stmt.executeQuery(str);
		while(rs.next()) {
			System.out.println(rs.getInt(1) +" "+ rs.getString(2)+ " "+rs.getString(3));
		}
		con.close();
		}  
			 catch(Exception e) {
			 }
		 }*/
		/* static void deleteRecord(String str) {
			 try{
				 dbconnect();
		Statement stmt=con.createStatement();
		stmt.executeUpdate(str);
		con.close();
		}
			 catch(Exception e) {
			 }
		 }
		 public static void main(String[] args) {
				// TODO Auto-generated method stub
				String str="insert into student_info values(1,'vijay','vvpuram')";
				//insertRecord(str);
			//	String str="select * from student_info ";
			    //readTable(str);
				//String str="delete from student_info where stud_id=1 ";
			//	deleteRecord(str);*/

	
}


