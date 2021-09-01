/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackgroundQL;

import Amain.DangNhap;
import javax.swing.JOptionPane;

/**
 *
 * @author thanh
 */
public class BgrQuanly extends javax.swing.JFrame {
    Monhoc MH;
    SinhVien SV;
    Lophoc LH;
    Taichinh TC;
    Giangvien GV;
    Diem d;
    Taikhoan tk;
    HocPhan hp;
    /**
     * Creates new form BgrQuanly
     */
    public BgrQuanly() {
        int a = 2;
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public int index;
    public String cc;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnMonhoc = new javax.swing.JButton();
        btnLophoc = new javax.swing.JButton();
        btnSinhvien = new javax.swing.JButton();
        btnTaichinh = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnDiem = new javax.swing.JButton();
        btnTaikhoan = new javax.swing.JButton();
        btnHocphan = new javax.swing.JButton();
        tabbed = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnitemDangxuat = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jToolBar1.setBackground(new java.awt.Color(0, 102, 102));
        jToolBar1.setRollover(true);

        btnMonhoc.setBackground(new java.awt.Color(0, 102, 102));
        btnMonhoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book.png"))); // NOI18N
        btnMonhoc.setText("Môn học");
        btnMonhoc.setFocusable(false);
        btnMonhoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMonhoc.setMargin(new java.awt.Insets(2, 30, 2, 30));
        btnMonhoc.setName("btnMonHoc"); // NOI18N
        btnMonhoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMonhoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonhocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMonhoc);

