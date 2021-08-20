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
public class eGiangVien {
    private String Magiangvien;
    private String Tengiangvien;
    private String Gioitinh;
    private String Ngaysinh;
    private String Diachi;
    private String SDT;

    public eGiangVien() {
    }

    public eGiangVien(String Magiangvien, String Tengiangvien, String Gioitinh, String Ngaysinh, String Diachi, String SDT) {
        this.Magiangvien = Magiangvien;
        this.Tengiangvien = Tengiangvien;
        this.Gioitinh = Gioitinh;
        this.Ngaysinh = Ngaysinh;
        this.Diachi = Diachi;
        this.SDT = SDT;
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

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    
    
}
