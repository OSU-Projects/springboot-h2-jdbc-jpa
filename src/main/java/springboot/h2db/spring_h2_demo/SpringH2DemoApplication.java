package springboot.h2db.spring_h2_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springboot.h2db.spring_h2_demo.jdbcDao.springJdbcDaoImple;

@SpringBootApplication
public class SpringH2DemoApplication implements CommandLineRunner {

	@Autowired
	public springJdbcDaoImple springJdbcDaoImple;
	public static void main(String[] args) {
		SpringApplication.run(SpringH2DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		springJdbcDaoImple.insertToStudentUsingJdbc("sai","ind");
	}
}
