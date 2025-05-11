
package java_swings;

import configs.DbConnection;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import objects.Active_Student;
import objects.Student;

public class Login extends javax.swing.JFrame {

    private final DbConnection dbConn = new DbConnection();
    
    public Login() {
        initComponents();
        
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_Bg1 = new java_swings.Login_Bg();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        last_name_field = new javax.swing.JTextField();
        Login_Btn = new javax.swing.JButton();
        signup_link = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login To Register Course");

        jLabel2.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Id");

        id_field.setBackground(new java.awt.Color(240, 240, 240));
        id_field.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        id_field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        id_field.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name");

        last_name_field.setBackground(new java.awt.Color(240, 240, 240));
        last_name_field.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        last_name_field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        last_name_field.setOpaque(true);

        Login_Btn.setBackground(new java.awt.Color(218, 73, 73));
        Login_Btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Login_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Login_Btn.setText("Login");
        Login_Btn.setBorder(null);
        Login_Btn.setBorderPainted(false);
        Login_Btn.setFocusPainted(false);
        Login_Btn.setFocusable(false);
        Login_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_BtnActionPerformed(evt);
            }
        });

        signup_link.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signup_link.setForeground(new java.awt.Color(255, 255, 255));
        signup_link.setText("Signup here");
        signup_link.setBorder(null);
        signup_link.setBorderPainted(false);
        signup_link.setContentAreaFilled(false);
        signup_link.setFocusPainted(false);
        signup_link.setFocusable(false);
        signup_link.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_linkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout login_Bg1Layout = new javax.swing.GroupLayout(login_Bg1);
        login_Bg1.setLayout(login_Bg1Layout);
        login_Bg1Layout.setHorizontalGroup(
            login_Bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_Bg1Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(login_Bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login_Bg1Layout.createSequentialGroup()
                        .addGroup(login_Bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(login_Bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(last_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(login_Bg1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1)))
                .addGap(101, 101, 101))
            .addGroup(login_Bg1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(Login_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(login_Bg1Layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(signup_link)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        login_Bg1Layout.setVerticalGroup(
            login_Bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_Bg1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(login_Bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(login_Bg1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(login_Bg1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(last_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Login_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signup_link)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_Bg1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_Bg1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Login_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_BtnActionPerformed
        // TODO add your handling code here:
        String id_val = id_field.getText();
        String l_name = last_name_field.getText();
        
        if(id_val.isBlank() || l_name.isBlank()) {
            JOptionPane.showMessageDialog(null, "Student Id and Last name are required!", "Invalid input!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String query = "SELECT * FROM students WHERE id = ? AND last_name = ?";
        
        try (Connection con = dbConn.getConnection();
             PreparedStatement preparedStmt = con.prepareStatement(query)){
            int intId = Integer.parseInt(id_val);

            preparedStmt.setInt(1, intId);
            preparedStmt.setString(2, l_name);
            
            ResultSet rs = preparedStmt.executeQuery();
            if(rs.next()) {
                int id = rs.getInt("id");
                String first_name = rs.getString("first_name");
                String middle_name = rs.getString("middle_name");
                String last_name = rs.getString("last_name");
                int age = rs.getInt("age");
                String sex = rs.getString("sex");
                String birth_date = rs.getString("birth_date");
                
                Student student = new Student(id, first_name, middle_name, last_name, age, sex, birth_date);
                Active_Student.setActiveStudent(student);
                JOptionPane.showMessageDialog(null, "Login Success", "Logged In", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new Registration_Form();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid Student Id", "Invalid input", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Login_BtnActionPerformed

    private void signup_linkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_linkActionPerformed
        // TODO add your handling code here:
        dispose();
        new Signup();
    }//GEN-LAST:event_signup_linkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login_Btn;
    private javax.swing.JTextField id_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField last_name_field;
    private java_swings.Login_Bg login_Bg1;
    private javax.swing.JButton signup_link;
    // End of variables declaration//GEN-END:variables
}
