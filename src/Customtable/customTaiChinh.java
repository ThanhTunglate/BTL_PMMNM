/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customtable;

import Emtity.eMonHoc;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author thanh
 */
public class customTaiChinh extends AbstractTableModel{
    private String name[]={"STT","Mã môn","Tên môn", "Số tín chỉ", "Số tiền"};
    private Class classes[]={int.class,String.class,String.class,int.class,Double.class};
    ArrayList<eMonHoc> ps= new ArrayList<eMonHoc>();
    public customTaiChinh(ArrayList<eMonHoc> p) {
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
            case 1: return ps.get(rowIndex).getMamon();
            case 2: return ps.get(rowIndex).getTenmon(); 
            case 3: return ps.get(rowIndex).getSotinchi();
            case 4: return Integer.parseInt(ps.get(rowIndex).getSotinchi())*300000;  
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
