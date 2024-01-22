package TEST;

import java.sql.Connection;
import java.sql.Statement;

import CONTROLER.conJDBC;

public class testjdbc {
	public static void main(String[] args) {
		try {
			Connection con = conJDBC.getConnection();
			Statement st = con.createStatement();
			String sql = "INSERT INTO thongtinkhachhang (ID,HOTEN,DIACHI,QUAN,SDT,GIOITINH,NGAYSINH)\r\n"
					+ "VALUES (1,'Lê Văn A','23 Ngô Sỹ Liên','Liên Chiểu','0399613807','Nam',null);";
			
			int check=st.executeUpdate(sql);
			
			System.out.println("so dong thay doi:"+check);
			if(check>0) {
				System.out.println("them du lieu thanh cong");
			}else {
				System.out.println("thatbai");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
