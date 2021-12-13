/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.VaccineManufacturer;

import Business.AEFIManager.AEFIManagerDirectory;
import Business.Beneficiary.BeneficiaryDirectory;
import Business.ColdChainSupplier.ColdChainSupplierDirectory;
import Business.EcoSystem;
import Business.FederalGovernment.FederalGovernmentDirectory;
import Business.SessionManagers.SessionManagerDirectory;
import Business.StateGovernment.StateGovernmentDirectory;
import Business.UserAccount.UserAccount;
import Business.VaccinationCenter.VaccinationCenterDirectory;
import Business.VaccinationSession.VaccinationSessionDirectory;
import Business.Vaccinator.VaccinatorDirectory;
import Business.VaccineManufacturer.VaccineManufacturer;
import Business.VaccineManufacturer.VaccineManufacturerDirectory;
import Business.VaccineRequestFTVM.VaccineRequestFTVM;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Karan
 */
public class ManufacturerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form ManufacturerWorkArea
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem; 
    UserAccount userAccount;
    public ManufacturerWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem, VaccineManufacturerDirectory vaccineManufacturerDirectory, FederalGovernmentDirectory federalGovernmentDirectory, StateGovernmentDirectory stateGovernmentDirectory, ColdChainSupplierDirectory coldChainSupplierDirectory, VaccinationCenterDirectory vaccinationCenterDirectory, SessionManagerDirectory sessionManagerDirectory, AEFIManagerDirectory aefiManagerDirectory, VaccinatorDirectory vaccinatorDirectory, VaccinationSessionDirectory vaccinationSessionDirectory, BeneficiaryDirectory beneficiaryDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = account;
        populateRequestTable();
        populateRequestPipelineTable();
    }
    
    public void populateRequestTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblVaccineRequests.getModel();
        dtm.setRowCount(0);
        for(VaccineRequestFTVM vr : ecosystem.getRequestFTVMDirectory().getRequestFTVMDirectory()){
            if(userAccount.getEmployee().getName().equalsIgnoreCase(vr.getVaccineManufacturer()) && vr.getVaccineRequestStatus().equalsIgnoreCase("Order Placed")){
               Object [] row = new Object[5];
               row[0] = vr;
               row[1] = vr.getFederalGovernment();
               row[2] = vr.getColdChainSupplier();
               row[3] = vr.getNumberOfDoses();
               row[4] = vr.getVaccineRequestStatus();
               dtm.addRow(row);
            }
        }
    }
    
    public void populateRequestPipelineTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblVaccineProcess.getModel();
        dtm.setRowCount(0);
        for(VaccineRequestFTVM vr : ecosystem.getRequestFTVMDirectory().getRequestFTVMDirectory()){
            if(userAccount.getEmployee().getName().equalsIgnoreCase(vr.getVaccineManufacturer()) && vr.getVaccineRequestStatus().equalsIgnoreCase("Doses In Pipeline")){
               Object [] row = new Object[5];
               row[0] = vr;
               row[1] = vr.getFederalGovernment();
               row[2] = vr.getColdChainSupplier();
               row[3] = vr.getNumberOfDoses();
               row[4] = vr.getVaccineRequestStatus();
               dtm.addRow(row);
            }
        }
    }
    
    public void adjustStockMinus(VaccineRequestFTVM vr){
        VaccineManufacturer vm = ecosystem.getVaccineManufacturerDirectory().getVaccineManufacturer(userAccount.getEmployee().getName());
        long updatedStock = vm.getCurrentStock() - vr.getNumberOfDoses();
        vm.setCurrentStock(updatedStock);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVaccineRequests = new javax.swing.JTable();
        btnPipeline = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVaccineProcess = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Vaccine Manufacturer");

        tblVaccineRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Federal Government", "Cold Chain", "Number of Doses", "Request Status"
            }
        ));
        jScrollPane1.setViewportView(tblVaccineRequests);

        btnPipeline.setText("Order in Pipeline");
        btnPipeline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPipelineActionPerformed(evt);
            }
        });

        tblVaccineProcess.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Federal Government", "Cold Chain", "Number of Doses", "Request Status"
            }
        ));
        jScrollPane2.setViewportView(tblVaccineProcess);

        btnUpdate.setText("Update Current Stock");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPipeline)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnUpdate)
                                .addGap(29, 29, 29)))))
                .addGap(0, 37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPipeline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPipelineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPipelineActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblVaccineRequests.getSelectedRow();
        VaccineRequestFTVM vr = (VaccineRequestFTVM)tblVaccineRequests.getValueAt(selectedRow, 0);
        String status = "Doses In Pipeline";
        vr.setVaccineRequestStatus(status);
        adjustStockMinus(vr);
        populateRequestPipelineTable();
        populateRequestTable();
    }//GEN-LAST:event_btnPipelineActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    VaccineManufacturer vm = ecosystem.getVaccineManufacturerDirectory().getVaccineManufacturer(userAccount.getEmployee().getName());
    UpdateCurrentDoses ucd = new UpdateCurrentDoses(userProcessContainer, userAccount, ecosystem, vm);
    userProcessContainer.add("UpdateCurrentDoses2",ucd);
    CardLayout layout=(CardLayout)userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPipeline;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblVaccineProcess;
    private javax.swing.JTable tblVaccineRequests;
    // End of variables declaration//GEN-END:variables
}
