/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.WorkQueue;

import com.Business.Government.Government;
import com.Business.FireMan.FireMan;
import com.Business.Contractor.Contractor;
import com.Business.Police.Police;
import com.Business.Supplier.Item;
import com.Business.Supplier.Supplier;
import com.Business.UserAccount.UserAccount;
import com.Business.Volunteer.Volunteer;
import com.Business.Worker.Worker;
import java.util.ArrayList;
import java.util.Date;


public abstract class WorkReq {
    private String subject;
    private UserAccount sender;
    private UserAccount reciever;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private Government eventMaker;
    private Volunteer changeSeeker;
    private Contractor ngo;
    private Supplier provider;
    private Item item;
    private Worker volunteer;
    private Police police;
    private FireMan fireman;
    private ArrayList<String> statusList; 

    
    
    public FireMan getFireman() {
        return fireman;
    }

    public void setFireman(FireMan fireman) {
        this.fireman = fireman;
    }


    
    public WorkReq(){
        requestDate = new Date();
        this.statusList = new ArrayList<>();
    }
    
    public Police getPolice() {
        return police;
    }

    public void setPolice(Police police) {
        this.police = police;
    }

   

    
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
     


    
    public String getSubject() {
        return subject;
    }
    
     public Worker getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Worker volunteer) {
        this.volunteer = volunteer;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public UserAccount getSender() {
        return sender;
    }
    
    
     public Contractor getNgo() {
        return ngo;
    }

    public void setNgo(Contractor ngo) {
        this.ngo = ngo;
    }

    

    public void setReciever(UserAccount reciever) {
        this.reciever = reciever;
    }

    public String getStatus() {
        return status;
    }

    public Supplier getProvider() {
        return provider;
    }

    public void setProvider(Supplier provider) {
        this.provider = provider;
    }

    
    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }
    
    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReciever() {
        return reciever;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    

    public Government getEventMaker() {
        return eventMaker;
    }

    public void setEventMaker(Government eventMaker) {
        this.eventMaker = eventMaker;
    }

    public Volunteer getChangeSeeker() {
        return changeSeeker;
    }

    public void setChangeSeeker(Volunteer changeSeeker) {
        this.changeSeeker = changeSeeker;
    }
    
    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

   
    public ArrayList<String> getStatusList() {
        return statusList;
    }

    public void setStatusList(ArrayList<String> statusList) {
        this.statusList = statusList;
    }

    @Override
    public String toString(){
        return status;
    }
}

