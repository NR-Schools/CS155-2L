/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Model.GoalModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class GoalRepository extends BaseRepository {
    
    public void SetGoal(GoalModel goal) {
        try {
            Connection conn = this.createSQLConnection();
            
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("TRUNCATE GoalTable");
            
            PreparedStatement pStmt = conn.prepareStatement("INSERT INTO GoalTable VALUES (null, ?, ?, ?, ?, ?);");
            pStmt.setInt(1, goal.getStatus().ordinal());
            pStmt.setDouble(2, goal.getTargetSales());
            pStmt.setDouble(3, goal.getCurrentSales());
            pStmt.setTimestamp(4, goal.getEntryDate());
            pStmt.setTimestamp(5, goal.getDeadlineDate());
            pStmt.executeUpdate();
            
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(GoalRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GoalRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public GoalModel getCurrentGoal() {
        try {
            Connection conn = this.createSQLConnection();
            
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM GoalTable");
            
            result.next();
            
            GoalModel goal = new GoalModel();
            goal.setId(result.getInt("Id"));
            goal.setStatus(GoalModel.GoalStatus.values()[result.getInt("Status")]);
            goal.setTargetSales(result.getDouble("TargetSales"));
            goal.setCurrentSales(result.getDouble("CurrentSales"));
            goal.setEntryDate(result.getTimestamp("EntryDate"));
            goal.setDeadlineDate(result.getTimestamp("DeadlineDate"));
            
            
            conn.close();
            
            return goal;
            
        } catch (SQLException ex) {
            Logger.getLogger(GoalRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GoalRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public void UpdateGoal(GoalModel goal) {
        try {
            Connection conn = this.createSQLConnection();
            
            PreparedStatement pStmt = conn.prepareStatement("UPDATE GoalTable SET Status=?, TargetSales=?, CurrentSales=?, EntryDate=?, DeadlineDate=? WHERE Id=?;");
            pStmt.setInt(1, goal.getStatus().ordinal());
            pStmt.setDouble(2, goal.getTargetSales());
            pStmt.setDouble(3, goal.getCurrentSales());
            pStmt.setTimestamp(4, goal.getEntryDate());
            pStmt.setTimestamp(5, goal.getDeadlineDate());
            pStmt.setInt(6, goal.getId());
            pStmt.executeUpdate();
            
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(GoalRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GoalRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void RemoveGoal(GoalModel goal) {
        try {
            this.createSQLConnection();
            
            Connection conn = this.createSQLConnection();
            
            PreparedStatement pStmt = conn.prepareStatement("DELETE FROM GoalTable WHERE Id=?;");
            pStmt.setInt(1, goal.getId());
            pStmt.executeUpdate();
            
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(GoalRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GoalRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
