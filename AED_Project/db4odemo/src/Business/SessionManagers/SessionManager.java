/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.SessionManagers;


/**
 *
 * @author yashb
 */


public class SessionManager{
    private String managerName;
    private String managerEmailID;
    private String centerName;
    
    
    public SessionManager(String managerName, String managerEmailID, String centerName){
        this.managerName = managerName;
        this.managerEmailID = managerEmailID;
        this.centerName = centerName;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }
    
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerEmailID() {
        return managerEmailID;
    }

    public void setManagerEmailID(String managerEmailID) {
        this.managerEmailID = managerEmailID;
    }
    
    @Override
    public String toString(){
        return managerName;
    }
    
}
