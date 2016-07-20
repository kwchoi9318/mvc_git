package global;

import java.util.List;
import java.util.Map;

/**
 * @date   :2016. 7. 8.
 * @author :최경욱
 * @file   :CommandService.java
 * @story  :
*/
public interface CommonService {
	public List<?> List();
	public List<?> findByName(String keyword);
	public int count();
	public Map<?,?>map();
}