/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code.Pengguna.Fiture;

/**
 *
 * @author Kintan Khairunnisa(1402019052)
 * @author Muhammad Rizky Yuhari(1402019075)
 * @author Rangga Pujangga(1402019090)
 * @author Muhamad Rifqi(1402019058)

 */
public class Home extends javax.swing.JPanel {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    public Home(String nama, String username, String email, String noHP, String jenisKelamin, String alamat, String password) {
        initComponents();
        this.nama = nama;
        this.username = username;
        this.email = email;
        this.noHP = noHP;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.password = password;
        varNama.setText("Hallo "+nama+", Terimakasih anda sudah mau menggunakan aplikasi kami.\n");
        varGanti.setText("Semoga jasa kami bisa membantu anda dalam menservice iPhone kesayangan anda.");

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        varGanti = new javax.swing.JLabel();
        varNama = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setAlignmentX(0.9F);
        jSeparator3.setAlignmentY(0.9F);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-37, 44, 1050, 10));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        varGanti.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        varGanti.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(varGanti);
        varGanti.setBounds(0, 96, 810, 20);

        varNama.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        varNama.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        varNama.setToolTipText("");
        jPanel1.add(varNama);
        varNama.setBounds(0, 80, 810, 20);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selamat Datang Di iRepair");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 40, 295, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(128, 128, 131));
        jLabel4.setText("Dashboard");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 410, 50);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 750, 480));
    }// </editor-fold>//GEN-END:initComponents

    private String nama;
    private String username;
    private String email;
    private String noHP;
    private String jenisKelamin;
    private String alamat;
    private String password;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel varGanti;
    private javax.swing.JLabel varNama;
    // End of variables declaration//GEN-END:variables
}
