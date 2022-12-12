/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.UserAccount;

import com.Business.Employee.Employee;
import com.Business.Role.Role;
import com.Business.WorkQueue.WorkQueue;


public class UserAccount {
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    
    public UserAccount(){
        workQueue = new WorkQueue();
    }
    
    //het password
    
    public String getPassword() {
        return password;
    }
    
    //set password

    public void setPassword(String password) {
        this.password = password;
    }
    
    //get username
    
    public String getUsername() {
        return username;
    }
    
    //set username

    public void setUsername(String username) {
        this.username = username;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        return role;
    }
    //set role

    public void setRole(Role role) {
        this.role = role;
    }
    
    //getWOrkQueueu

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    //set work Queueu

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    @Override
    public String toString(){
        return username;
    }
    
}
