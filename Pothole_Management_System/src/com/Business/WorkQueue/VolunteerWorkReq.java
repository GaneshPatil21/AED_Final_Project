/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.WorkQueue;

import javax.swing.ImageIcon;

/**
 *
 * @author vidhi
 */
public class VolunteerWorkReq extends WorkReq{
    private String Description;
    private String Location;
    private boolean add;
    private ImageIcon imageIcon;
    
    
    public VolunteerWorkReq() {
        
        add = false;
    }

    public String getDescription() {
        return Description;
    }

   

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }
    
    
     public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getLocation() {
        return Location;
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }
    
    
    
}
