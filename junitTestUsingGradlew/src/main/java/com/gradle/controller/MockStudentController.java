package com.gradle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gradle.service.StudentService;

@RestController
@RequestMapping("/student")
public class MockStudentController {
	
	@Autowired
	private StudentService studentService;
	

	@GetMapping("/getStudent")
	public String getEmployee() {
		return studentService.getStudentRecord();
	}
}
