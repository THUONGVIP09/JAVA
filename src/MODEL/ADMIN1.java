package MODEL;

import java.util.ArrayList;

import Dao.hoadondao;
import Dao.khachhangdao;

public class ADMIN1 {
	public ArrayList<hoadon> dshoadon;
	public String luachon1;
	public ADMIN1() {
		this.dshoadon=new ArrayList<hoadon>();
		this.luachon1="";
	}
	public ADMIN1(ArrayList<hoadon> dshoadon) {
		
		this.dshoadon = dshoadon;
	}
	public ArrayList<hoadon> getDshoadon() {
		return dshoadon;
	}
	public void setDshoadon(ArrayList<hoadon> dshoadon) {
		this.dshoadon = dshoadon;
	}
	public void insert(hoadon hoadon) {
		this.dshoadon.add(hoadon);
	}
	public void detele(hoadon hoadon) {
		this.dshoadon.remove(hoadon);
	}
	public void update(hoadon hoadon) {
		this.dshoadon.remove(hoadon);
		this.dshoadon.add(hoadon);
	}
	public String getLuachon1() {
		return luachon1;
	}
	public void setLuachon1(String luachon1) {
		this.luachon1 = luachon1;
	}
	public boolean kiemtratontai1(hoadon hd) {
		for(hoadon hoadon : hoadondao.getInstace().selectAll()) {
			if( (hoadon.getIDhoadon())==(hd.getIDhoadon())) 
				return true;
		}
		return false;
	}
	
	
	}


