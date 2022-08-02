package day21;
import java.sql.*;

import com.mysql.cj.protocol.Resultset;
public class DemoClass {

	public static void main(String[] args)throws Exception 
	{
		String url ="jdbc:mysql://localhost:3306/student1.student";
		String uname="root";
		String pass ="admin123";
		String query = "select studentname from student1 where idstudent=1";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs=  st.executeQuery(query);
		rs.next();
		String name = rs.getString("username");
		System.out.println(name);
		st.close();
		con.close();
		

	}

}
