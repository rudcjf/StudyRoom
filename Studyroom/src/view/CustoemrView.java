package view;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;

import main.StudyRoomViewMain;

import javax.swing.RowSorter;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;


import model.LoginModel;
import model.vo.Login;
import view.MainPosView;
import view.StudyroomView;
import view.OrderView.PayTableModel;

public class CustoemrView extends JFrame {
	static CustoemrView frame;
	private JTextField tfName;
	private JTextField tfTel;
	private JTextField tfAdr;
	private JTextField tfMail;

	LoginModel model;
	JTable tableCus;
	CusTableModel tbModelCus;
	StudyRoomViewMain main;

	int c_num;

//	public static void main(String[] args) {
//
//		frame = new CustoemrView();
//		frame.setVisible(true);
//
//	}
	public void setMain(StudyRoomViewMain main) {
		this.main = main;
	}
	
	// DB연결
	public void connectDB() {
		try {
			model = new LoginModel();
			System.out.println("고객관리DB 연결 성공");
		} catch (Exception ex) {
			System.out.println("고객관리 연결 실패 : " + ex.getMessage());
		}

	}

	// 고객 테이블
	class CusTableModel extends AbstractTableModel {

		ArrayList data = new ArrayList();
		String[] columnNames = { "고객번호", "고객명", "전화번호", "주소", "메일" };

		// =============================================================
		// 1. 기본적인 TabelModel 만들기
		// 아래 세 함수는 TabelModel 인터페이스의 추상함수인데
		// AbstractTabelModel에서 구현되지 않았기에...
		// 반드시 사용자 구현 필수!!!!

		public int getColumnCount() {
			return columnNames.length;
		}

		public int getRowCount() {
			return data.size();
		}

		public Object getValueAt(int row, int col) {
			ArrayList temp = (ArrayList) data.get(row);
			return temp.get(col);
		}

		public String getColumnName(int col) {
			return columnNames[col];
		}

	}

	void search() { // 검색 목록 출력
		ArrayList data;
		try {
			data = model.search();
			tbModelCus.data = data;
			tbModelCus.fireTableDataChanged();
		} catch (Exception e) {
			System.out.println("검색 실패 : " + e.getMessage());
			e.printStackTrace();
		}

	}

