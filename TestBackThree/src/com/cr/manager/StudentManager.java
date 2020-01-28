package com.cr.manager;

import java.util.List;

import com.cr.entity.Student;
import com.cr.entity.StudentImpl;

public interface StudentManager {

	StudentImpl saveStudent(Student student);

	void updateStudent(Student currentStudent);

	List<StudentImpl> findAllStudent();

	void deleteStudentById(Integer id);
}
