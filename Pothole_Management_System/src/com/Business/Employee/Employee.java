/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Employee;


public class Employee {
 
    private String employeeName;
    private int employeeId;
    private static int count=1;
    //counter to count number of employees
    public Employee(){
        employeeId=count;
        count++;
    }
  
    
}