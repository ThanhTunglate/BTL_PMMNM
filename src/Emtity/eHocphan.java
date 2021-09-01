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
public class eHocphan {
    private String Mamon;
    private String MaGV;
    private int SoSV;

    public eHocphan() {
    }
    
    public eHocphan(String Mamon, String MaGV, int SoSV) {
        this.Mamon = Mamon;
        this.MaGV = MaGV;
        this.SoSV = SoSV;
    }

    public String getMamon() {
        return Mamon;
    }

    public void setMamon(String Mamon) {
        this.Mamon = Mamon;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public int getSoSV() {
        return SoSV;
    }

    public void setSoSV(int SoSV) {
        this.SoSV = SoSV;
    }
    
    
}
