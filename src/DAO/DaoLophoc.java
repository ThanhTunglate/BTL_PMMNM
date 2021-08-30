/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Customtable.model;
import Emtity.eLopHoc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author thanh
 */
public class DaoLophoc {
        private Connection conn;
             public void getAll() {
                model.listLH.clear();;
                PreparedStatement ps = null;
                ResultSet rs = null;
                conn = ConnecttoSql.getconConnection();
                try {
                    ps = conn.prepareStatement("SELECT * FROM LopHoc");
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        eLopHoc sv = new eLopHoc();
                        sv.setMalop(rs.getString(1));
                        sv.setTenlop(rs.getString(2));
                        sv.setSosinhvien(Integer.parseInt(rs.getString(3)));
                        model.listLH.add(sv);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
             }
    
          public boolean ThemLop(eLopHoc lh){
                conn=ConnecttoSql.getconConnection();
                String sql="INSERT INTO LopHoc(MaLH,TenLH,SoLuongSV)"
                        + "VALUES(?,?,?)";
                try {
                    PreparedStatement ps= conn.prepareStatement(sql);
                    ps.setString(1, lh.getMalop());
                    ps.setString(2, lh.getTenlop());
                    ps.setInt(3, lh.getSosinhvien());
                    return ps.executeUpdate() >0;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return false;
            }
      
          public ArrayList<eLopHoc> getListLop(){
            conn=ConnecttoSql.getconConnection();
            ArrayList<eLopHoc> list = new ArrayList<>();
            String sql="SELECT * FROM LopHoc";
            try {
                PreparedStatement ps= conn.prepareStatement(sql);
                ResultSet rs=ps.executeQuery();
                while(rs.next()){
                    eLopHoc Lh = new eLopHoc();
                    Lh.setMalop(rs.getString("MaLH"));
                    Lh.setTenlop(rs.getString("TenLH"));
                    Lh.setSosinhvien(rs.getInt("SoLuongSV"));
                    list.add(Lh);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return list;
        }
       
          public boolean SuaLop(eLopHoc LCu,eLopHoc LMoi){
            conn=ConnecttoSql.getconConnection();
            String sql="UPDATE LopHoc SET MaLH=?, TenLH=?, SoLuongSV=? WHERE MaLH=?";
            try {
                PreparedStatement ps= conn.prepareStatement(sql);
                ps.setString(1, LMoi.getMalop());
                ps.setString(2, LMoi.getTenlop());
                ps.setInt(3, LMoi.getSosinhvien());
                ps.setString(4, LCu.getMalop());    
                return ps.executeUpdate() >0;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        }
       public boolean XoaLop(String MaLop){
            conn=ConnecttoSql.getconConnection();
            String sql="DELETE FROM LopHoc WHERE MaLH=?";
            try {
                PreparedStatement ps=conn.prepareStatement(sql);
                ps.setString(1, MaLop);
                ps.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        }
        public eLopHoc TimKiem(String MaLop){
             PreparedStatement ps = null;
              ResultSet rs = null;
              
            conn=ConnecttoSql.getconConnection();
            String sql="SELECT * FROM LopHoc WHERE MaLH =?";
            try {
                ps=conn.prepareStatement(sql);
                ps.setString(1, MaLop);
                rs = ps.executeQuery();
                if(rs.next()){
                   String TenLH = (rs.getString(2));
                   int Sosinhvien = rs.getInt(3);
                    eLopHoc a= new eLopHoc(MaLop, TenLH, Sosinhvien);
                    model.listLH.clear();
                    model.listLH.add(a);
                }
                else {
                  JOptionPane.showMessageDialog(null, "Không có lớp này", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
              }
              return null;
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
            return null;

        }
}
