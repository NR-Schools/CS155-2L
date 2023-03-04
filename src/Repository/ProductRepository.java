/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Model.ProductEntryModel;
import Model.ProductModel;
import Model.ProductSummary;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class ProductRepository extends BaseRepository {
    
    // This is for viewing the qty, sales, profit of products
    public ArrayList<ProductSummary> getProductSummaries(String Type) {
        ArrayList<ProductSummary> product_summaries = new ArrayList<>();
        
        try {
            Connection conn = this.createSQLConnection();
            PreparedStatement pStmt = conn.prepareStatement(
                    "SELECT \n" +
                    "	 ProductTable.Id AS Id,\n" +
                    "    ProductTypeTable.Name AS Type, \n" +
                    "    ProductTable.Name, \n" +
                    "    IFNULL(SUM(Qty), 0) AS Qty, \n" +
                    "    IFNULL(SUM(Qty*Sales_Multiplier), 0) AS Sales, \n" +
                    "    IFNULL(SUM(Qty*Profit_Multiplier), 0) AS Profit\n" +
                    "FROM \n" +
                    "    ProductTable\n" +
                    "    LEFT JOIN ProductEntryTable ON ProductTable.Id = ProductEntryTable.ProductId\n" +
                    "    JOIN ProductTypeTable ON ProductTable.TypeId = ProductTypeTable.Id\n" +
                    "WHERE\n" +
                    "	ProductTypeTable.Name = ?\n" +
                    "GROUP BY \n" +
                    "    ProductTable.Id");
            pStmt.setString(1, Type);
            ResultSet result = pStmt.executeQuery();
            
            while (result.next()) {
                ProductSummary prod_sum = new ProductSummary();
                prod_sum.setProductId(result.getInt("Id"));
                prod_sum.setType(result.getString("Type"));
                prod_sum.setName(result.getString("Name"));
                prod_sum.setQty(result.getInt("Qty"));
                prod_sum.setSales(result.getDouble("Sales"));
                prod_sum.setProfit(result.getDouble("Profit"));
                
                product_summaries.add(prod_sum);
            }
            
            conn.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProductRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return product_summaries;
    }
    
    public ArrayList<ProductModel> getProducts(int Type) {
        ArrayList<ProductModel> product_list = new ArrayList<>();
        
        try {
            Connection conn = this.createSQLConnection();
            PreparedStatement pStmt = conn.prepareStatement(
                    "SELECT * FROM ProductTable WHERE TypeId=?;"
            );
            pStmt.setInt(1, Type);
            ResultSet result = pStmt.executeQuery();
            
            while (result.next()) {
                ProductModel product = new ProductModel();
                product.setId(result.getInt("Id"));
                product.setName(result.getString("Name"));
                
                product_list.add(product);
            }
            
            conn.close();
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProductRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product_list;
    }
    
    public void submitProductEntry(ProductEntryModel productEntry) {
        try {
            Connection conn = this.createSQLConnection();
            
            PreparedStatement pStmt = conn.prepareStatement(
                    "INSERT INTO ProductEntryTable VALUES (null, ?, ?, ?);"
            );
            pStmt.setInt(1, productEntry.getProductId());
            pStmt.setInt(2, productEntry.getProductId());
            pStmt.setTimestamp(3, productEntry.getEntryDate());
            
            pStmt.executeUpdate();
            
            conn.close();
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProductRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
