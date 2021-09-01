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
    private String Diemtx1;
    private String Diemtx2;
    private String Diemhs2;
    private String Diemthi;
    private String DiemTB;
    private String TrangThai;
    public eDiem() {
    }

    public eDiem(String Masinhvien, String MaHP, String Diemtx1, String Diemtx2, String Diemhs2, String Diemthi, String DiemTB, String TrangThai) {
        this.Masinhvien = Masinhvien;
        this.MaHP = MaHP;
        this.Diemtx1 = Diemtx1;
        this.Diemtx2 = Diemtx2;
        this.Diemhs2 = Diemhs2;
        this.Diemthi = Diemthi;
        this.DiemTB = DiemTB;
        this.TrangThai = TrangThai;
    }
    public float tinhDiemTB(){
        float Diemtk;
        if(Diemhs2 != null){
            Diemtk = (((Float.parseFloat(Diemtx1) + Float.parseFloat(Diemtx2) + Float.parseFloat(Diemhs2) *2) /4) + Float.parseFloat(Diemthi)*2) / 3 ;
//            DiemTB = String.valueOf(Diemtk);
        }else{
            Diemtk = ((Float.parseFloat(Diemtx1) + Float.parseFloat(Diemtx2) /2) + Float.parseFloat(Diemthi)*2) /3;
        }
        return Diemtk;
    }
    public String XepLoai(float diemtk){
        if(diemtk >= 8.5){
            return "Giỏi";
        }else{
            if(diemtk >= 7 && diemtk<8.5){
            return "Khá";
            }else{
                if(diemtk >=4 && diemtk <7){
                    return "Trung Bình";
                }else{
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

    public String getDiemtx1() {
        return Diemtx1;
    }

    public void setDiemtx1(String Diemtx1) {
        this.Diemtx1 = Diemtx1;
    }

    public String getDiemtx2() {
        return Diemtx2;
    }

    public void setDiemtx2(String Diemtx2) {
        this.Diemtx2 = Diemtx2;
    }

    public String getDiemhs2() {
        return Diemhs2;
    }

    public void setDiemhs2(String Diemhs2) {
        this.Diemhs2 = Diemhs2;
    }

    public String getDiemthi() {
        return Diemthi;
    }

    public void setDiemthi(String Diemthi) {
        this.Diemthi = Diemthi;
    }

    public String getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(String DiemTB) {
        this.DiemTB = DiemTB;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }
    
}
