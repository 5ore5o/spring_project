package admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.reflection.ArrayUtil;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("abmodule") //모듈이름
public class abad_module extends passwd_sh1{

	
	@Resource(name="template2")
	private SqlSessionTemplate tm2;
	
	//관리자 신청 게시물
	public List<abad_dao> adin_data(){
		List<abad_dao> adin= new ArrayList<abad_dao>();
		adin=tm2.selectList("abadmin.adin_select");
		return adin;
	}
	
	//로그인 확인
	public ArrayList<String> abad_loginck(String adid,String adpw,abad_dao abdao) {
		String sh1_passwd=this.sh1_making(adpw);
		
		ArrayList<String> ar= new ArrayList<String>();
		Map<String, String> keycode= new HashMap<String, String>();
		keycode.put("part", "1");
		keycode.put("adid", adid);
		keycode.put("adpw", sh1_passwd);
		keycode.put("adYN",abdao.getAdYN());
		
		ar=tm2.selectOne("abadminDB.adin_select",keycode);
		
		
		return ar;
	}
	
	//id 중복체크
	public String ab_idck(String adid,abad_dao abdao) {
		String adid_ck= tm2.selectOne("abadminDB.id_check",adid);
		if(abdao.getAdid()==adid) {
			System.out.println(adid_ck);
			return adid_ck;
		}
		return null;
	}
	
	//데이터 insert
	public int abad_insert(abad_dao abdao,String adpw) {	
		String sh1_passwd=this.sh1_making(adpw);
		abdao.setAdpw(sh1_passwd);
		
		int abin_result=tm2.insert("abadminDB.abad_in",abdao);
		return abin_result;
	}
	
}
