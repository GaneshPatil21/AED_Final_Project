/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.RoadSafety;


public class Hospital {
    private String doctorName;
    private String doctorId;
    private static int count=1;
    
    //Hospital constructor to generate id automatically
    public Hospital() {
        
        
        doctorId="ORG"+(++count);
    }

    
    
    
     
   
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    public static int getCount() {
        return count;
    }
//set hopital count
    public static void setCount(int count) {
        Hospital.count = count;
    }
    
    //get doctor ID

    public String getDoctorId() {
        return doctorId;
    }
    
     public String getDoctorName() {
        return doctorName;
    }


   

   

    @Override
    public String toString(){
    return doctorName;
    
    }
    
    
     public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }
}
