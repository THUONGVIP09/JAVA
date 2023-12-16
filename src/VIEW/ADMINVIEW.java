package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import MODEL.ADMIN;
import javax.swing.border.TitledBorder;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import CONTROLER.ADMINCONTRLER;

public class ADMINVIEW extends JFrame {
	private static final long serialVersionUID = 1L;
	public ADMIN adminmodel;
	public JTextField textField;
	public JTextField textField_2;
	public JTextField textField_3;
	
	public JTable table_1;
	public JTextField textField_1;
	public JComboBox comboBox;
	public ButtonGroup gt;
	public JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADMINVIEW frame = new ADMINVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ADMINVIEW() {
		this.adminmodel=new ADMIN();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 416);
		
		Action action =new ADMINCONTRLER(this);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setForeground(new Color(0, 255, 255));
		
		panel.setBackground(Color.CYAN);
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JSeparator separator = new JSeparator();
		panel.add(separator);
		
		JLabel lblNewLabel = new JLabel("HỆ THỐNG QUẢN LÝ NƯỚC TP. ĐÀ NẴNG");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("UTM Facebook", Font.PLAIN, 26));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(7, 2, 10, 10));
		
		JLabel lblNewLabel_1 = new JLabel("ID Khách hàng");
		lblNewLabel_1.setFont(new Font("UTM Facebook", Font.PLAIN, 14));
		lblNewLabel_1.setLabelFor(this);
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Họ và Tên ");
		lblNewLabel_2.setFont(new Font("UTM Facebook", Font.PLAIN, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		panel_1.add(textField_2);
		textField_2.setColumns(20);
		
		JLabel lblNewLabel_8 = new JLabel("Địa chỉ (số nhà,phường)");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("UTM Facebook", Font.PLAIN, 14));
		panel_1.add(lblNewLabel_8);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Quận,Huyện");
		lblNewLabel_3.setFont(new Font("UTM Facebook", Font.PLAIN, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_3);
		
		 comboBox = new JComboBox();
		comboBox.addItem("Quận Cẩm Lệ");
		comboBox.addItem("Quận Hải Châu");
		comboBox.addItem("Quận Liên Chiểu");
		comboBox.addItem("Quận Ngũ Hành Sơn");
		comboBox.addItem("Quận Sơn Trà");
		comboBox.addItem("Quận Thanh Khê");
		comboBox.addItem("Huyện Hòa Vang");
		comboBox.addItem("Huyện Hoàng Sa");
		
		
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Số điện thoại");
		lblNewLabel_4.setFont(new Font("UTM Facebook", Font.PLAIN, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		panel_1.add(textField_3);
		textField_3.setColumns(20);
		
		JLabel lblNewLabel_6 = new JLabel("Giới tính");
		lblNewLabel_6.setFont(new Font("UTM Facebook", Font.PLAIN, 14));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_6);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nam");
		panel_4.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Nữ");
		panel_4.add(rdbtnNewRadioButton_1);
		 gt=new ButtonGroup();
		gt.add(rdbtnNewRadioButton);
		gt.add(rdbtnNewRadioButton_1);
		
		
		JLabel lblNewLabel_7 = new JLabel("Ngày sinh");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("UTM Facebook", Font.PLAIN, 14));
		panel_1.add(lblNewLabel_7);
		
		textField_4 = new JTextField();
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 128));
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNewButton_3 = new JButton("THÊM");
		btnNewButton_3.addActionListener(action);
		btnNewButton_3.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		panel_2.add(btnNewButton_3);
		
		
		JButton btnNewButton_2 = new JButton("XOÁ");
		btnNewButton_2.addActionListener(action);
		btnNewButton_2.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("CHỈNH SỬA");
		btnNewButton_1.addActionListener(action);
		btnNewButton_1.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		panel_2.add(btnNewButton_1);
		JButton btnHu1 = new JButton("TÌM KIẾM");
		btnHu1.addActionListener(action);
		btnHu1.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		panel_2.add(btnHu1);
		
		JButton btnNewButton = new JButton("LƯU");
		btnNewButton.addActionListener(action);
		btnNewButton.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		panel_2.add(btnNewButton);
		
		JButton btnHu = new JButton("HUỶ");
		btnHu.addActionListener(action);
		btnHu.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		panel_2.add(btnHu);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		getContentPane().add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("DANH SÁCH KHÁCH HÀNG");
		lblNewLabel_5.setForeground(new Color(255, 128, 0));
		lblNewLabel_5.setFont(new Font("UTM Facebook", Font.PLAIN, 18));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_5, BorderLayout.NORTH);
		
		table_1 = new JTable();
		
		table_1.setSurrendersFocusOnKeystroke(true);
		table_1.setFillsViewportHeight(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setColumnSelectionAllowed(true);
		table_1.setFont(new Font("UTM Facebook", Font.PLAIN, 16));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Họ Và Tên", "Số nhà,Phường", "Quận(Huyện)", "Giới Tính", "Số ĐT","Ngày sinh"
			}
		));
		panel_3.add(table_1, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane(table_1);
		panel_3.add(scrollPane, BorderLayout.CENTER);
		
	
		
	
			
			
		
		
		this.setVisible(true);
		
	}

	public void xoaForm() {
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		textField_4.setText("");
		comboBox.setSelectedIndex(-1);
		gt.clearSelection();
		
	
		
		
		
		
	}
}