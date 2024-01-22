package VIEW;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageProducer;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ViewportLayout;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartMouseListener;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.data.general.DefaultPieDataset;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.orsoncharts.plot.PiePlot3D;

import CONTROLER.ADMINCONTRLER;
import CONTROLER.conJDBC;
import Dao.hoadondao;
import Dao.khachhangdao;
import MODEL.ADMIN;
import MODEL.ADMIN1;
import MODEL.KhachHang;
import MODEL.hoadon;


public class ADMINVIEW1 extends JFrame implements Action {
	
	public ADMIN adminmodel;
	public ADMIN1 adminmodel1;
	public login login;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JComboBox<String> comboBox;
	private JTextField textField_1;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private ButtonGroup gt;
	private JTextField textField_4;
	public JTable table_1;
	private JTextField textField_5;
	private JTextField textField_6;
	private JComboBox<String> comboBox1;

	private CardLayout cardlayout;
	private JPanel panel_1;
	private JPanel panel_3;
	private Container con;
	private JPanel pn1;
	private JPanel pn;
	private JPanel pn2;
	private JTextField textField11;
	private JTextField textField_12;
	private JComboBox<String> comboBox2;
	private JTextField textField_14;
	private JPanel pn3;
	private JComboBox<String> comboBox3;
	private JComboBox<String> comboBox4;
	private JTextField textField_16;
	private JTextField textField_17;
	private JComboBox<String> comboBox5;
	private JPanel panel_7;
	private JTable table_2;
	private JTextField textField_71;
	private JComboBox<String> comboBox7;
	private conJDBC conjdbc;
	public DefaultTableModel model;
	private ArrayList<KhachHang> list;
	private int i;
	private SimpleDateFormat date;
	private DefaultTableModel modeltable;
	private JTextField textField_15;
	private JTextField textField_73;
	private JTextField textField_19;
	private DefaultTableModel modeltable1;
	private JTextField textField_21;
	private JTextField textField_74;
	private ArrayList<hoadon> list1;
	private hoadon hdd;
	private JPanel pn4;
	private JComboBox<String> comboBox41;
	private JTextField textField_41;
	private JPanel pn42;
	private ChartPanel chartPanel;
	private int sumtong;
	private java.sql.Date thang2;
	private PiePlot pielot;
	private BorderLayout bo4;
	private String ab;
	private JFreeChart chat;
	private JPanel pn5;
	private JPanel pn6;
	private JTextField textField_64;
	
	
	
	
	
	 public static void main(String[] args) {
			ADMINVIEW1 gui = new ADMINVIEW1();
			gui.setSize(800,600);
		gui.setLocationRelativeTo(null);
		gui.setVisible(true);
		return;
		}
	
	public ADMINVIEW1() {
		this.adminmodel=new ADMIN(); 
		this.adminmodel1=new ADMIN1();
		this.login=new login();
		URL url= ADMINVIEW1.class.getResource("p2.png");
		Image img= Toolkit.getDefaultToolkit().createImage(url);
		
		pn=new JPanel();
		
		
		BorderLayout bo =new BorderLayout();
		bo.setHgap(5);
		bo.setVgap(5);
		 pn.setLayout(bo);
		 // con = getContentPane();
    	// con.add(pn);
    	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 Action action =new ADMINCONTRLER(this);
 		
 		JPanel panel = new JPanel();
 		panel.setForeground(new Color(0, 255, 255));
		

		panel.setBackground(new Color(0, 191, 255));
		
		
		panel.setLayout(new BorderLayout());
		pn.add(panel,bo.NORTH);
		//JLabel lblNewLabell = new JLabel();
		
		//URL url11= ADMINVIEW.class.getResource("p11.gif");
		//Image img11= Toolkit.getDefaultToolkit().createImage(url11);
		//pn.add(lblNewLabell, bo.SOUTH);
		//lblNewLabell.setIcon(new ImageIcon(img11));
		JLabel lblNewLabel = new JLabel("HỆ THỐNG QUẢN LÝ NƯỚC TP.ĐÀ NẴNG",SwingConstants.CENTER);
		
		
		
		

		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("UTM Facebook", Font.BOLD, 40));
		panel.add(lblNewLabel, BorderLayout.NORTH);
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		JMenuBar menubar=new JMenuBar();
		 JMenu menu3=new JMenu("Trang chủ");
		    menu3.setFont(new Font("UTM Facebook", Font.BOLD, 20));
		    URL url12= ADMINVIEW1.class.getResource("p12.png");
			Image img12= Toolkit.getDefaultToolkit().createImage(url12);
			 menu3.setIcon(new ImageIcon(img12));
			 
		JMenu menu=new JMenu("Thông tin");
		URL url8= ADMINVIEW1.class.getResource("p9.png");
		Image img8= Toolkit.getDefaultToolkit().createImage(url8);
		 menu.setIcon(new ImageIcon(img8));
		JMenuItem menuiteam1=new JMenuItem("Khách hàng");
		 URL url4= ADMINVIEW1.class.getResource("p6.png");
			Image img4= Toolkit.getDefaultToolkit().createImage(url4);
			 menuiteam1.setIcon(new ImageIcon(img4));
		JMenuItem menuiteam2 = new JMenuItem("Hóa đơn");
		JMenuItem menuiteam3 = new JMenuItem("Thoát");
		URL url5= ADMINVIEW1.class.getResource("p7.png");
		Image img5= Toolkit.getDefaultToolkit().createImage(url5);
		 menuiteam2.setIcon(new ImageIcon(img5));
		 JMenuItem menuiteam6 = new JMenuItem("Home");
		 menuiteam6.addActionListener(action);
			URL url16= ADMINVIEW1.class.getResource("p16.png");
			Image img16= Toolkit.getDefaultToolkit().createImage(url16);
			 menuiteam6.setIcon(new ImageIcon(img16));
			 menuiteam6.setFont(new Font("UTM Facebook", Font.BOLD, 20));
			 menuiteam3.setIcon(new ImageIcon(img));
		menu.setFont(new Font("UTM Facebook", Font.BOLD, 20));
	    menu.add(menuiteam1);
	    menuiteam1.setFont(new Font("UTM Facebook", Font.BOLD, 20));
	    menuiteam1.addActionListener(action);
	    menu.addSeparator();
	    menu.add(menuiteam2);
	    menuiteam2.setFont(new Font("UTM Facebook", Font.BOLD, 20));
	    menuiteam2.addActionListener(action);
	    menu.addSeparator();
	   
	    menuiteam3.setFont(new Font("UTM Facebook", Font.BOLD, 20));
	    menuiteam3.addActionListener(action);
	    

	    //JMenuItem menuiteam2 = new JMenuItem("Thông tin thanh toán");
	  //  menuiteam2.addActionListener(new ActionListener() {
	    //    public void actionPerformed(ActionEvent e) {
	      //      CardLayout cardLayout = (CardLayout) container.getLayout();
	       //     cardLayout.show(container, "panel2");
	      //  }
	   // });
	   // menu.add(menuItem2);
	    
	    JMenu menu2=new JMenu("Biểu đồ");
	    
	    menu2.setFont(new Font("UTM Facebook", Font.BOLD, 20));
	    URL url13= ADMINVIEW1.class.getResource("p13.png");
		Image img13= Toolkit.getDefaultToolkit().createImage(url13);
		 menu2.setIcon(new ImageIcon(img13));
	    JMenuItem menuiteam21=new JMenuItem("Theo Quận(Huyện)");
	    URL url14= ADMINVIEW1.class.getResource("p14.png");
		Image img14= Toolkit.getDefaultToolkit().createImage(url14);
		 menuiteam21.setIcon(new ImageIcon(img14));
		 //URL url4= ADMINVIEW1.class.getResource("p6.png");
			//Image img4= Toolkit.getDefaultToolkit().createImage(url4);
			 //menuiteam1.setIcon(new ImageIcon(img4));
		JMenuItem menuiteam22 = new JMenuItem("Theo Tháng");
		 URL url15= ADMINVIEW1.class.getResource("p15.png");
			Image img15= Toolkit.getDefaultToolkit().createImage(url15);
			 menuiteam22.setIcon(new ImageIcon(img15));
	
		
		
		
			
	
	    menu2.add(menuiteam21);
	    
