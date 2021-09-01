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
import java.util.ArrayList;

/**
 *
 * @author thanh
 */
public class DaoDangki {
    private Connection conn;
    public ArrayList<eDangki> getListDK(){
        conn=ConnecttoSql.getconConnection();
        ArrayList<eDangki> list = new ArrayList<>();
        ArrayList<eMonHoc> mh = new ArrayList<>();
        ArrayList<eHocphan> hp = new ArrayList<>();
        String sql1="SELECT * FROM MonHoc";
        String sql2="SELECT * FROM MonHocDangKi";
        try {
            PreparedStatement ps1= conn.prepareStatement(sql1);
            ResultSet rs1=ps1.executeQuery();
            eMonHoc tk1= new eMonHoc();
            while(rs1.next()){
                tk1.setMamon(rs1.getString("MaMH"));
                tk1.setTenmon(rs1.getString("TenMH"));
                tk1.setSotinchi(rs1.getString("SoTC"));
                tk1.setHinhthucthi(rs1.getString("HinhThucThi"));
                mh.add(tk1);
            }
            
            PreparedStatement ps2= conn.prepareStatement(sql2);
            ResultSet rs2=ps2.executeQuery();
            while(rs2.next()){
                eHocphan tk2 = new eHocphan();
                tk2.setMaGV(rs2.getString("MaGV"));
                tk2.setMamon(rs2.getString("MaHP"));
                tk2.setSoSV(rs2.getString("SoluongSV"));
                hp.add(tk2);
            }
            for(int i=0; i < hp.size(); i++ ){
               eDangki dk= new eDangki();
               dk.setMaHP(hp.get(i).getMamon());
               dk.setMagiangvien(hp.get(i).getMaGV());
               dk.setSoSV(hp.get(i).getSoSV());
               for(int j=0 ; j< mh.size(); j++){
                   if(hp.get(i).getMamon().substring(0, 5)==mh.get(j).getMamon()){
                       dk.setTenHP(mh.get(j).getTenmon());
                       dk.setSotinchi(mh.get(j).getSotinchi());
                       dk.setHinhthucthi(mh.get(j).getHinhthucthi());
                   }
               }
               list.add(dk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
