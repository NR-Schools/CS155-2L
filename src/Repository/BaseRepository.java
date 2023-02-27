/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author --
 */
public abstract class BaseRepository {
    private final String USERNAME = "<DATABASE_USERNAME>";
    private final String PASSWORD = "<DATABASE_PASSWORD>";
    
    // Assuming that database to be used is in local, for remote connections, replace "localhost" with the database url
    private final String LINK = "jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=GMT%2B8";
    private final String CONNECTOR = "com.mysql.cj.jdbc.Driver";
    
    protected Connection createSQLConnection() throws Exception {
        Class.forName(CONNECTOR);
        
        Connection sql_con = DriverManager.getConnection(LINK, USERNAME, PASSWORD);
            
        Statement SetDB = sql_con.createStatement();
        SetDB.executeUpdate("USE cs155_2l_db"); // Change database name if necessary
            
        return sql_con;
    }
}
