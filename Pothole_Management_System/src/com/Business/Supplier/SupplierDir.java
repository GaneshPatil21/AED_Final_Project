/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Supplier;

import java.util.ArrayList;


public class SupplierDir {
    private ArrayList<Supplier> providerList;
    
    //set supplier direcroy
    
    
    public SupplierDir() {
        providerList=new ArrayList<>();
        
    }
    
    //add supplier to direcroty
     public Supplier addSupplier(){
        Supplier s= new Supplier();
        providerList.add(s);
        return s;
    }
     
     
     //get supplier araylist
    public ArrayList<Supplier> getProviderList() {
        return providerList;
    }

    public void setProviderList(ArrayList<Supplier> providerList) {
        this.providerList = providerList;
    }
    //remove a provider from list
    public void removeSupplier(Supplier s){
        providerList.remove(s);
    }
}
