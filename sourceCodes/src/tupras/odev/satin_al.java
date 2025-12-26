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
import java.util.Calendar;
import javax.swing.ComboBoxModel;
public class satin_al extends javax.swing.JFrame 
{
    public int sayac=0,adet,sayac2=0;
    ResultSet rs=null;
    double para;
    double komisyon=0.0,sayi1,sayi2,maliyet=0.0,toplam_maliyet=0.0,birim_fiyat=0.0;
    Calendar cal = Calendar.getInstance();
    Connection baglanti=null;
    Statement komut=null;
    String tarih;
    int sayac3,sayac4;
    boolean kontrol=false,kontrol2=false;
    
    public satin_al() 
    {
        initComponents();
        try 
        {
           Class.forName("com.mysql.jdbc.Driver");         
           baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/tupras_proje?autoReconnect=true&useSSL=false","root","0000");
           komut= baglanti.createStatement();
           rs=komut.executeQuery("select anapara from maliye");
           while(rs.next())
           {
                jLabel9.setText(rs.getString("anapara"));
           } 
           jComboBox1.removeAllItems();
                rs = komut.executeQuery("SELECT sirket_isim FROM bist100");
                while(rs.next())
                {
                    jComboBox1.addItem(rs.getString("sirket_isim"));
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_sag = new javax.swing.JPanel();
        bnt_kayit1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bnt_kayit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        son_fiyat_label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t_ara = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        fiyat_text = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adet_text = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        son_fiyat_label1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        son_fiyat_label2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ürün Satın Al");
        setMinimumSize(new java.awt.Dimension(417, 293));
        setResizable(false);

        panel_sag.setBackground(new java.awt.Color(194, 220, 248));
        panel_sag.setForeground(java.awt.SystemColor.activeCaption);

        bnt_kayit1.setBackground(new java.awt.Color(204, 204, 204));
        bnt_kayit1.setForeground(new java.awt.Color(255, 255, 255));
        bnt_kayit1.setText("Hesapla");
        bnt_kayit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_kayit1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Geri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bnt_kayit.setBackground(new java.awt.Color(204, 204, 204));
        bnt_kayit.setForeground(new java.awt.Color(255, 255, 255));
        bnt_kayit.setText("Satın Al");
        bnt_kayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_kayitActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Maliyet");

        son_fiyat_label.setText("0");
        son_fiyat_label.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ürün Adeti");

        t_ara.setText("Ara");
        t_ara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_araMouseClicked(evt);
            }
        });
        t_ara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_araKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_araKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Birim Fiyat");

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(102, 102, 102));

        fiyat_text.setText("0");
        fiyat_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiyat_textMouseClicked(evt);
            }
        });
        fiyat_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fiyat_textKeyTyped(evt);
            }
        });

        jLabel6.setText("X");
        jLabel6.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Şirket İsmi");

        adet_text.setText("0");
        adet_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adet_textMouseClicked(evt);
            }
        });
        adet_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adet_textKeyTyped(evt);
            }
        });

        jLabel8.setText(" も");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Bakiye :");

        jLabel10.setText(" も");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 0));
        jLabel9.setText("0");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Komisyon");

        son_fiyat_label1.setText("0");
        son_fiyat_label1.setToolTipText("");

        jLabel12.setText(" も");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("-------------------------------------------------");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("+");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Komisyonlu Maliyet");

        son_fiyat_label2.setText("0");
        son_fiyat_label2.setToolTipText("");

        jLabel15.setText(" も");

        javax.swing.GroupLayout panel_sagLayout = new javax.swing.GroupLayout(panel_sag);
        panel_sag.setLayout(panel_sagLayout);
        panel_sagLayout.setHorizontalGroup(
            panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_sagLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_sagLayout.createSequentialGroup()
                .addGroup(panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_sagLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_sagLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(71, 71, 71)
                                .addComponent(son_fiyat_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_sagLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(panel_sagLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_sagLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_sagLayout.createSequentialGroup()
                                .addGroup(panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_sagLayout.createSequentialGroup()
                                        .addGroup(panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(panel_sagLayout.createSequentialGroup()
                                                .addComponent(fiyat_text, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(19, 19, 19)
                                        .addGroup(panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5)
                                            .addGroup(panel_sagLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(adet_text, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(panel_sagLayout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(bnt_kayit1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)))
                                .addGroup(panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(son_fiyat_label, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(son_fiyat_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_sagLayout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addGroup(panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(bnt_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(119, 119, 119))
        );
        panel_sagLayout.setVerticalGroup(
            panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sagLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t_ara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_sagLayout.createSequentialGroup()
                        .addGroup(panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_sagLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(son_fiyat_label)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7)
                            .addGroup(panel_sagLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fiyat_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(panel_sagLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(son_fiyat_label1)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bnt_kayit1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panel_sagLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adet_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(1, 1, 1)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_sagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(son_fiyat_label2)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(bnt_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_sag, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_sag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t_araMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_araMouseClicked
        t_ara.setText("");
        try {
                Class.forName("com.mysql.jdbc.Driver");
                baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/tupras_proje?autoReconnect=true&useSSL=false","root","0000");
                komut = baglanti.createStatement();
                jComboBox1.removeAllItems();
                rs = komut.executeQuery("SELECT sirket_isim FROM bist100");
                while(rs.next())
                {
                    jComboBox1.addItem(rs.getString("sirket_isim"));
                } 
            } 
            catch (ClassNotFoundException ex) 
            {         
                Logger.getLogger(satin_al.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (SQLException ex)
            {
                Logger.getLogger(satin_al.class.getName()).log(Level.SEVERE, null, ex);
            }         
    }//GEN-LAST:event_t_araMouseClicked

    private void bnt_kayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_kayitActionPerformed

        if(son_fiyat_label.getText()=="0"|| son_fiyat_label.getText()=="0.0")
        {
            JOptionPane.showMessageDialog(null,"Ürün ismi ve fiyat bilgisi boş geçilemez!","Hata",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
             try
            {
                kontrol=false; 
                kontrol2=false;
                Class.forName("com.mysql.jdbc.Driver");
                baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/tupras_proje?autoReconnect=true&useSSL=false","root","0000");
                komut= baglanti.createStatement();
                rs=komut.executeQuery("select anapara from maliye");
                while(rs.next()) 
                   {
                     para=Double.parseDouble(rs.getString("anapara").toString());
                   }
                if(para>toplam_maliyet || para==toplam_maliyet)
                {
                   tarih=String.valueOf(cal.get(Calendar.YEAR))+"."+String.valueOf(cal.get(Calendar.MONTH)+1)+"."+String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
                   komut.executeUpdate("update maliye set anapara=anapara-'"+toplam_maliyet+"'");
                   komut.executeUpdate("update kar_zarar set toplam_harcama=toplam_harcama+'"+toplam_maliyet+"'");
                   rs=komut.executeQuery("SELECT count(*) FROM satin_alinanlar where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                   while(rs.next()) 
                   {
                     sayac = Integer.parseInt(rs.getString("count(*)"));
                   }
                   rs=komut.executeQuery("SELECT count(*) FROM depo where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                   while(rs.next()) 
                   {
                     sayac2 = Integer.parseInt(rs.getString("count(*)"));
                   }
                   if(sayac==0)
                   {  
                        rs=komut.executeQuery("SELECT COUNT(*) FROM satin_alinanlar");
                        while(rs.next()) 
                        {
                          sayac4 = Integer.parseInt(rs.getString("count(*)"));
                        }                         
                        komut.executeUpdate("insert into satin_alinanlar(id,sirket_ad,birim_fiyat,urun_adet,maliyet,komisyon,komisyonlu_maliyet,tarih) values('"+String.valueOf(sayac4+1)+"','"+jComboBox1.getSelectedItem()+"','"+fiyat_text.getText()+"','"+adet_text.getText()+"','"+son_fiyat_label.getText()+"','"+son_fiyat_label1.getText()+"','"+son_fiyat_label2.getText()+"','"+tarih+"')");
                         
                    }
                   if(sayac2==0)
                   {
                       
                       rs=komut.executeQuery("SELECT COUNT(*) FROM depo");
                        while(rs.next()) 
                        {
                          sayac3 = Integer.parseInt(rs.getString("count(*)"));
                        }
                        
                         komut.executeUpdate("insert into depo(id,sirket_ad,birim_fiyat,urun_adet,kazanc,komisyon,komisyonlu_kazanc,tarih) values('"+String.valueOf(sayac3+1)+"','"+jComboBox1.getSelectedItem()+"','"+fiyat_text.getText()+"','"+adet_text.getText()+"','"+son_fiyat_label.getText()+"','"+son_fiyat_label1.getText()+"','"+son_fiyat_label2.getText()+"','"+tarih+"')");      
                   }
                   if(sayac>0)
                    {                    
                         tarih=String.valueOf(cal.get(Calendar.YEAR))+"."+String.valueOf(cal.get(Calendar.MONTH)+1)+"."+String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
                         rs=komut.executeQuery("SELECT urun_adet FROM satin_alinanlar where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                        while(rs.next()) 
                        {
                          sayac =Integer.parseInt(rs.getString("urun_adet"));
                        }
                       adet=sayac+Integer.valueOf(adet_text.getText().toString());
              
                        komut.executeUpdate("update satin_alinanlar set urun_adet='"+String.valueOf(adet)+"' where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                                             
                        
                         rs=komut.executeQuery("SELECT maliyet FROM satin_alinanlar where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                        while(rs.next()) 
                        {
                          para =Double.parseDouble(rs.getString("maliyet"));
                        }
                        maliyet=para+Double.parseDouble(son_fiyat_label.getText().toString());
                        birim_fiyat=maliyet/Double.parseDouble(String.valueOf(adet));
                        komut.executeUpdate("update satin_alinanlar set birim_fiyat='"+String.valueOf(birim_fiyat)+"' where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                        komut.executeUpdate("update satin_alinanlar set maliyet='"+String.valueOf(maliyet)+"' where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                        
                        rs=komut.executeQuery("SELECT komisyon FROM satin_alinanlar where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                        while(rs.next()) 
                        {
                          para =Double.parseDouble(rs.getString("komisyon").toString());
                        }
                        maliyet=para+Double.parseDouble(son_fiyat_label1.getText().toString());
                        komut.executeUpdate("update satin_alinanlar set komisyon='"+String.valueOf(maliyet)+"' where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                        
                        
                        rs=komut.executeQuery("SELECT komisyonlu_maliyet FROM satin_alinanlar where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                        while(rs.next()) 
                        {
                          para =Double.parseDouble(rs.getString("komisyonlu_maliyet"));
                        }
                        maliyet=para+Double.parseDouble(son_fiyat_label2.getText().toString());
                        komut.executeUpdate("update satin_alinanlar set komisyonlu_maliyet='"+String.valueOf(maliyet)+"' where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                        komut.executeUpdate("update satin_alinanlar set tarih='"+tarih+"' where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                        
                        
                        
                    } 
                   if(sayac2>0)
                   {
                       rs=komut.executeQuery("SELECT urun_adet FROM depo where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                        while(rs.next()) 
                        {
                          sayac2 =Integer.parseInt(rs.getString("urun_adet"));
                        }
                       adet=sayac2+Integer.valueOf(adet_text.getText().toString());
                       komut.executeUpdate("update depo set urun_adet='"+String.valueOf(adet)+"' where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                       rs=komut.executeQuery("SELECT komisyon FROM depo where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                        while(rs.next()) 
                        {
                          para =Double.parseDouble(rs.getString("komisyon"));
                        }
                        maliyet=para+Double.parseDouble(son_fiyat_label1.getText().toString());
                        komut.executeUpdate("update depo set komisyon='"+String.valueOf(maliyet)+"' where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                       rs=komut.executeQuery("SELECT kazanc FROM depo where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                        while(rs.next()) 
                        {
                          para =Double.parseDouble(rs.getString("kazanc"));
                        }
                       // adet=sayac2+Integer.valueOf(adet_text.getText().toString());
                        maliyet=para+Double.parseDouble(son_fiyat_label.getText().toString());
                        birim_fiyat=maliyet/Double.parseDouble(String.valueOf(adet));
                        komut.executeUpdate("update depo set birim_fiyat='"+String.valueOf(birim_fiyat)+"' where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                        komut.executeUpdate("update depo set kazanc='"+String.valueOf(maliyet)+"' where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                        
                    
                        
                        rs=komut.executeQuery("SELECT komisyonlu_kazanc FROM depo where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                        while(rs.next()) 
                        {
                          para =Double.parseDouble(rs.getString("komisyonlu_kazanc"));
                        }
                        maliyet=para+Double.parseDouble(son_fiyat_label2.getText());
                        komut.executeUpdate("update depo set komisyonlu_kazanc='"+String.valueOf(maliyet)+"' where sirket_ad='"+jComboBox1.getSelectedItem()+"'");
                        komut.executeUpdate("update depo set tarih='"+tarih+"' where sirket_ad='"+jComboBox1.getSelectedItem()+"'");                       
                   }
                   baglanti.close(); 
                   JOptionPane.showMessageDialog(null,"Kaydınız Başarılı Bir Şekilde Yapılmıştır.","Bilgi",JOptionPane.WARNING_MESSAGE);
                }
                    
                else
                     {
                         JOptionPane.showMessageDialog(null,"Bakiyeniz Yetersiz Lütfen Yükleme Yapınız!","Bilgi",JOptionPane.WARNING_MESSAGE);
                     }
                }
                 catch (ClassNotFoundException ex) 
                 {
                     Logger.getLogger(satin_al.class.getName()).log(Level.SEVERE, null, ex);
                 } 
                 catch (SQLException ex) 
                 {
                     Logger.getLogger(satin_al.class.getName()).log(Level.SEVERE, null, ex);
                 }

                 try 
                 {
                     t_ara.setText("Ara");
                     
                     try {
                Class.forName("com.mysql.jdbc.Driver");
                baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/tupras_proje?autoReconnect=true&useSSL=false","root","0000");
                komut = baglanti.createStatement();
                jComboBox1.removeAllItems();
                rs = komut.executeQuery("SELECT sirket_isim FROM bist100");
                while(rs.next())
                {
                    jComboBox1.addItem(rs.getString("sirket_isim"));
                } 
            } 
            catch (ClassNotFoundException ex) 
            {         
                Logger.getLogger(satin_al.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (SQLException ex)
            {
                Logger.getLogger(satin_al.class.getName()).log(Level.SEVERE, null, ex);
            }      
                     
                     fiyat_text.setText("0");
                     adet_text.setText("0");
                     son_fiyat_label.setText("0");
                     son_fiyat_label1.setText("0");
                     son_fiyat_label2.setText("0");
                      Class.forName("com.mysql.jdbc.Driver");
                      baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/tupras_proje?autoReconnect=true&useSSL=false","root","0000");
                      komut= baglanti.createStatement();
                      rs=komut.executeQuery("select anapara from maliye");
                      while(rs.next())
                      {
                            jLabel9.setText(rs.getString("anapara"));
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
                   
        }

    }//GEN-LAST:event_bnt_kayitActionPerformed

    private void t_araKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_araKeyPressed
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/tupras_proje?autoReconnect=true&useSSL=false","root","0000");
            komut= baglanti.createStatement();
            jComboBox1.removeAllItems();
            rs = komut.executeQuery("SELECT sirket_isim FROM bist100 where sirket_isim LIKE '%"+t_ara.getText()+"%'");
                while(rs.next())
                {
                    jComboBox1.addItem(rs.getString("sirket_isim"));
                } 
        } 
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(satin_al.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(satin_al.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_t_araKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menu form=new menu();
        form.show();
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bnt_kayit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_kayit1ActionPerformed
            if(kontrol==true && kontrol2==true)
            {
                sayi1=Double.valueOf(fiyat_text.getText());
                sayi2=Double.valueOf(adet_text.getText());
                maliyet=sayi1*sayi2;
                komisyon=maliyet*0.002;
                toplam_maliyet=maliyet+komisyon;
                son_fiyat_label.setText(String.valueOf(maliyet));
                son_fiyat_label1.setText(String.valueOf(komisyon));
                son_fiyat_label2.setText(String.valueOf(toplam_maliyet));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Fiyat ve Urun Adeti Bilgisi Giriniz!","Hata",JOptionPane.WARNING_MESSAGE);
            }


    }//GEN-LAST:event_bnt_kayit1ActionPerformed

    private void fiyat_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiyat_textMouseClicked
        fiyat_text.setText("");
        kontrol=false;
                     son_fiyat_label.setText("0");
                     son_fiyat_label1.setText("0");
                     son_fiyat_label2.setText("0");
    }//GEN-LAST:event_fiyat_textMouseClicked

    private void adet_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adet_textMouseClicked
        adet_text.setText("");
        kontrol2=false;
                     son_fiyat_label.setText("0");
                     son_fiyat_label1.setText("0");
                     son_fiyat_label2.setText("0");
    }//GEN-LAST:event_adet_textMouseClicked

    private void fiyat_textKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fiyat_textKeyTyped
        char c = evt.getKeyChar();

        if (c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_6 || c == KeyEvent.VK_7 || c == KeyEvent.VK_8 || c == KeyEvent.VK_9 || c == KeyEvent.VK_PERIOD) 
        {
            kontrol=true;
        }
        else
        {
            kontrol=false;
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_fiyat_textKeyTyped

    private void adet_textKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adet_textKeyTyped
        char c = evt.getKeyChar();

        if (c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_6 || c == KeyEvent.VK_7 || c == KeyEvent.VK_8 || c == KeyEvent.VK_9 || c == KeyEvent.VK_PERIOD) 
        {
            kontrol2=true;
        }
        else
        {
            kontrol2=false;
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_adet_textKeyTyped

    private void t_araKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_araKeyTyped
        char c = evt.getKeyChar();

        if (c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_6 || c == KeyEvent.VK_7 || c == KeyEvent.VK_8 || c == KeyEvent.VK_9 || c == KeyEvent.VK_PERIOD) 
        {
             getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_t_araKeyTyped
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new satin_al().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField adet_text;
    private javax.swing.JButton bnt_kayit;
    private javax.swing.JButton bnt_kayit1;
    public javax.swing.JTextField fiyat_text;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panel_sag;
    private javax.swing.JLabel son_fiyat_label;
    private javax.swing.JLabel son_fiyat_label1;
    private javax.swing.JLabel son_fiyat_label2;
    private javax.swing.JTextField t_ara;
    // End of variables declaration//GEN-END:variables
}
