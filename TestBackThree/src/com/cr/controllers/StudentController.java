package com.cr.controllers;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cr.entity.StudentImpl;
import com.cr.manager.StudentManager;

@RestController
public class StudentController {

	@Autowired
	private StudentManager studentManager;

	@GetMapping(value = "/getAllStudents", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StudentImpl>> getAllStudents() {
		return new ResponseEntity<>(studentManager.findAllStudent(), HttpStatus.OK);
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createStudent(@RequestBody StudentImpl studentImpl) {
		return new ResponseEntity<>(studentManager.saveStudent(studentImpl), HttpStatus.CREATED);
	}

	@PutMapping(value = "/updateStudent/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentImpl> updateStudent(@RequestBody StudentImpl currentStudent) {
		if (currentStudent == null) {
			Logger.getLogger("Error while updating a student.");
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		System.out.println(currentStudent.getDate() + " student date back controller");
		Logger.getLogger("update student:" + currentStudent);
		studentManager.updateStudent(currentStudent);
		return new ResponseEntity<>(currentStudent, HttpStatus.OK);
	}

	@DeleteMapping(value = "/deleteStudent/{id}")
	public ResponseEntity<StudentImpl> deleteStudent(@PathVariable("id") Integer id) {
		studentManager.deleteStudentById(id);
		Logger.getLogger("deleted student with the id of :" + id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
