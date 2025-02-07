import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class LibrarianJFrame1 extends javax.swing.JFrame {

    public LibrarianJFrame1() {
    initComponents();
    Connect(); // Fixed method name
    LibData();
}

    
    
    Connection con;
    PreparedStatement pst;
    
    
    private void LibData(){
    
         try {
        // Get the table model
        DefaultTableModel df = (DefaultTableModel) table5.getModel();
        // Clear existing rows
        df.setRowCount(0);
        
        // Prepare and execute SQL query
        String sql = "SELECT * FROM librarian";
        pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        
        // Add rows to table
        while(rs.next()) {
            Vector v = new Vector();
            v.add(rs.getString("lid"));
            v.add(rs.getString("name"));
            v.add(rs.getString("email"));
            v.add(rs.getString("address"));
            df.addRow(v);
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(LibrarianJFrame1.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table5 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLId = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        txtLEmail = new javax.swing.JTextField();
        txtLAddress = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Librarian");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        table5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LId", "Name", "Email", "Address"
            }
        ));
        jScrollPane1.setViewportView(table5);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("LId");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Address");

        txtLId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLIdActionPerformed(evt);
            }
        });

        txtLName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLNameActionPerformed(evt);
            }
        });

        txtLEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLEmailActionPerformed(evt);
            }
        });

        txtLAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLAddressActionPerformed(evt);
            }
        });

        btnInsert.setBackground(new java.awt.Color(255, 204, 102));
        btnInsert.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 204, 102));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 204, 102));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\sheha\\OneDrive\\Desktop\\EAD CW\\LibraryManagement\\src\\image\\librarian.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                    .addComponent(txtLName)
                                    .addComponent(txtLId)
                                    .addComponent(txtLAddress)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(btnDelete)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtLEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtLAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtLId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        try {
        // Get values from text fields and trim whitespace
        String lid = txtLId.getText().trim();
        String name = txtLName.getText().trim();
        String email = txtLEmail.getText().trim();
        String address = txtLAddress.getText().trim();
        
        // Input validation
        if (lid.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Librarian ID is required", "Validation Error", JOptionPane.WARNING_MESSAGE);
            txtLId.requestFocus();
            return;
        }
        
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Librarian  name is required", "Validation Error", JOptionPane.WARNING_MESSAGE);
            txtLName.requestFocus();
            return;
        }
        
        // Basic email validation
        if (email.isEmpty() || !email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address", "Validation Error", JOptionPane.WARNING_MESSAGE);
            txtLEmail.requestFocus();
            return;
        }
        
        // Check if connection is valid
        if (con == null || con.isClosed()) {
            JOptionPane.showMessageDialog(this, "Database connection is not available", "Connection Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if student ID already exists
        PreparedStatement checkStmt = con.prepareStatement("SELECT lid FROM librarian WHERE lid = ?");
        checkStmt.setString(1, lid);
        ResultSet rs = checkStmt.executeQuery();
        
        if (rs.next()) {
            JOptionPane.showMessageDialog(this, "Librarian  ID already exists", "Insert Error", JOptionPane.ERROR_MESSAGE);
            txtLId.requestFocus();
            return;
        }
        
        // Prepare and execute insert statement
        pst = con.prepareStatement("INSERT INTO librarian (lid, name, email, address) VALUES (?, ?, ?, ?)");
        
        pst.setString(1, lid);
        pst.setString(2, name);
        pst.setString(3, email);
        pst.setString(4, address);
    
        int rowsAffected = pst.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Record Inserted Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            LibData(); 
            clearFields();  
        } else {
            JOptionPane.showMessageDialog(this, "Failed to insert record", "Insert Error", JOptionPane.WARNING_MESSAGE);
        }
        
    } catch (SQLException ex) {
        String errorMessage = "Error inserting record: " + ex.getMessage();
        JOptionPane.showMessageDialog(this, errorMessage, "Database Error", JOptionPane.ERROR_MESSAGE);
        Logger.getLogger(LibrarianJFrame1.class.getName()).log(Level.SEVERE, errorMessage, ex);
    } finally {
        try {
            if (pst != null) {
                pst.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibrarianJFrame1.class.getName()).log(Level.SEVERE, "Error closing statement", ex);
        }
    }
}


