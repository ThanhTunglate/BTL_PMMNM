/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Emtity.eHocphan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author thanh
 */
public class DaoHocphan {
    private Connection conn;
    public boolean ThemHP(eHocphan tk){
        conn=ConnecttoSql.getconConnection();
        String sql="INSERT INTO MonHocDangKi(MaHP,MaGV,SoluongSV)"
                + "VALUES(?,?,?)";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1, tk.getMamon());
            ps.setString(2, tk.getMaGV());
            ps.setString(3, String.valueOf(tk.getSoSV()));
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<eHocphan> getListHP(){
        conn=ConnecttoSql.getconConnection();
        ArrayList<eHocphan> list = new ArrayList<>();
        String sql="SELECT * FROM MonHocDangKi";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                eHocphan tk = new eHocphan();
                tk.setMamon(rs.getString("MaHP"));
                tk.setMaGV(rs.getString("MaGV"));
                tk.setSoSV(Integer.parseInt(rs.getString("SoluongSV")));
                list.add(tk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public boolean XoaHP(String HP){
        conn=ConnecttoSql.getconConnection();
        String sql="DELETE FROM MonHocDangKi WHERE MaHP=?";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, HP);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean SuaMH(eHocphan tkCu, eHocphan tkMoi){
        conn=ConnecttoSql.getconConnection();
        String sql="UPDATE MonHocDangKi SET MaGV=?,SoluongSV=? WHERE MaHP=?";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1, tkMoi.getMaGV());
            ps.setString(2, String.valueOf(tkMoi.getSoSV()));
            ps.setString(3, tkMoi.getMamon());    
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public eHocphan TimKiem(String MaHP){
        conn=ConnecttoSql.getconConnection();
        String sql="SELECT * FROM MonHocDangKi WHERE MaHP=?";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, MaHP);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                eHocphan tk = new eHocphan();
                tk.setMamon(rs.getString("MaHP"));
                tk.setMaGV(rs.getString("MaGV"));
                tk.setSoSV(Integer.parseInt(rs.getString("SoluongSV")));
                return tk;      
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
