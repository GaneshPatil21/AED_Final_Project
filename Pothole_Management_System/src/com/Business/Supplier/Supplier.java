/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Supplier;

import com.Business.WorkQueue.WorkQueue;


public class Supplier {
    private String supplierName;
    private static int sCount=1;
    private String supplierId;
    private WorkQueue workQueue;
    private ItemDir itemDir;
    private Item item;
    //provider class constructor to update ids, work queue and item directory
    public Supplier() {
        
        supplierId = "SUP"+(++sCount);
        workQueue= new WorkQueue();
        itemDir = new ItemDir();
        item = new Item();
    }
    
    public Item getItem() {
        return item;
    }

   

    public void setItemDir(ItemDir itemDir) {
        this.itemDir = itemDir;
    }
    
     public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public String getSupplierId() {
        return supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    //get work queueu
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

   

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }
    
    
     public void setItem(Item item) {
        this.item = item;
    }
    
    public ItemDir getItemDir() {
        return itemDir;
    }
    
    //get item direcory

    @Override
    public String toString(){
        return supplierName;
    }
}
