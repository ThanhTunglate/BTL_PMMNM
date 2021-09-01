/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackgroundQL;

import Customtable.customTaiKhoan;
import DAO.DaoTaikhoan;
import Emtity.eTaiKhoan;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author thanh
 */
public class Taikhoan extends javax.swing.JPanel {
    
    DaoTaikhoan csdl = new DaoTaikhoan();
    ArrayList<eTaiKhoan> list;
    public Taikhoan() {
        initComponents();
        HienThi();
    }
    
    public void HienThi(){
        list = csdl.getListTaiKhoan();
        tableTaiKhoan.setModel(new customTaiKhoan(list));  
    }
    
    public void Them(){
        eTaiKhoan t= new eTaiKhoan();
        if(txtTaikhoan.getText()!="" || txtMatKhau.getText()!=""){
            t.setTaikhoan(txtTaikhoan.getText());
            t.setMatkhau(txtMatKhau.getText());
            if(jComboBox1.getSelectedIndex()==0){
                t.setLoai("Sinh viên");
            }
            else
               t.setLoai("Giảng viên");
            if(csdl.ThemTaiKhoan(t)){
                list.add(t);
                JOptionPane.showMessageDialog(this, "Thêm thành công","", JOptionPane.INFORMATION_MESSAGE);
                HienThi();
            }
            else
                JOptionPane.showMessageDialog(this, "Tên tài khoản đã tồn tại!\n Vui lòng nhập tên tài khoản khác!", "", JOptionPane.WARNING_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(this,"Không được bỏ trống!","",JOptionPane.WARNING_MESSAGE);
    }
    
    public void Xoa(){
        int i = tableTaiKhoan.getSelectedRow();
        if(i<0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn tài khoản cần xóa", "", JOptionPane.WARNING_MESSAGE);
        }
        else{
            int response =JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa?","",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(response == JOptionPane.YES_OPTION){
                csdl.XoaTaiKhoan(list.get(i).getTaikhoan());
                HienThi();
                JOptionPane.showMessageDialog(this, "Xóa thành công","",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    public void Sua(){
        int n= tableTaiKhoan.getSelectedRow();
        eTaiKhoan x= list.get(n);
        eTaiKhoan t= new eTaiKhoan();
        if(txtTaikhoan.getText()!="" || txtMatKhau.getText()!=""){
            t.setTaikhoan(txtTaikhoan.getText());
            t.setMatkhau(txtMatKhau.getText());
            if(jComboBox1.getSelectedIndex()==0){
                t.setLoai("Sinh viên");
            }
            else
               t.setLoai("Giảng viên");
            if(csdl.SuaTaiKhoan(x, t)){
                JOptionPane.showMessageDialog(this, "Sửa tài khoản thành công!", "", JOptionPane.INFORMATION_MESSAGE);
                HienThi();
            }
            else
                JOptionPane.showMessageDialog(this, "Tên tài khoản đã tồn tại!\n Vui lòng nhập tên tài khoản khác!", "", JOptionPane.WARNING_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(this,"Không được bỏ trống!","",JOptionPane.WARNING_MESSAGE);
        
    }
    
    public void Tim(){
        if(txtTimkiem.getText()==""){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập tìm kiếm!","",JOptionPane.WARNING_MESSAGE);
        }
        else{
            eTaiKhoan t = csdl.TimKiem(txtTimkiem.getText());
            ArrayList<eTaiKhoan> a = new ArrayList<>();
            a.add(t);
            tableTaiKhoan.setModel(new customTaiKhoan(a));
        }
    }
    
    public void Xoatrang(){
        txtMatKhau.setText("");
        txtTaikhoan.setText("");
        txtTennguoidung.setText("");
        txtTimkiem.setText("");
        jComboBox1.setSelectedIndex(0);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTaiKhoan = new javax.swing.JTable();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtTimkiem = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTaikhoan = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JTextField();
        txtTennguoidung = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        btnThem = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ TÀI KHOẢN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(426, 426, 426)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        tableTaiKhoan.setBackground(new java.awt.Color(0, 102, 102));
        tableTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tableTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Tài khoản", "Mật khẩu", "Loại tài khoản"
            }
        ));
        tableTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTaiKhoanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTaiKhoan);

        btnXoa.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actions-edit-delete-icon.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(0, 102, 102));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actions-configure-toolbars-icon.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnTimKiem.setBackground(new java.awt.Color(0, 102, 102));
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-icon.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 102, 102));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Reset-icon.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tên tài khoản");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mật khẩu");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tên người dùng");

        txtTennguoidung.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Loại tài khoản");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sinh viên", "Giảng viên" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTaikhoan)
                    .addComponent(txtTennguoidung)
                    .addComponent(txtMatKhau)
                    .addComponent(jComboBox1, 0, 295, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTennguoidung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        btnThem.setBackground(new java.awt.Color(0, 102, 102));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-icon.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(95, 95, 95)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        Sua();
        HienThi();
        Xoatrang();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        Them();
        Xoatrang();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        Xoa();
        Xoatrang();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        Xoatrang();
        HienThi();
    }//GEN-LAST:event_btnResetActionPerformed

    private void tableTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTaiKhoanMouseClicked
        int n= tableTaiKhoan.getSelectedRow();
        eTaiKhoan x= list.get(n);
        txtTaikhoan.setText(x.getTaikhoan());
        txtMatKhau.setText( x.getMatkhau());
        if(x.getLoai().equals("Sinh viên")){
            jComboBox1.setSelectedIndex(0);
        }
        else
            jComboBox1.setSelectedIndex(1);
    }//GEN-LAST:event_tableTaiKhoanMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        
    }//GEN-LAST:event_btnTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableTaiKhoan;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtTaikhoan;
    private javax.swing.JTextField txtTennguoidung;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
}
