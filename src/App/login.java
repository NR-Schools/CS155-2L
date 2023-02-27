package App;


import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class login extends javax.swing.JFrame {
    
    public login() {
        initComponents();
        E1.setVisible(false);
        E2.setVisible(false);
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
        loginTitle = new javax.swing.JLabel();
        userTF = new javax.swing.JTextField();
        createBT = new javax.swing.JButton();
        loginBT = new javax.swing.JButton();
        divider1 = new javax.swing.JPanel();
        userL = new javax.swing.JLabel();
        passL = new javax.swing.JLabel();
        divider2 = new javax.swing.JPanel();
        forgotBT = new javax.swing.JButton();
        passTF = new javax.swing.JPasswordField();
        E1 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();

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

        logPage.add(logoSide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        loginTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 43)); // NOI18N
        loginTitle.setForeground(new java.awt.Color(255, 255, 255));
        loginTitle.setText("LOGIN");
        logPage.add(loginTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 71, -1, 52));

        userTF.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        logPage.add(userTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 206, 258, 40));

        createBT.setBackground(new java.awt.Color(251, 215, 9));
        createBT.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        createBT.setForeground(new java.awt.Color(38, 38, 38));
        createBT.setText("SIGN-UP");
        createBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBTActionPerformed(evt);
            }
        });
        logPage.add(createBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 462, 150, 43));

        loginBT.setBackground(new java.awt.Color(251, 215, 9));
        loginBT.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        loginBT.setForeground(new java.awt.Color(38, 38, 38));
        loginBT.setText("LOGIN");
        loginBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTActionPerformed(evt);
            }
        });
        logPage.add(loginBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 364, 110, 43));

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

        userL.setForeground(new java.awt.Color(255, 255, 255));
        userL.setText("Username");
        logPage.add(userL, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 183, -1, -1));

        passL.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        passL.setForeground(new java.awt.Color(255, 255, 255));
        passL.setText("Password");
        logPage.add(passL, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 273, -1, -1));

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

        logPage.add(divider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 420, -1, -1));

        forgotBT.setBackground(new java.awt.Color(251, 215, 9));
        forgotBT.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        forgotBT.setForeground(new java.awt.Color(38, 38, 38));
        forgotBT.setText("FORGOT PASSWORD");
        forgotBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotBTActionPerformed(evt);
            }
        });
        logPage.add(forgotBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 523, 170, 43));

        passTF.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        logPage.add(passTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 296, 258, 40));

        E1.setBackground(new java.awt.Color(255, 51, 51));
        E1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        E1.setForeground(new java.awt.Color(255, 51, 51));
        E1.setText("INVALID INPUT");
        logPage.add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, -1));

        E2.setBackground(new java.awt.Color(255, 51, 51));
        E2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        E2.setForeground(new java.awt.Color(255, 51, 51));
        E2.setText("INVALID INPUT");
        logPage.add(E2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, -1));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logBackgroundLayout.createSequentialGroup()
                .addContainerGap(212, Short.MAX_VALUE)
                .addComponent(logPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(logBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBTActionPerformed
        this.dispose();
        new createAccount().setVisible(true);
    }//GEN-LAST:event_createBTActionPerformed

    private void forgotBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotBTActionPerformed
        this.dispose();
        new forgotPassword().setVisible(true);
    }//GEN-LAST:event_forgotBTActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void loginBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBTActionPerformed
       logValidation logVal = new logValidation();
       
       logVal.val(userTF,passTF,E1,E2);
      
       String pass = passTF.getText();
       String user = userTF.getText();
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
                        //verify password
                        try
                        {
                            String searchPass = "Select username,password from accounts where username='"+userTF.getText()+"'";
                            PreparedStatement passSearch = connect.prepareStatement(searchPass);
                            ResultSet rs = passSearch.executeQuery();
                
                            while(rs.next())
                            {
                                //if password is correct
                                if(pass.equals(rs.getString("password")))
                                {
                                    JOptionPane.showMessageDialog(null, "Login Successfully.");
                                    this.dispose();
                                    new RecordViewing().setVisible(true);
                                }
                    
                                
                                //if password is incorrect
                                else
                                {
                                    JOptionPane.showMessageDialog(null, "Incorrect password. Please try again."); 
                                }
                            }



                        }
                    
                        catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(null, e);
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
    }//GEN-LAST:event_loginBTActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E2;
    private javax.swing.JButton createBT;
    private javax.swing.JLabel description1;
    private javax.swing.JLabel description2;
    private javax.swing.JPanel divider1;
    private javax.swing.JPanel divider2;
    private javax.swing.JButton forgotBT;
    private javax.swing.JPanel logBackground;
    private javax.swing.JPanel logPage;
    private javax.swing.JButton loginBT;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel logoSide;
    private javax.swing.JLabel passL;
    private javax.swing.JPasswordField passTF;
    private javax.swing.JLabel userL;
    private javax.swing.JTextField userTF;
    // End of variables declaration//GEN-END:variables
}
