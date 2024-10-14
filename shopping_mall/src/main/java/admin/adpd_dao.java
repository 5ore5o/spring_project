package admin;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class adpd_dao {

	Integer pd_idx,pd_cash,pd_dcr,pd_dcp,pd_ea;
	String pd_lname,pd_code,pd_name,pd_addinfo,pd_oyn,pd_xyn,pd_info,pddate;
	
	private List<MultipartFile> pdfilelist;
	private String pdfile;
}
