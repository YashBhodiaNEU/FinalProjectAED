/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.FederalGovernment;

import Business.AEFIManager.AEFIManagerDirectory;
import Business.Beneficiary.BeneficiaryDirectory;
import Business.ColdChainSupplier.ColdChainSupplier;
import Business.ColdChainSupplier.ColdChainSupplierDirectory;
import Business.EcoSystem;
import Business.FederalGovernment.FederalGovernment;
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
import Business.VaccineRequestSTF.VaccineRequestSTF;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Karan
 */
public class FederalGovernmentWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form FederalGovernmentWorkArea
     */
    private UserAccount userAccount;
    private JPanel userProcessContainer;
    private FederalGovernmentDirectory federalGovernmentDirectory;
    private VaccineManufacturerDirectory vaccineManufacturerDirectory;
    private EcoSystem ecosystem;
    private int i=1;
    public FederalGovernmentWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem, VaccineManufacturerDirectory vaccineManufacturerDirectory, FederalGovernmentDirectory federalGovernmentDirectory, StateGovernmentDirectory stateGovernmentDirectory, ColdChainSupplierDirectory coldChainSupplierDirectory, VaccinationCenterDirectory vaccinationCenterDirectory, SessionManagerDirectory sessionManagerDirectory,  AEFIManagerDirectory aefiManagerDirectory, VaccinatorDirectory vaccinatorDirectory, VaccinationSessionDirectory vaccinationSessionDirectory, BeneficiaryDirectory beneficiaryDirectory) {
        initComponents();
        this.ecosystem = ecosystem;
        this.userAccount = account;
        this.userProcessContainer = userProcessContainer;
        this.federalGovernmentDirectory = federalGovernmentDirectory;
        this.vaccineManufacturerDirectory = vaccineManufacturerDirectory;
        selectManufacturer();
        selectColdChain();
        populateOrderTable();
        populateStateGovVaccineRequest();
        populateStateGovVaccineProcess();
        populateStateGovVaccineRequest();
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
        for(VaccineRequestFTVM vr : ecosystem.getRequestFTVMDirectory().getRequestFTVMDirectory()){
            //System.out.println(v.getFederalGovernment().getFedName());
            if(userAccount.getEmployee().getName().equalsIgnoreCase(vr.getFederalGovernment())){
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
        
    public void populateStateGovVaccineRequest(){
        DefaultTableModel dtm = (DefaultTableModel) tblStateGovernmentRequest.getModel();
        dtm.setRowCount(0);
        for(VaccineRequestSTF vsr : ecosystem.getRequestSTFDirectory().getRequestSTFDirectory()){
            if(userAccount.getEmployee().getName().equalsIgnoreCase(vsr.getFedName()) && vsr.getVaccineRequestStatus().equalsIgnoreCase("Order Placed")){
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
            System.out.println(userAccount.getEmployee().getClass());
            if(userAccount.getEmployee().getName().equalsIgnoreCase(vsr.getFedName()) && vsr.getVaccineRequestStatus().equalsIgnoreCase("Doses In Pipeline")){
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
        comboColdChain = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVaccineRequests = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumberOfDoses = new javax.swing.JTextField();
        comboManufacturer = new javax.swing.JComboBox<>();
        btnPlaceOrder = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnPipeline = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStateGovernmentProcess = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblStateGovernmentRequest = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Federal Government Vaccine Stocks");

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

        btnPlaceOrder.setText("Place the Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        jLabel4.setText("Cold Chain Supplier");

        jLabel5.setText("--------------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("State Government Vaccine Orders");

        btnPipeline.setText("Order in Pipeline");
        btnPipeline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPipelineActionPerformed(evt);
            }
        });

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
        jScrollPane2.setViewportView(tblStateGovernmentProcess);

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
        jScrollPane3.setViewportView(tblStateGovernmentRequest);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPipeline)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumberOfDoses)
                            .addComponent(comboManufacturer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboColdChain, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnPlaceOrder))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(btnPlaceOrder))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPipeline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
        FederalGovernment fg = ecosystem.getFederalGovernmentDirectory().getFederalGovernment(userAccount.getEmployee().getName());

        //VaccineManufacturer vm = ecosystem.getVaccineManufacturerDirectory().getVaccineManufacturer(comboManufacturer.getSelectedItem().toString());
        //ColdChainSupplier ccs = ecosystem.getColdChainSupplierDirectory().getColdChainSupplier(comboColdChain.getSelectedItem().toString());

        VaccineRequestFTVM vr = ecosystem.getRequestFTVMDirectory().newVaccineRequest();

        vr.setVaccineRequestID(String.valueOf(i++));
        vr.setFederalGovernment(fg.getFedName());
        vr.setVaccineManufacturer(comboManufacturer.getSelectedItem().toString());
        vr.setColdChainSupplier(comboColdChain.getSelectedItem().toString());
        vr.setNumberOfDoses(Integer.parseInt(txtNumberOfDoses.getText()));
        vr.setVaccineRequestStatus("Order Placed");
        //System.out.println("Order Placed");
        populateOrderTable();
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnPipelineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPipelineActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblStateGovernmentRequest.getSelectedRow();
        VaccineRequestSTF vsr = (VaccineRequestSTF)tblStateGovernmentRequest.getValueAt(selectedRow, 0);
        String status = "Doses In Pipeline";
        vsr.setVaccineRequestStatus(status);
        populateStateGovVaccineProcess();
        populateStateGovVaccineRequest();
    }//GEN-LAST:event_btnPipelineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPipeline;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JComboBox<String> comboColdChain;
    private javax.swing.JComboBox<String> comboManufacturer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblStateGovernmentProcess;
    private javax.swing.JTable tblStateGovernmentRequest;
    private javax.swing.JTable tblVaccineRequests;
    private javax.swing.JTextField txtNumberOfDoses;
    // End of variables declaration//GEN-END:variables
}
