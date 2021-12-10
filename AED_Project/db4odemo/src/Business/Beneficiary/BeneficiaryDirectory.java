/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Beneficiary;

import java.util.ArrayList;

/**
 *
 * @author Karan
 */
public class BeneficiaryDirectory {
    private ArrayList<Beneficiary> beneficiaryDirectory;
    
    public BeneficiaryDirectory(){
        beneficiaryDirectory = new ArrayList();
    }

    public ArrayList<Beneficiary> getBeneficiaryDirectory() {
        return beneficiaryDirectory;
    }

    public void setBeneficiaryDirectory(ArrayList<Beneficiary> beneficiaryDirectory) {
        this.beneficiaryDirectory = beneficiaryDirectory;
    }
    
    public Beneficiary getBeneficiary(String name){
        for (Beneficiary sm: beneficiaryDirectory){
            if(sm.getBeneficiaryName().equalsIgnoreCase(name)){
                return sm;
            }
        }
        return null;
    }
    
    public Beneficiary addBeneficiary(String beneficiaryName, String beneficiaryAge, String beneficiaryPhoneNumber, String status){
        Beneficiary sm = new Beneficiary(beneficiaryName, beneficiaryAge, beneficiaryPhoneNumber, status);
        beneficiaryDirectory.add(sm);
        return sm;
    }
}
