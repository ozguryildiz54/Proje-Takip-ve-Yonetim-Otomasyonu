package tupras.odev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class satin_alinanlar extends javax.swing.JFrame 
{
    Connection baglanti=null;
    Statement komut=null;
    ResultSet rs=null;
    int satir_no=0;
    public satin_alinanlar() 
    {
        initComponents();
        try 
         {
            Class.forName("com.mysql.jdbc.Driver");
            baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/tupras_proje?autoReconnect=true&useSSL=false","root","0000"); //Mysql sunucusuna bağlandık
            komut = (Statement) baglanti.createStatement();
            rs = komut.executeQuery("Select * from satin_alinanlar"); //Veritabanındaki tabloya bağlandık
                int colcount = rs.getMetaData().getColumnCount(); //Veritabanındaki tabloda kaç tane sütun var?
                DefaultTableModel tm = new DefaultTableModel(); //Model oluşturuyoruz
                for(int i = 1;i<=colcount;i++)
                    tm.addColumn(rs.getMetaData().getColumnName(i)); //Tabloya sütun ekliyoruz veritabanımızdaki sütun ismiyle aynı olacak şekilde
                while(rs.next())
                    {
                        Object[] row = new Object[colcount];
                        for(int i=1;i<=colcount;i++)
                            row[i-1] = rs.getObject(i);
                        tm.addRow(row);
                    }
                jTable1.setModel(tm);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(satin_alinanlar.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
            Logger.getLogger(satin_alinanlar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Satın Alma Geçmişi");
        setBackground(new java.awt.Color(194, 220, 248));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(194, 220, 248));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sıra No", "Şirket İsmi", "Birim Fiyat", "Ürün Adeti", "Alış Fiyatı", "Tarih"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Geri");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Sil");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Sıfırla");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tüm Satın Aldığınız Ürünlerin Geçmişi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(127, 127, 127)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel2))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(25, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Object [] sifirla = {"Evet","Hayır"}; // Obje Dizisi Oluşturduk
        String message = "Sıfırlamak istediğinizden emin misiniz?"; // Verilecek Mesaj
        String title = "Dikkat!!"; // Pencere Başlığı
        int silme = JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE,null, sifirla, null);
        if (silme == JOptionPane.YES_OPTION )
        {
            try {

              Class.forName("com.mysql.jdbc.Driver");  
              baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/tupras_proje?autoReconnect=true&useSSL=false","root","0000");        
              komut=(Statement) baglanti.createStatement();          
              komut.executeUpdate("TRUNCATE tupras_proje.satin_alinanlar");
              komut.executeUpdate("TRUNCATE tupras_proje.depo");
              rs = komut.executeQuery("Select * from satin_alinanlar");  //Veritabanındaki tabloya bağlandık
                int colcount = rs.getMetaData().getColumnCount(); //Veritabanındaki tabloda kaç tane sütun var?
                DefaultTableModel tm = new DefaultTableModel(); //Model oluşturuyoruz
                for(int i = 1;i<=colcount;i++)
                    tm.addColumn(rs.getMetaData().getColumnName(i)); //Tabloya sütun ekliyoruz veritabanımızdaki sütun ismiyle aynı olacak şekilde
                while(rs.next())
                    {
                        Object[] row = new Object[colcount];
                        for(int i=1;i<=colcount;i++)
                            row[i-1] = rs.getObject(i);
                        tm.addRow(row);
                    }
                jTable1.setModel(tm);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(satin_al.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(null,"Hatalı Giriş Yaptınız!","Hata",JOptionPane.WARNING_MESSAGE); 
            } catch (SQLException ex) {            
                Logger.getLogger(satin_al.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Hatalı Giriş Yaptınız!","Hata",JOptionPane.WARNING_MESSAGE);
            }
        }
        else if (silme == JOptionPane.NO_OPTION)
        {}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        menu form =new menu();
        form.show();
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Object [] sil = {"Evet","Hayır"}; // Obje Dizisi Oluşturduk
        String message = "Silmek istediğinizden emin misiniz?"; // Verilecek Mesaj
        String title = "Dikkat!!"; // Pencere Başlığı
        int silme = JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE,null, sil, null);
        if (silme == JOptionPane.YES_OPTION )
        {
                try {        
                Class.forName("com.mysql.jdbc.Driver");  
                baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/tupras_proje?autoReconnect=true&useSSL=false","root","0000");        
                komut=(Statement) baglanti.createStatement();     
                komut.executeUpdate("delete from satin_alinanlar where id='"+String.valueOf(satir_no)+"'"); 
                komut.executeUpdate("delete from depo where id='"+String.valueOf(satir_no)+"'"); 
                komut.executeUpdate("update satin_alinanlar set id=id-1 where id>'"+String.valueOf(satir_no)+"'");
                komut.executeUpdate("update depo set id=id-1 where id>'"+String.valueOf(satir_no)+"'");
                rs = komut.executeQuery("Select * from satin_alinanlar");  //Veritabanındaki tabloya bağlandık
                  int colcount = rs.getMetaData().getColumnCount(); //Veritabanındaki tabloda kaç tane sütun var?
                  DefaultTableModel tm = new DefaultTableModel(); //Model oluşturuyoruz
                  for(int i = 1;i<=colcount;i++)
                  tm.addColumn(rs.getMetaData().getColumnName(i)); //Tabloya sütun ekliyoruz veritabanımızdaki sütun ismiyle aynı olacak şekilde
                  while(rs.next())
                      {
                          Object[] row = new Object[colcount];
                          for(int i=1;i<=colcount;i++)
                              row[i-1] = rs.getObject(i);
                          tm.addRow(row);
                      }
              jTable1.setModel(tm);
                  if (komut.execute("Select sirket_ad from satin_alinanlar where sirket_ad is null")==false ) 
                  {komut.executeUpdate("update satin_alinanlar set id=0 where id !=null");}
                   if (komut.execute("Select sirket_ad from depo where sirket_ad is null")==false ) 
                  {komut.executeUpdate("update depo set id=0 where id !=null");}
             } 
               catch (ClassNotFoundException ex) 
              {
                 Logger.getLogger(satin_al.class.getName()).log(Level.SEVERE, null, ex);
                 JOptionPane.showMessageDialog(null,"Hatalı Giriş Yaptınız!","Hata",JOptionPane.WARNING_MESSAGE); 
              } 
               catch (SQLException ex) 
              {            
                  Logger.getLogger(satin_al.class.getName()).log(Level.SEVERE, null, ex);
                  JOptionPane.showMessageDialog(null,"Hatalı Giriş Yaptınız!","Hata",JOptionPane.WARNING_MESSAGE);
              }
        }

        else if (silme == JOptionPane.NO_OPTION)
        {}
        
         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        try
        {
          satir_no=jTable1.getSelectedRow();
          String table_click=(jTable1.getModel().getValueAt(satir_no,0).toString());
          satir_no=Integer.valueOf(table_click);
        }
        catch(Exception a)
        {
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(satin_alinanlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(satin_alinanlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(satin_alinanlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(satin_alinanlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new satin_alinanlar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
