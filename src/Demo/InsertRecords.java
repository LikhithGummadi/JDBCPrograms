package Demo;

import java.sql.*;
import java.util.Scanner;

public class InsertRecords
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
			Double salary ;
			String gender = null;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Employee ID:");
			eid = sc.nextInt();
			System.out.println("Enter Employee Name:");
			ename = sc.next();
			System.out.println("Enter Salary:");
			salary = sc.nextDouble();
			System.out.println("Enter Gender:");
			gender = sc.next();
			System.out.println("Enter Department:");
			String dept = sc.next();
			
			//Insert Records
			String query =" Insert into employee7 values("+eid+",'"+ename+"','"+gender+"',"+salary+",'"+dept+"')";
			stmt.executeUpdate(query);
			
			System.out.println("Record is inserted");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
