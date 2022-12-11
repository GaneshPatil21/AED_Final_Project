/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Role;

import com.Business.Ecosystem;
import com.Business.Enterprise.Enterprise;
import com.Business.Organization.Organization;
import com.Business.UserAccount.UserAccount;
import com.UI.SystemAdmin.SystemAdminDashboard;
import javax.swing.JPanel;


public class SystemAdminRole extends Role {
    //overriding main panel with system admin work area whenever system admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system){
       return new SystemAdminDashboard(userProcessContainer,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.SystemAdmin.getValue();
}
}

