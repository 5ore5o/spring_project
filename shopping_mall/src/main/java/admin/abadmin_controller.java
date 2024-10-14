package admin;

import java.io.PrintWriter;
import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class abadmin_controller{
	

	@Resource(name="abmodule")
	private abad_module am;
	
	PrintWriter pw= null;
	
	
	//카테고리 데이터 삭제
	@PostMapping("/admin/del_cateck.do")
	public String del_cateck(HttpServletResponse res,String ca_idx)throws Exception{
		res.setContentType("text/html;charset=utf-8");
		this.pw= res.getWriter();
		try {
			int catedel_result= am.cate_del(ca_idx);
			if(catedel_result> 0) {
				this.pw.print("<script>"
						+ "alert('해당 데이터를 삭제 하였습니다.');"
						+ "location.href='/admin/cate_list.do';"
						+ "</script>");
			}
		}catch(Exception e) {
			this.pw.print("<script>"
					+ "alert('DB 오류로 인하여 삭제되지 않았습니다.');"
					+ "history.go(-1);"
					+ "</script>");
			System.out.println(e);
		}
		this.pw.close();
		return null;
	}
	
	//관리자 권한 수정
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
	//카테고리 검색&view
	@GetMapping("/admin/cate_list.do")
	public String calist_search(Model cam,HttpServletResponse res,
			@RequestParam(defaultValue="",required=false)String search_catepart,
			@RequestParam(defaultValue="",required=false)String search_cateword) throws Exception {
		
		res.setContentType("text/html;charset=utf-8");
		this.pw=res.getWriter();
		
		List<adcate_dao> caresult =null;
		try {
			if(search_catepart.equals("")&& search_cateword.equals("")) {
				caresult = am.cadata();
			}else {
				cam.addAttribute("search_part",search_catepart);
				cam.addAttribute("search_word",search_cateword);
				caresult = am.cadata(search_catepart,search_cateword);
			}
			cam.addAttribute("caresult",caresult);
			
		}catch(Exception e) {
			this.pw.print("<script>"
					+ "alert('DB오류로 인해 출력되지 않았습니다');"
					+ "location.href='/admin/cate_list.do';"
					+ "</script>");
			this.pw.close();
		}
		return "cate_list";
	}
	
	//관리자 정보 view
	@GetMapping("/admin/admin_list.do")
	public String admin_list(Model m,HttpServletResponse res,HttpServletRequest req,HttpSession se) throws Exception{
		res.setContentType("text/html;charset=utf-8");
		this.pw=res.getWriter();
		String adid=(String)se.getAttribute("adid");
		
		try {
			List<abad_dao> adin_data = am.adin_data();
			m.addAttribute("adin_data",adin_data);
		}catch(Exception e){
			this.pw.print("<script>"
					+ "alert('데이터 에러가 나서 정보를 불러오지 못합니다.');"
					+ "</script>");
			this.pw.close();
		}
		
		if(adid==null|| ! adid.equals("master")) {
			RequestDispatcher rd=req.getRequestDispatcher("./error.jsp");
			rd.forward(req, res);
			return null;
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
					+ "location.href='/admin/admin_list.do';"
					+ "</script>");
		}else{

			this.pw.print("<script>"
					+ "alert('로그인하였습니다.');"
					+ "location.href='/admin/shop_member_list.do';"
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
		System.out.println(e);
		}
		this.pw.close();
		return null;
	}
	/*
	public String pdcodecheck(HttpServletResponse res,String pd_code,adpd_dao pddao) throws Exception {
		res.setContentType("application/json;charset=utf-8");
		this.pw=res.getWriter();
		String pdckresult="";
		String pdck_result=am.pd_codeck(pd_code,pddao);
		if(!pdck_result.equals(pd_code)) {
			String new_pdcode=am.repdcode();
	
			pddao.setPd_code(new_pdcode);
			pdckresult="no";
		}
		else {
			pdckresult="yes";
		}
		this.pw.print(pdckresult);
		this.pw.close();
		
	return null;
	}
	*/
	
	//아이디 중복체크
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
	
	//카테고리 등록
	@PostMapping("/admin/cate_in.do")
	public String cate_in(HttpServletResponse res,adcate_dao catedao,String lname,String cacode) throws Exception{
		res.setContentType("text/html;charset=utf-8");
		this.pw=res.getWriter();
		try {
			int catewrin=am.catewr_in(catedao, cacode,lname);
			if(catewrin>0) {
				this.pw.print("<script>"
						+ "alert('정상적으로 등록 되었습니다.');"
						+ "location.href='/admin/cate_list.do';"
						+ "</script>");
			}else {
				this.pw.print("<script>"
						+ "alert('데이터 중복 또는 오류때문에 등록되지 않았습니다.');"
						+ "history.go(-1);"
						+ "</script>");
			}
		}catch(Exception e) {
			this.pw.print("<script>"
					+ "alert('DB오류 또는 데이터 중복으로 인해 등록되지 않았습니다.');"
					+ "history.go(-1);"
					+ "</script>");
		}finally {
			
		}
		this.pw.close();
		return null;
	}

	
	//쇼핑몰 설정 등록
	@PostMapping("/admin/homesave.do")
	public String homesave(HttpServletResponse res,adset_dao adsetdao)throws Exception{
		res.setContentType("text/html;charset=utf-8");
		this.pw= res.getWriter();
		try {
			int homeset_result= am.homein(adsetdao);
			if(homeset_result> 0) {
				this.pw.print("<script>"
						+ "alert('정상적으로 등록 완료 되었습니다.');"
						+ "location.href='/admin/admin_siteinfo.do';"
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
	
	//관리자 등록
	@PostMapping("/admin/admin_insert.do")
	public String admin_insert(HttpServletResponse res,String adpw,abad_dao abdao) throws Exception {
		res.setContentType("text/html;charset=utf-8");
		this.pw= res.getWriter();
		try {
			int abin_result= am.abad_insert(abdao,adpw);
			if(abin_result > 0) {
				this.pw.print("<script>"
						+ "alert('정상적으로 등록 완료 되었습니다.');"
						+ "location.href='./';"
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
	//쇼핑몰 멤버 리스트 페이지
	@GetMapping("/admin/shop_member_list.do")
	public String shopmemberlist() {
		return "shop_member_list";
	}
	//공지사항 등록 페이지
	@GetMapping("/admin/notice_write.do")
	public String noticewrite() {
		return "notice_write";
	}
	//공지사항 리스트 페이지
	@GetMapping("/admin/notice_list.do")
	public String noticelist() {
		return "notice_list";
	}
	//카테고리 등록 페이지
	@GetMapping("/admin/cate_write.do")
	public String catewrite() {
		return "cate_write";
	}

	//쇼핑몰 기본설정 페이지
	@GetMapping("/admin/admin_siteinfo.do")
	public String homeset(){
		return "admin_siteinfo";
	}
	//신규 관리자 등록페이지
	@GetMapping("/admin/add_master.do")
	public String addad(){
		return "add_master";
	}
	//메인페이지
	@GetMapping("/admin/")
	public String index(){
	return "index";
	}
}
