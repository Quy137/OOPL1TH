/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1th;

/**
 *
 * @author Wys.Dao
 */
public class Vehicle {
    protected String tenChu, loaiXe;
    protected int dungTich;
    protected double giaTien, thueNop;

    public Vehicle(String tenChu, String loaiXe, int dungTich, double giaTien) {
        this.tenChu = tenChu;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.giaTien = giaTien;
    }

    public Vehicle() {
    }

    public String getTenChu() {
        return tenChu;
    }

    public void setTenChu(String tenChu) {
        this.tenChu = tenChu;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public double getThueNop() {
        return thueNop;
    }

    public void setThueNop(double thueNop) {
        this.thueNop = thueNop;
    }
    
    public double dongThue() {
        if(this.getDungTich() < 100) 
            return this.thueNop = this.getGiaTien() * 0.01;
        if(this.getDungTich() >= 100 && this.getDungTich() < 200)
            return this.thueNop = this.getGiaTien() * 0.03;
        if(this.getDungTich() >= 200)
            return this.thueNop = this.getGiaTien() * 0.05;
        return 0;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "tenChu= %5d"  + tenChu + ", loaiXe= %5d" + loaiXe + ", dungTich= %5d" + dungTich + ", giaTien= %5d" + giaTien + ", thueNop= %5d" + thueNop + '}';
    }
    
    
}
