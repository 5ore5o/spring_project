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
	public ArrayList<String> abad_loginck(String adid,String adpw,String adYN,abad_dao abdao) {
		if(abdao.getAdYN()==null||adYN==null) {
			System.out.println(abdao.getAdYN());
			System.out.println(adYN);
		}
		
		String sh1_passwd=this.sh1_making(adpw);
		
		ArrayList<String> onelogindata= new ArrayList<String>();
		Map<String, String> keycode= new HashMap<String, String>();
		keycode.put("part", "1");
		keycode.put("adid", adid);
		keycode.put("adpw", sh1_passwd);
		
		onelogindata= tm2.selectOne("abadminDB.adin_select",keycode);
		return onelogindata;
	}
	
	
	//id 중복체크
	public int ab_idck(String adid,abad_dao abdao) {
		Integer idck_result= tm2.selectOne("abadminDB.id_check",adid);
		if(abdao != null&& abdao.getAdid() !=null) {
			System.out.println(abdao.getAdid());
			return idck_result;
		}
		return 0;
	}
	
	//데이터 insert
	public int abad_insert(abad_dao abdao,String adpw) {	
		String sh1_passwd=this.sh1_making(adpw);
		abdao.setAdpw(sh1_passwd);
		
		int abin_result=tm2.insert("abadminDB.abad_in",abdao);
		return abin_result;
	}
	
}
