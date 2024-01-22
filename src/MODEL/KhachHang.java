package MODEL;

import java.util.Date;
import java.util.Objects;

public class KhachHang {
	private int IDKhachhang;
	private String tenkh;
	private String diachikh;
	private String quan;
	private Date ngaysinh;
	private boolean gioitinh;
	private String sdt;
	
	
	public KhachHang() {
		
	}


	public KhachHang(int iDKhachhang, String tenkh, String diachikh, String quan, Date ngaysinh, boolean gioitinh,String sdt) {
		super();
		IDKhachhang = iDKhachhang;
		this.tenkh = tenkh;
		this.diachikh = diachikh;
		this.quan = quan;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		this.sdt = sdt;
	}


	public int getIDKhachhang() {
		return IDKhachhang;
	}


	public void setIDKhachhang(int iDKhachhang) {
		IDKhachhang = iDKhachhang;
	}


	public String getTenkh() {
		return tenkh;
	}


	public void setTenkh(String tenkh) {
		this.tenkh = tenkh;
	}


	public String getDiachikh() {
		return diachikh;
	}


	public void setDiachikh(String diachikh) {
		this.diachikh = diachikh;
	}


	public String getQuan() {
		return quan;
	}


	public void setQuan(String quan) {
		this.quan = quan;
	}


	public Date getNgaysinh() {
		return ngaysinh;
	}


	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}


	public boolean isGioitinh() {
		return gioitinh;
	}


	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}


	public String getSdt() {
		return sdt;
	}


	public void setSdt(String sdt) {
		this.sdt = sdt;
	}


	@Override
	public String toString() {
		return "KhachHang [IDKhachhang=" + IDKhachhang + ", tenkh=" + tenkh + ", diachikh=" + diachikh + ", quan="
				+ quan + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + ", sdt=" + sdt + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(IDKhachhang, diachikh, gioitinh, ngaysinh, quan, sdt, tenkh);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang other = (KhachHang) obj;
		return IDKhachhang == other.IDKhachhang && Objects.equals(diachikh, other.diachikh)
				&& gioitinh == other.gioitinh && Objects.equals(ngaysinh, other.ngaysinh)
				&& Objects.equals(quan, other.quan) && Objects.equals(sdt, other.sdt)
				&& Objects.equals(tenkh, other.tenkh);
	}


	
	

}
