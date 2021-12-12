/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.VaccineManufacturer;

/**
 *
 * @author Karan
 */
public class VaccineManufacturer {
    private String manufacturerName;
    private String vaccineName;
    private long currentStock;
    
    public VaccineManufacturer(String manufacturerName, String vaccineName, long currentStock){
        this.manufacturerName = manufacturerName;
        this.vaccineName = vaccineName;
        this.currentStock = currentStock;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public long getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(long currentStock) {
        this.currentStock = currentStock;
    }

    
    @Override
    public String toString(){
        return manufacturerName;
    }
    
}
