package br.com.fiore.sms.service;

import java.util.List;

import br.com.fiore.sms.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student findById(Long id);

	void delete(Long id);
}
