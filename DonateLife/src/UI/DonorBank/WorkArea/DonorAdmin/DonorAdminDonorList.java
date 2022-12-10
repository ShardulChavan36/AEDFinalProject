/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DonorBank.WorkArea.DonorAdmin;

import model.DB4OUtil.DB4OUtil;
import model.EcoSystem.EcoSystem;
import model.Enterprise.DonorInventory.DonorDetails;
import model.Enterprise.DonorInventory.DonorInventory;
import model.Organization.DonateEntity;
import UI.MainFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author piyush
 */
public class DonorAdminDonorList extends javax.swing.JPanel {

    /**
     * Creates new form DonorAdminDonorList
     */
       MainFrame mainScreen;
    private EcoSystem ecoSystem;
    private DB4OUtil dB4OUtil;
    DonorInventory donbank;
    
    public DonorAdminDonorList(MainFrame mainScreen, DB4OUtil dB4OUtil, EcoSystem ecoSystem, DonorInventory donbank) {
        initComponents();
        this.mainScreen = mainScreen;
        this.dB4OUtil = dB4OUtil;
        this.ecoSystem = ecoSystem;
        this.donbank = donbank;
        
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

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "uname", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb1);

        jButton1.setText("Delete Donor");
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
                .addGap(318, 318, 318)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(559, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButton1)
                .addContainerGap(107, Short.MAX_VALUE))
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
        String doctorUName = model.getValueAt(selectedRow, 0).toString();
        System.out.println(" doctor uname: " + doctorUName);
        ecoSystem.deleteDonorBYuserName(doctorUName);
        dB4OUtil.storeSystem(ecoSystem);
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed
 private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (DonorDetails d : ecoSystem.getDonordirectory()) {
            System.out.println("populatetable " + d.getEmaildId());

            Object[] row = new Object[5];
            row[0] = d.getEmaildId();
            model.addRow(row);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}