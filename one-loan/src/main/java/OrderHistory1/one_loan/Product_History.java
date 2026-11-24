package OrderHistory1.one_loan;
import java.sql.Statement;
//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Product_History {
	public void getProductHistory() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); // dynamic class loading
		
		// create the conection 
	Connection connection =	DriverManager.getConnection(" mysql://root:sql123@localhost:3306/company_db ", "root" , "sql123");
	
	// create connection 
       Statement stmnt =  connection.createStatement();
       
       // execute query
       
    ResultSet rs =  stmnt.executeQuery("SELECT * FROM products"); // quesry will be executed 
    while(rs.next()) {
      int id =	rs.getInt(1);
      String name =	rs.getString(2);
      String description =	rs.getString(3);
      
      System.out.println("ID: " + id);
      System.out.println("Name: " + name);
      System.out.println("Description: " + description);
    }
	
	}

}
