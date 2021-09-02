/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Emtity.eTaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author thanh
 */
public class DaoTaikhoan {
    private Connection conn;
    public boolean ThemTaiKhoan(eTaiKhoan tk){
        conn=ConnecttoSql.getconConnection();
        String sql="INSERT INTO TaiKhoan(Taikhoan,MatKhau,Loai)"
                + "VALUES(?,?,?)";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1, tk.getTaikhoan());
            ps.setString(2, tk.getMatkhau());
            ps.setString(3, tk.getLoai());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<eTaiKhoan> getListTaiKhoan(){
        conn=ConnecttoSql.getconConnection();
        ArrayList<eTaiKhoan> list = new ArrayList<>();
        String sql="SELECT * FROM TaiKhoan";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                eTaiKhoan tk = new eTaiKhoan();
                tk.setTaikhoan(rs.getString("Taikhoan"));
                tk.setMatkhau(rs.getString("MatKhau"));
                tk.setLoai(rs.getString("Loai"));
                list.add(tk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public boolean XoaTaiKhoan(String TaiKhoan){
        conn=ConnecttoSql.getconConnection();
        String sql="DELETE FROM TaiKhoan WHERE Taikhoan=?";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, TaiKhoan);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean SuaTaiKhoan(eTaiKhoan tkCu, eTaiKhoan tkMoi){
        conn=ConnecttoSql.getconConnection();
        String sql="UPDATE TaiKhoan SET Taikhoan=?, MatKhau=?, Loai=? WHERE Taikhoan=?";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1, tkMoi.getTaikhoan());
            ps.setString(2, tkMoi.getMatkhau());
            ps.setString(3, tkMoi.getLoai());
            ps.setString(4, tkCu.getTaikhoan());    
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public eTaiKhoan TimKiem(String TenTk){
        conn=ConnecttoSql.getconConnection();
        String sql="SELECT * FROM TaiKhoan WHERE Taikhoan=?";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, TenTk);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                eTaiKhoan tk = new eTaiKhoan();
                tk.setTaikhoan(rs.getString("Taikhoan"));
                tk.setMatkhau(rs.getString("MatKhau"));
                tk.setLoai(rs.getString("Loai"));
                return tk;      
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean Doimk(String TenTk, String mkmoi){
        conn=ConnecttoSql.getconConnection();
        String sql="UPDATE TaiKhoan SET MatKhau=? WHERE Taikhoan=?";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, mkmoi);
            ps.setString(2, TenTk);
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
