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
public class eTaiChinh {
    private String Masinhvien;
    private String Tensinhvien ;
    private Double Sotienno;
    private Double Sotiendu;

    public eTaiChinh() {
    }

    public eTaiChinh(String Masinhvien, String Tensinhvien, Double Sotienno, Double Sotiendu) {
        this.Masinhvien = Masinhvien;
        this.Tensinhvien = Tensinhvien;
        this.Sotienno = Sotienno;
        this.Sotiendu = Sotiendu;
    }

    public String getMasinhvien() {
        return Masinhvien;
    }

    public void setMasinhvien(String Masinhvien) {
        this.Masinhvien = Masinhvien;
    }

    public String getTensinhvien() {
        return Tensinhvien;
    }

    public void setTensinhvien(String Tensinhvien) {
        this.Tensinhvien = Tensinhvien;
    }

    public Double getSotienno() {
        return Sotienno;
    }

    public void setSotienno(Double Sotienno) {
        this.Sotienno = Sotienno;
    }

    public Double getSotiendu() {
        return Sotiendu;
    }

    public void setSotiendu(Double Sotiendu) {
        this.Sotiendu = Sotiendu;
    }
    
    

    
}
