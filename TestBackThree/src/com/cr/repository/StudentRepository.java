package com.cr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cr.entity.StudentImpl;

public interface StudentRepository extends JpaRepository<StudentImpl, Integer> {

}
