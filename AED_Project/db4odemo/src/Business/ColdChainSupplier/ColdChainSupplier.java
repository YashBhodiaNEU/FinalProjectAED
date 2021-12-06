/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ColdChainSupplier;

/**
 *
 * @author Karan
 */
public class ColdChainSupplier {
    private String coldChainSupplierName;
    private float minTempSupport;
    
    public ColdChainSupplier(String coldChainSupplierName, float minTempSupport){
        this.coldChainSupplierName = coldChainSupplierName;
        this.minTempSupport = minTempSupport;
    }

    public String getColdChainSupplierName() {
        return coldChainSupplierName;
    }

    public void setColdChainSupplierName(String coldChainSupplierName) {
        this.coldChainSupplierName = coldChainSupplierName;
    }

    public float getMinTempSupport() {
        return minTempSupport;
    }

    public void setMinTempSupport(float minTempSupport) {
        this.minTempSupport = minTempSupport;
    }
    
    @Override
    public String toString(){
        return coldChainSupplierName;
    }
    
    
}