private void clearFields() {
    txtLId.setText("");
    txtLName.setText("");
    txtLEmail.setText("");
    txtLAddress.setText("");
    txtLId.requestFocus();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
        
        String lid = txtLId.getText().trim();
        String name = txtLName.getText().trim();
        String email = txtLEmail.getText().trim();
        String address = txtLAddress.getText().trim();
        
       
        if (lid.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Librarian  ID is required", "Validation Error", JOptionPane.WARNING_MESSAGE);
            txtLId.requestFocus();
            return;
        }
        
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Librarian  name is required", "Validation Error", JOptionPane.WARNING_MESSAGE);
            txtLName.requestFocus();
            return;
        }
        
        // Basic email validation
        if (email.isEmpty() || !email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address", "Validation Error", JOptionPane.WARNING_MESSAGE);
            txtLEmail.requestFocus();
            return;
        }
        
        // Check if connection is valid
        if (con == null || con.isClosed()) {
            JOptionPane.showMessageDialog(this, "Database connection is not available", "Connection Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // First check if the record exists
        PreparedStatement checkStmt = con.prepareStatement("SELECT lid FROM librarian  WHERE lid = ?");
        checkStmt.setString(1, lid);
        ResultSet rs = checkStmt.executeQuery();
        
        if (!rs.next()) {
            JOptionPane.showMessageDialog(this, "Librarian  ID does not exist", "Update Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Prepare and execute update statement
        pst = con.prepareStatement("UPDATE librarian SET name = ?, email = ?, address = ? WHERE lid = ?");
        
        pst.setString(1, name);
        pst.setString(2, email);
        pst.setString(3, address);
        pst.setString(4, lid);
        
        int rowsAffected = pst.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Record Updated Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            LibData(); 
            clearFields();  
        } else {
            JOptionPane.showMessageDialog(this, "No records were updated", "Update Error", JOptionPane.WARNING_MESSAGE);
        }
        
    } catch (SQLException ex) {
        String errorMessage = "Error updating record: " + ex.getMessage();
        JOptionPane.showMessageDialog(this, errorMessage, "Database Error", JOptionPane.ERROR_MESSAGE);
        Logger.getLogger(LibrarianJFrame1.class.getName()).log(Level.SEVERE, errorMessage, ex);
    } finally {
        try {
            if (pst != null) {
                pst.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibrarianJFrame1.class.getName()).log(Level.SEVERE, "Error closing statement", ex);
        }
    }

   

            
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String lid = txtLId.getText();
            pst=con.prepareStatement("DELETE FROM librarian  WHERE lid=?");
            
            pst.setString(1,lid);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Deleted Successfully");
            LibData();
            
        } catch (SQLException ex) {
            Logger.getLogger(LibrarianJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtLEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLEmailActionPerformed
        // TODO add your handling code here:
        txtLAddress.requestFocus(); 
    }//GEN-LAST:event_txtLEmailActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                                                 
       dispose();
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtLIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLIdActionPerformed
        // TODO add your handling code here:
        txtLName.requestFocus();
    }//GEN-LAST:event_txtLIdActionPerformed

    private void txtLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLNameActionPerformed
        // TODO add your handling code here:
        txtLEmail.requestFocus(); 
    }//GEN-LAST:event_txtLNameActionPerformed

    private void txtLAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLAddressActionPerformed
        // TODO add your handling code here:
         btnInsert.requestFocus();
    }//GEN-LAST:event_txtLAddressActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table5;
    private javax.swing.JTextField txtLAddress;
    private javax.swing.JTextField txtLEmail;
    private javax.swing.JTextField txtLId;
    private javax.swing.JTextField txtLName;
    // End of variables declaration//GEN-END:variables

  private void Connect() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL JDBC Driver
        con = DriverManager.getConnection("jdbc:mysql://localhost/librarydb", "root", ""); // Database URL, Username, Password
        System.out.println("Database Connected Successfully!");
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(LibrarianJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Database Connection Failed!", "Error", JOptionPane.ERROR_MESSAGE);
     } catch(SQLException ex)  {
         Logger.getLogger(LibrarianJFrame1.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}

