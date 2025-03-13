package springboot.h2db.spring_h2_demo.jdbcDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class springJdbcDaoImple {

    @Autowired
    public JdbcTemplate jdbcTemplate;
    public void insertToStudentUsingJdbc(String name, String country){
        String sql = "Insert into student values(1,'Saikumar', 'India')";
        jdbcTemplate.update(sql);
        System.out.println("-------the data is inserted into Student Table-----");
    }
}
