/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Enterprise;

import com.Business.Role.FireManRole;
import com.Business.Role.Role;
import java.util.HashSet;

//Fireman enterprise
public class FireManEnt extends Enterprise{
    public FireManEnt(String name){
        super(name,Enterprise.EnterpriseType.FireMan);
    }
    //hash map to for Fire Man role addition
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new FireManRole());
        return role;
    }
}
