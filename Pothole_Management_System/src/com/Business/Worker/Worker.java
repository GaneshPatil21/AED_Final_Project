/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Worker;

import com.Business.WorkQueue.WorkQueue;


public class Worker {
    private String volunteerName;
    private String volunteerId;
    private static int count=1;
    private WorkQueue workqueue;
    //Volunteer class constructor 
    public Worker() {
        volunteerId="Vol"+(++count);
        workqueue= new WorkQueue();
    }
    
    public String getVolunteerName() {
        return volunteerName;
    }

  

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }

    public String getVolunteerId() {
        return volunteerId;
    }
    
    //set volunterer name
    
      public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }
    //get work queue
    public WorkQueue getWorkqueue() {
        return workqueue;
    }
//set volunterr Id
    public void setVolunteerId(String volunteerId) {
        this.volunteerId = volunteerId;
    }
    
    @Override
    public String toString(){
    return volunteerName;
    
    }
}
