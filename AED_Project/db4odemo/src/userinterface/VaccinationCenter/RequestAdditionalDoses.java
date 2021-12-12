/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.VaccinationCenter;

import Business.ColdChainSupplier.ColdChainSupplier;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.VaccinationCenter.VaccinationCenter;
import Business.VaccineManufacturer.VaccineManufacturer;
import Business.VaccineRequestVCTS.VaccineRequestVCTS;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Karan
 */
public class RequestAdditionalDoses extends javax.swing.JPanel {

    /**
     * Creates new form RequestAdditionalDoses
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem; 
    UserAccount userAccount;
    private int i = 1;
    public RequestAdditionalDoses(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = account;
        selectManufacturer();
        selectColdChain();
        populateOrderTable();
    }
    
    public void selectManufacturer(){
        comboManufacturer.removeAllItems();
        comboManufacturer.addItem("Select Vaccine Manufacturer");
        for(VaccineManufacturer vm: ecosystem.getVaccineManufacturerDirectory().getVaccineManufacturerDirectory()){
                comboManufacturer.addItem(vm.getManufacturerName());
        }
    }
    
    public void selectColdChain(){
        comboColdChain.removeAllItems();
        comboColdChain.addItem("Select Cold Chain....");
        for(ColdChainSupplier vm: ecosystem.getColdChainSupplierDirectory().getColdChainSupplierDirectory()){
                comboColdChain.addItem(vm.getColdChainSupplierName());
        }
    }
    
    public void populateOrderTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblVaccineRequests.getModel();
        dtm.setRowCount(0);
        for(VaccineRequestVCTS vr : ecosystem.getRequestVCTSDirectory().getRequestVCTSDirectory()){
            if(userAccount.getEmployee().getName().equalsIgnoreCase(vr.getVaccinationCenter())){
               Object [] row = new Object[5];
               row[0] = vr;
               row[1] = vr.getVaccineManufacturer();
               row[2] = vr.getColdChainSupplier();
               row[3] = vr.getNumberOfDoses();
               row[4] = vr.getVaccineRequestStatus();
               dtm.addRow(row);
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

        btnRequest1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        comboColdChain = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVaccineRequests = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumberOfDoses = new javax.swing.JTextField();
        comboManufacturer = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        btnRequest1.setText("Place the Order");
        btnRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequest1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Cold Chain Supplier");

        comboColdChain.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tblVaccineRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Vaccine Manufacturer", "Cold Chain", "Number of Doses", "Request Status"
            }
        ));
        jScrollPane1.setViewportView(tblVaccineRequests);

        jLabel2.setText("Vaccine Manufacturer");

        jLabel3.setText("Number of Doses");

        comboManufacturer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Place Request with State Government");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(217, 217, 217))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumberOfDoses)
                            .addComponent(comboManufacturer, 0, 136, Short.MAX_VALUE)
                            .addComponent(comboColdChain, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addComponent(btnRequest1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumberOfDoses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboColdChain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRequest1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addContainerGap(193, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequest1ActionPerformed
        // TODO add your handling code here:
          VaccinationCenter vc = ecosystem.getVaccinationCenterDirectory().getVaccinationCenter(userAccount.getEmployee().getName());
          VaccineRequestVCTS vr = ecosystem.getRequestVCTSDirectory().newVaccineRequest();
          
          vr.setVaccineRequestID(String.valueOf(++i));
          vr.setStateGovernment(vc.getStateGovName());
          vr.setVaccinationCenter(vc.getCenterName());
          vr.setVaccineManufacturer(comboManufacturer.getSelectedItem().toString());
          vr.setColdChainSupplier(comboColdChain.getSelectedItem().toString());
          vr.setNumberOfDoses(Integer.parseInt(txtNumberOfDoses.getText()));
          vr.setVaccineRequestStatus("Request Placed");
          populateOrderTable();
    }//GEN-LAST:event_btnRequest1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequest1;
    private javax.swing.JComboBox<String> comboColdChain;
    private javax.swing.JComboBox<String> comboManufacturer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVaccineRequests;
    private javax.swing.JTextField txtNumberOfDoses;
    // End of variables declaration//GEN-END:variables
}
