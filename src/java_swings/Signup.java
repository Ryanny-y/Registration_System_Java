package java_swings;

import configs.DbConnection;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Signup extends javax.swing.JFrame {

    private DbConnection dbConn = new DbConnection();

    public Signup() {
        initComponents();

        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_Bg1 = new java_swings.Login_Bg();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fname_field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mname_field = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lname_field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        age_field = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sex_field = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        signup_btn = new javax.swing.JButton();
        login_link = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Signup To Register Course");

        jLabel3.setFont(new java.awt.Font("Modern No. 20", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name");

        fname_field.setBackground(new java.awt.Color(240, 240, 240));
        fname_field.setText("Mark Niel");
        fname_field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        fname_field.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Modern No. 20", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Middle Name");

        mname_field.setBackground(new java.awt.Color(240, 240, 240));
        mname_field.setText("Matre");
        mname_field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        mname_field.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Modern No. 20", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last Name");

        lname_field.setBackground(new java.awt.Color(240, 240, 240));
        lname_field.setText("Maute");
        lname_field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        lname_field.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Modern No. 20", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Age");

        age_field.setBackground(new java.awt.Color(240, 240, 240));
        age_field.setText("19");
        age_field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        age_field.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("Modern No. 20", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sex");

        sex_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel8.setFont(new java.awt.Font("Modern No. 20", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Birth Date");

        signup_btn.setBackground(new java.awt.Color(218, 73, 73));
        signup_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signup_btn.setForeground(new java.awt.Color(255, 255, 255));
        signup_btn.setText("Signup");
        signup_btn.setBorder(null);
        signup_btn.setBorderPainted(false);
        signup_btn.setFocusPainted(false);
        signup_btn.setFocusable(false);
        signup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_btnActionPerformed(evt);
            }
        });

        login_link.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login_link.setForeground(new java.awt.Color(255, 255, 255));
        login_link.setBorder(null);
        login_link.setBorderPainted(false);
        login_link.setContentAreaFilled(false);
        login_link.setFocusPainted(false);
        login_link.setFocusable(false);
        login_link.setLabel("Login");
        login_link.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_linkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout login_Bg1Layout = new javax.swing.GroupLayout(login_Bg1);
        login_Bg1.setLayout(login_Bg1Layout);
        login_Bg1Layout.setHorizontalGroup(
            login_Bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_Bg1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(login_Bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login_Bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(login_Bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(login_Bg1Layout.createSequentialGroup()
                                .addGroup(login_Bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(age_field, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(login_Bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sex_field, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(login_Bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel5)
                            .addComponent(lname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(mname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(fname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(login_Bg1Layout.createSequentialGroup()
                            .addGroup(login_Bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(login_Bg1Layout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addComponent(signup_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(login_Bg1Layout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addComponent(jLabel1)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(login_Bg1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(login_link, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(516, 516, 516))
        );
        login_Bg1Layout.setVerticalGroup(
            login_Bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_Bg1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(login_Bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(login_Bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sex_field)
                    .addComponent(age_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(signup_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_link)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(login_Bg1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_Bg1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_btnActionPerformed
        // TODO add your handling code here:
        String f_name = fname_field.getText();
        String m_name = mname_field.getText();
        String l_name = lname_field.getText();
        String age = age_field.getText();
        String sex = sex_field.getSelectedItem().toString();
        Date b_date = jDateChooser1.getDate();

        if (f_name.isBlank() || m_name.isBlank() || l_name.isBlank() || age.isBlank() || sex == null || b_date == null) {
            JOptionPane.showMessageDialog(null, "All fields are required!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        LocalDate localDate = new java.sql.Date(b_date.getTime()).toLocalDate();
        java.sql.Date formattedDate = java.sql.Date.valueOf(localDate); // Converts LocalDate to java.sql.Date

        String query = "INSERT INTO students (first_name, middle_name, last_name, age, sex, birth_date) VALUES (?, ?, ?, ? , ?, ?)";

        try (Connection con = dbConn.getConnection(); PreparedStatement preparedStmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            preparedStmt.setString(1, f_name);
            preparedStmt.setString(2, m_name);
            preparedStmt.setString(3, l_name);
            preparedStmt.setString(4, age);
            preparedStmt.setString(5, sex);
            preparedStmt.setDate(6, formattedDate);
            
            int affectedRows = preparedStmt.executeUpdate();
            if(affectedRows > 0) {
                ResultSet generatedKeys = preparedStmt.getGeneratedKeys();
                if(generatedKeys.next()) {
                    int newId = generatedKeys.getInt(1);
                    
                    JOptionPane.showMessageDialog(null, "Your Student ID: " + newId, "Signup Successful", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    new Login();
                } else {
                    JOptionPane.showMessageDialog(null, "Student was created, but ID could not be retrieved.", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Failed To Create Student", "Something went wrong", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_signup_btnActionPerformed

    private void login_linkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_linkActionPerformed
        // TODO add your handling code here:
        dispose();
        new Login();
    }//GEN-LAST:event_login_linkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age_field;
    private javax.swing.JTextField fname_field;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lname_field;
    private java_swings.Login_Bg login_Bg1;
    private javax.swing.JButton login_link;
    private javax.swing.JTextField mname_field;
    private javax.swing.JComboBox<String> sex_field;
    private javax.swing.JButton signup_btn;
    // End of variables declaration//GEN-END:variables
}
