package ExamCreator;

public class User {
	private String fName;
	private String mName;
	private String lName;
	private String eMail;
	private String userName;
	private String password;
	private String phone;
	
	
	public User(String fn,String mn,String ln, String em, String uN,String pw, String phone){
		this.fName = fn;
		this.mName = mn;
		this.lName = ln;
		this.eMail = em;
		this.userName = uN;
		this.password = pw;
		this.phone = phone;
	}
	
	public String getfName() {
		return fName;
	}
	public String getmName() {
		return mName;
	}
	public String getlName() {
		return lName;
	}
	public String geteMail() {
		return eMail;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getPhone() {
		return phone;
	}
	
	
	
	
}
