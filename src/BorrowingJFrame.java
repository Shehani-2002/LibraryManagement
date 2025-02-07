import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class BorrowingJFrame extends javax.swing.JFrame {

    public BorrowingJFrame() {
    initComponents();
    Connect(); 
    BorrowData();
}

    
    
    Connection con;
    PreparedStatement pst;
    
    
    private void BorrowData(){
    
         try {
        // Get the table model
        DefaultTableModel df = (DefaultTableModel) table6.getModel();
        // Clear existing rows
        df.setRowCount(0);
        
        // Prepare and execute SQL query
        String sql = "SELECT * FROM borrow";
        pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        
        // Add rows to table
        while(rs.next()) {
            Vector v = new Vector();
            v.add(rs.getString("bookid"));
            v.add(rs.getString("studentname"));
            v.add(rs.getString("email"));
            v.add(rs.getString("date_borrowed"));
            v.add(rs.getString("date_return"));
            df.addRow(v);
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(BorrowingJFrame.class.getName()).log(Level.SEVERE, null, ex);
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
        table6 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtDateBorrow = new javax.swing.JTextField();
        txtDateReturn = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Borrowing");

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

        table6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookId", "StudentName", "Email", "Date_Borrowed", "Date_Return"
            }
        ));
        jScrollPane1.setViewportView(table6);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("BookId");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("StudentName");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Date_Borrowed");

        txtBId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBIdActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Date_Return");

        txtDateReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 159, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDateReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(86, 86, 86)
                        .addComponent(txtBId, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(txtDateBorrow))))
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addComponent(txtDateBorrow))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDateReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        try {
        // Get values from text fields and trim whitespace
        String bookid = txtBId.getText().trim();
        String studentname = txtName.getText().trim();
        String email = txtEmail.getText().trim();
        String date_borrowed = txtDateBorrow.getText().trim();
        String date_return = txtDateReturn.getText().trim();
        
        // Input validation
        if (bookid.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Book ID is required", "Validation Error", JOptionPane.WARNING_MESSAGE);
            txtBId.requestFocus();
            return;
        }
        
        if (studentname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student name is required", "Validation Error", JOptionPane.WARNING_MESSAGE);
            txtName.requestFocus();
            return;
        }
        
        // Basic email validation
        if (email.isEmpty() || !email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address", "Validation Error", JOptionPane.WARNING_MESSAGE);
            txtEmail.requestFocus();
            return;
        }
        if (date_borrowed.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Date of borrowed is required", "Validation Error", JOptionPane.WARNING_MESSAGE);
            txtName.requestFocus();
            return;
        }
        if (date_return.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Date of return is required", "Validation Error", JOptionPane.WARNING_MESSAGE);
            txtName.requestFocus();
            return;
        }
        
        // Check if connection is valid
        if (con == null || con.isClosed()) {
            JOptionPane.showMessageDialog(this, "Database connection is not available", "Connection Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if student ID already exists
        PreparedStatement checkStmt = con.prepareStatement("SELECT bookid FROM borrow WHERE bookid = ?");
        checkStmt.setString(1, bookid);
        ResultSet rs = checkStmt.executeQuery();
        
        if (rs.next()) {
            JOptionPane.showMessageDialog(this, "Bookt ID already exists", "Insert Error", JOptionPane.ERROR_MESSAGE);
            txtBId.requestFocus();
            return;
        }
        
        // Prepare and execute insert statement
        pst = con.prepareStatement("INSERT INTO borrow (bookid, studentname, email, date_borrowed,date_return) VALUES (?, ?, ?, ?)");
        
        pst.setString(1, bookid);
        pst.setString(2, studentname);
        pst.setString(3, email);
        pst.setString(4, date_borrowed);
        pst.setString(5, date_return);
    
        int rowsAffected = pst.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Record Inserted Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            BorrowData();  
            clearFields();  
        } else {
            JOptionPane.showMessageDialog(this, "Failed to insert record", "Insert Error", JOptionPane.WARNING_MESSAGE);
        }
        
    } catch (SQLException ex) {
        String errorMessage = "Error inserting record: " + ex.getMessage();
        JOptionPane.showMessageDialog(this, errorMessage, "Database Error", JOptionPane.ERROR_MESSAGE);
        Logger.getLogger(StudentJFrame.class.getName()).log(Level.SEVERE, errorMessage, ex);
    } finally {
        try {
            if (pst != null) {
                pst.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentJFrame.class.getName()).log(Level.SEVERE, "Error closing statement", ex);
        }
    }
        
        
}

