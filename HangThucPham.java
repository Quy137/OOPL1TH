package lab1b;


public class HangThucPham {
	public String maHang, tenHang, ghiChu;
	public int ngaySX, thangSX, namSX, ngayHH, thangHH, namHH;
	public float donGia;
	public HangThucPham() {
		super();
	}
	public HangThucPham(String maHang, String tenHang, int ngaySX, int thangSX, int namSX, int ngayHH, int thangHH,
			int namHH, float donGia) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.ngaySX = ngaySX;
		this.thangSX = thangSX;
		this.namSX = namSX;
		this.ngayHH = ngayHH;
		this.thangHH = thangHH;
		this.namHH = namHH;
		this.donGia = donGia;
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public int getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(int ngaySX) {
		this.ngaySX = ngaySX;
	}
	public int getThangSX() {
		return thangSX;
	}
	public void setThangSX(int thangSX) {
		this.thangSX = thangSX;
	}
	public int getNamSX() {
		return namSX;
	}
	public void setNamSX(int namSX) {
		this.namSX = namSX;
	}
	public int getNgayHH() {
		return ngayHH;
	}
	public void setNgayHH(int ngayHH) {
		this.ngayHH = ngayHH;
	}
	public int getThangHH() {
		return thangHH;
	}
	public void setThangHH(int thangHH) {
		this.thangHH = thangHH;
	}
	public int getNamHH() {
		return namHH;
	}
	public void setNamHH(int namHH) {
		this.namHH = namHH;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	public void ghiChu() {
		System.out.println("het han");
	}
	@Override
	public String toString() {
		return  maHang + "\t\t" + tenHang + "\t\t" + donGia + "\t\t" + ngaySX + "/" + thangSX + "/" + namSX + "\t\t" + ngayHH + "/" + thangHH + "/" + namHH + "\t\t" + ghiChu;
	}
}