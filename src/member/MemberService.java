/**
 * 
 */
package member;

import java.util.List;

import global.CommonService;

/**
 * @date   :2016. 6. 17. 
 * @author :pakjkwan@gmail.com
 * @file   :StudentService.java
 * @story  :
*/
public interface MemberService extends CommonService{
	public String regist(MemberBean mem);
	public MemberBean findById(String findID);
	public void update(MemberBean stu2);
	public void delete(MemberBean bean);
	public String login(MemberBean member);
	public void logout(MemberBean member);
	public MemberBean show();
	
}