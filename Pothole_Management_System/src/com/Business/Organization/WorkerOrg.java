/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Organization;

import com.Business.Role.Role;
import com.Business.Role.WorkerRole;
import com.Business.Worker.WorkerDir;
import java.util.HashSet;


public class WorkerOrg extends Organization{
    WorkerDir volunteerList;
    //constructor to add volunteer list to volunteer directory
    public WorkerOrg(String name) {
        super(Organization.Type.Volunteer.getValue());
        volunteerList= new WorkerDir();
    }
    
    //set voulnteerList
     public void setVolunteerList(WorkerDir volunteerList) {
        this.volunteerList = volunteerList;
    }

    public WorkerDir getVolunteerList() {
        return volunteerList;
    }

   
    //hashmap to support volunteer role
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new WorkerRole());
       return role;
    }
}
