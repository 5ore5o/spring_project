package com.abshop.www;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

//user table (select,insert,update,delete)
@Repository("userselect")
public class user_select {

	@Resource(name="template")
	private SqlSessionTemplate tm;
	
	public ArrayList<Object> search_id(String uname,String uemail) { //1명의 정보 (아이디 찾기),ArrayList<Object> 대신 String으로 해도 된다.
		
		ArrayList<Object> onedata = new ArrayList<Object>();
		Map<String, String> keycode= new HashMap<String, String>();
		keycode.put("part", "1");
		keycode.put("uname", uname);
		keycode.put("uemail", uemail);
		
		//값을 다 끌고 오기 때문에 dao사용
		user_dao dao= tm.selectOne("Shopping_mall.search",keycode);//데이터 1개만 들고오기 때문에 one이다.list아니다.
		System.out.println(dao.getUid());
		return onedata;
	}
}
