/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Emtity.eGiangVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author thanh
 */
public class DaoGiangvien {
    private Connection conn;
    public boolean ThemGiangvien(eGiangVien tk){
        conn=ConnecttoSql.getconConnection();
        String sql="INSERT INTO GiangVien(MaGV, TenGV, NgaySinh, GioiTinh, DiaChi, SDT)"
                + "VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1, tk.getMagiangvien());
            ps.setString(2, tk.getTengiangvien());
            ps.setString(3, tk.getNgaysinh());
            ps.setString(4, tk.getGioitinh());
            ps.setString(5, tk.getDiachi());
            ps.setString(6, tk.getSDT());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<eGiangVien> getListGV(){
        conn=ConnecttoSql.getconConnection();
        ArrayList<eGiangVien> list = new ArrayList<>();
        String sql="SELECT * FROM GiangVien";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                eGiangVien tk = new eGiangVien();
                tk.setMagiangvien(rs.getString("MaGV"));
                tk.setTengiangvien(rs.getString("TenGV"));
                tk.setGioitinh(rs.getString("GioiTinh"));
                tk.setNgaysinh(rs.getString("NgaySinh"));
                tk.setDiachi(rs.getString("DiaChi"));
                tk.setSDT(rs.getString("SDT"));
                list.add(tk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public boolean XoaGiangVien(String gv){
        conn=ConnecttoSql.getconConnection();
        String sql="DELETE FROM GiangVien WHERE MaGV=?";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, gv);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean SuaGV(eGiangVien tkCu, eGiangVien tkMoi){
        conn=ConnecttoSql.getconConnection();
        String sql="UPDATE GiangVien SET TenGV=?, GioiTinh=?, NgaySinh=?, DiaCHi=?, SDT=? WHERE MaGV=?";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1, tkMoi.getTengiangvien());
            ps.setString(2, tkMoi.getGioitinh());
            ps.setString(3, tkMoi.getNgaysinh());
            ps.setString(4, tkCu.getDiachi());
            ps.setString(5, tkCu.getSDT());
            ps.setString(6, tkCu.getMagiangvien()); 
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public eGiangVien TimKiem(String TenGV){
        conn=ConnecttoSql.getconConnection();
        String sql="SELECT * FROM GiangVien WHERE MaGV=?";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, TenGV);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                eGiangVien tk = new eGiangVien();
                tk.setMagiangvien(rs.getString("MaGV"));
                tk.setTengiangvien(rs.getString("TenGV"));
                tk.setGioitinh(rs.getString("GioiTinh"));
                tk.setNgaysinh(rs.getString("NgaySinh"));
                tk.setDiachi(rs.getString("DiaChi"));
                tk.setSDT(rs.getString("SDT"));
                return tk;      
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
