package java_swings;

import objects.Active_Student;
import objects.Student;

public class Landing_Page extends javax.swing.JFrame {

    public Landing_Page() {
        initComponents();
        setTitle("School Registration System");
        setSize(1100, 650);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        landing_Bg1 = new java_swings.Landing_Bg();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        register_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        course_Card1 = new java_swings.Course_Card();
        course_Card5 = new java_swings.Course_Card();
        course_Card6 = new java_swings.Course_Card();
        course_Card4 = new java_swings.Course_Card();
        course_Card3 = new java_swings.Course_Card();
        course_Card2 = new java_swings.Course_Card();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html><div style='text-align:center; font-family: Arial; font-size: 36px; color: white;'>Welcome To Bayag Polytechnic University</div></html>");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html><div style='text-align: center;'>Bayag Polytechnic University (BPU) offers accessible, quality education. With diverse programs, BPU fosters innovation, critical thinking, and leadership, preparing students for successful careers. Located in Bayag City, BPU is committed to student growth and community development.</div></html>");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        register_btn.setBackground(new java.awt.Color(218, 73, 73));
        register_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        register_btn.setForeground(new java.awt.Color(255, 255, 255));
        register_btn.setText("Register Course Now!");
        register_btn.setBorder(null);
        register_btn.setBorderPainted(false);
        register_btn.setFocusPainted(false);
        register_btn.setFocusable(false);
        register_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout landing_Bg1Layout = new javax.swing.GroupLayout(landing_Bg1);
        landing_Bg1.setLayout(landing_Bg1Layout);
        landing_Bg1Layout.setHorizontalGroup(
            landing_Bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, landing_Bg1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, landing_Bg1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(landing_Bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, landing_Bg1Layout.createSequentialGroup()
                        .addComponent(register_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(456, 456, 456))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, landing_Bg1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 269, 269))))
        );
        landing_Bg1Layout.setVerticalGroup(
            landing_Bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landing_Bg1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(register_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register Now To Our Courses!");

        jPanel1.setLayout(new java.awt.GridLayout(1, 6, 10, 10));
        jPanel1.add(course_Card1);
        jPanel1.add(course_Card5);
        jPanel1.add(course_Card6);
        jPanel1.add(course_Card4);
        jPanel1.add(course_Card3);
        jPanel1.add(course_Card2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(landing_Bg1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1132, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(361, 361, 361))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(landing_Bg1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void register_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_btnActionPerformed
        Student active_student = Active_Student.getActiveStudent();
        
        if(active_student == null) {
            new Login();
        } else {
            new Registration_Form();
        }
    }//GEN-LAST:event_register_btnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java_swings.Course_Card course_Card1;
    private java_swings.Course_Card course_Card2;
    private java_swings.Course_Card course_Card3;
    private java_swings.Course_Card course_Card4;
    private java_swings.Course_Card course_Card5;
    private java_swings.Course_Card course_Card6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private java_swings.Landing_Bg landing_Bg1;
    private javax.swing.JButton register_btn;
    // End of variables declaration//GEN-END:variables
}
