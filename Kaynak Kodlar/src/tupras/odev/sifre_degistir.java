package tupras.odev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class sifre_degistir extends javax.swing.JFrame {
   ResultSet rs=null;
    PreparedStatement pst=null;
    Statement ifade=null;
    Connection baglanti=null;
    public sifre_degistir() 
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        geri_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userId_text = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        userKey_text = new javax.swing.JPasswordField();
        gizli_yanit_text = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btn_onayla = new javax.swing.JButton();
        temizle_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Şifre Değiştir");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(194, 220, 248));

        geri_btn.setBackground(new java.awt.Color(204, 204, 204));
        geri_btn.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        geri_btn.setForeground(new java.awt.Color(255, 255, 255));
        geri_btn.setText("Geri");
        geri_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geri_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kullanıcı Adı");

        userId_text.setForeground(new java.awt.Color(0, 153, 153));
        userId_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userId_textMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Yeni Parola");

        userKey_text.setForeground(new java.awt.Color(0, 153, 153));
        userKey_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userKey_textMouseClicked(evt);
            }
        });

        gizli_yanit_text.setForeground(new java.awt.Color(0, 153, 153));
        gizli_yanit_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gizli_yanit_textMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gizli Yanıt");

        btn_onayla.setBackground(new java.awt.Color(204, 204, 204));
        btn_onayla.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btn_onayla.setForeground(new java.awt.Color(255, 255, 255));
        btn_onayla.setText("Onayla");
        btn_onayla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_onaylaActionPerformed(evt);
            }
        });

        temizle_btn.setBackground(new java.awt.Color(204, 204, 204));
        temizle_btn.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        temizle_btn.setForeground(new java.awt.Color(255, 255, 255));
        temizle_btn.setText("Temizle");
        temizle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizle_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(geri_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gizli_yanit_text)
                    .addComponent(userId_text)
                    .addComponent(userKey_text, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(temizle_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_onayla, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(geri_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(userId_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userKey_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gizli_yanit_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_onayla, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(temizle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userId_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userId_textMouseClicked
        userId_text.setText("");
    }//GEN-LAST:event_userId_textMouseClicked

    private void userKey_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userKey_textMouseClicked
        userKey_text.setText("");
    }//GEN-LAST:event_userKey_textMouseClicked

    private void gizli_yanit_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gizli_yanit_textMouseClicked
        gizli_yanit_text.setText("");
    }//GEN-LAST:event_gizli_yanit_textMouseClicked

    private void btn_onaylaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_onaylaActionPerformed
       try {
           Class.forName("com.mysql.jdbc.Driver");
           baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/tupras_proje?autoReconnect=true&useSSL=false","root","0000");
           pst=baglanti.prepareStatement("select * from user_login where username=? and gizli_yanit=?");
           pst.setString(1,userId_text.getText());
           pst.setString(2,gizli_yanit_text.getText());
           rs=pst.executeQuery();        
           if(rs.next())
           {            
             ifade=baglanti.createStatement();
             ifade.executeUpdate("UPDATE user_login SET password ='"+userKey_text.getText()+"'");
             JOptionPane.showMessageDialog(null,"Şifre Başarılı Bir Şekilde Değiştirildi.","Hata",JOptionPane.WARNING_MESSAGE);
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Şifre Değiştirilemedi","Hata",JOptionPane.WARNING_MESSAGE);
               userId_text.setText("");
               userKey_text.setText("");
               gizli_yanit_text.setText("");
           }
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(sifre_degistir.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(sifre_degistir.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btn_onaylaActionPerformed

    private void temizle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizle_btnActionPerformed
               userId_text.setText("");
               userKey_text.setText("");
               gizli_yanit_text.setText("");
    }//GEN-LAST:event_temizle_btnActionPerformed

    private void geri_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geri_btnActionPerformed
       user_login form=new user_login();
       form.show();
       this.hide();
    }//GEN-LAST:event_geri_btnActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(sifre_degistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sifre_degistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sifre_degistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sifre_degistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sifre_degistir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_onayla;
    private javax.swing.JButton geri_btn;
    private javax.swing.JPasswordField gizli_yanit_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton temizle_btn;
    private javax.swing.JTextField userId_text;
    private javax.swing.JPasswordField userKey_text;
    // End of variables declaration//GEN-END:variables
}
