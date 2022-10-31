/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hms;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import model.CityDirectory;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.Encounter;
import model.EncounterHistory;
import model.HospitalDirectory;
import model.House;
import model.PatData;
import model.PatientDirectory;
import model.VitalSigns;

/**
 *
 * @author anupamaditya
 */
public class AddPatientVitals extends javax.swing.JFrame {

    /**
     * Creates new form AddPatientVitals
     */
   DoctorDirectory DocDirectory;
  PatientDirectory PatDirectory;
  HospitalDirectory HospDirectory;
  CityDirectory cityDirectory;
  CommunityDirectory CommDirectory;
  EncounterHistory EncHistory;
    
    public AddPatientVitals() {
        initComponents();
    }
    
    public AddPatientVitals(DoctorDirectory DocDirectory, HospitalDirectory HospDirectory, PatientDirectory PatDirectory, CityDirectory cityDirectory,  CommunityDirectory CommDirectory, EncounterHistory EncHistory) {
        initComponents();
        this.DocDirectory = DocDirectory;
        this.PatDirectory = PatDirectory;
        this.HospDirectory = HospDirectory;
        this.cityDirectory = cityDirectory;
        this.CommDirectory = CommDirectory;
        this.EncHistory= EncHistory;
        
        populatePatient();
        populatePerson();
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JVisitDate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        JTFTempearture = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTFBPressure = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTFPulseRate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JTFRespirationRate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        JBackAddPatientVitalBtn = new javax.swing.JButton();
        SavePatientVital = new javax.swing.JButton();
        JPatID = new javax.swing.JComboBox<>();
        JPatName = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patient ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 80, 30));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Patient Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 100, 30));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Visit Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 100, 30));
        jPanel1.add(JVisitDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 170, 30));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Temperature");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 100, 30));

        JTFTempearture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTempeartureActionPerformed(evt);
            }
        });
        jPanel1.add(JTFTempearture, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 170, 30));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BPressure");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 100, 30));

        JTFBPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFBPressureActionPerformed(evt);
            }
        });
        jPanel1.add(JTFBPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 170, 30));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pulse Rate");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 100, 30));

        JTFPulseRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPulseRateActionPerformed(evt);
            }
        });
        jPanel1.add(JTFPulseRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 170, 30));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Respiration Rate");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, 120, 30));

        JTFRespirationRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFRespirationRateActionPerformed(evt);
            }
        });
        jPanel1.add(JTFRespirationRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, 170, 30));

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Patient Vital Signs");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, 80));

        JBackAddPatientVitalBtn.setBackground(new java.awt.Color(0, 153, 204));
        JBackAddPatientVitalBtn.setIcon(new javax.swing.ImageIcon("/Users/anupamaditya/Downloads/undo-2.png")); // NOI18N
        JBackAddPatientVitalBtn.setText("Back");
        JBackAddPatientVitalBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBackAddPatientVitalBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBackAddPatientVitalBtnMouseClicked(evt);
            }
        });
        JBackAddPatientVitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBackAddPatientVitalBtnActionPerformed(evt);
            }
        });
        jPanel1.add(JBackAddPatientVitalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 20, 150, 80));

        SavePatientVital.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        SavePatientVital.setForeground(new java.awt.Color(0, 102, 153));
        SavePatientVital.setText("Save");
        SavePatientVital.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SavePatientVital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SavePatientVitalMouseClicked(evt);
            }
        });
        jPanel1.add(SavePatientVital, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 660, 110, 40));

        JPatID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(JPatID, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 170, 30));

        JPatName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(JPatName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFTempeartureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTempeartureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFTempeartureActionPerformed

    private void JTFBPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFBPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFBPressureActionPerformed

    private void JTFPulseRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPulseRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPulseRateActionPerformed

    private void JTFRespirationRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFRespirationRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFRespirationRateActionPerformed

    private void JBackAddPatientVitalBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBackAddPatientVitalBtnMouseClicked
        // TODO add your handling code here:
        // DoctorDetailsAdmin DDA = new DoctorDetailsAdmin();
        //DDA.setVisible(true);
    }//GEN-LAST:event_JBackAddPatientVitalBtnMouseClicked

    private void JBackAddPatientVitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBackAddPatientVitalBtnActionPerformed
        // TODO add your handling code here:

        DoctorPatPortal DPP = new DoctorPatPortal(DocDirectory, HospDirectory, PatDirectory, cityDirectory, CommDirectory, EncHistory);
        DPP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBackAddPatientVitalBtnActionPerformed

    private void SavePatientVitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SavePatientVitalMouseClicked
        // TODO add your handling code here:
        
        String patientID = JPatID.getSelectedItem().toString();
        String patientName = JPatName.getSelectedItem().toString();
        Date VisitDate = JVisitDate.getDate();
        double temperature=0;
        double bPressure=0;
        double pulseRate=0;
          double respirationRate;
          
          if (patientID.isEmpty() || patientName.isEmpty()){
            JOptionPane.showMessageDialog(this,
                "Please enter all fields",
                "Try Again",
                JOptionPane.ERROR_MESSAGE);

        }
          try{
              temperature = Double.parseDouble(JTFTempearture.getText());
              
          }
          catch(Exception e){
              JOptionPane.showMessageDialog(this,
                "Please enter all fields",
                "Try Again",
                JOptionPane.ERROR_MESSAGE);
          }
          
          try{
              bPressure = Double.parseDouble(JTFBPressure.getText());
              
          }
          catch(Exception e){
              JOptionPane.showMessageDialog(this,
                "Please enter all fields",
                "Try Again",
                JOptionPane.ERROR_MESSAGE);
          }
          try{
              bPressure = Double.parseDouble(JTFRespirationRate.getText());
              
          }
          catch(Exception e){
              JOptionPane.showMessageDialog(this,
                "Please enter all fields",
                "Try Again",
                JOptionPane.ERROR_MESSAGE);
          }
          
          
            Encounter ec = EncHistory.addNewEncounter();
            PatData patData = new PatData();
            patData.setPatientID(patientID);
            ec.setPatientID(patData);
            
            PatData pat1 = new PatData();
            pat1.setFName(patientName);
            ec.setPatientName(pat1);
            
            PatData pat2 = new PatData();
            pat2.setVisitingDate(VisitDate);
            ec.setVisitingDate(pat2);
            
            VitalSigns pat3 = new VitalSigns();
            pat3.setTemperatureInF(temperature);
            ec.setVitalSigns(pat3);
        
            
                  
             VitalSigns pat4 = new VitalSigns();
            pat4.setPulseRate(pulseRate);
            ec.setVitalSigns(pat4);
                  
            VitalSigns pat5 = new VitalSigns();
            pat5.setBloodpressue(bPressure);
            ec.setVitalSigns(pat5);
                  
              VitalSigns pat6 = new VitalSigns();
            pat5.setRespirationRate(bPressure);
            ec.setVitalSigns(pat6);
           
            JOptionPane.showMessageDialog(this, "New record added");

            JPatID.setSelectedItem("");
            JPatName.setSelectedItem("");
            JTFTempearture.setText("");
            JTFBPressure.setText("");
            JTFPulseRate.setText("");
            JTFRespirationRate.setText("");
            

          
    }//GEN-LAST:event_SavePatientVitalMouseClicked

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
            java.util.logging.Logger.getLogger(AddPatientVitals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPatientVitals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPatientVitals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPatientVitals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPatientVitals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBackAddPatientVitalBtn;
    private javax.swing.JComboBox<String> JPatID;
    private javax.swing.JComboBox<String> JPatName;
    private javax.swing.JTextField JTFBPressure;
    private javax.swing.JTextField JTFPulseRate;
    private javax.swing.JTextField JTFRespirationRate;
    private javax.swing.JTextField JTFTempearture;
    private com.toedter.calendar.JDateChooser JVisitDate;
    private javax.swing.JButton SavePatientVital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void populatePatient() {
        
        List<PatData> pt = PatDirectory.getPatDirectory();
        for(PatData p: pt){
            JPatID.addItem(p.getPatientID());
        }
            
        }
    private void populatePerson() {
        
        List<PatData> pt = PatDirectory.getPatDirectory();
        for(PatData p: pt){
            JPatName.addItem(p.getFName());
        }
            
        }       
        
    }

