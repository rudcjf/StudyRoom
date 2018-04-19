package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import model.OrderModel;
import model.vo.Order;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;




public class OrderView extends JFrame {
	
	OrderModel model;
	JTable tablePay;
	PayTableModel tbModelPay;
	JButton btnPay;
	
	int p_num;
	String p_way;
	
	static OrderView frame;
	public static void main(String[] args) {
		
		frame = new OrderView();
		frame.setVisible(true);

	}
	
	public void connectDB() {
		try {
			model = new OrderModel();
			System.out.println("주문관리DB 연결 성공");
		} catch (Exception ex) {
			System.out.println("주문관리 연결 실패 : " + ex.getMessage());
		}

	}
	
	
	//결제 테이블 
	class PayTableModel extends AbstractTableModel {

		ArrayList data = new ArrayList();
		String[] columnNames = { "결제번호", "예약번호", "결제방법", "결제날짜", "가격"};

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
	
	
	void search() {	//검색 목록 출력
		ArrayList data;
		try {
			data = model.search();
			tbModelPay.data = data;
			tablePay.setModel(tbModelPay);
			tbModelPay.fireTableDataChanged();
		} catch (Exception e) {
			System.out.println("검색 실패 : "+e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public void pay(){
		try {
			String[] selections = {"카드", "현금"};
			p_way = (String)JOptionPane.showInputDialog
			(null, "결제 하시겠습니까?", "결제", JOptionPane.QUESTION_MESSAGE, null, selections, "카드");

			
			if(p_way == "카드"){
				model.pay(p_num, p_way);
				JOptionPane.showMessageDialog(null, "결제가 완료되었습니다.");
				search();
			}else if(p_way == "현금"){
				model.pay(p_num, p_way);
				JOptionPane.showMessageDialog(null, "결제가 완료되었습니다.");
				search();
			}
		} catch (Exception e) {
			System.out.println("결제 실패 : "+e.getMessage());
		}
		
	}
	
	public void cancel(){
		frame.setVisible(false);
		MainPosView mView = new MainPosView();
		mView.setVisible(true);
	}
	
	
	
   public OrderView() {
	   
	  tbModelPay = new PayTableModel();
	  tablePay = new JTable(tbModelPay);
	  //마우스 클릭시 액션
	  tablePay.addMouseListener(new MouseAdapter() {
	  	public void mouseClicked(MouseEvent e) {
	  		int row = tablePay.getSelectedRow();
			int col = 0;
			p_num = (Integer)tablePay.getValueAt(row, col);
	  	}
	  });
	  
      setSize(800, 600);
      setResizable(false);
      
      getContentPane().setBackground(Color.LIGHT_GRAY);
      getContentPane().setLayout(new BorderLayout(0, 0));
      
      JPanel panel_Main1 = new JPanel();
      panel_Main1.setBackground(Color.LIGHT_GRAY);
      getContentPane().add(panel_Main1, BorderLayout.NORTH);
      GridBagLayout gbl_panel_Main1 = new GridBagLayout();
      gbl_panel_Main1.columnWidths = new int[]{0, 273, 0, 0};
      gbl_panel_Main1.rowHeights = new int[]{37, 482, 0};
      gbl_panel_Main1.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
      gbl_panel_Main1.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
      panel_Main1.setLayout(gbl_panel_Main1);
      
      JLabel lblPay = new JLabel("\uACB0\uC81C");
      lblPay.setFont(new Font("맑은 고딕", Font.BOLD, 30));
      GridBagConstraints gbc_lblPay = new GridBagConstraints();
      gbc_lblPay.anchor = GridBagConstraints.WEST;
      gbc_lblPay.insets = new Insets(0, 0, 5, 5);
      gbc_lblPay.gridx = 1;
      gbc_lblPay.gridy = 0;
      panel_Main1.add(lblPay, gbc_lblPay);
      
      //DB의 데이터 테이블로 출력
      JScrollPane scrollPane = new JScrollPane(tablePay);
      
      
      GridBagConstraints gbc_scrollPane = new GridBagConstraints();
      gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
      gbc_scrollPane.fill = GridBagConstraints.BOTH;
      gbc_scrollPane.gridx = 1;
      gbc_scrollPane.gridy = 1;
      panel_Main1.add(scrollPane, gbc_scrollPane);
      

      
      JPanel panel_Main2 = new JPanel();
      panel_Main2.setBackground(Color.LIGHT_GRAY);
      getContentPane().add(panel_Main2, BorderLayout.CENTER);
      panel_Main2.setLayout(new BorderLayout(0, 0));
      
      JPanel panel_Sub1 = new JPanel();
      panel_Sub1.setBackground(Color.LIGHT_GRAY);
      panel_Main2.add(panel_Sub1, BorderLayout.EAST);
      GridBagLayout gbl_panel_Sub1 = new GridBagLayout();
      gbl_panel_Sub1.columnWidths = new int[]{0, 0, 0, 0};
      gbl_panel_Sub1.rowHeights = new int[]{100, 0};
      gbl_panel_Sub1.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
      gbl_panel_Sub1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
      panel_Sub1.setLayout(gbl_panel_Sub1);
      
      btnPay = new JButton("결제");
      btnPay.setBackground(Color.LIGHT_GRAY);
      btnPay.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 pay();
         }
      });
      btnPay.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
      GridBagConstraints gbc_btnPay = new GridBagConstraints();
      gbc_btnPay.insets = new Insets(0, 0, 0, 5);
      gbc_btnPay.gridx = 0;
      gbc_btnPay.gridy = 0;
      panel_Sub1.add(btnPay, gbc_btnPay);
      
      JButton btnCancel = new JButton("취소");
      btnCancel.setBackground(Color.LIGHT_GRAY);
      btnCancel.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 cancel();
         }
      });
      btnCancel.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
      GridBagConstraints gbc_btnCancel = new GridBagConstraints();
      gbc_btnCancel.insets = new Insets(0, 0, 0, 5);
      gbc_btnCancel.gridx = 1;
      gbc_btnCancel.gridy = 0;
      panel_Sub1.add(btnCancel, gbc_btnCancel);
      
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	  connectDB();
	  search();
	  
	  
	  
   }

}