/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Organization;

import com.Business.Contractor.ContractorDir;
import com.Business.Role.ContractorManagerRole;
import com.Business.Role.Role;
import java.util.HashSet;


public class ContractorOrg extends Organization{
    ContractorDir ngoList;
    //constructor to add NGO list to NGO directory
    public ContractorOrg()
    {
        super(Organization.Type.Contractor.getValue());
        ngoList=new ContractorDir();
    }

    

    public void setNgoList(ContractorDir ngoList) {
        this.ngoList = ngoList;
    }
    
    public ContractorDir getNgoList() {
        return ngoList;
    }
    //hashmap to support NGO role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new ContractorManagerRole());
       return role;
       
    }
}
