package main;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import model.LoginModel;
import model.vo.Login;
import model.vo.Order;

import view.MainPosView;
import view.StudyroomView;
import java.awt.Canvas;
import java.awt.SystemColor;

public class StudyroomPos extends JFrame {
	
	private JTextField tfId;
	private JPasswordField tfPass;
	JButton btnLogin;
	LoginModel model;
	StudyRoomViewMain main;
	int token;

//	public static void main(String[] args) {
//
//		frame = new StudyroomPos();
//		frame.setVisible(true);
//
//	}
	//연결 함수
	public void connectDB() {
		try {
			model = new LoginModel();
			System.out.println("고객관리DB 연결 성공");
		} catch (Exception ex) {
			System.out.println("고객관리 연결 실패 : " + ex.getMessage());
		}

	}

	// 로그인 함수
	public void login() {
		token = 0;
		// 1. 입력한 전화번호 얻어오기
		try {
			// 고객 로그인
			Login vo = model.login(Integer.parseInt(tfId.getText()));
			if (tfPass.getText().equals(vo.getCusPass())) {
				JOptionPane.showMessageDialog(null, "고객 로그인 성공");
				// 스터디 룸으로 화면 전환
				main.studyRoomView(main);
			}
			// 사원 로그인(int값이 아닌 경우 catch)
		} catch (NumberFormatException e) {
			Login vo;
			try {
				vo = model.login(tfId.getText());
				if (tfPass.getText().equals(vo.getCusPass())) {
					// 매니저 로그인
					if (tfId.getText().equals("admin")) {
						//System.out.println(tfId.getText());
						JOptionPane.showMessageDialog(null, "admin 로그인 성공");
						token = 1;
						main.mainPosView(main, token);
					} else {
						
						//사원 로그인
						JOptionPane.showMessageDialog(null, "사원 로그인 성공");
						token = 0;
						
						main.mainPosView(main, token);
					}
				}
			} catch (Exception e1) {
				System.out.println("사원 로그인 실패" + e1.getMessage());
			}

		} catch (Exception e) {
			System.out.println("로그인 실패" + e.getMessage());
			e.printStackTrace();
		}
		// 2. Model의 로그인 메소드 login() 호출
		// 3. 2번의 넘겨받은 값을 토대로 로그인 실행

		
	}

	public void setMain(StudyRoomViewMain main) {
		this.main = main;
	}

	public StudyroomPos() {

		setSize(800, 600);
		setResizable(false);

		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel_Main1 = new JPanel();
		panel_Main1.setBackground(SystemColor.activeCaption);
		getContentPane().add(panel_Main1, BorderLayout.NORTH);
		GridBagLayout gbl_panel_Main1 = new GridBagLayout();
		gbl_panel_Main1.columnWidths = new int[] { 791, 0 };
		gbl_panel_Main1.rowHeights = new int[] { 0, 0, 97, 0 };
		gbl_panel_Main1.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_panel_Main1.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_Main1.setLayout(gbl_panel_Main1);

		JLabel lblLogin = new JLabel("멀티 StudyRoom");
		lblLogin.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		GridBagConstraints gbc_lblLogin = new GridBagConstraints();
		gbc_lblLogin.insets = new Insets(0, 0, 5, 0);
		gbc_lblLogin.gridx = 0;
		gbc_lblLogin.gridy = 1;
		panel_Main1.add(lblLogin, gbc_lblLogin);

		JLabel lblInfo = new JLabel("로그인 아이디와 비밀번호를 입력해 주세요.");
		lblInfo.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		GridBagConstraints gbc_lblInfo = new GridBagConstraints();
		gbc_lblInfo.anchor = GridBagConstraints.SOUTH;
		gbc_lblInfo.gridx = 0;
		gbc_lblInfo.gridy = 2;
		panel_Main1.add(lblInfo, gbc_lblInfo);

		JPanel panel_Main2 = new JPanel();
		panel_Main2.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(panel_Main2, BorderLayout.CENTER);
		GridBagLayout gbl_panel_Main2 = new GridBagLayout();
		gbl_panel_Main2.columnWidths = new int[] { 180, 112, 85, 62, 115, 98, 92, 244, 0 };
		gbl_panel_Main2.rowHeights = new int[] { 0, 0, 21, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_Main2.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_Main2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panel_Main2.setLayout(gbl_panel_Main2);

		JLabel lblId = new JLabel("아이디");
		lblId.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 3;
		gbc_lblId.gridy = 4;
		panel_Main2.add(lblId, gbc_lblId);

		tfId = new JTextField();
		GridBagConstraints gbc_tfId = new GridBagConstraints();
		gbc_tfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfId.insets = new Insets(0, 0, 5, 5);
		gbc_tfId.gridx = 4;
		gbc_tfId.gridy = 4;
		panel_Main2.add(tfId, gbc_tfId);
		tfId.setColumns(10);

		JLabel lblPass = new JLabel("비밀번호");
		lblPass.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		GridBagConstraints gbc_lblPass = new GridBagConstraints();
		gbc_lblPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPass.insets = new Insets(0, 0, 5, 5);
		gbc_lblPass.gridx = 3;
		gbc_lblPass.gridy = 5;
		panel_Main2.add(lblPass, gbc_lblPass);

		tfPass = new JPasswordField();
		GridBagConstraints gbc_tfPass = new GridBagConstraints();
		gbc_tfPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPass.insets = new Insets(0, 0, 5, 5);
		gbc_tfPass.gridx = 4;
		gbc_tfPass.gridy = 5;
		panel_Main2.add(tfPass, gbc_tfPass);
		tfPass.setColumns(10);

		// 로그인 버튼 액션
		JButton btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Object evt = e.getSource();
				// 로그인 버튼 클릭시
				if (evt == btnLogin) {
					login();
				}
			}
		});

		btnLogin.setBackground(Color.LIGHT_GRAY);
		btnLogin.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogin.gridx = 5;
		gbc_btnLogin.gridy = 5;
		panel_Main2.add(btnLogin, gbc_btnLogin);

		// 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// DB접속
		connectDB();

	}
}
