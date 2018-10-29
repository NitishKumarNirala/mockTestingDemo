package com.gradle.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

	
	@Override
	public String getStudentRecord() {
		return "A B C D E F";
	}

	@Override
	public List<String> getListOfStudentRecord() {
		List<String>listOfStudent=new ArrayList<>();
		listOfStudent.add("A");
		listOfStudent.add("B");
		listOfStudent.add("C");
		listOfStudent.add("D");
		listOfStudent.add("E");
		listOfStudent.add("F");
		listOfStudent.add("G");
		listOfStudent.add("H");
		return listOfStudent;
	}

}
