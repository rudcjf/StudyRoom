package view;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

import model.ReservationModel;

public class ReservationView extends JFrame implements ActionListener{
	ReservationModel model;
	
	private JTextField tfStartTime, tfDate;
	private JTextField tfEndTime;
	
	JButton[] btnArray = new JButton[16];
	JButton btn101, btn102, btn103, btn104, btn201, btn202, btn203, btn204; 	
	JButton btn301, btn302, btn303, btn304, btn401, btn402, btn403,  btn404, btnReservation;
	
	int[] thirtyM ={2,4,6,9,11};;

	int[] roomNum = new int[16];
	
	public void connectDB() {
	      try {
	         System.out.println("고객관리DB 연결 성공");
	      } catch (Exception ex) {
	         System.out.println("고객관리 연결 실패 : " + ex.getMessage());
	      }

	   }
	
	
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
		
		for( int i=0; i<btnArray.length;  i++){
			int j = i%4+1; 
			btnArray[i] = new JButton("10"+j +"호");
			btnArray[i].addActionListener(this);
			panel_btnStudyroom.add(btnArray[i]);
		}
		
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
		
		tfDate = new JTextField();
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
		/*tfEndTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 enterTime();
			}
		});*/
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
		
		btnReservation = new JButton("확인");
		btnReservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterTime();
			}
		});
		panel_btnReservation.add(btnReservation, BorderLayout.WEST);
		
		JButton btnClear = new JButton("취소");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btnReservation.add(btnClear, BorderLayout.EAST);
		
		
		disableBtn();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		connectReservationDB();
		
	}
	
	
	public void connectReservationDB() {
	      try {
	         model = new ReservationModel();
	         System.out.println("예약DB 연결 성공");
	      } catch (Exception ex) {
	         System.out.println("예약 연결 실패 : " + ex.getMessage());
	      }

	   }


	public void enterTime(){
		//enter를 수행시 btn들을 enable/disable
		String datePatern = "^[0-1][0-9]/[0-3][0-9]$";
		String startPatern ="^[0-2][0-9]:[0-6][0-9]$";
		String endPatern = "^[0-2][0-9]:[0-6][0-9]$";
		int checkCnt = 0;
		String failMsg = "";
		
		if(Pattern.matches(datePatern,tfDate.getText())){
			System.out.println("일치");
			//숫자크기비교해서 12월이 넘어가거나 없는 날짜가 들어오면 안됨
			if(Integer.parseInt(tfDate.getText().substring(0, 2)) > 12 || Integer.parseInt(tfDate.getText().substring(0, 2)) <1 ){
				failMsg+="날짜 오류.\n";
				failMsg +="존재하지 않는 '달' 을 입력하셨습니다.\n";
				if(Integer.parseInt(tfDate.getText().substring(3)) >31 || Integer.parseInt(tfDate.getText().substring(3)) <1 ){
					if(Integer.parseInt(tfDate.getText().substring(3,5))>31){
						failMsg+="존재하지 않는 '날짜'를 입력하셨습니다.\n";
					}else if(Integer.parseInt(tfDate.getText().substring(3,5))  == 31){
						for(int i = 0; i < thirtyM.length;i++){
							if(Integer.parseInt(tfDate.getText().substring(0,2))== thirtyM[i]){
								failMsg +="해당 달에 없는 날짜 입니다..\n";
							}
						}
					}else if(Integer.parseInt(tfDate.getText().substring(3,5)) > 28){
						if(Integer.parseInt(tfDate.getText().substring(0,2))== 2){
							failMsg +="해당 달에 없는 날짜 입니다..\n";
						}
					}
				}
			}else{
				checkCnt++;
			}
		}else{
			System.out.println("불일치");
			failMsg +=  "날짜 형식이 일치하지 않습니다.\n";
		}
		if(Pattern.matches(startPatern,tfStartTime.getText())){
			System.out.println("일치");
			//시간비교
			if(Integer.parseInt(tfStartTime.getText().substring(0, 2)) >23  ){
				failMsg +="시작시간 : 시간은 24를 넘을수 없습니다.\n";
				if(Integer.parseInt(tfStartTime.getText().substring(3)) >59 ){
					failMsg +="시작시간 : 분은 59를 넘을수 없습니다.\n";
				}
			}else{
				checkCnt++;
			}
		}else{
			System.out.println("불일치");
			failMsg +=  "시작 시간 형식이 일치하지 않습니다.\n";
		}
		if(Pattern.matches(endPatern,tfEndTime.getText())){
			System.out.println("일치");
			//숫자크기비교해서 12월이 넘어가거나 없는 날짜가 들어오면 안됨
			if(Integer.parseInt(tfEndTime.getText().substring(0, 2)) >23  ){
				failMsg +="종료시간 : 시간은 24를 넘을수 없습니다.\n";
				if(Integer.parseInt(tfEndTime.getText().substring(3)) >59 ){
					failMsg +="종료 시간 : 분은 59를 넘을수 없습니다.\n";
				}
			}else{
				checkCnt++;
			}
		}else{
			System.out.println("불일치");
			failMsg +=  "종료 시간형식이 일치하지 않습니다.";
		}
		if(checkCnt <3){
			JOptionPane.showMessageDialog(null, failMsg);
			disableBtn();
		}else{
			//보내야하는 시간 정보 저장
			try {
				roomNum = model.emptyRoom(tfDate.getText(), tfStartTime.getText(), tfEndTime.getText());
			} catch (Exception e) {
				System.out.println("룸넘버 얻어오기 실패: " +e.getMessage());
			}
			enableBtn();//현재는 모든 버튼 enable
		}
		
		
	}
	
	public void actionPerformed(ActionEvent ev){
		Object evt = ev.getSource();
		for( int i=0; i<btnArray.length;  i++){
			if( evt == btnArray[i]) {			
					btnRoom(btnArray[i]);
				}
		}
	}
	
	public void disableBtn(){
		for(JButton data:btnArray ){
			data.setEnabled(false);
		}
	}
	public void enableBtn(){
		//disable이 필요한 부분과 하지 않아야 하는것 구분
		for(JButton data:btnArray ){
			data.setEnabled(true);
		}
	}
	
	public void btnRoom(JButton btn){
		//해당 버튼을 클릭시 joptionframe을 통하여 예약 할 내용을 보이게 한다. 확인을 통하여 결제 완료할수 있음
		if(tfDate.getText().equals("") || tfEndTime.getText().equals("")|| tfStartTime.getText().equals("") ){
			JOptionPane.showMessageDialog(null, "날짜와 시작시간, 종료시간을 모두 입력하여주세요");
		}else{
			String msg = "고객님께서 예약하신 내용은 "+btn.getName()+"몇시부터 몇시까지 입니다.\n '확인'버튼을 누르시면 예약내용을 확정합니다.";
			int i = JOptionPane.showConfirmDialog(null, msg, "예약 확정", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
			if(i==JOptionPane.OK_OPTION){
				//sql문장만들어서 예약 확정으로 db에 보내기
				tfDate.setText("");
				tfEndTime.setText("");
				tfStartTime.setText("");
				enterTime();
			}else if(i==JOptionPane.CANCEL_OPTION){
				//아무것도 터치할필요없음
			}
		}
	}
	
	//test용 코드 실행용
	static ReservationView frame;
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ReservationView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	
}
