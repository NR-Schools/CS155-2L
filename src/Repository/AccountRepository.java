/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Model.AccountModel;
import Model.AccountValidateModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author --
 */
public class AccountRepository extends BaseRepository {
    
    // These are for validation, it can be moved to another class
    public AccountValidateModel createAccountInputCheck(
            String userStr, String passStr, String conPassStr,JLabel InvalidUsernameError, JLabel InvalidPasswordError, JLabel InvalidConfirmPassError) {

        AccountModel account = new AccountModel();
        boolean isInfoValid = true;
        
        // Set all errors to invisible
        InvalidUsernameError.setVisible(false);
        InvalidPasswordError.setVisible(false);
        InvalidConfirmPassError.setVisible(false);
        
        // Only show appropriate errors
        if(userStr.length()<3)
        {
            InvalidUsernameError.setVisible(true);
            isInfoValid = false;
        }
        if(passStr.length()<8)
        {
            InvalidPasswordError.setVisible(true);
            isInfoValid = false;
        }
        if(!(conPassStr.equals(passStr)))
        {
            InvalidConfirmPassError.setVisible(true);
            isInfoValid = false;
        }
        else if(conPassStr.length()<8)
        {
            InvalidConfirmPassError.setVisible(true);
            isInfoValid = false;
        }
        
        
        // Check for: username already exists, already have an account, invalid phone number
        
        //add username
        if(!InvalidUsernameError.isVisible()){
            try {
                //verify that username is not yet taken
                
                Connection conn = this.createSQLConnection();
                
                String searchUser = "select * from AccountTable where Username = ?";
                PreparedStatement userSearch = conn.prepareStatement(searchUser);
                userSearch.setString(1, userStr);
                
                ResultSet res = userSearch.executeQuery();
                
                //if username is already taken
                if(res.next())
                {
                    JOptionPane.showMessageDialog(null, "Username already taken. Try again");
                    isInfoValid = false;
                }
                else {
                    account.setUsername(userStr);
                }
                
                conn.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
        //add password
        if(!InvalidPasswordError.isVisible()){
            //verify if password and confirm password are same
            //if not same
            if(InvalidConfirmPassError.isVisible())
            {
                JOptionPane.showMessageDialog(null, "Password doesn't match.");
                isInfoValid = false;
            }
            else {
                account.setPassword(passStr);
            }
        }
       
            
        //check database if there is an account
        try {
            Connection conn = createSQLConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT COUNT(Id) AS \"Rows\" FROM AccountTable;");
            
            if(result.next()) {
                int rows = result.getInt("Rows");
                
                if (rows > 0) {
                    JOptionPane.showMessageDialog(null, "You already have an account.");
                    isInfoValid = false;
                }
            }
            
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return new AccountValidateModel(account, isInfoValid);
    }
    
    public AccountValidateModel loginAccountInputCheck(
            String userStr, String passStr,
            JLabel InvalidUsernameError, JLabel InvalidPasswordError) {
        
        boolean isInfoValid = true;
        AccountModel account = new AccountModel();
        account.setUsername(userStr);
        account.setPassword(passStr);
        
        InvalidUsernameError.setVisible(false);
        InvalidPasswordError.setVisible(false);
        
        if(userStr.length()<3)
        {
            InvalidUsernameError.setVisible(true);
            isInfoValid = false;
        }
        if(passStr.length()<8)
        {
            InvalidPasswordError.setVisible(true);
            isInfoValid = false;
        }
        
        return new AccountValidateModel(account, isInfoValid);
    }
    
    public AccountValidateModel forgotPasswordInputCheck(
            String userStr, String passStr, String conPassStr,
            JLabel InvalidUsernameError, JLabel InvalidPasswordError, JLabel InvalidConfirmPassError) {
        
        boolean isInfoValid = true;
        AccountModel account = new AccountModel();
        account.setUsername(userStr);
        account.setPassword(passStr);
        
        InvalidUsernameError.setVisible(false);
        InvalidPasswordError.setVisible(false);
        InvalidConfirmPassError.setVisible(false);
        
        if(userStr.length()<3)
        {
            InvalidUsernameError.setVisible(true);
            isInfoValid = false;
        }
        if(passStr.length()<8)
        {
            InvalidPasswordError.setVisible(true);
            isInfoValid = false;
        }
        if(!conPassStr.equals(passStr))
        {
            InvalidConfirmPassError.setVisible(true);
            isInfoValid = false;
        }
        if(conPassStr.length()<8)
        {
            InvalidConfirmPassError.setVisible(true);
            isInfoValid = false;
        }

        try
        {
            Connection conn = this.createSQLConnection();
            
            // return if username has error on input
            if(InvalidUsernameError.isVisible()) {
                isInfoValid = false;
                return new AccountValidateModel(account, isInfoValid);
            }
            
            //verify that username is existing
            String searchUser = "Select username from AccountTable where Username='"+userStr+"'";
            PreparedStatement userSearch = conn.prepareStatement(searchUser);
            ResultSet res = userSearch.executeQuery();
                
            while(res.next())
            {
                //if username is not existing
                if(!userStr.equals(res.getString("Username"))) {
                    JOptionPane.showMessageDialog(null, "Incorrect username. Please try again.");
                    isInfoValid = false;
                    return new AccountValidateModel(account, isInfoValid);
                }
                
                //verify if password and confirm password are same
                //if not same
                if(InvalidConfirmPassError.isVisible())
                {
                    JOptionPane.showMessageDialog(null, "Password doesn't match.");
                    isInfoValid = false;
                    return new AccountValidateModel(account, isInfoValid);
                }
            }
            
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return new AccountValidateModel(account, isInfoValid);
    }
    
    // For the creation of new account, return false if unsuccessful
    public void createAccount(AccountModel account) {
        try {
            Connection conn = this.createSQLConnection();
            String createUser = "INSERT INTO AccountTable VALUES(null, ?, ?, ?, ?)";
            PreparedStatement pStmt = conn.prepareStatement(createUser);
            pStmt.setString(1, account.getUsername());
            pStmt.setString(2, account.getPassword());
            pStmt.setString(3, account.getContactNumber());
            pStmt.setString(4, account.getEmailAddress());
            
            pStmt.executeUpdate();
            
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // For the logging in of user, return false if unsuccessful
    public boolean logIn(AccountModel account){
        try {
            Connection conn = this.createSQLConnection();
            PreparedStatement pStmt = conn.prepareStatement("SELECT * FROM AccountTable WHERE Username=? AND Password=?");
            pStmt.setString(1, account.getUsername());
            pStmt.setString(2, account.getPassword());
            ResultSet result = pStmt.executeQuery();
            
            if (result.next()) {
                return true;
            }
            
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    // For the resetting of password, return false if unsuccessful
    public boolean forgotPassword(AccountModel account) {
        //change password
        try
        {
            Connection conn = this.createSQLConnection();
            String updatePassword = "UPDATE AccountTable SET Password='"+account.getPassword()+"' WHERE Username='"+account.getUsername()+"'";
            PreparedStatement changePassword = conn.prepareCall(updatePassword);
            changePassword.execute();

            conn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
}
