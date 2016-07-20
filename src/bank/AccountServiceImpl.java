package bank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import member.MemberBean;

/**
 * @date   :2016. 7. 7.
 * @author :최경욱
 * @file   :AccountServiceImpl.java
 * @story  :
*/
public class AccountServiceImpl implements AccountService{
	AccountDAO dao = AccountDAO.getInstance();
	Map<?,?> map = new HashMap<String, AccountMemberBean>();
	private static AccountServiceImpl instance = new AccountServiceImpl();
	
	public static AccountServiceImpl getInstance() {
		return instance;
	}
	private AccountServiceImpl() {
		map = new HashMap<String,AccountMemberBean>();
	}
	@Override
	public String openAccount(String id) {
		AccountBean acc = new AccountBean();
		acc.setAccountNo(0);
		acc.setId(id);
		acc.setMoney(0);
		String msg = "";
		if (dao.insertAccount(acc)==1) {
			msg = "계좌생성 완료";
		} else {
			msg = "계좌생성 실패";
		}
		
		return msg;
	}

	@Override
	public void deposit(String depositInfo) {
		String[] arr = depositInfo.split(",");
		AccountBean acc = new AccountBean();
		acc.setAccountNo(Integer.parseInt(arr[0]));
		int money = this.restMoney(Integer.parseInt(arr[0])) 
				+ Integer.parseInt(arr[1]);
		acc.setMoney(money);
		dao.deposit(acc);
	}

	@Override
	public String withdraw(String withdrawInfo) {
		String result = "";
		String[] arr = withdrawInfo.split(",");
		AccountBean acc = new AccountBean();
		acc.setAccountNo(Integer.parseInt(arr[0]));
		int restMoney = this.restMoney(Integer.parseInt(arr[0]));
		int withdrawMoney = Integer.parseInt(arr[1]);
		if (restMoney < withdrawMoney) {
			result = "잔액이 부족합니다";
		} else {
			acc.setMoney(restMoney-withdrawMoney);
			dao.withdraw(acc);
			result = "잔액 : "+String.valueOf(this.restMoney(Integer.parseInt(arr[0])));
		}
		
		return result;
	}

	@Override
	public String updateAccount(AccountBean acc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<?> accountList() {
		List<?> list = dao.selectAll();
		return list;
	}

	@Override
	public AccountBean findByAccountNo(String accNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public java.util.List<?> List() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Map<?, ?> map() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int restMoney(int accNo) {
		// TODO Auto-generated method stub
		return 0;
	}
	/*public Map<?,?> map(){
		
	}
	@Override
	public int restMoney(int accNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Map<?,?> map(){
		map = new HashMap<String,AccountMemberBean>();
		map.dao.selectMap();
		return map;
	}
	public String  login(MemberBean member)
	
	String result = "";
	if (dao.login(member)) {
		result = "로그인 성공";
		session = dao.findById(member.getId());
	}else{
		result = "로그인 실패";
	}

	return result;
	}
	@Override
	public java.util.List<?> List() {
		// TODO Auto-generated method stub
		return null;
	}*/
}
