package admin;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class noticeDao {

	Integer no_idx,noYN,view_count;
	String notitle,adname,nofile,storedfile,noinfo,nodate;
	
	private MultipartFile nofiledata;
}