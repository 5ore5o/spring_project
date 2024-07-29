package shopping_admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("abadselect")
public class abad_select {

	@Resource(name="template2")
	private SqlSessionTemplate tm2;
	
	public ArrayList<Object> bestadmin(String adid,String adpw){
		ArrayList<Object> bestadmin = new ArrayList<Object>();
		Map<String, String> keycode= new HashMap<String, String>();
		keycode.put("master", adid);
		keycode.put("shop_master123", adpw);

		
		return null;
	}
	
}
