/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Role;

import com.Business.Ecosystem;
import com.Business.Enterprise.Enterprise;
import com.Business.Organization.Organization;
import com.Business.Organization.WorkerOrg;
import com.Business.UserAccount.UserAccount;
import com.UI.WorkerOrganization.WorkerDashboard;
import javax.swing.JPanel;


public class WorkerRole extends Role{
    //overriding main panel with volunteer work area whenever volunteer role is called
        @Override
        public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system)
        {
            return new WorkerDashboard(userProcessContainer,account,(WorkerOrg)organization,enterprise,system);
        }   
        @Override
        public String toString()
{
   return Role.RoleType.VolunteerRole.getValue();
}
}
