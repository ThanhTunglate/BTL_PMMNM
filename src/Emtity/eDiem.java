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
public class eDiem {
    private String Masinhvien;
    private String Tensinhvien;
    private String Mamon;
    private String Tenmon;
    private float Diemtx1;
    private float Diemtx2;
    private float Diemhs2;
    private float Diemthi;
    private float DiemTB;

    public eDiem() {
    }

    public eDiem(String Masinhvien, String Tensinhvien, String Mamon, String Tenmon, float Diemtx1, float Diemtx2, float Diemhs2, float Diemthi, float DiemTB) {
        this.Masinhvien = Masinhvien;
        this.Tensinhvien = Tensinhvien;
        this.Mamon = Mamon;
        this.Tenmon = Tenmon;
        this.Diemtx1 = Diemtx1;
        this.Diemtx2 = Diemtx2;
        this.Diemhs2 = Diemhs2;
        this.Diemthi = Diemthi;
        this.DiemTB = DiemTB;
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

    public String getMamon() {
        return Mamon;
    }

    public void setMamon(String Mamon) {
        this.Mamon = Mamon;
    }

    public String getTenmon() {
        return Tenmon;
    }

    public void setTenmon(String Tenmon) {
        this.Tenmon = Tenmon;
    }

    public float getDiemtx1() {
        return Diemtx1;
    }

    public void setDiemtx1(float Diemtx1) {
        this.Diemtx1 = Diemtx1;
    }

    public float getDiemtx2() {
        return Diemtx2;
    }

    public void setDiemtx2(float Diemtx2) {
        this.Diemtx2 = Diemtx2;
    }

    public float getDiemhs2() {
        return Diemhs2;
    }

    public void setDiemhs2(float Diemhs2) {
        this.Diemhs2 = Diemhs2;
    }

    public float getDiemthi() {
        return Diemthi;
    }

    public void setDiemthi(float Diemthi) {
        this.Diemthi = Diemthi;
    }

    public float getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(float DiemTB) {
        this.DiemTB = DiemTB;
    }

    
}
