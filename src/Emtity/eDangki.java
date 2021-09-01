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
public class eDangki {
    private String MaHP;
    private String TenHP;
    private int Sotinchi;
    private String Hinhthucthi;
    private String Magiangvien;
    private int SoSV;

    public eDangki() {
    }

    public eDangki(String MaHP, String TenHP, int Sotinchi, String Hinhthucthi, String Magiangvien, int SoSV) {
        this.MaHP = MaHP;
        this.TenHP = TenHP;
        this.Sotinchi = Sotinchi;
        this.Hinhthucthi = Hinhthucthi;
        this.Magiangvien = Magiangvien;
        this.SoSV = SoSV;
    }

    public String getMaHP() {
        return MaHP;
    }

    public void setMaHP(String MaHP) {
        this.MaHP = MaHP;
    }

    public String getTenHP() {
        return TenHP;
    }

    public void setTenHP(String TenHP) {
        this.TenHP = TenHP;
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

    public int getSoSV() {
        return SoSV;
    }

    public void setSoSV(int SoSV) {
        this.SoSV = SoSV;
    }
    
    
}
