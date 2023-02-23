package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prepared_Statement {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdatabase","root","admin123");
		String n="rama",p="pass";
		PreparedStatement ps=con.prepareStatement("select uname from logintable where uname=? and password=? ;");
		ps.setString(1, n);
		ps.setString(2, p);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			
			System.out.println(rs.getString(1));
			
		}
		String insertlogintable="insert into logintable values(?,?),(?,?);";
		ps=con.prepareStatement(insertlogintable);
		n="Avitha";
		p="avi";
		ps.setString(1, n);
		ps.setString(2, p);
		n="Dam";
		p="daam";
		ps.setString(3, n);
		ps.setString(4, p);
		int i=ps.executeUpdate();
		System.out.println(i+" Records inserted");
		
	}
		
		catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//	select uname from logintable where uname=? and password=?
		

	}

}
