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
public class customThanhtoan extends AbstractTableModel{
    private String name[]={"STT","Mã môn","Tên môn", "Số tín chỉ", "Số tiền"};
    private Class classes[]={int.class,String.class,String.class,String.class,double.class};
    ArrayList<eDangki> ps= new ArrayList<eDangki>();
    public customThanhtoan(ArrayList<eDangki> p) {
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
            case 0: return rowIndex+1;
            case 1: return ps.get(rowIndex).getMaHP();
            case 2: return ps.get(rowIndex).getTenHP(); 
            case 3: return ps.get(rowIndex).getSotinchi();
            case 4: return Double.parseDouble(ps.get(rowIndex).getSotinchi())*300000;  
            default: return null;
        }
    }
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
