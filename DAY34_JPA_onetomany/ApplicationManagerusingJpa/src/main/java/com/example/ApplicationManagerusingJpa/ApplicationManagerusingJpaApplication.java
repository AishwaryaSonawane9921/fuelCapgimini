import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationManagerusingJpaApplication {

	 
	public static void main(String[] args) {
		
		ApplicationContext context;
		context=SpringApplication.run(ApplicationManagerusingJpaApplication.class, args);
 
		MyRepository stud;
		stud=context.getBean(MyRepository.class);
		stud.getData();
	}
	 

}
   
