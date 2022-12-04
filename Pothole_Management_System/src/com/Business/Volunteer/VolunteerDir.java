/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Volunteer;

import java.util.ArrayList;

//victim
public class VolunteerDir {
    private ArrayList<Volunteer> changeSeekerDir;

    public VolunteerDir() {
        changeSeekerDir=new ArrayList<>();
        
    }

   
   
    public Volunteer addChangeSeeker(){
        Volunteer cs= new Volunteer();
        changeSeekerDir.add(cs);
        return cs;
    }
    
    
     public ArrayList<Volunteer> getChangeSeekerDir() {
        return changeSeekerDir;
    }

    public void setChangeSeekerDir(ArrayList<Volunteer> changeSeekerDir) {
        this.changeSeekerDir = changeSeekerDir;
    }
  
    public void removeChangeSeeker(Volunteer cs){
        changeSeekerDir.remove(cs);
    }
    
}
