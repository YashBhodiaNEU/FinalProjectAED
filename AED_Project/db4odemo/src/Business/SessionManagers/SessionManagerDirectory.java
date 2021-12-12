/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.SessionManagers;

import java.util.ArrayList;

/**
 *
 * @author yashb
 */
public class SessionManagerDirectory {
    
    private ArrayList<SessionManager> sessionManagerDirectory;
    
    public SessionManagerDirectory(){
        sessionManagerDirectory = new ArrayList();
    }

    public ArrayList<SessionManager> getSessionManagerDirectory() {
        return sessionManagerDirectory;
    }

    public void setSessionManagerDirectory(ArrayList<SessionManager> sessionManagerDirectory) {
        this.sessionManagerDirectory = sessionManagerDirectory;
    }
    
    public SessionManager getSessionManager(String name){
        for (SessionManager sm: sessionManagerDirectory){
            if(sm.getManagerName().equalsIgnoreCase(name)){
                return sm;
            }
        }
        return null;
    }
    
    public SessionManager addSessionManager(String managerName, String managerEmailId, String centerName){
        SessionManager sm = new SessionManager(managerName, managerEmailId, centerName);
        sessionManagerDirectory.add(sm);
        return sm;
    }
    
    public void removeSessionManager(SessionManager sm){
        sessionManagerDirectory.remove(sm);
    }
    
}
