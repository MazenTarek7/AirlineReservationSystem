/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skyscanner;

import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import static skyscanner.PassengerForm.passportNum;

/**
 *
 * @author mizo_
 */
public class Passenger_UpdateInfo extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    String number = passportNum;
    
    int xMouse;
    int yMouse;
    
    
    public Passenger_UpdateInfo() {
        initComponents();
        showTableData();
        System.out.println(passportNum);
        System.out.println(number);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exitUpdateWindow = new javax.swing.JLabel();
        minimizeUpdateWindow = new javax.swing.JLabel();
        mouseDrag = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        passportNoField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lnameField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        usernameField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        passwordField = new javax.swing.JTextField();
        nationalityField = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        dobField = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        genderField = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        emailField = new javax.swing.JTextField();
        phoneNoField = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        fnameField = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        updateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.darkGray);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skyscanner/Logo.png"))); // NOI18N
        jLabel1.setText("Skyscanner");

        exitUpdateWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skyscanner/passengerFormImages/icons8_close_window_30px.png"))); // NOI18N
        exitUpdateWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitUpdateWindowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitUpdateWindowMouseEntered(evt);
            }
        });

        minimizeUpdateWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skyscanner/passengerFormImages/icons8_minimize_window_30px.png"))); // NOI18N
        minimizeUpdateWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeUpdateWindowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeUpdateWindowMouseEntered(evt);
            }
        });

        mouseDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mouseDragMouseDragged(evt);
            }
        });
        mouseDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mouseDragMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(mouseDrag, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(minimizeUpdateWindow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitUpdateWindow))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(mouseDrag, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minimizeUpdateWindow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitUpdateWindow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 70));

        jSeparator1.setBackground(java.awt.Color.darkGray);
        jSeparator1.setForeground(java.awt.Color.darkGray);
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 10, 650));

        Table.setBackground(java.awt.Color.darkGray);
        Table.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Table.setForeground(new java.awt.Color(255, 255, 255));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 630, 510));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PassportNo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nationality:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date of Birth:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gender:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PhoneNo:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, -1, -1));

        passportNoField.setBackground(new java.awt.Color(102, 102, 102));
        passportNoField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        passportNoField.setText("PassportNo");
        passportNoField.setBorder(null);
        jPanel1.add(passportNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 150, -1));

        jSeparator2.setBackground(java.awt.Color.darkGray);
        jSeparator2.setForeground(java.awt.Color.darkGray);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 132, 150, 10));

        lnameField.setBackground(new java.awt.Color(102, 102, 102));
        lnameField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lnameField.setText("Lname");
        lnameField.setBorder(null);
        lnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(lnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 100, -1));

        jSeparator3.setBackground(java.awt.Color.darkGray);
        jSeparator3.setForeground(java.awt.Color.darkGray);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 90, 10));

        usernameField.setBackground(new java.awt.Color(102, 102, 102));
        usernameField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        usernameField.setText("Username");
        usernameField.setBorder(null);
        jPanel1.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 150, -1));

        jSeparator4.setBackground(java.awt.Color.darkGray);
        jSeparator4.setForeground(java.awt.Color.darkGray);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 150, 10));

        jSeparator5.setBackground(java.awt.Color.darkGray);
        jSeparator5.setForeground(java.awt.Color.darkGray);
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 150, 10));

        passwordField.setBackground(new java.awt.Color(102, 102, 102));
        passwordField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        passwordField.setText("Password");
        passwordField.setBorder(null);
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 150, -1));

        nationalityField.setBackground(new java.awt.Color(102, 102, 102));
        nationalityField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nationalityField.setText("Nationality");
        nationalityField.setBorder(null);
        jPanel1.add(nationalityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 150, -1));

        jSeparator6.setBackground(java.awt.Color.darkGray);
        jSeparator6.setForeground(java.awt.Color.darkGray);
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 150, 10));

        dobField.setBackground(new java.awt.Color(102, 102, 102));
        dobField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        dobField.setText("DOB");
        dobField.setBorder(null);
        jPanel1.add(dobField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 150, -1));

        jSeparator7.setBackground(java.awt.Color.darkGray);
        jSeparator7.setForeground(java.awt.Color.darkGray);
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 150, 10));

        jSeparator8.setBackground(java.awt.Color.darkGray);
        jSeparator8.setForeground(java.awt.Color.darkGray);
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 150, 10));

        genderField.setBackground(new java.awt.Color(102, 102, 102));
        genderField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        genderField.setText("Gender");
        genderField.setBorder(null);
        jPanel1.add(genderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 150, -1));

        jSeparator9.setBackground(java.awt.Color.darkGray);
        jSeparator9.setForeground(java.awt.Color.darkGray);
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 150, 10));

        emailField.setBackground(new java.awt.Color(102, 102, 102));
        emailField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        emailField.setText("Email");
        emailField.setBorder(null);
        jPanel1.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 150, -1));

        phoneNoField.setBackground(new java.awt.Color(102, 102, 102));
        phoneNoField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        phoneNoField.setText("PhoneNo");
        phoneNoField.setBorder(null);
        jPanel1.add(phoneNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 640, 150, -1));

        jSeparator10.setBackground(java.awt.Color.darkGray);
        jSeparator10.setForeground(java.awt.Color.darkGray);
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 660, 150, 10));

        fnameField.setBackground(new java.awt.Color(102, 102, 102));
        fnameField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fnameField.setText("Fname");
        fnameField.setBorder(null);
        fnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(fnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 100, -1));

        jSeparator11.setBackground(java.awt.Color.darkGray);
        jSeparator11.setForeground(java.awt.Color.darkGray);
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 90, 10));

        updateBtn.setBackground(new java.awt.Color(0, 0, 0));
        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateBtnMouseEntered(evt);
            }
        });
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 660, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitUpdateWindowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitUpdateWindowMouseEntered
        exitUpdateWindow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_exitUpdateWindowMouseEntered

    private void exitUpdateWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitUpdateWindowMouseClicked
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION){
            this.setVisible(false);
        }
        else if (response == JOptionPane.NO_OPTION){
            
        }
    }//GEN-LAST:event_exitUpdateWindowMouseClicked

    private void minimizeUpdateWindowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeUpdateWindowMouseEntered
        minimizeUpdateWindow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_minimizeUpdateWindowMouseEntered

    private void minimizeUpdateWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeUpdateWindowMouseClicked
        this.setExtendedState(Passenger_UpdateInfo.ICONIFIED);
    }//GEN-LAST:event_minimizeUpdateWindowMouseClicked

    private void mouseDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseDragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_mouseDragMousePressed

    private void mouseDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseDragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse , y - yMouse);
    }//GEN-LAST:event_mouseDragMouseDragged

    private void lnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameFieldActionPerformed

    private void fnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameFieldActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        DefaultTableModel model = (DefaultTableModel)Table.getModel();
        int selectedRow = Table.getSelectedRow();
        
        passportNoField.setText(model.getValueAt(selectedRow, 0).toString());
        fnameField.setText(model.getValueAt(selectedRow, 1).toString());
        lnameField.setText(model.getValueAt(selectedRow, 2).toString());
        usernameField.setText(model.getValueAt(selectedRow, 3).toString());
        passwordField.setText(model.getValueAt(selectedRow, 4).toString());
        nationalityField.setText(model.getValueAt(selectedRow, 5).toString());
        dobField.setText(model.getValueAt(selectedRow, 6).toString());
        genderField.setText(model.getValueAt(selectedRow, 7).toString());
        emailField.setText(model.getValueAt(selectedRow, 8).toString());
        phoneNoField.setText(model.getValueAt(selectedRow, 9).toString());
    }//GEN-LAST:event_TableMouseClicked

    private void updateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseEntered
        updateBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_updateBtnMouseEntered

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int flag = 1;
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(emailField.getText());
        
        String phoneRegex = "^01[0125][0-9]{8}$";
        Pattern pattern2 = Pattern.compile(phoneRegex);
        Matcher match2 = pattern2.matcher(phoneNoField.getText());
        
        if (fnameField.getText().isBlank() == true || lnameField.getText().isBlank() == true || usernameField.getText().isBlank() == true || 
                passwordField.getText().isBlank() == true || nationalityField.getText().isBlank() == true || dobField.getText().isBlank()||
                genderField.getText().isBlank() == true || passportNoField.getText().isBlank() == true || emailField.getText().isBlank() == true ||
                phoneNoField.getText().isBlank() == true){
            JOptionPane.showMessageDialog(null, "Some fields are empty , please fill them and retry" , "ERROR" , JOptionPane.ERROR_MESSAGE);
            flag = 0;
        }
        
        if (!match.matches()){
            JOptionPane.showMessageDialog(null, "Incorrect email format , Please enter a valid email", "ERROR" , JOptionPane.ERROR_MESSAGE);
            flag = 0;
        }
        if (!match2.matches()){
            JOptionPane.showMessageDialog(null, "Incorrect Phone Number format , Please enter a valid Phone", "ERROR" , JOptionPane.ERROR_MESSAGE);
            flag = 0;
        }

        else if (flag == 1){
        try {
            String sql = "UPDATE `passenger` SET `Fname`=?,`Lname`=?,`Username`=?,`Password`=?,`Nationality`=?,`DOB`=?,`Gender`= ? WHERE PassportNo = ?";
            con = DriverManager.getConnection("jdbc:mysql://localhost/skyscanner","root","");
            pst = con.prepareStatement(sql);
            pst.setString(1, fnameField.getText());
            pst.setString(2, lnameField.getText());
            pst.setString(3, usernameField.getText());
            pst.setString(4, passwordField.getText());
            pst.setString(5, nationalityField.getText());
            pst.setString(6, dobField.getText());
            pst.setString(7, genderField.getText());
            pst.setString(8, passportNoField.getText());
            pst.executeUpdate();
            String sql2 = "UPDATE `passenger_contact` SET `Email`= ? ,`PhoneNo`= ? WHERE PassportNo = ?";
            pst = con.prepareStatement(sql2);
            pst.setString(1, emailField.getText());
            pst.setString(2, phoneNoField.getText());
            pst.setString(3, passportNoField.getText());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null , "Data updated successfully");
            
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error in updating data" , "ERROR" , JOptionPane.ERROR_MESSAGE);
        }
        showTableData();
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    public void showTableData(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/skyscanner","root","");
            String sql = "SELECT passenger.PassportNo , passenger.Fname , passenger.Lname , passenger.Username , passenger.Password , passenger.Nationality , passenger.DOB , passenger.Gender , passenger_contact.Email , passenger_contact.PhoneNo from passenger inner join passenger_contact on passenger.PassportNo = passenger_contact.PassportNo WHERE passenger.PassportNo = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1 , number);
            rs = pst.executeQuery();
            Table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error in displaying data" , "ERROR" , JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(Passenger_UpdateInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Passenger_UpdateInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Passenger_UpdateInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Passenger_UpdateInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Passenger_UpdateInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JTextField dobField;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel exitUpdateWindow;
    private javax.swing.JTextField fnameField;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField lnameField;
    private javax.swing.JLabel minimizeUpdateWindow;
    private javax.swing.JLabel mouseDrag;
    private javax.swing.JTextField nationalityField;
    private javax.swing.JTextField passportNoField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField phoneNoField;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}