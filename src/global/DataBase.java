package global;

import java.sql.Connection;

/**
 * @date   :2016. 7. 1.
 * @author :최경욱
 * @file   :DataBase.java
 * @story  :
*/
import java.sql.DriverManager;

public class DataBase {
	private Connection con;
	private String driver,url,id,pw;
	
	public DataBase(String driver,String url,String id,String pw) {
		this.driver = driver;
		this.url = url;
		this.id = id;
		this.pw = pw;
	}
	public Connection getConnection(){
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,id,pw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
