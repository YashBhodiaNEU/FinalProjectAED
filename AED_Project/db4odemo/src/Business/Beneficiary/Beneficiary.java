/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Beneficiary;

/**
 *
 * @author Karan
 */
public class Beneficiary {
    
    private String beneficiaryName;
    private String beneficiaryAge;
    private String beneficiaryPhoneNumber;
    private String status;
    
    public Beneficiary(String beneficiaryName, String beneficiaryAge, String beneficiaryPhoneNumber, String status){
        this.beneficiaryName = beneficiaryName;
        this.beneficiaryAge = beneficiaryAge;
        this.beneficiaryPhoneNumber = beneficiaryPhoneNumber;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
        
    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public String getBeneficiaryAge() {
        return beneficiaryAge;
    }

    public void setBeneficiaryAge(String beneficiaryAge) {
        this.beneficiaryAge = beneficiaryAge;
    }

    public String getBeneficiaryPhoneNumber() {
        return beneficiaryPhoneNumber;
    }

    public void setBeneficiaryPhoneNumber(String beneficiaryPhoneNumber) {
        this.beneficiaryPhoneNumber = beneficiaryPhoneNumber;
    }
    
    @Override
    public String toString(){
        return beneficiaryName;
    }
}