	public void insert() {
		// 1. 화면 텍스트필드의 입력값 얻어오기
		// 2. 1값들을 Customer 클래스의 멤버로지정
		// 3. Model 클래스 안에 insertCustomer () 메소드 호출하여 2번 VO 객체를 넘김
		// 4. 화면 초기화
		Login log = new Login();
		log.setC_name(tfName.getText());
		log.setC_adr(tfAdr.getText());
		log.setC_mail(tfMail.getText());
		log.setC_tel(tfTel.getText());

		try {
			model.insertCus(log);
			System.out.println("입력성공");
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "입력실패");
			System.out.println("입력실패 : " + ex.getMessage());
		}
		tfName.setText(null);
		tfAdr.setText(null);
		tfMail.setText(null);
		tfTel.setText(null);

	}

	public void update() {

		Login log = new Login();
		log.setC_name(tfName.getText());
		log.setC_adr(tfAdr.getText());
		log.setC_mail(tfMail.getText());
		log.setC_tel(tfTel.getText());

		try {
			model.updateCus(log, c_num);
			System.out.println("수정성공");
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "입력실패");
			System.out.println("입력실패 : " + ex.getMessage());
		}
		tfName.setText(null);
		tfAdr.setText(null);
		tfMail.setText(null);
		tfTel.setText(null);
	}

	public void delete() {
		
		Login log = new Login();
		log.setC_name(tfName.getText());
		log.setC_tel(tfTel.getText());
		log.setC_adr(tfAdr.getText());
		log.setC_mail(tfMail.getText());

		model.deleteCus(log, c_num);
			tfName.setText(null);
			tfTel.setText(null);
			tfAdr.setText(null);
			tfMail.setText(null);
			JOptionPane.showMessageDialog(null, "삭제");
		
		
	}

	public CustoemrView() {

		tbModelCus = new CusTableModel();
		tableCus = new JTable(tbModelCus);
		tableCus.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		// 마우스 클릭시 액션

		tableCus.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int row = tableCus.getSelectedRow();
				int col = 0;
				c_num = (Integer) tableCus.getValueAt(row, col);

				tfName.setText((String) tableCus.getValueAt(row, 1));
				tfTel.setText((String) tableCus.getValueAt(row, 2));
				tfAdr.setText((String) tableCus.getValueAt(row, 3));
				tfMail.setText((String) tableCus.getValueAt(row, 4));
			}
		});
		
		RowSorter<CusTableModel> sorter = new TableRowSorter<CusTableModel>(tbModelCus);

	    tableCus.setRowSorter(sorter);

		setSize(800, 600);
		setResizable(false);

		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel_Main1 = new JPanel();
		panel_Main1.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(panel_Main1, BorderLayout.NORTH);
		GridBagLayout gbl_panel_Main1 = new GridBagLayout();
		gbl_panel_Main1.columnWidths = new int[] { 17, 490, 0, 0, 0 };
		gbl_panel_Main1.rowHeights = new int[] { 41, 446, 0 };
		gbl_panel_Main1.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_Main1.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		panel_Main1.setLayout(gbl_panel_Main1);

		JLabel lblCustomer = new JLabel("회원관리");
		lblCustomer.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		GridBagConstraints gbc_lblCustomer = new GridBagConstraints();
		gbc_lblCustomer.anchor = GridBagConstraints.NORTH;
		gbc_lblCustomer.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCustomer.insets = new Insets(0, 0, 5, 5);
		gbc_lblCustomer.gridx = 1;
		gbc_lblCustomer.gridy = 0;
		panel_Main1.add(lblCustomer, gbc_lblCustomer);
		
		JButton button = new JButton("돌아가기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//화면 전환
				main.customerViewCan(main);
			}
		});
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button.setBackground(Color.LIGHT_GRAY);
		button.setForeground(Color.BLACK);
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 2;
		gbc_button.gridy = 0;
		panel_Main1.add(button, gbc_button);

		// 테이블/---------------------------------------------------------------
		JScrollPane scrollPane = new JScrollPane(tableCus);

		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		panel_Main1.add(scrollPane, gbc_scrollPane);

		JPanel panel_Main2 = new JPanel();
		getContentPane().add(panel_Main2, BorderLayout.CENTER);
		panel_Main2.setLayout(new BorderLayout(0, 0));

		JPanel panel_Sub1 = new JPanel();
		panel_Sub1.setBackground(Color.LIGHT_GRAY);
		panel_Main2.add(panel_Sub1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_Sub1 = new GridBagLayout();
		gbl_panel_Sub1.columnWidths = new int[] { 28, 0, 57, 28, 28, 0, 12, 28, 32, 0, 0, 0 };
		gbl_panel_Sub1.rowHeights = new int[] { 0, 21, 0 };
		gbl_panel_Sub1.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_panel_Sub1.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		panel_Sub1.setLayout(gbl_panel_Sub1);

		JLabel lblName = new JLabel("이름 ");
		lblName.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.fill = GridBagConstraints.VERTICAL;
		gbc_lblName.anchor = GridBagConstraints.WEST;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 1;
		gbc_lblName.gridy = 0;
		panel_Sub1.add(lblName, gbc_lblName);

		JLabel lblTel = new JLabel("전화 ");
		lblTel.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		GridBagConstraints gbc_lblTel = new GridBagConstraints();
		gbc_lblTel.anchor = GridBagConstraints.WEST;
		gbc_lblTel.insets = new Insets(0, 0, 5, 5);
		gbc_lblTel.gridx = 2;
		gbc_lblTel.gridy = 0;
		panel_Sub1.add(lblTel, gbc_lblTel);

		JLabel lblAdr = new JLabel("주소 ");
		lblAdr.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		GridBagConstraints gbc_lblAdr = new GridBagConstraints();
		gbc_lblAdr.anchor = GridBagConstraints.WEST;
		gbc_lblAdr.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdr.gridx = 3;
		gbc_lblAdr.gridy = 0;
		panel_Sub1.add(lblAdr, gbc_lblAdr);

		JLabel lblMail = new JLabel("메일 ");
		lblMail.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		GridBagConstraints gbc_lblMail = new GridBagConstraints();
		gbc_lblMail.insets = new Insets(0, 0, 5, 5);
		gbc_lblMail.anchor = GridBagConstraints.WEST;
		gbc_lblMail.gridx = 7;
		gbc_lblMail.gridy = 0;
		panel_Sub1.add(lblMail, gbc_lblMail);

		tfName = new JTextField();
		GridBagConstraints gbc_tfName = new GridBagConstraints();
		gbc_tfName.insets = new Insets(0, 0, 0, 5);
		gbc_tfName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfName.gridx = 1;
		gbc_tfName.gridy = 1;
		panel_Sub1.add(tfName, gbc_tfName);
		tfName.setColumns(10);

		tfTel = new JTextField();
		tfTel.setColumns(10);
		GridBagConstraints gbc_tfTel = new GridBagConstraints();
		gbc_tfTel.insets = new Insets(0, 0, 0, 5);
		gbc_tfTel.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfTel.gridx = 2;
		gbc_tfTel.gridy = 1;
		panel_Sub1.add(tfTel, gbc_tfTel);

		tfAdr = new JTextField();
		tfAdr.setColumns(10);
		GridBagConstraints gbc_tfAdr = new GridBagConstraints();
		gbc_tfAdr.gridwidth = 4;
		gbc_tfAdr.insets = new Insets(0, 0, 0, 5);
		gbc_tfAdr.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfAdr.gridx = 3;
		gbc_tfAdr.gridy = 1;
		panel_Sub1.add(tfAdr, gbc_tfAdr);

		tfMail = new JTextField();
		tfMail.setColumns(10);
		GridBagConstraints gbc_tfMail = new GridBagConstraints();
		gbc_tfMail.gridwidth = 3;
		gbc_tfMail.insets = new Insets(0, 0, 0, 5);
		gbc_tfMail.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMail.gridx = 7;
		gbc_tfMail.gridy = 1;
		panel_Sub1.add(tfMail, gbc_tfMail);

		JPanel panel_Main3 = new JPanel();
		panel_Main3.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(panel_Main3, BorderLayout.SOUTH);
		panel_Main3.setLayout(new BorderLayout(0, 0));

		JPanel panel_Sub2 = new JPanel();
		panel_Sub2.setBackground(Color.LIGHT_GRAY);
		panel_Main3.add(panel_Sub2, BorderLayout.EAST);

		JButton btnAdd = new JButton("추가");
		btnAdd.setBackground(Color.LIGHT_GRAY);
		btnAdd.addActionListener(new ActionListener() {

			// 삽입

			public void actionPerformed(ActionEvent e) {
				insert();
				search();
			}
		});
		btnAdd.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		panel_Sub2.add(btnAdd);

		JButton btnModify = new JButton("수정");
		btnModify.setBackground(Color.LIGHT_GRAY);
		btnModify.addActionListener(new ActionListener() {

			// 수정
			public void actionPerformed(ActionEvent e) {
				update();
				search();
			}
		});
		btnModify.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		panel_Sub2.add(btnModify);

		JButton btnDelete = new JButton("삭제");
		btnDelete.setBackground(Color.LIGHT_GRAY);
		btnDelete.addActionListener(new ActionListener() {

			// 삭제
			public void actionPerformed(ActionEvent e) {
				delete();
				search();
			}
		});
		btnDelete.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		panel_Sub2.add(btnDelete);

		JLabel lblZero = new JLabel("         ");
		panel_Sub2.add(lblZero);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		connectDB();
		search();
	}

}