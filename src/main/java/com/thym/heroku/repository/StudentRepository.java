package com.thym.heroku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thym.heroku.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
