/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AppointmentBooking;

import java.util.ArrayList;

/**
 *
 * @author Karan
 */
public class AppointmentDirectory {
    
    private ArrayList<BookAppointment> appointmentDirectory;
    
    public AppointmentDirectory(){
        appointmentDirectory = new ArrayList();
    }

    public ArrayList<BookAppointment> getAppointmentDirectory() {
        return appointmentDirectory;
    }

    public void setAppointmentDirectory(ArrayList<BookAppointment> appointmentDirectory) {
        this.appointmentDirectory = appointmentDirectory;
    }
    
    public BookAppointment newAppointment(){
        BookAppointment bookAppointment = new BookAppointment();
        appointmentDirectory.add(bookAppointment);
        return bookAppointment;
    }
    
    public BookAppointment getAppointmentID(String id){
        for(BookAppointment bookAppointment:appointmentDirectory){
            if(bookAppointment.getAppointmentID().equals(id)){
                return bookAppointment;
            }
        }
        return null;
    }
    
}
