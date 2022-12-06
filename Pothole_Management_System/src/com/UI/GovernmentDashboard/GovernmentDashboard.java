/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UI.GovernmentDashboard;

import com.Business.Ecosystem;
import com.Business.Enterprise.Enterprise;
import com.Business.Government.Government;
import com.Business.Organization.GovernmentOrg;
import com.Business.Organization.Organization;
import com.Business.UserAccount.UserAccount;
import com.Business.WorkQueue.VolunteerWorkReq;
import com.Business.WorkQueue.WorkQueue;
import com.Business.WorkQueue.WorkReq;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;
import com.teamdev.jxbrowser.view.swing.BrowserView;

/**
 *
 * @author ymayank97
 */
public class GovernmentDashboard extends javax.swing.JPanel {

    /**
     * Creates new form GovernmentDashboard
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private Ecosystem system;
    Government em;
    Browser browser;
    public GovernmentDashboard(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.organization=organization;
        this.enterprise=enterprise;
        this.system=system;
        
        for (Government eventmaker : ((GovernmentOrg)organization).getChangemakerlist().getChangeMakerDirectory()) {
            if (account.getEmployee().getEmployeeName().equals(eventmaker.getName())) {
                 em=eventmaker;
            }
        }
        if (em.getWorkQueue() == null) {
            WorkQueue w = new WorkQueue();
            em.setWorkQueue(w);
        }
        
        populateTableWorkQueue();
    }
    //populate all the requests from victim work request queue
    public void populateTableWorkQueue(){
         DefaultTableModel model = (DefaultTableModel) tblEvent.getModel();
        
        model.setRowCount(0);
        
        for (WorkReq work : system.getWorkQueue().getWorkRequestList()){
           if(work instanceof VolunteerWorkReq){ 
            Object[] row = new Object[10];
            row[0] = work.getSender().getEmployee().getEmployeeName();
            row[1] = work.getSubject();
            row[2] = ((VolunteerWorkReq) work).getDescription();
            row[3] = ((VolunteerWorkReq) work).getLocation();
            row[4] = work.getRequestDate();
            row[5] = work;
            row[6] = work.getReciever();
            
            model.addRow(row);
           }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnAssignTo = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        txtSubject = new javax.swing.JTextField();
        txtLoc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnViewMap = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEvent = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnPolice = new javax.swing.JButton();
        btnHealth = new javax.swing.JButton();
        btnFire = new javax.swing.JButton();
        btnNGO = new javax.swing.JButton();
        displayImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(113, 88, 205));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Event Maker Work Area");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0))
        );

        add(jPanel1);

        btnView.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        btnView.setForeground(new java.awt.Color(153, 0, 153));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView);

        btnAssignTo.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        btnAssignTo.setForeground(new java.awt.Color(153, 0, 153));
        btnAssignTo.setText("Acknowledge");
        btnAssignTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToActionPerformed(evt);
            }
        });
        add(btnAssignTo);

        btnComplete.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        btnComplete.setForeground(new java.awt.Color(153, 0, 153));
        btnComplete.setText("Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });
        add(btnComplete);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "View", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 24), new java.awt.Color(153, 0, 153))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Location");

        txtDesc.setEditable(false);
        txtDesc.setColumns(20);
        txtDesc.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtDesc.setRows(5);
        jScrollPane2.setViewportView(txtDesc);

        txtSubject.setEditable(false);
        txtSubject.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        txtSubject.setForeground(new java.awt.Color(153, 0, 153));

        txtLoc.setEditable(false);
        txtLoc.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        txtLoc.setForeground(new java.awt.Color(153, 0, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Subject");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Description");

        btnViewMap.setText("view");
        btnViewMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSubject)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewMap, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnViewMap, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        add(jPanel2);

        tblEvent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblEvent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Event Name", "Subject", "Description", "Location", "Date", "Status", "Event Maker"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEvent);

        add(jScrollPane1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Relay Request To", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 24), new java.awt.Color(153, 0, 153))); // NOI18N
        jPanel4.setOpaque(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Emergency Services", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 24), new java.awt.Color(153, 0, 153))); // NOI18N
        jPanel3.setOpaque(false);

        btnPolice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPolice.setForeground(new java.awt.Color(153, 0, 153));
        btnPolice.setText("Police Department");
        btnPolice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoliceActionPerformed(evt);
            }
        });

        btnHealth.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnHealth.setForeground(new java.awt.Color(153, 0, 153));
        btnHealth.setText("Health Department");
        btnHealth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHealthActionPerformed(evt);
            }
        });

        btnFire.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnFire.setForeground(new java.awt.Color(153, 0, 153));
        btnFire.setText("Fire Department");
        btnFire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFireActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPolice, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFire, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPolice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnFire, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnNGO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNGO.setForeground(new java.awt.Color(153, 0, 153));
        btnNGO.setText("NGO");
        btnNGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNGOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnNGO, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNGO, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel4);
        add(displayImage);
    }// </editor-fold>//GEN-END:initComponents
    //assign the request to me
    private void btnAssignToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEvent.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "To allocate the account, please choose the row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            VolunteerWorkReq cswr = (VolunteerWorkReq) tblEvent.getValueAt(selectedRow, 5);
            
            if(cswr.getStatus().equalsIgnoreCase("Requested")){

            cswr.setStatus("Pending");
            cswr.setReciever(account);

            populateTableWorkQueue();
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong Request", "Warning", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnAssignToActionPerformed
    //view the request 
    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEvent.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "To allocate the account, please choose the row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            
            
            VolunteerWorkReq p = (VolunteerWorkReq) tblEvent.getValueAt(selectedRow, 5);
            
            txtSubject.setText(p.getSubject());
            txtDesc.setText(p.getDescription());
            txtLoc.setText(p.getLocation());
            displayImage.setIcon(p.getImageIcon());
        }
    }//GEN-LAST:event_btnViewActionPerformed
    //complete the assigned request
    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEvent.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "To allocate the account, please choose the row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            VolunteerWorkReq p = (VolunteerWorkReq) tblEvent.getValueAt(selectedRow, 5);
           
            if(p.getStatus().equalsIgnoreCase("Pending")){


                    p.setStatus("Complete");
                    JOptionPane.showMessageDialog(null, "You have completed the request successfully");
                    populateTableWorkQueue();
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong Request", "Warning", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnCompleteActionPerformed
    //assign request to NGO
    private void btnNGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNGOActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblEvent.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please choose the row to forward request to the NGO", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            

            VolunteerWorkReq cswr = (VolunteerWorkReq) tblEvent.getValueAt(selectedRow, 5);
            //if(cswr.getStatus().equalsIgnoreCase("Requested")){
            
            if(cswr.getStatusList().contains("Contractor")) {
                JOptionPane.showMessageDialog(null, "Already assigned to Contractor", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            if(!cswr.getStatus().equalsIgnoreCase("Completed")){
            cswr.setStatus("Assigned To Contractor");
            ArrayList<String> tempList = cswr.getStatusList();
            
            tempList.add("Contractor");
            cswr.setStatusList(tempList);
            populateTableWorkQueue();
            }
            else{
                JOptionPane.showMessageDialog(null, "Already Completed", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_btnNGOActionPerformed
    //assign request to healthcare
    private void btnHealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHealthActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEvent.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please choose the row to forward request to the Doctor", "Warning", JOptionPane.WARNING_MESSAGE);
        } else{
            
            VolunteerWorkReq cswr = (VolunteerWorkReq) tblEvent.getValueAt(selectedRow, 5);
            if(cswr.getStatus().equals("Assigned To Road Safety Department") || cswr.getStatusList().contains("RoadSafety")){
                JOptionPane.showMessageDialog(null, "This request is already assigned to Road Safety Department", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
            else{
                
            if(!cswr.getStatus().equalsIgnoreCase("Completed")){
            JOptionPane.showMessageDialog(null, "Assigned to Road Safety Department");
            cswr.setStatus("Assigned To Road Safety Department");
            ArrayList<String> tempList = cswr.getStatusList();
            tempList.add("RoadSafety");
            cswr.setStatusList(tempList);
            populateTableWorkQueue();
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong Request", "Warning", JOptionPane.WARNING_MESSAGE);
            }
    } 
        }
    }//GEN-LAST:event_btnHealthActionPerformed
    //assign request to police
    private void btnPoliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoliceActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEvent.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please choose the row to forward request to the Police", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            VolunteerWorkReq cswr = (VolunteerWorkReq) tblEvent.getValueAt(selectedRow, 5);
            if(cswr.getStatus().equals("Assigned to the Police") || cswr.getStatusList().contains("Police")){
                JOptionPane.showMessageDialog(null, "This request is already assigned to Police", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
               if(!cswr.getStatus().equalsIgnoreCase("Completed")){ 
            JOptionPane.showMessageDialog(null, "Assigned to the Police", "Warning", JOptionPane.WARNING_MESSAGE);
            cswr.setStatus("Assigned To Police");
            ArrayList<String> tempList = cswr.getStatusList();
            tempList.add("Police");
            cswr.setStatusList(tempList);
            populateTableWorkQueue();
            }
               else{
                   JOptionPane.showMessageDialog(null, "Wrong Request", "Warning", JOptionPane.WARNING_MESSAGE);
               }
            }
            
        }
    }//GEN-LAST:event_btnPoliceActionPerformed
    //assign request to fire department
    private void btnFireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFireActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEvent.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please choose the row to forward request to the FireMan", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            VolunteerWorkReq cswr = (VolunteerWorkReq) tblEvent.getValueAt(selectedRow, 5);
            if(cswr.getStatus().equals("Assigned to the FireMan") || cswr.getStatusList().contains("FireMan")){
                JOptionPane.showMessageDialog(null, "This request is already assigned to Fire Man", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
                if(!cswr.getStatus().equalsIgnoreCase("Completed")){ 
                   
                JOptionPane.showMessageDialog(null, "Assigned to the FireMan", "Warning", JOptionPane.WARNING_MESSAGE);
                cswr.setStatus("Assigned To FireMan");
                ArrayList<String> tempList = cswr.getStatusList();
                tempList.add("FireMan");
                cswr.setStatusList(tempList);
                populateTableWorkQueue();
            }
                else{
                     JOptionPane.showMessageDialog(null, "Wrong Request", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnFireActionPerformed

    private void btnViewMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMapActionPerformed
         if(!txtLoc.getText().isEmpty())
        {
        EngineOptions options =
                EngineOptions.newBuilder(HARDWARE_ACCELERATED).licenseKey("6P830J66YBX6CYSF5CI0H165KTZQ2P2ZJX9TV55F30X4I1I6WQQ8JP2D21LYG0LUXGJB").build();
        Engine engine = Engine.newInstance(options);
        browser = engine.newBrowser();
        BrowserView view = BrowserView.newInstance(browser);
        browser.navigation().loadUrl("https://www.google.com/maps/search/"+txtLoc.getText()+"/@"+txtLoc.getText());
        
        JFrame mapsPanel = new JFrame();
        
        mapsPanel.add(view);
        
        mapsPanel.setVisible(true);
        }
        else {
                                 JOptionPane.showMessageDialog(null, "Please select a location first", "Warning", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_btnViewMapActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignTo;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnFire;
    private javax.swing.JButton btnHealth;
    private javax.swing.JButton btnNGO;
    private javax.swing.JButton btnPolice;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnViewMap;
    private javax.swing.JLabel displayImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEvent;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtLoc;
    private javax.swing.JTextField txtSubject;
    // End of variables declaration//GEN-END:variables
}
