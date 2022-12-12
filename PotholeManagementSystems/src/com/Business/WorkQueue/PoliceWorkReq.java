/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.WorkQueue;


public class PoliceWorkReq extends WorkReq{
    private String description;
    private boolean add;
    private String location;
    
    public PoliceWorkReq() {
        
        add = false;
        
    }
    
     public void setAdd(boolean add) {
        this.add = add;
    }
    
    public String getDescription() {
        return description;
    }
    
    
    
    public String getLocation() {
        return location;
    }

    

    public boolean isAdd() {
        return add;
    }

   

    public void setDescription(String description) {
        this.description = description;
    }

    

    public void setLocation(String location) {
        this.location = location;
    }
}
