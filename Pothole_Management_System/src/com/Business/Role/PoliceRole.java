/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Role;

import com.Business.Ecosystem;
import com.Business.Enterprise.Enterprise;
import com.Business.Organization.Organization;
import com.Business.Organization.PoliceOrg;
import com.Business.UserAccount.UserAccount;
import com.UI.PoliceDashboard.PoliceDashboard;
import javax.swing.JPanel;


public class PoliceRole extends Role{
    //overriding main panel with police work area whenever police role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system){
        return new PoliceDashboard(userProcessContainer,account,(PoliceOrg)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.PoliceRole.getValue();
}

}
