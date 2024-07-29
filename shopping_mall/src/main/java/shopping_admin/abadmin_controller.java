package shopping_admin;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class abadmin_controller extends passwd_sh1{
	@Resource(name="abadselect")
	private abad_select as;
	
	PrintWriter pw= null;
	
	@PostMapping("/admin/admin_main.do")
	public String adminloginok(String adid,String adpw, HttpServletResponse res,@ModelAttribute abad_dao dao) throws Exception{
		res.setContentType("text/html;charset=utf-8");
		this.pw=res.getWriter();
		
		String adpwresult=this.sh1_making(adpw);
		System.out.println(adpwresult);
		
		try {
		if(adid.equals("master") && dao.getAdpw().equals(adpwresult)){
			this.pw.print("<script>"
					+ "alert('최고관리자로 로그인하였습니다.');"
					+ "location.href='/admin/admin_main.do';"
					+ "</script>");
		}
		else {
			this.pw.print("<script>"
					+ "alert('로그인하였습니다.');"
					+ "location.href='/admin/admin_main.do';"
					+ "</script>");
			System.out.println(adid.equals("master"));
			System.out.println(adpw);
		}
		}catch(Exception e) {
		this.pw.print("<script>"
					+ "alert('Database문제로 인하여 해당 정보가 확인 되지 않습니다.');"
					+ "history.go(-1);"
					+ "</script>");
		}finally {
			this.pw.close();
		}
		
		return null;
	}
}
