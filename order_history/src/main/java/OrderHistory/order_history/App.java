package OrderHistory.order_history;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App
{
   public void getOrderHistory(String _DriverClass) throws ClassNotFoundException, SQLException
   {
	   Class.forName(_DriverClass);
	   
	   // create connection
	   
	   Connection connection = DriverManager.getConnection(_DriverClass);
	   
	    
	   
   }
}
