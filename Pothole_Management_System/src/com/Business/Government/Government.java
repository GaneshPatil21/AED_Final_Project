/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Government;

import com.Business.WorkQueue.WorkQueue;


public class Government {
    private String name;
    private String id;
    private WorkQueue workQueue;
    
    private static int count=1;
    //Event maker class constructor
     public Government(){
         
        id= "EM"+(++count);
        workQueue=new WorkQueue();
    }
     
    
}

