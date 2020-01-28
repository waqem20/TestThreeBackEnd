package com.cr.service;

import java.util.List;

import com.cr.entity.Student;
import com.cr.entity.StudentImpl;

public interface StudentService {

	StudentImpl saveStudent(Student student);

	void updateStudent(Student student);

	List<StudentImpl> findAllStudent();

	void deleteStudentById(Integer id);

}
