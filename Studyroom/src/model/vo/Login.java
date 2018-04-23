package model.vo;

public class Login {
	int cusId;		// 고객아이디
	String cusPass;		// 고객비밀번호
	String empId;		// 직원아이디
	String empPass;		// 직원비밀번호
	
	String c_name;		// 고객명
	String c_tel;	;	//전화번호
	String c_adr;		// 주소
	String c_mail;		// 이메일
	
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_tel() {
		return c_tel;
	}
	public void setC_tel(String c_tel) {
		this.c_tel = c_tel;
	}
	public String getC_adr() {
		return c_adr;
	}
	public void setC_adr(String c_adr) {
		this.c_adr = c_adr;
	}
	public String getC_mail() {
		return c_mail;
	}
	public void setC_mail(String c_mail) {
		this.c_mail = c_mail;
	}
	public Login() {
		super();
		
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusPass() {
		return cusPass;
	}
	public void setCusPass(String cusPass) {
		this.cusPass = cusPass;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpPass() {
		return empPass;
	}
	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}
	
	
}
