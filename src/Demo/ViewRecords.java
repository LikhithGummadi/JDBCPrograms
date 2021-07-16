package Demo;

import java.sql.*;

public class ViewRecords
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
			
			//View Records
			String query ="select * from employee7";
			ResultSet rs = stmt.executeQuery(query);
			int count = 1;
			while(rs.next())
			{
				System.out.println("*****Employee Records*******");
				System.out.println("Employee Record: " + count);
				System.out.println("Employee ID         :  " + rs.getInt("empid"));
				System.out.println("Employee Name       :  " + rs.getString("ename"));
				System.out.println("Employee Salary     :  " + rs.getInt("salary"));
				System.out.println("Employee Gender     :  " + rs.getString("gender"));
				System.out.println("Employee Department :  " + rs.getString("dept"));
				count = count + 1;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
