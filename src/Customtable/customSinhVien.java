/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customtable;



import Emtity.eSinhVien;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Admin
 */
public class customSinhVien extends AbstractTableModel{
    private String name[] = {"Mã SV", "Tên SV", "Mã lớp", "Giới tính", "Ngày sinh" ,"Địa chỉ","Số điện thoại"};
    private Class classes[] = {String.class,String.class,String.class,String.class,String.class,String.class,String.class};
    private ArrayList<eSinhVien> listSV = new ArrayList<eSinhVien>();

    public customSinhVien(ArrayList<eSinhVien> listSV) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       this.listSV = listSV;
    }

    

    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return listSV.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch(columnIndex){
            case 0: return listSV.get(rowIndex).getMasinhvien();
            case 1: return listSV.get(rowIndex).getTensinhvien();
            case 2: return listSV.get(rowIndex).getMalop();
            case 3: return listSV.get(rowIndex).getGioitinh();
            case 4: return listSV.get(rowIndex).getNgaysinh();
            case 5: return listSV.get(rowIndex).getDiachi();
            case 6: return listSV.get(rowIndex).getSDT();
            default:return null;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return classes[columnIndex]; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column) {
        return name[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
