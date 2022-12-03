/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Organization;

import java.util.ArrayList;


public class OrganizationDir {
    
    private ArrayList<Organization> organizationList;
    
    public OrganizationDir()
    {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    //creates new organizations and adds them to directory
    public Organization createOrganization(Organization.Type type,String name)
    {
    Organization organization = null;
        if (type.getValue().equals(Organization.Type.EventMaker.getValue())){
            
            organization = new GovernmentOrg();
            organization.setOrgName(name);
            organizationList.add(organization);
        }
        
        
         else if (type.getValue().equals(Organization.Type.FireMan.getValue())){
            organization = new FireManOrg(name);
            organization.setOrgName(name);
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.Victim.getValue())){
            organization = new VolunteerOrg();
            organization.setOrgName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.NGO.getValue())){
            organization = new ContractorOrg();
            organization.setOrgName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Provider.getValue())){
            organization = new SupplierOrg(name);
            organization.setOrgName(name);
            organizationList.add(organization);
        }
        
        
        
        else if (type.getValue().equals(Organization.Type.Volunteer.getValue())){
            organization = new WorkerOrg(name);
            organization.setOrgName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new RoadSafetyOrg();
            organization.setOrgName(name);
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.Police.getValue())){
            organization = new PoliceOrg(name);
            organization.setOrgName(name);
            organizationList.add(organization);
        }
       
        return organization;
    }

    
}
