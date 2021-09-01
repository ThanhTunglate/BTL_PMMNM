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
    private Connection conn;
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
    
    public ArrayList<eDangki> getMonHoc(){
        ArrayList<eDangki> list = getMonHocDangKi();
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
}
