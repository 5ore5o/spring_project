package admin;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository("productmodule")
public class product_module {

	@Resource(name="template2")
	private SqlSessionTemplate tm2;
	
	//상품 삭제
	public int pd_del(String pd_idx) {
		int pddel_result=this.tm2.delete("abadminDB.pd_del",pd_idx);
		return pddel_result;
	}
	
	//상품 검색
	public List<adpd_dao> pddata(String search_pdpart, String search_pdword){
		List<adpd_dao> pdlist= new ArrayList<adpd_dao>();
		Map<String, String> pdm =new HashMap<String, String>();
		
		pdm.put("search_pdpart", search_pdpart);
		pdm.put("search_pdword", search_pdword);
		
		pdlist=tm2.selectList("abadminDB.pd_search",pdm);
		return pdlist;
	}
	
	//상품 리스트
	public List<adpd_dao> pddata(){
		List<adpd_dao> pdlist= new ArrayList<adpd_dao>();
		pdlist=tm2.selectList("abadminDB.product_list");
		return pdlist;
	}
	
	@Value("${file.upload-dir}")
	 private String uploadDir;
	 
	//상품 등록
	public int product_in(adpd_dao pddao) {
		List<MultipartFile> pdfileList = pddao.getPdfile();
		List<String> fileNames = new ArrayList<>();          // 파일명을 저장할 리스트

        for (MultipartFile file : pdfileList) {
            if (!file.isEmpty()) {
                try {
                    String originalFileName = file.getOriginalFilename();
                    pddao.setPdfileString(originalFileName);
                    String uniqueFileName = UUID.randomUUID().toString() + "_" + originalFileName;
                    String filePath = uploadDir + File.separator + uniqueFileName;

                    Path path = Paths.get(filePath);
                    Files.copy(file.getInputStream(), path);

                    fileNames.add(uniqueFileName);

                } catch (IOException e) {
                    e.printStackTrace();
                    return 0;
                }
            }
        }
		
		String pdfileString = String.join(",", fileNames);
	    pddao.setPdfileString(pdfileString); 
		int result = tm2.insert("abadminDB.product_in",pddao);
		if (result > 0) {
	        return result;
	    } else {
	        return 0;
	    }
	}
	
	//pdcode 중복체크
	public int pd_codeck(String pd_code,adpd_dao pddao) {
		Integer pdck_result= tm2.selectOne("abadminDB.pdcode_check",pd_code);
		if(pdck_result<0 && pd_code != null&& pddao.getPd_code() !=null) {
			
		return pdck_result;
		}
		return 0;
	}
	
	//lname 출력
	public List<adcate_dao> lnamedata(){
		List<adcate_dao> lnameli= new ArrayList<adcate_dao>();
		lnameli=tm2.selectList("abadminDB.lname_li");
		return lnameli;
	}
}
