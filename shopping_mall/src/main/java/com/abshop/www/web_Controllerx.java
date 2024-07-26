package com.abshop.www;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.Joinable;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class web_Controllerx {
	
	PrintWriter pw =null;
	//@CrossOrigin(origins = "*",allowedHeaders = "*")
	@PostMapping("/ajaxok3.do")
	public String ajaxok3(@RequestBody String arr,HttpServletResponse res) throws Exception {
		
		JSONArray ja=new JSONArray(arr);
		
		JSONArray ja1=(JSONArray)ja.get(0);
		JSONArray ja2=(JSONArray)ja.get(1);
		
		System.out.println(ja1.get(0));
		System.out.println(ja2);
		JSONObject result = new JSONObject();
		result.put("result", "ok");
		this.pw = res.getWriter();
		this.pw.print(result);
		return null;
	}
	
	//http://abc, http://www.abc 이런식으로 아무렇게나 접속할 수 있기때문에 크로스오리진쓴다.
	//@RequestBody : jSON.stringfy
	@CrossOrigin(origins = "*",allowedHeaders = "*")
	@PostMapping("/ajaxok2.do")//(value="/ajaxok2.do",consumes="application/json") 이거 안 먹힌다
	public String ajaxok2(@RequestBody String all_data,HttpServletResponse res)throws Exception {
		System.out.println(all_data);//{"all_data":[]}//{"all_data":["홍길동","김유신","이순신"]}이렇게 찍혀서 밖에서부터 풀어야된다. 데이터를 끄집어내야되니까.
		
		JSONObject jo = new JSONObject(all_data);//{}인식 시킨 후 key값으로 배열을 체크//그냥 json
		System.out.println(jo.get("all_data"));
		//[a,b,c] //new쓰면 [a,b,c]로 풀어놨던걸 다시 읽어서 못 풀은다. toString으로 써서 해도 된다.
		JSONArray ja = (JSONArray)jo.get("all_data");//그냥 json
		System.out.println(ja.get(0)); //데이터를 출력
		
		//Front가 dataType="json"=>JSON으로 생성하여 결과값을 회신
		JSONObject result = new JSONObject();
		result.put("result", "ok");
		this.pw = res.getWriter();
		this.pw.print(result);
		return null;
	
	}
	
	/*
	@RequestBody : GET/POST(X) JSON기반일 경우에만 사용한다.
	@ResponseBody : 미디어타입, 파라미터 타입 단, 인자값에 미선언함(ex. public @ResponseBody String ajaxok() 이렇게는 가능함)
	
	*/
	//ajax 통신 CORS 방식
	@CrossOrigin(origins="*",allowedHeaders = "*")
	
	
	//@RequestParam : 배열을 이용하여 대표키로 전달 또는 대표키 없이 보조키로 전달 될 경우 사용할 수 있음.
	@PostMapping("/ajaxok.do")//(value="/ajaxok.do",produces="application/json")//이게 중요한게 아니다. 이거 굳이 안 써도 된다.
	public String ajaxok(@RequestParam(value="all_data") List<String> alldata, //value값이 key이름이기때문에 프론트 data 대표키랑 맞춰야된다.
			HttpServletResponse res) throws Exception {
		System.out.println(alldata);
		System.out.println(alldata.get(0));
		this.pw=res.getWriter();
		JSONObject jo= new JSONObject(); //simple
		jo.put("result", "ok");
		this.pw.print(jo);
		this.pw.close();
		
		return null;
	}
	
}
