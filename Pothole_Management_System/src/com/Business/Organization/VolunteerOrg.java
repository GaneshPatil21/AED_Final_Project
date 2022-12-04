/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Organization;

import com.Business.Role.Role;
import com.Business.Role.VolunteerRole;
import com.Business.Volunteer.VolunteerDir;
import java.util.HashSet;


public class VolunteerOrg extends Organization{
    VolunteerDir victimList;
    
    public VolunteerOrg()
    {
        super(Organization.Type.Victim.getValue());
        victimList=new VolunteerDir();
    }

    
//set changeseeker list
    public void setChangeseekerlist(VolunteerDir victimList) {
        this.victimList = victimList;
    }
    
    
    public VolunteerDir getChangeseekerlist() {
        return victimList;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new VolunteerRole());
        return role;
        
    }
}
