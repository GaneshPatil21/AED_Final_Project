/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.WorkQueue;


public class ContractorWorkReq extends WorkReq{
    private String title;
    private String description;
    private String location;
    private int vRequired;
    private int vAcquired;
    private boolean add;
    private String volQty;
    
    public ContractorWorkReq() {
        
        add = false;
        
    }

    public String getTitle() {
        return title;
    }

   

    public void setDescription(String description) {
        this.description = description;
    }
    
     public void setvAcquired(int vAcquired) {
        this.vAcquired = vAcquired;
    }

    public String getVolQty() {
        return volQty;
    }

    public String getLocation() {
        return location;
    }

   

    public String getDescription() {
        return description;
    }

    public int getvRequired() {
        return vRequired;
    }

    public void setvRequired(int vRequired) {
        this.vRequired = vRequired;
    }

    public int getvAcquired() {
        return vAcquired;
    }

   

    public void setVolQty(String volQty) {
        this.volQty = volQty;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }
    
     public void setLocation(String location) {
        this.location = location;
    }
    
    
     public void setTitle(String title) {
        this.title = title;
    }
    
    public String toString(){
        return title;
    }
}
