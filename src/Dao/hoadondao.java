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
import MODEL.hoadon;
import VIEW.ADMINVIEW1;

public class hoadondao implements daointerface<hoadon>  {
	public static hoadondao getInstace() {
		return new hoadondao();}

	@Override
	public int them(hoadon t) {
		// TODO Auto-generated method stub
		 int ketQua = 0;
	        try {
	            Connection con = conJDBC.getConnection();
	            Statement st = con.createStatement();
	            if(t.getTinhtrang().equals("Đã Thanh Toán")) {
	            	
	         
	            String sql = "INSERT INTO thongtinhoadon(idhoadon,idkhachhang, quan,thang,sonuoccu,sonuocmoi,sonuocdung,dongia,tongtien,tinhtrang,ngaythanhtoan) " +
	                    " VALUES ('" + t.getIDhoadon()+ "',"  + t.getIDkh() + ",'" + t.getQuan() + "','" + (t.getThang().getYear()+1900)+"-"+(t.getThang().getMonth()+1)+"-01"+ "'," + t.getSonuoccu() + ","+ t.getSonuocmoi()+","+ t.getSonuocdung()+","+ t.getDongia()+","+ t.getTongtien()+ ",'"+t.getTinhtrang() + "','"+(t.getNgaythanhtoan().getYear()+1900)+"-"+(t.getNgaythanhtoan().getMonth()+1)+"-"+t.getNgaythanhtoan().getDate() +"')";
	            
	            
	            ketQua = st.executeUpdate(sql);
	            if (ketQua > 0) {
	                System.out.println("Bạn đã thực thi" + sql);
	                System.out.println("Có " + ketQua + " dòng bị thay đổi!");
	            }
	            conJDBC.closecon(con);}
	            else {String sql = "INSERT INTO thongtinhoadon(idhoadon,idkhachhang, quan,thang,sonuoccu,sonuocmoi,sonuocdung,dongia,tongtien,tinhtrang,ngaythanhtoan) " +
	                    " VALUES ('" + t.getIDhoadon()+ "',"  + t.getIDkh() + ",'" + t.getQuan() + "','" + (t.getThang().getYear()+1900)+"-"+(t.getThang().getMonth()+1)+"-01"+ "'," + t.getSonuoccu() + ","+ t.getSonuocmoi()+","+ t.getSonuocdung()+","+ t.getDongia()+","+ t.getTongtien()+ ",'"+t.getTinhtrang() + "',null)";
	            
	            
	            ketQua = st.executeUpdate(sql);
	            if (ketQua > 0) {
	                System.out.println("Bạn đã thực thi" + sql);
	                System.out.println("Có " + ketQua + " dòng bị thay đổi!");
	            }
	            conJDBC.closecon(con);}
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return ketQua;
		
	}

	@Override
	public int capnhap(hoadon t) {
		// TODO Auto-generated method stub
		 int ketQua = 0;
	        try {
	            Connection con = conJDBC.getConnection();
	            Statement st = con.createStatement();
	            if(t.getTinhtrang().equals("Đã Thanh Toán")) {
	            
	            String sql = "UPDATE thongtinhoadon"+" SET "+"idhoadon ='" + t.getIDhoadon()+ "', idkhachhang = '"+t.getIDkh()+"',quan='" + t.getQuan() + "',thang='" + (t.getThang().getYear()+1900)+"-"+(t.getThang().getMonth()+1) +"-01"+ "',sonuoccu='" + t.getSonuoccu() + "',sonuocmoi='"+ t.getSonuocmoi()+"',sonuocdung='"+ t.getSonuocdung()+"',dongia='"+ t.getDongia()+"',tongtien='"+ t.getTongtien()+ "',tinhtrang='"+t.getTinhtrang() + "',ngaythanhtoan='" +(t.getNgaythanhtoan().getYear()+1900)+"-"+(t.getNgaythanhtoan().getMonth()+1)+"-"+(t.getNgaythanhtoan().getDate()) +"'"+ " WHERE idhoadon = '" + t.getIDhoadon() + "'";
	            ketQua = st.executeUpdate(sql);
	            if (ketQua > 0) {
	                System.out.println("Bạn đã thực thi" + sql);
	                System.out.println("Có " + ketQua + " dòng bị thay đổi!");
	            }}
	            else {  String sql = "UPDATE thongtinhoadon"+" SET "+"idhoadon ='" + t.getIDhoadon()+ "', idkhachhang = '"+t.getIDkh()+"',quan='" + t.getQuan() + "',thang='" + (t.getThang().getYear()+1900)+"-"+(t.getThang().getMonth()+1) +"-01"+ "',sonuoccu='" + t.getSonuoccu() + "',sonuocmoi='"+ t.getSonuocmoi()+"',sonuocdung='"+ t.getSonuocdung()+"',dongia='"+ t.getDongia()+"',tongtien='"+ t.getTongtien()+ "',tinhtrang='"+t.getTinhtrang() + "',ngaythanhtoan= null "+ " WHERE idhoadon = '" + t.getIDhoadon() + "'";
	            ketQua = st.executeUpdate(sql);
	            if (ketQua > 0) {
	                System.out.println("Bạn đã thực thi" + sql);
	                System.out.println("Có " + ketQua + " dòng bị thay đổi!");
	            }}
	            conJDBC.closecon(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return ketQua;
	
	}

	@Override
	public int xoa(hoadon t) {
		 int ketQua = 0;
	        try {
	            Connection con = conJDBC.getConnection();
	            Statement st = con.createStatement();
	            String sql = " DELETE FROM thongtinhoadon"+" WHERE idhoadon = " + t.getIDhoadon() ;
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
	public ArrayList<hoadon> selectAll() {
		 ArrayList<hoadon> ketQua = new ArrayList<>();
	        try {
	            Connection con = conJDBC.getConnection();
	            Statement st = con.createStatement();
	            String sql = "SELECT * FROM thongtinhoadon";
	            ResultSet rs = st.executeQuery(sql);
	            while (rs.next()) {
	            	 int idhoadon = rs.getInt("idhoadon");
	                int idkh = rs.getInt("idkhachhang");
	                
	                String quan = rs.getString("quan");
	                Date thang= rs.getDate("thang");
	                int sonuoccu = rs.getInt("sonuoccu");
	                int sonuocmoi = rs.getInt("sonuocmoi");
	                int sonuocdung = rs.getInt("sonuocdung");
	                int dongia = rs.getInt("dongia");
	                int tongtien = rs.getInt("tongtien");
	                
	                String tinhtrang = rs.getString("tinhtrang");
	                Date ngaythanhtoan= rs.getDate("ngaythanhtoan");
	               
	                
	                hoadon hd= new hoadon(idhoadon, idkh, quan, thang, sonuoccu, sonuocmoi, sonuocdung, dongia, tongtien, tinhtrang, ngaythanhtoan);
	                ketQua.add(hd);
	               
	            }

	            conJDBC.closecon(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return ketQua;
	    }
	

	@Override
	public hoadon selectById(hoadon t) {
		hoadon ketQua = null;
        try {
            Connection con = conJDBC.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM thongtinhoadon"+" WHERE idhoadon = '" + t.getIDhoadon() + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
            	int idhoadon = rs.getInt("idhoadon");
                int idkh = rs.getInt("idkhachhang");
                String quan = rs.getString("quan");
                Date thang= rs.getDate("thang");
                int sonuoccu = rs.getInt("sonuoccu");
                int sonuocmoi = rs.getInt("sonuocmoi");
                int sonuocdung = rs.getInt("sonuocdung");
                int dongia = rs.getInt("dongia");
                int tongtien = rs.getInt("tongtien");
                
                String tinhtrang = rs.getString("tinhtrang");
                Date ngaythanhtoan= rs.getDate("ngaythanhtoan");
            	ketQua = new hoadon(idhoadon, idkh, quan, thang, sonuoccu, sonuocmoi, sonuocdung, dongia, tongtien, tinhtrang, ngaythanhtoan);
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }
	

	@Override
	public ArrayList<hoadon> selectByCondition(String condition) {
		 ArrayList<hoadon> ketQua = new ArrayList<>();
	        try {
	            Connection con = conJDBC.getConnection();
	            Statement st = con.createStatement();
	            String sql = "SELECT * FROM thongtinhoadon"+" where"+condition;
	            ResultSet rs = st.executeQuery(sql);
	            while (rs.next()) {
	            	int idhoadon = rs.getInt("idhoadon");
	                int idkh = rs.getInt("idkhachhang");
	                String quan = rs.getString("quan");
	                Date thang= rs.getDate("thang");
	                int sonuoccu = rs.getInt("sonuoccu");
	                int sonuocmoi = rs.getInt("sonuocmoi");
	                int sonuocdung = rs.getInt("sonuocdung");
	                int dongia = rs.getInt("dongia");
	                int tongtien = rs.getInt("tongtien");
	                
	                String tinhtrang = rs.getString("tinhtrang");
	                Date ngaythanhtoan= rs.getDate("ngaythanhtoan");
	                hoadon hd = new hoadon(idhoadon, idkh, quan, thang, sonuoccu, sonuocmoi, sonuocdung, dongia, tongtien, tinhtrang, ngaythanhtoan);
	                ketQua.add(hd);
	            }

	            conJDBC.closecon(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return ketQua;
	}
	
		
		
	

}
