package view;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReservationView extends JFrame {
	private JTextField tfStartTime;
	private JTextField tfEndTime;
	
	JButton btn101, btn102, btn103, btn104, btn201, btn202, btn203, btn204; 	
	JButton btn301, btn302, btn303, btn304, btn401, btn402, btn403,  btn404;
	
	
	
	public ReservationView () {
		setSize(800,600);
		setResizable(false);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {350, 50, 290, 0};
		gridBagLayout.rowHeights = new int[] {553, 30, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel panel_Main1 = new JPanel();
		panel_Main1.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panel_Main1 = new GridBagConstraints();
		gbc_panel_Main1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_Main1.fill = GridBagConstraints.BOTH;
		gbc_panel_Main1.gridx = 0;
		gbc_panel_Main1.gridy = 0;
		getContentPane().add(panel_Main1, gbc_panel_Main1);
		panel_Main1.setLayout(new BorderLayout(0, 9));
		
		JLabel lbReservation = new JLabel("스터디 룸 예약");
		lbReservation.setFont(new Font("굴림", Font.BOLD, 27));
		lbReservation.setHorizontalAlignment(SwingConstants.CENTER);
		panel_Main1.add(lbReservation, BorderLayout.NORTH);
		
		JPanel panel_btnStudyroom = new JPanel();
		panel_btnStudyroom.setBackground(Color.GRAY);
		panel_Main1.add(panel_btnStudyroom, BorderLayout.CENTER);
		panel_btnStudyroom.setLayout(new GridLayout(4, 4, 10, 10));
		
		btn101 = new JButton("101 호");
		btn101.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btnStudyroom.add(btn101);
		
		btn102 = new JButton("102 호");
		btn102.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btnStudyroom.add(btn102);
		
		btn103 = new JButton("103 호");
		btn103.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btnStudyroom.add(btn103);
		
		btn104 = new JButton("104 호");
		btn104.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btnStudyroom.add(btn104);
		
		btn201 = new JButton("201 호");
		btn201.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btnStudyroom.add(btn201);
		
		btn202 = new JButton("202 호");
		btn202.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btnStudyroom.add(btn202);
		
		btn203 = new JButton("203 호");
		btn203.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btnStudyroom.add(btn203);
		
		btn204 = new JButton("204 호");
		btn204.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btnStudyroom.add(btn204);
		
		btn301 = new JButton("301 호");
		btn301.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btnStudyroom.add(btn301);
		
		btn302 = new JButton("302 호");
		btn302.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btnStudyroom.add(btn302);
		
		btn303 = new JButton("303 호");
		btn303.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btnStudyroom.add(btn303);
		
		btn304 = new JButton("304 호");
		btn304.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btnStudyroom.add(btn304);
		
		btn401 = new JButton("401 호");
		btn401.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btnStudyroom.add(btn401);
		
		btn402 = new JButton("402 호");
		btn402.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btnStudyroom.add(btn402);
		
		btn403 = new JButton("403 호");
		btn403.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btnStudyroom.add(btn403);
		
		btn404 = new JButton("404 호");
		btn404.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btnStudyroom.add(btn404);
		
		JPanel panel_Bottom = new JPanel();
		panel_Bottom.setBackground(Color.LIGHT_GRAY);
		panel_Main1.add(panel_Bottom, BorderLayout.SOUTH);
		panel_Bottom.setLayout(new BorderLayout(0, 0));
		
		JLabel lbBottom = new JLabel(" ");
		lbBottom.setFont(new Font("굴림", Font.PLAIN, 24));
		panel_Bottom.add(lbBottom, BorderLayout.NORTH);
		
		JPanel panel_Main2 = new JPanel();
		panel_Main2.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panel_Main2 = new GridBagConstraints();
		gbc_panel_Main2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_Main2.fill = GridBagConstraints.BOTH;
		gbc_panel_Main2.gridx = 2;
		gbc_panel_Main2.gridy = 0;
		getContentPane().add(panel_Main2, gbc_panel_Main2);
		panel_Main2.setLayout(new BorderLayout(0, 0));
		
		JLabel lbTop = new JLabel("  ");
		lbTop.setFont(new Font("굴림", Font.PLAIN, 74));
		panel_Main2.add(lbTop, BorderLayout.NORTH);
		
		JPanel panel_Center = new JPanel();
		panel_Center.setBackground(Color.LIGHT_GRAY);
		panel_Main2.add(panel_Center, BorderLayout.CENTER);
		panel_Center.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Option = new JPanel();
		panel_Option.setBackground(Color.LIGHT_GRAY);
		panel_Center.add(panel_Option, BorderLayout.NORTH);
		panel_Option.setLayout(new BorderLayout(10, 20));
		
		JPanel panel_Date = new JPanel();
		panel_Date.setBackground(Color.LIGHT_GRAY);
		panel_Option.add(panel_Date, BorderLayout.NORTH);
		
		JLabel lbDate = new JLabel("날        짜");
		lbDate.setFont(new Font("굴림", Font.PLAIN, 18));
		lbDate.setHorizontalAlignment(SwingConstants.LEFT);
		panel_Date.add(lbDate);
		
		JTextField tfDate = new JTextField();
		panel_Date.add(tfDate);
		tfDate.setColumns(10);
		
		JPanel panel_StartTime = new JPanel();
		panel_StartTime.setBackground(Color.LIGHT_GRAY);
		panel_Option.add(panel_StartTime, BorderLayout.CENTER);
		
		JLabel lbStartTime = new JLabel("시작  시간");
		lbStartTime.setFont(new Font("굴림", Font.PLAIN, 18));
		lbStartTime.setHorizontalAlignment(SwingConstants.LEFT);
		panel_StartTime.add(lbStartTime);
		
		tfStartTime = new JTextField();
		tfStartTime.setColumns(10);
		panel_StartTime.add(tfStartTime);
		
		JPanel panel_EndTime = new JPanel();
		panel_EndTime.setBackground(Color.LIGHT_GRAY);
		panel_Option.add(panel_EndTime, BorderLayout.SOUTH);
		
		JLabel lbEndTime = new JLabel("종료  시간");
		lbEndTime.setFont(new Font("굴림", Font.PLAIN, 18));
		lbEndTime.setHorizontalAlignment(SwingConstants.LEFT);
		panel_EndTime.add(lbEndTime);
		
		tfEndTime = new JTextField();
		tfEndTime.setToolTipText("날짜, 시작시간, 종료시간 모두입력후 Enter입력시 가능한 스터디룸이 좌측에 시각화");
		tfEndTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tfEndTime.setColumns(10);
		panel_EndTime.add(tfEndTime);
		
		JLabel lblNewLabel = new JLabel("<html>\r\n**사용방법**<br/>\r\n먼저 사용하시고 싶은 날짜와<br/>\r\n시간을 입력해 주세요.<br/>\r\n예시)<br/>\r\n날      짜 : 09/11<br/>\r\n시작시간 : 12:00<br/>\r\n종료시간 : 13:00<br/>\r\n입력이 완료되면 Enter를 입력해주세요.<br/>\r\n입력하신 시간에 가능한 Studyroom이<br/>\r\n표현되고 클릭하신후 확인을 누르시면<br/>\r\n예약이 완료됩니다.\r\n</html>");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_Center.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_btnReservation = new JPanel();
		panel_btnReservation.setBackground(Color.LIGHT_GRAY);
		panel_Main2.add(panel_btnReservation, BorderLayout.SOUTH);
		panel_btnReservation.setLayout(new BorderLayout(0, 0));
		
		JButton btnReservation = new JButton("확인");
		btnReservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btnReservation.add(btnReservation, BorderLayout.WEST);
		
		JButton btnClear = new JButton("취소");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btnReservation.add(btnClear, BorderLayout.EAST);
	}

	public void enterTime(){
		//enter를 수행시 btn들을 enable/disable
	}
	
	public void btnRoom(){
		//해당 버튼을 클릭시 joptionframe을 통하여 예약 할 내용을 보이게 한다. 확인을 통하여 결제 완료할수 있음
		
	}
	
	
	
	
}
