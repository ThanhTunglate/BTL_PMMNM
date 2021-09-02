/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Emtity.eDangki;
import Emtity.eDiem;
import Emtity.eKQHT;
import Emtity.eSinhVien;
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
public class DaoDiem {
    Connection conn = ConnecttoSql.getconConnection();
    public ArrayList<eDangki> getMonHocDangKi(){
        try {
            ArrayList<eDangki> list = new ArrayList();
            String sql ="SELECT MaHP, SoLuongSV FROM MonHocDangKi";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                eDangki dk = new eDangki();
                dk.setMaHP(rs.getString("MaHP"));
                dk.setSoSV(rs.getString("SoLuongSV"));
                list.add(dk);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(DaoDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ArrayList<eDangki> getTenMonHoc(){
        ArrayList<eDangki> list = getMonHocDangKi();
        for(eDangki item : list){
            try {
                String sql ="SELECT TenMH, SoTC FROM MonHoc WHERE MaMH ='"+item.getMaHP().substring(0, 5)+"'";
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                   item.setTenHP(rs.getString("TenMH"));
                   item.setSotinchi(rs.getString("SoTC"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(DaoDiem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
    public ArrayList<eDiem> getDiem4(String MaHP){
        try {
            ArrayList<eDiem> list = new ArrayList<>();
            String sql ="Select * FROM DangKi WHERE MaHP = '"+MaHP+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                eDiem diem = new eDiem();
                diem.setMasinhvien(rs.getString("MaSV"));
                diem.setDiemtx1(rs.getFloat("DiemTX1"));
                diem.setDiemtx2(rs.getFloat("DiemTX2"));
                diem.setDiemhs2(rs.getFloat("DiemHS2"));
                diem.setDiemthi(rs.getFloat("DiemThi"));
                list.add(diem);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(DaoDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ArrayList<eDiem> getDiem3(String MaHP){
        try {
            ArrayList<eDiem> list = new ArrayList<>();
            String sql ="Select * FROM DangKi WHERE MaHP = '"+MaHP+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                eDiem diem = new eDiem();
                diem.setMasinhvien(rs.getString("MaSV"));
                diem.setDiemtx1(rs.getFloat("DiemTX1"));
                diem.setDiemtx2(rs.getFloat("DiemTX2"));
                diem.setDiemthi(rs.getFloat("DiemThi"));
                list.add(diem);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(DaoDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void updateDiem4(float DiemTX1, float DiemTX2, float DiemHS2, float DiemThi, String MaSV, String MaHP){
        try {
            String sql ="UPDATE DangKi SET DiemTX1 = "+DiemTX1+", DiemTX2 ="+DiemTX2+", DiemHS2 = "+DiemHS2+", DiemThi = "+DiemThi+", DiemTB = (((DiemTX1 + DiemTX2 + DiemHS2 *2) / 4 ) + DiemThi*2) / 3"
                    + "WHERE  MaSV ='"+MaSV+"' AND MaHP = '"+MaHP+"' ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void updateDiem3(float DiemTX1, float DiemTX2, float DiemThi, String MaSV, String MaHP){
        try {
            String sql ="UPDATE DangKi SET DiemTX1 = "+DiemTX1+", DiemTX2 ="+DiemTX2+", DiemThi = "+DiemThi+", DiemTB = (((DiemTX1 + DiemTX2) / 2 ) + DiemThi*2) / 3"
                    + "WHERE  MaSV ='"+MaSV+"' AND MaHP = '"+MaHP+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public eSinhVien CheckMaSV(String masv) {
        PreparedStatement psCheck = null;
        ResultSet rs = null;
        conn = ConnecttoSql.getconConnection();
        try {
            psCheck = conn.prepareStatement("select * from SinhVien where MaSV=?");
            psCheck.setString(1, masv);
            rs = psCheck.executeQuery();
            while (rs.next()) {
                eSinhVien sv = new eSinhVien();
                sv.setMasinhvien(rs.getString(1));
                sv.setTensinhvien(rs.getString(2));
                sv.setMalop(rs.getString(3));
                return sv;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        return null;
    }
     public ArrayList<eKQHT> getMaHP(String MaSV){
        try {
            ArrayList<eKQHT> list = new ArrayList<>();
            String sql ="SELECT MaHP From DangKi WHERE MaSV ='"+MaSV+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                eKQHT kq = new eKQHT();
                kq.setMaMH(rs.getString("MaHP"));
                list.add(kq);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(DaoDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
       return null;
    }
     public ArrayList<eKQHT> tenMH(String MaSV){
         ArrayList<eKQHT> list = getMaHP(MaSV);
         for(eKQHT item : list){
             try {
                 String sql = "SELECT TenMH FROM MonHoc Where MaMH = '"+item.getMaMH().substring(0, 5)+"'";
                 PreparedStatement ps = conn.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery();
                 while(rs.next()){
                     item.setTenMH(rs.getString("TenMH"));
                 }
             } catch (SQLException ex) {
                 Logger.getLogger(DaoDiem.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
         return list;
     }
     public ArrayList<eKQHT> getAllKQHT(String MaSV){
         ArrayList<eKQHT> list = tenMH(MaSV);
         for(eKQHT item : list){
             try {
                 String sql = "SELECT * FROM DangKi WHERE MaSV = '"+MaSV+"' AND MaHP = '"+item.getMaMH()+"' ";
                 PreparedStatement ps = conn.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery();
                 while(rs.next()){
                     item.setDiemTX1(rs.getFloat("DiemTX1"));
                     item.setDiemTX2(rs.getFloat("DiemTX2"));
                     item.setDiemHS2(rs.getFloat("DiemHS2"));
                     item.setDiemThi(rs.getFloat("DiemThi"));
                 }
             } catch (Exception e) {
             }
         }
         return list;
     }
}
