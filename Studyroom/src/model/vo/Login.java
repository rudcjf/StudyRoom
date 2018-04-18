package model.vo;

public class Login {
	int cusId;		// 고객아이디
	String cusPass;		// 고객비밀번호
	String empId;		// 직원아이디
	String empPass;		// 직원비밀번호
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
