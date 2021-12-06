/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AEFIManager;

/**
 *
 * @author Karan
 */
public class AEFIManager{
    private String aefiManagerName;
    private String aefimanagerEmailID;
    private String centerName;
    
    public AEFIManager(String aefiManagerName, String aefimanagerEmailID, String centerName){
        this.aefiManagerName = aefiManagerName;
        this.aefimanagerEmailID = aefimanagerEmailID;
        this.centerName = centerName;
    }

    public String getAefiManagerName() {
        return aefiManagerName;
    }

    public void setAefiManagerName(String aefiManagerName) {
        this.aefiManagerName = aefiManagerName;
    }

    public String getAefimanagerEmailID() {
        return aefimanagerEmailID;
    }

    public void setAefimanagerEmailID(String aefimanagerEmailID) {
        this.aefimanagerEmailID = aefimanagerEmailID;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }
    
    @Override
    public String toString(){
        return aefiManagerName;
    }
}
