/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper.frames;

import minesweeper.menu.AboutMenu;
import minesweeper.menu.MainMenu;
import minesweeper.frames.Course;




/**
 *
 * @author Jacky Northgrave
 * @author Jonathan
 */
public class About extends javax.swing.JFrame {

    /**
     * Creates new form About
     */
    public About() {
        initComponents();
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jMainMenuButton = new javax.swing.JButton();
        jAboutDevelopersButton = new javax.swing.JButton();
        jAboutCourseButton = new javax.swing.JButton();
        jQuitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("About the Game");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton3.setText("Quit");

        jButton1.setText("Back");

        jButton2.setText("Return to Game");

        jButton4.setText("Course Info");

        jButton5.setText("Developers");

        jButton8.setFont(new java.awt.Font("Menlo", 0, 16)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 153));
        jButton8.setText("Continue");

        jButton6.setFont(new java.awt.Font("Menlo", 0, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 153));
        jButton6.setText("Back");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        jPanel2.setBackground(new java.awt.Color(68, 205, 182));

        jMainMenuButton.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jMainMenuButton.setForeground(new java.awt.Color(0, 0, 153));
        jMainMenuButton.setText("Main Menu");
        jMainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMainMenuButtonActionPerformed(evt);
            }
        });

        jAboutDevelopersButton.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jAboutDevelopersButton.setForeground(new java.awt.Color(0, 0, 153));
        jAboutDevelopersButton.setText("Developers");
        jAboutDevelopersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAboutDevelopersButtonActionPerformed(evt);
            }
        });

        jAboutCourseButton.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jAboutCourseButton.setForeground(new java.awt.Color(0, 0, 153));
        jAboutCourseButton.setText("Course");
        jAboutCourseButton.setToolTipText("");
        jAboutCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAboutCourseButtonActionPerformed(evt);
            }
        });

        jQuitButton.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jQuitButton.setForeground(new java.awt.Color(0, 0, 153));
        jQuitButton.setText("Quit");
        jQuitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuitButtonActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Menlo", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 153));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("This menu will help you learn about the developers of the game, view information about the course and also take you back  to the main menu. \n\nClick on Developers to see who are the creators of this game and click on Course to see the information regarding the course information. \nOr feel free to click on Main Menu to check out other options. ");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jQuitButton)
                    .addComponent(jAboutDevelopersButton)
                    .addComponent(jMainMenuButton)
                    .addComponent(jAboutCourseButton))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jAboutDevelopersButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jAboutCourseButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMainMenuButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jQuitButton)
                        .addGap(50, 50, 50))))
        );

        jLabel2.setFont(new java.awt.Font("Menlo", 1, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(244, 244, 244));
        jLabel2.setText("About The Game");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAboutDevelopersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAboutDevelopersButtonActionPerformed
        Developers developers = new Developers();
        developers.setVisible(true);
    }//GEN-LAST:event_jAboutDevelopersButtonActionPerformed

    private void jAboutCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAboutCourseButtonActionPerformed
         Course course = new Course();
         course.setVisible(true);
    }//GEN-LAST:event_jAboutCourseButtonActionPerformed

    private void jMainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMainMenuButtonActionPerformed
         MainFrame main = new MainFrame();
         main.setVisible(true);
    }//GEN-LAST:event_jMainMenuButtonActionPerformed

    private void jQuitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuitButtonActionPerformed
         this.dispose();
    }//GEN-LAST:event_jQuitButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAboutCourseButton;
    private javax.swing.JButton jAboutDevelopersButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jMainMenuButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jQuitButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
