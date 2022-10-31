/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hms;

import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import javax.swing.GroupLayout.Group;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.DocData;
import model.DoctorDirectory;
import model.House;
import model.City;
import model.CityDirectory;
import model.Community;
import model.CommunityDirectory;
import model.HospitalDirectory;
import model.PatientDirectory;

/**
 *
 * @author anupamaditya
 */
public class HospitalViewDoctorDetails extends javax.swing.JFrame {

    /**
     * Creates new form ViewDoctorDetails
     */
    
    
    DoctorDirectory DocDirectory;
    HospitalDirectory HospDirectory;
    PatientDirectory PatDirectory;
    CityDirectory cityDirectory;
    CommunityDirectory CommDirectory;

    
//    public ViewDoctorDetails(DoctorDirectory DocDirectory) {
//        initComponents();
//        
//        this.DocDirectory = DocDirectory;
//        
//       populateTable();
//    }

    private HospitalViewDoctorDetails() {
      // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      initComponents();
   }

    HospitalViewDoctorDetails(DoctorDirectory DocDirectory, HospitalDirectory HospDirectory, PatientDirectory PatDirectory, CityDirectory cityDirectory, CommunityDirectory CommDirectory) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody 
        initComponents();
        this.DocDirectory = DocDirectory;
        this.HospDirectory = HospDirectory;
         this.PatDirectory = PatDirectory;
         this.cityDirectory = cityDirectory;
         this.CommDirectory = CommDirectory;
        populateTable();
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
        jBtnViewDocDetails = new javax.swing.JButton();
        jBtnDeleteViewDoctorDetails = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        JPinCode = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        JEmail = new javax.swing.JTextField();
        JBackViewDoctorBtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        JCommunityDoc = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        JCountryDoc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(null);

        JTableDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "DocID", "FName", "LName", "Age", "Gender", "Blood Group", "Department", "Address", "Community", "PinCode", "City", "PhoneNo", "Country", "Joining Date", "Email"
            }
        ));
        jScrollPane2.setViewportView(JTableDoc);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(300, 80, 1090, 420);
        jPanel1.add(JDocID);
        JDocID.setBounds(100, 30, 170, 30);

        JFNameDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JFNameDocKeyPressed(evt);
            }
        });
        jPanel1.add(JFNameDoc);
        JFNameDoc.setBounds(100, 100, 170, 30);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 100, 73, 18);

        JLNameDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JLNameDocKeyPressed(evt);
            }
        });
        jPanel1.add(JLNameDoc);
        JLNameDoc.setBounds(100, 160, 170, 30);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 160, 72, 18);

        JAgeDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JAgeDocActionPerformed(evt);
            }
        });
        JAgeDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JAgeDocKeyPressed(evt);
            }
        });
        jPanel1.add(JAgeDoc);
        JAgeDoc.setBounds(100, 220, 170, 30);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Age");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 230, 27, 18);
        jPanel1.add(JBGroupDoc);
        JBGroupDoc.setBounds(100, 280, 170, 30);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Blood Group");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 280, 87, 18);

        JGenderDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other", " ", " " }));
        JGenderDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JGenderDocActionPerformed(evt);
            }
        });
        jPanel1.add(JGenderDoc);
        JGenderDoc.setBounds(100, 340, 170, 30);

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 350, 49, 18);

        JDepartmentDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JDepartmentDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDepartmentDocActionPerformed(evt);
            }
        });
        jPanel1.add(JDepartmentDoc);
        JDepartmentDoc.setBounds(100, 410, 170, 30);

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Department");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 420, 79, 18);
        jPanel1.add(JAddressDoc);
        JAddressDoc.setBounds(100, 470, 170, 30);

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 480, 57, 18);

        JPhoneNoDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JPhoneNoDocKeyPressed(evt);
            }
        });
        jPanel1.add(JPhoneNoDoc);
        JPhoneNoDoc.setBounds(100, 670, 170, 30);

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Phone No");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 670, 65, 18);
        jPanel1.add(JCityDoc);
        JCityDoc.setBounds(100, 600, 170, 30);

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("City");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 600, 26, 18);
        jPanel1.add(JJoiningDateDoc);
        JJoiningDateDoc.setBounds(100, 740, 170, 30);

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Joining date");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 750, 84, 18);

        JUpdateDocBtn.setBackground(new java.awt.Color(0, 105, 153));
        JUpdateDocBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        JUpdateDocBtn.setForeground(new java.awt.Color(255, 255, 255));
        JUpdateDocBtn.setText("Update");
        JUpdateDocBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JUpdateDocBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JUpdateDocBtnMouseClicked(evt);
            }
        });
        jPanel1.add(JUpdateDocBtn);
        JUpdateDocBtn.setBounds(440, 520, 170, 30);

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon("/Users/anupamaditya/Downloads/search.png")); // NOI18N
        jLabel13.setText("Search");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel13);
        jLabel13.setBounds(300, 20, 130, 40);

        TFSearchDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFSearchDocKeyReleased(evt);
            }
        });
        jPanel1.add(TFSearchDoc);
        TFSearchDoc.setBounds(450, 20, 500, 40);

        jBtnViewDocDetails.setBackground(new java.awt.Color(0, 105, 153));
        jBtnViewDocDetails.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jBtnViewDocDetails.setForeground(new java.awt.Color(255, 255, 255));
        jBtnViewDocDetails.setText("View");
        jBtnViewDocDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnViewDocDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnViewDocDetailsMouseClicked(evt);
            }
        });
        jPanel1.add(jBtnViewDocDetails);
        jBtnViewDocDetails.setBounds(310, 520, 110, 30);

        jBtnDeleteViewDoctorDetails.setBackground(new java.awt.Color(0, 105, 153));
        jBtnDeleteViewDoctorDetails.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jBtnDeleteViewDoctorDetails.setForeground(new java.awt.Color(255, 255, 255));
        jBtnDeleteViewDoctorDetails.setIcon(new javax.swing.ImageIcon("/Users/anupamaditya/Downloads/trash.png")); // NOI18N
        jBtnDeleteViewDoctorDetails.setText("Delete");
        jBtnDeleteViewDoctorDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnDeleteViewDoctorDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnDeleteViewDoctorDetailsMouseClicked(evt);
            }
        });
        jPanel1.add(jBtnDeleteViewDoctorDetails);
        jBtnDeleteViewDoctorDetails.setBounds(1010, 20, 170, 40);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Doctor ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 40, 64, 18);

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("PinCode");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 540, 70, 30);
        jPanel1.add(JPinCode);
        JPinCode.setBounds(100, 540, 170, 30);

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Email");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(10, 810, 80, 30);
        jPanel1.add(JEmail);
        JEmail.setBounds(100, 810, 170, 30);

        JBackViewDoctorBtn.setBackground(new java.awt.Color(0, 153, 204));
        JBackViewDoctorBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        JBackViewDoctorBtn.setForeground(new java.awt.Color(255, 255, 255));
        JBackViewDoctorBtn.setIcon(new javax.swing.ImageIcon("/Users/anupamaditya/Downloads/undo-2.png")); // NOI18N
        JBackViewDoctorBtn.setText("Back");
        JBackViewDoctorBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBackViewDoctorBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBackViewDoctorBtnMouseClicked(evt);
            }
        });
        jPanel1.add(JBackViewDoctorBtn);
        JBackViewDoctorBtn.setBounds(1220, 20, 140, 40);

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Community");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(310, 600, 100, 30);
        jPanel1.add(JCommunityDoc);
        JCommunityDoc.setBounds(400, 600, 170, 30);

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Country");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(310, 670, 90, 30);
        jPanel1.add(JCountryDoc);
        JCountryDoc.setBounds(400, 670, 170, 30);

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 1390, 910);

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

    private void jBtnDeleteViewDoctorDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnDeleteViewDoctorDetailsMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = JTableDoc.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select row to delete");
        }
        
        DefaultTableModel model = (DefaultTableModel) JTableDoc.getModel();
        DocData selectedDoc = (DocData) model.getValueAt(selectedRowIndex, 0);
        
        
        DocDirectory.deleteDoc(selectedDoc);
        
        JOptionPane.showMessageDialog(this, "Doctor Details has been deleted");
        
        populateTable();
    }//GEN-LAST:event_jBtnDeleteViewDoctorDetailsMouseClicked

    private void jBtnViewDocDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnViewDocDetailsMouseClicked
        // TODO add your handling code here:
        
        int selectedRowIndex = JTableDoc.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select row to delete");
        }
        
        DefaultTableModel model = (DefaultTableModel) JTableDoc.getModel();
        DocData selectedDoc = (DocData) model.getValueAt(selectedRowIndex, 0);
        
        JDocID.setText(String.valueOf(selectedDoc.getDocID()));  //here String.valueof is used to convert any data type like int to String.
        //JDocID.setEditable(false);
        
        JFNameDoc.setText(String.valueOf(selectedDoc.getFName()));
        //JFNameDoc.setEditable(false);
        
        JLNameDoc.setText(String.valueOf(selectedDoc.getLName()));
        //JLNameDoc.setEditable(false);
        
        JAgeDoc.setText(String.valueOf(selectedDoc.getAge()));
        //JAgeDoc.setEditable(false);
        
        JBGroupDoc.setText(String.valueOf(selectedDoc.getBloodgroup()));
        //JBGroupDoc.setEditable(false);
        
        JGenderDoc.setSelectedItem(String.valueOf(selectedDoc.getGender())); 
        //JGenderDoc.setEditable(false);
        
        JDepartmentDoc.setSelectedItem(String.valueOf(selectedDoc.getDepartment()));
        //JDepartmentDoc.setEditable(false);
        
        House docHouse = selectedDoc.getHouse();
        String stAddress = docHouse.getStreetAddress();
        JAddressDoc.setText(String.valueOf(stAddress));
        
        
        JPhoneNoDoc.setText(String.valueOf(selectedDoc.getPhoneNo()));
        //JPhoneNoDoc.setEditable(false);
        
        City docCity = selectedDoc.getCity();
        String city = docCity.getCity();
        JCityDoc.setText(String.valueOf(city));
        
        //JCityDoc.setText(String.valueOf(selectedDoc.getCity()));
        //JCityDoc.setEditable(false);
        
        JJoiningDateDoc.setDate(selectedDoc.getJoiningDate());
       // JJoiningDateDoc.setEnabled(false);
       
        Community docCommunity = selectedDoc.getCommunity();
        String docComm = docCommunity.getCommunityName();
        JCommunityDoc.setText(String.valueOf(docComm));
        
        Community docpincode = selectedDoc.getPincode();
        String docpcode = docpincode.getPincode();
        JPinCode.setText(String.valueOf(docpcode));
        
        City docCountry = selectedDoc.getCountry();
        String country = docCountry.getCountry();
        JCountryDoc.setText(String.valueOf(country));
        
        JEmail.setText(String.valueOf(selectedDoc.getEmailAddress()));
        
           
    }//GEN-LAST:event_jBtnViewDocDetailsMouseClicked

    private void JUpdateDocBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JUpdateDocBtnMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) JTableDoc.getModel();
        if (JTableDoc.getSelectedRowCount()==1){
            
        String docID = JDocID.getText();
        String fname = JFNameDoc.getText();
        String lname = JLNameDoc.getText();
        int age = Integer.parseInt(JAgeDoc.getText());
        String gender = JGenderDoc.getSelectedItem().toString();
        String department = JDepartmentDoc.getSelectedItem().toString();
        String address = JAddressDoc.getText();
        String country = JCountryDoc.getText();
        String community = JCommunityDoc.getText();
        String bloodgroup = JBGroupDoc.getText();
        String phoneNo = JPhoneNoDoc.getText();
        String city = JCityDoc.getText();
        Date JoiningDate = JJoiningDateDoc.getDate();
        String pincode = JPinCode.getText();
        String email = JEmail.getText();
        int x= 0;
               //String image = image_txt.getText();
                //int length = cellphoneno.length();
           
         int length = phoneNo.length();
        if(length<10){
            JOptionPane.showMessageDialog(this,
                    "Please enter cell no of 10 digits",
                    "Try Again",
                    JOptionPane.ERROR_MESSAGE);
                    x=1;
            
        } else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", email))) 
           {
            JOptionPane.showMessageDialog(null,
                    "Please enter a valid email",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                    x=1;
           
            } if(x!=1){
               model.setValueAt(docID, JTableDoc.getSelectedRow(),0);
               model.setValueAt(fname, JTableDoc.getSelectedRow(),1);
               model.setValueAt(lname, JTableDoc.getSelectedRow(),2);
               model.setValueAt(age, JTableDoc.getSelectedRow(),3);
               model.setValueAt(gender, JTableDoc.getSelectedRow(),4);
               model.setValueAt(bloodgroup, JTableDoc.getSelectedRow(),5);
               model.setValueAt(department, JTableDoc.getSelectedRow(),6);
               model.setValueAt(address, JTableDoc.getSelectedRow(),7);
               model.setValueAt(community, JTableDoc.getSelectedRow(),8);
               model.setValueAt(pincode, JTableDoc.getSelectedRow(),9);
               model.setValueAt(city, JTableDoc.getSelectedRow(),10);
               model.setValueAt(phoneNo, JTableDoc.getSelectedRow(),11);
               model.setValueAt(country, JTableDoc.getSelectedRow(),12);
               model.setValueAt(JoiningDate, JTableDoc.getSelectedRow(),13);
               model.setValueAt(email, JTableDoc.getSelectedRow(),14);
        
        JOptionPane.showMessageDialog(this, "Update Successfully");
            }
        }
        else if (JTableDoc.getRowCount()==0){
                //if table is empty
                JOptionPane.showMessageDialog(this, "table is empty");
            } else  {
                //if row is not selected or multiple row is selected
                JOptionPane.showMessageDialog(this, "Please select single row for update");
                
            } 
        
            JDocID.setText("");
            JFNameDoc.setText("");
            JLNameDoc.setText("");
            JAgeDoc.setText("");
            JBGroupDoc.setText("");
            JGenderDoc.setSelectedIndex(0);
            JDepartmentDoc.setSelectedIndex(0);
            JCityDoc.setText("");
            JAddressDoc.setText("");
            JPhoneNoDoc.setText("");
            JPinCode.setText("");
            JEmail.setText("");
            JCommunityDoc.setText("");
            JCountryDoc.setText("");
           // JJoiningDateDoc.setDate("");
       
    }//GEN-LAST:event_JUpdateDocBtnMouseClicked

    public void search(String str){
        DefaultTableModel model = (DefaultTableModel) JTableDoc.getModel();
        TableRowSorter<DefaultTableModel> trs  = new TableRowSorter<DefaultTableModel>(model);
        JTableDoc.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
        
    }
    
    
    private void JAgeDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JAgeDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JAgeDocActionPerformed

    private void TFSearchDocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFSearchDocKeyReleased
        // TODO add your handling code here:
        
        String search = TFSearchDoc.getText();
        search(search);
    }//GEN-LAST:event_TFSearchDocKeyReleased

    private void JFNameDocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JFNameDocKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c) || Character.isWhitespace(c )|| Character.isISOControl(c)){
            JFNameDoc.setEditable(true);
        } else {
            JFNameDoc.setEditable(false);
        }
    }//GEN-LAST:event_JFNameDocKeyPressed

    private void JLNameDocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JLNameDocKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c) || Character.isWhitespace(c )|| Character.isISOControl(c)){
            JLNameDoc.setEditable(true);
        } else {
            JLNameDoc.setEditable(false);
        }
    }//GEN-LAST:event_JLNameDocKeyPressed

    private void JAgeDocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JAgeDocKeyPressed
        // TODO add your handling code here:
        String CellNumber = JAgeDoc.getText();
        int length = CellNumber.length();
        char c = evt.getKeyChar();
        
        //check for number 0 to 1
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            //check for length not more than 2 digit
            if(length<2){
                JAgeDoc.setEditable(true);
                
            } else{
                JAgeDoc.setEditable(false);
            }
        }else{
            if (evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                JAgeDoc.setEditable(true);
            } else{
                JAgeDoc.setEditable(false);
            }
        }
    }//GEN-LAST:event_JAgeDocKeyPressed

    private void JPhoneNoDocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JPhoneNoDocKeyPressed
        // TODO add your handling code here:
        try{
        String CellNumber = JPhoneNoDoc.getText();
        int length = CellNumber.length();
        char c = evt.getKeyChar();
        
        //check for number 0 to 9
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            //check for length not more than 10 digit
            if(length<10){
                JPhoneNoDoc.setEditable(true);
                
            } else{
                JPhoneNoDoc.setEditable(false);
            }
        }else{
            if (evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                JPhoneNoDoc.setEditable(true);
            } else{
                JPhoneNoDoc.setEditable(false);
            }
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_JPhoneNoDocKeyPressed

    private void JBackViewDoctorBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBackViewDoctorBtnMouseClicked
        // TODO add your handling code here:
        DoctorDetailsAdmin dda1 = new DoctorDetailsAdmin(DocDirectory, HospDirectory, PatDirectory, cityDirectory, CommDirectory);
        dda1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBackViewDoctorBtnMouseClicked

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
            java.util.logging.Logger.getLogger(HospitalViewDoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalViewDoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalViewDoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalViewDoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalViewDoctorDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JAddressDoc;
    private javax.swing.JTextField JAgeDoc;
    private javax.swing.JTextField JBGroupDoc;
    private javax.swing.JButton JBackViewDoctorBtn;
    private javax.swing.JTextField JCityDoc;
    private javax.swing.JTextField JCommunityDoc;
    private javax.swing.JTextField JCountryDoc;
    private javax.swing.JComboBox<String> JDepartmentDoc;
    private javax.swing.JTextField JDocID;
    private javax.swing.JTextField JEmail;
    private javax.swing.JTextField JFNameDoc;
    private javax.swing.JComboBox<String> JGenderDoc;
    private com.toedter.calendar.JDateChooser JJoiningDateDoc;
    private javax.swing.JTextField JLNameDoc;
    private javax.swing.JTextField JPhoneNoDoc;
    private javax.swing.JTextField JPinCode;
    public javax.swing.JTable JTableDoc;
    private javax.swing.JButton JUpdateDocBtn;
    private javax.swing.JTextField TFSearchDoc;
    private javax.swing.JButton jBtnDeleteViewDoctorDetails;
    private javax.swing.JButton jBtnViewDocDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
            
            Object[] row = new Object[15];
            row[0] =  dd;
            row[1] =  dd.getFName();
            row[2] =  dd.getLName();
            row[3] =  dd.getAge();
            row[4] =  dd.getGender();
            row[5] =  dd.getBloodgroup();
            row[6] =  dd.getDepartment();
            
            House hd = dd.getHouse();
            row[7] =  hd.getStreetAddress();
            
            Community cc = dd.getCommunity();
            row[8] = cc.getCommunityName();
            
            Community cd = dd.getPincode();
            row[9] =  cd.getPincode();
            
            City cy = dd.getCity();
            row[10] = cy.getCity();
            
            row[11] = dd.getPhoneNo();
            
            City ctry = dd.getCountry();         
            row[12] =  ctry.getCountry();
            
            row[13] = dd.getJoiningDate();
            row[14] = dd.getEmailAddress();
            
            model.addRow(row);
            
            
        }
        

    }
    }

