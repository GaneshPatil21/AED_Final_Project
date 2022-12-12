/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Government;

import java.util.ArrayList;


public class GovernmentDir {
    
private ArrayList<Government> eventMakerDirectory;

    public GovernmentDir() {
        eventMakerDirectory= new ArrayList<>();
    }
    
    //eventmaker directory

    

    public void setChangeMakerDirectory(ArrayList<Government> changeMakerDirectory) {
        this.eventMakerDirectory = changeMakerDirectory;
    }
    
    //add an event maker
    public Government addChangeMaker(){
        Government cm = new Government();
        eventMakerDirectory.add(cm);
        return cm;
    }
    //remove an event maker
   
    
    public ArrayList<Government> getChangeMakerDirectory() {
        return eventMakerDirectory;
    }
    
    
    //
    
    
     public void removeChangeMaker(Government cm){
        eventMakerDirectory.remove(cm);
    }
    
}

