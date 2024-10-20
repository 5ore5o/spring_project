package admin;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class noticeController {
/*
	@Resource(name="noticeModule")
	private noticeModule nm;
	
	PrintWriter pw= null;
	
	@PostMapping("/admin/notice_save.do")
	@ResponseBody
	public Map<String, Object> saveNotice(
		   @RequestParam("noYN") String noYN,
		   @RequestParam("notitle") String notitle,
		   @RequestParam("adname") String adname,
		   @RequestParam("noinfo") String noinfo,
		   @RequestPart(value = "nofile", required = false) MultipartFile nofile) {
		
		Map<String, Object> result = new HashMap<>();
        
        try {
            noticeDao noticedao = new noticeDao();
            noticedao.setNoYn(Integer.parseInt(noYN));
            noticedao.setNotitle(notitle);
            noticedao.setAdname(adname);
            noticedao.setNoinfo(noinfo);
            noticedao.setNofiledata(nofile);

            int saveResult = nm.notice_in(noticedao);
            
            if (saveResult > 0) {
                result.put("success", true);
            } else {
                result.put("success", false);
            }
        } catch (Exception e) {
            result.put("success", false);
            result.put("error", e.getMessage());
        }

        return result;
    }       
*/
}
