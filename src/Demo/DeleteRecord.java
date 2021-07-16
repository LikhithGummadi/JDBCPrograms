package Demo;

import java.sql.*;
import java.util.Scanner;

public class DeleteRecord
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Class Loaded");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","likhith");
			System.out.println("Connection Established");
			Statement stmt = con.createStatement();
			
			int eid;			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Employee ID for which you want to delete:");
			eid = sc.nextInt();
			
			//Delete Records
			String query =" delete from employee7 where empid = "+eid+"";
			stmt.executeUpdate(query);
			
			System.out.println("Record Deleted");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
