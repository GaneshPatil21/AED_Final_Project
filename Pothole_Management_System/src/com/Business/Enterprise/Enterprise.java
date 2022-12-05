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
    //enums for different types of enterprise
     public enum EnterpriseType
     {
        Community("Community"),
        NGO("NGO"),
        Provider ("Provider"),
        Police("Police"),
        Hospital("Hospital"),
        FireMan("FireMan");
        
        private String value;
        
        

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
        
        //Enterprise type to set 
        
        private EnterpriseType(String value)
        {
            this.value = value;
        }
     }
     
     //het orgaixation dir
     
     public OrganizationDir getOrganizationDir() {
        return organizationDir;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    

}
