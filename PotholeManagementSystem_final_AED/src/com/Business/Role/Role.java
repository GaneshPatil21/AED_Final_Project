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
import javax.swing.JPanel;


public abstract class Role {
    //enums for types of roles
    public enum RoleType{
        SystemAdmin("SystemAdmin"),
        VolunteerAdminRole("VolunteerAdminRole"),
        VolunteerRole("VolunteerRole"),
        GovernmentAdminRole("GovernmentAdminRole"),
        GovernmentRole("GovernmentRole"),
        EnterPriseAdminRole("EnterPriseAdminRole"),
        CommunityAdminRole("CommunityAdminRole"),
        ContractorAdminRole("CommunityAdminRole"),
        ContractorManagerRole("ContractorManagerRole"),
        SupplierAdminRole("SupplierAdminRole"),
        SupplierManagerRole("SupplierManagerRole"),
        WorkerAdminRole("WorkerAdminRole"),
        WorkerRole("WorkerRole"),
        SupplierRole("SupplierRole"),
        PoliceRole("PoliceRole"),
        PoliceAdminRole("PoliceAdminRole"),
        RoadSafetyAdminRole("RoadSafetyAdminRole"),
        RoadSafetyRole("RoadSafetyRole"),
        FireManRole("FireManRole"),
        FireManAdminRole("FireManAdminRole");
//        SystemAdmin("SystemAdmin"),
//        VictimAdmin("VictimAdmin"),
//        Victim("Victim"),
//        EventMakerAdmin("EventMakerAdmin"),
//        EventMaker("EventMaker"),
//        EnterPriseAdmin("EnterpriseAdmin"),
//        CommunityAdminRole("CommunityAdminRole"),
//        NGOAdminRole("NGOAdminRole"),
//        NGOManagerRole("NGOManagerRole"),
//        ProviderAdminRole("ProviderAdminRole"),
//        ProviderManagerRole("ProviderManagerRole"),
//        VolunteerAdminRole("VolunteerAdminRole"),
//        VolunteerRole("VolunteerRole"),
//        ProviderRole("ProviderRole"),
//        PoliceRole("PoliceRole"),
//        PoliceAdminRole("PoliceAdminRole"),
//        DoctorAdminRole("DoctorAdminRole"),
//        Doctor("Doctor"),
//        FireManRole("FireManRole"),
//        FireManAdminRole("FireManAdminRole");
        
        
        
        private String value;
        private RoleType(String value){
            this.value=value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system);
    
    
    
}
