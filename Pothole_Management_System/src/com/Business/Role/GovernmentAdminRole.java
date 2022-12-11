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
import com.UI.Government.GovernmentAdminDashboard;
import javax.swing.JPanel;


public class GovernmentAdminRole extends Role{
    //overriding main panel with event maker admin work area whenever event maker admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system){
        return new GovernmentAdminDashboard(userProcessContainer,/*account,(ChangeMakerOrganization)organization,*/enterprise/*,system*/);
    }
        @Override
        public String toString()
{
   return Role.RoleType.EventMakerAdmin.getValue();
}

}
