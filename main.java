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
public class main {
    public static void main(String[] args) {
        Vehicle xe = new Vehicle();
        Dsxe qlxe = new Dsxe();
        int chon;
        Scanner sc = new Scanner(System.in);
        do {
        System.out.println("1. Nhap thong tin va tao cac doi tuong xe1, xe2, xe3 ");
        System.out.println("2. Xuat bang ke khai tien thue truoc ba cua xe");
        System.out.println("3. Thoat");
        System.out.println("Chon");
        chon = sc.nextInt();sc.nextLine();
        if(chon < 1|| chon>3) {
            System.out.println("Loi");
            System.out.println("Nhap lai 1 den 3");
        } else {
            switch(chon) {
            case 1:{
                    String tenChu, loaiXe;
                    int dungTich;
                    double giaTien , thueNop;
                    System.out.println("Nhap ten chu xe : "); tenChu = sc.nextLine();
                    System.out.println("Nhap ten loai xe : "); loaiXe = sc.nextLine();
                    System.out.println("Nhap dung tich cua xe : "); dungTich = sc.nextInt();sc.nextLine();
                    System.out.println("Nhap gia tien cua xe : "); giaTien = sc.nextDouble();sc.nextLine();
                    xe = new Vehicle(tenChu, loaiXe, dungTich, giaTien);
                    xe.dongThue();
                    System.out.println("Add thanh cong xe");
                    qlxe.them(xe);
                    break;
            }
            
            case 2: {
                qlxe.xuat();
                break;
            }
            
            default:
                break;
            
        }
        }
        } while(chon!=3);
        }
}

       
        
