/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customtable;

import Emtity.eDangki;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author thanh
 */
public class customDangki extends AbstractTableModel{
    private String name[]={"Mã môn","Tên môn","Số tín chỉ", "Hình thức thi", "Mã giảng viên", "Số lượng"};
    private Class classes[]={String.class,String.class,int.class,String.class,String.class,int.class};
    ArrayList<eDangki> ps= new ArrayList<eDangki>();
    public customDangki(ArrayList<eDangki> p) {
        this.ps=p;
    }

    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return ps.size();
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
            case 0: return ps.get(rowIndex).getMaHP();
            case 1: return ps.get(rowIndex).getTenHP();
            case 2: return ps.get(rowIndex).getSotinchi(); 
            case 3: return ps.get(rowIndex).getHinhthucthi();
            case 4: return ps.get(rowIndex).getMagiangvien();
            case 5: return ps.get(rowIndex).getSoSV();
            default: return null;
        }
    }
//
//    @Override
//    public Class getColumnClass(int columnIndex) {
//        return classes[columnIndex]; //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public String getColumnName(int column) {
//        return name[column]; //To change body of generated methods, choose Tools | Templates.
//    }
        @Override
    public Class getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        return name[column];
    }
}
