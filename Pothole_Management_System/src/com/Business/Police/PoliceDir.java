/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Police;

import java.util.ArrayList;


public class PoliceDir {
    private ArrayList<Police> policeList;

    public PoliceDir() {
        policeList=new ArrayList();
        
    }
    
    //set police to Arryalist of police
    
      public void setPoliceList(ArrayList<Police> policeList) {
        this.policeList = policeList;
    }

    public ArrayList<Police> getPoliceList() {
        return policeList;
    }
    
    
    // add police to list 

  
    
  
    public Police addPolice(){
        Police l= new Police();
        policeList.add(l);
        return l;
    }
  
    public void removePolice(Police l){
        policeList.remove(l);
    }
}