// Helper method to clear input fields
private void clearFields() {
    txtBId.setText("");
    txtName.setText("");
    txtEmail.setText("");
    txtDateBorrow.setText("");
    txtDateBorrow.setText("");
    txtBId.requestFocus();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
        // Get values from text fields and trim whitespace
        String bookid = txtBId.getText().trim();
        String studentname = txtName.getText().trim();
        String email = txtEmail.getText().trim();
        String date_borrowed = txtDateBorrow.getText().trim();
        String date_return = txtDateReturn.getText().trim();
        
        // Input validation
        if (bookid.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Book ID is required", "Validation Error", JOptionPane.WARNING_MESSAGE);
            txtBId.requestFocus();
            return;
        }
        
        if (studentname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student name is required", "Validation Error", JOptionPane.WARNING_MESSAGE);
            txtName.requestFocus();
            return;
        }
        if (date_borrowed.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Date of borrowed is required", "Validation Error", JOptionPane.WARNING_MESSAGE);
            txtName.requestFocus();
            return;
        }
        if (date_return.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Date of return is required", "Validation Error", JOptionPane.WARNING_MESSAGE);
            txtName.requestFocus();
            return;
        }
        
        // Basic email validation
        if (email.isEmpty() || !email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address", "Validation Error", JOptionPane.WARNING_MESSAGE);
            txtEmail.requestFocus();
            return;
        }
        
        // Check if connection is valid
        if (con == null || con.isClosed()) {
            JOptionPane.showMessageDialog(this, "Database connection is not available", "Connection Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // First check if the record exists
        PreparedStatement checkStmt = con.prepareStatement("SELECT bookid FROM borrow WHERE bookid = ?");
        checkStmt.setString(1, bookid);
        ResultSet rs = checkStmt.executeQuery();
        
        if (!rs.next()) {
            JOptionPane.showMessageDialog(this, "Book ID does not exist", "Update Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Prepare and execute update statement
        pst = con.prepareStatement("UPDATE borrow SET studentname = ?, email = ?, date_borrowed = ? ,date_return = ?  WHERE bookid = ?");
        
        pst.setString(1, studentname);
        pst.setString(2, email);
        pst.setString(3,  date_borrowed);
        pst.setString(4,  date_return);
        pst.setString(5, bookid);
        
        int rowsAffected = pst.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Record Updated Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            BorrowData();  
            clearFields();  
        } else {
            JOptionPane.showMessageDialog(this, "No records were updated", "Update Error", JOptionPane.WARNING_MESSAGE);
        }
        
    } catch (SQLException ex) {
        String errorMessage = "Error updating record: " + ex.getMessage();
        JOptionPane.showMessageDialog(this, errorMessage, "Database Error", JOptionPane.ERROR_MESSAGE);
        Logger.getLogger(BorrowingJFrame.class.getName()).log(Level.SEVERE, errorMessage, ex);
    } finally {
        try {
            if (pst != null) {
                pst.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(BorrowingJFrame.class.getName()).log(Level.SEVERE, "Error closing statement", ex);
        }
    }

   

            
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String bookid = txtBId.getText();
            pst=con.prepareStatement("DELETE FROM borrow WHERE bookid=?");
            
            pst.setString(1,bookid);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Deleted Successfully");
            BorrowData();
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
        txtEmail.requestFocus(); 
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                                                 
       dispose();
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtBIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBIdActionPerformed
        // TODO add your handling code here:
        txtName.requestFocus();
    }//GEN-LAST:event_txtBIdActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
        txtEmail.requestFocus(); 
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtDateReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateReturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateReturnActionPerformed

   
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table6;
    private javax.swing.JTextField txtBId;
    private javax.swing.JTextField txtDateBorrow;
    private javax.swing.JTextField txtDateReturn;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

  private void Connect() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL JDBC Driver
        con = DriverManager.getConnection("jdbc:mysql://localhost/librarydb", "root", ""); // Database URL, Username, Password
        System.out.println("Database Connected Successfully!");
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(BorrowingJFrame.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Database Connection Failed!", "Error", JOptionPane.ERROR_MESSAGE);
    
    }
  }
}


