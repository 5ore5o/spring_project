package admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class views_test {

	@GetMapping("/admin/views_test.do")
	public String produce_list() {
		return "views_test";
		//return "/WEB-INF/views_test"; 얘도 아니다. servlet에 이미 /WEB-INF/views/가 적혀져있어서
		//그냥 위에처럼 views_test만 적어도 알아서 잘 찾아간다.
		//return "/admin/views_test"; views여서 안된다. 걍 views랑 admin이랑 같다고 생각하면 된다. 
		//return null;
	}
}
