/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Enterprise;

import java.util.ArrayList;


public class EnterpriseDir {
    
private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDir()
    {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    //Creaye and add new enterprises
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        
        //check type of Enterprise
        if(type == Enterprise.EnterpriseType.Community){
            enterprise = new CommunityEnt(name);
            enterpriseList.add(enterprise);
        }
       
         else if(type == Enterprise.EnterpriseType.NGO){
            enterprise= new ContractorEnt(name);
            enterpriseList.add(enterprise);
         }
         
          else if(type == Enterprise.EnterpriseType.Provider){
            enterprise= new SupplierEnt(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
        
    }
   
    
}


