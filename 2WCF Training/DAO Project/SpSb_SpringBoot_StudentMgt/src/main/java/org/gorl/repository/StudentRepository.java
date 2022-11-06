package org.gorl.repository;

import org.gorl.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> 
{
	
}
