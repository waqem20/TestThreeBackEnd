package com.cr.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.BeanUtils;

@Entity
@Table(name = "STUDENT")
public class StudentImpl implements Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "AGE", nullable = true)
	private Integer age;

	@Column(name = "EMAIL", nullable = true)
	private String email;

	@Column(name = "DATE", nullable = true)
	private Date date;

	public StudentImpl() {
		// default constructor
	}

	public StudentImpl(Integer id, String name, Integer age, String email, Date date) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.date = date;
	}

	public StudentImpl(Student student) {
		BeanUtils.copyProperties(student, this, StudentImpl.class);
	}

	@Override
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public Integer getAge() {
		return age;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public Date getDate() {
		return date;
	}
}
