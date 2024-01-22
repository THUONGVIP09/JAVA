package MODEL;

import java.util.Date;
import java.util.Objects;

public class hoadon {
	private int IDhoadon;
	private int IDkh ;
	private String quan;
	private int sonuoccu ;
	private int sonuocmoi;
	private int sonuocdung;
	private int dongia;
	private int tongtien;
	private String tinhtrang;
	private Date ngaythanhtoan;
	private Date thang;
	
	public hoadon() {
		
	}

	public hoadon(int iDhoadon, int iDkh, String quan,Date thang, int sonuoccu, int sonuocmoi,int sonuocdung, int dongia,int tongtien,
			String tinhtrang, Date ngaythanhtoan) {
		super();
		IDhoadon = iDhoadon;
		IDkh = iDkh;
		this.quan = quan;
		this.sonuoccu = sonuoccu;
		this.sonuocmoi = sonuocmoi;
		this.sonuocdung = sonuocdung;
		this.dongia = dongia;
		this.tongtien = tongtien;
		this.tinhtrang = tinhtrang;
		this.ngaythanhtoan = ngaythanhtoan;
		this.thang=thang;
	}

	@Override
	public String toString() {
		return "hoadon [IDhoadon=" + IDhoadon + ", IDkh=" + IDkh + ", quan=" + quan + ", sonuoccu=" + sonuoccu
				+ ", sonuocmoi=" + sonuocmoi + ", sonuocdung=" + sonuocdung + ", dongia=" + dongia + ", tongtien="
				+ tongtien + ", tinhtrang=" + tinhtrang + ", ngaythanhtoan=" + ngaythanhtoan + ", thang=" + thang + "]";
	}

	public Date getThang() {
		return thang;
	}

	public void setThang(Date thang) {
		this.thang = thang;
	}

	public int getTongtien() {
		tongtien=dongia*sonuocdung;
		return tongtien;
	}

	public void setTongtien(int tongtien) {
		this.tongtien = tongtien;
	}

	public int getIDhoadon() {
		return IDhoadon;
	}

	public void setIDhoadon(int iDhoadon) {
		IDhoadon = iDhoadon;
	}

	public int getIDkh() {
		return IDkh;
	}

	public void setIDkh(int iDkh) {
		IDkh = iDkh;
	}

	public String getQuan() {
		return quan;
	}

	public void setQuan(String quan) {
		this.quan = quan;
	}

	public int getSonuoccu() {
		
		return sonuoccu;
	}

	public void setSonuoccu(int sonuoccu) {
		this.sonuoccu = sonuoccu;
	}

	public int getSonuocmoi() {
		return sonuocmoi;
	}

	public void setSonuocmoi(int sonuocmoi) {
		this.sonuocmoi = sonuocmoi;
	}

	public int getSonuocdung() {
		sonuocdung=sonuocmoi-sonuoccu;
		
	
		
		return sonuocdung;
	}

	public void setSonuocdung(int sonuocdung) {
		this.sonuocdung = sonuocdung;
	}

	public int getDongia() {
		return dongia;
	}

	public void setDongia(int dongia) {
		this.dongia = dongia;
	}

	public String getTinhtrang() {
		return tinhtrang;
	}

	public void setTinhtrang(String tinhtrang) {
		this.tinhtrang = tinhtrang;
	}

	public Date getNgaythanhtoan() {
		return ngaythanhtoan;
	}

	public void setNgaythanhtoan(Date ngaythanhtoan) {
		this.ngaythanhtoan = ngaythanhtoan;
	}

	@Override
	public int hashCode() {
		return Objects.hash(IDhoadon, IDkh, dongia, ngaythanhtoan, quan, sonuoccu, sonuocdung, sonuocmoi,thang,tongtien, tinhtrang);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		hoadon other = (hoadon) obj;
		return Objects.equals(IDhoadon, other.IDhoadon) && IDkh == other.IDkh && dongia == other.dongia
				&& Objects.equals(ngaythanhtoan, other.ngaythanhtoan)&& Objects.equals(thang, other.thang) && Objects.equals(quan, other.quan)
				&& sonuoccu == other.sonuoccu && sonuocdung == other.sonuocdung && sonuocmoi == other.sonuocmoi && tongtien== other.tongtien
				&& Objects.equals(tinhtrang, other.tinhtrang);
	}

	

}


