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
public class ProductSummary {
    private int ProductId;
    private String Type;
    private String Name;
    private int Qty;
    private double Sales;
    private double Profit;
    
    public int getProductId() {
        return ProductId;
    }
    
    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public double getSales() {
        return Sales;
    }

    public void setSales(double Sales) {
        this.Sales = Sales;
    }

    public double getProfit() {
        return Profit;
    }

    public void setProfit(double Profit) {
        this.Profit = Profit;
    }
}
