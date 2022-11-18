/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Employee;
import model.employeeData;

/**
 *
 * @author pratiksannakki
 */
public class createJPanel extends javax.swing.JPanel {
 public static ArrayList<HashMap<String, String>> details = new ArrayList<>();
    /**
     * Creates new form createJPanel
     */
    employeeData empData;
    public static String imagegPath;
    public createJPanel(employeeData empData) {
        initComponents();
        this.empData=empData;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        phoneNojTextField = new javax.swing.JTextField();
        empIDjTextField = new javax.swing.JTextField();
        emailjTextField = new javax.swing.JTextField();
        agejTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imageDisplay = new javax.swing.JLabel();
        browseImagejButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        teamInfojTextField = new javax.swing.JTextField();
        namejTextField = new javax.swing.JTextField();
        positionTitlejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        saveDetails = new javax.swing.JButton();
        dropDown = new javax.swing.JComboBox<>();
        Maleselect = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setText("Position title :");

        jLabel8.setText("Contact Info :");

        jLabel4.setText("Start date :");

        jLabel9.setText("Cell phone number :");

        jLabel5.setText("Gender :");

        jLabel10.setText("Email :");

        jLabel6.setText("Age :");

        emailjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailjTextFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Al Bayan", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Employee Details");
        jLabel11.setMaximumSize(new java.awt.Dimension(2000, 1000));

        jLabel1.setText("Name :");

        imageDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageDisplay.setText("Image");
        imageDisplay.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        browseImagejButton.setText("Select Image");
        browseImagejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseImagejButtonActionPerformed(evt);
            }
        });

        jLabel12.setText("Level :");

        jLabel2.setText("Employee ID :");

        jLabel7.setText("Team info :");

        saveDetails.setText("Save Detals");
        saveDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDetailsActionPerformed(evt);
            }
        });

        dropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L1", "L2", "L3", "L4" }));
        dropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropDownActionPerformed(evt);
            }
        });

        buttonGroup1.add(Maleselect);
        Maleselect.setText("Male ");
        Maleselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleselectActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(170, 170, 170)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(empIDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(agejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(191, 191, 191)
                                    .addComponent(Maleselect)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton2)))
                            .addGap(111, 111, 111)
                            .addComponent(imageDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGap(174, 174, 174)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(teamInfojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(positionTitlejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneNojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(176, 176, 176))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(dropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(133, 133, 133)))
                                    .addComponent(browseImagejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(saveDetails)
                        .addGap(328, 328, 328)))
                .addGap(186, 186, 186))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imageDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(browseImagejButton))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(empIDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(agejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Maleselect)
                            .addComponent(jRadioButton2)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teamInfojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(positionTitlejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addComponent(saveDetails)
                .addContainerGap(248, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void emailjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailjTextFieldActionPerformed

    private void browseImagejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseImagejButtonActionPerformed

        JFileChooser browseImage = new JFileChooser();
        FileNameExtensionFilter fnet = new FileNameExtensionFilter("IMAGES", "png","jpg","jpeg");
        browseImage.addChoosableFileFilter(fnet);
        
        int fileDialogue = browseImage.showOpenDialog(null);
        if (fileDialogue== JFileChooser.APPROVE_OPTION){
            File selectedImage= browseImage.getSelectedFile();
            String imagePath= selectedImage.getAbsolutePath();
            imagegPath= selectedImage.getAbsolutePath();
            //JOptionPane.showMessageDialog(null, imagePath);
            //Displayes the image to the label-imageDisplay
            ImageIcon d = new ImageIcon(imagePath);
            //Scales the image
            Image image= d.getImage().getScaledInstance(imageDisplay.getWidth(), imageDisplay.getHeight(),Image.SCALE_SMOOTH);
            
            imageDisplay.setIcon(new ImageIcon(image));
            
      
            

        }
    }//GEN-LAST:event_browseImagejButtonActionPerformed

    private void saveDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDetailsActionPerformed
        // TODO add your handling code here:
            
            String name = namejTextField.getText();
            String empID =empIDjTextField.getText();
            int age;
            long phoneNo;
            if(!agejTextField.getText().matches("\\d+")){
               
               JOptionPane.showMessageDialog(this, "enter the Age in Numbers only");
                return;
               
            }
            if (agejTextField.getText().isEmpty())
            {
                age=0;
                
            }
           
            else{
                
                age = Integer.parseInt( agejTextField.getText());
            }
            
            if(age <18  ){
               
                
                JOptionPane.showMessageDialog(this, "enter a valid Age ");
                return;
                
            }
           
           if(!phoneNojTextField.getText().matches("\\d+")){
               
               JOptionPane.showMessageDialog(this, "enter a Valid 10 digit phone number");
                return;
               
            }
            
            String gender="";
            if(Maleselect.isSelected()){
              gender="Male";
            }
            else if (jRadioButton2.isSelected()){
                
                gender="Female";
            }
            
            Date startDate  =  jDateChooser1.getDate();
            String label = dropDown.getSelectedItem().toString();
            String teamInfo= teamInfojTextField.getText();
            String positionTitle=positionTitlejTextField.getText();
            if (phoneNojTextField.getText().isEmpty())
            {
                phoneNo=0;
                
            System.out.println(phoneNo);
            
            }
            else{
                
                phoneNo= Long.parseLong(phoneNojTextField.getText());
            }
            
            String email = emailjTextField.getText();
            
            
            
            if (empID.isEmpty()){
                JOptionPane.showMessageDialog(this, "enter empID");
                return;
                
            }
            else{
            
            
            
            
            
                System.out.println(imagegPath);    
            
            if (empID.isEmpty() || phoneNo==0 || gender=="" || name=="" || imagegPath==null||imagegPath==""){
                JOptionPane.showMessageDialog(this, "Please select an Image and enter Name, Age, Emloyee ID, Gender and Phone No. they are Mandatory fields");
                
            }
            else{
                
            String myStringNumber = String.valueOf(phoneNo);
            int length = myStringNumber.length();
            if (length==10)
            {
                
            if (((name != null) && (!name.equals(""))
                && (name.matches("^[a-zA-Z]*$")))){
             int k=0;
            for(Employee em : empData.getEmpdata()){
                System.out.println(em.getEmployeeID()+empID);
                if (em.getEmployeeID().toString().equals(empID.toString())){
                    System.out.println("hello");
                    
                    return;
                }
               
                }
                
              
            Employee emp = empData.addDetails();    
            emp.setCell_phone_number(phoneNo);
            emp.setLevel(label);
            emp.setTeamInfo(teamInfo);
            emp.setStartDate(startDate);
            emp.setPositionTitle(positionTitle);
            emp.setEmailAddress(email);
            emp.setGender(gender);
            emp.setImagePath(imagegPath);
            
            emp.setEmployeeID(empID);
              
            
            emp.setName(name.toLowerCase());
            emp.setAge(age);
            
            JOptionPane.showMessageDialog(this, "Details saved");
            namejTextField.setText("");
            
            empIDjTextField.setText("");
            agejTextField.setText("");
            //datejTextField.setText("");
            teamInfojTextField.setText("");
            positionTitlejTextField.setText("");
            emailjTextField.setText("");
            phoneNojTextField.setText("");
             imagegPath="";
            ImageIcon d = new ImageIcon(imagegPath);
            //Scales the image
            Image image= d.getImage().getScaledInstance(imageDisplay.getWidth(), imageDisplay.getHeight(),Image.SCALE_SMOOTH);
            
            imageDisplay.setIcon(new ImageIcon(image));
            
            
            
            }
            else{
                JOptionPane.showMessageDialog(this, "enter a valid Name must have only Alpabets no special charaters or spaces not allowed");
                return;
            }
            
            
            }
            else{
                JOptionPane.showMessageDialog(this, "enter a valid 10 digit phone No");
                return;
            }
            
            
            }
            
            
            
            
            
            }
            
    }//GEN-LAST:event_saveDetailsActionPerformed

    private void MaleselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleselectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleselectActionPerformed

    private void dropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropDownActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Maleselect;
    private javax.swing.JTextField agejTextField;
    private javax.swing.JButton browseImagejButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox<String> dropDown;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JTextField empIDjTextField;
    private javax.swing.JLabel imageDisplay;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JTextField phoneNojTextField;
    private javax.swing.JTextField positionTitlejTextField;
    private javax.swing.JButton saveDetails;
    private javax.swing.JTextField teamInfojTextField;
    // End of variables declaration//GEN-END:variables

    private String String(String imagegPath) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
