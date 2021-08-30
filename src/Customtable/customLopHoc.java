/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customtable;

import Emtity.eLopHoc;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author TienDo
 */
    public class customLopHoc extends AbstractTableModel{
    private String name[] = {"Mã Lớp", "Tên Lớp", "Số lượng SV"};
    private Class classes[] = {String.class,String.class,int.class};
    private ArrayList<eLopHoc> l = new ArrayList<eLopHoc>();

    public customLopHoc(ArrayList<eLopHoc> listLop) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.l= listLop;
    }

    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return l.size();
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
            
            case 0: return l.get(rowIndex).getMalop();
            case 1: return l.get(rowIndex).getTenlop();
            case 2: return l.get(rowIndex).getSosinhvien();
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


