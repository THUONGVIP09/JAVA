package Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import CONTROLER.conJDBC;
import MODEL.ADMIN;
import MODEL.KhachHang;
import VIEW.ADMINVIEW1;

public class khachhangdao implements daointerface<KhachHang>  {
	public static khachhangdao getInstace() {
		return new khachhangdao();}

	@Override
	public int them(KhachHang t) {
		// TODO Auto-generated method stub
		 int ketQua = 0;
	        try {
	            Connection con = conJDBC.getConnection();
	            Statement st = con.createStatement();
	            String sql = "INSERT INTO thongtinkhachhang(ID,HOTEN,DIACHI,QUAN,SDT,GIOITINH,NGAYSINH) " +
	                    " VALUES ('" + t.getIDKhachhang()+ "','"  + t.getTenkh() + "','" + t.getDiachikh() + "','" + t.getQuan() + "','" + t.getSdt() + "',"+ (t.isGioitinh()?"1":"0")+",'"+(t.getNgaysinh().getYear()+1900)+"-"+(t.getNgaysinh().getMonth()+1)+"-"+ t.getNgaysinh().getDate() +"')";
	            ketQua = st.executeUpdate(sql);
	            if (ketQua > 0) {
	                System.out.println("Bạn đã thực thi" + sql);
	                System.out.println("Có " + ketQua + " dòng bị thay đổi!");
	            }
	            conJDBC.closecon(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return ketQua;
		
	}

	@Override
	public int capnhap(KhachHang t) {
		// TODO Auto-generated method stub
		 int ketQua = 0;
	        try {
	            Connection con = conJDBC.getConnection();
	            Statement st = con.createStatement();
	            
	            String sql = "UPDATE thongtinkhachhang"+" SET"+" ID = '" + t.getIDKhachhang() + "'"+", HOTEN = '" + t.getTenkh() +"'"+",  DIACHI = '"  + t.getDiachikh() + "'"+", QUAN = '"+ t.getQuan()+ "'"+",SDT = '"+ t.getSdt() + "'"+",GIOITINH = "+ t.isGioitinh() + ""+",NGAYSINH = '"+(t.getNgaysinh().getYear()+1900)+"-"+(t.getNgaysinh().getMonth()+1)+"-"+ t.getNgaysinh().getDate()+ "'"+ " WHERE ID = '" + t.getIDKhachhang() + "'";
	            ketQua = st.executeUpdate(sql);
	            if (ketQua > 0) {
	                System.out.println("Bạn đã thực thi" + sql);
	                System.out.println("Có " + ketQua + " dòng bị thay đổi!");
	            }
	            conJDBC.closecon(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return ketQua;
	
	}

	@Override
	public int xoa(KhachHang t) {
		 int ketQua = 0;
	        try {
	            Connection con = conJDBC.getConnection();
	            Statement st = con.createStatement();
	            String sql = " DELETE FROM thongtinkhachhang"+" WHERE ID = " + t.getIDKhachhang() ;
	            ketQua = st.executeUpdate(sql);
	            if (ketQua > 0) {
	                System.out.println("Bạn đã thực thi" + sql);
	                System.out.println("Có " + ketQua + " dòng bị thay đổi!");
	            }
	            conJDBC.closecon(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return ketQua;
	}

	@Override
	public ArrayList<KhachHang> selectAll() {
		 ArrayList<KhachHang> ketQua = new ArrayList<>();
	        try {
	            Connection con = conJDBC.getConnection();
	            Statement st = con.createStatement();
	            String sql = "SELECT * FROM thongtinkhachhang";
	            ResultSet rs = st.executeQuery(sql);
	            while (rs.next()) {
	                int id = rs.getInt("ID");
	                String tenkh = rs.getString("HOTEN");
	                Date ngaySinh= rs.getDate("NGAYSINH");
	               Boolean gioiTinh = rs.getBoolean("GIOITINH");
	                String diachi= rs.getString("DIACHI");
	                String soDienThoai = rs.getString("SDT");
	                String quan = rs.getString("QUAN");
	                
	                KhachHang kh = new KhachHang(id, tenkh, diachi, quan,ngaySinh, gioiTinh,soDienThoai);
	                ketQua.add(kh);
	               
	            }

	            conJDBC.closecon(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return ketQua;
	    }
	

	@Override
	public KhachHang selectById(KhachHang t) {
		KhachHang ketQua = null;
        try {
            Connection con = conJDBC.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM thongtinkhachhang"+" WHERE ID = '" + t.getIDKhachhang() + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
            	int id = rs.getInt("ID");
                String tenkh = rs.getString("HOTEN");
                Date ngaySinh= rs.getDate("NGAYSINH");
               Boolean gioiTinh = rs.getBoolean("GIOITINH");
                String diachi= rs.getString("DIACHI");
                String soDienThoai = rs.getString("SDT");
                String quan = rs.getString("QUAN");
            	ketQua = new KhachHang(id, tenkh, diachi, quan, ngaySinh, gioiTinh, soDienThoai);
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }
	

	@Override
	public ArrayList<KhachHang> selectByCondition(String condition) {
		 ArrayList<KhachHang> ketQua = new ArrayList<>();
	        try {
	            Connection con = conJDBC.getConnection();
	            Statement st = con.createStatement();
	            String sql = "SELECT * FROM thongtinkhachhang"+" where"+condition;
	            ResultSet rs = st.executeQuery(sql);
	            while (rs.next()) {
	                int id = rs.getInt("ID");
	                String tenkh = rs.getString("HOTEN");
	                Date ngaySinh= rs.getDate("NGAYSINH");
	               Boolean gioiTinh = rs.getBoolean("GIOITINH");
	                String diachi= rs.getString("DIACHI");
	                String soDienThoai = rs.getString("SDT");
	                String quan = rs.getString("QUAN");
	                KhachHang kh = new KhachHang(id, tenkh, diachi, quan, ngaySinh, gioiTinh, quan);
	                ketQua.add(kh);
	            }

	            conJDBC.closecon(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return ketQua;
	}

}
