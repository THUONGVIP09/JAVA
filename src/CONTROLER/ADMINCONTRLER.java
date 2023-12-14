package CONTROLER;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

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
		// TODO Auto-generated method stub
		
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
