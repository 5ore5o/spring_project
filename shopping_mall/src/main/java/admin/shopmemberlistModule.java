package admin;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("shopmemberlistmodule")
public class shopmemberlistModule {

	@Resource(name="template2")
    private SqlSessionTemplate tm2;
	
	public boolean hasData() {
        Integer count = tm2.selectOne("abadminDB.termspolicycheck");
        return count != null && count > 0;
    }
	
	 public int saveTerms(String terms) {
	        Map<String, Object> params = new HashMap<>();
	        params.put("terms_of_service", terms);
	        
	        if (hasData()) {
	            return tm2.update("abadminDB.termspolicymodifyTerms", params);
	        } else {
	            return tm2.insert("abadminDB.termspolicy_save", params);
	        }
	}
	 
	 public int savePrivacy(String policy) {
	        Map<String, Object> params = new HashMap<>();
	        params.put("privacy_policy", policy);

	        if (hasData()) {
	            return tm2.update("abadminDB.termspolicymodifyPrivacy", params);
	        } else {
	            return tm2.insert("abadminDB.termspolicy_save", params);
	        }
	    }
}
