package core.mysqlconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.CallableStatement;

public class TestMySqlConnection {

	public static void main(String[] args) {

		
		//mySqlConnect();
		insertQuery();
		
	}

	private static void insertQuery() {

		


		
		 Connection connection = null;
	        try {
	            // below two lines are used for connectivity.
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            connection = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/stu",
	                "root", "root");
	 
	            // mydb is database
	            // mydbuser is name of database
	            // mydbuser is password of database
	 
	           // Statement statement;
	          //  statement = connection.createStatement();
	           // ResultSet resultSet;
	          //  resultSet = statement.executeQuery("select * from employe");
	           

	            // the mysql insert statement
	            String query = " insert into employe (name,age) values (?,?)";

	            // create the mysql insert preparedstatement
	            PreparedStatement preparedStmt = connection.prepareStatement(query);
	          //  CallableStatement
	            preparedStmt.setString (1, "Antony");
	           
	            preparedStmt.setInt    (2, 23);

	            // execute the preparedstatement
	            preparedStmt.execute();
	            
	            
	            preparedStmt.close();
	           // resultSet.close();
	          //  statement.close();
	            connection.close();
	        }
	        catch (Exception exception) {
	            System.out.println(exception);
	        }
		
		
		
	
		
		
	}

	private static void mySqlConnect()
	{

		
		 Connection connection = null;
	        try {
	            // below two lines are used for connectivity.
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            connection = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/stu",
	                "root", "root");
	 
	            // mydb is database
	            // mydbuser is name of database
	            // mydbuser is password of database
	 
	            Statement statement;
	            statement = connection.createStatement();
	            ResultSet resultSet;
	            resultSet = statement.executeQuery("select * from employe");
	           
	            int stuId;
	            String stuName;
	            int stuAge;
	            
	            while (resultSet.next()) {
	                stuId = resultSet.getInt("id");
	                stuName = resultSet.getString("name").trim();
	                stuAge = resultSet.getInt("age");
	                System.out.println("Code :\n " + stuId
	                                   + " Title :\n " + stuName
	                                   +"  age :"+stuAge);
	            }
	          
	            
	            resultSet.close();
	            statement.close();
	            connection.close();
	        }
	        catch (Exception exception) {
	            System.out.println(exception);
	        }
		
		
		
	}

}
