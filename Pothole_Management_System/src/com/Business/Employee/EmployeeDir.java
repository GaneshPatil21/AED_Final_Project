/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Employee;

import java.util.ArrayList;


public class EmployeeDir {
    private ArrayList<Employee> empList;
    
    //create employeeDir
    
    public EmployeeDir(){
        empList=new ArrayList<>();
    }

   
    //create a new employee using this method
    public Employee createEmployee(String name){
        Employee e= new Employee();
        e.setEmployeeName(name);
        empList.add(e);
        return e;
    }
    
    
     public ArrayList<Employee> getEmpList() {
        return empList;
    }
}