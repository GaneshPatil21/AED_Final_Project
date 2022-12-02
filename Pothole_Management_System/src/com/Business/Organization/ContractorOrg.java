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
        super(Organization.Type.NGO.getValue());
        ngoList=new ContractorDir();
    }

    

}
