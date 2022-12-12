/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Admin;

import model.DB4OUtil.DB4OUtil;
import model.EcoSystem.EcoSystem;
//import model.Firebase.FirebaseHelper;
import model.Organization.DonateEntity;
import UI.MainFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  Shardul
 */
public class ManageTransplant extends javax.swing.JPanel {

    /**
     * Creates new form ManageTransplant
     */
    MainFrame mainScreen;
    //FirebaseHelper firebaseHelper;
    private EcoSystem ecoSystem;
    private DB4OUtil dB4OUtil;

    public ManageTransplant(MainFrame mainScreen, DB4OUtil dB4OUtil, EcoSystem ecoSystem) {
        initComponents();
        this.mainScreen = mainScreen;
        this.dB4OUtil = dB4OUtil;
        this.ecoSystem = ecoSystem;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.hoverBorderColor"));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Type", "Blood group", "Entity name", "Status", "Donor Enterprise", "Receiver Enterprise", "Patient Name", "Donar name", "Donor Doctor", "Receiver Doctor", "Handler Name", "Report", "Id"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Update Status");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1563, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tb1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        DonateEntity d = (DonateEntity)model.getValueAt(selectedRow, 12);
        System.out.println(" handler uname: " + d.getEntityName());
        
        for(DonateEntity de : ecoSystem.getDonateEntityList()){
            try{
                System.out.println(de.getId());
                System.out.println(d.getId());
            if(de.getId().equals(d.getId())){
                
                d.setStatus(model.getValueAt(selectedRow, 3).toString());
            }
            }catch(Exception e){
                
            }
        }
        
        dB4OUtil.storeSystem(ecoSystem);
        JOptionPane.showMessageDialog(this, "Updated Status");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (DonateEntity d : ecoSystem.getDonateEntityList()) {

            Object[] row = new Object[13];
            row[0] = d.getType();
            row[1] = d.getBloodGroup();
            row[2] = d.getEntityName();
            row[3] = d.getStatus();
            try {
                row[4] = d.getDonorEnterprise().getEnterpriseName();
            } catch (Exception e) {

            }

            try {
                row[5] = d.getReceiverEnterprise().getEnterpriseName();
            } catch (Exception e) {

            }
            try {
                row[6] = d.getReceiverPatient().getName();
            } catch (Exception e) {

            }
            try {
                row[7] = d.getDonorPatient().getName();
            } catch (Exception e) {

            }
            try {
            row[8] = d.getDonorDoctor().getName();
            }catch (Exception e) {

            }
            try {
            row[9] = d.getReceiverDoctor().getName();
            }catch (Exception e) {

            }
            try{
            row[10] = d.getHandler().getName();
            }catch (Exception e) {

            }
            try {
            row[11] = d.getReport();
            }catch (Exception e) {

            }
            try {
            row[12] = d;
            }catch (Exception e) {

            }


            model.addRow(row);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
