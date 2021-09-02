/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customtable;

import Emtity.eKQHT;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Admin
 */
public class customKetQuaThi extends AbstractTableModel {
    private String name[] = {"STT", "Mã môn học","Tên môn học", "Điểm TB", "Điểm Thi", "Điểm TK", "Xếp Loại"};
    private Class classes[] = {int.class, String.class, String.class, float.class, float.class, float.class, String.class};
    ArrayList<eKQHT> ps = new ArrayList<>();

    public customKetQuaThi(ArrayList<eKQHT> p) {
        this.ps = p;
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
        switch (columnIndex) {
            case 0:
                return rowIndex + 1;
            case 1:
                return ps.get(rowIndex).getMaMH();
            case 2:
                return ps.get(rowIndex).getTenMH();
            case 3:
                System.out.println(ps.get(rowIndex).tinhDiemTB());
                return ps.get(rowIndex).getDiemTB();
            case 4:
                System.out.println(ps.get(rowIndex).getDiemThi());
                return ps.get(rowIndex).getDiemThi();
            case 5:
                System.out.println(ps.get(rowIndex).tinhDiemTK());
                return ps.get(rowIndex).getDiemTK();
            case 6:
                 return ps.get(rowIndex).XepLoai(ps.get(rowIndex).getDiemTK());
            default:
                return null;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }
}