	    menuiteam21.setFont(new Font("UTM Facebook", Font.BOLD, 20));
	    menuiteam21.addActionListener(action);
	    menu2.addSeparator();
	    menu2.add(menuiteam22);
	    menuiteam22.setFont(new Font("UTM Facebook", Font.BOLD, 20));
	    menuiteam22.addActionListener(action);
	    menu3.add(menuiteam6);
	    menu3.add(menuiteam3);
	    
	    menubar.add(menu3);
	    menubar.add(menu);
	    menubar.add(menu2);
	   
	    this.setJMenuBar(menubar);
	    
	    panel.add(menubar,BorderLayout.CENTER);

	    
	    
	    cardlayout=new CardLayout();
	     pn2=new JPanel();
	    pn2.setLayout(cardlayout);
	    pn.add(pn2,bo.CENTER);
	    pn6=new JPanel();
	    pn2.add(pn6,"4");
	    pn6.setLayout(new BorderLayout());
	    JLabel lb61=new JLabel();
	    URL url17= ADMINVIEW1.class.getResource("p17.png");
		Image img17= Toolkit.getDefaultToolkit().createImage(url17);
		 lb61.setIcon(new ImageIcon(img17));
		 pn6.add(lb61,BorderLayout.CENTER);
		
	    
	   pn1=new JPanel();
		//pn.add(pn1,bo.CENTER);
		pn2.add(pn1,"1");
		pn1.setLayout(new BorderLayout());
		 panel_1 = new JPanel();
		BorderLayout bo1=new BorderLayout();
		bo1.setHgap(20);
		bo1.setVgap(20);
		
		
		panel_1.setLayout(bo1);
		
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		pn1.add(panel_1, BorderLayout.WEST);
		
		JPanel panel12=new JPanel();
		panel12.setLayout(new BorderLayout(20,20));
		
		panel_1.add(panel12,BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("ID Khách hàng     ");
		lblNewLabel_1.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		
		panel12.add(lblNewLabel_1,BorderLayout.WEST);
		textField = new JTextField();
		textField.setBackground(SystemColor.window);
		panel12.add(textField,BorderLayout.CENTER);
		textField.setColumns(10);
		textField.setFont(new Font("UTM Facebook", Font.BOLD, 20));
		
		JPanel panel13=new JPanel();
		panel13.setLayout(new BorderLayout(20,20));
		panel12.add(panel13,BorderLayout.SOUTH);
		JLabel lblNewLabel_2 = new JLabel("Họ và Tên            ");
		lblNewLabel_2.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		
		lblNewLabel_2.setBackground(new Color(240, 240, 240));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		
		panel13.add(lblNewLabel_2,BorderLayout.WEST);
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.window);
		panel13.add(textField_2,BorderLayout.CENTER);
		textField_2.setColumns(15);
		textField_2.setFont(new Font("UTM Facebook", Font.BOLD, 20));
		
		JPanel panel14=new JPanel();
		panel14.setLayout(new BorderLayout(20,20));
		panel13.add(panel14,BorderLayout.SOUTH);
		JLabel lblNewLabel_8 = new JLabel("Địa chỉ                 ");
		lblNewLabel_8.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		
		lblNewLabel_8.setBackground(new Color(240, 240, 240));
		lblNewLabel_8.setForeground(new Color(0, 0, 0));
		
