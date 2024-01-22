package CONTROLER;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
<<<<<<< HEAD
import java.sql.SQLException;
import java.text.ParseException;
=======
>>>>>>> a8277629b14a84529be8e13658e48cdfdfbbcdb0
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
<<<<<<< HEAD
		//JOptionPane.showMessageDialog(view, "Bạn vừa nhấn vào: "+cm);
		if(cm.equals("THÊM")) {
			this.view.xoaForm();
			this.view.adminmodel.setLuachon("THÊM");
			
		}else if(cm.equals("LƯU")) {
			try {
				
			this.view.thuchienthemKH();
			
			
				
=======
		JOptionPane.showMessageDialog(view, "Bạn vừa nhấn vào: "+cm);
		if(cm.equals("Thêm")) {
			this.view.xoaForm();
			this.view.adminmodel.setLuachon("Thêm");
		}else if(cm.equals("Lưu")) {
			
	
			try {
				
				
				
				
				int IDKhachhang = Integer.valueOf(this.view.textField.getText());
				String tenkh=this.view.textField_2.getText();
				String diachikh=this.view.textField_1.getText();
				String sdt=this.view.textField_3.getText();
				String quan=this.view.comboBox.getSelectedIndex()+"";
				Date ngaysinh= new Date(this.view.textField_4.getText());
				boolean gioitinh=true;
				String chongt=this.view.gt.getSelection()+"";				
				if(chongt.equals("Nam")) {
					gioitinh=true;
					
				}else if(chongt.equals("Nữ")) {
					gioitinh=false;
				}
				
					
				
				
				
				
				
				
				
				if (this.view.adminmodel.getLuachon().equals("") || this.view.adminmodel.getLuachon().equals("Thêm")) {
					
				} else if (this.view.adminmodel.getLuachon().equals("Cập nhập")) {
				} 
>>>>>>> a8277629b14a84529be8e13658e48cdfdfbbcdb0
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
<<<<<<< HEAD
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
			
=======
		
	}else if(cm.equals("")) {
	}
>>>>>>> a8277629b14a84529be8e13658e48cdfdfbbcdb0
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
