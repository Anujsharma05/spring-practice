package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	private StudentRepository repository;

	@Autowired
	public StudentService(StudentRepository repository) {
		super();
		this.repository = repository;
	}

	public StudentDTO save(StudentDTO studentDTO) {
		Student student = new Student(studentDTO);
		Student savedStudent = repository.save(student);
		studentDTO.setId(savedStudent.getId());
		return studentDTO;
	}

	public StudentDTO update(StudentDTO studentDTO) {
		Student student = new Student(studentDTO);
		repository.save(student);
		return studentDTO;
	}

}
