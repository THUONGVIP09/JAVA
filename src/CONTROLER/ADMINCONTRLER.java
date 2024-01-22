package CONTROLER;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;

import javax.swing.Action;
import javax.swing.JOptionPane;

import Dao.khachhangdao;
import MODEL.KhachHang;

import VIEW.ADMINVIEW1;
import VIEW.login;

public class ADMINCONTRLER implements Action {
	public login log;
	public ADMINCONTRLER(login log1) {
		// TODO Auto-generated constructor stub
		this.log=log1;
		
	}
	public ADMINVIEW1 view;
	public ADMINCONTRLER(ADMINVIEW1 adminview1) {
		
		this.view = adminview1;
	}
	public khachhangdao dao;
	public ADMINCONTRLER(khachhangdao khdao) {
		this.dao=khdao;
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String cm =e.getActionCommand();
		//JOptionPane.showMessageDialog(view, "Bạn vừa nhấn vào: "+cm);
		if(cm.equals("THÊM")) {
			this.view.xoaForm();
			this.view.adminmodel.setLuachon("THÊM");
			
		}else if(cm.equals("LƯU")) {
			try {
				
			this.view.thuchienthemKH();
			
			
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}else if(cm.equals("CHỈNH SỬA"))  {
			
				this.view.hienthi();
			
		
			
		}else if(cm.equals("XÓA")) {
			this.view.thuchienxoa();
			
		
		}else if(cm.equals("TÌM KIẾM")) {
			this.view.thuchientim();
		}else if(cm.equals("HỦY")) {
			this.view.thuchienhuy();
		}else if(cm.equals("ĐĂNG NHẬP")) {
			//JOptionPane.showMessageDialog(log, "Bạn vừa nhấn vào: "+cm);
			this.log.loginquanli();
		}else if(cm.equals("Thoát")) {
			this.view.thoatkhoict();
		}else if(cm.equals("Khách hàng")){
			this.view.ttkh();
			
		}else if(cm.equals("Hóa đơn")) {
			this.view.tttt();
		}else if(cm.equals("Thêm")) {
			this.view.xoaform1();
			this.view.adminmodel1.setLuachon1("Thêm");
		}else if(cm.equals("Lưu")) {
			this.view.thuchienthemhd();
		}else if(cm.equals("Sửa")) {
			this.view.hienthihd();
		}else if(cm.equals("Xóa")) {
			this.view.thuchienxoahd();
		}else if(cm.equals("Tìm Kiếm")) {
			this.view.thuchientimhd();
		}else if(cm.equals("Hủy")){
			this.view.thuchienhuyhd();
		}else if(cm.equals("Thêm HĐ")) {
			this.view.themds();
		}else if(cm.equals("Theo Quận(Huyện)")) {
			this.view.bd1();
		}else if(cm.equals("Xem biểu đồ")) {
			try {
				this.view.xembd();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if(cm.equals("Hủy biểu đồ")) {
			this.view.huybd1();{
				
			}
		}else if(cm.equals("Home")) {
			this.view.dangnhap();{
				
			}
		}
			
	}
	



	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	
	

}
