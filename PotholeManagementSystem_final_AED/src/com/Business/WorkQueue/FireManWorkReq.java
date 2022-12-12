/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.WorkQueue;


public class FireManWorkReq extends WorkReq{
    private String description;
    private boolean add;
    private String location;
    
    //fire man work req
    
    public FireManWorkReq() {
        
        add = false;
        
    }
    
    //get description 

    public String getDescription() {
        return description;
    }
    
    // add description

    public void setAdd(boolean add) {
        this.add = add;
    }

    public String getLocation() {
        return location;
    }
    
    
    
   
    public boolean isAdd() {
        return add;
    }
    
    //setDescription  function
    
     public void setDescription(String description) {
        this.description = description;
    }
     
     //set Location


    public void setLocation(String location) {
        this.location = location;
    }
}
