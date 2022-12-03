/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Organization;

import com.Business.Employee.EmployeeDir;
import com.Business.Role.Role;
import com.Business.UserAccount.UserAccountDir;
import com.Business.WorkQueue.WorkQueue;
import java.util.HashSet;




public abstract class Organization {
    
    private String name;
    private String orgName;
    private WorkQueue workQueue;
    private EmployeeDir employeeDir;
    private UserAccountDir userAccountDir;
    private int organizationCode;
    private static int count=1;
    public HashSet<Role> role;
    //enums for types of organization
    public enum Type {
        Victim("Victim Organization"),
        EventMaker("EventMaker Organization"),
        Volunteer("Volunteer Organization"),
        NGO("NGO Organization"),
        Provider("Provider"),
        Doctor("Doctor"),
        Police("Police"),
        FireMan("FireMan");
        
        private String value;
        private Type(String value){
            this.value = value;
        }
        public String getValue(){
            return value;
        }
    }
    //constructor to update work queues, employee directory and user account
    public Organization (String name)
    {
      this.name = name;
      workQueue = new WorkQueue();
      employeeDir = new EmployeeDir();
      userAccountDir = new UserAccountDir();
     
      organizationCode = count;
      role = new HashSet<>();
      ++count;        
    }

    
    //getSupported role
    public abstract HashSet<Role> getSupportedRole();


    public void setUserAccountDir(UserAccountDir userAccountDir) {
        this.userAccountDir = userAccountDir;
    }
    
    

    //get USeraccount directory
    public UserAccountDir getUserAccountDir() {
        return userAccountDir;
    }
    
    //get Employeee Directory
     public EmployeeDir getEmployeeDir() {
        return employeeDir;
    }

    public void setEmployeeDir(EmployeeDir employeeDir) {
        this.employeeDir = employeeDir;
    }
    
     public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public String getName() {
        return name;
    }
    
    public int getOrganizationCode() {
        return organizationCode;
    }
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

   
    //setName
    public void setName(String name) {
        this.name = name;
    }
    
    public String getOrgName() {
        return orgName;
    }
    //setOrgaNAme
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    
    @Override
    public String toString()
    {
        return name;
    }
}











