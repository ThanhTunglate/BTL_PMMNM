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
public class customQuanLyDiem extends AbstractTableModel {

    private String name[] = {"STT", "Mã sinh viên", "Điểm TX1", "Điểm TX1", "Điểm HS2", "Điểm Thi", "Điểm TK", "Xếp Loại"};
    private Class classes[] = {int.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class};
    ArrayList<eDiem> ps = new ArrayList<>();

    public customQuanLyDiem(ArrayList<eDiem> p) {
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
                return ps.get(rowIndex).getMasinhvien();
            case 2:
                return ps.get(rowIndex).getDiemtx1();
            case 3:
                return ps.get(rowIndex).getDiemtx2();
            case 4:
                return ps.get(rowIndex).getDiemhs2();
            case 5:
                return ps.get(rowIndex).getDiemthi();
            case 6:
                return ps.get(rowIndex).tinhDiemTB();
            case 7:
                return ps.get(rowIndex).XepLoai(ps.get(rowIndex).tinhDiemTB());
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
