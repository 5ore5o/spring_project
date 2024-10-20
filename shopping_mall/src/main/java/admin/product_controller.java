package admin;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class product_controller {

	@Resource(name="productmodule")
	private product_module pm;
	
	PrintWriter pw= null;
	
	//상품 데이터 삭제
	@PostMapping("/admin/del_pdck.do")
	public String del_pdck(HttpServletResponse res,String pd_idx) throws Exception{
		res.setContentType("text/html;charset=utf-8");
		this.pw= res.getWriter();
		
		try {
			int pddel_result= pm.pd_del(pd_idx);
			if(pddel_result> 0) {
				this.pw.print("<script>"
						+ "alert('해당 데이터를 삭제 하였습니다.');"
						+ "location.href='/admin/product_list.do';"
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
	
	//상품 리스트& 검색
	@GetMapping("/admin/product_list.do")
	public String product_list(Model m, HttpServletResponse res,
			@RequestParam(defaultValue="",required=false)String search_pdpart,
			@RequestParam(defaultValue="",required=false)String search_pdword,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "5") int size) 
			throws Exception {
		
		res.setContentType("text/html;charset=utf-8");
		this.pw=res.getWriter();
		
		int offset = (page - 1) * size;
		Map<String, Object> params = new HashMap<>();
	    params.put("search_pdpart", search_pdpart);
	    params.put("search_pdword", search_pdword);
	    params.put("size", size);
	    params.put("offset", offset);
		
		List<adpd_dao> productlist= null;
		try {
			if(search_pdpart.equals("")&& search_pdword.equals("")) {
				productlist = pm.pddata();
			}else {
				m.addAttribute("search_pdpart",search_pdpart);
				m.addAttribute("search_pdword",search_pdword);
				productlist= pm.pddata(params);
			}
			m.addAttribute("productlist",productlist);
			
			// 총 상품 수 가져오기
	        int totalCount = pm.getTotalProductCount(search_pdpart, search_pdword);
	        m.addAttribute("totalCount", totalCount);
	        
	        int totalPages = (int) Math.ceil((double) totalCount / size);
	        int pageBlock = 5; // 한 번에 표시할 페이지 수
	        int startPage = ((page - 1) / pageBlock) * pageBlock + 1;
	        int endPage = Math.min(startPage + pageBlock - 1, totalPages);
	        
	        if (endPage > totalPages) {
	            endPage = totalPages;
	        }
	        
	        m.addAttribute("currentPage", page);
	        m.addAttribute("totalPages", (int) Math.ceil((double) totalCount / size));
	        m.addAttribute("startPage", startPage);
	        m.addAttribute("endPage", endPage);
	        
	        
		}catch(Exception e) {
			this.pw.print("<script>"
					+ "alert('DB오류로 인해 출력되지 않았습니다');"
					+ "location.href='/admin/product_list.do';"
					+ "</script>");
			this.pw.close();
		}
		return "product_list";
	}
	
	//상품 등록
	@PostMapping("/admin/pd_in.do")
	public String product_in(HttpServletResponse res,adpd_dao pddao) throws Exception {
		res.setContentType("text/html;charset=utf-8");
		this.pw = res.getWriter();
		
		try {
	        int productInResult = pm.product_in(pddao);
	        
	        if (productInResult > 0) {
	            this.pw.print("<script>"
	                    + "alert('정상적으로 상품이 등록되었습니다.');"
	                    + "location.href='/admin/product_list.do';"
	                    + "</script>");
	        } else {
	            this.pw.print("<script>"
	                   + "alert('데이터 중복 또는 오류로 인해 등록되지 않았습니다.');"
	                   + "history.go(-1);"
		               + "</script>");
		    }
		} catch (Exception e) {
		        this.pw.print("<script>"
		              + "alert('DB 오류 또는 데이터 중복으로 인해 등록되지 않았습니다.');"
		              + "history.go(-1);"
		              + "</script>");
		} finally {
		     if (this.pw != null) {
		        this.pw.close();
		    }
		}
		    return null;
	}
		
		//상품코드 중복체크
		@PostMapping("/admin/pdcode_ck.do")
		public String pdcodecheck(HttpServletResponse res,String pd_code,adpd_dao pddao) throws Exception {
			res.setContentType("application/json;charset=utf-8");
			this.pw=res.getWriter();
			String pdckresult="";
			Integer pdck_result=pm.pd_codeck(pd_code,pddao);
		if(pdck_result>0) {
			pdckresult="no";
		}
		else{
			pdckresult="yes";
		}
		this.pw.print(pdckresult);
		this.pw.close();
		
		return null;
		}
		
		//lname 리스트,신규 상품등록 페이지
		@GetMapping("/admin/product_write.do")
		public String productwriter(Model lnamem) {
			List<adcate_dao> lnameli =pm.lnamedata();
			lnamem.addAttribute("lnameli",lnameli);
			return "product_write";
		}
		
}
