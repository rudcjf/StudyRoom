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

public class ReservationView extends JFrame {
	private JTextField tfStartTime;
	private JTextField tfEndTime;
	public ReservationView () {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {350, 50, 290, 0};
		gridBagLayout.rowHeights = new int[]{432, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel panel_Main1 = new JPanel();
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
		panel_Main1.add(panel_btnStudyroom, BorderLayout.CENTER);
		panel_btnStudyroom.setLayout(new GridLayout(4, 4, 10, 10));
		
		JButton btn101 = new JButton("101 호");
		panel_btnStudyroom.add(btn101);
		
		JButton btn102 = new JButton("102 호");
		panel_btnStudyroom.add(btn102);
		
		JButton btn103 = new JButton("103 호");
		panel_btnStudyroom.add(btn103);
		
		JButton btn105 = new JButton("104 호");
		panel_btnStudyroom.add(btn105);
		
		JButton btn201 = new JButton("201 호");
		panel_btnStudyroom.add(btn201);
		
		JButton btn202 = new JButton("202 호");
		panel_btnStudyroom.add(btn202);
		
		JButton btn203 = new JButton("203 호");
		panel_btnStudyroom.add(btn203);
		
		JButton btn204 = new JButton("204 호");
		panel_btnStudyroom.add(btn204);
		
		JButton btn301 = new JButton("301 호");
		panel_btnStudyroom.add(btn301);
		
		JButton btn302 = new JButton("302 호");
		panel_btnStudyroom.add(btn302);
		
		JButton btn303 = new JButton("303 호");
		panel_btnStudyroom.add(btn303);
		
		JButton btn304 = new JButton("304 호");
		panel_btnStudyroom.add(btn304);
		
		JButton btn401 = new JButton("401 호");
		panel_btnStudyroom.add(btn401);
		
		JButton btn402 = new JButton("402 호");
		panel_btnStudyroom.add(btn402);
		
		JButton btn403 = new JButton("403 호");
		panel_btnStudyroom.add(btn403);
		
		JButton btn404 = new JButton("404 호");
		panel_btnStudyroom.add(btn404);
		
		JPanel panel_Bottom = new JPanel();
		panel_Main1.add(panel_Bottom, BorderLayout.SOUTH);
		panel_Bottom.setLayout(new BorderLayout(0, 0));
		
		JLabel lbBottom = new JLabel(" ");
		lbBottom.setFont(new Font("굴림", Font.PLAIN, 24));
		panel_Bottom.add(lbBottom, BorderLayout.NORTH);
		
		JPanel panel_Main2 = new JPanel();
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
		panel_Main2.add(panel_Center, BorderLayout.CENTER);
		panel_Center.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Option = new JPanel();
		panel_Center.add(panel_Option, BorderLayout.NORTH);
		panel_Option.setLayout(new BorderLayout(10, 10));
		
		JPanel panel_Date = new JPanel();
		panel_Option.add(panel_Date, BorderLayout.NORTH);
		
		JLabel lbDate = new JLabel("날        짜");
		lbDate.setHorizontalAlignment(SwingConstants.LEFT);
		panel_Date.add(lbDate);
		
		JTextField tfDate = new JTextField();
		panel_Date.add(tfDate);
		tfDate.setColumns(10);
		
		JPanel panel_StartTime = new JPanel();
		panel_Option.add(panel_StartTime, BorderLayout.CENTER);
		
		JLabel lbStartTime = new JLabel("시작  시간");
		lbStartTime.setHorizontalAlignment(SwingConstants.LEFT);
		panel_StartTime.add(lbStartTime);
		
		tfStartTime = new JTextField();
		tfStartTime.setColumns(10);
		panel_StartTime.add(tfStartTime);
		
		JPanel panel_EndTime = new JPanel();
		panel_Option.add(panel_EndTime, BorderLayout.SOUTH);
		
		JLabel lbEndTime = new JLabel("종료  시간");
		lbEndTime.setHorizontalAlignment(SwingConstants.LEFT);
		panel_EndTime.add(lbEndTime);
		
		tfEndTime = new JTextField();
		tfEndTime.setColumns(10);
		panel_EndTime.add(tfEndTime);
		
		JPanel panel_btnReservation = new JPanel();
		panel_Main2.add(panel_btnReservation, BorderLayout.SOUTH);
		panel_btnReservation.setLayout(new BorderLayout(0, 0));
		
		JButton btnReservation = new JButton("확인");
		panel_btnReservation.add(btnReservation, BorderLayout.WEST);
		
		JButton btnClear = new JButton("취소");
		panel_btnReservation.add(btnClear, BorderLayout.EAST);
	}

}
