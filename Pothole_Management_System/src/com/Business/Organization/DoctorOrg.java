/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Organization;

import com.Business.RoadSafety.HospitalDir;
import com.Business.Role.DoctorRole;
import com.Business.Role.Role;
import java.util.HashSet;

//Doctor Oraganization 
public class DoctorOrg extends Organization{
    HospitalDir doctorList;
    //constructor to add doctor list to hospital directory
    public DoctorOrg()
    {
        super(Organization.Type.Doctor.getValue());
        doctorList= new HospitalDir();
    }

    //hashmap to support doctor role
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new DoctorRole());
       return role;
    }
    
}
