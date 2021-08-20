/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emtity;

/**
 *
 * @author thanh
 */
public class eLopHoc {
    private String Malop;
    private String Tenlop;
    private int Sosinhvien;

    public eLopHoc() {
    }

    public eLopHoc(String Malop, String Tenlop, int Sosinhvien) {
        this.Malop = Malop;
        this.Tenlop = Tenlop;
        this.Sosinhvien = Sosinhvien;
    }

    public String getMalop() {
        return Malop;
    }

    public void setMalop(String Malop) {
        this.Malop = Malop;
    }

    public String getTenlop() {
        return Tenlop;
    }

    public void setTenlop(String Tenlop) {
        this.Tenlop = Tenlop;
    }

    public int getSosinhvien() {
        return Sosinhvien;
    }

    public void setSosinhvien(int Sosinhvien) {
        this.Sosinhvien = Sosinhvien;
    }
    
    
}
