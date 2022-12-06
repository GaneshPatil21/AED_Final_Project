/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Enterprise;

import com.Business.Role.RoadSafetyRole;
import com.Business.Role.Role;
import java.util.HashSet;

//Hospital enterprise
public class RoadSafetyEnt extends Enterprise{
    public RoadSafetyEnt(String name){
        super(name,Enterprise.EnterpriseType.Hospital);
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
       
        role.add(new RoadSafetyRole());
     
        return role;
        
    }
}
