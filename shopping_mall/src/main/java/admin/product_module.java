package admin;

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
	
	//상품 검색 및 페이징
	public List<adpd_dao> pddata(Map<String, Object> params) {
		  List<adpd_dao> pd = new ArrayList<>();
		  pd = tm2.selectList("abadminDB.pd_search", params);
		  return pd;
	}
	
	//전체 상품 수를 가져오는 메서드 추가
	public int getTotalProductCount(String search_pdpart, String search_pdword) {
		   Map<String, String> pdm = new HashMap<>();
		   pdm.put("search_pdpart", search_pdpart);
		   pdm.put("search_pdword", search_pdword);
		   return tm2.selectOne("abadminDB.total_product_count", pdm);
	}
	
	//전체 상품 리스트
	public List<adpd_dao> pddata(){
		List<adpd_dao> pdlist= new ArrayList<adpd_dao>();
		pdlist=tm2.selectList("abadminDB.product_list");
		return pdlist;
	}
	
	@Value("${file.upload-dir}")
	 private String uploadDir;
	 
	//상품 등록
	public int product_in(adpd_dao pddao) {
		List<MultipartFile> pdfileList = pddao.getPdfilelist();
		List<String> fileNames = new ArrayList<>();          // 파일명을 저장할 리스트

        for (MultipartFile file : pdfileList) {
            if (!file.isEmpty()) {
                try {
                    String originalFileName = file.getOriginalFilename();
                    String uniqueFileName = UUID.randomUUID().toString() + "_" + originalFileName;
                    String filePath = uploadDir + "/" + uniqueFileName;

                    Path path = Paths.get(filePath);
                    
                    //디렉토리 없을 때 생성 
                    Path parentDir = path.getParent();
                    if (Files.notExists(parentDir)) {
                        Files.createDirectories(parentDir);
                    }
                    
                    Files.copy(file.getInputStream(), path);
                    //DB원본파일명저장
                    fileNames.add(originalFileName);
                } catch (IOException e) {
                	e.printStackTrace();
                    return 0;
                }
            }
        }
		
		String pdfileString = String.join(",", fileNames);
	    pddao.setPdfile(pdfileString); 
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
