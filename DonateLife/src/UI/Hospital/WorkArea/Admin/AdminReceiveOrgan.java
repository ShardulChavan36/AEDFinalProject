/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Hospital.WorkArea.Admin;

import model.DB4OUtil.DB4OUtil;
import model.EcoSystem.EcoSystem;
import model.Enterprise.Hospital.Doctor;
import model.Enterprise.Hospital.Hospital;
import model.Enterprise.Hospital.Patient;
import model.Enterprise.Lab.Technician;
import model.Enterprise.TransportLogistics.Handler;
import model.Enterprise.TransportLogistics.Vehicle;
import model.Organization.DonateEntity;
import UI.MainFrame;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author smiti
 */
public class AdminReceiveOrgan extends javax.swing.JPanel {

    /**
     * Creates new form AdminReceiveOrgan
     */
    MainFrame mainScreen;
    private EcoSystem ecoSystem;
    private DB4OUtil dB4OUtil;
    Hospital hospital;

    public AdminReceiveOrgan(MainFrame mainScreen, DB4OUtil dB4OUtil, EcoSystem ecoSystem, Hospital h) {
        initComponents();
        this.mainScreen = mainScreen;
        this.dB4OUtil = dB4OUtil;
        this.ecoSystem = ecoSystem;
        this.hospital = h;

        populateTable();
        populateVehicleTable();
        populateLabTable();

        for (Doctor d : ecoSystem.getDoctordirectory()) {

            if (d.getHospname().equals(hospital.getEnterpriseName())) {
                doc.addItem(d.getEmaildId());
            }

        }

        for (Patient pa : ecoSystem.getPatientdirectory()) {
            if (pa.getHospname().equals(hospital.getEnterpriseName())) {
                recPat.addItem(pa.getEmaildId());
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb3 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        blood = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        doc = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        recPat = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Type", "Blood group", "Entity name", "Status", "id"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 110, 690, 150));

        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Handler Name", "Vehicle Name", "Vehicle Type", "Vehicle Number", "Description"
            }
        ));
        jScrollPane2.setViewportView(tb2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 700, 150));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        jLabel1.setText("FIND/RECEIVE ORGAN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Generate request");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 780, 240, -1));

        tb3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Technician Name", "Lab Name"
            }
        ));
        jScrollPane3.setViewportView(tb3);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, 700, 140));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Blood:");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Dual Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Entity:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blood, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(blood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        add(doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 770, 200, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Doctor:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 770, 140, -1));

        add(recPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 800, 200, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Patient:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 800, 140, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Hospital/WorkArea/Admin/Hospital1.jpg"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1570, 910));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateTableName(name.getText().toLowerCase().toString());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow1 = tb1.getSelectedRow();
        int selectedRow2 = tb2.getSelectedRow();
        int selectedRow3 = tb3.getSelectedRow();

        if (selectedRow1 < 0 || selectedRow2 < 0 || selectedRow3 < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to generate a request.");
            return;
        }
        DefaultTableModel model1 = (DefaultTableModel) tb1.getModel();
        String donateEntity = model1.getValueAt(selectedRow1, 4).toString();

        DefaultTableModel model2 = (DefaultTableModel) tb2.getModel();
        String handler = model2.getValueAt(selectedRow2, 0).toString();
        System.out.println("print: " + handler);

        DefaultTableModel model3 = (DefaultTableModel) tb3.getModel();
        String tech = model3.getValueAt(selectedRow3, 0).toString();
        System.out.println(" " + donateEntity + " " + handler + " " + tech);

        ecoSystem.generateRequesting(donateEntity, handler, tech, hospital, doc.getSelectedItem().toString(), recPat.getSelectedItem().toString());
        dB4OUtil.storeSystem(ecoSystem);
        String mail = "Request generated for id: " + donateEntity + " for patient user name: " + recPat.getSelectedItem().toString() + ". Please login and update the required details.";
        
        JOptionPane.showMessageDialog(this, "Request generated & Mail sent successfully.");
        sendMail(mail);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        populateTableBlood(blood.getText().toLowerCase().toString());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        populateTableDual(blood.getText().toLowerCase().toString(), name.getText().toLowerCase().toString());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable" + ecoSystem.getDonateEntityList().toString());
        for (DonateEntity d : ecoSystem.getDonateEntityList()) {
            System.out.println("populatetable " + d.getEntityName());

            Object[] row = new Object[5];
            row[0] = d.getType();
            row[1] = d.getBloodGroup();
            row[2] = d.getEntityName();
            row[3] = d.getStatus();
            row[4] = d.getId();
            model.addRow(row);

        }

    }

    private void populateTableDual(String blood, String name) {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (DonateEntity d : ecoSystem.getDonateEntityList()) {

            if (d.getBloodGroup().toLowerCase().contains(blood) && d.getEntityName().toLowerCase().contains(name)) {
                Object[] row = new Object[5];
                row[0] = d.getType();
                row[1] = d.getBloodGroup();
                row[2] = d.getEntityName();
                row[3] = d.getStatus();
                row[4] = d.getId();
                model.addRow(row);
            }

        }

    }

    private void populateVehicleTable() {
        DefaultTableModel model = (DefaultTableModel) tb2.getModel();
        model.setRowCount(0);
        System.out.println("populatetable" + ecoSystem.getDonateEntityList().toString());
        for (Handler h : ecoSystem.getHandlerdirectory()) {

            Object[] row = new Object[5];
            try {
                row[0] = h.getEmaildId();
                row[1] = h.getVehicle().getVehicleName();
                row[2] = h.getVehicle().getVehicleType();
                row[3] = h.getVehicle().getVehicleNo();
                row[4] = h.getVehicle().getDesc();
            } catch (Exception e) {
            }
            model.addRow(row);

        }

    }

    private void populateLabTable() {
        DefaultTableModel model = (DefaultTableModel) tb3.getModel();
        model.setRowCount(0);
        System.out.println("populatetable" + ecoSystem.getDonateEntityList().toString());
        for (Technician h : ecoSystem.getTechdirectory()) {

            Object[] row = new Object[5];
            row[0] = h.getEmaildId();
            row[1] = h.getLabName();

            model.addRow(row);

        }

    }

    private void populateTableBlood(String name) {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (DonateEntity d : ecoSystem.getDonateEntityList()) {

            if (d.getBloodGroup().toLowerCase().contains(name)) {
                Object[] row = new Object[5];
                row[0] = d.getType();
                try {
                    row[1] = d.getBloodGroup();
                    row[2] = d.getEntityName();
                    row[3] = d.getStatus();
                    row[4] = d.getId();
                } catch (Exception e) {

                }
                model.addRow(row);
            }

        }

    }

    private void populateTableName(String name) {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (DonateEntity d : ecoSystem.getDonateEntityList()) {

            if (d.getEntityName().toLowerCase().contains(name)) {
                Object[] row = new Object[5];
                row[0] = d.getType();
                row[1] = d.getBloodGroup();
                row[2] = d.getEntityName();
                row[3] = d.getStatus();
                row[4] = d.getId();
                model.addRow(row);
            }

        }

    }

    public void sendMail(String mail) {

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
            String myAccountEmail = "xyz@gmail.com";
            String password = "";
            Session session;
            session = Session.getInstance(properties, new javax.mail.Authenticator() {
                @Override
                protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                    return new javax.mail.PasswordAuthentication(myAccountEmail, password);
                }
            });
            Message message = prepareMessage(mail,session, myAccountEmail, "abc@gmail.com", "msg", "sub");
            Transport.send(message);
// System.out.println("Successful sent");
        } catch (MessagingException ex) {
            ex.printStackTrace();
//            Logger.getLogger(this.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static Message prepareMessage(String mail,Session session, String myAccountEmail, String toAddress, String emailmsg, String emailsubject) {

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(toAddress));
            message.setSubject("Organ & Blood Transplantation System");
            message.setText(mail);
            return message;
        } catch (MessagingException ex) {
            ex.printStackTrace();
//            Logger.getLogger(this.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField blood;
    private javax.swing.JComboBox<String> doc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> recPat;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    private javax.swing.JTable tb3;
    // End of variables declaration//GEN-END:variables
}
