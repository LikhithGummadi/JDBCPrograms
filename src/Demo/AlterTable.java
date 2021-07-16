package Demo;

import java.sql.*;

public class AlterTable 
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Class Loaded");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","likhith");
			System.out.println("Connection Established");
			Statement stmt = con.createStatement() ;
			
			//Alter Table
			String query0 = "alter table employee7 add (dept varchar(30))";
			stmt.executeUpdate(query0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}