package package1;

public class User {
	private String uname;
	private long cno;
	private String status;
	private int pswd;
	public User(String uname, long cno, String status, int pswd) {
		super();
		this.uname = uname;
		this.cno = cno;
		this.status = status;
		this.pswd = pswd;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public long getCno() {
		return cno;
	}
	public void setCno(long cno) {
		this.cno = cno;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPswd() {
		return pswd;
	}
	public void setPswd(int pswd) {
		this.pswd = pswd;
	}
	
}
