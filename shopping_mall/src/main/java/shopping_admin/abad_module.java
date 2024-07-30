package shopping_admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.reflection.ArrayUtil;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("abmodule") //모듈이름
public class abad_module {

	@Resource(name="template2")
	private SqlSessionTemplate tm2;
	
	//관리자 신청 게시물
	public List<abad_dao> adin_data(){
		List<abad_dao> adin= new ArrayList<abad_dao>();
		adin=tm2.selectList("abadmin.adin_select");
		return adin;
	}
	
	//로그인 확인
	public ArrayList<String> abad_loginck(String adid,String adpw,abad_dao dao) {
		ArrayList<String> abloginck= new ArrayList<String>();
		Map<String, String> keycode= new HashMap<String, String>();
		keycode.put("part", "1");
		keycode.put("adid", adid);
		keycode.put("adpw", adpw);
		keycode.put("adYN", dao.getAdYN());
		
		dao=tm2.selectOne("abadmin.adin_select",keycode);
		System.out.println(dao.getAdid());
		return abloginck;
	}
	
	//데이터 insert
	public int abad_insert(abad_dao dao) {	
		int abin_result=tm2.insert("abadmin.abad_in",dao);
		
		return abin_result;
	}
}
