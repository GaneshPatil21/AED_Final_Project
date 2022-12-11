/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Supplier;

import java.util.ArrayList;


public class ItemDir {
    private ArrayList<Item> itemList;
    
    public ItemDir() {
        itemList=new ArrayList<>();
        
    }

   

    public void setSupplyList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }
    //add a new item
    public Item addSupply(){
        Item s = new Item();
        itemList.add(s);
        return s;
    }
    
    
     public ArrayList<Item> getSupplyList() {
        return itemList;
    }
   
    public void removeSupply(Item item){
        itemList.remove(item);
    }
    
}
