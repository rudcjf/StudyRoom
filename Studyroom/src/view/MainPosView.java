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
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPosView extends JFrame {
	private JTextField tfMenu;
	private JTextField tfMainChat;
	public MainPosView() {
		setSize(800,600);
		setResizable(false);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {310, 90, 290, 0};
		gridBagLayout.rowHeights = new int[]{553, 0, 0};
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
		
		JButton btnAme = new JButton("아메리카노");
		btnAme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_Menu.add(btnAme);
		
		JButton btnUAme = new JButton("유자아메");
		btnUAme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_Menu.add(btnUAme);
		
		JButton btnCidir = new JButton("사이다");
		btnCidir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_Menu.add(btnCidir);
		
		JButton btnCoke = new JButton("콜라");
		btnCoke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_Menu.add(btnCoke);
		
		JButton btnOrg = new JButton("오렌지쥬스");
		btnOrg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_Menu.add(btnOrg);
		
		JButton btnBerry = new JButton("딸기스무디");
		btnBerry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_Menu.add(btnBerry);
		
		JButton btnMang = new JButton("망고쥬스");
		btnMang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_Menu.add(btnMang);
		
		JPanel panel_MenuJumun = new JPanel();
		panel_Main1.add(panel_MenuJumun, BorderLayout.SOUTH);
		panel_MenuJumun.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_MenuWest = new JPanel();
		panel_MenuWest.setBackground(Color.LIGHT_GRAY);
		panel_MenuJumun.add(panel_MenuWest, BorderLayout.WEST);
		
		tfMenu = new JTextField();
		tfMenu.setFont(new Font("굴림", Font.PLAIN, 16));
		panel_MenuJumun.add(tfMenu, BorderLayout.CENTER);
		tfMenu.setColumns(10);
		
		JPanel panel_JumumBtn = new JPanel();
		panel_MenuJumun.add(panel_JumumBtn, BorderLayout.EAST);
		panel_JumumBtn.setLayout(new BorderLayout(0, 0));
		
		JButton btnJumun = new JButton("주문");
		btnJumun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_JumumBtn.add(btnJumun, BorderLayout.NORTH);
		
		JButton btnJumunClr = new JButton("취소");
		btnJumunClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
			}
		});
		panel_MainChat.add(tfMainChat, BorderLayout.SOUTH);
		tfMainChat.setColumns(10);
		
		JPanel panel_btn = new JPanel();
		panel_btn.setBackground(Color.LIGHT_GRAY);
		panel_Main2.add(panel_btn, BorderLayout.SOUTH);
		panel_btn.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnCustoemr = new JButton("회원관리");
		btnCustoemr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btn.add(btnCustoemr);
		
		JButton btnReservation = new JButton("예    약");
		btnReservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btn.add(btnReservation);
		
		JButton btnOrder = new JButton("결    제");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btn.add(btnOrder);
	}

}
