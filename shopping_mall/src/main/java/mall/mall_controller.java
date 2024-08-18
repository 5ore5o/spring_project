package mall;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mall_controller {

	@GetMapping("/mall/login.do")
	public String login() {
		return "login";
	}
	@GetMapping("/mall/join.do")
	public String join() {
		return "join";
	}
	@GetMapping("/mall/agree.do")
	public String agree() {
		return "agree";
	}
}
