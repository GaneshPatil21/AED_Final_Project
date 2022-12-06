/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.FireMan;

import java.util.ArrayList;
//fireman directory
public class FireManDir {

    private ArrayList<FireMan> fireManList;

    public FireManDir() {
        fireManList = new ArrayList();

    }

   
    public void setPoliceList(ArrayList<FireMan> fireManList) {
        this.fireManList = fireManList;
    }

    //add new fire man
    public FireMan addFireMan() {
        FireMan l = new FireMan();
        fireManList.add(l);
        return l;
    }

    //remove a fire man
    public void removeFireMan(FireMan l) {
        fireManList.remove(l);
    }
    
    
     public ArrayList<FireMan> getFireManList() {
        return fireManList;
    }

}
