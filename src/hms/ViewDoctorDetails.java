/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hms;

import javax.swing.GroupLayout.Group;
import javax.swing.table.DefaultTableModel;
import model.DocData;
import model.DoctorDirectory;

/**
 *
 * @author anupamaditya
 */
public class ViewDoctorDetails extends javax.swing.JFrame {

    /**
     * Creates new form ViewDoctorDetails
     */
    
    
    DoctorDirectory DocDirectory;
    
    public ViewDoctorDetails(DoctorDirectory DocDirectory) {
        initComponents();
        
        this.DocDirectory = DocDirectory;
        
       populateTable();
    }

    private ViewDoctorDetails() {
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
        JTableDoc = new javax.swing.JTable();
        JDocID = new javax.swing.JTextField();
        JFNameDoc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JLNameDoc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JAgeDoc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JBGroupDoc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JGenderDoc = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        JDepartmentDoc = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        JAddressDoc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JPhoneNoDoc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JCityDoc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        JJoiningDateDoc = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        JUpdateDocBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        TFSearchDoc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(null);

        JTableDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "DocID", "FName", "LName", "Age", "Blood Group", "Department", "Address", "City", "PhoneNo", "Joining Date"
            }
        ));
        jScrollPane2.setViewportView(JTableDoc);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(300, 80, 1090, 420);
        jPanel1.add(JDocID);
        JDocID.setBounds(100, 100, 170, 30);
        jPanel1.add(JFNameDoc);
        JFNameDoc.setBounds(100, 170, 170, 30);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 180, 73, 18);
        jPanel1.add(JLNameDoc);
        JLNameDoc.setBounds(100, 240, 170, 30);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 250, 72, 18);
        jPanel1.add(JAgeDoc);
        JAgeDoc.setBounds(100, 310, 170, 30);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Age");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 320, 27, 18);
        jPanel1.add(JBGroupDoc);
        JBGroupDoc.setBounds(100, 370, 170, 30);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Blood Group");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 380, 87, 18);

        JGenderDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other", " ", " " }));
        JGenderDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JGenderDocActionPerformed(evt);
            }
        });
        jPanel1.add(JGenderDoc);
        JGenderDoc.setBounds(100, 440, 170, 30);

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 450, 49, 18);

        JDepartmentDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JDepartmentDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDepartmentDocActionPerformed(evt);
            }
        });
        jPanel1.add(JDepartmentDoc);
        JDepartmentDoc.setBounds(100, 510, 170, 30);

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Department");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 520, 79, 18);
        jPanel1.add(JAddressDoc);
        JAddressDoc.setBounds(100, 580, 170, 30);

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 590, 57, 18);
        jPanel1.add(JPhoneNoDoc);
        JPhoneNoDoc.setBounds(100, 650, 170, 30);

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Phone No");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 660, 65, 18);
        jPanel1.add(JCityDoc);
        JCityDoc.setBounds(100, 730, 170, 30);

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("City");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 740, 26, 18);
        jPanel1.add(JJoiningDateDoc);
        JJoiningDateDoc.setBounds(100, 800, 170, 30);

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Joining date");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 810, 84, 18);

        JUpdateDocBtn.setText("Update");
        jPanel1.add(JUpdateDocBtn);
        JUpdateDocBtn.setBounds(100, 870, 170, 30);

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon("/Users/anupamaditya/Downloads/search.png")); // NOI18N
        jLabel13.setText("Search");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel13);
        jLabel13.setBounds(300, 20, 130, 40);
        jPanel1.add(TFSearchDoc);
        TFSearchDoc.setBounds(450, 20, 500, 40);

        jButton1.setText("View");
        jPanel1.add(jButton1);
        jButton1.setBounds(310, 520, 110, 30);

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1390, 910);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Doctor ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 110, 64, 18);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1394, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
   
    private void JGenderDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JGenderDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JGenderDocActionPerformed

    private void JDepartmentDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDepartmentDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JDepartmentDocActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDoctorDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JAddressDoc;
    private javax.swing.JTextField JAgeDoc;
    private javax.swing.JTextField JBGroupDoc;
    private javax.swing.JTextField JCityDoc;
    private javax.swing.JComboBox<String> JDepartmentDoc;
    private javax.swing.JTextField JDocID;
    private javax.swing.JTextField JFNameDoc;
    private javax.swing.JComboBox<String> JGenderDoc;
    private com.toedter.calendar.JDateChooser JJoiningDateDoc;
    private javax.swing.JTextField JLNameDoc;
    private javax.swing.JTextField JPhoneNoDoc;
    private javax.swing.JTable JTableDoc;
    private javax.swing.JButton JUpdateDocBtn;
    private javax.swing.JTextField TFSearchDoc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
       
        DefaultTableModel model = (DefaultTableModel) JTableDoc.getModel();
        model.setRowCount(0);
        
        for(DocData dd : DocDirectory.getDoctorDirectory()){
            
            Object[] row = new Object[10];
            row[0] =  dd.getDocID();
            row[1] =  dd.getFName();
            row[2] =  dd.getLName();
            row[3] =  dd.getAge();
            row[4] =  dd.getBloodgroup();
            row[5] =  dd.getDepartment();
            row[6] =  dd.getAddress();
            row[7] =  dd.getCity();
            row[8] =  dd.getPhoneNo();
            row[9] =  dd.getJoiningDate();
            
            model.addRow(row);
            
            
        }
        

    }
    }

