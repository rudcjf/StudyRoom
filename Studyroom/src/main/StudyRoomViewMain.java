package main;
import view.CustoemrView;
import view.OrderView;
import view.MainPosView;
import view.ReservationView;
import view.StudyroomView;



public class StudyRoomViewMain {
	
	CustoemrView customerView;
	OrderView orderView;
	MainPosView mainPosView;
	ReservationView reservationView;
	StudyroomView studyroomView;
	StudyroomPos studyroomPos;
	int token;
	
	//로그인 화면
	public static void main(String[] args) {
		StudyRoomViewMain main = new StudyRoomViewMain();
		main.studyroomPos = new StudyroomPos();
		main.studyroomPos.setMain(main);
		main.studyroomPos.setVisible(true);
	}
		

	
	
	//메인포스화면 출력
	public void mainPosView(StudyRoomViewMain main, int token){
		main.mainPosView = new MainPosView();
		main.mainPosView.setToken(token);
		main.mainPosView.setVisible(true);
		main.mainPosView.setMain(main);
		main.studyroomPos.setVisible(false);
		
	}
	
	
	//결제창 출력
	public void orderView(StudyRoomViewMain main, int token){
		main.orderView = new OrderView();
		main.orderView.setToken(token);
		orderView.disableButton(token);
		main.orderView.setVisible(true);
		main.orderView.setMain(main);
		main.mainPosView.setVisible(false);
		
	}
	//예약창 출력
	public void reservationView(StudyRoomViewMain main){
		main.reservationView = new ReservationView();
		main.reservationView.setVisible(true);
		main.reservationView.setMain(main);
		main.mainPosView.setVisible(false);
		
	}
	//회원관리 창 출력
	public void customerView(StudyRoomViewMain main){
		main.customerView = new CustoemrView();
		main.customerView.setVisible(true);
		main.customerView.setMain(main);
		main.mainPosView.setVisible(false);
		
	}
	public void studyRoomView(StudyRoomViewMain main){
		main.studyroomView = new StudyroomView();
		main.studyroomView.setVisible(true);
		main.studyroomView.setMain(main);
		main.studyroomPos.setVisible(false);
		
	}
	
	//주문창 취소 버튼
	public void orderViewCan(StudyRoomViewMain main){
		main.mainPosView = new MainPosView();
		main.mainPosView.setVisible(true);
		main.mainPosView.setMain(main);
		main.orderView.setVisible(false);
		
	}
	//회원관리 창 돌아가기 버튼
	public void customerViewCan(StudyRoomViewMain main){
		main.mainPosView = new MainPosView();
		main.mainPosView.setVisible(true);
		main.mainPosView.setMain(main);
		main.customerView.setVisible(false);
		
	}
	//예약창 취소 버튼
	public void reservationViewCan(StudyRoomViewMain main){
		main.mainPosView = new MainPosView();
		main.mainPosView.setVisible(true);
		main.mainPosView.setMain(main);
		main.reservationView.setVisible(false);
		
	}
}