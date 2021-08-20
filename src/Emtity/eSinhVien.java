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
public class eSinhVien {
    private String Masinhvien;
    private String Tensinhvien;
    private String Malop;
    private String Gioitinh;
    private String Ngaysinh;
    private String Diachi;
    private String SDT;

    public eSinhVien() {
    }

    public eSinhVien(String Masinhvien, String Tensinhvien, String Malop, String Gioitinh, String Ngaysinh, String Diachi, String SDT) {
        this.Masinhvien = Masinhvien;
        this.Tensinhvien = Tensinhvien;
        this.Malop = Malop;
        this.Gioitinh = Gioitinh;
        this.Ngaysinh = Ngaysinh;
        this.Diachi = Diachi;
        this.SDT = SDT;
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

    public String getMalop() {
        return Malop;
    }

    public void setMalop(String Malop) {
        this.Malop = Malop;
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
