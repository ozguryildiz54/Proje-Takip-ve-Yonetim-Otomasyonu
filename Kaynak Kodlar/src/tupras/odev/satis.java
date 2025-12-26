package tupras.odev;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class satis extends javax.swing.JFrame 
{
    Connection baglanti=null;
    Statement st ;
    ResultSet rs;
    int satir_no=-1,satir_no2=-1;
    int id;
    String sirket_ad,tarih;
    double birim_fiyat,urun_adet=0.0,son_fiyat,kazanc,komisyon,komisyonlu_kazanc;
    int sayac2=0;
    Statement komut=null;
    Integer sayy=0;
    boolean kontrol=false,aa=true,kontrol1=false,kontrol2=false;
    public satis() 
    {
        initComponents();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");        
            baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/tupras_proje?autoReconnect=true&useSSL=false","root","0000"); //Mysql sunucusuna bağlandık
            st=baglanti.createStatement();
            rs = st.executeQuery("Select * from depo"); //Veritabanındaki tabloya bağlandık
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
        } 
        catch (ClassNotFoundException | SQLException hata) 
        {
             Object ex = null;
            Logger.getLogger(satin_al.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fiyat_text = new javax.swing.JTextField();
        adet_text = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kalan_adet_label = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ürün Sat");
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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Depodaki Satılacak Ürünler");

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Satış Yap");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Sıfırla");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Kazanç Degerini Güncelle");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Bakiye :");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 0));
        jLabel9.setText("0");

        jLabel10.setText(" も");

        fiyat_text.setText("0.0");
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

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kalan Ürün Adeti");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Birim Fiyat");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Satılacak Ürün Adeti");

        kalan_adet_label.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        kalan_adet_label.setForeground(new java.awt.Color(255, 255, 255));
        kalan_adet_label.setText("0");

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Güncellemeyi Geri Al");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(156, 156, 156)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(fiyat_text, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(adet_text, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kalan_adet_label)
                                    .addComponent(jLabel5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jButton5))
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kalan_adet_label)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fiyat_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(adet_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(0, 33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        menu form =new menu();
        form.show();
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        double fiyattt=0.0;
        int adettt=0;
        fiyattt=Double.parseDouble(fiyat_text.getText());
        adettt=Integer.valueOf(adet_text.getText());
        
        if(satir_no2>-1 && kalan_adet_label.getText()!="0" && kontrol==true)
       {
                        try 
                {  

                     Class.forName("com.mysql.jdbc.Driver");  
                     baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/tupras_proje?autoReconnect=true&useSSL=false","root","0000");        
                     st=baglanti.createStatement();
                     rs=st.executeQuery("SELECT COUNT(*) FROM satilanlar");
                     while(rs.next()) 
                     {
                       sayac2 = Integer.valueOf(rs.getString("count(*)"));
                     }
                     id=sayac2+1;
                     sirket_ad=String.valueOf(jTable1.getValueAt(satir_no2,1));
                     birim_fiyat=Double.parseDouble(String.valueOf(jTable1.getValueAt(satir_no2,2)));
                     urun_adet=Double.parseDouble(String.valueOf(adet_text.getText().toString()));
                     kazanc=Double.parseDouble(String.valueOf(jTable1.getValueAt(satir_no2,4)));
                     komisyon=Double.parseDouble(String.valueOf(jTable1.getValueAt(satir_no2,5)));
                     komisyonlu_kazanc=Double.parseDouble(String.valueOf(jTable1.getValueAt(satir_no2,6)));
                     tarih=String.valueOf(jTable1.getValueAt(satir_no2,7));          
                     rs=st.executeQuery("SELECT count(*) FROM satilanlar where sirket_ad='"+sirket_ad+"'");
                     
                     int sayac=0;
                     while(rs.next()) 
                     {
                       sayac = Integer.parseInt(rs.getString("count(*)"));
                     }
                     
                     int sayac4=0;
                     if(sayac==0)
                     {
                          rs=st.executeQuery("SELECT COUNT(*) FROM satilanlar");
                          while(rs.next()) 
                          {
                            sayac4 = Integer.parseInt(rs.getString("count(*)"));
                          }
                          
                          st.executeUpdate("insert into satilanlar(id,sirket_ad,birim_fiyat,urun_adet,kazanc,komisyon,komisyonlu_kazanc,tarih) values('"+(sayac4+1)+"','"+sirket_ad+"','"+birim_fiyat+"','"+urun_adet+"','"+kazanc+"','"+komisyon+"','"+komisyonlu_kazanc+"','"+tarih+"')");
                      }  
                     
                     if(sayac>0)
                      {                   
                          st.executeUpdate("update satilanlar set urun_adet=urun_adet+'"+urun_adet+"'where id='"+String.valueOf(satir_no)+"'");
                          rs=st.executeQuery("SELECT urun_adet FROM satilanlar where sirket_ad='"+sirket_ad+"'");
                          while(rs.next()) 
                          {
                            sayac4 = Integer.parseInt(rs.getString("urun_adet"));
                          }                
                          st.executeUpdate("update satilanlar set kazanc=kazanc+'"+kazanc+"'where id='"+String.valueOf(satir_no)+"'");
                          rs=st.executeQuery("SELECT kazanc FROM satilanlar where sirket_ad='"+sirket_ad+"'");
                          double kazancc=0.0;
                          while(rs.next()) 
                          {
                            kazancc = Double.parseDouble(rs.getString("kazanc"));
                          } 
                          double fiyat=kazancc/sayac4;
                          st.executeUpdate("update satilanlar set birim_fiyat='"+fiyat+"'where id='"+String.valueOf(satir_no)+"'");                       
                          st.executeUpdate("update satilanlar set komisyon=komisyon+'"+komisyon+"'where id='"+String.valueOf(satir_no)+"'");
                          st.executeUpdate("update satilanlar set komisyonlu_kazanc=komisyonlu_kazanc+'"+komisyonlu_kazanc+"'where id='"+String.valueOf(satir_no)+"'");
                          st.executeUpdate("update satilanlar set tarih='"+tarih+"'where id='"+String.valueOf(satir_no)+"'");
                      }                  
                   kalan_adet_label.setText("0");         
                   Double kar=0.0;
                   kar=Double.parseDouble(String.valueOf(jTable1.getValueAt(satir_no2,6)));
                   st.executeUpdate("update maliye set anapara=anapara+'"+kar+"'");
                   st.executeUpdate("update kar_zarar set toplam_kazanc=toplam_kazanc+'"+kar+"'");
                   st.executeUpdate("update depo set birim_fiyat='"+fiyat_text.getText()+"'where id='"+String.valueOf(satir_no)+"'");
                   st.executeUpdate("update depo set urun_adet='"+sayy+"'where id='"+String.valueOf(satir_no)+"'");
                   st.executeUpdate("update depo set kazanc=kazanc+'"+kazanc+"'where id='"+String.valueOf(satir_no)+"'");
                   st.executeUpdate("update depo set komisyon=komisyon+'"+komisyon+"'where id='"+String.valueOf(satir_no)+"'");
                   st.executeUpdate("update depo set komisyonlu_kazanc=komisyonlu_kazanc+'"+komisyonlu_kazanc+"'where id='"+String.valueOf(satir_no)+"'");
                   st.executeUpdate("update depo set tarih='"+tarih+"'where id='"+String.valueOf(satir_no)+"'");

                   rs=st.executeQuery("SELECT urun_adet FROM depo where id='"+String.valueOf(satir_no)+"'");
                   int a = 0;
                   while(rs.next())
                     {
                         a=Integer.valueOf(rs.getString("urun_adet"));
                     }
                   if(a==0)
                   {
                       st.executeUpdate("delete from depo where id='"+String.valueOf(satir_no)+"'"); 
                       st.executeUpdate("update depo set id=id-1 where id>'"+String.valueOf(satir_no)+"'");
                   }
                      rs=st.executeQuery("SELECT COUNT(*) FROM depo");
                     rs = st.executeQuery("Select * from depo");  //Veritabanındaki tabloya bağlandık
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
                      if (st.execute("Select sirket_ad from depo where sirket_ad is null")==false ) 
                     {st.executeUpdate("update depo set id=0 where id !=null");}
                    kontrol=false;
                    kalan_adet_label.setText("0");
                    fiyat_text.setText("0.0");
                    adet_text.setText("0");
                    satir_no2=-1;
                    aa=true;
                    JOptionPane.showMessageDialog(null,"Ürün satışı başarılı.","Bilgilendirme",JOptionPane.WARNING_MESSAGE);
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
                    kontrol=false;
        }
       else
       {
           JOptionPane.showMessageDialog(null,"Aşağıdaki işlemleri yaptığınızdan emin olunuz!\n1-Fiyat ve Urun Adeti Bilgisi Giriniz.\n2-Satır Seçiniz.\n3-Kazanc Güncelle Butonuna Basınız.","Hata",JOptionPane.WARNING_MESSAGE);
       }
           
           
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try
        {
          satir_no=jTable1.getSelectedRow();
          satir_no2=jTable1.getSelectedRow();
          String table_click=(jTable1.getModel().getValueAt(satir_no,0).toString());
          satir_no=Integer.valueOf(table_click);
          kalan_adet_label.setText(jTable1.getValueAt(satir_no2,3).toString());
        }
        catch(Exception a)
        {
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Object [] sifirla = {"Evet","Hayır"}; // Obje Dizisi Oluşturduk
        String message = "Silmek istediğinizden emin misiniz?"; // Verilecek Mesaj
        String title = "Dikkat!!"; // Pencere Başlığı
        int silme = JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE,null, sifirla, null);
        if (silme == JOptionPane.YES_OPTION )
        {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/tupras_proje?autoReconnect=true&useSSL=false","root","0000");
                komut=(Statement) baglanti.createStatement();
                komut.executeUpdate("TRUNCATE tupras_proje.depo");
                rs = komut.executeQuery("Select * from depo");  //Veritabanındaki tabloya bağlandık
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
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        if(kontrol1==true && kontrol2==true && satir_no2>-1)
        {
            double say=Double.valueOf(String.valueOf(jTable1.getValueAt(satir_no2,3)));
            double say2=Double.valueOf(adet_text.getText());
                if(say>=say2)
                {
                    kontrol=true;
                    String adet_s = jTable1.getValueAt(satir_no2,3).toString(); //tablodan adet bilgisi alınır
                    Double adet_d=Double.parseDouble(adet_s);   
                    int adet2 = Integer.valueOf(String.valueOf(adet_text.getText()));
                    sayy =adet_d.intValue();
                    sayy-=adet2;
                    jTable1.setValueAt(String.valueOf(adet2), satir_no2,3);
                    kazanc=Double.parseDouble(fiyat_text.getText())*Double.parseDouble(adet_text.getText());
                    jTable1.setValueAt(String.valueOf(kazanc), satir_no2,4);
                    jTable1.setValueAt(fiyat_text.getText(), satir_no2,2);
                    komisyon=kazanc*0.002;
                    kazanc=kazanc-komisyon;
                    jTable1.setValueAt(String.valueOf(komisyon), satir_no2,5);
                    jTable1.setValueAt(String.valueOf(kazanc), satir_no2,6);
                    if(aa==true)
                    {kalan_adet_label.setText(String.valueOf(sayy));}
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Urun adetini depodakiden daha fazla girdiniz tekrar deneyin!","Hata",JOptionPane.WARNING_MESSAGE);
                }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Aşağıdaki işlemleri yaptığınızdan emin olunuz!\n1-Fiyat ve Urun Adeti Bilgisi Giriniz.\n2-Satır Seçiniz.","Bilgilendirme",JOptionPane.WARNING_MESSAGE);
        } 
        aa=false;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void fiyat_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiyat_textMouseClicked
        fiyat_text.setText("");
        kontrol1=false;
    }//GEN-LAST:event_fiyat_textMouseClicked

    private void fiyat_textKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fiyat_textKeyTyped
        char c = evt.getKeyChar();

        if (c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_6 || c == KeyEvent.VK_7 || c == KeyEvent.VK_8 || c == KeyEvent.VK_9 || c == KeyEvent.VK_PERIOD)
        {
            kontrol1=true;
        }
        else
        {
            getToolkit().beep();
            evt.consume();
            kontrol1=false;
        }
    }//GEN-LAST:event_fiyat_textKeyTyped

    private void adet_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adet_textMouseClicked
        adet_text.setText("");
        kontrol2=false;
    }//GEN-LAST:event_adet_textMouseClicked

    private void adet_textKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adet_textKeyTyped
        char c = evt.getKeyChar();

        if (c == KeyEvent.VK_0 || c == KeyEvent.VK_1 || c == KeyEvent.VK_2 || c == KeyEvent.VK_3 || c == KeyEvent.VK_4 || c == KeyEvent.VK_5 || c == KeyEvent.VK_6 || c == KeyEvent.VK_7 || c == KeyEvent.VK_8 || c == KeyEvent.VK_9)
        {
               kontrol2=true;
        }
        else
        {
            getToolkit().beep();
            evt.consume();
            kontrol2=false;
        }
    }//GEN-LAST:event_adet_textKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try
        {
            Class.forName("com.mysql.jdbc.Driver");        
            baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/tupras_proje?autoReconnect=true&useSSL=false","root","0000"); //Mysql sunucusuna bağlandık
            st=baglanti.createStatement();
            rs = st.executeQuery("Select * from depo"); //Veritabanındaki tabloya bağlandık
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
            kontrol=false;
                    kalan_adet_label.setText("0");
                    fiyat_text.setText("0.0");
                    adet_text.setText("0");
                    satir_no2=-1;
                    aa=true;
        } 
        catch (ClassNotFoundException | SQLException hata) 
        {
             Object ex = null;
            Logger.getLogger(satin_al.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(satis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(satis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(satis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(satis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new satis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField adet_text;
    public javax.swing.JTextField fiyat_text;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel kalan_adet_label;
    // End of variables declaration//GEN-END:variables
}
