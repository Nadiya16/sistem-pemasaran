import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author M. ade nur Alfarisi
 */
public class CRUDbrand extends javax.swing.JFrame {
    /**
     * Creates new form CRUDbrand
     */
    public CRUDbrand() {
        initComponents();
        table();
    }
    
    public void cari() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("id_brand");
        tbl.addColumn("nm_brand");
        
        try {
        String sql = "SELECT * FROM brand WHERE id_brand LIKE ?";
        Connection con = koneksi.getConnection();
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, "%" + cari.getText() + "%");
        ResultSet rs = pst.executeQuery();
        
    while (rs.next()) {
        tbl.addRow(new Object[]{
            rs.getString("id_brand"),
            rs.getString("nm_brand")
        });
    table.setModel(tbl);
    }   
} catch (Exception e) {
    e.printStackTrace();  //untuk mengetahui eror yang terjadi
}
        
    }
    
    void hapus(){
        idbrand.setText("");
        nmbrand.setText("");
    }
    
    public void table() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("id_brand");
        tbl.addColumn("nm_brand");
        
        koneksi conn = new koneksi();
        
        
       try {
    // Mendapatkan koneksi database
    Statement st = conn.getConnection().createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM brand");
    
    // Menambahkan hasil query ke dalam tabel
    while (rs.next()) {
        tbl.addRow(new Object[]{
            rs.getString("id_brand"),
            rs.getString("nm_brand")
        });

    table.setModel(tbl);
    }
    
    JOptionPane.showMessageDialog(null, "Koneksi Database Berhasil");

} catch (Exception e) {
    
    JOptionPane.showMessageDialog(null, "Koneksi Database gagal:"  + e.getMessage());
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

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idbrand = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nmbrand = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        cari = new javax.swing.JTextField();
        tcari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CRUD BRAND");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Id_brand");

        idbrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idbrandActionPerformed(evt);
            }
        });
        idbrand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idbrandKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nama_brand");

        tambah.setBackground(new java.awt.Color(51, 204, 0));
        tambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(0, 102, 255));
        edit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        edit.setText("Edit ");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(255, 51, 51));
        hapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        tcari.setBackground(new java.awt.Color(153, 204, 0));
        tcari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tcari.setText("Cari");
        tcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcariActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id brand", "Nama brand"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nmbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edit)
                                .addGap(12, 12, 12)
                                .addComponent(hapus))
                            .addComponent(jLabel3)
                            .addComponent(idbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tcari))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nmbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambah)
                    .addComponent(edit)
                    .addComponent(hapus))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
       try {
            String sql = "INSERT INTO brand (id_brand, nm_brand) VALUES (?, ?)";
            Connection con = koneksi.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, idbrand.getText());
            pst.setString(2, nmbrand.getText());
            pst.executeUpdate();

    JOptionPane.showMessageDialog(null, "Berhasil menyimpan");
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Gagal Menyimpan:"  + e.getMessage());
} 
        table();
        hapus();  
        
    }//GEN-LAST:event_tambahActionPerformed

    private void idbrandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idbrandKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_idbrandKeyPressed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
 try {
    String sql = "UPDATE brand SET id_brand = ?, nm_brand = ? WHERE id_brand = ?";
    Connection con = koneksi.getConnection();
    PreparedStatement pst = con.prepareStatement(sql);
    
    // Isi parameter dengan nilai yang sesuai
    pst.setString(1, idbrand.getText());
    pst.setString(2, nmbrand.getText());
    pst.setString(3, idbrand.getText()); // Pastikan ini adalah ID dari produk yang ingin di-update
    
    int rowsAffected = pst.executeUpdate(); 
    if (rowsAffected > 0) {
        JOptionPane.showMessageDialog(null, "Berhasil edit.");
    } else {
        JOptionPane.showMessageDialog(null, "Data tidak ditemukan atau tidak ada yang berubah.");
    }
    
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
}
    table();
    hapus();
       
    }//GEN-LAST:event_editActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
   try {
    String sql = "DELETE FROM brand WHERE id_brand = ?";
    Connection con = koneksi.getConnection();
    PreparedStatement pst = con.prepareStatement(sql);
    pst.setString(1, idbrand.getText()); // Set the parameter for the WHERE clause
    int rowsAffected = pst.executeUpdate();
    if (rowsAffected > 0) {
        JOptionPane.showMessageDialog(null, "Berhasil menghapus");
    } else {
        JOptionPane.showMessageDialog(null, "Gagal menghapus");
    }
} catch (Exception e) {
    System.err.println("Error deleting database: " + e.getMessage());
    // ... error handling ...
}
    table();
    hapus();
       
    }//GEN-LAST:event_hapusActionPerformed

    private void tcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcariActionPerformed
        cari(); // TODO add your handling code here:
    }//GEN-LAST:event_tcariActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int baris = table.rowAtPoint(evt.getPoint());
       String id_brand = table.getValueAt(baris, 0).toString();
       idbrand.setText(id_brand);
       String nm_brand = table.getValueAt(baris, 1).toString();
       nmbrand.setText(nm_brand);  
       
    }//GEN-LAST:event_tableMouseClicked

    private void idbrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idbrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idbrandActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CRUDbrand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDbrand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDbrand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDbrand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDbrand().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cari;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField idbrand;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nmbrand;
    private javax.swing.JTable table;
    private javax.swing.JButton tambah;
    private javax.swing.JButton tcari;
    // End of variables declaration//GEN-END:variables
}
