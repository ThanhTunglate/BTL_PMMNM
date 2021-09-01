/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Emtity.eDangki;
import Emtity.eTaiChinh;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thanh
 */
public class DaoTaichinh {
    private Connection conn;
    public boolean NapTien(String Masv, double tiennap){
        conn = ConnecttoSql.getconConnection();
        String sql="UPDATE TaiChinh SET SoDuKhaDung=? WHERE MaSV=?";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1, String.valueOf(tiennap));
            ps.setString(2, Masv);
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean Thanhtoan(double Somoi, String Masv, double Sono){
        conn = ConnecttoSql.getconConnection();
        String sql="UPDATE TaiChinh SET SoDuKhaDung=?, SoTienConNo= ? WHERE MaSV=?";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setDouble(1, Somoi);
            ps.setDouble(2, Sono);
            ps.setString(3, Masv);
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public eTaiChinh getTaiChinh(String Masv){
        conn=ConnecttoSql.getconConnection();
        ArrayList<eTaiChinh> list = new ArrayList<>();
        String sql="SELECT * FROM TaiChinh";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                eTaiChinh tk = new eTaiChinh();
                tk.setSotiendu(Double.parseDouble(rs.getString("SoDuKhaDung")));
                tk.setSotienno(Double.parseDouble(rs.getString("SoTienConNo")));
                tk.setMasinhvien(rs.getString("MaSV"));
                return tk;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public ArrayList<eDangki> getDangKi(String Masv){
        try {
            ArrayList<eDangki> list = new ArrayList();
            String sql ="SELECT MaHP FROM DangKi WHERE MaSV='"+Masv+"' and Trangthai=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Chưa nộp học phí");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                eDangki dk = new eDangki();
                dk.setMaHP(rs.getString("MaHP"));
                list.add(dk);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(DaoDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<eDangki> getMonHoc(String Masv){
        ArrayList<eDangki> list = getDangKi(Masv);
        for(eDangki item : list){
            try {
                String sql ="SELECT TenMH, SoTC FROM MonHoc WHERE MaMH ='"+item.getMaHP().substring(0, 5)+"'";
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                   item.setTenHP(rs.getString("TenMH"));
                   item.setSotinchi("SoTC");
                }
            } catch (SQLException ex) {
                Logger.getLogger(DaoDiem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
    
    public boolean Update(String Masv, String MaHP){
        conn = ConnecttoSql.getconConnection();
        String sql="UPDATE DangKi SET TrangThai=? WHERE MaSV=? and MaHP=?";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1, "Đã nộp học phí");
            ps.setString(2, Masv);
            ps.setString(3, MaHP);
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
