package admin;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class noticeController {
	@Resource(name="noticeModule")
	private noticeModule nm;
	
	@PostMapping(value="/admin/notice_save.do",consumes = "multipart/form-data",produces = "application/json")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> saveNotice(
		   @RequestParam("noYN") String noYN,
		   @RequestParam("notitle") String notitle,
		   @RequestParam("adname") String adname,
		   @RequestParam("noinfo") String noinfo,
		   @RequestPart(value = "nofile", required = false) MultipartFile nofile) {
		
		Map<String, Object> result = new HashMap<>();
        
        try {
            noticeDao noticedao = new noticeDao();
            noticedao.setNoYN(Integer.parseInt(noYN));
            noticedao.setNotitle(notitle);
            noticedao.setAdname(adname);
            noticedao.setNoinfo(noinfo);

            int saveResult = nm.notice_in(noticedao);
            
            if (saveResult > 0) {
                result.put("success", true);
                return ResponseEntity.ok(result);
            } else {
                result.put("success", false);
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
            }
        } catch (Exception e) {
        	result.put("success", false);
            result.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(result);
        }

    }       
}
