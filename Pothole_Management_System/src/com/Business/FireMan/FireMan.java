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
    
}
