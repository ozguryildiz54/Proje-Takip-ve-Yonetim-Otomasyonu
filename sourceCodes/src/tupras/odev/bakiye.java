package tupras.odev;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class bakiye extends javax.swing.JFrame
{
    Connection baglanti=null;
    Statement komut =null;
    ResultSet a=null;
    
    public bakiye() 
    {
        initComponents();
        try {
           Class.forName("com.mysql.jdbc.Driver");  
           baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/tupras_proje?autoReconnect=true&useSSL=false","root","0000");
           komut= baglanti.createStatement();
           a=komut.executeQuery("select anapara from maliye");
          while(a.next())
          {
            jLabel9.setText(a.getString("anapara"));
          } 
           baglanti.close(); 
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(satin_al.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Hatalı Giriş Yaptınız!","Hata",JOptionPane.WARNING_MESSAGE); 
        } catch (SQLException ex) {            
            Logger.getLogger(satin_al.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Hatalı Giriş Yaptınız!","Hata",JOptionPane.WARNING_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        geri_buton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ekle_buton = new javax.swing.JButton();
        sifirla_buton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bakiye Yükle");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(194, 220, 248));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bakiye Miktarı");

        geri_buton.setBackground(new java.awt.Color(204, 204, 204));
        geri_buton.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        geri_buton.setForeground(new java.awt.Color(255, 255, 255));
        geri_buton.setText("Geri");
        geri_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geri_butonActionPerformed(evt);
            }
        });

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bakiye Yükle");

        ekle_buton.setBackground(new java.awt.Color(204, 204, 204));
        ekle_buton.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        ekle_buton.setForeground(new java.awt.Color(255, 255, 255));
        ekle_buton.setText("Ekle");
        ekle_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekle_butonActionPerformed(evt);
            }
        });

        sifirla_buton.setBackground(new java.awt.Color(204, 204, 204));
        sifirla_buton.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        sifirla_buton.setForeground(new java.awt.Color(255, 255, 255));
        sifirla_buton.setText("Bakiyeyi Sıfırla");
        sifirla_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifirla_butonActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Bakiye :");

        jLabel11.setText(" も");

        jLabel9.setForeground(new java.awt.Color(51, 153, 0));
        jLabel9.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(sifirla_buton)
                                    .addGap(71, 71, 71)
                                    .addComponent(ekle_buton))
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geri_buton)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geri_buton)))
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifirla_buton)
                    .addComponent(ekle_buton))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ekle_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekle_butonActionPerformed
        try {
           Class.forName("com.mysql.jdbc.Driver");
           baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/tupras_proje?autoReconnect=true&useSSL=false","root","0000");
           komut = baglanti.createStatement();
           komut.executeUpdate("update maliye set anapara=anapara+'"+jTextField1.getText()+"'");
           a=komut.executeQuery("select anapara from maliye");
          while(a.next())
          {
            jLabel9.setText(a.getString("anapara"));
          } 
          JOptionPane.showMessageDialog(null,"Bakiye Yüklemeniz Başarılı Bir Şekilde Yapılmıştır.","Bilgi",JOptionPane.WARNING_MESSAGE);
          jTextField1.setText("");
          baglanti.close(); 
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(satin_al.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Hatalı Giriş Yaptınız!","Hata",JOptionPane.WARNING_MESSAGE); 
        } catch (SQLException ex) {            
            Logger.getLogger(satin_al.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Hatalı Giriş Yaptınız!","Hata",JOptionPane.WARNING_MESSAGE);
        }      
    }//GEN-LAST:event_ekle_butonActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
         jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void geri_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geri_butonActionPerformed
        menu form =new menu();
        form.show();
        this.hide();
    }//GEN-LAST:event_geri_butonActionPerformed

    private void sifirla_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifirla_butonActionPerformed
        Object [] sifirla = {"Evet","Hayır"}; // Obje Dizisi Oluşturduk
        String message = "Sıfırlamak istediğinizden emin misiniz?"; // Verilecek Mesaj
        String title = "Dikkat!!"; // Pencere Başlığı
        int silme = JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE,null, sifirla, null);
        if (silme == JOptionPane.YES_OPTION )
        {
            try {
           Class.forName("com.mysql.jdbc.Driver");
           baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/tupras_proje?autoReconnect=true&useSSL=false","root","0000");
           komut = baglanti.createStatement();
           komut.executeUpdate("update maliye set anapara=0");
           a=komut.executeQuery("select anapara from maliye");
          while(a.next())
          {
            jLabel9.setText(a.getString("anapara"));
          } 
          JOptionPane.showMessageDialog(null,"Bakiye Yüklemeniz Başarılı Bir Şekilde Yapılmıştır.","Bilgi",JOptionPane.WARNING_MESSAGE);
          jTextField1.setText("");
          baglanti.close(); 
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(satin_al.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Hatalı Giriş Yaptınız!","Hata",JOptionPane.WARNING_MESSAGE); 
        } catch (SQLException ex) {            
            Logger.getLogger(satin_al.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Hatalı Giriş Yaptınız!","Hata",JOptionPane.WARNING_MESSAGE);
        }   
            
            /*
            try 
            {                                         
                Class.forName("com.mysql.jdbc.Driver");
                baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/tupras_proje?autoReconnect=true&useSSL=false","root","0000");
                java.sql.Statement komut = baglanti.createStatement();
                komut.executeUpdate("truncate maliye");
                komut.executeUpdate("insert into tupras_proje.maliye  (anapara) values(0)");
                a=komut.executeQuery("select anapara from maliye");
              while(a.next())
              {
                jLabel9.setText(a.getString("anapara"));
              } 
               baglanti.close(); 
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
            */
        }
        else if (silme == JOptionPane.NO_OPTION)
        {}
    }//GEN-LAST:event_sifirla_butonActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_6 || c == KeyEvent.VK_7 || c == KeyEvent.VK_8 || c == KeyEvent.VK_9 || c == KeyEvent.VK_PERIOD) 
        {} else
                {
                    getToolkit().beep();
                    evt.consume();
                }
    }//GEN-LAST:event_jTextField1KeyTyped

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
            java.util.logging.Logger.getLogger(bakiye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bakiye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bakiye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bakiye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new bakiye().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ekle_buton;
    private javax.swing.JButton geri_buton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton sifirla_buton;
    // End of variables declaration//GEN-END:variables
}
