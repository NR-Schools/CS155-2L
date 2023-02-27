package App;


import App.login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class forgotPassword extends javax.swing.JFrame {

    public forgotPassword() {
        initComponents();
        E2.setVisible(false);
        E3.setVisible(false);
        E1.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logBackground = new javax.swing.JPanel();
        logPage = new javax.swing.JPanel();
        logoSide = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        description1 = new javax.swing.JLabel();
        description2 = new javax.swing.JLabel();
        passConfirmBT = new javax.swing.JButton();
        divider2 = new javax.swing.JPanel();
        cancelBT = new javax.swing.JButton();
        createTitle = new javax.swing.JLabel();
        divider3 = new javax.swing.JPanel();
        userL2 = new javax.swing.JLabel();
        userTF = new javax.swing.JTextField();
        passL = new javax.swing.JLabel();
        passTF = new javax.swing.JTextField();
        E1 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        conpassTF = new javax.swing.JTextField();
        conPassL2 = new javax.swing.JLabel();
        E3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        logBackground.setBackground(new java.awt.Color(199, 149, 0));

        logPage.setBackground(new java.awt.Color(38, 38, 38));
        logPage.setForeground(new java.awt.Color(119, 150, 109));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoSideLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(logoSideLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(logoSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(description1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(description2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        logoSideLayout.setVerticalGroup(
            logoSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoSideLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(description1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(description2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        passConfirmBT.setBackground(new java.awt.Color(251, 215, 9));
        passConfirmBT.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        passConfirmBT.setForeground(new java.awt.Color(38, 38, 38));
        passConfirmBT.setText("CONFIRM");
        passConfirmBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passConfirmBTActionPerformed(evt);
            }
        });

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

        cancelBT.setBackground(new java.awt.Color(204, 204, 204));
        cancelBT.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        cancelBT.setForeground(new java.awt.Color(38, 38, 38));
        cancelBT.setText("CANCEL");
        cancelBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTActionPerformed(evt);
            }
        });

        createTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 43)); // NOI18N
        createTitle.setForeground(new java.awt.Color(255, 255, 255));
        createTitle.setText("FORGOT PASSWORD");

        divider3.setBackground(new java.awt.Color(251, 215, 9));

        javax.swing.GroupLayout divider3Layout = new javax.swing.GroupLayout(divider3);
        divider3.setLayout(divider3Layout);
        divider3Layout.setHorizontalGroup(
            divider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        divider3Layout.setVerticalGroup(
            divider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        userL2.setForeground(new java.awt.Color(255, 255, 255));
        userL2.setText("Username");

        userTF.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        passL.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        passL.setForeground(new java.awt.Color(255, 255, 255));
        passL.setText("Password (minimum of 8 characters)");

        passTF.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        E1.setBackground(new java.awt.Color(255, 51, 51));
        E1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        E1.setForeground(new java.awt.Color(255, 51, 51));
        E1.setText("INVALID INPUT");

        E2.setBackground(new java.awt.Color(255, 51, 51));
        E2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        E2.setForeground(new java.awt.Color(255, 51, 51));
        E2.setText("INVALID INPUT");

        conpassTF.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        conPassL2.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        conPassL2.setForeground(new java.awt.Color(255, 255, 255));
        conPassL2.setText("Confirm Password");

        E3.setBackground(new java.awt.Color(255, 51, 51));
        E3.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        E3.setForeground(new java.awt.Color(255, 51, 51));
        E3.setText("INVALID INPUT");

        javax.swing.GroupLayout logPageLayout = new javax.swing.GroupLayout(logPage);
        logPage.setLayout(logPageLayout);
        logPageLayout.setHorizontalGroup(
            logPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logPageLayout.createSequentialGroup()
                .addComponent(logoSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(logPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logPageLayout.createSequentialGroup()
                        .addGroup(logPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(logPageLayout.createSequentialGroup()
                                .addGroup(logPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conPassL2)
                                    .addComponent(passL))
                                .addGap(137, 137, 137))
                            .addGroup(logPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(logPageLayout.createSequentialGroup()
                                    .addGroup(logPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(userL2)
                                        .addComponent(userTF, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(E1))
                                .addGroup(logPageLayout.createSequentialGroup()
                                    .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(E2))
                                .addGroup(logPageLayout.createSequentialGroup()
                                    .addComponent(conpassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(E3))))
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logPageLayout.createSequentialGroup()
                        .addGroup(logPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(divider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(logPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(logPageLayout.createSequentialGroup()
                                    .addComponent(cancelBT, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passConfirmBT, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(divider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logPageLayout.createSequentialGroup()
                        .addComponent(createTitle)
                        .addGap(99, 99, 99))))
        );
        logPageLayout.setVerticalGroup(
            logPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logPageLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(createTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(divider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userL2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(logPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(logPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conPassL2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(logPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conpassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(logPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passConfirmBT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(divider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout logBackgroundLayout = new javax.swing.GroupLayout(logBackground);
        logBackground.setLayout(logBackgroundLayout);
        logBackgroundLayout.setHorizontalGroup(
            logBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logBackgroundLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(logPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );
        logBackgroundLayout.setVerticalGroup(
            logBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logBackgroundLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(logPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void cancelBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTActionPerformed
        this.dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_cancelBTActionPerformed

    private void passConfirmBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passConfirmBTActionPerformed
        forgotPassValidation fpVal = new forgotPassValidation();
        fpVal.val(userTF, passTF, conpassTF, E1, E2, E3);
        String user = userTF.getText();
        String newPass = passTF.getText();
        
        try
        {
            String dbUser = "root";
            String dbPassword = "root";
            String dbURL ="jdbc:mysql://localhost:3306/connectdb";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(dbURL, dbUser, dbPassword);

            
            if(!E1.isVisible())
            {
                //verify that username is existing
                String searchUser = "Select username from accounts where username='"+userTF.getText()+"'";
                PreparedStatement userSearch = connect.prepareStatement(searchUser);
            
                ResultSet res = userSearch.executeQuery();
 
                //if username is existing
                while(res.next())
                {
                    if(user.equals(res.getString("username")))
                    {
                        
                        //verify if password and confirm password are same
                        //if same
                        if(!E3.isVisible())
                        {
                            //change password
                            try
                            {
                                String updatePassword = "UPDATE accounts SET password='"+newPass+"' WHERE username='"+user+"'";
                                PreparedStatement changePassword = connect.prepareCall(updatePassword);
                                changePassword.execute();
                                
                                JOptionPane.showMessageDialog(null, "Password changed successfully.");
                            
                            }
                            
                            catch(Exception e)
                            {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }
            
                    //if not same
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Password doesn't match.");
                        }
                   }
                   
                   //if username is not existing
                   else
                   {
                        JOptionPane.showMessageDialog(null, "Incorrect username. Please try again.");
                   }
                }
                
                
            }


        }
        
        catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(connectDB.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        catch (SQLException ex) 
        {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_passConfirmBTActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E2;
    private javax.swing.JLabel E3;
    private javax.swing.JButton cancelBT;
    private javax.swing.JLabel conPassL2;
    private javax.swing.JTextField conpassTF;
    private javax.swing.JLabel createTitle;
    private javax.swing.JLabel description1;
    private javax.swing.JLabel description2;
    private javax.swing.JPanel divider2;
    private javax.swing.JPanel divider3;
    private javax.swing.JPanel logBackground;
    private javax.swing.JPanel logPage;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel logoSide;
    private javax.swing.JButton passConfirmBT;
    private javax.swing.JLabel passL;
    private javax.swing.JTextField passTF;
    private javax.swing.JLabel userL2;
    private javax.swing.JTextField userTF;
    // End of variables declaration//GEN-END:variables
}
