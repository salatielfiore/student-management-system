package br.com.fiore.sms.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import br.com.fiore.sms.entity.Student;
import br.com.fiore.sms.repository.StudentRepository;
import br.com.fiore.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student findById(Long id) {
		return studentRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public void delete(Long id) {
		
		studentRepository.deleteById(id);
		
	}

}
