/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_swings;

import configs.DbConnection;
import java.awt.Color;
import objects.Active_Student;
import objects.Student;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import objects.Course;

/**
 *
 * @author Maku
 */
public class Registration_Form extends javax.swing.JFrame {
    
    private final DbConnection dbCon = new DbConnection();

    public Registration_Form() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);

        loadStudentInformations();
        loadCourses();
        setVisible(true);
    }
    
    private void loadStudentInformations() {
        Student student = Active_Student.getActiveStudent();
        
        System.out.println(student.getSex());
        student_field.setText(String.valueOf(student.getId()));
        fname_field.setText(student.getFirst_name());
        mname_field.setText(student.getMiddle_name());
        lname_field.setText(student.getLast_name());
        age_field.setText(String.valueOf(student.getAge()));
        sex_field.setText(student.getSex());
        bdate_field.setText(student.getBirth_date());
    }

    private void loadCourses() {
        String query = "SELECT * FROM courses";
        
        ArrayList<Course> course_list = new ArrayList<>();
        try (Connection con = dbCon.getConnection();
             Statement stmt = con.createStatement()){
            
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                String course_code = rs.getString("course_code");
                String course_name = rs.getString("course_name");
                String instructor_name = rs.getString("instructor_name");
                int credits = rs.getInt("credits");
                int max_capacity = rs.getInt("max_capacity");
                
                Course course = new Course(course_code, course_name, instructor_name, credits, max_capacity);
                course_list.add(course);
            }
            
            for(Course course : course_list) {
                String course_name = course.getCourse_name();
                course_comboBox.addItem(course_name);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registration_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        view_courses = new javax.swing.JButton();
        student_info = new javax.swing.JPanel();
        lbl = new javax.swing.JLabel();
        student_field = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        fname_field = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        mname_field = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lname_field = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        age_field = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        sex_field = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        bdate_field = new javax.swing.JLabel();
        course_comboBox = new javax.swing.JComboBox<>();
        register_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setText("Registration Form");

        view_courses.setBackground(new java.awt.Color(218, 73, 73));
        view_courses.setForeground(new java.awt.Color(255, 255, 255));
        view_courses.setText("View My Courses");
        view_courses.setBorder(null);
        view_courses.setBorderPainted(false);
        view_courses.setFocusable(false);

        lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl.setText("Last Name");

        student_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        student_field.setText("1");

        lbl1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("First Name");

        fname_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fname_field.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fname_field.setText("Maku");

        lbl2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("Middle Name");

        mname_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mname_field.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mname_field.setText("Matre");

        lbl3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl3.setText("Student ID:");

        lname_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lname_field.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lname_field.setText("Maute");

        lbl4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setText("Age");

        age_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        age_field.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        age_field.setText("19");

        lbl5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5.setText("Sex");

        sex_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sex_field.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sex_field.setText("Male");

        lbl6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl6.setText("Birth Date");

        bdate_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bdate_field.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bdate_field.setText("2025-03-7");

        javax.swing.GroupLayout student_infoLayout = new javax.swing.GroupLayout(student_info);
        student_info.setLayout(student_infoLayout);
        student_infoLayout.setHorizontalGroup(
            student_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_infoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(student_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(student_infoLayout.createSequentialGroup()
                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(student_field, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, student_infoLayout.createSequentialGroup()
                        .addGroup(student_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(student_infoLayout.createSequentialGroup()
                                .addGroup(student_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(student_infoLayout.createSequentialGroup()
                                        .addComponent(age_field, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(sex_field, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(student_infoLayout.createSequentialGroup()
                                        .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addGroup(student_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bdate_field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(student_infoLayout.createSequentialGroup()
                                .addGroup(student_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(student_infoLayout.createSequentialGroup()
                                        .addComponent(fname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(mname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(student_infoLayout.createSequentialGroup()
                                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(student_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lname_field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(14, 14, 14))))
        );
        student_infoLayout.setVerticalGroup(
            student_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_infoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(student_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(student_field))
                .addGap(12, 12, 12)
                .addGroup(student_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(lbl2)
                    .addComponent(lbl))
                .addGap(10, 10, 10)
                .addGroup(student_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname_field)
                    .addComponent(mname_field)
                    .addComponent(lname_field))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(student_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4)
                    .addComponent(lbl5)
                    .addComponent(lbl6))
                .addGap(10, 10, 10)
                .addGroup(student_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age_field)
                    .addComponent(sex_field)
                    .addComponent(bdate_field))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        course_comboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        course_comboBox.setBorder(null);
        course_comboBox.setFocusable(false);

        register_btn.setBackground(new java.awt.Color(218, 73, 73));
        register_btn.setForeground(new java.awt.Color(255, 255, 255));
        register_btn.setText("Register");
        register_btn.setBorder(null);
        register_btn.setBorderPainted(false);
        register_btn.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(view_courses, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(student_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(course_comboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(register_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(view_courses, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(student_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(219, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age_field;
    private javax.swing.JLabel bdate_field;
    private javax.swing.JComboBox<String> course_comboBox;
    private javax.swing.JLabel fname_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lname_field;
    private javax.swing.JLabel mname_field;
    private javax.swing.JButton register_btn;
    private javax.swing.JLabel sex_field;
    private javax.swing.JLabel student_field;
    private javax.swing.JPanel student_info;
    private javax.swing.JButton view_courses;
    // End of variables declaration//GEN-END:variables
}
