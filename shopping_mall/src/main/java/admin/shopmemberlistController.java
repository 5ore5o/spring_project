package admin;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class shopmemberlistController {

	 @Resource(name = "shopmemberlistmodule")
	 private shopmemberlistModule sm;

	 @PostMapping("/admin/terms")
	    @ResponseBody
	    public Map<String, Object> saveTerms(@RequestParam("terms") String terms) {
	        Map<String, Object> response = new HashMap<>();

	        try {
	        	
	            int result = sm.saveTerms(terms);
	            if (result > 0) {
	                response.put("success", true);
	            } else {
	                response.put("success", false);
	            }
	        } catch (Exception e) {
	            response.put("success", false);
	            response.put("error", e.getMessage());
	        }

	        return response;
	    }

	    @PostMapping("/admin/privacy")
	    @ResponseBody
	    public Map<String, Object> savePrivacy(@RequestParam("privacy") String privacy) {
	        Map<String, Object> response = new HashMap<>();

	        try {
	            int result = sm.savePrivacy(privacy);
	            if (result > 0) {
	                response.put("success", true);
	            } else {
	                response.put("success", false);
	            }
	        } catch (Exception e) {
	            response.put("success", false);
	            response.put("error", e.getMessage());
	        }

	        return response;
	    }
}
