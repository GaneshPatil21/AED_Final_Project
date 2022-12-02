/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Organization;

import com.Business.RoadSafety.RoadSafetyDir;
import com.Business.Role.RoadSafetyRole;
import com.Business.Role.Role;
import java.util.HashSet;

//Doctor Oraganization 
public class RoadSafetyOrg extends Organization{
    RoadSafetyDir doctorList;
    //constructor to add doctor list to hospital directory
    public RoadSafetyOrg()
    {
        super(Organization.Type.Doctor.getValue());
        doctorList= new RoadSafetyDir();
    }

    public RoadSafetyDir getHospitallist() {
        return doctorList;
    }
    
    //setHospital List

    public void setHospitallist(RoadSafetyDir doctorList) {
        this.doctorList = doctorList;
    }
    
    //hashmap to support doctor role
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new RoadSafetyRole());
       return role;
    }
    
}
