/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Timestamp;

/**
 *
 * @author hp
 */
public class GoalModel {
    private int id;
    public enum GoalStatus { NotAchieved, Achieved };
    private GoalStatus Status;
    private double TargetSales;
    private double CurrentSales;
    private Timestamp EntryDate;
    private Timestamp DeadlineDate;

    public GoalModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GoalStatus getStatus() {
        return Status;
    }

    public void setStatus(GoalStatus Status) {
        this.Status = Status;
    }

    public double getTargetSales() {
        return TargetSales;
    }

    public void setTargetSales(double TargetSales) {
        this.TargetSales = TargetSales;
    }

    public double getCurrentSales() {
        return CurrentSales;
    }

    public void setCurrentSales(double CurrentSales) {
        this.CurrentSales = CurrentSales;
    }

    public Timestamp getEntryDate() {
        return EntryDate;
    }

    public void setEntryDate(Timestamp EntryDate) {
        this.EntryDate = EntryDate;
    }

    public Timestamp getDeadlineDate() {
        return DeadlineDate;
    }

    public void setDeadlineDate(Timestamp DeadlineDate) {
        this.DeadlineDate = DeadlineDate;
    }
    
    
}
