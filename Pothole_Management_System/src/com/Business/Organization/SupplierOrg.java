/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Organization;

import com.Business.Supplier.SupplierDir;
import com.Business.Role.SupplierRole;
import com.Business.Role.Role;
import java.util.HashSet;


public class SupplierOrg extends Organization{
    SupplierDir providerList;
    //constructor to add provider list to provider directory
    public SupplierOrg(String name) {
        super(Organization.Type.Provider.getValue());
        providerList= new SupplierDir();
      
    }
       public void setProviderList(SupplierDir providerList) {
        this.providerList = providerList;
    }
       
       //GetProviderList

    public SupplierDir getProviderList() {
        return providerList;
    }

 
    //hashmap to support provider list
    @Override
    public HashSet<Role> getSupportedRole(){
       
        role.add(new SupplierRole());
        return role;
    }
}
