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
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import main.StudyRoomViewMain;

public class MainPosView extends JFrame {

	private JTextField tfMainChat;
	private JTextArea taMenu;

	StudyRoomViewMain main;

	JButton btnAme, btnUAme, btnCidir, btnCoke, btnOrg, btnBerry, btnMang, btnJumun, btnJumunClr, btnCustoemr,
			btnReservation, btnOrder;
	int[][] btnArry = new int[7][2];

	String[] btnName = { "아메리카노", "유자아메리카노", "사이다", "콜라", "오렌지", "딸기스무디", "망고 쥬스" };
	int[] btnPrice = { 2000, 3000, 1000, 1000, 2500, 3500, 4000 };
	int cnt = 0, total = 0;
	int token;

	// index 배열 초기화
	void init() {
		for (int i = 0; i < btnArry.length; i++) {
			btnArry[i][0] = i;
			btnArry[i][1] = 0;
		}
	}

	public void setMain(StudyRoomViewMain main) {
		this.main = main;
	}

	public void setToken(int token) {
		this.token = token;
	}
	

	public int getToken() {
		return token;
	}

	public MainPosView() {
		setSize(800, 600);
		setResizable(false);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 310, 90, 290, 0 };
		gridBagLayout.rowHeights = new int[] { 553, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
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

		JLabel lbMainPos = new JLabel("메인 포스");
		lbMainPos.setFont(new Font("굴림", Font.BOLD, 27));
		lbMainPos.setHorizontalAlignment(SwingConstants.CENTER);
		panel_Main1.add(lbMainPos, BorderLayout.NORTH);

		JPanel panel_MainWest = new JPanel();
		panel_MainWest.setBackground(Color.LIGHT_GRAY);
		panel_Main1.add(panel_MainWest, BorderLayout.WEST);

		JPanel panel_Menu = new JPanel();
		panel_Menu.setBackground(Color.GRAY);
		panel_Main1.add(panel_Menu, BorderLayout.CENTER);
		panel_Menu.setLayout(new GridLayout(3, 3, 10, 10));

		btnAme = new JButton("아메리카노");
		btnAme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuBtn(btnAme);
			}
		});
		panel_Menu.add(btnAme);

		btnUAme = new JButton("유자아메");
		btnUAme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuBtn(btnUAme);
			}
		});
		panel_Menu.add(btnUAme);

		btnCidir = new JButton("사이다");
		btnCidir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuBtn(btnCidir);
			}
		});
		panel_Menu.add(btnCidir);

		btnCoke = new JButton("콜라");
		btnCoke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuBtn(btnCoke);
			}
		});
		panel_Menu.add(btnCoke);

		btnOrg = new JButton("오렌지쥬스");
		btnOrg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuBtn(btnOrg);
			}
		});
		panel_Menu.add(btnOrg);

		btnBerry = new JButton("딸기스무디");
		btnBerry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuBtn(btnBerry);
			}
		});
		panel_Menu.add(btnBerry);

		btnMang = new JButton("망고쥬스");
		btnMang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuBtn(btnMang);
			}
		});
		panel_Menu.add(btnMang);

		JPanel panel_MenuJumun = new JPanel();
		panel_Main1.add(panel_MenuJumun, BorderLayout.SOUTH);
		panel_MenuJumun.setLayout(new BorderLayout(0, 0));

		JPanel panel_MenuWest = new JPanel();
		panel_MenuWest.setBackground(Color.LIGHT_GRAY);
		panel_MenuJumun.add(panel_MenuWest, BorderLayout.WEST);

		taMenu = new JTextArea();
		panel_MenuJumun.add(taMenu, BorderLayout.CENTER);

		JPanel panel_JumumBtn = new JPanel();
		panel_MenuJumun.add(panel_JumumBtn, BorderLayout.EAST);
		panel_JumumBtn.setLayout(new BorderLayout(0, 0));

		btnJumun = new JButton("주문");
		btnJumun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuBtn(btnJumun);
			}
		});
		panel_JumumBtn.add(btnJumun, BorderLayout.NORTH);

		btnJumunClr = new JButton("취소");
		btnJumunClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuBtn(btnJumunClr);
			}
		});
		panel_JumumBtn.add(btnJumunClr, BorderLayout.SOUTH);

		JPanel panel_Main2 = new JPanel();
		panel_Main2.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panel_Main2 = new GridBagConstraints();
		gbc_panel_Main2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_Main2.fill = GridBagConstraints.BOTH;
		gbc_panel_Main2.gridx = 2;
		gbc_panel_Main2.gridy = 0;
		getContentPane().add(panel_Main2, gbc_panel_Main2);
		panel_Main2.setLayout(new BorderLayout(0, 9));

		JLabel lbTop = new JLabel(" ");
		lbTop.setHorizontalAlignment(SwingConstants.CENTER);
		lbTop.setFont(new Font("굴림", Font.BOLD, 27));
		panel_Main2.add(lbTop, BorderLayout.NORTH);

		JPanel panel_MainEast = new JPanel();
		panel_MainEast.setBackground(Color.LIGHT_GRAY);
		panel_Main2.add(panel_MainEast, BorderLayout.EAST);

		JPanel panel_MainChat = new JPanel();
		panel_MainChat.setBackground(Color.LIGHT_GRAY);
		panel_Main2.add(panel_MainChat, BorderLayout.CENTER);
		panel_MainChat.setLayout(new BorderLayout(0, 9));

		JTextArea taMainChat = new JTextArea();
		panel_MainChat.add(taMainChat, BorderLayout.CENTER);

		tfMainChat = new JTextField();
		tfMainChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chatEvt();
			}
		});
		panel_MainChat.add(tfMainChat, BorderLayout.SOUTH);
		tfMainChat.setColumns(10);

		JPanel panel_btn = new JPanel();
		panel_btn.setBackground(Color.LIGHT_GRAY);
		panel_Main2.add(panel_btn, BorderLayout.SOUTH);
		panel_btn.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		btnCustoemr = new JButton("회원관리");
		btnCustoemr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 회원관리화면 넘어가는 함수
				changeWindow(btnCustoemr);// 예시
			}
		});
		panel_btn.add(btnCustoemr);

		btnReservation = new JButton("예    약");
		btnReservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 예약 화면 넘어가는 함수
				changeWindow(btnReservation);
			}
		});
		panel_btn.add(btnReservation);

		btnOrder = new JButton("결    제");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 결제화면 넘어가는 함수
				changeWindow(btnOrder);
			}
		});
		panel_btn.add(btnOrder);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		menuShow();
	}

	public void changeWindow(JButton btn) {

		if (btn == btnCustoemr) {// 예시
			main.customerView(main);
		} else if (btn == btnReservation) {
			main.reservationView(main);
		} else if (btn == btnOrder) {
			main.orderView(main, token);
		}
	}

	public void chatEvt() {
		// 엔터를 쳤을때 채팅창으로 보냄 상대방 쪽으로도보냄
		// 프로토콜을 사용하던지 txt앞에 '/101' 과같은것을통해
		// 문자열 처리를 통한 해당 스터디룸으로 보낼수 있게

	}

	// event listener가 각각의 버튼등에 있으므로 해당 버튼을 눌렀을때 행할 evt메소드
	public void menuBtn(JButton btn) {
		if (btn == btnAme) {
			btnArry[0][1]++;
			menuShow();
		} else if (btn == btnUAme) {
			btnArry[1][1]++;
			menuShow();
		} else if (btn == btnCidir) {
			btnArry[2][1]++;
			menuShow();
		} else if (btn == btnCoke) {
			btnArry[3][1]++;
			menuShow();
		} else if (btn == btnOrg) {
			btnArry[4][1]++;
			menuShow();
		} else if (btn == btnBerry) {
			btnArry[5][1]++;
			menuShow();
		} else if (btn == btnMang) {
			btnArry[6][1]++;
			menuShow();
		} else if (btn == btnJumun) {
			// 채팅창과 DB 와 연동되어 주문목록 Text를 만들어 각각전송
			init();
			menuShow();
		} else if (btn == btnJumunClr) {
			init();
			menuShow();
		} else if (btn == btnCustoemr) {
			// 회원관리 화면으로 넘어가는 메소드
		} else if (btn == btnReservation) {
			// 예약화면으로 넘어가는 메소드
		} else if (btn == btnOrder) {
			// 결제화면으로 넘어가는메소드
		}
	}

	// textarea에 보여줄 text생성및 출력 --기존에 있던 배열에서 가져온다.
	public void menuShow() {
		taMenu.setText(null);
		int sum = 0;

		for (int i = 0; i < btnArry.length; i++) {
			if (btnArry[i][1] > 0) {
				if (cnt == 4) {
					taMenu.setText(taMenu.getText() + "\n");
				}
				taMenu.setText(taMenu.getText() + " " + btnName[btnArry[i][0]] + " : " + btnArry[i][1] + "개,");
				sum += btnArry[i][1] * btnPrice[btnArry[i][0]];
				cnt++;
			}
		}
		taMenu.setText(taMenu.getText() + "\n 총: " + sum + "원 ");
		total = sum;
		cnt = 0;

	}
	// public static void main(String[] args) {
	//
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// frame = new MainPosView();
	// frame.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	//
	// }

}
