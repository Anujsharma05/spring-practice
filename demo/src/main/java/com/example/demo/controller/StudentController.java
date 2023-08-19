package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StudentDTO;
import com.example.demo.service.StudentService;

@RestController
@Validated
public class StudentController {

	@Autowired
	private StudentService service;

	@PostMapping(value = "/students")
	public ResponseEntity<StudentDTO> save(@RequestBody @Valid StudentDTO studentDTO) {
		StudentDTO student = service.save(studentDTO);
		return new ResponseEntity<StudentDTO>(student, HttpStatus.CREATED);
	}

	@PutMapping(value = "/students")
	public ResponseEntity<StudentDTO> update(@RequestBody @Valid StudentDTO studentDTO) {
		StudentDTO student = service.update(studentDTO);
		return new ResponseEntity<StudentDTO>(student, HttpStatus.OK);
	}
}
