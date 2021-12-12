/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AEFIManager;

import java.util.ArrayList;

/**
 *
 * @author Karan
 */
public class AEFIManagerDirectory {
    
    private ArrayList<AEFIManager> aefiManagerDirectory;
    
    public AEFIManagerDirectory(){
        aefiManagerDirectory = new ArrayList();
    }

    public ArrayList<AEFIManager> getAefiManagerDirectory() {
        return aefiManagerDirectory;
    }

    public void setAefiManagerDirectory(ArrayList<AEFIManager> aefiManagerDirectory) {
        this.aefiManagerDirectory = aefiManagerDirectory;
    }
    
    public AEFIManager getAEFIManager(String name){
        for (AEFIManager sm: aefiManagerDirectory){
            if(sm.getAefiManagerName().equalsIgnoreCase(name)){
                return sm;
            }
        }
        return null;
    }
    
    public AEFIManager addAEFIManager(String managerName, String managerEmailId, String centerName){
        AEFIManager sm = new AEFIManager(managerName, managerEmailId, centerName);
        aefiManagerDirectory.add(sm);
        return sm;
    }
    
    public void removeAEFIManager(AEFIManager sm){
        aefiManagerDirectory.remove(sm);
    }
}
