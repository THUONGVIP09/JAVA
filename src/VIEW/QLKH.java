package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import MODEL.ADMIN;
import javax.swing.border.TitledBorder;
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
import javax.swing.JTable;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

public class QLKH extends JFrame {

	private static final long serialVersionUID = 1L;
	ADMIN adminmodel;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private final JTable table = new JTable();
	private JTable table_1;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLKH frame = new QLKH();
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
	public QLKH() {
		this.adminmodel=new ADMIN();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 416);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 255, 255));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
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
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
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
		
		JComboBox comboBox = new JComboBox();
		
		
		
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
		
		JLabel lblNewLabel_7 = new JLabel("Ngày sinh");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("UTM Facebook", Font.PLAIN, 14));
		panel_1.add(lblNewLabel_7);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		
		JComboBox comboBox_1 = new JComboBox();
		panel_5.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		panel_5.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		panel_5.add(comboBox_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 128));
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNewButton_3 = new JButton("THÊM");
		btnNewButton_3.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("XOÁ");
		btnNewButton_2.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("CHỈNH SỬA");
		btnNewButton_1.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("LƯU");
		btnNewButton.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		panel_2.add(btnNewButton);
		
		JButton btnHu = new JButton("HUỶ");
		btnHu.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		panel_2.add(btnHu);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getContentPane().add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("DANH SÁCH KHÁCH HÀNG");
		lblNewLabel_5.setForeground(new Color(255, 128, 0));
		lblNewLabel_5.setFont(new Font("UTM Facebook", Font.PLAIN, 18));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_5, BorderLayout.NORTH);
		
		table_1 = new JTable();
		table_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
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
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		panel_3.add(table_1, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane(table_1);
		panel_3.add(scrollPane, BorderLayout.CENTER);
		
	
		
	
			
			
		
		
		this.setVisible(true);
		
	}
}
