package lab1b;

import java.util.Scanner;

public class Main1b {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		dsHH ds = new dsHH();
		int a,b;
		do {
			System.out.println("1.nhap thong tin");
			System.out.println("2.xuat thong tin");
			System.out.println("3.thoat");
			HangThucPham htp = new HangThucPham();
			a = input.nextInt();
			 if(a < 1 || a > 3) {
				 System.out.println("------------------");
				 System.out.println("vui long nhap lai!");
				 System.out.println("------------------");
			 }else {
				 switch(a) {
				 case 1: {
					 System.out.println("nhap ma hang: ");
					 input.nextLine();
					 htp.setMaHang(input.nextLine());
					 System.out.println("nhap ten hang: ");
					 htp.setTenHang(input.nextLine());
					 System.out.println("nhap don gia: ");
					 htp.setDonGia(input.nextInt());
//					 System.out.println("");
//                     System.out.println("1.Hang con han");
//                	 System.out.println("2.Hang het han");
//                	 b = input.nextInt();
//                	 do {
//                		 if(b < 1 || b > 2) {
//                			 System.out.println("sai roi nhap lai");
//                		 }else {
//                			 switch(b) {
//                			 case 1:{
//                				 System.out.println("con han");
//                				 break;
//                			 }
//                			 case 2:{
//                				 htp.ghiChu();
//                				 break;
//                			 }
//                			 }
//                		 }
//                	 }while(b < 1 || b > 2);
					 int thangSX;
                     do {
                         System.out.println("nhap thang san xuat: ");
                         htp.setThangSX(thangSX = input.nextInt());
                         if (thangSX < 1 || thangSX > 12) {
                             System.out.println("nhap trong khoang tu 1 toi 12: ");
                         }
                     } while (thangSX < 1 || thangSX > 12);

                     int ngaySX;
                     switch (thangSX) {
                         case 1, 3, 5, 7, 8, 10, 12: {

                             do {
                                 System.out.println("nhap ngay san xuat: ");
                                 htp.setNgaySX(ngaySX = input.nextInt());
                                 if (ngaySX < 0 || ngaySX > 31) {
                                     System.out.println("Thang " + thangSX + " chi co 31 ngay!");
                                     System.out.println("Nhap lai!!!");
                                 }
                             } while (ngaySX < 0 || ngaySX > 31);

                             break;
                         }
                         case 4, 6, 9, 11: {

                             do {
                                 System.out.println("nhap ngay san xuat: ");
                                 htp.setNgaySX(ngaySX = input.nextInt());
                                 if (ngaySX < 0 || ngaySX > 30) {
                                     System.out.println("Thang " + thangSX + " chi co 30 ngay!");
                                     System.out.println("Nhap lai!!!");
                                 }
                             } while (ngaySX < 0 || ngaySX > 30);

                             break;
                         }
                         default: {

                             do {
                                 System.out.println("nhap ngay san xuat: ");
                                 htp.setNgaySX(ngaySX = input.nextInt());
                                 if (ngaySX < 0 || ngaySX > 28) {
                                     System.out.println("Thang " + thangSX + " chi co 28 ngay!");
                                     System.out.println("Nhap lai!!!");
                                 }
                             } while (ngaySX < 0 || ngaySX > 29);

                             break;
                         }
                     }

                     int namSX;
                     do {
                         System.out.println("nhap nam san xuat: ");
                         htp.setNamSX(namSX = input.nextInt());
                         if (namSX < 0) {
                             System.out.println("Nam phai lon hon 0");
                         }
                     } while (namSX < 0);
                     int thangHH;
                     do {
                         System.out.println("nhap thang het han: ");
                         htp.setThangHH(thangHH = input.nextInt());
                         if (thangHH < 0 || thangHH > 12) {
                             System.out.println("Phai nhap trong khoang tu 1 toi 12: ");
                         }
                     } while (thangHH < 0 || thangHH > 12);
                     int ngayHH;
                     switch (thangHH) {
                         case 1, 3, 5, 7, 8, 10, 12: {
                             do {
                                 System.out.println("nhap ngay het han: ");
                                 htp.setNgayHH(ngayHH = input.nextInt());
                                 if (ngayHH < 0 || ngayHH > 31) {
                                     System.out.println("Thang " + thangHH + " chi co 31 ngay!");
                                     System.out.println("Nhap lai!!!");
                                 }
                             } while (ngayHH < 0 || ngayHH > 31);
                             break;
                         }
                         case 4, 6, 9, 11: {
                             do {
                                 System.out.println("nhap ngay het han: ");
                                 htp.setNgayHH(ngayHH = input.nextInt());
                                 if (ngayHH < 0 || ngayHH > 30) {
                                     System.out.println("Thang " + thangHH + " chi co 30 ngay!");
                                     System.out.println("Nhap lai!!!");
                                 }
                             } while (ngayHH < 0 || ngayHH > 30);
                             break;
                         }
                         default: {
                             do {
                                 System.out.println("nhap ngay het han: ");
                                 htp.setNgayHH(ngayHH = input.nextInt());
                                 if (ngayHH < 0 || ngayHH > 28) {
                                     System.out.println("Thang " + thangHH + " chi co 28 ngay!");
                                     System.out.println("Nhap lai!!!");
                                 }
                             } while (ngayHH < 0 || ngayHH > 29);
                             break;
                         }
                     }
                     
                     int namHH;
                     do {
                         System.out.println("Hay nhap vao nam xuat kho: ");
                         htp.setNamHH(namHH = input.nextInt());
                         if (namHH < 0) {
                             System.out.println("Nam phai lon hon 0");
                         }
                         if (namHH < namSX) {
                             System.out.println("Nam xuat kho phai lon hon nam nhap kho!");
                         }
                     } while (namHH < 0 || namHH < namSX);
//                     System.out.println("");
//                     System.out.println("1.Hang con han");
//                	 System.out.println("2.Hang het han");
//                	 do {
//                		 if(a < 1 || a > 2) {
//                			 System.out.println("sai roi nhap lai");
//                		 }else {
//                			 switch(a) {
//                			 case 1:{
//                				 System.out.println("");
//                				 break;
//                			 }
//                			 case 2:{
//                				 htp.setGhiChu();
//                				 break;
//                			 }
//                			 }
//                		 }
//                	 }while(a < 1 || a > 2);
                     ds.add(htp);
                     break;
				 }
				 case 2: {
					 System.out.println("---------------------------------------KET QUA---------------------------------------");
					 System.out.println("Ma hang\t" + "\tTen hang\t" + "Don gia\t" + "\tNgay san xuat\t" + "\tNgay het han\t" + "\tGhi chu");
					 System.out.println("-------------------------------------------------------------------------------------");
					 ds.xuat();
					 break;
				 }
				 }
			 }
		}while (a != 3);
	}
}