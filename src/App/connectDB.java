package App;


import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jerson
 */
public class connectDB {
    
    public static void main(String[] args) {
        try
        {
            String dbUser = "root";
            String dbPassword = "root";
            String dbURL ="jdbc:mysql://localhost:3306/connectdb";
             
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection connect = DriverManager.getConnection(dbURL, dbUser, dbPassword);
            
            if(connect != null)
            {
                System.out.println("Success");
            }
            
            else 
            {
                System.out.println("Failed");
                
            }
            
        }
        
        catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(connectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) 
        {
            java.util.logging.Logger.getLogger(connectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
}
