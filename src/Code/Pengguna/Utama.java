/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code.Pengguna;

import Code.Login;
import Code.Pengguna.Fiture.System.PihakKetiga;

/**
 *
 * @author Kintan Khairunnisa(1402019052)
 * @author Muhammad Rizky Yuhari(1402019075)
 * @author Rangga Pujangga(1402019090)
 * @author Muhamad Rifqi(1402019058)

 */
public class Utama extends javax.swing.JFrame {

    /**
     * Creates new form Utama
     */
    public Utama() {
        initComponents();
    }

    public Utama(String nama, String username, String email, String noHP, String jenisKelamin, String alamat, String password) {
        initComponents();
        this.nama = nama;
        this.username = username;
        this.email = email;
        this.noHP = noHP;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.password = password; 
//        varNama.setText(nama);
        new PihakKetiga(layarTancep, new Code.Pengguna.Fiture.Home(nama, username, email, noHP, jenisKelamin, alamat, password));

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        masuk = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        Home1 = new javax.swing.JLabel();
        slide = new javax.swing.JPanel();
        Profile3 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        Profile2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Home = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Profile = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        pOrder = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        Profile1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        layar = new javax.swing.JPanel();
        formALL = new javax.swing.JScrollPane();
        layarTancep = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 71, 221), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dashboard - iRepair");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 15, 300, -1));

