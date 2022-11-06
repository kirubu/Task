package org.gorl.service.impl;

import java.util.List;

import org.gorl.entity.Student;
import org.gorl.repository.StudentRepository;
import org.gorl.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService
{

	private StudentRepository stdRepo;
	
	
	
	public StudentServiceImpl(StudentRepository stdRepo) {
		super();
		this.stdRepo = stdRepo;
	}



	@Override
	public List<Student> getAllStudent() {
		
		return stdRepo.findAll();
	}

}
