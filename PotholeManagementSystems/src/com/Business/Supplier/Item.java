/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Supplier;


public class Item {
    private String itemId;
    private static int sCount=1;
    private int quantity;
    private String requirementType;
    private String requirement;
    //item class constructor to autogenerate id
    public Item(){
        itemId="Item"+(+sCount);        
    }
//get item quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getItemId() {
        return itemId;
    }

   //set requirement of items

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }
    
    //get requirement of items
    
    public String getRequirementType() {
        return requirementType;
    }

    public void setRequirementType(String requirementType) {
        this.requirementType = requirementType;
    }
    
    
     public void setItemId(String itemId) {
        this.itemId = itemId;
    }
    
    public String getRequirement() {
        return requirement;
    }
    
    @Override
    public String toString(){
        return getRequirementType();
    }
    
}
