/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Admin;

import model.DB4OUtil.DB4OUtil;
import model.EcoSystem.EcoSystem;
//import model.Firebase.FirebaseHelper;
import UI.MainFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Shardul
 */
public class MainAdministrationPage extends javax.swing.JPanel {

    /**
     * Creates new form AdministrationLoginPage
     */
    MainFrame mainScreen;
//    FirebaseHelper firebaseHelper;
    private EcoSystem ecoSystem;
    private DB4OUtil dB4OUtil;

    public MainAdministrationPage(MainFrame mainScreen, DB4OUtil dB4OUtil, EcoSystem ecoSystem) {
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

        jPanel1 = new javax.swing.JPanel();
        lbl_Hosptitle = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lbl_pswd = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Hosptitle.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl_Hosptitle.setText("Administration");
        jPanel1.add(lbl_Hosptitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 210, -1));

        lbl_username.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_username.setText("Username:");
        jPanel1.add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 227, -1, -1));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 253, 197, -1));

        lbl_pswd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_pswd.setText("Password:");
        jPanel1.add(lbl_pswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 297, -1, -1));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 323, 197, -1));

        btn_login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 386, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Admin/Medical-Wallpapers-HD-Free-download.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-25, -4, 1080, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1057, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1057, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        if (txtUsername.getText().toString().equals("Admin") && txtPassword.getText().toString().equals("Admin")) {
            AdministrationSplitPage ap = new AdministrationSplitPage(mainScreen, dB4OUtil, ecoSystem);
            
            mainScreen.setContentPane(ap);
            mainScreen.invalidate();
            mainScreen.validate();
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect credential");
        }


    }//GEN-LAST:event_btn_loginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Hosptitle;
    private javax.swing.JLabel lbl_pswd;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
