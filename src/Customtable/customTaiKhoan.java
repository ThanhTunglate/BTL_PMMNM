/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customtable;

import Emtity.eTaiKhoan;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author thanh
 */
public class customTaiKhoan extends AbstractTableModel{
    private String name[]={"STT","Tài khoản","Mật khẩu", "Loại tài khoản"};
    private Class classes[]={int.class,String.class,String.class,String.class};
    ArrayList<eTaiKhoan> ps= new ArrayList<eTaiKhoan>();
    public customTaiKhoan(ArrayList<eTaiKhoan> p) {
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
            case 1: return ps.get(rowIndex).getTaikhoan();
            case 2: return ps.get(rowIndex).getMatkhau(); 
            case 3: return ps.get(rowIndex).getLoai();  
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
