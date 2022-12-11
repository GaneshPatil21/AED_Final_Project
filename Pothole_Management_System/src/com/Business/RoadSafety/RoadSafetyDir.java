/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.RoadSafety;

import java.util.ArrayList;


public class RoadSafetyDir {
    private ArrayList<RoadSafety> hospitalDir;
    
    
    //new hospital diretory
    public RoadSafetyDir() {
    hospitalDir= new ArrayList();
    }

    public ArrayList<RoadSafety> getHospitalDir() {
        return hospitalDir;
    }

    
    //add a new doctor
    public RoadSafety addHospital(){
        RoadSafety h =new RoadSafety();
        hospitalDir.add(h);
        return h;
    }
    
    public void setHospitalDir(ArrayList<RoadSafety> hospitalDir) {
        this.hospitalDir = hospitalDir;
    }
    //remove a doctor
    public void removeHospital(RoadSafety hospital){
        hospitalDir.remove(hospital);   
    }
    
}
