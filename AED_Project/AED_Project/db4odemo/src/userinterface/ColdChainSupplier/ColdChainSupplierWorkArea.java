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
import java.awt.CardLayout;
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
        btnVMTF = new javax.swing.JButton();
        btnSTVC = new javax.swing.JButton();
        btnFTS = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Vaccine Orders in Pipeline");

        btnVMTF.setText("Federal Government Orders");
        btnVMTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVMTFActionPerformed(evt);
            }
        });

        btnSTVC.setText("Vaccination Center Orders");
        btnSTVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSTVCActionPerformed(evt);
            }
        });

        btnFTS.setText("State Government Orders");
        btnFTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFTSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(184, 184, 184))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVMTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFTS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSTVC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(btnVMTF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFTS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSTVC)
                .addContainerGap(414, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVMTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVMTFActionPerformed
        // TODO add your handling code here:
    ColdChainVMTF macmjp = new ColdChainVMTF(userProcessContainer, userAccount, ecosystem);
    userProcessContainer.add("ManageFederalGovernmentOrders",macmjp);
    CardLayout layout=(CardLayout)userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnVMTFActionPerformed

    private void btnFTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFTSActionPerformed
        // TODO add your handling code 
    ColdChainFTS macmjp = new ColdChainFTS(userProcessContainer, userAccount, ecosystem);
    userProcessContainer.add("ManageAllStateOrders",macmjp);
    CardLayout layout=(CardLayout)userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFTSActionPerformed

    private void btnSTVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSTVCActionPerformed
        // TODO add your handling code here:
    ColdChainVCTS macmjp = new ColdChainVCTS(userProcessContainer, userAccount, ecosystem);
    userProcessContainer.add("ManageAllCenterOrders",macmjp);
    CardLayout layout=(CardLayout)userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSTVCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFTS;
    private javax.swing.JButton btnSTVC;
    private javax.swing.JButton btnVMTF;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}