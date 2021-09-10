package com.thym.heroku.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thym.heroku.repository.StudentRepository;
import com.thym.heroku.models.Student;
@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAll()
	{
		return studentRepository.findAll();
	}
	public void addNew(Student student)
	{
		studentRepository.save(student);
	}
	public void update(Student student)
	{
		studentRepository.save(student);
	}
	public void delete(Integer Id)
	{
		studentRepository.deleteById(Id);
	}
	public Optional<Student> getOne(Integer Id)
	{
		return studentRepository.findById(Id);
	}
}
