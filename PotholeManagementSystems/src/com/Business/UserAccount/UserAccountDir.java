/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.UserAccount;

import com.Business.Employee.Employee;
import com.Business.Role.Role;
import java.util.ArrayList;


public class UserAccountDir {
    
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDir(){
        userAccountList=new ArrayList<>();
        
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
 //check a year
    public UserAccount authenticateUser(String username, String password){
        for(UserAccount ua:userAccountList){
            if(ua.getUsername().equals(username)&& ua.getPassword().equals(password)){
                return ua;
            }
        }
        return null;
    }
 //create userAccount 
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
   
    public boolean checkIfUsernameIsUnique(String username){
        for(UserAccount ua: userAccountList)
            if(ua.getUsername().equals(username)){
                return false;
            }
        return true;
    }
    
}
