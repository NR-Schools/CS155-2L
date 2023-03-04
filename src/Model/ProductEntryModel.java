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
public class ProductEntryModel {
    private int Id;
    private int ProductId;
    private int Qty;
    private Timestamp EntryDate;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public Timestamp getEntryDate() {
        return EntryDate;
    }

    public void setEntryDate(Timestamp EntryDate) {
        this.EntryDate = EntryDate;
    }
}
