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
public class eDangkimon {
    private String Masinhvien;
    private String Mamon;
    private String Tenmon;
    private int Sotinchi;
    private String Hinhthucthi;
    private String Magiangvien;
    private String TenGiangvien;
    private int SoluongSV;
    private String Trangthai;

    public eDangkimon() {
    }

    public eDangkimon(String Masinhvien, String Mamon, String Tenmon, int Sotinchi, String Hinhthucthi, String Magiangvien, String TenGiangvien, int SoluongSV, String Trangthai) {
        this.Masinhvien = Masinhvien;
        this.Mamon = Mamon;
        this.Tenmon = Tenmon;
        this.Sotinchi = Sotinchi;
        this.Hinhthucthi = Hinhthucthi;
        this.Magiangvien = Magiangvien;
        this.TenGiangvien = TenGiangvien;
        this.SoluongSV = SoluongSV;
        this.Trangthai = Trangthai;
    }

    public String getMasinhvien() {
        return Masinhvien;
    }

    public void setMasinhvien(String Masinhvien) {
        this.Masinhvien = Masinhvien;
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

    public int getSotinchi() {
        return Sotinchi;
    }

    public void setSotinchi(int Sotinchi) {
        this.Sotinchi = Sotinchi;
    }

    public String getHinhthucthi() {
        return Hinhthucthi;
    }

    public void setHinhthucthi(String Hinhthucthi) {
        this.Hinhthucthi = Hinhthucthi;
    }

    public String getMagiangvien() {
        return Magiangvien;
    }

    public void setMagiangvien(String Magiangvien) {
        this.Magiangvien = Magiangvien;
    }

    public String getTenGiangvien() {
        return TenGiangvien;
    }

    public void setTenGiangvien(String TenGiangvien) {
        this.TenGiangvien = TenGiangvien;
    }

    public int getSoluongSV() {
        return SoluongSV;
    }

    public void setSoluongSV(int SoluongSV) {
        this.SoluongSV = SoluongSV;
    }

    public String getTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(String Trangthai) {
        this.Trangthai = Trangthai;
    }
    
    
}
