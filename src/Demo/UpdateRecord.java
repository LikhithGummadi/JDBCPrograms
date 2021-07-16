package Demo;

import java.sql.*;
import java.util.Scanner;

public class UpdateRecord
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
			String ename = null;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Employee ID for which you want to change the name:");
			eid = sc.nextInt();
			System.out.println("Enter Employee Name:");
			ename = sc.next();
			
			//Update Records
			String query =" update employee7 set ename='"+ename+"' where empid = "+eid+"";
			stmt.executeUpdate(query);
			
			System.out.println("Record is updated");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
