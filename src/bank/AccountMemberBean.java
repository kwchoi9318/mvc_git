package bank;

/**
 * @date   :2016. 7. 8.
 * @author :최경욱
 * @file   :AccountMemberBean.java
 * @story  :
*/
public class AccountMemberBean {
	private int accountNo, money; // 인스턴스 변수는 초기화를 하지 않는다
	private String name, pw, id, regDate, gender, ssn, birth;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "계좌번호:" + accountNo + ", 잔액:" + money + "원 , 이름:" + name + ", ID:" + id
				+ ", 생년월일:" + birth + "]";
	}



}
