package global;

/**
 * @date   :2016. 7. 5.
 * @author :최경욱
 * @file   :DatabaseFactory.java
 * @story  :
*/
public class DatabaseFactory {
	public static DataBase createDatabase(Vendor vendor,String id,String pw){
		String driver="",url="";
		switch (vendor) {
		case ORACLE:
			driver = Constants.ORACLE_DRIVER;
			url = Constants.ORACLE_URL;
			break;
		
		default:
			break;
		}
		return new DataBase(driver,url,id,pw);
	}
}