package com.cg.crudoperation;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.cg.day21.Democlass;

public class Crudoperation {

	public static void main(String[] args)throws Exception
	{
		Connection connection = Democlass.getConnection();
		Statement st = connection.createStatement();
		String sqlinsert = "INSERT INTO students(idstudent,studentname,score)"+"values(5,'amber','76')";
		int execute = st.executeUpdate(sqlinsert);
		if(execute==1) {
			System.out.println("entry done");
		
		}
	}


	}


