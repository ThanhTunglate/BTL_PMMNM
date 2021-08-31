/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackgroundQL;

import Customtable.customSinhVien;
import static Customtable.model.listSV;
import DAO.ConnecttoSql;
import DAO.DaoSinhvien;
import DAO.DaoTaikhoan;
import Emtity.eSinhVien;
import Emtity.eTaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class SinhVien extends javax.swing.JPanel {

    /**
     * Creates new form 
     */
    DaoTaikhoan csdl = new DaoTaikhoan();
    public DaoSinhvien x = new DaoSinhvien();
    private String maSV, tenSV, maLH, gioiTinh, ngaySinh, diaChi, soDT;
    
    public SinhVien() {
        initComponents();
        radNam.setSelected(true);
        x.getAll();
        loadCbxMaLop();
        loadData();
    }
    
    private void loadData(){
        jTableSV.setModel(new customSinhVien(listSV));
    }
    
    private void loadCbxMaLop() {
        Connection conn = ConnecttoSql.getconConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM LopHoc");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cbxMaLop.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        cbxMaLop = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        radNam = new javax.swing.JRadioButton();
        radNu = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSV = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ THÔNG TIN SINH VIÊN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnSearch.setBackground(new java.awt.Color(0, 102, 102));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-icon.png"))); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-icon.png"))); // NOI18N
        jButton2.setText("Thêm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actions-edit-delete-icon.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
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

        btnSua.setBackground(new java.awt.Color(0, 102, 102));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actions-configure-toolbars-icon.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã sinh viên");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên sinh viên");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Giới tính");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ngày sinh");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Địa chỉ");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SĐT");

        cbxMaLop.setBackground(new java.awt.Color(0, 102, 102));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mã lớp");

        buttonGroup1.add(radNam);
        radNam.setText("Nam");

        buttonGroup1.add(radNu);
        radNu.setText("Nữ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(radNam)
                                .addGap(47, 47, 47)
                                .addComponent(radNu))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(txtMaSV, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(cbxMaLop, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jLabel8))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radNam)
                    .addComponent(radNu))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTableSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableSV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSua)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoa)
                            .addComponent(btnReset)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (txtMaSV.getText().trim().equals("") || txtName.getText().trim().equals("") || 
                txtDiaChi.getText().trim().equals("") || txtSDT.getText().trim().equals("") ) {
            String msg = "Không được để trống thông tin!";
            JOptionPane.showMessageDialog(null, msg, "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
        else{
            maSV = txtMaSV.getText();
            tenSV = txtName.getText();
            maLH = cbxMaLop.getSelectedItem().toString();
            gioiTinh = radNam.isSelected() ? "Nam" : "Nữ";
            ngaySinh = txtNgaySinh.getText();
            diaChi = txtDiaChi.getText();
            soDT = txtSDT.getText();
            ArrayList<eSinhVien> listCheck = new DaoSinhvien().CheckMaSV(maSV);
            eSinhVien sv = new eSinhVien(maSV, tenSV, maLH, gioiTinh, ngaySinh, diaChi, soDT);
            
            eTaiKhoan tk= new eTaiKhoan();
                tk.setTaikhoan(txtMaSV.getText());
                tk.setMatkhau(txtMaSV.getText()+"abc");
                tk.setLoai("Sinh viên");
                System.out.println(tk.getTaikhoan());
                
            if (listCheck.size() > 0) {
                JOptionPane.showMessageDialog(this, "Mã Sinh viên bị trùng", "Vui lòng kiểm tra lại", JOptionPane.ERROR_MESSAGE);
                txtMaSV.setText("");
                txtMaSV.requestFocus();

            } 
            else if(csdl.ThemTaiKhoan(tk)){
                new DaoSinhvien().addNew(sv);
                JOptionPane.showMessageDialog(this, "Thêm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        loadData();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTableSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSVMouseClicked
        // TODO add your handling code here:
        int index = jTableSV.getSelectedRow();
        eSinhVien sv = listSV.get(index);
        txtMaSV.setText(sv.getMasinhvien());
        txtName.setText(sv.getTensinhvien());
        cbxMaLop.setSelectedItem(sv.getMalop());
        txtNgaySinh.setText(sv.getNgaysinh());
        txtDiaChi.setText(sv.getDiachi());
        txtSDT.setText(sv.getSDT());
        if(sv.getGioitinh().equals("Nam")){
            radNam.setSelected(true);
        } else {radNu.setSelected(true);}
    }//GEN-LAST:event_jTableSVMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (jTableSV.getSelectedRow() == -1) {
            if (jTableSV.getRowCount() == 0) {
                String msg = "Danh sách trống !";
                JOptionPane.showMessageDialog(this, msg, "Thông báo", JOptionPane.ERROR_MESSAGE);
            } else {
                String msg = "Bạn hãy chọn 1 dòng để sửa !";
                JOptionPane.showMessageDialog(this, msg, "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            maSV = txtMaSV.getText();
            tenSV = txtName.getText();
            maLH = cbxMaLop.getSelectedItem().toString();
            gioiTinh = radNam.isSelected() ? "Nam" : "Nữ";
            ngaySinh = txtNgaySinh.getText();
            diaChi = txtDiaChi.getText();
            soDT = txtSDT.getText();
            eSinhVien sv = new eSinhVien(maSV, tenSV, maLH, gioiTinh, ngaySinh, diaChi, soDT);
            new DaoSinhvien().updateByMaSV(sv);
            JOptionPane.showMessageDialog(null, "Sửa thành công");
        }
        loadData();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
         if (jTableSV.getSelectedRow() == -1) {
            if (jTableSV.getRowCount() == 0) {
                String msg = "Danh sách trống !";
                JOptionPane.showMessageDialog(this, msg, "Thông báo", JOptionPane.ERROR_MESSAGE);
            } else {
                String msg = "Bạn hãy chọn 1 dòng để xóa !";
                JOptionPane.showMessageDialog(this, msg, "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            int b = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa sinh viên này không?", "Thông Báo", JOptionPane.YES_NO_OPTION);
            if (b == JOptionPane.YES_OPTION) {
                String masv = txtMaSV.getText();
                try {
                    new DaoSinhvien().deleteMaSV(masv);
                    JOptionPane.showMessageDialog(this, "Xóa thành công ", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    Logger.getLogger(SinhVien.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SinhVien.class.getName()).log(Level.SEVERE, null, ex);
                }
                txtMaSV.setEnabled(true);
            }
        }
        loadData();
        clearText();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (txtSearch.getText().trim().equals("")) {
            if (jTableSV.getRowCount()==0) {
                String msg = "Danh sách trống !";
                JOptionPane.showMessageDialog(this, msg, "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
            else{
                String msg = "Bạn hãy nhập mã sinh viên để tìm kiếm !";
                JOptionPane.showMessageDialog(this, msg, "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{ 
            new DaoSinhvien().findByMaSV(txtSearch.getText());
        }
        loadData();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        x.getAll();
        clearText();
        loadData();
    }//GEN-LAST:event_btnResetActionPerformed
    private void clearText(){
        txtMaSV.setText("");
        txtName.setText("");
        cbxMaLop.setSelectedIndex(1);
        txtNgaySinh.setText("");
        txtSDT.setText("");
        txtDiaChi.setText("");
        radNam.setSelected(true);
        txtMaSV.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxMaLop;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableSV;
    private javax.swing.JRadioButton radNam;
    private javax.swing.JRadioButton radNu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
