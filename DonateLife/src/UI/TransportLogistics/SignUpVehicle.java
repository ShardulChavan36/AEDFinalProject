/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.TransportLogistics;

import model.DB4OUtil.DB4OUtil;
import model.EcoSystem.EcoSystem;
import model.Enterprise.TransportLogistics.Vehicle;
import UI.MainFrame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author  Shardul
 */
public class SignUpVehicle extends javax.swing.JPanel {

    /**
     * Creates new form SignUpVehicle
     */
    MainFrame mainScreen;
    private EcoSystem ecoSystem;
    private DB4OUtil dB4OUtil;
    
    public SignUpVehicle(MainFrame mainScreen, DB4OUtil dB4OUtil, EcoSystem ecoSystem) {
        initComponents();
        this.mainScreen = mainScreen;
        this.dB4OUtil = dB4OUtil;
        this.ecoSystem = ecoSystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_admintitle = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        lbl_uname = new javax.swing.JLabel();
        txtUsrName = new javax.swing.JTextField();
        lbl_address = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        txt_City = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        btn_back = new javax.swing.JButton();
        btn_signup = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_admintitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lbl_admintitle.setText("Create Vehicle Profile");
        add(lbl_admintitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        lbl_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_name.setText("Vehicle Name:");
        add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

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
        add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 177, -1));

        lbl_uname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_uname.setText("Vehicle Number:");
        add(lbl_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, 30));

        txtUsrName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsrNameActionPerformed(evt);
            }
        });
        add(txtUsrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 177, -1));

        lbl_address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_address.setText("Vehicle Type:");
        add(lbl_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
            }
        });
        txtType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTypeKeyReleased(evt);
            }
        });
        add(txtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 177, -1));

        txt_City.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_City.setText("Description:");
        add(txt_City, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

        txtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescActionPerformed(evt);
            }
        });
        txtDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescKeyReleased(evt);
            }
        });
        add(txtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 177, -1));

        btn_back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 87, -1));

        btn_signup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_signup.setText("Sign Up");
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 87, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255,160));
        jPanel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusColor"));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 370, 310));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255,160));
        jLabel2.setOpaque(true);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 570, 60));

        jLabel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focusedBorderColor"));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/TransportLogistics/Logistics.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -150, 2220, 1030));
    }// </editor-fold>//GEN-END:initComponents

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

    private void txtUsrNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsrNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsrNameActionPerformed

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeActionPerformed

    private void txtTypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTypeKeyReleased
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
    }//GEN-LAST:event_txtTypeKeyReleased

    private void txtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescActionPerformed

    private void txtDescKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescKeyReleased
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
    }//GEN-LAST:event_txtDescKeyReleased

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed

        MainFrame suc = new MainFrame();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        // TODO add your handling code here:
        //String address = txtType.getText() + txtDesc.getText() + txtState.getText() + txtZip.getText();
        //String vehname, String vehnum, String vtype, String description
        //SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        Vehicle vehicle = new Vehicle(txtFullName.getText(),txtUsrName.getText(),txtType.getText(),txtDesc.getText());

        ecoSystem.addVehicle(vehicle);
        dB4OUtil.storeSystem(ecoSystem);

        MainFrame suc = new MainFrame();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
        //        if (txtFullName.getText().equals("") || txtUsrName.getText().equals("") || txtPass.getText().equals("") || txtNo.getText().equals("")
            //            || txtAdd.getText().equals("") || txtCity.getText().equals("") || txtState.getText().equals("") || txtZip.getText().equals("")) {
            //
            //            JOptionPane.showMessageDialog(this, "All fields are mandatory.");
            //        } else if (!name_chk.getText().equals("") || !telenum_chk.getText().equals("") || !add_chk.getText().equals("") || !city_chk.getText().equals("")
            //            || !state_chk.getText().equals("") || !zip_chk.getText().equals("")) {
            //
            //            JOptionPane.showMessageDialog(this, "Invalid value(s) entered.");
            //        }
        //        else{
            //            Address add = new Address(txtAdd.getText(), txtCity.getText(), txtState.getText(), Integer.parseInt(txtZip.getText()));
            //
            //            Customer cus =new Customer(txtUsrName.getText(), txtPass.getText(), new CustomerRole(),txtNo.getText(), txtFullName.getText(), add);
            //            system.addCustomer(cus);
            //
            //            dB4OUtil.storeSystem(system);
            //            JOptionPane.showMessageDialog(this, "Customer information saved.");
            //            MainJFrame cust = new MainJFrame();
            //            ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
            //            cust.setVisible(true);
            //        }
    }//GEN-LAST:event_btn_signupActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_admintitle;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_uname;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtType;
    private javax.swing.JTextField txtUsrName;
    private javax.swing.JLabel txt_City;
    // End of variables declaration//GEN-END:variables
}
