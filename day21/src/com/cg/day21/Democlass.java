package com.cg.day21;
import java.sql.Connection;

import com.cg.day21.Democlass

public class Democlass {
	public static void main(String[] args) {
		Connection connection = Democlass.getConnection();
		if(connection != null) {
			System.out.println("JDBC: Connection is established");
		}

	}

	
	}


