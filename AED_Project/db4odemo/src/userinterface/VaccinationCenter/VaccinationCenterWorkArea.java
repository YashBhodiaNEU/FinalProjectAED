/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.VaccinationCenter;

import Business.AEFIManager.AEFIManagerDirectory;
import Business.AppointmentBooking.BookAppointment;
import Business.Beneficiary.BeneficiaryDirectory;
import Business.ColdChainSupplier.ColdChainSupplierDirectory;
import Business.EcoSystem;
import Business.FederalGovernment.FederalGovernmentDirectory;
import Business.SessionManagers.SessionManagerDirectory;
import Business.StateGovernment.StateGovernmentDirectory;
import Business.UserAccount.UserAccount;
import Business.VaccinationCenter.VaccinationCenterDirectory;
import Business.VaccinationSession.VaccinationSession;
import Business.VaccinationSession.VaccinationSessionDirectory;
import Business.Vaccinator.VaccinatorDirectory;
import Business.VaccineManufacturer.VaccineManufacturerDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.StateGovernment.ManageAllVaccinationCenters;
import userinterface.VaccinationSession.ManageAllSessions;

/**
 *
 * @author Karan
 */
public class VaccinationCenterWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form VaccinationCenterWorkArea
     */
    
    JPanel userProcessContainer;
    EcoSystem ecosystem; 
    UserAccount userAccount;
    SessionManagerDirectory sessionManagerDirectory;
    AEFIManagerDirectory aefiManagerDirectory;
    VaccinatorDirectory vaccinatorDirectory;
    VaccinationSessionDirectory vaccinationSessionDirectory;
    BeneficiaryDirectory beneficiaryDirectory;
    
    public VaccinationCenterWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem, VaccineManufacturerDirectory vaccineManufacturerDirectory, FederalGovernmentDirectory federalGovernmentDirectory, StateGovernmentDirectory stateGovernmentDirectory, ColdChainSupplierDirectory coldChainSupplierDirectory, VaccinationCenterDirectory vaccinationCenterDirectory, SessionManagerDirectory sessionManagerDirectory, AEFIManagerDirectory aefiManagerDirectory, VaccinatorDirectory vaccinatorDirectory, VaccinationSessionDirectory vaccinationSessionDirectory, BeneficiaryDirectory beneficiaryDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        this.sessionManagerDirectory = sessionManagerDirectory;
        this.aefiManagerDirectory = aefiManagerDirectory;
        this.vaccinatorDirectory = vaccinatorDirectory;
        this.vaccinationSessionDirectory = vaccinationSessionDirectory;
        this.beneficiaryDirectory = beneficiaryDirectory;
        populateSessionInfo();
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
        btnManageSessionManager = new javax.swing.JButton();
        btnManageVaccinators = new javax.swing.JButton();
        btnManageAEFIManagers = new javax.swing.JButton();
        btnManageVaccinationSessions = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSessionInfo = new javax.swing.JTable();
        btnRequest = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Vaccination Center Work Area");

        btnManageSessionManager.setText("Manage Session Manager");
        btnManageSessionManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSessionManagerActionPerformed(evt);
            }
        });

        btnManageVaccinators.setText("Manage Vaccinators");
        btnManageVaccinators.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageVaccinatorsActionPerformed(evt);
            }
        });

        btnManageAEFIManagers.setText("Manage AEFI Managers");
        btnManageAEFIManagers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAEFIManagersActionPerformed(evt);
            }
        });

        btnManageVaccinationSessions.setText("Manage Vaccination Sessions");
        btnManageVaccinationSessions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageVaccinationSessionsActionPerformed(evt);
            }
        });

        tblSessionInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Sessions", "Available Doses"
            }
        ));
        jScrollPane1.setViewportView(tblSessionInfo);

        btnRequest.setText("Request Additional Doses");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnManageSessionManager, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnManageVaccinators, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnManageAEFIManagers, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnManageVaccinationSessions))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageSessionManager)
                    .addComponent(btnManageVaccinators)
                    .addComponent(btnManageAEFIManagers)
                    .addComponent(btnManageVaccinationSessions))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnRequest)
                .addContainerGap(430, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
 
    public void populateSessionInfo(){
        DefaultTableModel dtm = (DefaultTableModel) tblSessionInfo.getModel();
        dtm.setRowCount(0);
        for (VaccinationSession vs : ecosystem.getVaccineSessionDirectory().getVaccinationSessionDirectory()){
            if(userAccount.getEmployee().getName().equalsIgnoreCase(vs.getCenterName())){
                Object [] row = new Object[2];
                row[0] = vs.getSessionName();
                row[1] = vs.getAvailableDoses();
                dtm.addRow(row);
            }
        }
    }
    
    private void btnManageSessionManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSessionManagerActionPerformed
        // TODO add your handling code here:
    ManageAllSessionManagers masm = new ManageAllSessionManagers(userProcessContainer, ecosystem, sessionManagerDirectory, userAccount);
    userProcessContainer.add("ManageAllSessionManagers",masm);
    CardLayout layout=(CardLayout)userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSessionManagerActionPerformed

    private void btnManageAEFIManagersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAEFIManagersActionPerformed
        // TODO add your handling code here:
    ManageAllAEFIManagers maam = new ManageAllAEFIManagers(userProcessContainer, ecosystem, aefiManagerDirectory, userAccount);
    userProcessContainer.add("ManageAllAEFIManagers",maam);
    CardLayout layout=(CardLayout)userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageAEFIManagersActionPerformed

    private void btnManageVaccinatorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageVaccinatorsActionPerformed
        // TODO add your handling code here:
    ManageAllVaccinators mv = new ManageAllVaccinators(userProcessContainer, ecosystem, vaccinatorDirectory, userAccount);
    userProcessContainer.add("ManageAllVaccinators",mv);
    CardLayout layout=(CardLayout)userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageVaccinatorsActionPerformed

    private void btnManageVaccinationSessionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageVaccinationSessionsActionPerformed
        // TODO add your handling code here:
    ManageAllSessions ms = new ManageAllSessions(userProcessContainer,ecosystem, vaccinationSessionDirectory, userAccount);
    userProcessContainer.add("ManageAllSessions",ms);
    CardLayout layout=(CardLayout)userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageVaccinationSessionsActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        RequestAdditionalDoses rad = new RequestAdditionalDoses(userProcessContainer, userAccount, ecosystem); 
        userProcessContainer.add("ManageVaccineCenterRequest", rad);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAEFIManagers;
    private javax.swing.JButton btnManageSessionManager;
    private javax.swing.JButton btnManageVaccinationSessions;
    private javax.swing.JButton btnManageVaccinators;
    private javax.swing.JButton btnRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSessionInfo;
    // End of variables declaration//GEN-END:variables
}
