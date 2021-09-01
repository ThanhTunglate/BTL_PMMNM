/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Emtity.eMonHoc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author thanh
 */
public class DaoMonhoc {
    private Connection conn;
    public boolean ThemMH(eMonHoc tk){
        conn=ConnecttoSql.getconConnection();
        String sql="INSERT INTO MonHoc(MaMH,TenMH,SoTC,HinhThucThi)"
                + "VALUES(?,?,?,?)";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1, tk.getMamon());
            ps.setString(2, tk.getTenmon());
            ps.setString(3, String.valueOf(tk.getSotinchi()));
            ps.setString(4, tk.getHinhthucthi());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<eMonHoc> getListMH(){
        conn=ConnecttoSql.getconConnection();
        ArrayList<eMonHoc> list = new ArrayList<>();
        String sql="SELECT * FROM MonHoc";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                eMonHoc tk = new eMonHoc();
                tk.setMamon(rs.getString("MaMH"));
                tk.setTenmon(rs.getString("TenMH"));
                tk.setSotinchi(rs.getInt("SoTC"));
                tk.setHinhthucthi(rs.getString("HinhThucThi"));
                list.add(tk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public boolean XoaMH(String MH){
        conn=ConnecttoSql.getconConnection();
        String sql="DELETE FROM MonHoc WHERE MaMH=?";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, MH);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean SuaMH(eMonHoc tkCu, eMonHoc tkMoi){
        conn=ConnecttoSql.getconConnection();
        String sql="UPDATE TaiKhoan SET TenMH=?,SoTC=?, HinhThucThi=? WHERE MaMH=?";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1, tkMoi.getTenmon());
            ps.setString(2, String.valueOf(tkMoi.getSotinchi()));
            ps.setString(3, tkMoi.getHinhthucthi());
            ps.setString(4, tkCu.getMamon());    
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public eMonHoc TimKiem(String TenTk){
        conn=ConnecttoSql.getconConnection();
        String sql="SELECT * FROM MonHoc WHERE MaMH=?";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, TenTk);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                eMonHoc tk = new eMonHoc();
                tk.setMamon(rs.getString("MaMH"));
                tk.setTenmon(rs.getString("TenMH"));
                tk.setSotinchi(rs.getInt("SoTC"));
                tk.setHinhthucthi(rs.getString("HinhThucThi"));
                return tk;      
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
