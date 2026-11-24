
package OrderHistory1.one_loan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class products {

    public void getProductHistory()
            throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/company_db",
                "root",
                "sql123"
        );

        Statement stmnt = connection.createStatement();

        ResultSet rs = stmnt.executeQuery("SELECT * FROM products");

        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String description = rs.getString(3);

            System.out.println("++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Description: " + description);
            System.out.println("-------------------");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        }

        rs.close();
        stmnt.close();
        connection.close();
    }
}
