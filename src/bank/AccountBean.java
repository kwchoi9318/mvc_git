/**
* 
*/
package bank;

import java.util.Random;

import javax.swing.JOptionPane;

import global.Constants;

/**
 * @date :2016. 6. 16.
 * @author : 최경욱
 * @file :Account.java
 * @story :
 */
public class AccountBean {
	private int accountNo, money; // 인스턴스 변수는 초기화를 하지 않는다
		private String pw, id,name;
		
		
		
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
		public String getPw() {
			return pw;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
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
		public String setBirth(String string) {
			// TODO Auto-generated method stub
			return null;
		}

	
	
	
}