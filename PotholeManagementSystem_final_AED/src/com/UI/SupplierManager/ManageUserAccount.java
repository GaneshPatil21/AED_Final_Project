/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UI.SupplierManager;


import com.Business.Ecosystem;
import com.Business.Employee.Employee;
import com.Business.Enterprise.Enterprise;
import com.Business.Organization.Organization;
import com.Business.Organization.SupplierOrg;
import com.Business.Supplier.Supplier;
import com.Business.Role.SupplierRole;
import com.Business.Role.Role;
import com.Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vidhi
 */
public class ManageUserAccount extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterprise
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    public ManageUserAccount(JPanel userProcessContainer,Enterprise enterprise) {
        initComponents();   
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        populateComboOrganization();
        populateData();

    }
    //populate all organizations added from directory
    public void populateComboOrganization() {
        comboOrg.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDir().getOrganizationList()) {
            comboOrg.addItem(organization);
        }
    }
    //populate respective employees
    public void populateComboEmployee(Organization organization){
        comboEmp.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDir().getEmpList()){
            comboEmp.addItem(employee);
        }
    }
    //populate respective roles
    private void populateComboRole(Enterprise e){
        comboRole.removeAllItems();
        Organization organization = (Organization) comboOrg.getSelectedItem();
        if(organization instanceof SupplierOrg){
            comboRole.addItem(new SupplierRole());
           
        }
      
    }
     //populate username and roles in table
    public void populateData() {

        DefaultTableModel model = (DefaultTableModel) tblUser.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDir().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDir().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) tblUser.getModel()).addRow(row);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnAddUser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboOrg = new javax.swing.JComboBox();
        txtPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboEmp = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage User Account");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0))
        );

        tblUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUser.setOpaque(false);
        jScrollPane1.setViewportView(tblUser);

        jPanel4.setForeground(new java.awt.Color(153, 0, 153));
        jPanel4.setOpaque(false);

        btnAddUser.setFont(new java.awt.Font("Zapf Dingbats", 0, 24)); // NOI18N
        btnAddUser.setForeground(new java.awt.Color(204, 51, 0));
        btnAddUser.setText("Add User");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Zapf Dingbats", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Username");

        txtName.setFont(new java.awt.Font("Zapf Dingbats", 0, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(204, 51, 0));

        jLabel3.setFont(new java.awt.Font("Zapf Dingbats", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 51, 0));
        jLabel3.setText("Organization");

        comboOrg.setFont(new java.awt.Font("Zapf Dingbats", 0, 18)); // NOI18N
        comboOrg.setForeground(new java.awt.Color(204, 51, 0));
        comboOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrgActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(153, 0, 153));

        lblPassword.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(204, 0, 51));
        lblPassword.setText("Password");

        jLabel4.setFont(new java.awt.Font("Zapf Dingbats", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Employee");

        comboEmp.setFont(new java.awt.Font("Zapf Dingbats", 0, 18)); // NOI18N
        comboEmp.setForeground(new java.awt.Color(204, 0, 51));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 51, 0));
        jLabel5.setText("Role");

        comboRole.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboRole.setForeground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(comboEmp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(comboOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtName))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 91, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/backButtonRegister.png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnBack))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1927, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    //add the user
    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        // TODO add your handling code here:
        if(txtName.getText().isEmpty()|| txtPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please fill the empty fields");
        }else{
            String userName = txtName.getText();
            String password = txtPassword.getText();
            if(Ecosystem.checkIfUsernameIsUnique(userName)){
                Organization organization = (Organization) comboOrg.getSelectedItem();
                Employee employee = (Employee) comboEmp.getSelectedItem();
                Role role = (Role) comboRole.getSelectedItem();
                if (organization instanceof SupplierOrg){
                    Supplier p= new Supplier();

                    p.setSupplierName(employee.getEmployeeName());
                    ((SupplierOrg) organization).getProviderList().getProviderList().add(p);

                    }
                organization.getUserAccountDir().createUserAccount(userName, password, employee, role);
                populateData();
                txtName.setText("");
                txtPassword.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "Username must be unique", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void comboOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrgActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) comboOrg.getSelectedItem();
        if (organization != null){
            populateComboEmployee(organization);
            populateComboRole(enterprise);
        }
    }//GEN-LAST:event_comboOrgActionPerformed
    //go to previous page
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox comboEmp;
    private javax.swing.JComboBox comboOrg;
    private javax.swing.JComboBox comboRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
