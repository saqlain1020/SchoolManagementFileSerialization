/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementsys;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MOON
 */
public class StudentPannel extends javax.swing.JFrame {

    /**
     * Creates new form StudentPannel
     */
    
    private ArrayList studentObjects = new ArrayList(); //ArrayList to save Student objects in an array (Dynamic Array)
    
    public StudentPannel() {
        initComponents();
        try{
            FileInputStream fi = new FileInputStream(new File("Students Data.txt")); //Read File Student data.txt
            ObjectInputStream oi = new ObjectInputStream(fi);  //setup object stream
            studentObjects.addAll((ArrayList)oi.readObject()); //read object from file then save in student objects
            oi.close(); //close object stream
            fi.close(); //close file
        }catch (Exception ex){ }
        createTable();
    }
    //Create Table Method
    void createTable(){ //Check in events.java for more info....
        String data[][] = new String[studentObjects.size()][5];
        String column[]={"ROll NO","NAME","FATHER NAME","CLASS NAME","ADDRESS"};
        for(int i = 0; i<studentObjects.size();i++){
            data[i][0] = String.valueOf(((Student)studentObjects.get(i)).getRollNo());
            data[i][1] = ((Student)studentObjects.get(i)).getName();
            data[i][2] = ((Student)studentObjects.get(i)).getFName();
            data[i][3] = ((Student)studentObjects.get(i)).getAddress();
            data[i][4] = ((Student)studentObjects.get(i)).getClassName();
        }
        DefaultTableModel tableModel = new DefaultTableModel(3,3);
        tableModel.setDataVector(data,column);
        table.setModel(tableModel);
    }
    // Method to save Student Array in file Student Data.txt
    private void saveStudentObjects(){
        try{
            FileOutputStream f = new FileOutputStream(new File("Students Data.txt")); //Create File
            ObjectOutputStream o = new ObjectOutputStream(f); //Setup Object output stream
            o.writeObject(studentObjects); //Write Object to file
            o.close(); //close object stream
            f.close(); //close file
        }catch(IOException e){}
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        totalStudentsButton = new javax.swing.JButton();
        searchRollNoButton = new javax.swing.JButton();
        removeRollNoButton = new javax.swing.JButton();
        removeRollNo = new javax.swing.JTextField();
        searchRollNo = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STUDENT PANNEL");
        setLocation(new java.awt.Point(200, 50));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 810, 620));
        setMaximumSize(new java.awt.Dimension(820, 620));
        setPreferredSize(new java.awt.Dimension(820, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.setEnabled(false);
        table.setFillsViewportHeight(true);
        table.setRowHeight(20);
        studentTable.setViewportView(table);

        getContentPane().add(studentTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 690, 270));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("STUDENT PANNEL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 310, 60));

        back.setBackground(new java.awt.Color(255, 0, 0));
        back.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 180, 30));

        totalStudentsButton.setBackground(new java.awt.Color(0, 240, 240));
        totalStudentsButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        totalStudentsButton.setText("TOTAL STUDENT");
        totalStudentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalStudentsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(totalStudentsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 180, 30));

        searchRollNoButton.setBackground(new java.awt.Color(0, 240, 240));
        searchRollNoButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        searchRollNoButton.setText("SEARCH BY RollNo");
        searchRollNoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchRollNoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchRollNoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 150, 30));

        removeRollNoButton.setBackground(new java.awt.Color(0, 240, 240));
        removeRollNoButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        removeRollNoButton.setText("REMOVE BY RollNo");
        removeRollNoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRollNoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removeRollNoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 150, 30));
        getContentPane().add(removeRollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 170, 30));
        getContentPane().add(searchRollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 170, 30));

        jButton5.setBackground(new java.awt.Color(0, 240, 240));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setText("ADD NEW");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 180, 30));

        jLabel4.setText("THE SUMMAYA'S GROUP OF COLLEGE SYSTEM KARACHI");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 440, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/managr1.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 589));

        jPanel1.setEnabled(false);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        MainMenus obj= new MainMenus();
             obj.setVisible(true);
             dispose();
    }//GEN-LAST:event_backActionPerformed

    private void totalStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalStudentsButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(jPanel1,studentObjects.size()); // showing size of student array
    }//GEN-LAST:event_totalStudentsButtonActionPerformed

    private void searchRollNoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchRollNoButtonActionPerformed
        // TODO add your handling code here:
        int rollNo = Integer.parseInt(searchRollNo.getText());
        int i;
        for(i=0;i<studentObjects.size();i++){
            if(((Student)studentObjects.get(i)).checkRollNo(rollNo)){
                break;
            }
        }
        Student temp = ((Student)studentObjects.get(i));
        JOptionPane.showMessageDialog(jPanel1,"Roll No: "+temp.getRollNo()+"\nName: "+temp.getName()+"\nFather Name: "+temp.getFName()+"\nClass Name: "+temp.getClassName()+"\nAddress: "+temp.getAddress());
        searchRollNo.setText("");
    }//GEN-LAST:event_searchRollNoButtonActionPerformed

    private void removeRollNoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRollNoButtonActionPerformed
        // TODO add your handling code here:
        int rollNo = Integer.parseInt(removeRollNo.getText());
        int i;
        for(i=0;i<studentObjects.size();i++){
            if(((Student)studentObjects.get(i)).checkRollNo(rollNo)){
                break;
            }
        }
        studentObjects.remove(i);
        createTable();
        removeRollNo.setText("");
        saveStudentObjects();
    }//GEN-LAST:event_removeRollNoButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     AddNew obj= new AddNew();
             obj.setVisible(true);
             dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentPannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentPannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentPannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentPannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentPannel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField removeRollNo;
    private javax.swing.JButton removeRollNoButton;
    private javax.swing.JTextField searchRollNo;
    private javax.swing.JButton searchRollNoButton;
    private javax.swing.JScrollPane studentTable;
    private javax.swing.JTable table;
    private javax.swing.JButton totalStudentsButton;
    // End of variables declaration//GEN-END:variables
}