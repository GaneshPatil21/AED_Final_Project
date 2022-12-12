/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.WorkQueue;


public class SupplierWorkReq extends WorkReq{
    private int quantity;
    private boolean add;
    private String rtype;
    private String req;

      public SupplierWorkReq() {
       
        add = false;
       
    }
      
      
       public void setAdd(boolean add) {
        this.add = add;
    }

    public String getRtype() {
        return rtype;
    }

   

    public void setReq(String req) {
        this.req = req;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
     public void setRtype(String rtype) {
        this.rtype = rtype;
    }

    public String getReq() {
        return req;
    }

    public boolean isAdd() {
        return add;
    }

   
}
