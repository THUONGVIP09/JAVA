package Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import CONTROLER.conJDBC;
import MODEL.ADMIN;
import MODEL.user;

public class userdao implements daointerface<user>  {
	public static userdao getInstace() {
		return new userdao();}

	@Override
	public int them(user t) {
		// TODO Auto-generated method stub
		 int ketQua = 0;
	        try {
	            Connection con = conJDBC.getConnection();
	            
	            String sql = "INSERT INTO user(username,pass,hoten) " +
	                    " VALUES (? , ?, ?)";
	            PreparedStatement pst = con.prepareStatement(sql);
	            pst.setString(1, t.getUsername());
	            pst.setString(2, t.getPassword());
	            pst.setString(3, t.getHoten());
	            ketQua=pst.executeUpdate();
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
	public int capnhap(user t) {
		// TODO Auto-generated method stub
		 int ketQua = 0;
	        try {
	            Connection con = conJDBC.getConnection();
	         
	           
	            String sql = "UPDATE user SET "+"pass =?"  + ",hoten =? "+ " WHERE username = ?";
	            PreparedStatement st = con.prepareStatement(sql);
	            st.setString(1, t.getUsername());
	            st.setString(2, t.getPassword());
	            st.setString(3, t.getHoten());
	            ketQua = st.executeUpdate();
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
	public int xoa(user t) {
		 int ketQua = 0;
	        try {
	            Connection con = conJDBC.getConnection();
	            
	            String sql = " DELETE FROM user"+" WHERE username =? "  ;
	            PreparedStatement st = con.prepareStatement(sql);
	            st.setString(1, t.getUsername());
	            ketQua = st.executeUpdate();
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
	public ArrayList<user> selectAll() {
		 ArrayList<user> ketQua = new ArrayList<>();
	        try {
	            Connection con = conJDBC.getConnection();
	            
	            String sql = "SELECT * FROM user";
	            PreparedStatement st = con.prepareStatement(sql);
	            ResultSet rs = st.executeQuery(sql);
	            while (rs.next()) {
	                int id = rs.getInt("ID");
	                String username = rs.getString("username");
	                String pass= rs.getString("pass");
	                String hoten = rs.getString("hoten");
	                
	                user user = new user(username, pass, hoten);
	                ketQua.add(user);
	            }

	            conJDBC.closecon(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return ketQua;
	    }
	

	@Override
	public user selectById(user t) {
		user ketQua = null;
        try {
            Connection con = conJDBC.getConnection();
            
            String sql = "SELECT * FROM user WHERE username =? " ;
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, t.getUsername());
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
            	int id = rs.getInt("ID");
                String username = rs.getString("username");
                String pass= rs.getString("pass");
                String hoten = rs.getString("hoten");
                
                ketQua = new user(username, pass, hoten);
               
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }
	

	@Override
	public ArrayList<user> selectByCondition(String condition) {
		 ArrayList<user> ketQua = new ArrayList<>();
	       
	        return ketQua;
	}

}
