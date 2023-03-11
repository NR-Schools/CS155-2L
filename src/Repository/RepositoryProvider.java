/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

/**
 *
 * @author --
 */
public class RepositoryProvider {
    
    public AccountRepository getAccountRepo() {
        return new AccountRepository();
    }

    public ProductRepository getProductRepo() {
        return new ProductRepository();
    }
    
    public GoalRepository getGoalRepo() {
        return new GoalRepository();
    }
}
