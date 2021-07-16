package Demo;

import java.sql.*;
import java.util.Scanner;

public class OracleDBConnection 
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Class Loaded");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","likhith");
			System.out.println("Connection Established");
			
			//creating a table
			String query0 = "create table employee7(empid integer primary key,ename varchar(30) not null,gender varchar(10),salary integer not null)";
			Statement stmt = con.createStatement() ;
			stmt.executeUpdate(query0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
