package admin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:application.properties")
public class adminWebconfig {

	 @Value("${file.upload-dir}")
	 private String uploadDir;

	  @Bean
	  public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
		 return new PropertySourcesPlaceholderConfigurer(); 
	  }
}
