/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Hospital;

import model.DB4OUtil.DB4OUtil;
import model.EcoSystem.EcoSystem;
import model.Enterprise.Hospital.Hospital;
import model.Enterprise.Hospital.Nurse;
//import model.Firebase.FirebaseHelper;
import UI.MainFrame;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author smiti
 */
public class NurseSignIn extends javax.swing.JPanel {

    /**
     * Creates new form NurseSignIn
     */
    MainFrame mainFrame;
//    FirebaseHelper firebaseHelper;
    private EcoSystem ecoSystem;
    private DB4OUtil dB4OUtil;
    public NurseSignIn(MainFrame mainFrame, DB4OUtil dB4OUtil, EcoSystem ecoSystem) {
        initComponents();
        this.mainFrame = mainFrame;
        this.dB4OUtil = dB4OUtil;
        this.ecoSystem = ecoSystem;
        for(Hospital h: ecoSystem.getHospitaldirectory().getHospitalList()){
            cmb_gender.addItem(h.getEnterpriseName());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNo = new javax.swing.JTextField();
        txt_City = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        lbl_uname = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtUsrName = new javax.swing.JTextField();
        txt_state = new javax.swing.JLabel();
        lbl_pswd = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        txt_Zip = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        txtAdd = new javax.swing.JTextField();
        btn_signup = new javax.swing.JButton();
        lbl_admintitle = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        lbl_registeryNum = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        cmb_gender = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoActionPerformed(evt);
            }
        });
        txtNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNoKeyReleased(evt);
            }
        });
        add(txtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 216, 30));

        txt_City.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_City.setText("City:");
        add(txt_City, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 600, -1, -1));

        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });
        txtFullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFullNameKeyReleased(evt);
            }
        });
        add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 216, 30));

        lbl_uname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_uname.setText("Username:");
        add(lbl_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCityKeyReleased(evt);
            }
        });
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, 216, 30));

        txtUsrName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsrNameActionPerformed(evt);
            }
        });
        add(txtUsrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 216, 30));

        txt_state.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_state.setText("State:");
        add(txt_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 640, -1, -1));

        lbl_pswd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_pswd.setText("Password:");
        add(lbl_pswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, -1, -1));

        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });
        txtState.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStateKeyReleased(evt);
            }
        });
        add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 630, 216, 30));

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 216, 30));

        txt_Zip.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_Zip.setText("Zip Code:");
        add(txt_Zip, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 680, -1, -1));

        lbl_address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_address.setText("Address:");
        add(lbl_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, -1, -1));

        txtZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipActionPerformed(evt);
            }
        });
        txtZip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtZipKeyReleased(evt);
            }
        });
        add(txtZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 670, 216, 30));

        txtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddActionPerformed(evt);
            }
        });
        txtAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddKeyReleased(evt);
            }
        });
        add(txtAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 216, 30));

        btn_signup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_signup.setText("SIGN UP");
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 720, 100, -1));

        lbl_admintitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lbl_admintitle.setText("NURSE PROFILE");
        add(lbl_admintitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        btn_back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 720, 90, -1));

        lbl_registeryNum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_registeryNum.setText("Registered No:");
        add(lbl_registeryNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, -1, -1));

        lbl_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_name.setText("Name:");
        add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, -1, -1));

        cmb_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        cmb_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_genderActionPerformed(evt);
            }
        });
        add(cmb_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 216, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Gender:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("DOB:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, -1, -1));

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });
        add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 220, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Contact:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, -1, -1));
        add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 216, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Hospital/Hospital1.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1440, 1130));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoActionPerformed

    private void txtNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoKeyReleased
        // TODO add your handling code here:
        //        String teleconv = "^(\\d{3}[- .]?){2}\\d{4}$";
        //        Pattern pat = Pattern.compile(teleconv);
        //        Matcher mat = pat.matcher(txtNo.getText());
        //
        //        if (!mat.matches()) {
            //            telenum_chk.setText("No. is incorrect");
            //        } else {
            //            telenum_chk.setText("");
            //        }
    }//GEN-LAST:event_txtNoKeyReleased

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameActionPerformed

    private void txtFullNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFullNameKeyReleased
        // TODO add your handling code here:
        //        String nameconv = "^[a-zA-Z ]{1,17}$";
        //        Pattern pat = Pattern.compile(nameconv);
        //        Matcher mat = pat.matcher(txtFullName.getText());
        //
        //        if (!mat.matches()) {
            //            name_chk.setText("Name is incorrect");
            //        } else {
            //            name_chk.setText("");
            //        }
    }//GEN-LAST:event_txtFullNameKeyReleased

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyReleased
        // TODO add your handling code here:
        //        String cityconv = "^[a-zA-Z ]{0,30}$";
        //        Pattern pat = Pattern.compile(cityconv);
        //        Matcher mat = pat.matcher(txtCity.getText());
        //
        //        if (!mat.matches()) {
            //            city_chk.setText("City is incorrect");
            //        } else {
            //            city_chk.setText("");
            //        }
    }//GEN-LAST:event_txtCityKeyReleased

    private void txtUsrNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsrNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsrNameActionPerformed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    private void txtStateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStateKeyReleased
        // TODO add your handling code here:

        //        String stateconv = "^[a-zA-Z ]{0,30}$";
        //        Pattern pat = Pattern.compile(stateconv);
        //        Matcher mat = pat.matcher(txtState.getText());
        //
        //        if (!mat.matches()) {
            //            state_chk.setText("State is incorrect");
            //        } else {
            //            state_chk.setText("");
            //        }
    }//GEN-LAST:event_txtStateKeyReleased

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipActionPerformed

    private void txtZipKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipKeyReleased
        // TODO add your handling code here:
        //        String zipconv = "^[0-9]{5}$";
        //        Pattern pat = Pattern.compile(zipconv);
        //        Matcher mat = pat.matcher(txtZip.getText());
        //
        //        if (!mat.matches()) {
            //            zip_chk.setText("Zipcode is incorrect");
            //        } else {
            //            zip_chk.setText("");
            //        }
    }//GEN-LAST:event_txtZipKeyReleased

    private void txtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddActionPerformed

    private void txtAddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddKeyReleased
        // TODO add your handling code here:

        //        String addrconv = "^[a-zA-Z0-9 ]{0,30}$";
        //        Pattern pat = Pattern.compile(addrconv);
        //        Matcher mat = pat.matcher(txtAdd.getText());
        //
        //        if (!mat.matches()) {
            //            add_chk.setText("Address is incorrect");
            //        } else {
            //            add_chk.setText("");
            //        }
    }//GEN-LAST:event_txtAddKeyReleased

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        // TODO add your handling code here:
        String address = txtAdd.getText() + txtCity.getText() + txtState.getText() + txtZip.getText();
        Nurse nurse = new Nurse(txtUsrName.getText(), txtPass.getText(), "idid", txtFullName.getText(), address, cmb_gender.getSelectedItem().toString(), txtContact.getText(),new Date() ,"hospitalList");
        ecoSystem.addNurse(nurse);
        dB4OUtil.storeSystem(ecoSystem);
        
        MainFrame suc = new MainFrame();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_btn_signupActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        MainFrame suc = new MainFrame();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void cmb_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_genderActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_signup;
    private javax.swing.JComboBox<String> cmb_gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_admintitle;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_pswd;
    private javax.swing.JLabel lbl_registeryNum;
    private javax.swing.JLabel lbl_uname;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtNo;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtUsrName;
    private javax.swing.JTextField txtZip;
    private javax.swing.JLabel txt_City;
    private javax.swing.JLabel txt_Zip;
    private javax.swing.JLabel txt_state;
    // End of variables declaration//GEN-END:variables
}
