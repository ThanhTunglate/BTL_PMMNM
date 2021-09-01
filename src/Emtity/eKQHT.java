/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emtity;

/**
 *
 * @author Admin
 */
public class eKQHT {
    private String MaMH;
    private String TenMH;
    private float DiemTX1;
    private float DiemTX2;
    private float DiemHS2;
    private float DiemTB;

    public eKQHT() {
    }

    public eKQHT(String MaMH, String TenMH, float DiemTX1, float DiemTX2, float DiemHS2, float DiemTB) {
        this.MaMH = MaMH;
        this.TenMH = TenMH;
        this.DiemTX1 = DiemTX1;
        this.DiemTX2 = DiemTX2;
        this.DiemHS2 = DiemHS2;
        this.DiemTB = DiemTB;
    }
        public float tinhDiemTB(){
        if(DiemHS2 >=0){
             return DiemTB = (DiemTX1 + DiemTX2 + DiemHS2 *2) / 4 ;
        }
        else{
            return DiemTB = (DiemTX1 + DiemTX2) / 2;
        }
    }
    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String TenMH) {
        this.TenMH = TenMH;
    }

    public float getDiemTX1() {
        return DiemTX1;
    }

    public void setDiemTX1(float DiemTX1) {
        this.DiemTX1 = DiemTX1;
    }

    public float getDiemTX2() {
        return DiemTX2;
    }

    public void setDiemTX2(float DiemTX2) {
        this.DiemTX2 = DiemTX2;
    }

    public float getDiemHS2() {
        return DiemHS2;
    }

    public void setDiemHS2(float DiemHS2) {
        this.DiemHS2 = DiemHS2;
    }

    public float getDiemThi() {
        return DiemTB;
    }

    public void setDiemThi(float DiemTB) {
        this.DiemTB = DiemTB;
    }
    
}
