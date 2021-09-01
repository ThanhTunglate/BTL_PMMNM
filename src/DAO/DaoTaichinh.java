/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Emtity.eTaiChinh;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author thanh
 */
public class DaoTaichinh {
    private Connection conn;
    public boolean NapTien(String Masv, double tiennap){
        conn = ConnecttoSql.getconConnection();
        String sql="UPDATE TaiChinh SET SoDuKhaDung=? WHERE MaSV=?"
                + "VALUES(?,?,?)";
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
}
