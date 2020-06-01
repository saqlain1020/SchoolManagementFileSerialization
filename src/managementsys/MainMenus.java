/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementsys;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import game.TicTacToe;

/**
 *
 * @author MOON
 */
public class MainMenus extends javax.swing.JFrame {

    /**
     * Creates new form MainMenus
     */
    public MainMenus() {
        initComponents();
        ShowTime();
        ShowDate();
    }
    void ShowDate(){
        Date d=new Date();
        SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
        dates.setText(s.format(d));
    }
    void ShowTime()
    {
 //date----------------------
      //for date-------------------------------
        new Timer(0,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 Date d=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat(" hh:mm:ss");
    String Times=sdf.format(d);
    timelap.setText(sdf.format(d));
            }
        }
        ).start();

    }
     //--------------------------------------------- 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        timelap = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dates = new javax.swing.JLabel();
        studentPanel = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        info = new javax.swing.JButton();
        staffPanel = new javax.swing.JButton();
        event = new javax.swing.JButton();
        calculator = new javax.swing.JButton();
        gameButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SCHOOL MANAGEMENT SYSTEM");
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(200, 40));
        setMaximumSize(new java.awt.Dimension(810, 630));
        setMinimumSize(new java.awt.Dimension(810, 630));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("THE SUMMAYA'S GROUP OF COLLEGE SYSTEM KARACHI");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 380, -1));

        timelap.setText("TIME : 03:30");
        timelap.setToolTipText("");
        timelap.setName("Time"); // NOI18N
        timelap.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                timelapPropertyChange(evt);
            }
        });
        jPanel1.add(timelap, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 70, -1));
        timelap.getAccessibleContext().setAccessibleName("        ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("SCHOOL MANAGEMENT SYSTEM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 560, 60));

        dates.setText("DATE");
        dates.setName("date"); // NOI18N
        jPanel1.add(dates, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, -1, -1));

        studentPanel.setBackground(new java.awt.Color(0, 204, 204));
        studentPanel.setText("STUDENT PANNEL");
        studentPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentPanelActionPerformed(evt);
            }
        });
        jPanel1.add(studentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 170, 30));

        exit.setBackground(new java.awt.Color(0, 204, 204));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 170, 30));

        info.setBackground(new java.awt.Color(0, 204, 204));
        info.setText("INFO");
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });
        jPanel1.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 170, 30));

        staffPanel.setBackground(new java.awt.Color(0, 204, 204));
        staffPanel.setText("STAFF PANNEL");
        staffPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffPanelActionPerformed(evt);
            }
        });
        jPanel1.add(staffPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 170, 30));

        event.setBackground(new java.awt.Color(0, 204, 204));
        event.setText("EVENT");
        event.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventActionPerformed(evt);
            }
        });
        jPanel1.add(event, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 170, 30));

        calculator.setBackground(new java.awt.Color(0, 204, 204));
        calculator.setText(" CALCULATOR");
        calculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorActionPerformed(evt);
            }
        });
        jPanel1.add(calculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 170, 30));

        gameButton.setBackground(new java.awt.Color(0, 204, 204));
        gameButton.setLabel("GAME");
        gameButton.setMaximumSize(new java.awt.Dimension(55, 23));
        gameButton.setMinimumSize(new java.awt.Dimension(55, 23));
        gameButton.setPreferredSize(new java.awt.Dimension(101, 23));
        gameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameButtonActionPerformed(evt);
            }
        });
        jPanel1.add(gameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 170, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managementsys/managr.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    private void studentPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentPanelActionPerformed

          StudentPannel obj= new StudentPannel();
             obj.setVisible(true);
             dispose();
    }//GEN-LAST:event_studentPanelActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void staffPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffPanelActionPerformed
        // TODO add your handling code here:
         StaffPannel obj= new StaffPannel();
             obj.setVisible(true);
             dispose();
    }//GEN-LAST:event_staffPanelActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
      
        Info obj1= new Info();
             obj1.setVisible(true);
             dispose();
    }//GEN-LAST:event_infoActionPerformed

    private void eventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventActionPerformed
        // TODO add your handling code here:
        Events obj2= new Events();
             obj2.setVisible(true);
             dispose();
    }//GEN-LAST:event_eventActionPerformed

    private void calculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatorActionPerformed
        // TODO add your handling code here:
         calculator obj3= new calculator();
             obj3.setVisible(true);
             dispose();
    }//GEN-LAST:event_calculatorActionPerformed

    private void timelapPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_timelapPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_timelapPropertyChange

    private void gameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButtonActionPerformed
        // TODO add your handling code here:
        new TicTacToe().setVisible(true);
        dispose();
    }//GEN-LAST:event_gameButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
   
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculator;
    private javax.swing.JLabel dates;
    private javax.swing.JButton event;
    private javax.swing.JButton exit;
    private javax.swing.JButton gameButton;
    private javax.swing.JButton info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton staffPanel;
    private javax.swing.JButton studentPanel;
    private javax.swing.JLabel timelap;
    // End of variables declaration//GEN-END:variables
}