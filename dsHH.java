package lab1b;

import java.util.ArrayList;

public class dsHH {
	public ArrayList<HangThucPham> listHTP;
	
	public dsHH() {
		this.listHTP = new ArrayList<HangThucPham>();
	}
	public dsHH(ArrayList<HangThucPham> listHTP) {
		this.listHTP = listHTP;
	}
	public void add(HangThucPham htp) {
		this.listHTP.add(htp);
	}
	public void xuat() {
		for(HangThucPham hangThucPham : listHTP) {
			System.out.println(hangThucPham);
		}
	}
}