package springboot.h2db.spring_h2_demo.jpaDao;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import springboot.h2db.spring_h2_demo.beans.student;

@Repository
public class springJpaImpl {

    @Autowired
    public EntityManager entityManager;

    @Transactional
    public void insertIntoStudentUsingJPA(){
        student student = new student();

        //student.setId(1);
        student.setName("sky");
        student.setCountry("IND");

        entityManager.merge(student);

    }
}
