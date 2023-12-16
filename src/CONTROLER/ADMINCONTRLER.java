package CONTROLER;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.Date;

import javax.swing.Action;
import javax.swing.JOptionPane;

import VIEW.ADMINVIEW;

public class ADMINCONTRLER implements Action {
	public ADMINVIEW view;
	public ADMINCONTRLER(ADMINVIEW view) {
		
		this.view = view;
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String cm =e.getActionCommand();
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
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		
	}else if(cm.equals("")) {
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
