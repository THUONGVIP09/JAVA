package VIEW;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.TextField;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.text.StyleConstants.ColorConstants;

import CONTROLER.ADMINCONTRLER;
import MODEL.ADMIN;

public class login extends JFrame {
	 public static void main(String[] args) {
			login gui = new login();
			gui.setSize(500,500);
		gui.setLocationRelativeTo(null);
		
		gui.setVisible(true);
		
		}



	private ADMIN adminmodel;
	private JTextField tf1;
	private JTextField tf2;
	
	
	

	public login() {
		this.adminmodel=new ADMIN();
		JPanel pn=new JPanel();
		
		BorderLayout bo =new BorderLayout();
		bo.setHgap(20);
		bo.setVgap(60);
		 pn.setLayout(bo);
		 Container con = getContentPane();
    	 con.add(pn);
    	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setResizable(false);
    	Action action =new ADMINCONTRLER(this);
    	JPanel panel = new JPanel();
 		panel.setForeground(new Color(0, 255, 255));
		
		
		panel.setBackground(new Color(0, 191, 255));
		pn.add(panel, bo.NORTH);
		pn.setBackground(Color.WHITE);
		
		panel.setLayout(new BorderLayout());
		
		JLabel lblNewLabel = new JLabel("CHÀO MỪNG BẠN ĐẾN VỚI ",SwingConstants.CENTER);
		JLabel lblNewLabel0 = new JLabel("HỆ THỐNG CUNG CẤP NƯỚC TP.ĐÀ NẴNG",SwingConstants.CENTER);
		panel.add(lblNewLabel);

		lblNewLabel.setBackground(new Color(0, 191, 255));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		
		lblNewLabel.setFont(new Font("UTM Facebook", Font.BOLD, 18));
		panel.add(lblNewLabel,BorderLayout.NORTH);
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		panel.add(lblNewLabel0,BorderLayout.CENTER);

		lblNewLabel0.setBackground(new Color(0, 191, 255));
		lblNewLabel0.setForeground(new Color(255, 0, 0));
		lblNewLabel0.setFont(new Font("UTM Facebook", Font.BOLD, 22));
		
		
		
		JPanel pn1=new JPanel();
		BorderLayout bo2= new BorderLayout();
		
		pn1.setLayout(bo2);
		pn1.setBackground(new Color(255, 255, 255));
		
		
		//pn1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		pn.add(pn1, bo.CENTER);
		JPanel pn11=new JPanel();
		pn11.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));
		JLabel lb1=new JLabel("       ID          ",SwingConstants.CENTER);
		URL url5= login.class.getResource("p16.png");
		Image img5= Toolkit.getDefaultToolkit().createImage(url5);
		 lb1.setIcon(new ImageIcon(img5));


		
		
		
		
		
		lb1.setForeground(Color.BLACK);
		lb1.setBackground(Color.pink);
		
		lb1.setFont(new Font("UTM Facebook", Font.BOLD, 18));
		tf1=new JTextField();
		tf1.setBackground(SystemColor.WHITE);
		tf1.setColumns(10);
		tf1.setFont(new Font("UTM Facebook", Font.BOLD, 20));
		
		pn1.add(pn11,bo2.NORTH);
		pn11.add(lb1);
		pn11.add(tf1);
		
		
		lb1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tf1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JPanel pn12=new JPanel();
		pn12.setLayout(new FlowLayout(FlowLayout.CENTER,35,30));
	
		JLabel lb2=new JLabel("  Mật Khẩu   ",SwingConstants.CENTER);
		URL url6= login.class.getResource("p18.png");
		Image img6= Toolkit.getDefaultToolkit().createImage(url6);
		 lb2.setIcon(new ImageIcon(img6));
		
		lb2.setBackground(Color.pink);
		lb2.setForeground(new Color(0, 0, 0));
		
		lb2.setFont(new Font("UTM Facebook", Font.BOLD, 18));
		tf2=new JPasswordField();
		tf2.setBackground(SystemColor.window);
		tf2.setColumns(10);
		tf2.setFont(new Font("UTM Facebook", Font.BOLD, 20));
		
		
		
		pn1.add(pn12,bo2.CENTER);
		pn12.add(lb2);
		pn12.add(tf2);
		pn11.setBackground(Color.WHITE);
		pn12.setBackground(Color.WHITE);
		tf1.setBackground(Color.LIGHT_GRAY);
		tf2.setBackground(Color.LIGHT_GRAY);
		lb2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tf2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JPanel pn3=new JPanel();
		pn3.setLayout(new FlowLayout(FlowLayout.CENTER,30,70));
		pn3.setBackground(Color.WHITE);
		
		pn1.add(pn3,bo2.SOUTH);
		JButton bt3=new JButton("ĐĂNG NHẬP");
		bt3.setSize(100, 50);
		pn3.add(bt3);
		
		bt3.setBackground(Color.WHITE);
		bt3.setForeground(Color.BLUE);
		bt3.setFont(new Font("UTM Facebook", Font.BOLD, 25));
		bt3.addActionListener(action);
		bt3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
	}	
		
		public void openManagementUI() {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	               ADMINVIEW1 ad= new ADMINVIEW1();
	               Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	               ad.setSize(screenSize);
	               ad.setLocation(0, 0);
	       		ad.setLocationRelativeTo(null);
	               ad.setVisible(true);
	            }
	        });
	    }

	  //  private void openEmployeeInputUI() {
	     //   SwingUtilities.invokeLater(new Runnable() {
	       //     @Override
	      //      public void run() {
	        //        new EmployeeInputUI();
	       //     }
	       // });
	  //  }

	    public void loginquanli() {
	        String username = this.tf1.getText();
	        String passwordChars =this.tf2.getText();
	        String password = new String(passwordChars);

	        if ("nguoidung".equals(username) && "123456".equals(password)) {
	            JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
	            openManagementUI();
	            dispose();
	        } else {
	            JOptionPane.showMessageDialog(this, "Đăng nhập thất bại. Vui lòng thử lại.");
	            tf1.setText("");
	            tf2.setText("");
	        }
	    }

	   

	  
	


}