package com.microservice.student.persistence;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.microservice.student.entities.Student;
import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {

    @Query("SELECT s FROM Student s WHERE s.courseId = :idCourse")
    List<Student> findAllStudentsByCourseId(Long idCourse);
}
