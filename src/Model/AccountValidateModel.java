/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author hp
 */
public class AccountValidateModel {
    private AccountModel model;
    private boolean valid;

    public AccountValidateModel() {
    }

    public AccountValidateModel(AccountModel model, boolean valid) {
        this.model = model;
        this.valid = valid;
    }

    public AccountModel getModel() {
        return model;
    }

    public void setModel(AccountModel model) {
        this.model = model;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean status) {
        this.valid = status;
    }
    
    
}
