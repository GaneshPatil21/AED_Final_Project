/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Enterprise;

import com.Business.Role.PoliceRole;
import com.Business.Role.Role;
import java.util.HashSet;

//policeenterprise
public class PoliceEnt extends Enterprise{
    public PoliceEnt(String name){
        super(name,Enterprise.EnterpriseType.Police);
    }
    //hash map to for Police role addition
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new PoliceRole());
        return role;
    }
}
