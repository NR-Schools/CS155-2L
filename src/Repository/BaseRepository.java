/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author --
 */
public abstract class BaseRepository {
    private final String USERNAME = "sql12606683";
    private final String PASSWORD = "t9cYpWkSjD";
    
    // Assuming that database to be used is in local, for remote connections, replace "localhost" with the database url
    private final String LINK = "jdbc:mysql://sql12.freemysqlhosting.net:3306?useTimezone=true&serverTimezone=GMT%2B8";
    private final String CONNECTOR = "com.mysql.cj.jdbc.Driver";
    
    protected Connection createSQLConnection() throws SQLException, ClassNotFoundException  {
        Class.forName(CONNECTOR);
            
        Connection sql_con = DriverManager.getConnection(LINK, USERNAME, PASSWORD);
            
        Statement SetDB = sql_con.createStatement();
        SetDB.executeUpdate("USE sql12606683"); // Change database name if necessary
            
        return sql_con;
    }
}
