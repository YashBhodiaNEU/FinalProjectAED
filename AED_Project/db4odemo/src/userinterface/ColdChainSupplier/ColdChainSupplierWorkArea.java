/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.ColdChainSupplier;

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
import Business.VaccineManufacturer.VaccineManufacturerDirectory;
import Business.VaccineRequestFTVM.VaccineRequestFTVM;
import Business.VaccineRequestSTF.VaccineRequestSTF;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Karan
 */
public class ColdChainSupplierWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form ColdChainSupplierWorkArea
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem; 
    UserAccount userAccount;
    public ColdChainSupplierWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem, VaccineManufacturerDirectory vaccineManufacturerDirectory, FederalGovernmentDirectory federalGovernmentDirectory, StateGovernmentDirectory stateGovernmentDirectory, ColdChainSupplierDirectory coldChainSupplierDirectory, VaccinationCenterDirectory vaccinationCenterDirectory, SessionManagerDirectory sessionManagerDirectory, AEFIManagerDirectory aefiManagerDirectory, VaccinatorDirectory vaccinatorDirectory, VaccinationSessionDirectory vaccinationSessionDirectory, BeneficiaryDirectory beneficiaryDirectory){     
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = account;
        populateRequestTable();
        populateRequestDeliveredTable();
        populateStateGovVaccineRequest();
        populateStateGovVaccineProcess();
    }
    
    public void populateRequestTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblVaccineRequests.getModel();
        dtm.setRowCount(0);
        for(VaccineRequestFTVM vr : ecosystem.getRequestFTVMDirectory().getRequestFTVMDirectory()){
            if(userAccount.getEmployee().getName().equalsIgnoreCase(vr.getColdChainSupplier()) && vr.getVaccineRequestStatus().equalsIgnoreCase("Doses In Pipeline")){
               Object [] row = new Object[5];
               row[0] = vr;
               row[1] = vr.getVaccineManufacturer();
               row[2] = vr.getFederalGovernment();
               row[3] = vr.getNumberOfDoses();
               row[4] = vr.getVaccineRequestStatus();
               dtm.addRow(row);
            }
        }
    }
    
    public void populateRequestDeliveredTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblVaccineRequestsDelivered.getModel();
        dtm.setRowCount(0);
        for(VaccineRequestFTVM vr : ecosystem.getRequestFTVMDirectory().getRequestFTVMDirectory()){
            if(userAccount.getEmployee().getName().equalsIgnoreCase(vr.getColdChainSupplier()) && vr.getVaccineRequestStatus().equalsIgnoreCase("Doses Delivered")){
               Object [] row = new Object[5];
               row[0] = vr;
               row[1] = vr.getVaccineManufacturer();
               row[2] = vr.getFederalGovernment();
               row[3] = vr.getNumberOfDoses();
               row[4] = vr.getVaccineRequestStatus();
               dtm.addRow(row);
            }
        }
    }
    
    public void populateStateGovVaccineRequest(){
        DefaultTableModel dtm = (DefaultTableModel) tblStateGovernmentRequest.getModel();
        dtm.setRowCount(0);
        for(VaccineRequestSTF vsr : ecosystem.getRequestSTFDirectory().getRequestSTFDirectory()){
            if(userAccount.getEmployee().getName().equalsIgnoreCase(vsr.getColdChainSupplier()) && vsr.getVaccineRequestStatus().equalsIgnoreCase("Doses In Pipeline")){
               Object [] row = new Object[6];
               row[0] = vsr;
               row[1] = vsr.getStateGovernment();
               row[2] = vsr.getColdChainSupplier();
               row[3] = vsr.getNumberOfDoses();
               row[4] = vsr.getVaccineRequestStatus();
               row[5] = vsr.getFedName();
               dtm.addRow(row);
            }
        }
    }
    public void populateStateGovVaccineProcess(){
        DefaultTableModel dtm = (DefaultTableModel) tblStateGovernmentProcess.getModel();
        dtm.setRowCount(0);
        for(VaccineRequestSTF vsr : ecosystem.getRequestSTFDirectory().getRequestSTFDirectory()){
            if(userAccount.getEmployee().getName().equalsIgnoreCase(vsr.getColdChainSupplier()) && vsr.getVaccineRequestStatus().equalsIgnoreCase("Doses Delivered")){
               Object [] row = new Object[6];
               row[0] = vsr;
               row[1] = vsr.getStateGovernment();
               row[2] = vsr.getColdChainSupplier();
               row[3] = vsr.getNumberOfDoses();
               row[4] = vsr.getVaccineRequestStatus();
               row[5] = vsr.getFedName();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVaccineRequests = new javax.swing.JTable();
        btnDelivered = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVaccineRequestsDelivered = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblStateGovernmentProcess = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblStateGovernmentRequest = new javax.swing.JTable();
        btnDelivered2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Vaccine Orders in Pipeline");

        tblVaccineRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Vaccine Manufacturer", "Federal Government", "Number of Doses", "Request Status"
            }
        ));
        jScrollPane1.setViewportView(tblVaccineRequests);

        btnDelivered.setText("Delivered");
        btnDelivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveredActionPerformed(evt);
            }
        });

        tblVaccineRequestsDelivered.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Vaccine Manufacturer", "Federal Government", "Number of Doses", "Request Status"
            }
        ));
        jScrollPane2.setViewportView(tblVaccineRequestsDelivered);

        jLabel2.setText("MANUFACTURER TO FEDERAL GOVERNMENT");

        jLabel3.setText("FEDERAL GOVERNMENT TO STATE GOVERNMENT");

        tblStateGovernmentProcess.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "State Government", "Cold Chain", "Number of Doses", "Request Status", "Fed"
            }
        ));
        jScrollPane3.setViewportView(tblStateGovernmentProcess);

        tblStateGovernmentRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "State Government", "Cold Chain", "Number of Doses", "Request Status", "Fed"
            }
        ));
        jScrollPane4.setViewportView(tblStateGovernmentRequest);

        btnDelivered2.setText("Delivered");
        btnDelivered2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelivered2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(184, 184, 184))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelivered)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelivered2)
                            .addComponent(jLabel2))
                        .addContainerGap(69, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelivered)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelivered2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveredActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblVaccineRequests.getSelectedRow();
        VaccineRequestFTVM vr = (VaccineRequestFTVM)tblVaccineRequests.getValueAt(selectedRow, 0);
        String status = "Doses Delivered";
        vr.setVaccineRequestStatus(status);
        populateRequestDeliveredTable();
        populateRequestTable();
    }//GEN-LAST:event_btnDeliveredActionPerformed

    private void btnDelivered2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelivered2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblStateGovernmentRequest.getSelectedRow();
        VaccineRequestSTF vsr = (VaccineRequestSTF)tblStateGovernmentRequest.getValueAt(selectedRow, 0);
        String status = "Doses Delivered";
        vsr.setVaccineRequestStatus(status);
        populateStateGovVaccineProcess();
        populateStateGovVaccineRequest();
    }//GEN-LAST:event_btnDelivered2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelivered;
    private javax.swing.JButton btnDelivered2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblStateGovernmentProcess;
    private javax.swing.JTable tblStateGovernmentRequest;
    private javax.swing.JTable tblVaccineRequests;
    private javax.swing.JTable tblVaccineRequestsDelivered;
    // End of variables declaration//GEN-END:variables
}