		panel14.add(lblNewLabel_8,BorderLayout.WEST);
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.window);
		panel14.add(textField_1,BorderLayout.CENTER);
		textField_1.setColumns(15);
		textField_1.setFont(new Font("UTM Facebook", Font.BOLD, 20));
		
		
		JPanel panel15=new JPanel();
		panel15.setLayout(new BorderLayout(20,20));
		panel14.add(panel15,BorderLayout.SOUTH);
		
		JLabel lblNewLabel_3 = new JLabel("Quận,Huyện         ");
		lblNewLabel_3.setFont(new Font("UTM Facebook", Font.PLAIN, 20));

		lblNewLabel_3.setBackground(new Color(240, 240, 240));
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		
		panel15.add(lblNewLabel_3,BorderLayout.WEST);
		
		String[] cacquan= new String[] {"Quận Hải Châu","Quận Liên Chiểu","Quận Ngũ Hành Sơn","Quận Sơn Trà","Quận Thanh Khê","Huyện Hòa Vang","Huyện Hoàng Sa"};
		 comboBox = new JComboBox<String>(cacquan);
		 comboBox.setSelectedItem(cacquan);
		 comboBox.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		
	
		panel15.add(comboBox,BorderLayout.CENTER);
		
		JPanel panel16=new JPanel();
		panel16.setLayout(new BorderLayout(20,20));
		panel15.add(panel16,BorderLayout.SOUTH);
		JLabel lblNewLabel_4 = new JLabel("Số điện thoại        ");
		lblNewLabel_4.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		
		lblNewLabel_4.setBackground(new Color(240, 240, 240));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		
		panel16.add(lblNewLabel_4,BorderLayout.WEST);
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.window);
		panel16.add(textField_3,BorderLayout.CENTER);
		textField_3.setColumns(15);
		textField_3.setFont(new Font("UTM Facebook", Font.BOLD, 20));
		
    	 
		JPanel panel17=new JPanel();
		panel17.setLayout(new BorderLayout(20,20));
		panel16.add(panel17,BorderLayout.SOUTH);
		JLabel lblNewLabel_6 = new JLabel("Giới tính     ");
		lblNewLabel_6.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		
		lblNewLabel_6.setBackground(new Color(240, 240, 240));
		lblNewLabel_6.setForeground(new Color(0, 0, 0));
		
		panel17.add(lblNewLabel_6,BorderLayout.WEST);
		
		 rdbtnNewRadioButton = new JRadioButton("Nam");
		 rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		
		 rdbtnNewRadioButton_1 = new JRadioButton("Nữ");
		 rdbtnNewRadioButton_1.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		 gt=new ButtonGroup();
		gt.add(rdbtnNewRadioButton);
		gt.add(rdbtnNewRadioButton_1);
		JPanel gt1=new JPanel();
		gt1.setLayout(new FlowLayout());
		gt1.add(rdbtnNewRadioButton);
		gt1.add(rdbtnNewRadioButton_1);
		gt1.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		panel17.add(gt1,BorderLayout.CENTER);
		
		JPanel panel18=new JPanel();
		panel18.setLayout(new BorderLayout(20,20));
		panel17.add(panel18,BorderLayout.SOUTH);
		JLabel lblNewLabel_7 = new JLabel("Ngày sinh             ");
		lblNewLabel_7.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		
		lblNewLabel_7.setBackground(new Color(240, 240, 240));
		lblNewLabel_7.setForeground(new Color(0, 0, 0));
		
		panel18.add(lblNewLabel_7,BorderLayout.WEST);
		textField_4 = new JTextField();
		textField_4.setBackground(SystemColor.window);
		panel18.add(textField_4,BorderLayout.CENTER);
		textField_4.setFont(new Font("UTM Facebook", Font.BOLD, 20));
	
		
		JPanel nutbam=new JPanel();
		nutbam.setLayout(new FlowLayout(10, 10, 10));
		nutbam.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	
		panel18.add(nutbam,BorderLayout.SOUTH);
		JButton btn = new JButton("THÊM");
		btn.addActionListener(action);
		btn.setFont(new Font("UTM Facebook", Font.PLAIN, 15));
		 nutbam.add(btn);
		 URL url1= ADMINVIEW1.class.getResource("p3.png");
		Image img1= Toolkit.getDefaultToolkit().createImage(url1);
		 btn.setIcon(new ImageIcon(img1));
		JButton btnNewButton_2 = new JButton("XÓA");
		btnNewButton_2.addActionListener(action);
		btnNewButton_2.setFont(new Font("UTM Facebook", Font.PLAIN, 15));
		 nutbam.add(btnNewButton_2);
		 btnNewButton_2.setIcon(new ImageIcon(img));
		
		JButton btnNewButton_1 = new JButton("CHỈNH SỬA");
		btnNewButton_1.addActionListener(action);
		btnNewButton_1.setFont(new Font("UTM Facebook", Font.PLAIN, 15));
		nutbam.add(btnNewButton_1);
		URL url2= ADMINVIEW1.class.getResource("p4.png");
		Image img2= Toolkit.getDefaultToolkit().createImage(url2);
		 btnNewButton_1.setIcon(new ImageIcon(img2));
		
		
		JButton btnNewButton = new JButton("LƯU");
		btnNewButton.addActionListener(action);
		btnNewButton.setFont(new Font("UTM Facebook", Font.PLAIN, 15));
		nutbam.add(btnNewButton);
		URL url3= ADMINVIEW1.class.getResource("p5.png");
		Image img3= Toolkit.getDefaultToolkit().createImage(url3);
		 btnNewButton.setIcon(new ImageIcon(img3));

		panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pn1.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("DANH SÁCH KHÁCH HÀNG");
		lblNewLabel_5.setForeground(new Color(255, 128, 0));
		lblNewLabel_5.setFont(new Font("UTM Facebook", Font.PLAIN, 25));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_5, BorderLayout.NORTH);
		
		
		modeltable=new DefaultTableModel();
		modeltable.addColumn("ID");
		modeltable.addColumn("Họ và tên");
		modeltable.addColumn("Địa chỉ");
		modeltable.addColumn("Quận(Huyện)");
		modeltable.addColumn("Ngày sinh");
		modeltable.addColumn("GIới tính");
		modeltable.addColumn("SDT");
		
		
		
		table_1 = new JTable(modeltable);
		table_1.setFont(new Font("Arial", Font.PLAIN, 16));
	//	table_1.setModel(new DefaultTableModel(
		//	new Object[][] {
		//	},
		//	new String[] {
		//		"ID", "H\u1ECD V\u00E0 T\u00EAn", "Địa chỉ", "Qu\u1EADn(Huy\u1EC7n)", "Gi\u1EDBi T\u00EDnh", "S\u1ED1 \u0110T", "Ng\u00E0y sinh"
		//	}
	//	));
		
		list=new khachhangdao().selectAll();
		for (KhachHang kh:list) {
			
			modeltable.addRow(new Object[]{
				kh.getIDKhachhang(),kh.getTenkh(),kh.getDiachikh(),kh.getQuan(),kh.getNgaysinh().getDate()+"/"+(kh.getNgaysinh().getMonth()+1)+"/"+(kh.getNgaysinh().getYear()+1900),(kh.isGioitinh()?"Nam":"Nữ"),kh.getSdt()
			});
		}
		
		panel_3.add(table_1, BorderLayout.CENTER);
		

		
		JScrollPane scrollPane = new JScrollPane(table_1);
		panel_3.add(scrollPane, BorderLayout.CENTER);
		
		
		
		
		
		
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		FlowLayout flowLayout = (FlowLayout) panel_5.getLayout();
		flowLayout.setVgap(10);
		flowLayout.setHgap(10);
		flowLayout.setAlignOnBaseline(true);
		panel_3.add(panel_5, BorderLayout.SOUTH);
		JLabel lblNewLabel_9 = new JLabel("ID");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_5.add(lblNewLabel_9);
		
		textField_5 = new JTextField();
		textField_5.setForeground(new Color(0, 0, 0));
		panel_5.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Quận(Huyện)   ");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_5.add(lblNewLabel_10);
		   
		
		
		

		lblNewLabel_10.setBackground(new Color(240, 240, 240));
		lblNewLabel_10.setForeground(new Color(0, 0, 0));
		
	
		
		String[] cacquan1= new String[] {"","Quận Hải Châu","Quận Liên Chiểu","Quận Ngũ Hành Sơn","Quận Sơn Trà","Quận Thanh Khê","Huyện Hòa Vang","Huyện Hoàng Sa"};
		 comboBox1 = new JComboBox<String>(cacquan1);
		 comboBox1.setSelectedItem(cacquan1);
		 comboBox1.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		
	
		panel_5.add(comboBox1,BorderLayout.CENTER);
		
		
		
		
		
		JButton btnNewButton_4 = new JButton("TÌM KIẾM");
		btnNewButton_4.addActionListener(action);
		panel_5.add(btnNewButton_4);
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JButton btnNewButton_5 = new JButton("HỦY");
		btnNewButton_5.addActionListener(action);
		panel_5.add(btnNewButton_5);
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		
		
		
		pn3=new JPanel();
		
		pn2.add(pn3,"2");
		JPanel panel6=new JPanel();
		panel6.setBackground(Color.PINK);
		
		BorderLayout bo3=new BorderLayout();
		bo3.setHgap(5);
		bo3.setVgap(5);
		pn3.setLayout(bo3);
		panel6.setBackground(new Color(255, 255, 255));
		panel6.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		pn3.add(panel6, bo3.WEST);
		
		
		JPanel panel61=new JPanel();
		panel61.setLayout(new BorderLayout(20,20));
		
		panel6.add(panel61,BorderLayout.NORTH);
		
		JLabel lblNewLabel_11 = new JLabel("ID Hóa Đơn ");
		lblNewLabel_11.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		
		lblNewLabel_11.setBackground(new Color(240, 240, 240));
		lblNewLabel_11.setForeground(new Color(0, 0, 0));
		
		panel61.add(lblNewLabel_11,BorderLayout.WEST);
		textField11 = new JTextField();
		textField11.setBackground(SystemColor.window);
		panel61.add(textField11,BorderLayout.CENTER);
		textField11.setColumns(10);
		textField11.setFont(new Font("UTM Facebook", Font.BOLD, 20));
		
		JPanel panel62=new JPanel();
		panel62.setLayout(new BorderLayout(20,20));
		panel61.add(panel62,BorderLayout.SOUTH);
		JLabel lblNewLabel_12 = new JLabel("ID Khách Hàng  ");
		lblNewLabel_12.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		
		lblNewLabel_12.setBackground(new Color(240, 240, 240));
		lblNewLabel_12.setForeground(new Color(0, 0, 0));
		
		panel62.add(lblNewLabel_12,BorderLayout.WEST);
		textField_12 = new JTextField();
		textField_12.setBackground(SystemColor.window);
		panel62.add(textField_12,BorderLayout.CENTER);
		textField_12.setColumns(10);
		textField_12.setFont(new Font("UTM Facebook", Font.BOLD, 20));
		
		
		JPanel panel63=new JPanel();
		panel63.setLayout(new BorderLayout(20,20));
		panel62.add(panel63,BorderLayout.SOUTH);
		
		JLabel lblNewLabel_13 = new JLabel("Quận,Huyện  ");
		lblNewLabel_13.setFont(new Font("UTM Facebook", Font.PLAIN, 20));

		lblNewLabel_13.setBackground(new Color(240, 240, 240));
		lblNewLabel_13.setForeground(new Color(0, 0, 0));
		
		panel63.add(lblNewLabel_13,BorderLayout.WEST);
		textField_64 = new JTextField();
		textField_64.setBackground(SystemColor.window);
		panel63.add(textField_64,BorderLayout.CENTER);
		textField_64.setColumns(10);
		textField_64.setFont(new Font("UTM Facebook", Font.BOLD, 20));
		
		//String[] cacquan2= new String[] {"Quận Cẩm Lệ","Quận Hải Châu","Quận Liên Chiểu","Quận Ngũ Hành Sơn","Quận Sơn Trà","Quận Thanh Khê","Huyện Hòa Vang","Huyện Hoàng Sa"};
		// comboBox2 = new JComboBox<String>(cacquan2);
		 //comboBox2.setSelectedItem(cacquan2);
		// comboBox2.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		 
	
		//panel63.add(comboBox2,BorderLayout.CENTER);
		textField_64.setEditable(false);
		
		JPanel panel64=new JPanel();
		panel64.setLayout(new BorderLayout(20,20));
		panel63.add(panel64,BorderLayout.SOUTH);
		JLabel lblNewLabel_14 = new JLabel("Số Nước Cũ  ");
		lblNewLabel_14.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		
		lblNewLabel_14.setBackground(new Color(240, 240, 240));
		lblNewLabel_14.setForeground(new Color(0, 0, 0));
		panel64.add(lblNewLabel_14,BorderLayout.WEST);
		textField_14 = new JTextField();
		textField_14.setBackground(SystemColor.window);
		panel64.add(textField_14,BorderLayout.CENTER);
		textField_14.setColumns(10);
		textField_14.setFont(new Font("UTM Facebook", Font.BOLD, 20));
		//String[] nam= new String[] {"2023","2024"};
		// comboBox3 = new JComboBox<String>(nam);
		 //comboBox3.setSelectedItem(nam);
		 //comboBox3.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		//panel64.add(comboBox3,BorderLayout.CENTER);
		
		JPanel panel65=new JPanel();
		panel65.setLayout(new BorderLayout(20,20));
		panel64.add(panel65,BorderLayout.SOUTH);
		JLabel lblNewLabel_15 = new JLabel("Số Nước Mới  ");
		lblNewLabel_15.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		
		lblNewLabel_15.setBackground(new Color(240, 240, 240));
		lblNewLabel_15.setForeground(new Color(0, 0, 0));
		panel65.add(lblNewLabel_15,BorderLayout.WEST);
		
		textField_15 = new JTextField();
		textField_15.setBackground(SystemColor.window);
		panel65.add(textField_15,BorderLayout.CENTER);
		textField_15.setColumns(10);
		textField_15.setFont(new Font("UTM Facebook", Font.BOLD, 20));
		//String[] thang= new String[] {"1","2","3","4","5","6","7","8","9","10","11","12"};
		 //comboBox4 = new JComboBox<String>(thang);
		 //comboBox4.setSelectedItem(thang);
		 //comboBox4.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		//panel65.add(comboBox4,BorderLayout.CENTER);
		
		
		
		JPanel panel66=new JPanel();
		panel66.setLayout(new BorderLayout(20,20));
		panel65.add(panel66,BorderLayout.SOUTH);
		JLabel lblNewLabel_16 = new JLabel("Số Nước Dùng  ");
		lblNewLabel_16.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		
		lblNewLabel_16.setBackground(new Color(240, 240, 240));
		lblNewLabel_16.setForeground(new Color(0, 0, 0));
		
		panel66.add(lblNewLabel_16,BorderLayout.WEST);
		textField_16 = new JTextField();
		textField_16.setBackground(SystemColor.window);
		panel66.add(textField_16,BorderLayout.CENTER);
		textField_16.setColumns(10);
		textField_16.setFont(new Font("UTM Facebook", Font.BOLD, 20));
		textField_16.setEditable(false);
		
		JPanel panel67=new JPanel();
		panel67.setLayout(new BorderLayout(20,20));
		panel66.add(panel67,BorderLayout.SOUTH);
		JLabel lblNewLabel_17 = new JLabel("Đơn Giá            ");
		lblNewLabel_17.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		
		lblNewLabel_17.setBackground(new Color(240, 240, 240));
		lblNewLabel_17.setForeground(new Color(0, 0, 0));
		
		panel67.add(lblNewLabel_17,BorderLayout.WEST);
		textField_17 = new JTextField();
		textField_17.setBackground(SystemColor.window);
		panel67.add(textField_17,BorderLayout.CENTER);
		textField_17.setColumns(10);
		textField_17.setFont(new Font("UTM Facebook", Font.BOLD, 20));
		
		
		
		JPanel panel68=new JPanel();
		panel68.setLayout(new BorderLayout(20,20));
		panel67.add(panel68,BorderLayout.SOUTH);
		JLabel lblNewLabel_18 = new JLabel(" Tình Trạng ");
		lblNewLabel_18.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		
		lblNewLabel_18.setBackground(new Color(240, 240, 240));
		lblNewLabel_18.setForeground(new Color(0, 0, 0));
		panel68.add(lblNewLabel_18,BorderLayout.WEST);
		
		String[] tinhtrang= new String[] {"Đã Thanh Toán","Chưa Thanh Toán"};
		 comboBox5 = new JComboBox<String>(tinhtrang);
		 comboBox5.setSelectedItem(tinhtrang);
		 comboBox5.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		panel68.add(comboBox5,BorderLayout.CENTER);
		
		JPanel panel69=new JPanel();
		panel69.setLayout(new BorderLayout(20,20));
		panel68.add(panel69,BorderLayout.SOUTH);
		JLabel lblNewLabel_19 = new JLabel(" Ngày Thanh Toán ");
		lblNewLabel_19.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		
		lblNewLabel_19.setBackground(new Color(240, 240, 240));
		lblNewLabel_19.setForeground(new Color(0, 0, 0));
		panel69.add(lblNewLabel_19,BorderLayout.WEST);
		textField_19 = new JTextField();
		textField_19.setBackground(SystemColor.window);
		panel69.add(textField_19,BorderLayout.CENTER);
		textField_19.setColumns(10);
		textField_19.setFont(new Font("UTM Facebook", Font.BOLD, 20));
		
		panel69.add(textField_19,BorderLayout.CENTER);
		
		JPanel panel70=new JPanel();
		panel70.setLayout(new BorderLayout(20,20));
		panel69.add(panel70,BorderLayout.SOUTH);
		JLabel lblNewLabel_21 = new JLabel("Tổng tiền  ");
		lblNewLabel_21.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		
		lblNewLabel_21.setBackground(new Color(240, 240, 240));
		lblNewLabel_21.setForeground(new Color(0, 0, 0));
		
		panel70.add(lblNewLabel_21,BorderLayout.WEST);
		textField_21 = new JTextField();
		textField_21.setBackground(SystemColor.window);
		panel70.add(textField_21,BorderLayout.CENTER);
		textField_21.setColumns(10);
		textField_21.setFont(new Font("UTM Facebook", Font.BOLD, 20));
		textField_21.setEditable(false);
		JPanel panel71=new JPanel();
		panel71.setLayout(new BorderLayout(20,20));
		panel70.add(panel71,BorderLayout.SOUTH);
		JLabel lblNewLabel_75 = new JLabel("Tháng/Năm");
		lblNewLabel_75.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		panel71.add(lblNewLabel_75,BorderLayout.WEST);
		lblNewLabel_75.setBackground(new Color(240, 240, 240));
		lblNewLabel_75.setForeground(new Color(0, 0, 0));
		textField_74 = new JTextField();
		textField_74.setForeground(new Color(0, 0, 0));
		panel71.add(textField_74);
		textField_74.setColumns(10);
		textField_74.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JPanel nutbam1=new JPanel();
		nutbam1.setLayout(new FlowLayout(40, 10, 10));
		
		nutbam1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	
		panel71.add(nutbam1,BorderLayout.SOUTH);
		
		panel18.add(nutbam,BorderLayout.SOUTH);
		JButton btn1 = new JButton("Thêm");
		btn1.addActionListener(action);
		btn1.setFont(new Font("UTM Facebook", Font.PLAIN, 18));
		 nutbam1.add(btn1);
		JButton btnNewButton_21 = new JButton("Xóa");
		btnNewButton_21.addActionListener(action);
		btnNewButton_21.setFont(new Font("UTM Facebook", Font.PLAIN, 18));
		 nutbam1.add(btnNewButton_21);
		
		JButton btnNewButton_11 = new JButton("Sửa");
		btnNewButton_11.addActionListener(action);
		btnNewButton_11.setFont(new Font("UTM Facebook", Font.PLAIN, 18));
		nutbam1.add(btnNewButton_11);
		
		JButton btnNewButton1 = new JButton("Lưu");
		btnNewButton1.addActionListener(action);
		btnNewButton1.setFont(new Font("UTM Facebook", Font.PLAIN, 18));
		nutbam1.add(btnNewButton1);
		
		panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pn3.add(panel_7, bo3.CENTER);
		panel_7.setLayout(new BorderLayout(0, 0));
		panel_7.setSize(700, 700);
		
		JLabel lblNewLabel_71 = new JLabel("DANH SÁCH HÓA ĐƠN KHÁCH HÀNG");
		lblNewLabel_71.setForeground(new Color(255, 128, 0));
		lblNewLabel_71.setFont(new Font("UTM Facebook", Font.PLAIN, 25));
		lblNewLabel_71.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_71, BorderLayout.NORTH);
		
		modeltable1=new DefaultTableModel();
		modeltable1.addColumn("ID hóa đơn  ");
		modeltable1.addColumn("ID khách hàng");
		modeltable1.addColumn("     Quận(Huyện)    ");
		modeltable1.addColumn("Tháng/Năm");
		modeltable1.addColumn("Số nước cũ");
		modeltable1.addColumn("Số nước mới");
		modeltable1.addColumn("Số nước dùng");
		modeltable1.addColumn("Đơn Giá");
		modeltable1.addColumn("Tổng tiền");
		modeltable1.addColumn("    Tình trạng    ");
		modeltable1.addColumn("Ngày Thanh Toán");
		
		
		
		
		
		table_2 = new JTable(modeltable1);
		table_2.setFont(new Font("Arial", Font.PLAIN, 16));
		TableColumn Column1 = table_2.getColumnModel().getColumn(2);
        Column1.setPreferredWidth(150);
     TableColumn Column2 = table_2.getColumnModel().getColumn(9);
        Column2.setPreferredWidth(120);
    TableColumn Column3 = table_2.getColumnModel().getColumn(7);
        Column3.setPreferredWidth(60);
        
	
		
		list1=new hoadondao().selectAll();
		for (hoadon hd:list1) {
			if(hd.getTinhtrang().equals("Đã Thanh Toán")) {
			
			modeltable1.addRow(new Object[]{
					 hd.getIDhoadon(), hd.getIDkh() , hd.getQuan() ,(hd.getThang().getMonth()+1)+"/"+(hd.getThang().getYear()+1900) ,hd.getSonuoccu(), hd.getSonuocmoi(), hd.getSonuocdung(), hd.getDongia(), hd.getTongtien(),hd.getTinhtrang() ,hd.getNgaythanhtoan().getDate()+"/"+(hd.getNgaythanhtoan().getMonth()+1)+"/"+(hd.getNgaythanhtoan().getYear()+1900)
			});
			}
			else {
				modeltable1.addRow(new Object[]{
						 hd.getIDhoadon(), hd.getIDkh() , hd.getQuan() ,(hd.getThang().getMonth()+1)+"/"+(hd.getThang().getYear()+1900) ,hd.getSonuoccu(), hd.getSonuocmoi(), hd.getSonuocdung(), hd.getDongia(), hd.getTongtien(),hd.getTinhtrang() ,hd.getNgaythanhtoan()
				});
			}
		}
		panel_7.add(table_2, BorderLayout.CENTER);
		
		JScrollPane scrollPane1 = new JScrollPane(table_2);
		panel_7.add(scrollPane1);
		 scrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	     
		
		
		
		
		
		
		
		
		JPanel panel_71 = new JPanel();
		panel_71.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		FlowLayout flowLayout1 = (FlowLayout) panel_71.getLayout();
		flowLayout1.setVgap(10);
		flowLayout1.setHgap(10);
		flowLayout1.setAlignOnBaseline(true);
		panel_7.add(panel_71, BorderLayout.SOUTH);
		JLabel lblNewLabel_72 = new JLabel("ID Khách Hàng");
		lblNewLabel_72.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_71.add(lblNewLabel_72);
		
		textField_71 = new JTextField();
		textField_71.setForeground(new Color(0, 0, 0));
		panel_71.add(textField_71);
		textField_71.setColumns(10);
		
		JLabel lblNewLabel_73 = new JLabel("Tháng/Năm");
		lblNewLabel_73.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_71.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_71.add(lblNewLabel_73);
		lblNewLabel_73.setBackground(new Color(240, 240, 240));
		lblNewLabel_73.setForeground(new Color(0, 0, 0));
		textField_73 = new JTextField();
		textField_73.setForeground(new Color(0, 0, 0));
		panel_71.add(textField_73);
		textField_73.setColumns(10);
		textField_73.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
	
		
		//String[] cacquan3= new String[] {"","Quận Cẩm Lệ","Quận Hải Châu","Quận Liên Chiểu","Quận Ngũ Hành Sơn","Quận Sơn Trà","Quận Thanh Khê","Huyện Hòa Vang","Huyện Hoàng Sa"};
		 //comboBox7 = new JComboBox<String>(cacquan3);
		 //comboBox7.setSelectedItem(cacquan3);
		// comboBox7.setFont(new Font("UTM Facebook", Font.PLAIN, 20));
		
	
		//panel_71.add(textField_73,BorderLayout.CENTER);
		
		
		
		
		
		JButton btnNewButton_71 = new JButton("Tìm Kiếm");
		btnNewButton_71.addActionListener(action);
		panel_71.add(btnNewButton_71);
		btnNewButton_71.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JButton btnNewButton_72 = new JButton("Hủy");
		btnNewButton_72.addActionListener(action);
		panel_71.add(btnNewButton_72);
		btnNewButton_72.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JButton btnNewButton_73 = new JButton("Thêm HĐ");
		btnNewButton_73.addActionListener(action);
		panel_71.add(btnNewButton_73);
		btnNewButton_73.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		
		
		pn4=new JPanel();
		
		pn2.add(pn4,"3");
		JPanel panel41=new JPanel();
		panel41.setBackground(Color.PINK);
		
		 bo4=new BorderLayout();
		bo4.setHgap(5);
		bo4.setVgap(5);
		pn4.setLayout(bo4);
		panel41.setBackground(new Color(255, 255, 255));
		panel41.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		pn4.add(panel41, bo4.NORTH);
		
	
		
		JLabel lblNewLabel_42 = new JLabel("Tháng/Năm");
		lblNewLabel_42.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		panel41.add(lblNewLabel_42);
		lblNewLabel_42.setBackground(new Color(240, 240, 240));
		lblNewLabel_42.setForeground(new Color(0, 0, 0));
		textField_41 = new JTextField();
		textField_41.setForeground(new Color(0, 0, 0));
		panel41.add(textField_41);
		textField_41.setColumns(10);
		textField_41.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JButton bt_43 = new JButton("Xem biểu đồ");
		bt_43.addActionListener(action);
		bt_43.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		panel41.add(bt_43);
		bt_43.setBackground(new Color(240, 240, 240));
		bt_43.setForeground(new Color(0, 0, 0));
		JButton bt_44 = new JButton("Hủy biểu đồ");
		bt_44.addActionListener(action);
		bt_44.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		panel41.add(bt_44);
		bt_44.setBackground(new Color(240, 240, 240));
		bt_44.setForeground(new Color(0, 0, 0));
		
		
        
        
		
		
		Container con = getContentPane();
		 con.add(pn);
			
	
	}
	public ADMINVIEW1(login login) {
		// TODO Auto-generated constructor stub
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
	public void themkhvaotable(KhachHang kh) {
		DefaultTableModel modeltable = (DefaultTableModel) table_1.getModel();
		modeltable.addRow(new Object[]{kh.getIDKhachhang()+"",kh.getTenkh()+"",kh.getDiachikh()+"",kh.getQuan()+"",kh.getNgaysinh().getDate()+"/"+(kh.getNgaysinh().getMonth()+1)+"/"+(kh.getNgaysinh().getYear()+1900)+"",(kh.isGioitinh()?"Nam":"Nữ"),kh.getSdt()+""});
		
		
		
	}
	public void themhoaccapnhapkh(KhachHang kh) {
		DefaultTableModel modeltable = (DefaultTableModel) table_1.getModel();
		if(!this.adminmodel.kiemtratontai(kh)) {
			
		this.adminmodel.insert(kh);
		
	this.themkhvaotable(kh);
	khachhangdao.getInstace().them(kh);
	}else {
		int luachon1= JOptionPane.showConfirmDialog(this, "Bạn muốn thay đổi dữ liệu của ID khách hàng="+kh.getIDKhachhang(),"",JOptionPane.YES_NO_OPTION);
		if(luachon1==JOptionPane.YES_OPTION) {
			
			
		
		this.adminmodel.update(kh);
		
		int soluongdong=modeltable.getRowCount();
		for (int i = 0; i < soluongdong; i++) {
			String id=modeltable.getValueAt(i, 0)+"";
			if(id.equals(kh.getIDKhachhang()+"")) {
				modeltable.setValueAt(kh.getIDKhachhang()+"",i,0);
				modeltable.setValueAt(kh.getDiachikh()+"",i,2);
				modeltable.setValueAt(kh.getQuan()+"",i,3);
				modeltable.setValueAt(kh.getTenkh()+"",i,1);
				modeltable.setValueAt(kh.getSdt()+"",i,6);
				modeltable.setValueAt((kh.isGioitinh()?"Nam":"Nữ")+"",i,5);
				modeltable.setValueAt(kh.getNgaysinh().getDate()+"/"+(kh.getNgaysinh().getMonth()+1)+"/"+(kh.getNgaysinh().getYear()+1900),i,4);
			
				
				
			}
			
		}
		khachhangdao.getInstace().capnhap(kh);
		}
	}
	}

	
public KhachHang getKHdangchon()  {
	DefaultTableModel modeltable = (DefaultTableModel) table_1.getModel();
	int i_row=table_1.getSelectedRow();


	int IDKhachhang = Integer.valueOf(modeltable.getValueAt(i_row, 0)+"");
	String tenkh=modeltable.getValueAt(i_row, 1)+"";
	String diachikh=modeltable.getValueAt(i_row, 2)+"";
	String sdt=modeltable.getValueAt(i_row, 6)+"";
	String quan=modeltable.getValueAt(i_row, 3)+"";
	String s_ngaysinh=modeltable.getValueAt(i_row, 4)+"";
	DateFormat date1=new SimpleDateFormat("dd/MM/yyyy");
	Date ngaysinh1 = null;
	try {
		ngaysinh1 = date1.parse(s_ngaysinh);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

		
	
	
	String textgt=modeltable.getValueAt(i_row, 5)+"";
	boolean gioitinh=textgt.equals("Nam");
	KhachHang kh=new KhachHang(IDKhachhang, tenkh, diachikh, quan, ngaysinh1, gioitinh, sdt);
	return kh;
}
	public void hienthi()  {
		KhachHang kh=getKHdangchon();
		this.textField.setText(kh.getIDKhachhang()+"");
		this.textField_2.setText(kh.getTenkh()+"");
		this.textField_1.setText(kh.getDiachikh());
		this.comboBox.setSelectedItem(kh.getQuan());
		//String s_ngaysinh=kh.getNgaysinh().getDate()+"/"+(kh.getNgaysinh().getMonth()+1)+"/"+(kh.getNgaysinh().getYear()+1900);
		this.textField_4.setText(kh.getNgaysinh().getDate()+"/"+(kh.getNgaysinh().getMonth()+1)+"/"+(kh.getNgaysinh().getYear()+1900));
		this.textField_3.setText(kh.getSdt());
		if(kh.isGioitinh()) {
			rdbtnNewRadioButton.setSelected(true);
			
			
		}else {
			rdbtnNewRadioButton_1.setSelected(true);
			
		}
		
		
	
		
		
		
		
	}

	public void thuchienxoa() {
		DefaultTableModel modeltable = (DefaultTableModel) table_1.getModel();
		int i_row=table_1.getSelectedRow();
		int luaChon=JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xóa? ");
		if(luaChon==JOptionPane.YES_OPTION) {
			KhachHang kh=getKHdangchon();
			this.adminmodel.detele(kh);
			modeltable.removeRow(i_row);
			khachhangdao.getInstace().xoa(kh);
		}
		
	}

	public void thuchienthemKH()  {
		int IDKhachhang = Integer.valueOf(this.textField.getText());
		String tenkh=this.textField_2.getText();
		String diachikh=this.textField_1.getText();
		String sdt=this.textField_3.getText();
		String quan=this.comboBox.getSelectedItem()+"";
		 DateFormat date=new SimpleDateFormat("dd/MM/yyyy");
		
		Date ngaysinh = null;
		try {
			ngaysinh = date.parse(this.textField_4.getText());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ngaysinh);
		boolean gioitinh=true;
		
		if(this.rdbtnNewRadioButton.isSelected()) {
			gioitinh=true;
		
		}
		else if(this.rdbtnNewRadioButton_1.isSelected()) {
			gioitinh=false;
		}
		KhachHang kh=new KhachHang(IDKhachhang, tenkh, diachikh, quan, ngaysinh,gioitinh, sdt);
		
		
		
		System.out.println(kh);
		this.themhoaccapnhapkh(kh);
		
	
		
		
	}

	public void thuchientim() {
		//this.thuchienhuy();
		
		// TODO Auto-generated method stub
		int quan=this.comboBox1.getSelectedIndex();
		String IDtimkiem=this.textField_5.getText();
		
		
		DefaultTableModel modeltable = (DefaultTableModel) table_1.getModel();
		
		int soluongdong=modeltable.getRowCount();
		Set<Integer> idcuakhcanxoa=new TreeSet<Integer>();
		if(quan>0) {
			
			
		String quan1=(String) this.comboBox1.getSelectedItem();
		for (int i = 0; i < soluongdong; i++) {
			String tenquan=modeltable.getValueAt(i, 3)+"";
			String id=modeltable.getValueAt(i, 0)+"";
			if(!tenquan.equals(quan1)) {
				idcuakhcanxoa.add(Integer.valueOf(id));
				
				
			}
				
				
				
			}
		}
		if(IDtimkiem.length()>0) {
			for(int i=0;i<soluongdong;i++) {
				String id=modeltable.getValueAt(i, 0)+"";
				if(!id.equals(IDtimkiem)) {
					idcuakhcanxoa.add(Integer.valueOf(id));
				}
				
			}
		}
		for (Integer idcanxoa : idcuakhcanxoa) {
		 soluongdong=modeltable.getRowCount();
		 for (int i = 0; i < soluongdong; i++) {
			
		
			String idtrongtable=modeltable.getValueAt(i,0)+"";
			if(idtrongtable.equals(idcanxoa.toString())) {
				try {
					modeltable.removeRow(i);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			
		}
	}
	}

	public void thuchienhuy() {
		while(true) {
			DefaultTableModel modeltable = (DefaultTableModel) table_1.getModel();
			 int soluongdong=modeltable.getRowCount();
			 if(soluongdong==0)
				 break;
			 else
				 modeltable.removeRow(0);
			}
			for (KhachHang kh: khachhangdao.getInstace().selectAll() ) {
				this.themkhvaotable(kh);
				
			}
			comboBox1.setSelectedIndex(-1);
			textField_5.setText("");
			
			
		}

	@Override
	public void actionPerformed(ActionEvent e) {
	
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

	public void thoatkhoict() {
		// TODO Auto-generated method stub
		int luachon= JOptionPane.showConfirmDialog(this, "Bạn muốn thoát ra?","exit",JOptionPane.YES_NO_OPTION);
		if(luachon==JOptionPane.YES_OPTION) {
			System.exit(0);
			
		}
		
		
	}

	public void ttkh() {
		
		pn2.getLayout();
		 cardlayout.show(pn2, "1");
		
	       
	}

	public void tttt() {
		pn2.getLayout();
		cardlayout.show(pn2, "2");
		DefaultTableModel modeltable1 = (DefaultTableModel) table_2.getModel();
		int soluongdong=modeltable.getRowCount();
		for(hoadon hd:hoadondao.getInstace().selectAll()) {
			this.adminmodel1.update(hd);
			String quan= hd.getQuan();
			
			
			for (int i = 0; i < soluongdong; i++) {
				hd.setQuan("");
				int id=Integer.parseInt(modeltable.getValueAt(i, 0)+"");
				String quan1=modeltable.getValueAt(i, 3)+"";
				if(id==hd.getIDkh()) {
					hd.setQuan(quan1);
					
					modeltable1.setValueAt(hd.getQuan()+"",i,2);
					


					hoadondao.getInstace().capnhap(hd);
					
					
					
				}
			}
			
			
			
		}
		while(true) {
			
			 int soluongdong1=modeltable1.getRowCount();
			 if(soluongdong1==0)
				 break;
			 else
				 modeltable1.removeRow(0);
			}
			for (hoadon hd: hoadondao.getInstace().selectAll()) {
				this.themhdvaotable1(hd);
				
				
			}
				
			}
			
		
		
		
			
		
		
	
	public void xoaform1() {
		textField11.setText("");
		textField_12.setText("");
		textField_14.setText("");
		textField_15.setText("");
		textField_16.setText("");
		textField_17.setText("");
		textField_19.setText("");
		textField_21.setText("");
		textField_74.setText("");
		textField_64.setText("");
		//comboBox2.setSelectedIndex(-1);
		comboBox5.setSelectedIndex(-1);
		
		
	}

	public void thuchienthemhd() {
		int idhoadon = Integer.valueOf(this.textField11.getText()+"");
		int IDkh = Integer.valueOf(this.textField_12.getText()+"");
		int soluongdong=modeltable.getRowCount();
		String quan = null;
		for(int  i=0;i<soluongdong;i++) {
			String quan1=modeltable.getValueAt(i, 3)+"";
			int id=Integer.parseInt(modeltable.getValueAt(i, 0)+"");
			if(IDkh==id) {
				quan=quan1;
				
				
			}
			
			
		}
		
		int sonuoccu=Integer.valueOf(this.textField_14.getText());
		int sonuocmoi=Integer.valueOf(this.textField_15.getText());
		this.textField_16.setText((sonuocmoi-sonuoccu)+"");
		int sonuocdung=Integer.valueOf(this.textField_16.getText());
		int dongia=Integer.valueOf(this.textField_17.getText());
		
		String tinhtrang=this.comboBox5.getSelectedItem()+"";
		DateFormat date=new SimpleDateFormat("dd/MM/yyyy");
		
		Date ngaytt = null;
		if(tinhtrang.equals("Đã Thanh Toán")) {
		try {
			ngaytt = date.parse(this.textField_19.getText());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		else this.textField_19.setText("");
		this.textField_21.setText((dongia*sonuocdung)+"");
		int tongtien=Integer.valueOf(this.textField_21.getText());
DateFormat date2=new SimpleDateFormat("MM/yyyy");
		
		Date thang = null;
		try {
			thang = date2.parse(this.textField_74.getText());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		hoadon hd=new hoadon(idhoadon, IDkh, quan,thang, sonuoccu, sonuocmoi,sonuocdung,dongia,tongtien, tinhtrang, ngaytt);
		 System.out.println(hd);
		 this.themhoaccapnhaphd(hd);
	}

	private void themhoaccapnhaphd(hoadon hd) {
		DefaultTableModel modeltable1 = (DefaultTableModel) table_2.getModel();
		if(!this.adminmodel1.kiemtratontai1(hd)) {
			
		this.adminmodel1.insert(hd);
		
	this.themhdvaotable1(hd);
	hoadondao.getInstace().them(hd);
	}else {
		int luachon2= JOptionPane.showConfirmDialog(this, "Bạn muốn thay đổi dữ liệu của ID hóa đơn="+hd.getIDhoadon(),"",JOptionPane.YES_NO_OPTION);
		if(luachon2==JOptionPane.YES_OPTION) {
			
		this.adminmodel1.update(hd);
		
		int soluongdong=modeltable1.getRowCount();
		for (int i = 0; i < soluongdong; i++) {
			String id=modeltable1.getValueAt(i, 0)+"";
			if(id.equals(hd.getIDhoadon()+"")) {
				modeltable1.setValueAt(hd.getIDhoadon()+"",i,0);
				modeltable1.setValueAt(hd.getIDkh()+"",i,1);
				modeltable1.setValueAt(hd.getQuan()+"",i,2);
				modeltable1.setValueAt((hd.getThang().getMonth()+1)+"/"+(hd.getThang().getYear()+1900)+"",i,3);
				modeltable1.setValueAt(hd.getSonuoccu()+"",i,4);
				modeltable1.setValueAt(hd.getSonuocmoi()+"",i,5);
				modeltable1.setValueAt(hd.getSonuocdung()+"",i,6);
				modeltable1.setValueAt(hd.getDongia()+"",i,7);
				modeltable1.setValueAt(hd.getTongtien()+"",i,8);
				modeltable1.setValueAt(hd.getTinhtrang()+"",i,9);
				String a1="Đã Thanh Toán";
				if(a1. equals(hd.getTinhtrang())) {
				modeltable1.setValueAt(hd.getNgaythanhtoan().getDate()+"/"+(hd.getNgaythanhtoan().getMonth()+1)+"/"+(hd.getNgaythanhtoan().getYear()+1900)+"",i,10);
				}
				else modeltable1.setValueAt("",i,10);
			}
		}
		hoadondao.getInstace().capnhap(hd);
	}
	}
	}

	private void themhdvaotable1(hoadon hd) {
		DefaultTableModel modeltable1 = (DefaultTableModel) table_2.getModel();
		if(hd.getTinhtrang().equals("Đã Thanh Toán")) {
		modeltable1.addRow(new Object[]{hd.getIDhoadon(),hd.getIDkh()+"",hd.getQuan()+"",(hd.getThang().getMonth()+1)+"/"+(hd.getThang().getYear()+1900)+"",hd.getSonuoccu(),hd.getSonuocmoi(),hd.getSonuocdung(),hd.getDongia(),hd.getTongtien(),hd.getTinhtrang()+"",hd.getNgaythanhtoan().getDate()+"/"+(hd.getNgaythanhtoan().getMonth()+1)+"/"+(hd.getNgaythanhtoan().getYear()+1900)+""});
		}
		else modeltable1.addRow(new Object[]{hd.getIDhoadon(),hd.getIDkh()+"",hd.getQuan()+"",(hd.getThang().getMonth()+1)+"/"+(hd.getThang().getYear()+1900)+"",hd.getSonuoccu(),hd.getSonuocmoi(),hd.getSonuocdung(),hd.getDongia(),hd.getTongtien(),hd.getTinhtrang()+"",""});

		
	}

	public void hienthihd() {
		hoadon hd=gethddangchon();
		this.textField11.setText(hd.getIDhoadon()+"");
		this.textField_12.setText(hd.getIDkh()+"");
		
		this.textField_64.setText(hd.getQuan());
		this.textField_14.setText(hd.getSonuoccu()+"");
		this.textField_15.setText(hd.getSonuocmoi()+"");
		this.textField_16.setText(hd.getSonuocdung()+"");
		this.textField_17.setText(hd.getDongia()+"");
		this.textField_21.setText(hd.getTongtien()+"");
		
		this.comboBox5.setSelectedItem(hd.getTinhtrang()+"");
		this.textField_74.setText(hd.getThang().getMonth()+1+"/"+(hd.getThang().getYear()+1900));


		
		//String s_ngaysinh=kh.getNgaysinh().getDate()+"/"+(kh.getNgaysinh().getMonth()+1)+"/"+(kh.getNgaysinh().getYear()+1900);
		
		if(hd.getTinhtrang().equals("Đã Thanh Toán")) {
			String a2= hd.getNgaythanhtoan()+"";
		this.textField_19.setText(hd.getNgaythanhtoan().getDate()+"/"+(hd.getNgaythanhtoan().getMonth()+1)+"/"+(hd.getNgaythanhtoan().getYear()+1900));
		}
		else this.textField_19.setText("");
		
	}

	private hoadon gethddangchon() {
		DefaultTableModel modeltable1 = (DefaultTableModel) table_2.getModel();
		int i_row=table_2.getSelectedRow();


		int idhd=Integer.valueOf(modeltable1.getValueAt(i_row, 0)+"");
		int IDKhachhang = Integer.valueOf(modeltable1.getValueAt(i_row, 1)+"");
		String quan=modeltable1.getValueAt(i_row, 2)+"";
		String thang3=modeltable1.getValueAt(i_row, 3)+"";
		DateFormat date4=new SimpleDateFormat("MM/yyyy");
		Date thang1 = null;
		try {
			thang1 = date4.parse(thang3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int sonuoccu = Integer.valueOf(modeltable1.getValueAt(i_row, 4)+"");
		int sonuocmoi = Integer.valueOf(modeltable1.getValueAt(i_row, 5)+"");
		int sonuocdung = Integer.valueOf(modeltable1.getValueAt(i_row, 6)+"");
		int dongia = Integer.valueOf(modeltable1.getValueAt(i_row, 7)+"");
		int tongtien = Integer.valueOf(modeltable1.getValueAt(i_row, 8)+"");
		String tinhtrang=modeltable1.getValueAt(i_row, 9)+"";
		String ngaythanhtoan=modeltable1.getValueAt(i_row, 10)+"";
		
		DateFormat date1=new SimpleDateFormat("dd/MM/yyyy");
		
		Date ngaythanhtoan1 = null;
		if(tinhtrang.equals("Đã Thanh Toán")) {
		try {
			ngaythanhtoan1 = date1.parse(ngaythanhtoan);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		
		
		
		hoadon hd=new hoadon(idhd, IDKhachhang, quan,thang1, sonuoccu, sonuocmoi, sonuocdung, dongia, tongtien, tinhtrang, ngaythanhtoan1);
		System.out.println(hd);
		return hd;
	}

	public void thuchienxoahd() {
	
			DefaultTableModel modeltable1 = (DefaultTableModel) table_2.getModel();
			for(int i=0;i<modeltable1.getRowCount();i++) {
			int i_row=table_2.getSelectedRow();
			if(i==i_row) {
				hoadon hd=gethddangchon();
				this.adminmodel1.detele(hd);
				modeltable1.removeRow(i_row);
				hoadondao.getInstace().xoa(hd);
			}
			}
		}

	public void thuchientimhd() {
		// TODO Auto-generated method stub
		String thang=this.textField_73.getText();
		
		String IDhd=this.textField_71.getText();
		
		
		DefaultTableModel modeltable1 = (DefaultTableModel) table_2.getModel();
		
		int soluongdong=modeltable1.getRowCount();
		Set<String> idcuahdcanxoa1=new TreeSet<String>();
		if(thang.length()>0) {
			
			
			String thangnam=this.textField_73.getText();
		for (int i = 0; i < soluongdong; i++) {
			String thang1=modeltable1.getValueAt(i, 3)+"";
			String id=modeltable1.getValueAt(i, 0)+"";
			if(!thang1.equals(thangnam)) {
				idcuahdcanxoa1.add( String.valueOf(id));
				
				
			}
				
				
				
			}
		}
		if(IDhd.length()>0) {
			String id1=this.textField_71.getText();
			for(int i=0;i<soluongdong;i++) {
				String id11=modeltable1.getValueAt(i, 1)+"";
				String id=modeltable1.getValueAt(i, 0)+"";
				if(!id11.equals(IDhd)) {
					idcuahdcanxoa1.add( String.valueOf(id));
				}
				
			}
		}
		for (String idcanxoa : idcuahdcanxoa1) {
		 soluongdong=modeltable1.getRowCount();
		 for (int i = 0; i < soluongdong; i++) {
			
		
			String idtrongtable=modeltable1.getValueAt(i,0)+"";
			if(idtrongtable.equals(idcanxoa.toString())) {
				try {
					modeltable1.removeRow(i);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			
		}
	}
	}

	public void thuchienhuyhd() {
		while(true) {
			DefaultTableModel modeltable1 = (DefaultTableModel) table_2.getModel();
			 int soluongdong=modeltable1.getRowCount();
			 if(soluongdong==0)
				 break;
			 else
				 modeltable1.removeRow(0);
			}
			for (hoadon hd: hoadondao.getInstace().selectAll()) {
				this.themhdvaotable1(hd);
				
				
			}
			
			textField_71.setText("");
			textField_73.setText("");
		}

	public void themds() {
		DefaultTableModel modeltable1 = (DefaultTableModel) table_2.getModel();
		
		
		for(KhachHang kh : khachhangdao.getInstace().selectAll()) {
			
			int id= kh.getIDKhachhang();
			String quan=kh.getQuan();
			DateFormat date3=new SimpleDateFormat("MM/yyyy");
			
			Date thang3 = null;
			try {
				thang3 = date3.parse(this.textField_73.getText());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int snc=0;
			int dg=0;
			int idhd=1;
			
			int snm= 0;
			int snd=0;
			int tongtien=0;
			String tinhtrang="Chưa Thanh Toán";
			Date ngaytt= null;
			
			
			 
			for(hoadon hd1:hoadondao.getInstace().selectAll()) {
				if(kh.getIDKhachhang()==hd1.getIDkh()&& thang3.getMonth()==(hd1.getThang().getMonth()+1)) {
					 snc=hd1.getSonuocmoi();
					 dg=hd1.getDongia();
					 
				}
				
				if(hd1.getIDhoadon()>idhd) {
					idhd=hd1.getIDhoadon();
				}
				
			}	   
			
			int idhd1=idhd+1;
			hdd= new hoadon(idhd1, id, quan, thang3,snc , snm, snd, dg, tongtien, tinhtrang, ngaytt);
			
			
			hoadondao.getInstace().them(hdd);
			themhdvaotable1(hdd);}
		
			}

	public void bd1() {
		pn2.getLayout();
		 cardlayout.show(pn2, "3");
	       
		
	}

	public void xembd() throws SQLException {
		
		//ArrayList<hoadon> ketQua = new ArrayList<>();
		 int sumto = 0;
		 String ab = "";
	        try {
	        	 String te=this.textField_41.getText();
	     DefaultPieDataset pie=new DefaultPieDataset(); 
	   
	     
		 Connection con = conJDBC.getConnection();
         Statement st = con.createStatement();
         String sql1 = "SELECT thang,sum(tongtien) AS sum\r\n"
         		+ "FROM thongtinhoadon GROUP BY thang";
          ResultSet rs1 = st.executeQuery(sql1);
          while (rs1.next()) {
        	  int sumtong=rs1.getInt("sum");
        	  Date thang2=rs1.getDate("thang");
        	   String ab1=thang2.getMonth()+1+"/"+(thang2.getYear()+1900);
        	   if(ab1.equals(te)) {
        		   sumto=sumtong;
        	   }
          } 
          conJDBC.closecon(con);
          Connection con1 = conJDBC.getConnection();
          Statement st1 = con1.createStatement();
         String sql = "SELECT thang,quan,sum(tongtien) AS sum\r\n"
         		+ "FROM thongtinhoadon\r\n" 
         		+ "GROUP BY thang,quan";
         ResultSet rs = st1.executeQuery(sql);
         while (rs.next()) {
         	String quan = rs.getString("quan"); 
             int sum = rs.getInt("sum"); 
             Date thang=rs.getDate("thang");
              ab=thang.getMonth()+1+"/"+(thang.getYear()+1900);
             System.out.println(ab);
             
            
     		if(ab.equals(te)) {
     		pie.setValue(quan, new Double(sum));
     		
     		//System.out.println(pie);
     		System.out.println(quan+sum);}}
     		 
     		JFreeChart chat =  ChartFactory.createPieChart("Biểu Đồ thể hiện doanh thu theo Quận tháng"+te, pie, true, true, false);
     		
     		PiePlot pielot=  (PiePlot) chat.getPlot();
     		pielot.setBackgroundPaint(new Color(176, 224, 230));
     		//chat.getPlot().setForegroundAlpha(0.5f);
            //chat.getPlot().setBackgroundAlpha(0.2f);
            ((PiePlot) chat.getPlot()).setLabelGenerator(new StandardPieSectionLabelGenerator("{0}: {2}"));

     		chartPanel = new ChartPanel(chat);
     		
   		 chartPanel.setMouseWheelEnabled(true);
           chartPanel.setPreferredSize(new java.awt.Dimension(300, 250));
           pn5=new JPanel();
          
           pn4.add(pn5,bo4.CENTER);
           pn5.setLayout(new BorderLayout());
           
           pn5.add(chartPanel,BorderLayout.CENTER);
           pack();
          repaint();
          
            
                
             
         
     	

         conJDBC.closecon(con1);
        
         } catch (SQLException e) {
         e.printStackTrace();
         
     }
	      
	    
	        
	        
	       
	        
	        
	        
	      
	
	        }

	public void huybd1() {
	    textField_41.setText("");
	    pn5.removeAll();
	   
	    
		
	}

	public void dangnhap() {
		// TODO Auto-generated method stub
		pn2.getLayout();
		 cardlayout.show(pn2, "4");
	       
	}

}
		
	
	
	

	
	
	



		
	
		
		
		
		
		

	
	
	
	
	
	
	
	






