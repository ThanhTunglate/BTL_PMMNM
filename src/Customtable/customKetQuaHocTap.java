/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customtable;

import Emtity.eDiem;
import Emtity.eKQHT;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Admin
 */
public class customKetQuaHocTap extends AbstractTableModel {
    private String name[] = {"STT", "Mã môn học","Tên môn học", "Điểm TX1", "Điểm TX2", "Điểm HS2", "Điểm TB"};
    private Class classes[] = {int.class, String.class, String.class, float.class, float.class, float.class, float.class};
    ArrayList<eKQHT> ps = new ArrayList<>();

    public customKetQuaHocTap(ArrayList<eKQHT> p) {
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
                return ps.get(rowIndex).getDiemTX1();
            case 4:
                return ps.get(rowIndex).getDiemTX2();
            case 5:
                return ps.get(rowIndex).getDiemHS2();
            case 6:
                 return ps.get(rowIndex).tinhDiemTB();
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
