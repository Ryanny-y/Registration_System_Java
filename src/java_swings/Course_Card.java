package java_swings;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import objects.Active_Student;
import objects.Student;

public class Course_Card extends javax.swing.JPanel {

    private String course;
    public Course_Card() {
        initComponents();
    }
    
    public Course_Card(String img_path, String course_name) {
        initComponents();
        this.course = course_name;
        this.course_name.setText(course_name);
        this.icon.setIcon(setImgIcon(img_path));
    }
    
    private Icon setImgIcon(String icon) {
        ImageIcon originalImage = new ImageIcon("src/images/" + icon);
        Image scaledImage = originalImage.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        register_btn = new javax.swing.JButton();
        course_name = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 250, 250));

        register_btn.setBackground(new java.awt.Color(218, 73, 73));
        register_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        register_btn.setForeground(new java.awt.Color(255, 255, 255));
        register_btn.setText("Register");
        register_btn.setBorder(null);
        register_btn.setBorderPainted(false);
        register_btn.setFocusPainted(false);
        register_btn.setFocusable(false);
        register_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_btnActionPerformed(evt);
            }
        });

        course_name.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        course_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        course_name.setText("Course Name");

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(register_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(icon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(course_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(course_name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(register_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void register_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_btnActionPerformed
        // TODO add your handling code here:
        Student active_student = Active_Student.getActiveStudent();
        
        if(active_student == null) {
            new Login();
        } else {
            new Registration_Form(course);
        }
    }//GEN-LAST:event_register_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel course_name;
    private javax.swing.JLabel icon;
    private javax.swing.JButton register_btn;
    // End of variables declaration//GEN-END:variables
}
