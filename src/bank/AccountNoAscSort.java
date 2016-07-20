package bank;

import java.util.Comparator;

/**
 * @date   :2016. 7. 8.
 * @author :최경욱
 * @file   :NameAscSort.java
 * @story  :
*/
public class AccountNoAscSort implements Comparator<AccountMemberBean>{

	@Override
	public int compare(AccountMemberBean first,AccountMemberBean second){
			
		int a = 0;
		if (first.getAccountNo()>second.getAccountNo()) {
			a = -1;
			
		}else{
			if (first.getAccountNo()<second.getAccountNo()) {
				a = 1;
			}else{
				
			}
		}
		
		
		
		
		
		return first.getName().compareTo(second.getName());
	}

}
