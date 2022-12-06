/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.FireMan;

import com.Business.WorkQueue.WorkQueue;

//fireMAn role 
public class FireMan {
    private String Name;
    private static int Count=1;
    private String FireManId;
    private WorkQueue workQueue;
    //Fire man constructor which automatically generates id
    public FireMan() {
        
        FireManId = "FireMan"+(++Count);
        workQueue= new WorkQueue();
    }
    
    //get Count of FIreman
    
    public static int getCount() {
        return Count;
    }

    

   

    public void setFireManId(String FireManId) {
        this.FireManId = FireManId;
    }
    
    public static void setCount(int Count) {
        FireMan.Count = Count;
    }

    public String getName() {
        return Name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    //set workQueue

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
     public void setName(String Name) {
        this.Name = Name;
    }

    public String getFireManId() {
        return FireManId;
    }
       
    
        @Override
    public String toString(){
        return Name;
    }
}
