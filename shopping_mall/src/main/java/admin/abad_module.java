package admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.reflection.ArrayUtil;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("abmodule") //모듈이름
public class abad_module extends passwd_sh{

	
	@Resource(name="template2")
	private SqlSessionTemplate tm2;
	
	//카테고리 리스트 view
	public List<adcate_dao> cate_liview(){
		List<adcate_dao> cateliview= new ArrayList<adcate_dao>();
		cateliview=tm2.selectList("abadminDB.cate_listview");
		return cateliview;
	}
	
	//관리자 승인,해제
	public int adYN_up(int adidx){	
		
		Map<Object, Object> keycode= new HashMap<Object, Object>();
		keycode.put("part", "2");
		keycode.put("adidx", adidx);
	
		abad_dao abdao=tm2.selectOne("abadminDB.adin_select",keycode);
		if(abdao.getAdYN().equals("승인")) {
			abdao.setAdYN("미승인");
		}else if(abdao.getAdYN().equals("미승인")) {
			abdao.setAdYN("승인");
		}else {
			return 0;
		}
		 return tm2.update("abadminDB.adYN_update", abdao);
	}
	
	//관리자 신청 게시물
	public List<abad_dao> adin_data(){
		List<abad_dao> adin= new ArrayList<abad_dao>();
		adin=tm2.selectList("abadminDB.adli_select");
		return adin;
	}
	
	//로그인 확인
	public abad_dao abad_loginck(String adid,String adpw,HttpSession se) {
		String sh2_passwd=this.sh2_making(adpw);
		
		Map<String, String> keycode= new HashMap<String, String>();
		keycode.put("part", "1");
		keycode.put("adid", adid);
		keycode.put("adpw", sh2_passwd);
		
		abad_dao abdao= tm2.selectOne("abadminDB.adin_select",keycode);
		if(abdao!=null&&adid.equals(abdao.getAdid())&&sh2_passwd.equals(abdao.getAdpw())) {
			se.setAttribute("adname", abdao.getAdname());
			se.setAttribute("adid", abdao.getAdid());
			se.setAttribute("adYN", abdao.getAdYN());	
			
			return abdao;
		}
		return null;
	}
	
	
	//id 중복체크
	public int ab_idck(String adid,abad_dao abdao) {
		Integer idck_result= tm2.selectOne("abadminDB.id_check",adid);
		if(abdao != null&& abdao.getAdid() !=null) {
			return idck_result;
		}
		return 0;
	}
	
	//카테고리 등록 페이지
		public int catewr_in(adcate_dao catedao,String cacode,String lname) {
			int catewrin=tm2.insert("abadminDB.cawr_in",catedao);
			if(catewrin>0) {
			if(!catedao.getCacode().equals(cacode) && !catedao.getLname().equals(lname)) {
				return catewrin;
			}
			return catewrin; 
			}
			return 0;
	}
	
	//쇼핑몰 설정 저장
	public int homein(adset_dao adsetdao) {
		int homeset_result=tm2.insert("abadminDB.home_in",adsetdao);
		return homeset_result;
	}
	//데이터 insert
	public int abad_insert(abad_dao abdao,String adpw) {	
		String sh2_passwd=this.sh2_making(adpw);
		abdao.setAdpw(sh2_passwd);
		
		int abin_result=tm2.insert("abadminDB.abad_in",abdao);
		return abin_result;
	}
	
}
