/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Enterprise;

import com.Business.Role.SupplierManagerRole;
import com.Business.Role.Role;
import java.util.HashSet;

//supplier enterrise
public class SupplierEnt extends Enterprise{
    public SupplierEnt(String name){
        super(name, Enterprise.EnterpriseType.Provider);
        
    } 
    //hash map to for Provider role addition
    @Override
    public HashSet<Role> getSupportedRole(){
        new SupplierManagerRole();
        return role;
        
    }
}
