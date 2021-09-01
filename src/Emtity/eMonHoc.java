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
    private int Sotinchi;
    private String Hinhthucthi;

    public eMonHoc() {
    }

    public eMonHoc(String Mamon, String Tenmon, int Sotinchi, String Hinhthucthi) {
        this.Mamon = Mamon;
        this.Tenmon = Tenmon;
        this.Sotinchi = Sotinchi;
        this.Hinhthucthi = Hinhthucthi;
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

}
