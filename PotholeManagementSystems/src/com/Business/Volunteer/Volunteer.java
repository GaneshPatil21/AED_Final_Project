/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Volunteer;

import com.Business.WorkQueue.WorkQueue;


public class Volunteer {
    private String victimName;
    private String victimId;
    private WorkQueue workqueue;
    
    private static int count=1;
    //victim class constructor to autogenerate victimId
     public Volunteer(){
         
        victimId= "Victim"+(++count);
    }

    public WorkQueue getWorkqueue() {
        return workqueue;
    }
    
    //Set victim NAme

   
    public void setVictimName(String victimName) {
        this.victimName = victimName;
    }
    
    //get victim ID

    public String getVictimId() {
        return victimId;
    }
    
    //set Work Queue

     public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }
 
    //get victime name 
    public String getVictimName() {
        return victimName;
    }

    public void setVictimId(String victimId) {
        this.victimId = victimId;
    }
     
     @Override
     public String toString(){
         return victimName;
     }
}
