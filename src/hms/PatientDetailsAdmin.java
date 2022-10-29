/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hms;

import model.DoctorDirectory;
import model.HospitalDirectory;
import model.PatientDirectory;

/**
 *
 * @author anupamaditya
 */



public class PatientDetailsAdmin extends javax.swing.JFrame {

    /**
     * Creates new form PatientDetailsAdmin
     */
    
    PatientDirectory PatDirectory;
    DoctorDirectory DocDirectory;
    HospitalDirectory HospDirectory;
    
    
    public PatientDetailsAdmin() {
        initComponents();
        PatDirectory = new PatientDirectory();
        
    }

    PatientDetailsAdmin(PatientDirectory PatDirectory) {
        initComponents();
       
        this.PatDirectory = PatDirectory;
    }

    PatientDetailsAdmin(DoctorDirectory DocDirectory, HospitalDirectory HospDirectory) {
     //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        initComponents();
        this.DocDirectory = DocDirectory;   //we are pushing whole reference to DoctorDirectory
        this.HospDirectory = HospDirectory;
    }

//    PatientDetailsAdmin(PatientDirectory PatDirectory, DoctorDirectory DocDirectory, HospitalDirectory HospDirectory) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnAddPatientDetails = new javax.swing.JButton();
        BtnViewPatientDetails = new javax.swing.JButton();
        JBackPatientDetailsAdminBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAddPatientDetails.setBackground(new java.awt.Color(0, 102, 153));
        BtnAddPatientDetails.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        BtnAddPatientDetails.setForeground(new java.awt.Color(255, 255, 255));
        BtnAddPatientDetails.setIcon(new javax.swing.ImageIcon("/Users/anupamaditya/Downloads/add-user-3.png")); // NOI18N
        BtnAddPatientDetails.setText("Add Patient");
        BtnAddPatientDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAddPatientDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAddPatientDetailsMouseClicked(evt);
            }
        });
        BtnAddPatientDetails.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnAddPatientDetailsKeyPressed(evt);
            }
        });
        jPanel1.add(BtnAddPatientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 70));

        BtnViewPatientDetails.setBackground(new java.awt.Color(0, 102, 153));
        BtnViewPatientDetails.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        BtnViewPatientDetails.setForeground(new java.awt.Color(255, 255, 255));
        BtnViewPatientDetails.setIcon(new javax.swing.ImageIcon("/Users/anupamaditya/Downloads/file.png")); // NOI18N
        BtnViewPatientDetails.setText("View Patient");
        BtnViewPatientDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnViewPatientDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnViewPatientDetailsMouseClicked(evt);
            }
        });
        BtnViewPatientDetails.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnViewPatientDetailsKeyPressed(evt);
            }
        });
        jPanel1.add(BtnViewPatientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 160, 70));

        JBackPatientDetailsAdminBtn.setBackground(new java.awt.Color(0, 102, 153));
        JBackPatientDetailsAdminBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        JBackPatientDetailsAdminBtn.setForeground(new java.awt.Color(255, 255, 255));
        JBackPatientDetailsAdminBtn.setIcon(new javax.swing.ImageIcon("/Users/anupamaditya/Downloads/undo-2.png")); // NOI18N
        JBackPatientDetailsAdminBtn.setText("Back");
        JBackPatientDetailsAdminBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBackPatientDetailsAdminBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBackPatientDetailsAdminBtnMouseClicked(evt);
            }
        });
        JBackPatientDetailsAdminBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JBackPatientDetailsAdminBtnKeyPressed(evt);
            }
        });
        jPanel1.add(JBackPatientDetailsAdminBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, 130, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 950));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddPatientDetailsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnAddPatientDetailsKeyPressed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_BtnAddPatientDetailsKeyPressed

    private void BtnViewPatientDetailsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnViewPatientDetailsKeyPressed
        // TODO add your handling code here:
       // ViewPatientDetails VPD = new ViewPatientDetails(PatDirectory);
        //VPD.setVisible(true);
        //this.dispose();
       
    }//GEN-LAST:event_BtnViewPatientDetailsKeyPressed

    private void BtnAddPatientDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAddPatientDetailsMouseClicked
        // TODO add your handling code here:
        AddPatientDetails APD = new AddPatientDetails(PatDirectory);
        APD.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BtnAddPatientDetailsMouseClicked

    private void JBackPatientDetailsAdminBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBackPatientDetailsAdminBtnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBackPatientDetailsAdminBtnKeyPressed

    private void JBackPatientDetailsAdminBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBackPatientDetailsAdminBtnMouseClicked
        // TODO add your handling code here:
        SystemAdmin SA1 = new SystemAdmin(PatDirectory);
       SA1.setVisible(true); 
       this.dispose();
    }//GEN-LAST:event_JBackPatientDetailsAdminBtnMouseClicked

    private void BtnViewPatientDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnViewPatientDetailsMouseClicked
        // TODO add your handling code here:
        ViewPatientDetails VPD = new ViewPatientDetails(PatDirectory);
        VPD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnViewPatientDetailsMouseClicked

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
            java.util.logging.Logger.getLogger(PatientDetailsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientDetailsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientDetailsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientDetailsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientDetailsAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddPatientDetails;
    private javax.swing.JButton BtnViewPatientDetails;
    private javax.swing.JButton JBackPatientDetailsAdminBtn;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}