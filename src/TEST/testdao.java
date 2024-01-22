package TEST;

import java.util.ArrayList;

import Dao.khachhangdao;
import MODEL.KhachHang;

public class testdao {
	public static void main(String[] args) {
		ArrayList<KhachHang>list=khachhangdao.getInstace().selectAll();
		for(KhachHang khachHang:list) {
			System.out.println(khachHang.toString());
		}
		KhachHang find=new KhachHang();
		find.setIDKhachhang(1);
		KhachHang kh2=khachhangdao.getInstace().selectById(find);
		System.out.println(kh2);
	}


}
