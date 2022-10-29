/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hms;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.DoctorDirectory;
import model.HospitalData;
import model.HospitalDirectory;
import model.PatientDirectory;

/**
 *
 * @author anupamaditya
 */
public class ViewHospitalDetails extends javax.swing.JFrame {

    /**
     * Creates new form ViewHospitalDetails
     */
    
    HospitalDirectory HospDirectory;
   
    
    public ViewHospitalDetails(HospitalDirectory HospDirectory) {
        initComponents();
        
        this.HospDirectory = HospDirectory;
        
       populateTable();
    }

    private ViewHospitalDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableHosp = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        JHospID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JNameHosp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JPhoneNoHosp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JEmailHosp = new javax.swing.JTextField();
        SearchPat = new javax.swing.JLabel();
        TFSearchPat = new javax.swing.JTextField();
        jBtnDeleteViewPatientDetails = new javax.swing.JButton();
        JBackPatientViewBtn = new javax.swing.JButton();
        jBtnViewPatDetails = new javax.swing.JButton();
        JUpdatePatBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTableHosp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "HospitalID", "Hospital Name", "Phone No", "Email "
            }
        ));
        jScrollPane2.setViewportView(JTableHosp);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 960, 410));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hospital ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 30));

        JHospID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JHospIDActionPerformed(evt);
            }
        });
        jPanel1.add(JHospID, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 160, 30));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hospital Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, 30));

        JNameHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JNameHospActionPerformed(evt);
            }
        });
        jPanel1.add(JNameHosp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 160, 30));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone No");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, 30));

        JPhoneNoHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPhoneNoHospActionPerformed(evt);
            }
        });
        jPanel1.add(JPhoneNoHosp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 160, 30));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 80, 30));

        JEmailHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JEmailHospActionPerformed(evt);
            }
        });
        jPanel1.add(JEmailHosp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 160, 30));

        SearchPat.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        SearchPat.setForeground(new java.awt.Color(255, 255, 255));
        SearchPat.setIcon(new javax.swing.ImageIcon("/Users/anupamaditya/Downloads/search.png")); // NOI18N
        SearchPat.setText("Search");
        SearchPat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(SearchPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 140, 40));

        TFSearchPat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFSearchPatActionPerformed(evt);
            }
        });
        TFSearchPat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFSearchPatKeyReleased(evt);
            }
        });
        jPanel1.add(TFSearchPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 420, 40));

        jBtnDeleteViewPatientDetails.setBackground(new java.awt.Color(0, 105, 153));
        jBtnDeleteViewPatientDetails.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jBtnDeleteViewPatientDetails.setForeground(new java.awt.Color(255, 255, 255));
        jBtnDeleteViewPatientDetails.setIcon(new javax.swing.ImageIcon("/Users/anupamaditya/Downloads/trash.png")); // NOI18N
        jBtnDeleteViewPatientDetails.setText("Delete");
        jBtnDeleteViewPatientDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnDeleteViewPatientDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnDeleteViewPatientDetailsMouseClicked(evt);
            }
        });
        jPanel1.add(jBtnDeleteViewPatientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 20, 150, 40));

        JBackPatientViewBtn.setBackground(new java.awt.Color(0, 153, 204));
        JBackPatientViewBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        JBackPatientViewBtn.setForeground(new java.awt.Color(255, 255, 255));
        JBackPatientViewBtn.setIcon(new javax.swing.ImageIcon("/Users/anupamaditya/Downloads/undo-2.png")); // NOI18N
        JBackPatientViewBtn.setText("Back");
        JBackPatientViewBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBackPatientViewBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBackPatientViewBtnMouseClicked(evt);
            }
        });
        JBackPatientViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBackPatientViewBtnActionPerformed(evt);
            }
        });
        jPanel1.add(JBackPatientViewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 20, 140, 40));

        jBtnViewPatDetails.setBackground(new java.awt.Color(0, 105, 153));
        jBtnViewPatDetails.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jBtnViewPatDetails.setForeground(new java.awt.Color(255, 255, 255));
        jBtnViewPatDetails.setText("View");
        jBtnViewPatDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnViewPatDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnViewPatDetailsMouseClicked(evt);
            }
        });
        jPanel1.add(jBtnViewPatDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 110, 40));

        JUpdatePatBtn.setBackground(new java.awt.Color(0, 105, 153));
        JUpdatePatBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        JUpdatePatBtn.setForeground(new java.awt.Color(255, 255, 255));
        JUpdatePatBtn.setText("Update");
        JUpdatePatBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JUpdatePatBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JUpdatePatBtnMouseClicked(evt);
            }
        });
        jPanel1.add(JUpdatePatBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1495, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JHospIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JHospIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JHospIDActionPerformed

    private void JNameHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JNameHospActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JNameHospActionPerformed

    private void JPhoneNoHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPhoneNoHospActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPhoneNoHospActionPerformed

    private void JEmailHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JEmailHospActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JEmailHospActionPerformed

    private void TFSearchPatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFSearchPatActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TFSearchPatActionPerformed

    public void search(String str){
        DefaultTableModel model = (DefaultTableModel) JTableHosp.getModel();
        TableRowSorter<DefaultTableModel> trs  = new TableRowSorter<DefaultTableModel>(model);
        JTableHosp.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
        
    }   
    private void TFSearchPatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFSearchPatKeyReleased
        // TODO add your handling code here:

        String search = TFSearchPat.getText();
        search(search);
    }//GEN-LAST:event_TFSearchPatKeyReleased

    private void jBtnDeleteViewPatientDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnDeleteViewPatientDetailsMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = JTableHosp.getSelectedRow();

        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select row to delete");
        }

        DefaultTableModel model = (DefaultTableModel) JTableHosp.getModel();
        HospitalData selectedHosp = (HospitalData) model.getValueAt(selectedRowIndex, 0);

        HospDirectory.deleteHosp(selectedHosp);

        JOptionPane.showMessageDialog(this, "Doctor Details has been deleted");

        populateTable();
    }//GEN-LAST:event_jBtnDeleteViewPatientDetailsMouseClicked

    private void JBackPatientViewBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBackPatientViewBtnMouseClicked
        // TODO add your handling code here:
        HospitalDetailsAdmin hda1 = new HospitalDetailsAdmin(HospDirectory);
        hda1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBackPatientViewBtnMouseClicked

    private void JBackPatientViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBackPatientViewBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBackPatientViewBtnActionPerformed

    private void jBtnViewPatDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnViewPatDetailsMouseClicked
        // TODO add your handling code here:

        int selectedRowIndex = JTableHosp.getSelectedRow();

        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select row to delete");
        }

        DefaultTableModel model = (DefaultTableModel) JTableHosp.getModel();
        HospitalData selectedhosp = (HospitalData) model.getValueAt(selectedRowIndex, 0);

        JHospID.setText(String.valueOf(selectedhosp.getHospitalID()));  //here String.valueof is used to convert any data type like int to String.
        //JDocID.setEditable(false);

        JNameHosp.setText(String.valueOf(selectedhosp.getHospitalName()));
        //JFNameDoc.setEditable(false);=
        
        JPhoneNoHosp.setText(String.valueOf(selectedhosp.getPhoneNo()));
        //JPhoneNoDoc.setEditable(false);

        JEmailHosp.setText(String.valueOf(selectedhosp.getEmailAddress()));

    }//GEN-LAST:event_jBtnViewPatDetailsMouseClicked

    private void JUpdatePatBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JUpdatePatBtnMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) JTableHosp.getModel();
        if (JTableHosp.getSelectedRowCount()==1){

            String hospitalID = JHospID.getText();
            String hospitalName = JNameHosp.getText();
            String phoneNoHosp = JPhoneNoHosp.getText();
            String emailHosp = JEmailHosp.getText();
 
            int x= 0;
            //String image = image_txt.getText();
            //int length = cellphoneno.length();

            int length = phoneNoHosp.length();
            if(length<10){
                JOptionPane.showMessageDialog(this,
                    "Please enter cell no of 10 digits",
                    "Try Again",
                    JOptionPane.ERROR_MESSAGE);
                x=1;

            } else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", emailHosp)))
            {
                JOptionPane.showMessageDialog(null,
                    "Please enter a valid email",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                x=1;

            } if(x!=1){
                model.setValueAt(hospitalID, JTableHosp.getSelectedRow(),0);
                model.setValueAt(hospitalName, JTableHosp.getSelectedRow(),1);
                model.setValueAt(phoneNoHosp, JTableHosp.getSelectedRow(),2);
                model.setValueAt(emailHosp, JTableHosp.getSelectedRow(),3);


                JOptionPane.showMessageDialog(this, "Update Successfully");
            }
        }
        else if (JTableHosp.getRowCount()==0){
            //if table is empty
            JOptionPane.showMessageDialog(this, "table is empty");
        } else  {
            //if row is not selected or multiple row is selected
            JOptionPane.showMessageDialog(this, "Please select single row for update");

        }

        JHospID.setText("");
        JNameHosp.setText("");
        JPhoneNoHosp.setText("");
        JEmailHosp.setText("");
    }//GEN-LAST:event_JUpdatePatBtnMouseClicked

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
            java.util.logging.Logger.getLogger(ViewHospitalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewHospitalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewHospitalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewHospitalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewHospitalDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBackPatientViewBtn;
    private javax.swing.JTextField JEmailHosp;
    private javax.swing.JTextField JHospID;
    private javax.swing.JTextField JNameHosp;
    private javax.swing.JTextField JPhoneNoHosp;
    public javax.swing.JTable JTableHosp;
    private javax.swing.JButton JUpdatePatBtn;
    private javax.swing.JLabel SearchPat;
    private javax.swing.JTextField TFSearchPat;
    private javax.swing.JButton jBtnDeleteViewPatientDetails;
    private javax.swing.JButton jBtnViewPatDetails;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) JTableHosp.getModel();
        model.setRowCount(0);
        
        for(HospitalData hd : HospDirectory.getHospitalDirectory()){
            
            Object[] row = new Object[4];
            row[0] =  hd;
            row[1] =  hd.getHospitalName();
            row[2] =  hd.getPhoneNo();
            row[3] =  hd.getEmailAddress();

            
            model.addRow(row);
            
            
        }      

    }
        
    }
