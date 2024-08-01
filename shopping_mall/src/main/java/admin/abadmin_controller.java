package admin;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class abadmin_controller{

	@Resource(name="dao")
	private abad_dao dao;
	
	@Resource(name="abmodule")
	private abad_module am;
	
	PrintWriter pw= null;
	
	
	//리턴메소드에 스크립트 절대 사용 X
	@GetMapping("/admin/admin_master_list.do")
	public String admin_list(Model m,HttpServletResponse res) throws Exception{
		res.setContentType("text/html;charset=utf-8");
		this.pw=res.getWriter();
		try {
			List<abad_dao> adin_data = am.adin_data();
			m.addAttribute("adin_data",adin_data);
		}catch(Exception e){
			this.pw.print("<script>"
					+ "alert('데이터 에러가 나서 정보를 불러오지 못합니다.');"
					+ "</script>");
			this.pw.close();	
		}
		return "admin_master_list";
	}
	
	
	@PostMapping("/admin/admin_main.do")
	public String adminloginok(String adid,String adpw,HttpSession se,HttpServletResponse res,String adYN) throws Exception{
		res.setContentType("text/html;charset=utf-8");
		this.pw=res.getWriter();
		ArrayList<String> mre=null;
		try {
			if(adid.equals("")&&adpw.equals("")&&adYN.equals("")) {
			mre=am.abad_loginck(adid, adpw, dao);
			}
			else if(adid.equals("master") && adpw.equals("shop_master123")){
			//se.setAttribute("adname",dao.getAdname());
			this.pw.print("<script>"
					+ "alert('최고관리자로 로그인하였습니다.');"
					//+ "location.href='/admin/admin_main.do';"
					+ "location.href='/admin/admin_master_list.do';"
					+ "</script>");
		}
		else if(dao.getAdYN().equals("Y")){
			//se.setAttribute("adname", dao.getAdname());
			this.pw.print("<script>"
					+ "alert('로그인하였습니다.');"
					//+ "location.href='/admin/admin_main.do';"
					+ "location.href='/admin/admin_master_list.do';"
					+ "</script>");
		}
		else {
			this.pw.print("<script>"
					+ "alert('등록된 아이디 또는 비밀번호가 아닙니다.');"
					+ "history.go(-1);"
					+ "</script>");
			System.out.println(dao.getAdYN());
			

		}
		
		}catch(Exception e) {
		this.pw.print("<script>"
					+ "alert('Database문제로 인하여 해당 정보가 확인 되지 않습니다.');"
					+ "history.go(-1);"
					+ "</script>");
		System.out.println(e);
		}
		this.pw.close();

		
		return null;
	}
	
	
	@PostMapping("/admin/admin_insert.do")
	public String admin_insert(HttpServletResponse res,String adpw) throws Exception {
		res.setContentType("text/html;charset=utf-8");
		this.pw= res.getWriter();
		try {
			int abin_result= am.abad_insert(dao,adpw);
			if(abin_result > 0) {
				this.pw.print("<script>"
						+ "alert('정상적으로 등록 완료 되었습니다.');"
						+ "location.href='./admin_index.do';"
						+ "</script>");
			}
		}catch(Exception e) {
			this.pw.print("<script>"
					+ "alert('DB 오류로 인하여 등록되지 않았습니다.');"
					+ "history.go(-1);"
					+ "</script>");
		}
		this.pw.close();
		return null;
	}
	
	//로그아웃
	@GetMapping("/admin/logout.do")
	public String logout(HttpSession se) {
		se.invalidate();
		return "logout";
	}
	
	//메인페이지
	@GetMapping("/admin/index.do")
	public String index(){
	return "index";
	}
}
