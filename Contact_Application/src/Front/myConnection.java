
package Front;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class myConnection {
    public static Connection getConnection(){
              Connection con = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
               con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/javacontactapp","root","");
            } catch (ClassNotFoundException | SQLException ex) {
              System.out.println(ex.getMessage()); 
            }
        
        return con;
        
    }
}

