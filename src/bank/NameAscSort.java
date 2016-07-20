package bank;

import java.util.Comparator;

/**
 * @date   :2016. 7. 8.
 * @author :최경욱
 * @file   :NameAscSort.java
 * @story  :
*/
public class NameAscSort implements Comparator<AccountMemberBean>{

	@Override
	public int compare(AccountMemberBean first, AccountMemberBean second) {
		// TODO Auto-generated method stub
		return first.getName().compareTo(second.getName());
	}

}
