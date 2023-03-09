package View;


import Model.ProductEntryModel;
import Repository.RepositoryProvider;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class AddRecordView extends javax.swing.JFrame {
    
    String a,b;
    
    private RepositoryProvider provider;
    
    public AddRecordView() {
        initComponents();
        
        provider = new RepositoryProvider();
        
        cbPPP.setVisible(false);
        showDate();
        showTime();
    }
    public void showDate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
        String dat = s.format(d);
        l_date.setText(dat);
    }
    public void showTime(){
        new Timer(0,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
                String tim = s.format(d);
                l_time.setText(tim);
            }
        }).start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logBackground = new javax.swing.JPanel();
        logoSide1 = new javax.swing.JPanel();
        logoSide = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        addRecord = new javax.swing.JButton();
        viewRecord = new javax.swing.JButton();
        signOut = new javax.swing.JButton();
        logoSide3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        l_time = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        l_date = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logoSide5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        printingType = new javax.swing.JLabel();
        productType = new javax.swing.JComboBox<>();
        QtySpinner = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        productNameCB = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbPPP = new javax.swing.JComboBox<>();
        submitBut = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        logBackground.setBackground(new java.awt.Color(255, 255, 102));
        logBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoSide1.setBackground(new java.awt.Color(251, 215, 9));
        logoSide1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoSide.setBackground(new java.awt.Color(251, 215, 9));
        logoSide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/logo_dashboard.png"))); // NOI18N
        logoSide.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        logoSide1.add(logoSide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 80));

        addRecord.setBackground(new java.awt.Color(38, 38, 38));
        addRecord.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        addRecord.setForeground(new java.awt.Color(251, 215, 9));
        addRecord.setText("ADD RECORD");
        addRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addRecord.setFocusPainted(false);
        addRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecordActionPerformed(evt);
            }
        });
        logoSide1.add(addRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 140, 43));

        viewRecord.setBackground(new java.awt.Color(251, 215, 9));
        viewRecord.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        viewRecord.setForeground(new java.awt.Color(38, 38, 38));
        viewRecord.setText("VIEW RECORD");
        viewRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        viewRecord.setFocusPainted(false);
        viewRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewRecordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewRecordMouseExited(evt);
            }
        });
        viewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRecordActionPerformed(evt);
            }
        });
        logoSide1.add(viewRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 140, 43));

        signOut.setBackground(new java.awt.Color(251, 215, 9));
        signOut.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        signOut.setForeground(new java.awt.Color(38, 38, 38));
        signOut.setText("SIGN-OUT");
        signOut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        signOut.setFocusPainted(false);
        signOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signOutMouseExited(evt);
            }
        });
        signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutActionPerformed(evt);
            }
        });
        logoSide1.add(signOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 140, 43));

        logBackground.add(logoSide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 140, 950));

        logoSide3.setBackground(new java.awt.Color(38, 38, 38));
        logoSide3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(142, 149, 153));
        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("You are currently adding records");
        logoSide3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 360, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/waveHand.png"))); // NOI18N
        logoSide3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel17.setForeground(java.awt.Color.white);
        jLabel17.setText("Marie's Printing Services Sales Management System");
        logoSide3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        l_time.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        l_time.setForeground(new java.awt.Color(255, 255, 255));
        l_time.setText("0");
        logoSide3.add(l_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 60, 90, -1));

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("TIME:");
        logoSide3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 60, 40, -1));

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("DATE:");
        logoSide3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 40, -1));

        l_date.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        l_date.setForeground(new java.awt.Color(255, 255, 255));
        l_date.setText("0");
        logoSide3.add(l_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 30, 90, -1));

        jPanel3.setBackground(new java.awt.Color(251, 215, 9));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        logoSide3.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 10, -1));

        logBackground.add(logoSide3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 1170, 100));

        jLabel1.setBackground(new java.awt.Color(142, 149, 153));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Product form");
        logBackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/user_profile.png"))); // NOI18N
        logBackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 90, 90));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("ADD RECORDS");
        logBackground.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 190, 40));

        logoSide5.setBackground(new java.awt.Color(38, 38, 38));
        logoSide5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(38, 38, 38));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        logoSide5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 1120, 590, 20));

        jPanel1.setBackground(new java.awt.Color(251, 215, 9));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        logoSide5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, 760, 10));

        jPanel2.setBackground(new java.awt.Color(251, 215, 9));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        logoSide5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 760, 10));

        printingType.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        printingType.setForeground(new java.awt.Color(255, 255, 255));
        printingType.setText("PRINTING TYPE:");
        logoSide5.add(printingType, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 230, -1));

        productType.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        productType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coscard/Photocard Printing", "Photo Paper Printing" }));
        productType.setBorder(null);
        productType.setFocusable(false);
        productType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productTypeActionPerformed(evt);
            }
        });
        logoSide5.add(productType, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 430, 30));

        QtySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        logoSide5.add(QtySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 70, 30));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PRODUCT NAME:");
        logoSide5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 190, -1));

        productNameCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Glossy", "Canvas Matte", "Leather", "Glitter", "3D", "Broken Glass Holo", "Holo" }));
        logoSide5.add(productNameCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 130, 30));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("QUANTITY SOLD:");
        logoSide5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        cbPPP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3R Satin", "4R Satin", "4R Glossy", "4R Pearl Holo", "5R Satin", "A4 Glossy", "A4 Satin" }));
        cbPPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPPPActionPerformed(evt);
            }
        });
        logoSide5.add(cbPPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 130, 30));

        submitBut.setBackground(new java.awt.Color(251, 215, 9));
        submitBut.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        submitBut.setForeground(new java.awt.Color(38, 38, 38));
        submitBut.setText("SUBMIT");
        submitBut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        submitBut.setFocusPainted(false);
        submitBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                submitButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submitButMouseExited(evt);
            }
        });
        submitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButActionPerformed(evt);
            }
        });
        logoSide5.add(submitBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 140, 43));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("FILL-OUT THE FORM");
        logoSide5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/form.png"))); // NOI18N
        logoSide5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/num.png"))); // NOI18N
        logoSide5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/form.png"))); // NOI18N
        logoSide5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/box.png"))); // NOI18N
        logoSide5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 225, -1, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/print.png"))); // NOI18N
        logoSide5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, 40));

        logBackground.add(logoSide5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 1170, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 1440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void viewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRecordActionPerformed
        this.setVisible(false);
        new RecordView().setVisible(true);
    }//GEN-LAST:event_viewRecordActionPerformed

    private void viewRecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewRecordMouseEntered
        viewRecord.setBackground(new Color(38,38,38,255));
        viewRecord.setForeground(new Color(251,215,9,255));
    }//GEN-LAST:event_viewRecordMouseEntered

    private void viewRecordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewRecordMouseExited
        viewRecord.setBackground(new Color(251,215,9,255));
        viewRecord.setForeground(new Color(38,38,38,255));
    }//GEN-LAST:event_viewRecordMouseExited

    private void submitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButActionPerformed
        // TODO add your handling code here:
        int productTypeInt = productType.getSelectedIndex() +1;
        int productNameInt = productNameCB.getSelectedIndex() +1;

        // Since Both are 7
        if (productTypeInt == 2) productNameInt += 7;

        // Check if Qty is valid
        int QtyInt;
        try {
            QtyInt = Integer.parseInt(QtySpinner.getValue().toString());
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid Quantity");
            return;
        }

        // Submit To DB
        ProductEntryModel productEntry = new ProductEntryModel();
        productEntry.setProductId(productNameInt);
        productEntry.setQty(QtyInt);
        productEntry.setEntryDate(new Timestamp(new java.util.Date().getTime()));

        provider.getProductRepo().submitProductEntry(productEntry);

        JOptionPane.showMessageDialog(null, "Success.");
      
    }//GEN-LAST:event_submitButActionPerformed

    private void productTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productTypeActionPerformed
        int productTypeInt = productType.getSelectedIndex() +1;

        // If Data is Hardcoded
        String[] PhotoPaperList = new String[] {
            "3R Satin",
            "4R Satin",
            "4R Glossy",
            "4R Pearl Holo",
            "5R Satin",
            "A4 Glossy",
            "A4 Satin"
        };

        String[] PhotoCardList = new String[] {
            "Glossy",
            "Canvas Matte",
            "Leather",
            "Glitter",
            "3D",
            "Broken Glass Holo",
            "Holo"
        };

        productNameCB.removeAllItems();

        if (productTypeInt == 1) {
            for ( String product : PhotoCardList ) {
                productNameCB.addItem(product);
            }
        }
        else if (productTypeInt == 2) {
            for ( String product : PhotoPaperList ) {
                productNameCB.addItem(product);
            }
        }



        /*
        // If Data Needs to come from database
        // Update ComboBox
        ArrayList<ProductModel> product_list = provider.getProductRepo().getProducts(productTypeInt);
        
        // Load Contents to CB
        productNameCB.removeAllItems();
        
        for ( ProductModel product : product_list ) {
            productNameCB.addItem(product.getName());
        }
        
        */
    }//GEN-LAST:event_productTypeActionPerformed

    private void submitButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButMouseEntered
        submitBut.setBackground(Color.WHITE);
        submitBut.setForeground(new Color(38,38,38,255));
    }//GEN-LAST:event_submitButMouseEntered

    private void submitButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButMouseExited
        submitBut.setBackground(new Color(251,215,9,255));
        submitBut.setForeground(new Color(38,38,38,255));
    }//GEN-LAST:event_submitButMouseExited

    private void cbPPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPPPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPPPActionPerformed

    private void signOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOutMouseEntered
        signOut.setBackground(new Color(38,38,38,255));
        signOut.setForeground(new Color(251,215,9,255));
    }//GEN-LAST:event_signOutMouseEntered

    private void signOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOutMouseExited
        signOut.setBackground(new Color(251,215,9,255));
        signOut.setForeground(new Color(38,38,38,255));
    }//GEN-LAST:event_signOutMouseExited

    private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
        int result = JOptionPane.showConfirmDialog(logBackground,"Are you sure want to sign-out?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            this.setVisible(false);
            new LoginView().setVisible(true);
        }
    }//GEN-LAST:event_signOutActionPerformed

    private void addRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addRecordActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRecordView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner QtySpinner;
    private javax.swing.JButton addRecord;
    private javax.swing.JComboBox<String> cbPPP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel l_date;
    private javax.swing.JLabel l_time;
    private javax.swing.JPanel logBackground;
    private javax.swing.JPanel logoSide;
    private javax.swing.JPanel logoSide1;
    private javax.swing.JPanel logoSide3;
    private javax.swing.JPanel logoSide5;
    private javax.swing.JLabel printingType;
    private javax.swing.JComboBox<String> productNameCB;
    private javax.swing.JComboBox<String> productType;
    private javax.swing.JButton signOut;
    private javax.swing.JButton submitBut;
    private javax.swing.JButton viewRecord;
    // End of variables declaration//GEN-END:variables
}
