/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.CarProfile;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;



/**
 *
 * @author Anjali
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    CarProfile carProfile;
    public CreateJPanel(CarProfile carProfile) {
        initComponents();
        this.carProfile = carProfile;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        lblTitle = new javax.swing.JLabel();
        lblBrand = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblmodel = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        lblColor = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        lblEngineNo = new javax.swing.JLabel();
        txtEngineNo = new javax.swing.JTextField();
        lblSeats = new javax.swing.JLabel();
        txtOwnerTele = new javax.swing.JTextField();
        lblLicensePlates = new javax.swing.JLabel();
        txtSeats = new javax.swing.JTextField();
        lblOwnerName = new javax.swing.JLabel();
        txtLicensePlates = new javax.swing.JTextField();
        lblOwnerTele = new javax.swing.JLabel();
        txtOwnerName = new javax.swing.JTextField();
        lblOwnerEmail = new javax.swing.JLabel();
        txtOwnerEmail = new javax.swing.JTextField();
        lblOwnerDriverLic = new javax.swing.JLabel();
        txtOwnerAddress = new javax.swing.JTextField();
        lblOwnerSocialSecurityNum = new javax.swing.JLabel();
        txtOwnerDriverLic = new javax.swing.JTextField();
        lblOwnerAddress = new javax.swing.JLabel();
        txtSocailSecurityNum = new javax.swing.JTextField();
        iblServiceRecords = new javax.swing.JLabel();
        iblWarrantyYear = new javax.swing.JLabel();
        txtWarrantyYear = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblCharges = new javax.swing.JLabel();
        txtParts = new javax.swing.JTextField();
        lblParts = new javax.swing.JLabel();
        txtCharges1 = new javax.swing.JTextField();
        btnPhoto = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        lblTitle.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Car Profile");

        lblBrand.setText("Brand:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblmodel.setText("Model:");

        lblColor.setText("Color:");

        lblYear.setText("Year:");

        lblEngineNo.setText("Engine No:");

        lblSeats.setText("Seats Number:");

        lblLicensePlates.setText("License Plates:");

        lblOwnerName.setText("Owner Name:");

        txtLicensePlates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicensePlatesActionPerformed(evt);
            }
        });

        lblOwnerTele.setText("Owner TelePhone Numbers:");

        lblOwnerEmail.setText("Owner Email Address:");

        lblOwnerDriverLic.setText("Owner Drivers License:");

        txtOwnerAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwnerAddressActionPerformed(evt);
            }
        });

        lblOwnerSocialSecurityNum.setText("Owner Social Security Number:");

        lblOwnerAddress.setText("Owner Address:");

        iblServiceRecords.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        iblServiceRecords.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iblServiceRecords.setText("Service Records of Car");

        iblWarrantyYear.setText("Warranty Year:");

        txtWarrantyYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWarrantyYearActionPerformed(evt);
            }
        });

        lblPhoto.setText("Photo:");

        lblDate.setText("Date:");

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        lblCharges.setText("Charges:");

        txtParts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPartsActionPerformed(evt);
            }
        });

        lblParts.setText("Parts:");

        txtCharges1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCharges1ActionPerformed(evt);
            }
        });

        btnPhoto.setText("jButton1");
        btnPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhotoActionPerformed(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iblServiceRecords, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblOwnerTele)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblOwnerName)
                                    .addGap(19, 19, 19)
                                    .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblOwnerEmail)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblYear)
                                    .addComponent(lblBrand))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(64, 64, 64)
                                                .addComponent(iblWarrantyYear))
                                            .addComponent(lblmodel))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(lblLicensePlates)
                                                        .addGap(15, 15, 15))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGap(65, 65, 65)
                                                        .addComponent(lblColor)
                                                        .addGap(18, 18, 18)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtLicensePlates, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblOwnerDriverLic)
                                                    .addComponent(lblEngineNo)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtOwnerTele, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtOwnerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(lblOwnerSocialSecurityNum))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(lblPhoto)
                                                            .addComponent(lblOwnerAddress))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtOwnerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lblSeats))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addComponent(btnPhoto)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 300, Short.MAX_VALUE)))))))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOwnerDriverLic)
                                    .addComponent(txtEngineNo, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSocailSecurityNum, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(lblCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCharges1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(lblParts, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtParts, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBrand, txtCharges1, txtColor, txtDate, txtEngineNo, txtLicensePlates, txtModel, txtOwnerAddress, txtOwnerDriverLic, txtOwnerEmail, txtOwnerName, txtOwnerTele, txtParts, txtSeats, txtSocailSecurityNum, txtWarrantyYear, txtYear});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBrand)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmodel)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColor)
                    .addComponent(lblEngineNo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEngineNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYear)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iblWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOwnerDriverLic, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOwnerDriverLic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLicensePlates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLicensePlates, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOwnerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOwnerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOwnerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOwnerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOwnerTele, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOwnerTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOwnerSocialSecurityNum, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSocailSecurityNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhoto)
                            .addComponent(btnPhoto))
                        .addGap(97, 97, 97)
                        .addComponent(iblServiceRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCharges)
                            .addComponent(txtCharges1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblParts)
                            .addComponent(txtParts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDate))
                        .addGap(40, 40, 40)
                        .addComponent(btnSave))
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtBrand, txtCharges1, txtColor, txtDate, txtEngineNo, txtLicensePlates, txtModel, txtOwnerAddress, txtOwnerDriverLic, txtOwnerEmail, txtOwnerName, txtOwnerTele, txtParts, txtSeats, txtSocailSecurityNum, txtWarrantyYear, txtYear});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        carProfile.setBrand(txtBrand.getText());
        carProfile.setModel(txtModel.getText());
        carProfile.setColor(txtColor.getText());
        carProfile.setYear(txtYear.getText());
        carProfile.setEngineNo(txtEngineNo.getText());
        carProfile.setSeatsNumber(txtSeats.getText());
        carProfile.getLicensePlates().add(txtLicensePlates.getText());
        carProfile.setOwnerName(txtOwnerTele.getText());
        carProfile.getOwnerTelephonenumbers().add(txtOwnerTele.getText());
        carProfile.getOwnerEmailAddresses().add(txtOwnerEmail.getText());
        carProfile.setOwnerDriverLicense(txtOwnerDriverLic.getText());
        carProfile.setOwnerSocialSecurityNumber(txtSocailSecurityNum.getText());
        carProfile.setOwnerAddress(txtOwnerAddress.getText());
        carProfile.setWarrantyYear(txtWarrantyYear.getText());
       
        carProfile.getServiceRecords().addNewRecords(txtDate.getText(), txtCharges1.getText(), txtParts.getText());
        
        JOptionPane.showMessageDialog(this, "New car profile added successfully");
        resetFields();
        
        
        

    }//GEN-LAST:event_btnSaveActionPerformed

    public void resetFields() {
        txtBrand.setText("");
        txtModel.setText("");
        txtColor.setText("");
        txtYear.setText("");
        txtEngineNo.setText("");
        txtSeats.setText("");
        txtLicensePlates.setText("");
        txtOwnerTele.setText("");
        txtOwnerTele.setText("");
        txtOwnerDriverLic.setText("");
        txtOwnerEmail.setText("");
        txtSocailSecurityNum.setText("");
        txtOwnerAddress.setText("");
        txtWarrantyYear.setText("");
        txtDate.setText("");
        txtCharges1.setText("");
        txtParts.setText("");
        
    }
    
    public boolean isValidEmail(String emailInput) {
        
        if(emailInput.isEmpty() || !emailInput.contains("@") || !emailInput.contains(".com") || !emailInput.contains(".edu")) {
            return false;
        }
        return true;
    }
    
    public boolean isValidNumber(String input) {
        if(input.isEmpty() || input.isEmpty()) {
            return false;
        }
        return true;
    }
    private void txtWarrantyYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWarrantyYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWarrantyYearActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtPartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPartsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPartsActionPerformed

    private void txtCharges1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCharges1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCharges1ActionPerformed

    private void txtLicensePlatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicensePlatesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicensePlatesActionPerformed

    private void txtOwnerAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwnerAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerAddressActionPerformed

    private void btnPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhotoActionPerformed
        // TODO add your handling code here:
        
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        lblPhoto.setIcon(new ImageIcon(f.toString()));
//        filename =f.getAbsolutePath();
        
        
        
        
                
    }//GEN-LAST:event_btnPhotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPhoto;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel iblServiceRecords;
    private javax.swing.JLabel iblWarrantyYear;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblCharges;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEngineNo;
    private javax.swing.JLabel lblLicensePlates;
    private javax.swing.JLabel lblOwnerAddress;
    private javax.swing.JLabel lblOwnerDriverLic;
    private javax.swing.JLabel lblOwnerEmail;
    private javax.swing.JLabel lblOwnerName;
    private javax.swing.JLabel lblOwnerSocialSecurityNum;
    private javax.swing.JLabel lblOwnerTele;
    private javax.swing.JLabel lblParts;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblYear;
    private javax.swing.JLabel lblmodel;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCharges1;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEngineNo;
    private javax.swing.JTextField txtLicensePlates;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtOwnerAddress;
    private javax.swing.JTextField txtOwnerDriverLic;
    private javax.swing.JTextField txtOwnerEmail;
    private javax.swing.JTextField txtOwnerName;
    private javax.swing.JTextField txtOwnerTele;
    private javax.swing.JTextField txtParts;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txtSocailSecurityNum;
    private javax.swing.JTextField txtWarrantyYear;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}