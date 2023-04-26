/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1th;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Wys.Dao
 */
public class Dsxe {
    ArrayList<Vehicle> listxe;
    Vehicle xe;
    Scanner sc;
    int chon;
    
    public Dsxe() {
        super();
        listxe = new ArrayList<Vehicle>();
        sc = new Scanner(System.in);
    }
    
     public void xuat() {
             System.out.println(String.format("|%-20s | %-20s | %-10s | %-20s | %-15s |","ten chu xe",
                     "loai xe" , "dung tich", "tri gia", "thue phai dong"));
             System.out.println("-------------------------------------------------------------------------------------");
             
         for (Vehicle xe : listxe) {
             System.out.println(String.format("|%-20s| %-20s| %-10d | %-20.2f | %-15.2f| ",xe.getTenChu(),xe.getLoaiXe(),xe.getDungTich(),xe.getGiaTien(),xe.getThueNop()));
         }
        
         }
     public void them(Vehicle xe) {
         this.listxe.add(xe);
     }
                    
}

   
    
    
 
