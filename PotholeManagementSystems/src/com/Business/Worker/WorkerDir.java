/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Worker;

import java.util.ArrayList;


public class WorkerDir {
    private ArrayList<Worker> volunteerList;

    public WorkerDir() {
        volunteerList= new ArrayList<>();
        
    }
    
    
     public void setVolunteerList(ArrayList<Worker> volunteerList) {
        this.volunteerList = volunteerList;
    }
 
     
     //add vulunteer functon 
    public Worker addVolunteer(){
    
        Worker v = new Worker();
        volunteerList.add(v);
        return v;
    }

    
    //get voluteer list
    public ArrayList<Worker> getVolunteerList() {
        return volunteerList;
    }

   // remove volunteer form the list
  
    public void removeVolunteer(Worker v){
        volunteerList.remove(v);
    }
}
