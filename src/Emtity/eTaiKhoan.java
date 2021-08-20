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
public class eTaiKhoan {
    private String Taikhoan;
    private String Matkhau;
    private String Loai;
    
    public eTaiKhoan() {
    }

    public eTaiKhoan(String Taikhoan, String Matkhau, String Loai) {
        this.Taikhoan = Taikhoan;
        this.Matkhau = Matkhau;
        this.Loai = Loai;
    }

    public String getTaikhoan() {
        return Taikhoan;
    }

    public void setTaikhoan(String Taikhoan) {
        this.Taikhoan = Taikhoan;
    }

    public String getMatkhau() {
        return Matkhau;
    }

    public void setMatkhau(String Matkhau) {
        this.Matkhau = Matkhau;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    
}
