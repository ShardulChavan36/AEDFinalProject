/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import model.DB4OUtil.DB4OUtil;
import model.EcoSystem.EcoSystem;
import UI.Admin.MainAdministrationPage;
import UI.DonorBank.MainDonorBankPage;
import UI.Hospital.MainHospitalPage;
import UI.Lab.MainLabPage;
import UI.TransportLogistics.MainLogisticsPage;

import javax.swing.*;
import java.awt.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;

/**
 *
 * @author Smiti
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    private EcoSystem ecoSystem;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    // Variables declaration - do not modify

    ImageIcon myImage;

    public ImageIcon setIcon(String m) {
        if (m != null) {
            myImage = new ImageIcon(m);
        }
        Image img1 = myImage.getImage();
        Image img2 = img1.getScaledInstance(442, 266, Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        return i;

    }

    public MainFrame() {
        initComponents();
        this.setSize(1200, 750);
        this.ecoSystem = dB4OUtil.retrieveSystem();
//        sendMail();


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel10 = new javax.swing.JPanel();
        TransportBtnPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DonorBankBtnPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LabBtnPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AdminBtnPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        HospBtnPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        gifLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel10.setBackground(new java.awt.Color(0, 153, 153));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TransportBtnPanel.setBackground(new java.awt.Color(0, 102, 102));
        TransportBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransportBtnPaneljPanel4MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/icons8-handle-with-care-48.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Transport Logistics");

        javax.swing.GroupLayout TransportBtnPanelLayout = new javax.swing.GroupLayout(TransportBtnPanel);
        TransportBtnPanel.setLayout(TransportBtnPanelLayout);
        TransportBtnPanelLayout.setHorizontalGroup(
            TransportBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransportBtnPanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 63, Short.MAX_VALUE))
        );
        TransportBtnPanelLayout.setVerticalGroup(
            TransportBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransportBtnPanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransportBtnPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(14, 14, 14))
        );

        jPanel10.add(TransportBtnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 370, 50));

        DonorBankBtnPanel.setBackground(new java.awt.Color(0, 102, 102));
        DonorBankBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DonorBankBtnPanelMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/icons8-charity-48.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Donor Inventory");

        javax.swing.GroupLayout DonorBankBtnPanelLayout = new javax.swing.GroupLayout(DonorBankBtnPanel);
        DonorBankBtnPanel.setLayout(DonorBankBtnPanelLayout);
        DonorBankBtnPanelLayout.setHorizontalGroup(
            DonorBankBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DonorBankBtnPanelLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 90, Short.MAX_VALUE))
        );
        DonorBankBtnPanelLayout.setVerticalGroup(
            DonorBankBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DonorBankBtnPanelLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DonorBankBtnPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(14, 14, 14))
        );

        jPanel10.add(DonorBankBtnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 370, -1));

        LabBtnPanel.setBackground(new java.awt.Color(0, 102, 102));
        LabBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabBtnPanelMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/icons8-lab-items-48.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Laboratory");

        javax.swing.GroupLayout LabBtnPanelLayout = new javax.swing.GroupLayout(LabBtnPanel);
        LabBtnPanel.setLayout(LabBtnPanelLayout);
        LabBtnPanelLayout.setHorizontalGroup(
            LabBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabBtnPanelLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 156, Short.MAX_VALUE))
        );
        LabBtnPanelLayout.setVerticalGroup(
            LabBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabBtnPanelLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LabBtnPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(14, 14, 14))
        );

        jPanel10.add(LabBtnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 370, 50));

        AdminBtnPanel.setBackground(new java.awt.Color(0, 102, 102));
        AdminBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminBtnPanelMouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/icons8-microsoft-admin-48.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Administration");

        javax.swing.GroupLayout AdminBtnPanelLayout = new javax.swing.GroupLayout(AdminBtnPanel);
        AdminBtnPanel.setLayout(AdminBtnPanelLayout);
        AdminBtnPanelLayout.setHorizontalGroup(
            AdminBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminBtnPanelLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(0, 131, Short.MAX_VALUE))
        );
        AdminBtnPanelLayout.setVerticalGroup(
            AdminBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminBtnPanelLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(14, 14, 14))
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel10.add(AdminBtnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 370, 50));

        HospBtnPanel.setBackground(new java.awt.Color(0, 102, 102));
        HospBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HospBtnPanelMouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/icons8-hospital-sign-48.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Hospital");

        javax.swing.GroupLayout HospBtnPanelLayout = new javax.swing.GroupLayout(HospBtnPanel);
        HospBtnPanel.setLayout(HospBtnPanelLayout);
        HospBtnPanelLayout.setHorizontalGroup(
            HospBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HospBtnPanelLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 196, Short.MAX_VALUE))
        );
        HospBtnPanelLayout.setVerticalGroup(
            HospBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HospBtnPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(14, 14, 14))
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel10.add(HospBtnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 370, 50));

        jSplitPane1.setLeftComponent(jPanel10);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Gill Sans Ultra Bold", 3, 54)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Donate A Life");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 490, 58));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/icons8-close-50.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 58, 51));

        gifLabel.setBackground(new java.awt.Color(0, 153, 153));
        gifLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Hospital.gif"))); // NOI18N
        jPanel3.add(gifLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, -10, 1070, 780));

        jSplitPane1.setRightComponent(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void sendMail() {

        try {
            Properties properties = new Properties();
//            properties.put("mail.smtp.auth", "true");
//            properties.put("mail.smtp.starttls.enable", "true");
//            properties.put("mail.smtp.host", "smtp.gmail.com");
//            properties.put("mail.smtp.port", "587");
            properties.put("mail.smtp.user", "username");
            
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "25");
            properties.put("mail.debug", "true");
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.EnableSSL.enable", "true");

            properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            properties.setProperty("mail.smtp.socketFactory.fallback", "false");
            properties.setProperty("mail.smtp.port", "465");
            properties.setProperty("mail.smtp.socketFactory.port", "465");
            String myAccountEmail = "";
            String password = "";
            Session session;
            session = Session.getInstance(properties, new javax.mail.Authenticator() {
                @Override
                protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                    return new javax.mail.PasswordAuthentication(myAccountEmail, password);
                }
            });
            Message message = prepareMessage(session, myAccountEmail, "obms018@gmail.com", "msg", "sub");
            Transport.send(message);
// System.out.println("Successful sent");
        } catch (MessagingException ex) {
            ex.printStackTrace();
//            Logger.getLogger(this.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static Message prepareMessage(Session session, String myAccountEmail, String toAddress, String emailmsg, String emailsubject) {

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(toAddress));
            message.setSubject(emailsubject);
            message.setText(emailmsg);
            return message;
        } catch (MessagingException ex) {
            ex.printStackTrace();
//            Logger.getLogger(this.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    private void TransportBtnPaneljPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransportBtnPaneljPanel4MouseClicked
        // TODO add your handling code here:
        //logistics
        MainLogisticsPage mlp = new MainLogisticsPage(this, dB4OUtil, ecoSystem);
        jSplitPane1.setRightComponent(mlp);
    }//GEN-LAST:event_TransportBtnPaneljPanel4MouseClicked

    private void DonorBankBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DonorBankBtnPanelMouseClicked
        // TODO add your handling code here:
        //Donor Bank
        MainDonorBankPage mdp = new MainDonorBankPage(this, dB4OUtil, ecoSystem);
        jSplitPane1.setRightComponent(mdp);
    }//GEN-LAST:event_DonorBankBtnPanelMouseClicked

    private void LabBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabBtnPanelMouseClicked
        // TODO add your handling code here:
        //Laboratory
        MainLabPage mlp = new MainLabPage(this, dB4OUtil, ecoSystem);
        jSplitPane1.setRightComponent(mlp);
    }//GEN-LAST:event_LabBtnPanelMouseClicked

    private void AdminBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminBtnPanelMouseClicked
        // TODO add your handling code here:
        //Admin
        MainAdministrationPage map = new MainAdministrationPage(this, dB4OUtil, ecoSystem);
        jSplitPane1.setRightComponent(map);
    }//GEN-LAST:event_AdminBtnPanelMouseClicked

    private void HospBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HospBtnPanelMouseClicked
        // TODO add your handling code here:
        //Hospital
        MainHospitalPage mhp = new MainHospitalPage(this, dB4OUtil, ecoSystem);
        jSplitPane1.setRightComponent(mhp);
    }//GEN-LAST:event_HospBtnPanelMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

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
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminBtnPanel;
    private javax.swing.JPanel DonorBankBtnPanel;
    private javax.swing.JPanel HospBtnPanel;
    private javax.swing.JPanel LabBtnPanel;
    private javax.swing.JPanel TransportBtnPanel;
    private javax.swing.JLabel gifLabel;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables

}
