package MODEL;

import java.util.ArrayList;

public class ADMIN {
	private ArrayList<KhachHang> dsKhachHang;
	private String luachon;
	
	public ADMIN() {
		this.dsKhachHang=new ArrayList<KhachHang>();
		this.luachon="";
	}

	public ADMIN(ArrayList<KhachHang> dsKhachHang) {
		
		this.dsKhachHang = dsKhachHang;
	}

	public ArrayList<KhachHang> getDsKhachHang() {
		return dsKhachHang;
	}

	public void setDsKhachHang(ArrayList<KhachHang> dsKhachHang) {
		this.dsKhachHang = dsKhachHang;
	}
	
	public void insert(KhachHang khachhang) {
		this.dsKhachHang.add(khachhang);
	}
	public void detele(KhachHang khachhang) {
		this.dsKhachHang.remove(khachhang);
	}
	public void update(KhachHang khachhang) {
		this.dsKhachHang.remove(khachhang);
		this.dsKhachHang.add(khachhang);
	}

	public String getLuachon() {
		return luachon;
	}

	public void setLuachon(String luachon) {
		this.luachon = luachon;
	}
	
	




}
