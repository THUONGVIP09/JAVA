package CONTROLER;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

import MODEL.KhachHang;
import VIEW.ADMINVIEW1;

public class conJDBC {
	static String username="root";
	static String pass="thuongle2";
	static String data="jdbc:mysql://localhost:3306/duan";
	public static Connection getConnection() {
		Connection c=null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			c=DriverManager.getConnection(data,username,pass);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	public static void closecon(Connection c) {
		try {
			if(c!=null) {
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public static void print(Connection c) {
		try {
			if (c != null) {
				DatabaseMetaData mtdt = c.getMetaData();
				System.out.println(mtdt.getDatabaseProductName());
				System.out.println(mtdt.getDatabaseMajorVersion());
			} 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
