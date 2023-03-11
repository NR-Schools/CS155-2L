package View;

import Model.GoalModel;
import java.util.*;
import Model.ProductSummary;
import Repository.RepositoryProvider;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class RecordView extends javax.swing.JFrame {
    
    private final RepositoryProvider provider;
    private GoalModel userGoal;
    
    boolean isAchievedPopupShown = false;
    
    public RecordView() {
        initComponents(); 
        CustomUIAdjustments();
        provider = new RepositoryProvider();
        
        checkForUserGoal();
        showDate();
        showTime();
    }
    
    private void CustomUIAdjustments() {
        logoSide.setBackground(new Color(251,215,9,255));
        Border noBorder = new LineBorder(new Color(251,215,9,255));
        
        jLabel33.setVisible(false);
        jLabel47.setVisible(false);
        jLabel32.setVisible(false);
        jLabel35.setVisible(false);
        jLabel34.setVisible(false);
        PPPoverallSales.setVisible(false);
        PPPoverallProfit.setVisible(false);
        PPPtotalSold.setVisible(false);
        
        jLabel40.setVisible(false);
        jLabel48.setVisible(false);
        jLabel39.setVisible(false);
        jLabel41.setVisible(false);
        jLabel42.setVisible(false);
        CPPoverallSales.setVisible(false);
        CPPoverallProfit.setVisible(false);
        CPPtotalSold.setVisible(false);

        targetForm.setVisible(false);
        newGoalButton.setVisible(false);
        E1.setVisible(false);
        E2.setVisible(false);
        JTextFieldDateEditor editor = (JTextFieldDateEditor)dateChooser.getDateEditor();
        editor.setEditable(false);
    }
    
    private void showDate(){
        String dateStr = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
        curr_date.setText(dateStr);
    }
    private void showTime(){
        new Timer(1000, (ActionEvent action) -> {
            String timeStr = new SimpleDateFormat("hh:mm aa").format(new Date());
            curr_time.setText(timeStr);
            
            checkUserGoalAchieve();
        }).start();
    }
    
    private void checkForUserGoal() {
        userGoal = provider.getGoalRepo().getCurrentGoal();
        
        if (userGoal == null) {
            // No Goal Selected!!
            // Show targetForm
            E1.setVisible(false);
            E2.setVisible(false);
            goalPanel1.setVisible(false);
            targetForm.setVisible(true);
            setGoalButton.setVisible(true);
            newGoalButton.setVisible(false);
            targetSales.setText(null);
            dateChooser.setDate(null);
            return;
        }
        
        // There is a goal
        targetForm.setVisible(false);
        goalPanel1.setVisible(true);
        newGoalButton.setVisible(true);
        
        LocalDateTime dateTime = userGoal.getDeadlineDate().toLocalDateTime();
        String dateFormatted = dateTime.toLocalDate().format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        String timeFormatted = dateTime.toLocalTime().format(DateTimeFormatter.ofPattern("hh:mm a"));
        targetDate.setText(dateFormatted);
        targetTime.setText(timeFormatted);
        curSales.setText(Double.toString(userGoal.getCurrentSales()));
        toSales.setText(Double.toString(userGoal.getTargetSales()));
        goalStatus.setText(userGoal.getStatusString());
    }
    private void checkUserGoalAchieve() {
        // Check for userGoal <Can move this to a separate timer or thread object>
        if(userGoal == null) return;
        LocalDateTime currentDateTime = LocalDateTime.now();
        
        boolean isFinished = false;
        
        // Check if finised
        if(userGoal.getDeadlineDate().toLocalDateTime().isAfter(currentDateTime)) return;
        
        if(!isAchievedPopupShown) {
            
            if(userGoal.getCurrentSales() < userGoal.getTargetSales()) {
                JOptionPane.showMessageDialog(rootPane, "YOU HAVE REACHED YOUR GOAL CONGRATULATION! :>");
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "YOU HAVE NOT REACHED YOUR GOAL! :<");
            }
            
            isAchievedPopupShown = true;
            
            // Update DB
            userGoal.setStatus(GoalModel.GoalStatus.Achieved);
            provider.getGoalRepo().UpdateGoal(userGoal);

            // Update UI
            checkForUserGoal();
        }
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
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        curr_time = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        curr_date = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logoSide6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        newGoalButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        targetForm = new javax.swing.JPanel();
        targetSales = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        setGoalButton = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();
        E1 = new javax.swing.JLabel();
        hourSP = new javax.swing.JSpinner();
        minutesSP = new javax.swing.JSpinner();
        jLabel26 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        dayTimeCB = new javax.swing.JComboBox<>();
        goalPanel1 = new javax.swing.JPanel();
        goalStatus = new javax.swing.JLabel();
        targetDate = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        curSales = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        toSales = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        targetTime = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        logoSide5 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        PPPtotalSold = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        PPPoverallSales = new javax.swing.JLabel();
        PPPoverallProfit = new javax.swing.JLabel();
        PPPview = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        CPPtotalSold = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        CPPoverallSales = new javax.swing.JLabel();
        CPPoverallProfit = new javax.swing.JLabel();
        CPPview1 = new javax.swing.JButton();
        logoSide7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel44 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

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

        addRecord.setBackground(new java.awt.Color(251, 215, 9));
        addRecord.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        addRecord.setForeground(new java.awt.Color(38, 38, 38));
        addRecord.setText("ADD RECORD");
        addRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addRecord.setFocusPainted(false);
        addRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addRecordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addRecordMouseExited(evt);
            }
        });
        addRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecordActionPerformed(evt);
            }
        });
        logoSide1.add(addRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 140, 43));

        viewRecord.setBackground(new java.awt.Color(38, 38, 38));
        viewRecord.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        viewRecord.setForeground(new java.awt.Color(251, 215, 9));
        viewRecord.setText("VIEW RECORD");
        viewRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        viewRecord.setFocusPainted(false);
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
        jLabel11.setText("You are currently viewing the records");
        logoSide3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 360, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/waveHand.png"))); // NOI18N
        logoSide3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("Marie's Printing Services Sales Management System");
        logoSide3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 870, -1));

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("TIME:");
        logoSide3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 60, 40, -1));

        curr_time.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        curr_time.setForeground(new java.awt.Color(255, 255, 255));
        curr_time.setText("0");
        logoSide3.add(curr_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 60, 90, -1));

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("DATE:");
        logoSide3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 40, -1));

        curr_date.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        curr_date.setForeground(new java.awt.Color(255, 255, 255));
        curr_date.setText("0");
        logoSide3.add(curr_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 30, 90, -1));

        jPanel7.setBackground(new java.awt.Color(251, 215, 9));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        logoSide3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 10, -1));

        logBackground.add(logoSide3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 1170, 100));

        jLabel1.setBackground(new java.awt.Color(142, 149, 153));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Summary");
        logBackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/user_profile.png"))); // NOI18N
        logBackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 90, 90));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("PRODUCT RECORDS");
        logBackground.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 190, 40));

        logoSide6.setBackground(new java.awt.Color(38, 38, 38));
        logoSide6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(251, 215, 9));
        jPanel2.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(38, 38, 38));
        jLabel10.setText("SALES GOALS");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(30, 20, 200, 38);

        newGoalButton.setBackground(new java.awt.Color(38, 38, 38));
        newGoalButton.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        newGoalButton.setForeground(new java.awt.Color(255, 255, 255));
        newGoalButton.setText("NEW GOAL");
        newGoalButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        newGoalButton.setFocusPainted(false);
        newGoalButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newGoalButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newGoalButtonMouseExited(evt);
            }
        });
        newGoalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGoalButtonActionPerformed(evt);
            }
        });
        jPanel2.add(newGoalButton);
        newGoalButton.setBounds(350, 20, 110, 30);

        jPanel6.setBackground(new java.awt.Color(251, 215, 9));
        jPanel6.setLayout(new java.awt.CardLayout());

        targetForm.setBackground(new java.awt.Color(251, 215, 9));
        targetForm.setLayout(null);

        targetSales.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        targetForm.add(targetSales);
        targetSales.setBounds(140, 50, 170, 40);

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(38, 38, 38));
        jLabel24.setText("PHP");
        targetForm.add(jLabel24);
        jLabel24.setBounds(100, 60, 26, 18);

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(38, 38, 38));
        jLabel25.setText(":");
        targetForm.add(jLabel25);
        jLabel25.setBounds(290, 160, 30, 18);

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(38, 38, 38));
        jLabel23.setText(" TARGET SALES");
        targetForm.add(jLabel23);
        jLabel23.setBounds(170, 20, 100, 18);

        cancelButton.setBackground(new java.awt.Color(38, 38, 38));
        cancelButton.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("CANCEL");
        cancelButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cancelButton.setFocusPainted(false);
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelButtonMouseExited(evt);
            }
        });
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        targetForm.add(cancelButton);
        cancelButton.setBounds(90, 220, 110, 30);

        setGoalButton.setBackground(new java.awt.Color(38, 38, 38));
        setGoalButton.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        setGoalButton.setForeground(new java.awt.Color(255, 255, 255));
        setGoalButton.setText("SET GOAL");
        setGoalButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setGoalButton.setFocusPainted(false);
        setGoalButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setGoalButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setGoalButtonMouseExited(evt);
            }
        });
        setGoalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setGoalButtonActionPerformed(evt);
            }
        });
        targetForm.add(setGoalButton);
        setGoalButton.setBounds(230, 220, 110, 30);

        dateChooser.setToolTipText("Calendar");
        dateChooser.setDateFormatString("MM-dd-yyyy");
        targetForm.add(dateChooser);
        dateChooser.setBounds(0, 150, 200, 40);
        dateChooser.getAccessibleContext().setAccessibleName("");

        E1.setBackground(new java.awt.Color(255, 51, 51));
        E1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        E1.setForeground(new java.awt.Color(255, 51, 51));
        E1.setText("INVALID INPUT");
        targetForm.add(E1);
        E1.setBounds(140, 90, 74, 14);

        hourSP.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        targetForm.add(hourSP);
        hourSP.setBounds(220, 150, 45, 40);

        minutesSP.setModel(new javax.swing.SpinnerNumberModel(1, 1, 59, 1));
        targetForm.add(minutesSP);
        minutesSP.setBounds(300, 150, 45, 40);

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(38, 38, 38));
        jLabel26.setText("TARGET DATE TO BE ACHIEVED");
        targetForm.add(jLabel26);
        jLabel26.setBounds(120, 120, 220, 18);

        E2.setBackground(new java.awt.Color(255, 51, 51));
        E2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        E2.setForeground(new java.awt.Color(255, 51, 51));
        E2.setText("INVALID INPUT");
        targetForm.add(E2);
        E2.setBounds(0, 190, 74, 14);

        dayTimeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PM", "AM" }));
        dayTimeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayTimeCBActionPerformed(evt);
            }
        });
        targetForm.add(dayTimeCB);
        dayTimeCB.setBounds(370, 150, 60, 40);

        jPanel6.add(targetForm, "card2");

        goalPanel1.setBackground(new java.awt.Color(251, 215, 9));
        goalPanel1.setLayout(null);

        goalStatus.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        goalStatus.setForeground(new java.awt.Color(38, 38, 38));
        goalStatus.setText("NOT ACHIEVED");
        goalPanel1.add(goalStatus);
        goalStatus.setBounds(0, 90, 100, 20);

        targetDate.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        targetDate.setForeground(new java.awt.Color(38, 38, 38));
        targetDate.setText("MM-dd-yyyy");
        goalPanel1.add(targetDate);
        targetDate.setBounds(0, 20, 90, 20);

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(38, 38, 38));
        jLabel14.setText("CURRENT SALES");
        goalPanel1.add(jLabel14);
        jLabel14.setBounds(160, 40, 100, 18);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(38, 38, 38));
        jLabel9.setText("PHP");
        goalPanel1.add(jLabel9);
        jLabel9.setBounds(150, 70, 80, 36);

        curSales.setFont(new java.awt.Font("Trebuchet MS", 0, 30)); // NOI18N
        curSales.setForeground(new java.awt.Color(38, 38, 38));
        curSales.setText("0");
        goalPanel1.add(curSales);
        curSales.setBounds(240, 70, 210, 36);

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(38, 38, 38));
        jLabel18.setText(" TARGET SALES");
        goalPanel1.add(jLabel18);
        jLabel18.setBounds(160, 130, 100, 18);

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(38, 38, 38));
        jLabel17.setText("PHP");
        goalPanel1.add(jLabel17);
        jLabel17.setBounds(150, 160, 90, 36);

        toSales.setFont(new java.awt.Font("Trebuchet MS", 0, 30)); // NOI18N
        toSales.setForeground(new java.awt.Color(38, 38, 38));
        toSales.setText("0");
        goalPanel1.add(toSales);
        toSales.setBounds(240, 160, 210, 36);

        resetButton.setBackground(new java.awt.Color(38, 38, 38));
        resetButton.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 255, 255));
        resetButton.setText("RESET");
        resetButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        resetButton.setFocusPainted(false);
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetButtonMouseExited(evt);
            }
        });
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        goalPanel1.add(resetButton);
        resetButton.setBounds(160, 210, 110, 30);

        targetTime.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        targetTime.setForeground(new java.awt.Color(38, 38, 38));
        targetTime.setText("hh:mm aa");
        goalPanel1.add(targetTime);
        targetTime.setBounds(0, 40, 70, 20);

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(38, 38, 38));
        jLabel27.setText("TARGET DATE/TIME:");
        goalPanel1.add(jLabel27);
        jLabel27.setBounds(0, 0, 140, 20);

        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(38, 38, 38));
        jLabel28.setText("STATUS:");
        goalPanel1.add(jLabel28);
        jLabel28.setBounds(0, 70, 70, 20);

        jPanel6.add(goalPanel1, "card3");

        jPanel2.add(jPanel6);
        jPanel6.setBounds(30, 70, 430, 250);

        jPanel19.setBackground(new java.awt.Color(38, 38, 38));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel19);
        jPanel19.setBounds(30, 60, 430, 10);

        logoSide6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 480, 330));

        logBackground.add(logoSide6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 620, 520, 370));

        logoSide5.setBackground(new java.awt.Color(38, 38, 38));
        logoSide5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(251, 215, 9));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(251, 215, 9));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel14MouseExited(evt);
            }
        });
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(38, 38, 38));
        jLabel30.setText("PHOTO PAPER PRINTING");
        jPanel14.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel31.setBackground(new java.awt.Color(142, 149, 153));
        jLabel31.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("Hover for overall details");
        jPanel14.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 160, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/info.png"))); // NOI18N
        jPanel14.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, 40));

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 110));

        jPanel15.setBackground(new java.awt.Color(38, 38, 38));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 420, 10));

        jLabel32.setBackground(new java.awt.Color(142, 149, 153));
        jLabel32.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(38, 38, 38));
        jLabel32.setText("Total Sold:");
        jPanel13.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 70, 40));

        jLabel33.setBackground(new java.awt.Color(142, 149, 153));
        jLabel33.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(38, 38, 38));
        jLabel33.setText("Overall Sales:");
        jPanel13.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 40));

        jLabel47.setBackground(new java.awt.Color(142, 149, 153));
        jLabel47.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(38, 38, 38));
        jLabel47.setText("Overall Profit:");
        jPanel13.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, 40));

        jLabel34.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(38, 38, 38));
        jLabel34.setText("PHP");
        jPanel13.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        PPPtotalSold.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        PPPtotalSold.setForeground(new java.awt.Color(38, 38, 38));
        PPPtotalSold.setText("0");
        jPanel13.add(PPPtotalSold, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 40, -1));

        jLabel35.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(38, 38, 38));
        jLabel35.setText("PHP");
        jPanel13.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        PPPoverallSales.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        PPPoverallSales.setForeground(new java.awt.Color(38, 38, 38));
        PPPoverallSales.setText("0.00");
        jPanel13.add(PPPoverallSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        PPPoverallProfit.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        PPPoverallProfit.setForeground(new java.awt.Color(38, 38, 38));
        PPPoverallProfit.setText("0.00");
        jPanel13.add(PPPoverallProfit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        PPPview.setBackground(new java.awt.Color(38, 38, 38));
        PPPview.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        PPPview.setForeground(new java.awt.Color(255, 255, 255));
        PPPview.setText("SPECIFIC DETAILS");
        PPPview.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PPPview.setFocusPainted(false);
        PPPview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PPPviewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PPPviewMouseExited(evt);
            }
        });
        PPPview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPPviewActionPerformed(evt);
            }
        });
        jPanel13.add(PPPview, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 180, 70));

        logoSide5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 460, 270));

        jPanel16.setBackground(new java.awt.Color(251, 215, 9));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(251, 215, 9));
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel17MouseExited(evt);
            }
        });
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(38, 38, 38));
        jLabel36.setText("COSCARD/PHOTOCARD");
        jPanel17.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 420, -1));

        jLabel37.setBackground(new java.awt.Color(142, 149, 153));
        jLabel37.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("Hover for overall details");
        jPanel17.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 160, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/info.png"))); // NOI18N
        jPanel17.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 30, 40));

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 110));

        jPanel18.setBackground(new java.awt.Color(38, 38, 38));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 420, 10));

        jLabel39.setBackground(new java.awt.Color(142, 149, 153));
        jLabel39.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(38, 38, 38));
        jLabel39.setText("Total Sold:");
        jPanel16.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 70, 40));

        jLabel40.setBackground(new java.awt.Color(142, 149, 153));
        jLabel40.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(38, 38, 38));
        jLabel40.setText("Overall Sales:");
        jPanel16.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 40));

        jLabel48.setBackground(new java.awt.Color(142, 149, 153));
        jLabel48.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(38, 38, 38));
        jLabel48.setText("Overall Profit:");
        jPanel16.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, 40));

        jLabel41.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(38, 38, 38));
        jLabel41.setText("PHP");
        jPanel16.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        CPPtotalSold.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        CPPtotalSold.setForeground(new java.awt.Color(38, 38, 38));
        CPPtotalSold.setText("0");
        jPanel16.add(CPPtotalSold, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 30, -1));

        jLabel42.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(38, 38, 38));
        jLabel42.setText("PHP");
        jPanel16.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        CPPoverallSales.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        CPPoverallSales.setForeground(new java.awt.Color(38, 38, 38));
        CPPoverallSales.setText("0.00");
        jPanel16.add(CPPoverallSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        CPPoverallProfit.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        CPPoverallProfit.setForeground(new java.awt.Color(38, 38, 38));
        CPPoverallProfit.setText("0.00");
        jPanel16.add(CPPoverallProfit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        CPPview1.setBackground(new java.awt.Color(38, 38, 38));
        CPPview1.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        CPPview1.setForeground(new java.awt.Color(255, 255, 255));
        CPPview1.setText("SPECIFIC DETAILS");
        CPPview1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CPPview1.setFocusPainted(false);
        CPPview1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CPPview1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CPPview1MouseExited(evt);
            }
        });
        CPPview1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPPview1ActionPerformed(evt);
            }
        });
        jPanel16.add(CPPview1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 180, 70));

        logoSide5.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 460, 270));

        logBackground.add(logoSide5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 1170, 380));

        logoSide7.setBackground(new java.awt.Color(38, 38, 38));
        logoSide7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(38, 38, 38));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        logoSide7.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 540, 10));

        jPanel4.setBackground(new java.awt.Color(251, 215, 9));
        jPanel4.setLayout(null);

        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "PRODUCT NAME", "NO. OF SOLD", "SALES", "PROFIT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(table1);

        jScrollPane5.setViewportView(jScrollPane3);

        jPanel4.add(jScrollPane5);
        jScrollPane5.setBounds(30, 90, 540, 210);

        jLabel44.setBackground(new java.awt.Color(38, 38, 38));
        jLabel44.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(38, 38, 38));
        jLabel44.setText("PRINTING PRODUCT DETAILS");
        jPanel4.add(jLabel44);
        jLabel44.setBounds(30, 20, 427, 38);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/printer.png"))); // NOI18N
        jPanel4.add(jLabel8);
        jLabel8.setBounds(500, -10, 70, 80);

        logoSide7.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 600, 330));

        logBackground.add(logoSide7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 620, 640, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 1440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void addRecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRecordMouseEntered
        addRecord.setBackground(new Color(38,38,38,255));
        addRecord.setForeground(new Color(251,215,9,255));
    }//GEN-LAST:event_addRecordMouseEntered

    private void addRecordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRecordMouseExited
        addRecord.setBackground(new Color(251,215,9,255));
        addRecord.setForeground(new Color(38,38,38,255));
    }//GEN-LAST:event_addRecordMouseExited

    private void PPPviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPPviewActionPerformed
        // TODO add your handling code here:
        //jLabel44.setText("PHOTO PAPER PRINTING");

        // Request To DB
        ArrayList<ProductSummary> prod_sum_arr = provider.getProductRepo().getProductSummaries("Photopaper");

        // Aggregate to Single Value
        int TotalQty = 0;
        double TotalSales = 0;
        double TotalProfit = 0;

        DefaultTableModel tableModel = (DefaultTableModel)table1.getModel();
        tableModel.setRowCount(0);

        for( ProductSummary prod_sum : prod_sum_arr ) {
            tableModel.addRow(
                    new Object[]{
                        prod_sum.getProductId(),
                        prod_sum.getName(),
                        prod_sum.getQty(),
                        prod_sum.getSales(),
                        prod_sum.getProfit()
                    }
            );
        }
    }//GEN-LAST:event_PPPviewActionPerformed

    private void PPPviewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PPPviewMouseExited
        PPPview.setBackground(new Color(38,38,38,255));
        PPPview.setForeground(Color.WHITE);
    }//GEN-LAST:event_PPPviewMouseExited

    private void PPPviewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PPPviewMouseEntered
        PPPview.setBackground(Color.WHITE);
        PPPview.setForeground(new Color(38,38,38,255));
    }//GEN-LAST:event_PPPviewMouseEntered

    private void jPanel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseExited
        jLabel33.setVisible(false);
        jLabel47.setVisible(false);
        jLabel32.setVisible(false);
        jLabel35.setVisible(false);
        jLabel34.setVisible(false);
        PPPoverallSales.setVisible(false);
        PPPoverallProfit.setVisible(false);
        PPPtotalSold.setVisible(false);
        PPPview.setVisible(true);
        
    }//GEN-LAST:event_jPanel14MouseExited

    private void jPanel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseEntered
        jLabel33.setVisible(true);
        jLabel47.setVisible(true);
        jLabel32.setVisible(true);
        jLabel35.setVisible(true);
        jLabel34.setVisible(true);
        PPPoverallSales.setVisible(true);
        PPPoverallProfit.setVisible(true);
        PPPtotalSold.setVisible(true);
        PPPview.setVisible(false);
        
        // Request To DB
        ArrayList<ProductSummary> prod_sum_arr = provider.getProductRepo().getProductSummaries("Photopaper");

        // Aggregate to Single Value
        int TotalQty = 0;
        double TotalSales = 0;
        double TotalProfit = 0;

        for( ProductSummary prod_sum : prod_sum_arr ) {
            TotalQty += prod_sum.getQty();
            TotalSales += prod_sum.getSales();
            TotalProfit += prod_sum.getProfit();
        }

        // Show Totals
        PPPoverallSales.setText(Double.toString(TotalSales));
        PPPoverallProfit.setText(Double.toString(TotalProfit));
        PPPtotalSold.setText(Integer.toString(TotalQty));
    }//GEN-LAST:event_jPanel14MouseEntered

    private void setGoalButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setGoalButtonMouseExited
        setGoalButton.setBackground(new Color(38,38,38,255));
        setGoalButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_setGoalButtonMouseExited

    private void setGoalButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setGoalButtonMouseEntered
        setGoalButton.setBackground(Color.WHITE);
        setGoalButton.setForeground(new Color(38,38,38,255));
    }//GEN-LAST:event_setGoalButtonMouseEntered

    private void jPanel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseExited
        jLabel40.setVisible(false);
        jLabel48.setVisible(false);
        jLabel39.setVisible(false);
        jLabel41.setVisible(false);
        jLabel42.setVisible(false);
        CPPoverallSales.setVisible(false);
        CPPoverallProfit.setVisible(false);
        CPPtotalSold.setVisible(false);
        CPPview1.setVisible(true);
        
    }//GEN-LAST:event_jPanel17MouseExited

    private void jPanel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseEntered
        jLabel40.setVisible(true);
        jLabel48.setVisible(true);
        jLabel39.setVisible(true);
        jLabel41.setVisible(true);
        jLabel42.setVisible(true);
        CPPoverallSales.setVisible(true);
        CPPoverallProfit.setVisible(true);
        CPPtotalSold.setVisible(true);
        CPPview1.setVisible(false);
        
        // Request To DB
        ArrayList<ProductSummary> prod_sum_arr = provider.getProductRepo().getProductSummaries("Photocard");

        // Aggregate to Single Value
        int TotalQty = 0;
        double TotalSales = 0;
        double TotalProfit = 0;

        for( ProductSummary prod_sum : prod_sum_arr ) {
            TotalQty += prod_sum.getQty();
            TotalSales += prod_sum.getSales();
            TotalProfit += prod_sum.getProfit();
        }

        // Show Totals
        CPPoverallSales.setText(Double.toString(TotalSales));
        CPPoverallProfit.setText(Double.toString(TotalProfit));
        CPPtotalSold.setText(Integer.toString(TotalQty));
    }//GEN-LAST:event_jPanel17MouseEntered

    private void addRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecordActionPerformed
        this.setVisible(false);
        new AddRecordView().setVisible(true);
    }//GEN-LAST:event_addRecordActionPerformed

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

    private void CPPview1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPPview1MouseEntered
        CPPview1.setBackground(Color.WHITE);
        CPPview1.setForeground(new Color(38,38,38,255));
    }//GEN-LAST:event_CPPview1MouseEntered

    private void CPPview1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPPview1MouseExited
        CPPview1.setBackground(new Color(38,38,38,255));
        CPPview1.setForeground(Color.WHITE);
    }//GEN-LAST:event_CPPview1MouseExited

    private void CPPview1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPPview1ActionPerformed
        //jLabel44.setText("COSCARD/PHOTOCARD");
        
        // Request To DB
        ArrayList<ProductSummary> prod_sum_arr = provider.getProductRepo().getProductSummaries("Photocard");

        // Aggregate to Single Value
        int TotalQty = 0;
        double TotalSales = 0;
        double TotalProfit = 0;

        DefaultTableModel tableModel = (DefaultTableModel)table1.getModel();
        tableModel.setRowCount(0);

        for( ProductSummary prod_sum : prod_sum_arr ) {
            tableModel.addRow(
                    new Object[]{
                        prod_sum.getProductId(),
                        prod_sum.getName(),
                        prod_sum.getQty(),
                        prod_sum.getSales(),
                        prod_sum.getProfit()
                    }
            );
        }
    }//GEN-LAST:event_CPPview1ActionPerformed

    private void setGoalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setGoalButtonActionPerformed

        // Check Inputs
        boolean isValid = true;
        E1.setVisible(false);
        E2.setVisible(false);
        
        Calendar selectedDate = dateChooser.getCalendar();
        int targetSalesEntered = 0;
        
        if(selectedDate == null){
            E2.setVisible(true);
            isValid = false;
        }
        
        try{
            targetSalesEntered = Integer.parseInt(targetSales.getText());
        }catch(NumberFormatException ex){
            E1.setVisible(true);
            isValid = false;
        }
        
        if (!isValid) return;
        
        // Adjust Values
        int hours = (Integer)hourSP.getValue();
        int minutes = (Integer)minutesSP.getValue();
        if ("PM".equals(dayTimeCB.getSelectedItem().toString())) hours += 12;
        
        
        // Set Goal
        LocalDateTime dateTime = LocalDateTime.of(
                selectedDate.get(Calendar.YEAR),
                selectedDate.get(Calendar.MONTH),
                selectedDate.get(Calendar.DAY_OF_MONTH),
                hours,
                minutes
        );
        
        
        // Construct Goal
        GoalModel goal = new GoalModel();
        goal.setStatus(GoalModel.GoalStatus.NotAchieved);
        goal.setTargetSales(targetSalesEntered);
        goal.setCurrentSales(0);
        goal.setEntryDate(new Timestamp(new java.util.Date().getTime()));
        goal.setDeadlineDate(Timestamp.valueOf(dateTime));
        
        
        // Submit to Database
        provider.getGoalRepo().SetGoal(goal);
        userGoal = goal;
        
        
        // Show UI                
        String dateFormatted = dateTime.toLocalDate().format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        String timeFormatted = dateTime.toLocalTime().format(DateTimeFormatter.ofPattern("hh:mm a"));
        targetDate.setText(dateFormatted);
        targetTime.setText(timeFormatted);
        toSales.setText(targetSales.getText());
        goalStatus.setText(goal.getStatusString());
        
        goalPanel1.setVisible(true);
        targetForm.setVisible(false);
        setGoalButton.setVisible(false);
        newGoalButton.setVisible(true);
    }//GEN-LAST:event_setGoalButtonActionPerformed

    private void newGoalButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGoalButtonMouseEntered
        newGoalButton.setBackground(Color.WHITE);
        newGoalButton.setForeground(new Color(38,38,38,255));
    }//GEN-LAST:event_newGoalButtonMouseEntered

    private void newGoalButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGoalButtonMouseExited
        newGoalButton.setBackground(new Color(38,38,38,255));
        newGoalButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_newGoalButtonMouseExited

    private void newGoalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGoalButtonActionPerformed
        goalPanel1.setVisible(false);
        targetForm.setVisible(true);
        setGoalButton.setVisible(true);
        newGoalButton.setVisible(false);
        E1.setVisible(false);
        E2.setVisible(false);
        targetSales.setText(null);
        dateChooser.setDate(null);
        
    }//GEN-LAST:event_newGoalButtonActionPerformed

    private void cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseEntered
        cancelButton.setBackground(Color.WHITE);
        cancelButton.setForeground(new Color(38,38,38,255));
    }//GEN-LAST:event_cancelButtonMouseEntered

    private void cancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseExited
        cancelButton.setBackground(new Color(38,38,38,255));
        cancelButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_cancelButtonMouseExited

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        targetForm.setVisible(false);
        goalPanel1.setVisible(true);
        newGoalButton.setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void resetButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseEntered
        resetButton.setBackground(Color.WHITE);
        resetButton.setForeground(new Color(38,38,38,255));
    }//GEN-LAST:event_resetButtonMouseEntered

    private void resetButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseExited
        resetButton.setBackground(new Color(38,38,38,255));
        resetButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_resetButtonMouseExited

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        //toSales.setText("0");
        //targetDate.setText("MM-dd-yyyy");
        //targetTime.setText("hh:mm aa");
        //goalStatus.setText("Not achieved");
        
        // Remove Goal
        provider.getGoalRepo().RemoveGoal(userGoal);
        
        // Adjust UI
        checkForUserGoal();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void dayTimeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayTimeCBActionPerformed
        
    }//GEN-LAST:event_dayTimeCBActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecordView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPPoverallProfit;
    private javax.swing.JLabel CPPoverallSales;
    private javax.swing.JLabel CPPtotalSold;
    private javax.swing.JButton CPPview1;
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E2;
    private javax.swing.JLabel PPPoverallProfit;
    private javax.swing.JLabel PPPoverallSales;
    private javax.swing.JLabel PPPtotalSold;
    private javax.swing.JButton PPPview;
    private javax.swing.JButton addRecord;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel curSales;
    private javax.swing.JLabel curr_date;
    private javax.swing.JLabel curr_time;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JComboBox<String> dayTimeCB;
    private javax.swing.JPanel goalPanel1;
    private javax.swing.JLabel goalStatus;
    private javax.swing.JSpinner hourSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel logBackground;
    private javax.swing.JPanel logoSide;
    private javax.swing.JPanel logoSide1;
    private javax.swing.JPanel logoSide3;
    private javax.swing.JPanel logoSide5;
    private javax.swing.JPanel logoSide6;
    private javax.swing.JPanel logoSide7;
    private javax.swing.JSpinner minutesSP;
    private javax.swing.JButton newGoalButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton setGoalButton;
    private javax.swing.JButton signOut;
    private javax.swing.JTable table1;
    private javax.swing.JLabel targetDate;
    private javax.swing.JPanel targetForm;
    public javax.swing.JTextField targetSales;
    private javax.swing.JLabel targetTime;
    public javax.swing.JLabel toSales;
    private javax.swing.JButton viewRecord;
    // End of variables declaration//GEN-END:variables
}
