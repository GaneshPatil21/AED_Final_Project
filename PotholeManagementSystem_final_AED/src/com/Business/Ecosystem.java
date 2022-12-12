/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business;


import com.Business.Enterprise.Enterprise;
import com.Business.Network.Network;
import com.Business.Organization.Organization;
import com.Business.Role.Role;
import com.Business.Role.SystemAdminRole;
import com.Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashSet;


public class Ecosystem extends Organization {
    
    private static Ecosystem business;
    private ArrayList<Network> networkList;
    
    
    //declare arryalist
    
     public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    //constructor for Ecosystem class
    private Ecosystem()
    {
        super(null);
        networkList = new ArrayList<>();
        
    }

   
    public static void setInstance(Ecosystem system)
    {
        business = system;
    }
    
    
     @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new SystemAdminRole());
        
        return role;
    }
    
    //add a network
    public Network addNetwork()
    {
      Network  network = new Network();
      networkList.add(network);
      return network;
    }
    
    //get ecosystem instance
    public static Ecosystem getInstance()
    {
     if(business == null)
     {
         business = new Ecosystem();
     }
     return business;
    }
    
   
    
    
    
    
    
    
   //check usernameidUnique 
    public static boolean checkIfUsernameIsUnique(String username)
    {
        for(Network n : business.getNetworkList())
        {
            for(Enterprise e : n.getEnterpriseDir().getEnterpriseList())
            {
                for(UserAccount ua : e.getUserAccountDir().getUserAccountList())
                {
                    if(ua.getUsername().equals(username))
                    {
                        return false;
                    }
                }
                
                for(Organization o : e.getOrganizationDir().getOrganizationList())
                {
                    for(UserAccount ua : o.getUserAccountDir().getUserAccountList())
                    {
                        if(ua.getUsername().equals(username))
                        {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }   
    
}
