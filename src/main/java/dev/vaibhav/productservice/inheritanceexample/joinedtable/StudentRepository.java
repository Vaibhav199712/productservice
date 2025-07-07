package dev.vaibhav.productservice.inheritanceexample.joinedtable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("jt_student_repository")
// we have 2 different mentorRepository and they are completly seperectly repository, so we need to specify it directly

public interface StudentRepository extends JpaRepository<Student, Long> {
}
