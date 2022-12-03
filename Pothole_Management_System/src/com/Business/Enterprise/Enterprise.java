/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Enterprise;

import com.Business.Organization.Organization;
import com.Business.Organization.OrganizationDir;

public abstract class Enterprise extends Organization {
    
    private EnterpriseType enterpriseType;
    private OrganizationDir organizationDir;
    
    //constructor
    
    public Enterprise(String name, EnterpriseType type)
    {
      super(name);
      this.enterpriseType= type;
      organizationDir = new OrganizationDir();
    }
 

    

}
