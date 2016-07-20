/**
 * 
 */
package member;

import java.util.List;
import java.util.Map;

import bank.AccountService;
import bank.AccountServiceImpl;

public class MemberServiceImpl implements MemberService{
	
	MemberDAO dao = MemberDAO.getInstance();
	AccountService accService = AccountServiceImpl.getInstance();
	MemberBean session;
	private static MemberServiceImpl instance = new MemberServiceImpl();
	
	public static MemberServiceImpl getInstance() {
		return instance;
	}

	
	private MemberServiceImpl() {
		session = new MemberBean();
	}
	
	@Override
	public String regist(MemberBean mem) {
		String msg = "";
		
		int result = dao.insert(mem);
		if (result==1) {
			msg = "회원가입 축하합니다";
		} else {
			msg = "회원가입 실패";
		}
		return msg;
	}


	@Override
	public void update(MemberBean mem) {
	
	}
	@Override
	public MemberBean show() {
		// 2보기
		return session;
	}
	
	
	@Override
	public void delete(MemberBean mem) {
		dao.delete(mem);
		session = dao.findById(mem.getId());
	}
	
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return dao.count();
	}


	@Override
	public MemberBean findById(String findID) {
		return dao.findById(findID);
	}





	

	@Override
	public Map<?, ?> map() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String login(MemberBean member) {
		// 2.로그인
		String result = "";
			if (dao.login(member)) {
				session = dao.findById(member.getId());
				result = session.getName();
				accService.map();
			}else{
				result = "";
			}
		
		return result;
	}


	@Override
	public java.util.List<?> List() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public java.util.List<?> findByName(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void logout(MemberBean member) {
		if (member.getId().equals(session.getId())) {
			this.session = null;
		}
		
	}
}