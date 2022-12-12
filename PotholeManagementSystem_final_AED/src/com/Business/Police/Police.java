/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Police;

import com.Business.WorkQueue.WorkQueue;


public class Police {
    private String Name;
    private static int Count=1;
    private String PoliceId;
    private WorkQueue workQueue;
    
    public Police() {
        
        PoliceId = "Police"+(++Count);
        workQueue= new WorkQueue();
    }
    
    //get count method to gernerate cout
    
    public static int getCount() {
        return Count;
    }

    public static void setCount(int Count) {
        Police.Count = Count;
    }
    
   
//get Name of police ID
    public String getPoliceId() {
        return PoliceId;
    }

    public void setPoliceId(String PoliceId) {
        this.PoliceId = PoliceId;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
     public String getName() {
        return Name;
    }
     
     //set name of police 

    public void setName(String Name) {
        this.Name = Name;
    }
    
    //set WorkQueue

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    //change Object to String  for table display
          
    @Override
    public String toString(){
        return Name;
    }
}
