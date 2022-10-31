/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hms;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.CityDirectory;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.HospitalDirectory;
import model.PatientDirectory;

/**
 *
 * @author anupamaditya
 */
public class Doctors extends javax.swing.JFrame {

    /**
     * Creates new form Doctors
     */
    DoctorDirectory DocDirectory;
    PatientDirectory PatDirectory;
    HospitalDirectory HospDirectory;
    CityDirectory cityDirectory;
    CommunityDirectory CommDirectory;
    EncounterHistory EncHistory;
    
    public Doctors() {
        initComponents();
    }
    
    public Doctors(DoctorDirectory DocDirectory, HospitalDirectory HospDirectory, PatientDirectory PatDirectory, CityDirectory cityDirectory,  CommunityDirectory CommDirectory, EncounterHistory EncHistory) {
        initComponents();
        
        this.DocDirectory = DocDirectory;
        this.PatDirectory = PatDirectory;
        this.HospDirectory = HospDirectory;
        this.cityDirectory = cityDirectory;
        this.CommDirectory = CommDirectory;
         this.EncHistory= EncHistory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AptButton = new javax.swing.JButton();
        JDoctorPat = new javax.swing.JButton();
        JLogoutDoctor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        AptButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        AptButton.setForeground(new java.awt.Color(0, 102, 153));
        AptButton.setText("Appointments");
        jPanel1.add(AptButton);
        AptButton.setBounds(60, 390, 350, 90);

        JDoctorPat.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        JDoctorPat.setForeground(new java.awt.Color(0, 102, 153));
        JDoctorPat.setText("Patient Details");
        JDoctorPat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JDoctorPatMouseClicked(evt);
            }
        });
        jPanel1.add(JDoctorPat);
        JDoctorPat.setBounds(60, 530, 350, 100);

        JLogoutDoctor.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        JLogoutDoctor.setForeground(new java.awt.Color(0, 102, 153));
        JLogoutDoctor.setText("Logout");
        JLogoutDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLogoutDoctorMouseClicked(evt);
            }
        });
        jPanel1.add(JLogoutDoctor);
        JLogoutDoctor.setBounds(130, 680, 190, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/anupamaditya/Downloads/drback-3.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -90, 1430, 1030);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1429, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    
    private void JLogoutDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLogoutDoctorMouseClicked
        // TODO add your handling code here:
        JFrame frame = new JFrame("Logout");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to logout", "logout", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            //System.exit(0);
             DoctorLogin dl = new DoctorLogin(DocDirectory, HospDirectory, PatDirectory, cityDirectory, CommDirectory, EncHistory);
             dl.setVisible(true);
        }
       
    }//GEN-LAST:event_JLogoutDoctorMouseClicked

    private void JDoctorPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JDoctorPatMouseClicked
        // TODO add your handling code here:
        DoctorPatPortal dpp= new DoctorPatPortal(DocDirectory, HospDirectory, PatDirectory, cityDirectory, CommDirectory, EncHistory);
        dpp.setVisible(true);   
    }//GEN-LAST:event_JDoctorPatMouseClicked

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
            java.util.logging.Logger.getLogger(Doctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AptButton;
    private javax.swing.JButton JDoctorPat;
    private javax.swing.JButton JLogoutDoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
