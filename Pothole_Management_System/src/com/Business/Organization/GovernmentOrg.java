/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Organization;

import com.Business.Government.GovernmentDir;
import com.Business.Role.GovernmentRole;
import com.Business.Role.Role;
import java.util.HashSet;


public class GovernmentOrg extends Organization {
    
    GovernmentDir eventMakerList;
    //constructor to add event maker list to Event Maker directory
    public GovernmentOrg()
    {
        super(Organization.Type.EventMaker.getValue());
        eventMakerList= new GovernmentDir();
    }
    
     public void setChangemakerlist(GovernmentDir eventmakerlist) {
        this.eventMakerList = eventmakerlist;
    }
    

    public GovernmentDir getChangemakerlist() {
        return eventMakerList;
    }

   
    //hash map to support event maker role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new GovernmentRole());
       return role;
       
    }
}
