package Runner;

import View.LoginView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author --
 */

// This class must be the main class set
// This class is created for removing singleton requirement on services and data repositories

public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Run Login View
        LoginView loginView = new LoginView();
        
        // RepositoryProvider rp = new RepositoryProvider()
        // LoginView loginView = new LoginView(rp);
        // loginView.setProvider(rp)
    }
    
}
