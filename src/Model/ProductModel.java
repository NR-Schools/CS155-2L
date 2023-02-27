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
    // Based sa understanding ko from da code
    
    // This field is only used for the table on record viewing
    private int ID;
    
    // Following Fields are required for determining the type of product 
    private enum ProductType { Photocard, Photopaper }
    private ProductType productType;
    private String productName;
    
    // Following Fields are required for the updating of product data
    private double sold;
    private double sales;
    private double profit;
}
