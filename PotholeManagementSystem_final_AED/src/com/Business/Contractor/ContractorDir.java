/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Contractor;

import java.util.ArrayList;


public class ContractorDir {
    private ArrayList<Contractor> ngoDirectory;

    public ContractorDir() {
    ngoDirectory= new ArrayList<>();
    }
    
    //get Contractor directory

    public ArrayList<Contractor> getNgoDirectory() {
        return ngoDirectory;
    }

    public void setNgoDirectory(ArrayList<Contractor> ngoDirectory) {
        this.ngoDirectory = ngoDirectory;
    }
    //add a Contractor
    
    //remove a Contractor
    public void removeNGO(Contractor ngo){
        ngoDirectory.remove(ngo);   
    }
    
    public Contractor addNGO(){
        Contractor ngo =new Contractor();
        ngoDirectory.add(ngo);
        return ngo;
    }
}
