package admin;

import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class abadmin_controller{
	

	@Resource(name="abmodule")
	private abad_module am;
	
	PrintWriter pw= null;
	
	@GetMapping("/admin/admin_siteinfo.do")
	public String sitein() {
		
		return "admin_siteinfo";
	}
	
	@PostMapping("/admin/YN_up.do")
	public String YN_up(HttpServletResponse res,abad_dao abdao,int adidx) throws Exception {
		res.setContentType("text/html;charset=utf-8");
		this.pw=res.getWriter();
		try {
			int adYNup=am.adYN_up(adidx);
			if(adYNup > 0) {
				this.pw.print("<script>"
						+ "alert('정상적으로 수정 되었습니다.');"
						+ "location.href='/admin/admin_list.do';"
						+ "</script>");
			}
			else {
				this.pw.print("<script>"
						+ "alert('데이터 오류때문에 수정되지 않았습니다');"
						+ "location.href='/admin/admin_list.do';"
						+ "</script>");
			}
		}catch(Exception e) {
				this.pw.print("<script>"
						+ "alert('DB오류로 인해 수정되지 않았습니다');"
						+ "location.href='/admin/admin_list.do';"
						+ "</script>");

		}
		this.pw.close();
		return null;
	}
	
	
	//리턴메소드에 스크립트 절대 사용 X
	@GetMapping("/admin/admin_list.do")
	public String admin_list(Model m,HttpServletResponse res,HttpServletRequest req,String adid) throws Exception{
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
		
		if(adid=="null"|| "master"!=(adid)) {
			System.out.println(adid);
			res.sendRedirect("./");
		}else {
		RequestDispatcher rd= req.getRequestDispatcher("/admin/admin_list.do");
		rd.forward(req, res);
		}
		return "admin_list";
	}
	
	@PostMapping("/admin/admin_main.do")
	public String adminloginok(String adid,String adpw,HttpSession se,HttpServletResponse res) throws Exception{
		res.setContentType("text/html;charset=utf-8");
		this.pw=res.getWriter();
		try {
			abad_dao abdao=am.abad_loginck(adid,adpw,se);
			if(abdao !=null) {
			if(adid.equals("master") && adpw.equals("shop_master123")){

				this.pw.print("<script>"
					+ "alert('최고관리자로 로그인하였습니다.');"
					//+ "location.href='/admin/admin_main.do';"
					+ "location.href='/admin/admin_list.do';"
					+ "</script>");
		}else{

			this.pw.print("<script>"
					+ "alert('로그인하였습니다.');"
					+ "location.href='/admin/admin_main.do';"
					+ "</script>");
		}}else {
			this.pw.print("<script>"
					+ "alert('등록되거나 승인된 아이디 또는 비밀번호가 아닙니다.');"
					+ "history.go(-1);"
					+ "</script>");
		}}catch(Exception e) {
		this.pw.print("<script>"
					+ "alert('Database문제로 인하여 해당 정보가 확인 되지 않습니다.');"
					+ "history.go(-1);"
					+ "</script>");
		}
		this.pw.close();
		return null;
	}
	
	@PostMapping("/admin/idcheck.do")
	public String idcheck(HttpServletResponse res,String adid,abad_dao abdao) throws Exception {
		res.setContentType("application/json;charset=utf-8");
		String adckresult="";
		int adidck=am.ab_idck(adid, abdao);
		
		if(adid.equals("master")||adid.equals("admin")||adidck>0) {
			adckresult="no";
		}
		else if(adid.equals("")) {
			adckresult="error";
		}
		else {
			adckresult="yes";
		}
		this.pw=res.getWriter();
		this.pw.print(adckresult);
		this.pw.close();
		
	return null;
	} 
	
	@PostMapping("/admin/admin_insert.do")
	public String admin_insert(HttpServletResponse res,String adpw,abad_dao abdao) throws Exception {
		res.setContentType("text/html;charset=utf-8");
		this.pw= res.getWriter();
		try {
			int abin_result= am.abad_insert(abdao,adpw);
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

	//신규 관리자 등록페이지
	@GetMapping("/admin/add_master.do")
	public String addad(){
		return "add_master";
	}
	//로그아웃페이지
	@GetMapping("/admin/admin_logout.do")
	public String logout(HttpSession se,HttpServletResponse res) throws Exception {
		se.invalidate();
		res.setContentType("text/html;charset=utf-8");
		this.pw=res.getWriter();
		this.pw.print("<script>"
				+ "alert('로그아웃 되었습니다.');"
				+ "location.href='./';"
				+ "</script>");
		this.pw.close();
		return "logout";
	}
	//메인페이지
	@GetMapping("/admin")
	public String index(){
	return "index";
	}
}
