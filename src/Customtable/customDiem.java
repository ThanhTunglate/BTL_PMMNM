/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customtable;

import Emtity.eDangki;
import Emtity.eDiem;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Admin
 */
public class customDiem extends AbstractTableModel {
private String name[]={"STT","Mã học phần","Tên môn", "Số sinh viên"};
    private Class classes[]={int.class,String.class,String.class, int.class};
    ArrayList<eDangki> ps= new ArrayList<>();
    public customDiem(ArrayList<eDangki> p) {
        this.ps=p;
    }
    @Override
    public int getRowCount() {
        return ps.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch(columnIndex){
            case 0: return rowIndex+1;
            case 1: return ps.get(rowIndex).getMaHP(); 
            case 2: return ps.get(rowIndex).getTenHP();
            case 3: return ps.get(rowIndex).getSoSV();  
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
