/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.WorkQueue;

import java.util.ArrayList;


public class WorkQueue {
    
    private ArrayList<WorkReq> workRequestList;
    
    public ArrayList<WorkReq> getWorkRequestList() {
        return workRequestList;
    }
    
    public WorkQueue(){
        workRequestList=new ArrayList<>();
    }

   
    
    
}
