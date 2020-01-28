package com.cr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cr.entity.Student;
import com.cr.entity.StudentImpl;
import com.cr.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRep;

	@Override
	@Transactional
	public StudentImpl saveStudent(Student student) {
		StudentImpl imp = new StudentImpl(student);
		System.out.println("service back " + student);
		return studentRep.save(imp);
	}

	@Override
	@Transactional
	public void updateStudent(Student student) {
		System.out.println(student.getDate() + " student back date service");
		StudentImpl impStudent = new StudentImpl(student);
		studentRep.save(impStudent);
		System.out.println(student.getDate() + " student back date service");
		System.out.println("update service impl" + student);
	}

	@Override
	@Transactional
	public List<StudentImpl> findAllStudent() {
		return studentRep.findAll();
	}

	@Override
	@Transactional
	public void deleteStudentById(Integer id) {
		studentRep.deleteById(id);
	}
}
