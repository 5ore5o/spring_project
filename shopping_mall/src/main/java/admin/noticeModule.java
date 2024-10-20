package admin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository("noticeModule")
public class noticeModule {

	@Resource(name="template2")
	private SqlSessionTemplate tm2;

	@Value("${file.upload-dir}")
	private String uploadDir;
	
	public int notice_in(noticeDao noticedao) {
			MultipartFile file = noticedao.getNofiledata();
			String originalFileName = null;
		    String storedFileName = null;

			if (file != null && !file.isEmpty()) {
			        try {
			            originalFileName = file.getOriginalFilename();
			            String uniqueFileName = UUID.randomUUID().toString() + "_" + originalFileName;
			            String filePath = uploadDir + "/" + uniqueFileName;

			            Path path = Paths.get(filePath);

			            Path parentDir = path.getParent();
			            if (Files.notExists(parentDir)) {
			                Files.createDirectories(parentDir);
			            }
			            Files.copy(file.getInputStream(), path);
			        } catch (IOException e) {
			            e.printStackTrace();
			            return 0;
			        }
			    }
			
			noticedao.setNofile(originalFileName);
			noticedao.setStoredfile(storedFileName);
			int result = tm2.insert("abadminDB.noticesave",noticedao);
			if (result > 0) {
		        return result;
		    } else {
		        return 0;
		    }
		}
}
