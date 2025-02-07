import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class BookJFrame extends javax.swing.JFrame {

    public BookJFrame() {
    initComponents();
    Connect(); // Fixed method name
    BookData();
}

    
    
    Connection con;
    PreparedStatement pst;
    
    private void BookData() {
        try {
            DefaultTableModel df = (DefaultTableModel) table2.getModel();
            df.setRowCount(0);
            
            String sql = "SELECT * FROM book";
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("bookid"));
                v.add(rs.getString("bookname"));
                v.add(rs.getString("author"));
                v.add(rs.getString("publisher"));
                df.addRow(v);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BookJFrame.class.getName()).log(Level.SEVERE, null, ex);
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
        table2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBId = new javax.swing.JTextField();
        txtBookName = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtPublisher = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book");

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

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BooktId", "BookName", "Author", "Publisher"
            }
        ));
        jScrollPane1.setViewportView(table2);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("BookId:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("BookName:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Author:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Publisher:");

        txtBId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBIdActionPerformed(evt);
            }
        });

        txtBookName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookNameActionPerformed(evt);
            }
        });

        txtAuthor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAuthorActionPerformed(evt);
            }
        });

        txtPublisher.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPublisherActionPerformed(evt);
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

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\sheha\\OneDrive\\Desktop\\EAD CW\\LibraryManagement\\src\\image\\book2.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnUpdate)
                                .addGap(34, 34, 34)
                                .addComponent(btnDelete)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBId, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtBookName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAuthor, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPublisher)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtBId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
       try {
            String bookid = txtBId.getText().trim();
            String bookname = txtBookName.getText().trim();
            String author = txtAuthor.getText().trim();
            String publisher = txtPublisher.getText().trim();
            
            // Input validation
            if (bookid.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Book ID is required", "Validation Error", JOptionPane.WARNING_MESSAGE);
                txtBId.requestFocus();
                return;
            }
            
            if (bookname.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Book name is required", "Validation Error", JOptionPane.WARNING_MESSAGE);
                txtBookName.requestFocus();
                return;
            }
        
        // Basic email validation
            if (author.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Author is required", "Validation Error", JOptionPane.WARNING_MESSAGE);
                txtAuthor.requestFocus();
                return;
            }
            
            // Check if book ID already exists
            PreparedStatement checkStmt = con.prepareStatement("SELECT bookid FROM book WHERE bookid = ?");
            checkStmt.setString(1, bookid);
            ResultSet rs = checkStmt.executeQuery();
            
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Book ID already exists", "Insert Error", JOptionPane.ERROR_MESSAGE);
                txtBId.requestFocus();
                return;
            }
        
        // Prepare and execute insert statement
            pst = con.prepareStatement("INSERT INTO book (bookid, bookname, author, publisher) VALUES (?, ?, ?, ?)");
            
            pst.setString(1, bookid);
            pst.setString(2, bookname);
            pst.setString(3, author);
            pst.setString(4, publisher);
            
            int rowsAffected = pst.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Book Added Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                BookData();
                clearFields();
            }
            
        } catch (SQLException ex) {
            String errorMessage = "Error adding book: " + ex.getMessage();
            JOptionPane.showMessageDialog(this, errorMessage, "Database Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(BookJFrame.class.getName()).log(Level.SEVERE, errorMessage, ex);
        }
}

// Helper method to clear input fields
private void clearFields() {
    txtBId.setText("");
    txtBookName.setText("");
    txtAuthor.setText("");
    txtPublisher.setText("");
    txtBId.requestFocus();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            String bookid = txtBId.getText().trim();
            String bookname = txtBookName.getText().trim();
            String author = txtAuthor.getText().trim();
            String publisher = txtPublisher.getText().trim();
            
            if (bookid.isEmpty() || bookname.isEmpty() || author.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Book ID, Name and  are required", "Validation Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            pst = con.prepareStatement("UPDATE book SET bookname=?, author=?, publisher=? WHERE bookid=?");
            
            pst.setString(1, bookname);
            pst.setString(2, author);
            pst.setString(3, publisher);
            pst.setString(4, bookid);
            
            int rowsAffected = pst.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Book Updated Successfully");
                BookData();
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Book ID not found");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BookJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

   

            
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      try {
            String bookid = txtBId.getText();
            
            if (bookid.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter Book ID");
                return;
            }
            
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this book?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
            
            if (confirm == JOptionPane.YES_OPTION) {
                pst = con.prepareStatement("DELETE FROM book WHERE bookid=?");
                pst.setString(1, bookid);
                
                int rowsAffected = pst.executeUpdate();
                
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Book Deleted Successfully");
                    BookData();
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(this, "Book ID not found");
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BookJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    
    
    
    
    private void txtAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAuthorActionPerformed
        // TODO add your handling code here:
        txtPublisher.requestFocus(); 
    }//GEN-LAST:event_txtAuthorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                                                 
       dispose();
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtBIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBIdActionPerformed
        // TODO add your handling code here:
        txtBookName.requestFocus();
    }//GEN-LAST:event_txtBIdActionPerformed

    private void txtBookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookNameActionPerformed
        // TODO add your handling code here:
        txtAuthor.requestFocus(); 
    }//GEN-LAST:event_txtBookNameActionPerformed

    private void txtPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPublisherActionPerformed
        // TODO add your handling code here:
         btnInsert.requestFocus();
    }//GEN-LAST:event_txtPublisherActionPerformed

   
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
            java.util.logging.Logger.getLogger(BookJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookJFrame().setVisible(true);
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
    private javax.swing.JTable table2;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBId;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtPublisher;
    // End of variables declaration//GEN-END:variables

  private void Connect() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL JDBC Driver
        con = DriverManager.getConnection("jdbc:mysql://localhost/librarydb", "root", ""); // Database URL, Username, Password
        System.out.println("Database Connected Successfully!");
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(BookJFrame.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Database Connection Failed!", "Error", JOptionPane.ERROR_MESSAGE);
    }
  }
}

