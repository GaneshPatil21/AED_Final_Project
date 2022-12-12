/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Network;

import com.Business.Enterprise.EnterpriseDir;

//network
public class Network {
    private String networkName;
    private EnterpriseDir enterpriseDir;
    
    public Network()
    {
     enterpriseDir = new EnterpriseDir();
    }
    
    //enterprise directory

    public EnterpriseDir getEnterpriseDir() {
        return enterpriseDir;
    }

    public String getNetworkName() {
        return networkName;
    }
    
    //SetNEtwork NAme

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
    
    @Override
    public String toString()
    {
        return networkName;
    }
}

