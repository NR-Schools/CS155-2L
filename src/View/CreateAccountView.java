/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.AccountValidateModel;
import Repository.RepositoryProvider;
import javax.swing.JOptionPane;


/**
 *
 * @author hp
 */
public class CreateAccountView extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccountView
     */
    
    private RepositoryProvider provider;
    
    public CreateAccountView() {
        initComponents();
        E1.setVisible(false);
        E2.setVisible(false);
        E3.setVisible(false);
        
        provider = new RepositoryProvider();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logBackground = new javax.swing.JPanel();
        logPage = new javax.swing.JPanel();
        logoSide = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        description1 = new javax.swing.JLabel();
        description2 = new javax.swing.JLabel();
        createTitle = new javax.swing.JLabel();
        passTF = new javax.swing.JTextField();
        createAccBT = new javax.swing.JButton();
        cancelBT = new javax.swing.JButton();
        divider1 = new javax.swing.JPanel();
        passL = new javax.swing.JLabel();
        divider2 = new javax.swing.JPanel();
        ctNumL = new javax.swing.JLabel();
        CctNum = new javax.swing.JTextField();
        conPassL = new javax.swing.JLabel();
        conpassTF = new javax.swing.JTextField();
        CemailTF = new javax.swing.JTextField();
        emailL = new javax.swing.JLabel();
        userL = new javax.swing.JLabel();
        userTF = new javax.swing.JTextField();
        E1 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        E3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        logBackground.setBackground(new java.awt.Color(255, 255, 102));

        logPage.setBackground(new java.awt.Color(38, 38, 38));
        logPage.setForeground(new java.awt.Color(119, 150, 109));
        logPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoSide.setBackground(new java.awt.Color(251, 215, 9));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/logo.png"))); // NOI18N

        description1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        description1.setText("An efficient, fast, and reliable");

        description2.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        description2.setText("  Sales Management System");

        javax.swing.GroupLayout logoSideLayout = new javax.swing.GroupLayout(logoSide);
        logoSide.setLayout(logoSideLayout);
        logoSideLayout.setHorizontalGroup(
            logoSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoSideLayout.createSequentialGroup()
                .addGroup(logoSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logoSideLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(logoSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(description1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(description2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(logoSideLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 74, Short.MAX_VALUE))
        );
        logoSideLayout.setVerticalGroup(
            logoSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoSideLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(description1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(description2)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        logPage.add(logoSide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 603));

        createTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 43)); // NOI18N
        createTitle.setForeground(new java.awt.Color(255, 255, 255));
        createTitle.setText("CREATE ACCOUNT");
        logPage.add(createTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 71, -1, 52));

        passTF.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        logPage.add(passTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 249, 258, 40));

        createAccBT.setBackground(new java.awt.Color(251, 215, 9));
        createAccBT.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        createAccBT.setForeground(new java.awt.Color(38, 38, 38));
        createAccBT.setText("CREATE ACCOUNT");
        createAccBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccBTActionPerformed(evt);
            }
        });
        logPage.add(createAccBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 512, 150, 43));

        cancelBT.setBackground(new java.awt.Color(204, 204, 204));
        cancelBT.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        cancelBT.setForeground(new java.awt.Color(38, 38, 38));
        cancelBT.setText("CANCEL");
        cancelBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTActionPerformed(evt);
            }
        });
        logPage.add(cancelBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 512, 110, 43));

        divider1.setBackground(new java.awt.Color(251, 215, 9));

        javax.swing.GroupLayout divider1Layout = new javax.swing.GroupLayout(divider1);
        divider1.setLayout(divider1Layout);
        divider1Layout.setHorizontalGroup(
            divider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        divider1Layout.setVerticalGroup(
            divider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        logPage.add(divider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 141, -1, -1));

        passL.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        passL.setForeground(new java.awt.Color(255, 255, 255));
        passL.setText("Password (minimum of 8 characters)");
        logPage.add(passL, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 226, -1, -1));

        divider2.setBackground(new java.awt.Color(251, 215, 9));

        javax.swing.GroupLayout divider2Layout = new javax.swing.GroupLayout(divider2);
        divider2.setLayout(divider2Layout);
        divider2Layout.setHorizontalGroup(
            divider2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        divider2Layout.setVerticalGroup(
            divider2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        logPage.add(divider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 573, -1, -1));

        ctNumL.setForeground(new java.awt.Color(255, 255, 255));
        ctNumL.setText("Contact Number (Optional)");
        logPage.add(ctNumL, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 366, -1, -1));

        CctNum.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        logPage.add(CctNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 389, 258, 40));

        conPassL.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        conPassL.setForeground(new java.awt.Color(255, 255, 255));
        conPassL.setText("Confirm Password");
        logPage.add(conPassL, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 296, -1, -1));

        conpassTF.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        logPage.add(conpassTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 319, 258, 40));

        CemailTF.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        logPage.add(CemailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 459, 258, 40));

        emailL.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        emailL.setForeground(new java.awt.Color(255, 255, 255));
        emailL.setText("Email Address (Optional)");
        logPage.add(emailL, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 436, -1, -1));

        userL.setForeground(new java.awt.Color(255, 255, 255));
        userL.setText("Username (minimum of 3 characters)");
        logPage.add(userL, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 156, -1, -1));

        userTF.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        logPage.add(userTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 179, 258, 40));

        E1.setBackground(new java.awt.Color(255, 51, 51));
        E1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        E1.setForeground(new java.awt.Color(255, 51, 51));
        E1.setText("INVALID INPUT");
        logPage.add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, -1, -1));

        E2.setBackground(new java.awt.Color(255, 51, 51));
        E2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        E2.setForeground(new java.awt.Color(255, 51, 51));
        E2.setText("INVALID INPUT");
        logPage.add(E2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, -1, -1));

        E3.setBackground(new java.awt.Color(255, 51, 51));
        E3.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        E3.setForeground(new java.awt.Color(255, 51, 51));
        E3.setText("INVALID INPUT");
        logPage.add(E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 330, -1, -1));

        javax.swing.GroupLayout logBackgroundLayout = new javax.swing.GroupLayout(logBackground);
        logBackground.setLayout(logBackgroundLayout);
        logBackgroundLayout.setHorizontalGroup(
            logBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logBackgroundLayout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(logPage, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );
        logBackgroundLayout.setVerticalGroup(
            logBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logBackgroundLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(logPage, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createAccBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccBTActionPerformed
        
        
        AccountValidateModel accountValidate = provider.getAccountRepo().createAccountInputCheck(
                userTF.getText().trim(), passTF.getText().trim(), conpassTF.getText().trim(), CctNum.getText().trim(), CemailTF.getText().trim(),
                E1, E2, E3
        );
        
        if(accountValidate.isValid()) {
            provider.getAccountRepo().createAccount(accountValidate.getModel());
            JOptionPane.showMessageDialog(null, "Successfully created account");
            this.setVisible(false);
            new LoginView().setVisible(true);
        }
        
    }//GEN-LAST:event_createAccBTActionPerformed

    private void cancelBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTActionPerformed
        
        // Destroy this instance and create new LoginView instance to show
        this.setVisible(false);
        new LoginView().setVisible(true);
    }//GEN-LAST:event_cancelBTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateAccountView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccountView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccountView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccountView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccountView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CctNum;
    private javax.swing.JTextField CemailTF;
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E2;
    private javax.swing.JLabel E3;
    private javax.swing.JButton cancelBT;
    private javax.swing.JLabel conPassL;
    private javax.swing.JTextField conpassTF;
    private javax.swing.JButton createAccBT;
    private javax.swing.JLabel createTitle;
    private javax.swing.JLabel ctNumL;
    private javax.swing.JLabel description1;
    private javax.swing.JLabel description2;
    private javax.swing.JPanel divider1;
    private javax.swing.JPanel divider2;
    private javax.swing.JLabel emailL;
    private javax.swing.JPanel logBackground;
    private javax.swing.JPanel logPage;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel logoSide;
    private javax.swing.JLabel passL;
    private javax.swing.JTextField passTF;
    private javax.swing.JLabel userL;
    private javax.swing.JTextField userTF;
    // End of variables declaration//GEN-END:variables
}
