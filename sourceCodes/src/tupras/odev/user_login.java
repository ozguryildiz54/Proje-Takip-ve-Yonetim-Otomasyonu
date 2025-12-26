package tupras.odev;

import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class user_login extends javax.swing.JFrame 
{
    ResultSet rs=null;
    PreparedStatement pst=null;
    Connection baglanti=null;
    
    public user_login() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        userKey_text = new javax.swing.JPasswordField();
        sifre_unuttum_lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userId_text = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KULLANICI GİRİŞİ");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(194, 220, 248));

        userKey_text.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userKey_text.setForeground(new java.awt.Color(0, 153, 153));
        userKey_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userKey_textMouseClicked(evt);
            }
        });
        userKey_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userKey_textKeyPressed(evt);
            }
        });

        sifre_unuttum_lbl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sifre_unuttum_lbl.setForeground(new java.awt.Color(102, 102, 102));
        sifre_unuttum_lbl.setText("Şifremi Unuttum!");
        sifre_unuttum_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifre_unuttum_lblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sifre_unuttum_lblMouseEntered(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kullanıcı Adı");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Parola");

        userId_text.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userId_text.setForeground(new java.awt.Color(0, 153, 153));
        userId_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userId_textMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Giriş");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sifre_unuttum_lbl))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userKey_text, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userId_text, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userId_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sifre_unuttum_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userKey_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            try {                                         
                Class.forName("com.mysql.jdbc.Driver");
                baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/tupras_proje?autoReconnect=true&useSSL=false","root","0000");
                pst=baglanti.prepareStatement("select * from user_login where username=? and password=?");
                pst.setString(1,userId_text.getText());
                pst.setString(2,userKey_text.getText());            
                rs=pst.executeQuery();             
                if(rs.next()){
                    menu form =new menu();
                    form.show();
                    this.hide();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Yanlış Şifre Girdiniz","Hata",JOptionPane.WARNING_MESSAGE);
                    userId_text.setText("");
                    userKey_text.setText("");
                }      
            } 
            catch (ClassNotFoundException ex) 
            {
            Logger.getLogger(user_login.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(user_login.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sifre_unuttum_lblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifre_unuttum_lblMouseEntered
           Cursor imlec=new Cursor(Cursor.HAND_CURSOR);
           sifre_unuttum_lbl.setCursor(imlec);
    }//GEN-LAST:event_sifre_unuttum_lblMouseEntered

    private void userId_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userId_textMouseClicked
       userId_text.setText("");
    }//GEN-LAST:event_userId_textMouseClicked

    private void userKey_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userKey_textMouseClicked
      userKey_text.setText("");
    }//GEN-LAST:event_userKey_textMouseClicked

    private void sifre_unuttum_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifre_unuttum_lblMouseClicked
       sifre_degistir form=new sifre_degistir();
       form.show();
       this.hide();
    }//GEN-LAST:event_sifre_unuttum_lblMouseClicked

    private void userKey_textKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKey_textKeyPressed
      if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
     try {                                         
                Class.forName("com.mysql.jdbc.Driver");
                baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/tupras_proje?autoReconnect=true&useSSL=false","root","0000");
                pst=baglanti.prepareStatement("select * from user_login where username=? and password=?");
                pst.setString(1,userId_text.getText());
                pst.setString(2,userKey_text.getText());            
                rs=pst.executeQuery();             
                if(rs.next()){
                    menu form =new menu();
                    form.show();
                    this.hide();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Yanlış Şifre Girdiniz","Hata",JOptionPane.WARNING_MESSAGE);
                    userId_text.setText("");
                    userKey_text.setText("");
                }      
            } 
            catch (ClassNotFoundException ex) 
            {
            Logger.getLogger(user_login.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(user_login.class.getName()).log(Level.SEVERE, null, ex);
            }
   }
    }//GEN-LAST:event_userKey_textKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel sifre_unuttum_lbl;
    private javax.swing.JTextField userId_text;
    private javax.swing.JPasswordField userKey_text;
    // End of variables declaration//GEN-END:variables
}