        masuk.setBackground(new java.awt.Color(51, 51, 51));
        masuk.setForeground(new java.awt.Color(255, 255, 255));
        masuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Menu_25px_2.png"))); // NOI18N
        masuk.setBorder(null);
        masuk.setContentAreaFilled(false);
        masuk.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        masuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masukMouseClicked(evt);
            }
        });
        masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukActionPerformed(evt);
            }
        });
        jPanel4.add(masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        keluar.setBackground(new java.awt.Color(51, 51, 51));
        keluar.setForeground(new java.awt.Color(204, 204, 204));
        keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Menu_25px_2.png"))); // NOI18N
        keluar.setBorder(null);
        keluar.setContentAreaFilled(false);
        keluar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keluarMouseClicked(evt);
            }
        });
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jPanel4.add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        Home1.setFont(new java.awt.Font("Kristen ITC", 1, 19)); // NOI18N
        Home1.setForeground(new java.awt.Color(255, 255, 255));
        Home1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N
        Home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home1MouseClicked(evt);
            }
        });
        jPanel4.add(Home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 40, 60));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 1060, 60));

        slide.setBackground(new java.awt.Color(102, 153, 255));
        slide.setLayout(null);

        Profile3.setFont(new java.awt.Font("Kristen ITC", 1, 19)); // NOI18N
        Profile3.setForeground(new java.awt.Color(255, 255, 255));
        Profile3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        Profile3.setText("     Keluar");
        Profile3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Profile3MouseClicked(evt);
            }
        });
        slide.add(Profile3);
        Profile3.setBounds(20, 530, 170, 60);
        slide.add(jSeparator6);
        jSeparator6.setBounds(90, 570, 70, 10);

        Profile2.setFont(new java.awt.Font("Kristen ITC", 1, 19)); // NOI18N
        Profile2.setForeground(new java.awt.Color(255, 255, 255));
        Profile2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/history.png"))); // NOI18N
        Profile2.setText("     Riwayat");
        Profile2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Profile2MouseClicked(evt);
            }
        });
        slide.add(Profile2);
        Profile2.setBounds(20, 250, 170, 60);
        slide.add(jSeparator3);
        jSeparator3.setBounds(90, 290, 70, 10);

        Home.setFont(new java.awt.Font("Kristen ITC", 1, 19)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconsw8_Home_25px.png"))); // NOI18N
        Home.setText("     Home");
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        slide.add(Home);
        Home.setBounds(20, 60, 170, 60);
        slide.add(jSeparator1);
        jSeparator1.setBounds(90, 110, 70, 10);

        Profile.setFont(new java.awt.Font("Kristen ITC", 1, 19)); // NOI18N
        Profile.setForeground(new java.awt.Color(255, 255, 255));
        Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        Profile.setText("     Profile");
        Profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileMouseClicked(evt);
            }
        });
        slide.add(Profile);
        Profile.setBounds(20, 185, 170, 60);
        slide.add(jSeparator2);
        jSeparator2.setBounds(90, 230, 70, 10);

        pOrder.setFont(new java.awt.Font("Kristen ITC", 1, 19)); // NOI18N
        pOrder.setForeground(new java.awt.Color(255, 255, 255));
        pOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check-lists.png"))); // NOI18N
        pOrder.setText("     Order");
        pOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pOrderMouseClicked(evt);
            }
        });
        slide.add(pOrder);
        pOrder.setBounds(20, 120, 170, 60);
        slide.add(jSeparator4);
        jSeparator4.setBounds(90, 170, 70, 10);

        Profile1.setFont(new java.awt.Font("Kristen ITC", 1, 19)); // NOI18N
        Profile1.setForeground(new java.awt.Color(255, 255, 255));
        Profile1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        Profile1.setText("     Profile");
        Profile1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Profile1MouseClicked(evt);
            }
        });
        slide.add(Profile1);
        Profile1.setBounds(20, 185, 170, 60);
        slide.add(jSeparator5);
        jSeparator5.setBounds(90, 170, 70, 10);

        jPanel2.add(slide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 590));

        layar.setBackground(new java.awt.Color(255, 255, 255));
        layar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formALL.setBackground(new java.awt.Color(255, 255, 255));
        formALL.setBorder(null);

        layarTancep.setBackground(new java.awt.Color(255, 255, 255));
        layarTancep.setLayout(new javax.swing.BoxLayout(layarTancep, javax.swing.BoxLayout.LINE_AXIS));
        formALL.setViewportView(layarTancep);

        layar.add(formALL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 550));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        layar.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        jPanel2.add(layar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 990, 530));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void masukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masukMouseClicked
        // TODO add your handling code here:
        masuk.setVisible(false);
        Thread th=new Thread(){
            @Override
            public void run (){
                try{
                    for(int a=0;a<=19;a++){
                        Thread.sleep(40);
                        if (a==1){slide.setSize(70,590);layar.setLocation(70,60);}
                        if (a==2){slide.setSize(80,590);layar.setLocation(80,60);}
                        if (a==3){slide.setSize(90,590);layar.setLocation(90,60);}
                        if (a==4){slide.setSize(100,590);layar.setLocation(100,60);}
                        if (a==5){slide.setSize(110,590);layar.setLocation(110,60);}
                        if (a==6){slide.setSize(120,590);layar.setLocation(120,60);}
                        if (a==7){slide.setSize(130,590);layar.setLocation(130,60);}
                        if (a==8){slide.setSize(140,590);layar.setLocation(140,60);}
                        if (a==9){slide.setSize(150,590);layar.setLocation(150,60);}
                        if (a==10){slide.setSize(160,590);layar.setLocation(160,60);}
                        if (a==11){slide.setSize(170,590);layar.setLocation(170,60);}
                        if (a==12){slide.setSize(180,590);layar.setLocation(180,60);}
                        if (a==13){slide.setSize(190,590);layar.setLocation(190,60);}
                        if (a==14){slide.setSize(200,590);layar.setLocation(200,60);}
                        if (a==15){slide.setSize(210,590);layar.setLocation(210,60);}
                        if (a==16){slide.setSize(220,590);layar.setLocation(220,60);}
                        if (a==17){slide.setSize(230,590);layar.setLocation(230,60);}
                        if (a==18){slide.setSize(240,590);layar.setLocation(240,60);}

                    }
                }catch (Exception ex){
                    System.out.println(ex);
                }
            }
        };th.start();
        keluar.setVisible(true);

    }//GEN-LAST:event_masukMouseClicked

    private void masukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masukActionPerformed

    private void keluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluarMouseClicked
        // TODO add your handling code here:
        Thread th=new Thread(){
            @Override
            public void run (){
                try{
                    for(int a=0;a<=18;a++){
                        Thread.sleep(20);
                        if (a==1){slide.setSize(240,590);layar.setLocation(240,60);}
                        if (a==2){slide.setSize(230,590);layar.setLocation(230,60);}
                        if (a==3){slide.setSize(220,590);layar.setLocation(220,60);}
                        if (a==4){slide.setSize(210,590);layar.setLocation(210,60);}
                        if (a==5){slide.setSize(200,590);layar.setLocation(200,60);}
                        if (a==6){slide.setSize(190,590);layar.setLocation(190,60);}
                        if (a==7){slide.setSize(180,590);layar.setLocation(180,60);}
                        if (a==8){slide.setSize(170,590);layar.setLocation(170,60);}
                        if (a==9){slide.setSize(160,590);layar.setLocation(160,60);}
                        if (a==10){slide.setSize(150,590);layar.setLocation(150,60);}
                        if (a==11){slide.setSize(140,590);layar.setLocation(140,60);}
                        if (a==12){slide.setSize(130,590);layar.setLocation(130,60);}
                        if (a==13){slide.setSize(120,590);layar.setLocation(120,60);}
                        if (a==14){slide.setSize(110,590);layar.setLocation(110,60);}
                        if (a==15){slide.setSize(100,590);layar.setLocation(100,60);}
                        if (a==16){slide.setSize(90,590);layar.setLocation(90,60);}
                        if (a==17){slide.setSize(80,590);layar.setLocation(80,60);}
                        if (a==18){slide.setSize(70,590);layar.setLocation(70,60);}
                        keluar.setVisible(false);
                        masuk.setVisible(true);
                    }
                }catch (Exception ex){
                    System.out.println(ex);
                }
            }
        };th.start();
    }//GEN-LAST:event_keluarMouseClicked

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keluarActionPerformed

    private void ProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseClicked
        // TODO add your handling code here:
        new PihakKetiga(layarTancep, new Code.Pengguna.Fiture.Profile(nama, username, email, noHP, jenisKelamin, alamat, password));
    }//GEN-LAST:event_ProfileMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        new PihakKetiga(layarTancep, new Code.Pengguna.Fiture.Home(nama, username, email, noHP, jenisKelamin, alamat, password));
    }//GEN-LAST:event_HomeMouseClicked

    private void pOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pOrderMouseClicked
        // TODO add your handling code here:
        new PihakKetiga(layarTancep, new Code.Pengguna.Fiture.Order(nama, username, email, noHP, jenisKelamin, alamat, password));
    }//GEN-LAST:event_pOrderMouseClicked

    private void Profile1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Profile1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Profile1MouseClicked

    private void Profile2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Profile2MouseClicked
        // TODO add your handling code here:
        new PihakKetiga(layarTancep, new Code.Pengguna.Fiture.Riwayat(nama, username, email, noHP, jenisKelamin, alamat, password));
    }//GEN-LAST:event_Profile2MouseClicked

    private void Profile3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Profile3MouseClicked
        // TODO add your handling code here:
        Login.main(null);
        dispose();
    }//GEN-LAST:event_Profile3MouseClicked

    private void Home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home1MouseClicked
        // TODO add your handling code here:
        About puntrn = new About(nama, username, email, noHP, jenisKelamin, alamat, password);
        puntrn.setVisible(true);
    }//GEN-LAST:event_Home1MouseClicked

    /**
     * @param args the command line arguments
     */
    private String nama;
    private String username;
    private String email;
    private String noHP;
    private String jenisKelamin;
    private String password;
    private String alamat;
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
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Home1;
    private javax.swing.JLabel Profile;
    private javax.swing.JLabel Profile1;
    private javax.swing.JLabel Profile2;
    private javax.swing.JLabel Profile3;
    public javax.swing.JScrollPane formALL;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton keluar;
    private javax.swing.JPanel layar;
    public javax.swing.JPanel layarTancep;
    private javax.swing.JButton masuk;
    private javax.swing.JLabel pOrder;
    private javax.swing.JPanel slide;
    // End of variables declaration//GEN-END:variables
}
