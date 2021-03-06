/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementsys;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MOON
 */
public class Events extends javax.swing.JFrame {

    /**
     * Creates new form StudentPannel
     */
    private ArrayList eventObjects = new ArrayList(); //declare event array for saving objects in
    
    public Events() {
        initComponents();
        try{
            FileInputStream fi = new FileInputStream(new File("Events Data.txt")); //Read File Event data.txt
            ObjectInputStream oi = new ObjectInputStream(fi); //setup object stream
            eventObjects.addAll((ArrayList)oi.readObject()); //read object from file then save in Event objects
            oi.close(); //close object stream
            fi.close(); //close file
        }catch (Exception ex){}
        createTable(); //Run create table method

        
    }
    //Save EventObjects file
    void saveEventObjects(){
        try{    
            FileOutputStream f = new FileOutputStream(new File("Events Data.txt")); //Create File
            ObjectOutputStream o = new ObjectOutputStream(f); //Setup Object output stream
            o.writeObject(eventObjects); //Write Object to file
            o.close(); //close object stream
            f.close(); //close file
        }catch(Exception e){}
    }
    //Method to create Table
    void createTable(){
        String data[][] = new String[eventObjects.size()][3]; //data in table. size is total entries in object and 3 colums
        String column[]={"No#","EVENT NAME","EVENT DATE"}; //Column names
        for(int i = 0; i<eventObjects.size();i++){ //loop till no of entries
            data[i][0] = String.valueOf(i+1); //1 column 1 entry (0+1=1)
            data[i][1] = ((Event)eventObjects.get(i)).getEventName(); //Name entry
            data[i][2] = ((Event)eventObjects.get(i)).getEventDate(); //Date Entry
        }
        DefaultTableModel tableModel = new DefaultTableModel(); //table model means row and columns in table
        tableModel.setDataVector(data,column); //data given to table
        table.setModel(tableModel); //data displayed in table
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        eventName = new javax.swing.JTextField();
        eventDate = new javax.swing.JTextField();
        saveEventButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        removeEventNoButton = new javax.swing.JButton();
        removeEventNo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STUDENT PANNEL");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusCycleRoot(false);
        setLocation(new java.awt.Point(200, 50));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 810, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("EVENTS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 310, 60));

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

        jButton3.setBackground(new java.awt.Color(0, 240, 240));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("EVENT DATE");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 150, 30));

        jButton4.setBackground(new java.awt.Color(0, 240, 240));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("EVENT NAME");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 150, 30));
        getContentPane().add(eventName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 170, 30));
        getContentPane().add(eventDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 170, 30));

        saveEventButton.setBackground(new java.awt.Color(0, 204, 51));
        saveEventButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        saveEventButton.setText("SAVE");
        saveEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton(evt);
            }
        });
        getContentPane().add(saveEventButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 330, 30));

        jLabel4.setText("THE SUMMAYA'S GROUP OF COLLEGE SYSTEM KARACHI");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 380, -1));

        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 589));

        jButton6.setBackground(new java.awt.Color(0, 240, 240));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setText("EVENT DATE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 150, 30));

        removeEventNoButton.setBackground(new java.awt.Color(0, 240, 240));
        removeEventNoButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        removeEventNoButton.setText("REMOVE EVENT #");
        removeEventNoButton.setMaximumSize(new java.awt.Dimension(101, 23));
        removeEventNoButton.setMinimumSize(new java.awt.Dimension(101, 23));
        removeEventNoButton.setPreferredSize(new java.awt.Dimension(101, 23));
        removeEventNoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEventNoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removeEventNoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 140, 30));
        getContentPane().add(removeEventNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 170, 30));

        table.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setEnabled(false);
        table.setFillsViewportHeight(true);
        table.setRowHeight(25);
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 590, 280));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/managr1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
             MainMenus obj= new MainMenus();
             obj.setVisible(true);
             dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void saveButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton
        // TODO add your handling code here:
        Event event = new Event(); //Creating an event
        String eventName,eventDate; 
        eventName = this.eventName.getText(); //geting text from user filled field
        eventDate = this.eventDate.getText(); 
        try {
            event = new Event(eventName,eventDate); //setting name and date of event
        } catch (ParseException ex) {}
        eventObjects.add(event); //adding event to event objects array
        saveEventObjects(); //saving event objects in file
        createTable(); //creating table
        this.eventName.setText(""); //erase field user inputted in
        this.eventDate.setText(""); //erase field user inputted in
    }//GEN-LAST:event_saveButton

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void removeEventNoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEventNoButtonActionPerformed
        // TODO add your handling code here:
        int serial = Integer.parseInt(removeEventNo.getText()); //getting int from user input field
        eventObjects.remove(serial-1); //removing entry from index in argument
        createTable(); //creating table
        removeEventNo.setText(""); //clearing field
        saveEventObjects(); //saving file
    }//GEN-LAST:event_removeEventNoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Events().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField eventDate;
    private javax.swing.JTextField eventName;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField removeEventNo;
    private javax.swing.JButton removeEventNoButton;
    private javax.swing.JButton saveEventButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
