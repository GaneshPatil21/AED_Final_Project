/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Organization;

import com.Business.Police.PoliceDir;
import com.Business.Role.PoliceRole;
import com.Business.Role.Role;
import java.util.HashSet;


public class PoliceOrg extends Organization{
    PoliceDir policeList;
    //constructor to add police list to police directory
    public PoliceOrg(String name)
    {
        super(Organization.Type.Police.getValue());
        policeList=new PoliceDir();
    }
    
    
    public void setPoliceList(PoliceDir policeList) {
        this.policeList = policeList;
    }


    public PoliceDir getPoliceList() {
        return policeList;
    }

    
    //hasmap to support police role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new PoliceRole());
       return role;
       
    } 
}
