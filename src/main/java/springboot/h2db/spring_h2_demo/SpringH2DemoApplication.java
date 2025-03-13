package springboot.h2db.spring_h2_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.dao.DataAccessException;
import springboot.h2db.spring_h2_demo.jdbcDao.springJdbcDaoImple;
import springboot.h2db.spring_h2_demo.jpaDao.springJpaImpl;

@SpringBootApplication
public class SpringH2DemoApplication implements CommandLineRunner {

	//@Autowired
	//public springJdbcDaoImple springJdbcDaoImple;
	@Autowired
	public springJpaImpl springJpa;
	public static void main(String[] args) {
		SpringApplication.run(SpringH2DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {

			//springJdbcDaoImple.insertToStudentUsingJdbc("sai", "ind");

			springJpa.insertIntoStudentUsingJPA();

		}catch(DataAccessException e){
		//this is going to be write the whatever the exception coming from the data base part we will get it here
			System.out.println(e.getCause());
			System.out.println(e.getMessage());

		}
		}
}
