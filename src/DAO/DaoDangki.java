/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Emtity.eDangki;
import Emtity.eHocphan;
import Emtity.eMonHoc;
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
public class DaoDangki {
    private Connection conn = ConnecttoSql.getconConnection();
    public ArrayList<eDangki> getMonHocDangKi(){
        try {
            ArrayList<eDangki> list = new ArrayList();
            String sql ="SELECT * FROM MonHocDangKi";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                eDangki dk = new eDangki();
                dk.setMaHP(rs.getString("MaHP"));
                dk.setSoSV(rs.getString("SoLuongSV"));
                dk.setMagiangvien(rs.getString("MaGV"));
                list.add(dk);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(DaoDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<eDangki> getMonHoc(){
        ArrayList<eDangki> list = getMonHocDangKi();
        for(eDangki item : list){
            try {
                String sql ="SELECT TenMH, SoTC, HinhThucThi FROM MonHoc WHERE MaMH ='"+item.getMaHP().substring(0, 5)+"'";
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                   item.setTenHP(rs.getString("TenMH"));
                   item.setSotinchi(rs.getString("SoTC"));
                   item.setHinhthucthi(rs.getString("HinhThucThi"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(DaoDiem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
    
    public ArrayList<eDangki> getMaHP(String Masv){
           try {
            ArrayList<eDangki> list = new ArrayList();
            String sql ="SELECT MaHP FROM DangKi WHERE MaSV='"+Masv+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
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
    
    public ArrayList<eDangki> getMH(String Masv){
        ArrayList<eDangki> list = getMaHP(Masv);
        for(eDangki item : list){
            try {
                String sql ="SELECT TenMH, SoTC, HinhThucThi FROM MonHoc WHERE MaMH ='"+item.getMaHP().substring(0, 5)+"'";
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                   item.setTenHP(rs.getString("TenMH"));
                   item.setSotinchi(rs.getString("SoTC"));
                   item.setHinhthucthi(rs.getString("HinhThucThi"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(DaoDiem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
    
    public ArrayList<eDangki> getlast(String Masv){
        ArrayList<eDangki> list = getMH(Masv);
        for(eDangki item : list){
            try {
                String sql ="SELECT * FROM MonHocDangKi WHERE MaHP ='" +item.getMaHP()+"'";
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                   item.setMagiangvien(rs.getString("MaGV"));
                   item.setSotinchi(rs.getString("SoluongSV"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(DaoDiem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
    
    
    
}
