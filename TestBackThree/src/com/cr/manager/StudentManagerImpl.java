package com.cr.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cr.entity.Student;
import com.cr.entity.StudentImpl;
import com.cr.service.StudentService;

@Service
public class StudentManagerImpl implements StudentManager {

	@Autowired
	private StudentService studentService;

	@Override
	public StudentImpl saveStudent(Student student) {
		return studentService.saveStudent(student);
	}

	@Override
	public void updateStudent(Student student) {
		System.out.println(student.getDate() + " student date controller");
		studentService.updateStudent(student);
	}

	@Override
	public List<StudentImpl> findAllStudent() {
		return studentService.findAllStudent();
	}

	@Override
	public void deleteStudentById(Integer id) {
		studentService.deleteStudentById(id);
	}
}
