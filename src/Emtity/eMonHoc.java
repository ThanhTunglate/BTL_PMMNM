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
public class eMonHoc {
    private String Mamon;
    private String Tenmon;
    private String Sotinchi;
    private String Hinhthucthi;
    private String Magiangvien;
    private String Tengiangvien;

    public eMonHoc() {
    }

    public eMonHoc(String Mamon, String Tenmon, String Sotinchi, String Hinhthucthi, String Magiangvien, String Tengiangvien) {
        this.Mamon = Mamon;
        this.Tenmon = Tenmon;
        this.Sotinchi = Sotinchi;
        this.Hinhthucthi = Hinhthucthi;
        this.Magiangvien = Magiangvien;
        this.Tengiangvien = Tengiangvien;
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

    public String getSotinchi() {
        return Sotinchi;
    }

    public void setSotinchi(String Sotinchi) {
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

    public String getTengiangvien() {
        return Tengiangvien;
    }

    public void setTengiangvien(String Tengiangvien) {
        this.Tengiangvien = Tengiangvien;
    }
    
    
}
