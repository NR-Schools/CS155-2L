/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author --
 */


public class ProductModel {
    private int Id;
    private int TypeId;
    private String Name;
    private double SalesMultiplier;
    private double ProfitMultiplier;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getTypeId() {
        return TypeId;
    }

    public void setTypeId(int TypeId) {
        this.TypeId = TypeId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getSalesMultiplier() {
        return SalesMultiplier;
    }

    public void setSalesMultiplier(double SalesMultiplier) {
        this.SalesMultiplier = SalesMultiplier;
    }

    public double getProfitMultiplier() {
        return ProfitMultiplier;
    }

    public void setProfitMultiplier(double ProfitMultiplier) {
        this.ProfitMultiplier = ProfitMultiplier;
    }
    
    
}
