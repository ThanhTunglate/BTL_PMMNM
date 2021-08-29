/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Customtable.model;
import Emtity.eSinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DaoSinhvien {
     private Connection conn;
 
     public void getAll() {
        model.listSV.clear();;
        PreparedStatement ps = null;
        ResultSet rs = null;
        conn = ConnecttoSql.getconConnection();
        try {
            ps = conn.prepareStatement("SELECT * FROM SinhVien");
            rs = ps.executeQuery();
            while (rs.next()) {
                eSinhVien sv = new eSinhVien();
                sv.setMasinhvien(rs.getString(1));
                sv.setTensinhvien(rs.getString(2));
                sv.setMalop(rs.getString(3));
                sv.setGioitinh(rs.getString(4));
                sv.setNgaysinh(rs.getString(5));
                sv.setDiachi(rs.getString(6));
                sv.setSDT(rs.getString(7));
                model.listSV.add(sv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
     public void addNew(eSinhVien sv) {
        PreparedStatement ps = null;
        conn = ConnecttoSql.getconConnection();

        try {
            ps = conn.prepareStatement("INSERT INTO SinhVien VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, sv.getMasinhvien().toString());
            ps.setString(2, sv.getTensinhvien());
            ps.setString(3, sv.getMalop());
            ps.setString(4, sv.getGioitinh());
            ps.setString(5, sv.getNgaysinh());
            ps.setString(6, sv.getDiachi());
            ps.setString(7, sv.getSDT());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            sv = null;
        } 
        this.getAll();
    }
     public ArrayList<eSinhVien> CheckMaSV(String masv) {
        ArrayList<eSinhVien> list = null;
        PreparedStatement psCheck = null;
        ResultSet rs = null;
        conn = ConnecttoSql.getconConnection();
        try {
            psCheck = conn.prepareStatement("select * from SinhVien where MaSV=?");
            psCheck.setString(1, masv);
            rs = psCheck.executeQuery();
            list = new ArrayList<eSinhVien>();
            while (rs.next()) {
                eSinhVien sinhVien = new eSinhVien();
                sinhVien.setMasinhvien(rs.getString(1));
                list.add(sinhVien);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        return list;
    }
     public void updateByMaSV(eSinhVien sv) {
        PreparedStatement ps = null;
        conn = ConnecttoSql.getconConnection();

        try {
            ps = conn.prepareStatement("update SinhVien set TenSV =?, MaLH= ?,GioiTinh=?,NgaySinh=?,DiaChi = ?,SDT = ? where MaSV = ?");

            ps.setString(1, sv.getTensinhvien());
            ps.setString(2, sv.getMalop());
            ps.setString(3, sv.getGioitinh());
            ps.setString(4, sv.getNgaysinh());
            ps.setString(5, sv.getDiachi());
            ps.setString(6, sv.getSDT());
            ps.setString(7, sv.getMasinhvien());
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sửa thất bại");
        } 

        this.getAll();
    }
     public void deleteMaSV(String SinhVienID)throws SQLException,ClassNotFoundException{
        PreparedStatement ps = null;
        conn = ConnecttoSql.getconConnection();
        ps = conn.prepareStatement("delete from SinhVien where MaSV= ?");
        ps.setString(1, SinhVienID);
        ps.executeUpdate();
        
        this.getAll();
    }
      public eSinhVien findByMaSV(String maSV) {
          PreparedStatement ps = null;
          ResultSet rs = null;
          conn = ConnecttoSql.getconConnection();
          try {
              ps = conn.prepareStatement("select  * from SinhVien where MaSV = ?");
              ps.setString(1, maSV);
              rs = ps.executeQuery();
              if (rs.next()) {
                  String tenSV = rs.getString(2);
                  String MaLH = (rs.getString(3));
                  String GioiTinh = (rs.getString(4));
                  String NgaySinh = (rs.getString(5));
                  String DiaChi = (rs.getString(6));
                  String SoDT = (rs.getString(7));
                  eSinhVien sv = new eSinhVien(maSV, tenSV, MaLH, GioiTinh, NgaySinh, DiaChi, SoDT);
                  model.listSV.clear();
                  model.listSV.add(sv);
              } else {
                  JOptionPane.showMessageDialog(null, "Không có sinh viên này", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
              }
              return null;
          } catch (SQLException ex) {
              ex.printStackTrace();
          }

          this.getAll();
          return null;
    }
}
