/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Walid
 */
public class SingletonConnection {
    private static Connection connection;
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/DB_MVC_CAT?useSSL=false","root","");
        } catch (Exception ex) {
            Logger.getLogger(SingletonConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Connection getConnection() {
      return connection;
    }
}
