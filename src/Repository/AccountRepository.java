/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author --
 */
public class AccountRepository extends BaseRepository {
    
    private void createAccountInputHandler(
            JTextField userTF, JTextField passTF, JTextField conpassTF,
            JLabel InvalidUsernameError, JLabel InvalidPasswordError, JLabel InvalidConfirmPassError) {
        
        // Set all errors to invisible
        InvalidUsernameError.setVisible(false);
        InvalidPasswordError.setVisible(false);
        InvalidConfirmPassError.setVisible(false);
        
        // Only show appropriate errors
        if(userTF.getText().length()<3)
        {
            InvalidUsernameError.setVisible(true);
        }
        if(passTF.getText().length()<8)
        {
            InvalidPasswordError.setVisible(true);
        }
        if(!(conpassTF.getText().equals(passTF.getText())))
        {
            InvalidConfirmPassError.setVisible(true);
        }
        if(conpassTF.getText().length()<8)
        {
            InvalidConfirmPassError.setVisible(true);
        }
    }
    
    // For the creation of new account, return false if unsuccessful
    private boolean createAccount() {
        // TODO
        return false;
    }
    
    // For the logging in of user, return false if unsuccessful
    private boolean logIn(){
        // TODO
        return false;
    }
    
    // For the resetting of password, return false if unsuccessful
    private boolean forgotPassword() {
        // TODO
        return false;
    }
}
