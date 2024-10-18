package connectivity.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
	JDBC stands for Java Database Connectivity, JDBC helps to communicate the with the database via java.
*/
public class JDBCconnect {
	
	//Connection credentials 
	public static String host = "jdbc:mysql://localhost:3306/guvi";
	public static String username = "root";
	public static String password = "Java@sql88";
	
	
	public static void main(String[] args) throws SQLException {
		
		//SQL Queries to create a table in the database:
		String table = "CREATE TABLE Employee" + "(empcode INTEGER not NULL," + "empname VARCHAR(30)," + "empage INTEGER," + "esalary INTEGER)";
		
		//Sql query to insert into table
		String insertTable = "INSERT INTO Employee (empcode, empname, empage, esalary)" + "VALUES (101, 'Jenny', 25, 10000)";
		String insertTable2 = "INSERT INTO Employee (empcode, empname, empage, esalary)" + "VALUES (102, 'Jacky', 30, 20000)";
		String insertTable3 = "INSERT INTO Employee (empcode, empname, empage, esalary)" + "VALUES (103, 'Joe', 20, 40000)";
		String insertTable4 = "INSERT INTO Employee (empcode, empname, empage, esalary)" + "VALUES (104, 'John', 40, 80000)";
		String insertTable5 = "INSERT INTO Employee (empcode, empname, empage, esalary)" + "VALUES (105, 'Shammer', 25, 90000)";
		//Mysql database driver to load in the java.
		try {
		
		//Database connection	
		Connection connectSql = DriverManager.getConnection(host, username,password);
		
		//Statement to create a query action
		Statement sqlQuery = connectSql.createStatement();
		
		//Executing the action
		sqlQuery.executeUpdate(insertTable);
		sqlQuery.executeUpdate(insertTable2);
		sqlQuery.executeUpdate(insertTable3);
		sqlQuery.executeUpdate(insertTable4);
		sqlQuery.executeUpdate(insertTable5);
		
		//closing the connection
		connectSql.close();
		System.out.println("Query Executed!");
		}
		//catch block
		catch(Exception cnf){
			System.out.println("Unable to find the Mysql Driver --> " + cnf.getMessage());
			
		}
		
		
	}

}