        btnLophoc.setBackground(new java.awt.Color(0, 102, 102));
        btnLophoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Science-Classroom-icon.png"))); // NOI18N
        btnLophoc.setText("Lớp học");
        btnLophoc.setFocusable(false);
        btnLophoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLophoc.setMargin(new java.awt.Insets(2, 30, 2, 30));
        btnLophoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLophoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLophocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLophoc);

        btnSinhvien.setBackground(new java.awt.Color(0, 102, 102));
        btnSinhvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/student-icon.png"))); // NOI18N
        btnSinhvien.setText("Sinh viên");
        btnSinhvien.setFocusable(false);
        btnSinhvien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSinhvien.setMargin(new java.awt.Insets(2, 30, 2, 30));
        btnSinhvien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSinhvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinhvienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSinhvien);

        btnTaichinh.setBackground(new java.awt.Color(0, 102, 102));
        btnTaichinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cash-icon.png"))); // NOI18N
        btnTaichinh.setText("Tài chính");
        btnTaichinh.setFocusable(false);
        btnTaichinh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTaichinh.setMargin(new java.awt.Insets(2, 30, 2, 30));
        btnTaichinh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTaichinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaichinhActionPerformed(evt);
            }
        });
        jToolBar1.add(btnTaichinh);

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teacher-icon.png"))); // NOI18N
        jButton5.setText("Giảng viên");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setMargin(new java.awt.Insets(2, 30, 2, 30));
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        btnDiem.setBackground(new java.awt.Color(0, 102, 102));
        btnDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/diploma-icon.png"))); // NOI18N
        btnDiem.setText("Điểm");
        btnDiem.setFocusable(false);
        btnDiem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDiem.setMargin(new java.awt.Insets(2, 30, 2, 30));
        btnDiem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiemActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDiem);

        btnTaikhoan.setBackground(new java.awt.Color(0, 102, 102));
        btnTaikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/preferences-desktop-online-accounts-icon.png"))); // NOI18N
        btnTaikhoan.setText("Tài khoản");
        btnTaikhoan.setFocusable(false);
        btnTaikhoan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTaikhoan.setMargin(new java.awt.Insets(2, 30, 2, 30));
        btnTaikhoan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaikhoanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnTaikhoan);

        btnHocphan.setBackground(new java.awt.Color(0, 102, 102));
        btnHocphan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Get-Info-icon.png"))); // NOI18N
        btnHocphan.setText("Học phần");
        btnHocphan.setFocusable(false);
        btnHocphan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHocphan.setMargin(new java.awt.Insets(2, 30, 2, 30));
        btnHocphan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHocphan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHocphanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHocphan);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 1193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tabbed.setName("tablepane"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 1294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbed, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 153, 0));

        jMenu1.setText("File");

        mnitemDangxuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnitemDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login-out-icon.png"))); // NOI18N
        mnitemDangxuat.setText("Đăng xuất");
        mnitemDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitemDangxuatActionPerformed(evt);
            }
        });
        jMenu1.add(mnitemDangxuat);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMonhocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonhocActionPerformed
        if(index==0)
            JOptionPane.showMessageDialog(this, "Tài khoản không có quyền truy cập", "!", JOptionPane.ERROR_MESSAGE);
        else 
        {
            if(MH==null){
                MH= new Monhoc();
                tabbed.addTab("Quản lý môn học", MH);
                tabbed.setSelectedComponent(MH);
            }
            else
            {
                tabbed.remove(MH);
                MH=null;
            }
        }
    }//GEN-LAST:event_btnMonhocActionPerformed

    private void btnSinhvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinhvienActionPerformed
        if(index==0)
            JOptionPane.showMessageDialog(this, "Tài khoản không có quyền truy cập", "!", JOptionPane.ERROR_MESSAGE);
        else 
        {
            if(SV==null){
                SV= new SinhVien();
                tabbed.addTab("Quản lý thông tin sinh viên", SV);
                tabbed.setSelectedComponent(SV);
            }
            else
            {
                tabbed.remove(SV);
                SV=null;
            }
        }
    }//GEN-LAST:event_btnSinhvienActionPerformed

    private void btnLophocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLophocActionPerformed
        if(index==0)
            JOptionPane.showMessageDialog(this, "Tài khoản không có quyền truy cập", "!", JOptionPane.ERROR_MESSAGE);
        else 
        {
            if(LH==null){
                LH= new Lophoc();
                tabbed.addTab("Quản lý lớp học", LH);
                tabbed.setSelectedComponent(LH);
            }
            else
            {
                tabbed.remove(LH);
                LH=null;
            }
        }
    }//GEN-LAST:event_btnLophocActionPerformed

    private void btnTaichinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaichinhActionPerformed
        if(index==0)
            JOptionPane.showMessageDialog(this, "Tài khoản không có quyền truy cập", "!", JOptionPane.ERROR_MESSAGE);
        else 
        {
            if(TC==null){
                TC= new Taichinh();
                tabbed.addTab("Quản lý tài chính", TC);
                tabbed.setSelectedComponent(TC);
            }
            else
            {
                tabbed.remove(TC);
                TC=null;
            }
        }
    }//GEN-LAST:event_btnTaichinhActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(GV==null ){
            GV= new Giangvien();
            tabbed.addTab("Quản lý thông tin giảng viên", GV);
            tabbed.setSelectedComponent(GV);
        }
        else
        {
            tabbed.remove(GV);
            GV=null;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiemActionPerformed

        if(d==null){
            d= new Diem();
            tabbed.addTab("Quản lý điểm", d);
            tabbed.setSelectedComponent(d);
        }
        else
        {
            tabbed.remove(d);
            d=null;
        }
    }//GEN-LAST:event_btnDiemActionPerformed

    private void btnTaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaikhoanActionPerformed
        if(index==0)
            JOptionPane.showMessageDialog(this, "Tài khoản không có quyền truy cập", "!", JOptionPane.ERROR_MESSAGE);
        else 
        {
            if(tk==null){
                tk= new Taikhoan();
                tabbed.addTab("Quản tài khoản", tk);
                tabbed.setSelectedComponent(tk);
            }
            else
            {
                tabbed.remove(tk);
                tk=null;
            }
        }
    }//GEN-LAST:event_btnTaikhoanActionPerformed

    private void mnitemDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitemDangxuatActionPerformed
        DangNhap d= new DangNhap();
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnitemDangxuatActionPerformed

    private void btnHocphanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHocphanActionPerformed
        if(index==0)
            JOptionPane.showMessageDialog(this, "Tài khoản không có quyền truy cập", "!", JOptionPane.ERROR_MESSAGE);
        else 
        {
            if(hp==null){
                hp= new HocPhan();
                tabbed.addTab("Quản học phần", hp);
                tabbed.setSelectedComponent(hp);
            }
            else
            {
                tabbed.remove(hp);
                hp=null;
            }
        }
    }//GEN-LAST:event_btnHocphanActionPerformed

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
            java.util.logging.Logger.getLogger(BgrQuanly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BgrQuanly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BgrQuanly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BgrQuanly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BgrQuanly().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiem;
    private javax.swing.JButton btnHocphan;
    private javax.swing.JButton btnLophoc;
    private javax.swing.JButton btnMonhoc;
    private javax.swing.JButton btnSinhvien;
    private javax.swing.JButton btnTaichinh;
    private javax.swing.JButton btnTaikhoan;
    private javax.swing.JButton jButton5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mnitemDangxuat;
    private javax.swing.JTabbedPane tabbed;
    // End of variables declaration//GEN-END:variables
}
