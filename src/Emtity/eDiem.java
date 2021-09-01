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
    private String MaHP;
    private float Diemtx1;
    private float Diemtx2;
    private float Diemhs2;
    private float Diemthi;
    private float DiemTB;
    private String TrangThai;
    
    public eDiem() {
    }
    public float tinhDiemTB(){
        if(Diemhs2 >=0){
             return DiemTB = (((Diemtx1 + Diemtx2 + Diemhs2 *2) / 4 ) + Diemthi*2) / 3;
        }
        else{
            return DiemTB = (((Diemtx1 + Diemtx2) / 2 ) + Diemthi*2) / 3;
        }
    }
    public String XepLoai(float diemtk) {
        if (diemtk >= 8.5) {
            return "Giỏi";
        } else {
            if (diemtk >= 7 && diemtk < 8.5) {
                return "Khá";
            } else {
                if (diemtk >= 4 && diemtk < 7) {
                    return "Trung Bình";
                } else {
                    return "Yếu";
                }
            }
        }
    }

    public String getMasinhvien() {
        return Masinhvien;
    }

    public void setMasinhvien(String Masinhvien) {
        this.Masinhvien = Masinhvien;
    }

    public String getMaHP() {
        return MaHP;
    }

    public void setMaHP(String MaHP) {
        this.MaHP = MaHP;
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

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

}
